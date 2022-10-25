package com.ibsplc.pushNotification.vo;

public class TicketInformationVO {
	TicketVO ticket;

	/**
	 * @return the ticket
	 */
	public TicketVO getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(TicketVO ticket) {
		this.ticket = ticket;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TicketInformation [ticket=" + ticket + "]";
	}
	
	
}
