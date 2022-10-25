package com.ibsplc.amadeus.mediators;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class PNRSearchRequestMediator extends AbstractMediator {

	public boolean mediate(MessageContext context) {
		String ticketNumber = "";
		String identifier = "749";
		if (context.getProperty("eTicketNumber") != null) {
			String eTicketNumber = (String) context.getProperty("eTicketNumber");
			eTicketNumber = eTicketNumber.replaceAll("-", "").trim();
			if (eTicketNumber.length() == 13) {
				ticketNumber = eTicketNumber.substring(eTicketNumber.length() - 10);
				identifier = eTicketNumber.substring(0, 3);
			} else {
				ticketNumber = eTicketNumber;
				log.info("E-Ticket number charcters less than 13");
			}
			log.info("TicketNumber: " + ticketNumber + " | Identifier: " + identifier);
		} 
		context.setProperty("ticketNumber", ticketNumber);
		context.setProperty("identifier", identifier);
		return true;
	}
}
