package com.ibsplc.amadeus.mediators;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.amadeus.xml.ttstrr_15_1_1a.TicketDisplayTSTReply;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.amadeus.util.BookingTransformer;
import com.ibsplc.amadeus.vo.BookingVO;

public class TicketDisplayTSTResponseMediator extends AbstractMediator {

	public boolean mediate(MessageContext context) {
		log.info("Entering TicketDisplayTSTResponseMediator");
		String soapMessage = context.getEnvelope().getBody().getFirstElement().toString();
		BookingVO bookingVO = (BookingVO) context.getProperty("bookingVO");
		InputStream inputStream = new ByteArrayInputStream(soapMessage.getBytes(Charset.forName("UTF-8")));
		Unmarshaller unmarshaller;
		try {
			unmarshaller = JAXBContext.newInstance(TicketDisplayTSTReply.class).createUnmarshaller();
			TicketDisplayTSTReply ticketDisplayTSTReply = (TicketDisplayTSTReply) unmarshaller.unmarshal(inputStream);
			if (ticketDisplayTSTReply.getErrorGroup() != null) {
				String ticketDisplayTSTErrorMessage = ticketDisplayTSTReply.getErrorGroup()
						.getErrorOrWarningCodeDetails().getErrorDetails().getErrorCode();
				if (!ticketDisplayTSTReply.getErrorGroup().getErrorWarningDescription().getFreeText().isEmpty()) {
					ticketDisplayTSTErrorMessage = ticketDisplayTSTErrorMessage + "|"
							+ ticketDisplayTSTReply.getErrorGroup().getErrorWarningDescription().getFreeText().get(0);
				}
				log.info("Error in TicketDisplayTST Reply: " + ticketDisplayTSTErrorMessage);
				context.setProperty("ticketDisplayTSTErrorMessage", ticketDisplayTSTErrorMessage);
				context.setProperty("ticketDisplayTSTStatus", "ERROR");
				if (context.getProperty("sequenceNumber") != null) {
					String sequenceNumber = (String) context.getProperty("sequenceNumber");
					int sequence = Integer.parseInt(sequenceNumber) + 1;
					context.setProperty("sequenceNumber", String.valueOf(sequence));
				}
			} else {
				context.setProperty("ticketDisplayTSTStatus", "SUCCESS");
				BookingTransformer.populateFareInfo(bookingVO, ticketDisplayTSTReply);
			}

			ObjectMapper mapperObj = new ObjectMapper();
			String jsonResponse = null;
			jsonResponse = mapperObj.writeValueAsString(bookingVO);
			context.setProperty("bookingVO", bookingVO);
			context.setProperty("pnrRetrieveReponse", jsonResponse.toString());
		} catch (Exception e1) {
			log.error("Exception while processiong the TicketDisplayTSTReply: ", e1);
			context.setProperty("ticketDisplayTSTErrorMessage", "Exception while processiong the TicketDisplayTSTReply");
			context.setProperty("ticketDisplayTSTStatus", "ERROR");
			return true;
		}
		return true;
	}

}
