package com.ibsplc.amadeus.mediators;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.amadeus.xml.pnracc_17_1_1a.PNRReply;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.amadeus.util.BookingTransformer;
import com.ibsplc.amadeus.vo.BookingVO;

import java.util.logging.Logger;

public class PNRResponseMediator extends AbstractMediator {
	
	final Logger log = Logger.getLogger(PNRResponseMediator.class.getName());

	/**
	 * SA Airline Code
	 */
	private static final String SA_AIRLINE_CODE = "SA";

	public boolean mediate(MessageContext context) {
		log.info("Entering PNRResponseMediator");

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
				sequence = Integer.parseInt(sequenceNumber) + 1;
				context.setProperty("sequenceNumber", String.valueOf(sequence));
			}
			log.info("Calling booking transformer...");
			BookingVO bookingVO = BookingTransformer.transformPNRReply(pnrReply);
			if (bookingVO != null && bookingVO.getCreatingOfficeId() != null
					&& bookingVO.getCreatingOfficeId().contains(SA_AIRLINE_CODE)) {
				context.setProperty("isSAAPNR", "Yes");
			}else{
				context.setProperty("isSAAPNR", "No");
			}
			ObjectMapper mapperObj = new ObjectMapper();
			// mapperObj.setSerializationInclusion(Include.NON_NULL);
			String jsonResponse = null;
			jsonResponse = mapperObj.writeValueAsString(bookingVO);
			// log.info("PNRResponseMediator: " + jsonResponse.toString());
			context.setProperty("bookingVO", bookingVO);
			context.setProperty("pnrRetrieveReponse", jsonResponse.toString());
			context.setProperty("PNRRetrieveStatus", "SUCCESS");
		} catch (Exception e1) {
			log.info("Exception while processing the PNRReply:"+e1);
			context.setProperty("PNRRetrieveErrorMessage", "Exception while processing the PNRReply: ");
			context.setProperty("PNRRetrieveStatus", "ERROR");
			return true;
		}
		return true;
	}

}
