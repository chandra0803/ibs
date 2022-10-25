package com.ibsplc.amadeus.mediators;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.amadeus.xml.pnracc_17_1_1a.PNRReply;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.amadeus.util.BookingTransformerSelfService;
import com.ibsplc.amadeus.vo.SelfServiceBookingVO;

public class SelfServiceResponseMediator extends AbstractMediator {
	
	final Logger log = Logger.getLogger(SelfServiceResponseMediator.class.getName());

	/**
	 * SA Airline Code
	 */
	private static final String SA_AIRLINE_CODE = "SA";

	public boolean mediate(MessageContext context) {
		log.info("Entering SelfServiceResponseMediator ...");

		String soapMessage = context.getEnvelope().getBody().getFirstElement().toString();

		InputStream inputStream = new ByteArrayInputStream(soapMessage.getBytes(Charset.forName("UTF-8")));
		Unmarshaller unmarshaller;
		try {
			unmarshaller = JAXBContext.newInstance(PNRReply.class).createUnmarshaller();
			PNRReply pnrReply = (PNRReply) unmarshaller.unmarshal(inputStream);
			String officeId = pnrReply.getSecurityInformation().getResponsibilityInformation().getOfficeId();
			log.info("OfficeId: " + officeId);
			
			//Code segment to check if officeId contains '4Z'
			if(officeId.contains("4Z"))
				context.setProperty("officeType", "4Z");
			else
				context.setProperty("officeType", "TA");
			
			pnrReply.getOriginDestinationDetails();
			int sequence = 1;
			if (context.getProperty("sequenceNumber") != null) {
				String sequenceNumber = (String) context.getProperty("sequenceNumber");
				sequence = Integer.parseInt(sequenceNumber) + 2;
				context.setProperty("sequenceNumber", String.valueOf(sequence));
			}
			log.info("Calling SelfService booking transformer...");
			SelfServiceBookingVO selfServiceBookingVO = BookingTransformerSelfService.transformPNRReplyForSelfService(pnrReply);
			//log.info("SelfService booking VO object..."+selfServiceBookingVO);
			if (selfServiceBookingVO != null && selfServiceBookingVO.getCreatingOfficeId() != null
					&& selfServiceBookingVO.getCreatingOfficeId().contains(SA_AIRLINE_CODE)) {
				context.setProperty("isSAAPNR", "Yes");
			}else{
				context.setProperty("isSAAPNR", "No");
			}
			ObjectMapper mapperObj = new ObjectMapper();
			// mapperObj.setSerializationInclusion(Include.NON_NULL);
			String jsonResponse = null;
			jsonResponse = mapperObj.writeValueAsString(selfServiceBookingVO);
			//log.info("### PNRResponseMediator for selfservice: " + jsonResponse.toString());
			context.setProperty("bookingVO", selfServiceBookingVO);
			context.setProperty("pnrRetrieveReponse", jsonResponse.toString());
			context.setProperty("PNRRetrieveStatus", "SUCCESS");
			log.info("### PNRResponseMediator for selfservice PNRRetrieveStatus is SUCCESS");
		} catch (Exception e1) {
			log.info("Exception while processing the PNRReply for selfservice:"+e1);
			context.setProperty("PNRRetrieveErrorMessage", "Exception while processing the PNRReply: ");
			context.setProperty("PNRRetrieveStatus", "ERROR");
			return true;
		}
		return true;
	}

}
