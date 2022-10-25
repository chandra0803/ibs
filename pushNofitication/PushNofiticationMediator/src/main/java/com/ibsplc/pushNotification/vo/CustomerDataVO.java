package com.ibsplc.pushNotification.vo;

public class CustomerDataVO {
	
	private static final long serialVersionUID = 1L;
	
	private PaxDetailsVO paxDetails;

	/**
	 * @return the paxDetails
	 */
	public PaxDetailsVO getPaxDetails() {
		return paxDetails;
	}

	/**
	 * @param paxDetails the paxDetails to set
	 */
	public void setPaxDetails(PaxDetailsVO paxDetails) {
		this.paxDetails = paxDetails;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerData [paxDetails=" + paxDetails + "]";
	}
	
	

}
