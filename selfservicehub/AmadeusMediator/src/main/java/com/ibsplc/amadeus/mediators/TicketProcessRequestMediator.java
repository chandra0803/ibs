package com.ibsplc.amadeus.mediators;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

/**
 * @author a-5316
 *
 */
public class TicketProcessRequestMediator extends AbstractMediator {

	public boolean mediate(MessageContext messageContext) {
		String documentNumber = "";
		String messageFunction = "";
		log.info("ticketNumber : " + messageContext.getProperty("ticketNumber"));
		log.info("emdNumber : " + messageContext.getProperty("emdNumber"));

		if (messageContext.getProperty("ticketNumber") != null
				&& !((String) messageContext.getProperty("ticketNumber")).trim().isEmpty()) {
			documentNumber = (String) messageContext.getProperty("ticketNumber");
			messageFunction = "131";
			log.info("1===>>>> : ");
		} else if (messageContext.getProperty("emdNumber") != null
				&& !((String) messageContext.getProperty("emdNumber")).trim().isEmpty()) {
			documentNumber = (String) messageContext.getProperty("emdNumber");
			messageFunction = "791";
			log.info("1===>>>> : ");
		}
		log.info("documentNumber : " + documentNumber + " | messageFunction: " + messageFunction);
		messageContext.setProperty("documentNumber", documentNumber);
		messageContext.setProperty("messageFunction", messageFunction);
		return true;
	}

}
