package com.ibsplc.amadeus.mediators;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.amadeus.xml.tatres_15_2_1a.TicketProcessEDocReply;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.amadeus.util.BookingTransformer;
import com.ibsplc.amadeus.vo.BookingVO;

/**
 * @author a-5316
 *
 */
public class ProcessEDocResponseMediator extends AbstractMediator {

	public boolean mediate(MessageContext context) {

		log.info("Entering ProcessEDocResponseMediator");
		String soapMessage = context.getEnvelope().getBody().getFirstElement().toString();
		InputStream inputStream = new ByteArrayInputStream(soapMessage.getBytes(Charset.forName("UTF-8")));
		String resultMessage = "Success";
		Unmarshaller unmarshaller;
		try {
			unmarshaller = JAXBContext.newInstance(TicketProcessEDocReply.class).createUnmarshaller();
			TicketProcessEDocReply ticketProcessReply = (TicketProcessEDocReply) unmarshaller.unmarshal(inputStream);
			if (ticketProcessReply.getDocGroup() != null && !ticketProcessReply.getDocGroup().isEmpty()) {

				BookingVO bookingVO = BookingTransformer.transformResponse(ticketProcessReply);
				ObjectMapper mapperObj = new ObjectMapper();
				String jsonResponse = null;
				try {
					jsonResponse = mapperObj.writeValueAsString(bookingVO);
					context.setProperty("bookingVO", bookingVO);
					context.setProperty("ticketProcessEDocResponse", jsonResponse.toString());
				} catch (Exception e) {
					log.error("JsonProcessingException in ProcessEDoc: ", e);
					return false;
				}
			} else if (ticketProcessReply.getError() != null
					&& ticketProcessReply.getError().getErrorDetails() != null) {
				resultMessage = ticketProcessReply.getError().getErrorDetails().getErrorCode();
				if (ticketProcessReply.getTextInfo() != null && !ticketProcessReply.getTextInfo().isEmpty()
						&& !ticketProcessReply.getTextInfo().get(0).getFreeText().isEmpty()) {

					resultMessage = resultMessage + "|Application|"
							+ ticketProcessReply.getTextInfo().get(0).getFreeText().get(0);
				}
				log.info("Error while invoking eDoc service: " + resultMessage);
			}

			context.setProperty("resultMessage", String.valueOf(resultMessage));

		} catch (Exception e1) {
			log.error("Exception while processiong the EDoc response", e1);
			return false;
		}
		return true;
	}

}
