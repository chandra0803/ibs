package com.ibsplc.amadeus.mediators;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.amadeus.xml.pausrr_16_1_1a.PNRSearchReply;
import com.amadeus.xml.pausrr_16_1_1a.PNRSearchReply.PnrViews;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.amadeus.vo.BookingVO;

public class PNRSearchMediator extends AbstractMediator {

	public boolean mediate(MessageContext context) {
		log.info("Entering PNRSearchMediator");

		String soapMessage = context.getEnvelope().getBody().getFirstElement().toString();

		InputStream inputStream = new ByteArrayInputStream(soapMessage.getBytes(Charset.forName("UTF-8")));
		Unmarshaller unmarshaller;
		String resultMessage = "Success";
		try {
			unmarshaller = JAXBContext.newInstance(PNRSearchReply.class).createUnmarshaller();
			PNRSearchReply pnrSearchReply = (PNRSearchReply) unmarshaller.unmarshal(inputStream);
			if (pnrSearchReply.getPnrViews() != null && !pnrSearchReply.getPnrViews().isEmpty()) {
				PnrViews pnrViews = pnrSearchReply.getPnrViews().get(0);
				String pnr = pnrViews.getPnrView().getAmadeusId().getReservation().getControlNumber();
				String officeId = pnrViews.getPnrView().getPnrHeader().getSecurityInformation().get(0)
						.getResponsibilityInformation().getOfficeId();
				String creationOfficeId = pnrViews.getPnrView().getPnrHeader().getSecurityInformation().get(0)
						.getSecondRpInformation().getCreationOfficeId();
				log.info("pnr: " + pnr + " | officeId: " + officeId);
				BookingVO bookingVO = new BookingVO();
				bookingVO.setPnrNumber(pnr);
				bookingVO.setOfficeId(officeId);
				bookingVO.setCreatingOfficeId(creationOfficeId);
				context.setProperty("pnrNumber", pnr);
				ObjectMapper mapperObj = new ObjectMapper();
				String jsonResponse = null;
				jsonResponse = mapperObj.writeValueAsString(bookingVO);
				context.setProperty("pnrSearchResponse", jsonResponse.toString());
			} else if (pnrSearchReply.getErrorHandler() != null) {
				resultMessage = pnrSearchReply.getErrorHandler().getErrorOrWarningCodeDetails().getErrorDetails()
						.getErrorCode();
				if (pnrSearchReply.getErrorHandler().getErrorWarningDescription() != null
						&& !pnrSearchReply.getErrorHandler().getErrorWarningDescription().getFreeText().isEmpty()) {
					resultMessage = resultMessage + "|Application|"
							+ pnrSearchReply.getErrorHandler().getErrorWarningDescription().getFreeText().get(0);
				}

				log.info("Error while invoking PNR search service: " + resultMessage);
			}

			context.setProperty("resultMessage", String.valueOf(resultMessage));
			int sequence = 1;
			if (context.getProperty("sequenceNumber") != null) {
				String sequenceNumber = (String) context.getProperty("sequenceNumber");
				sequence = Integer.parseInt(sequenceNumber) + 1;
				context.setProperty("sequenceNumber", String.valueOf(sequence));
			}
		} catch (Exception e1) {
			log.error("Exception while processiong the PNRSearchReply: ", e1);
			resultMessage = "Exception while processiong the PNRSearchReply";
			return true;
		}
		return true;

	}

}
