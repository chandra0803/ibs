package com.ibsplc.pushNotification.vo;

public class TicketVO {
	DocumentDetailsVO documentDetails;

	/**
	 * @return the documentDetails
	 */
	public DocumentDetailsVO getDocumentDetails() {
		return documentDetails;
	}

	/**
	 * @param documentDetails the documentDetails to set
	 */
	public void setDocumentDetails(DocumentDetailsVO documentDetails) {
		this.documentDetails = documentDetails;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ticket [documentDetails=" + documentDetails + "]";
	}
	
	
}
