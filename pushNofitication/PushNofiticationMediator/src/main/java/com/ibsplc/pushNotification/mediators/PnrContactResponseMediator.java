package com.ibsplc.pushNotification.mediators;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.StringUtils;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.amadeus.xml.pnracc_17_1_1a.PNRReply;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.pushNotification.util.BookingQueueTransformer;
import com.ibsplc.pushNotification.vo.BookingVO;

public class PnrContactResponseMediator extends AbstractMediator{

	public boolean mediate(MessageContext context) {
		log.info("Entering PnrContactResponseMediator");
		String soapMessage = context.getEnvelope().getBody().getFirstElement().toString();
		String errorMsg = CommonKeys.ERROR;
		InputStream inputStream = new ByteArrayInputStream(soapMessage.getBytes(Charset.forName("UTF-8")));
		Unmarshaller unmarshaller;
		try {
			unmarshaller = JAXBContext.newInstance(PNRReply.class).createUnmarshaller();
			PNRReply pnrReply = (PNRReply) unmarshaller.unmarshal(inputStream);
			String officeId = pnrReply.getSecurityInformation().getResponsibilityInformation().getOfficeId();
			log.info("OfficeId: " + officeId);
			pnrReply.getOriginDestinationDetails();
			int sequence = 1;
			if (context.getProperty("sequenceNumber") != null) {
				String sequenceNumber = (String) context.getProperty("sequenceNumber");
				sequence = Integer.parseInt(sequenceNumber) + 1;
				context.setProperty("sequenceNumber", String.valueOf(sequence));
			}
			if (pnrReply != null && pnrReply.getDataElementsMaster() != null) {			
			BookingVO bookingVO = BookingQueueTransformer.transformingPNRNotifyContact(pnrReply);
					
			if (bookingVO.getCurrTime() != null && StringUtils.isNotEmpty(bookingVO.getCurrTime())) {
				context.setProperty("isCURRTIME", bookingVO.getCurrTime());
			}
			ObjectMapper mapperObj = new ObjectMapper();
			// mapperObj.setSerializationInclusion(Include.NON_NULL);
			String jsonResponse = null;
			jsonResponse = mapperObj.writeValueAsString(bookingVO);
			// log.info("PNRResponseMediator: " + jsonResponse.toString());
			context.setProperty("bookingVO", bookingVO);
			context.setProperty("pnrRetrieveReponse", jsonResponse.toString());
			context.setProperty("PNRRetrieveStatus", "SUCCESS");
			}else {
				if (org.apache.commons.collections.CollectionUtils.isNotEmpty(pnrReply.getGeneralErrorInfo())
						&& pnrReply.getGeneralErrorInfo().size() > 0) {
					if (!pnrReply.getGeneralErrorInfo().get(0).getErrorWarningDescription().getFreeText().isEmpty()) {
						log.info("Invalid response :" + pnrReply.getGeneralErrorInfo().get(0)
								.getErrorWarningDescription().getFreeText().get(0));
						errorMsg = pnrReply.getGeneralErrorInfo().get(0).getErrorWarningDescription().getFreeText()
								.get(0);
					}
				}
				context.setProperty("PNRRetrieveStatus", CommonKeys.ERROR);
				context.setProperty("PNRRetrieveErrorMessage", errorMsg);
			}
		} catch (Exception e1) {
			log.error("Exception while processing the PNRReply", e1);
			context.setProperty("PNRRetrieveErrorMessage", "Exception while processing the PNRReply");
			context.setProperty("PNRRetrieveStatus", "ERROR");
			return true;
		}
		return true;
	}

}
