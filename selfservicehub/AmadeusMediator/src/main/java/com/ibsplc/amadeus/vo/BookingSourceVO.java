package com.ibsplc.amadeus.vo;

public class BookingSourceVO  extends AbstractVO {
	
	private OriginatorDetailsVO originatorDetails;

	/**
	 * @return the originatorDetails
	 */
	public OriginatorDetailsVO getOriginatorDetails() {
		return originatorDetails;
	}

	/**
	 * @param originatorDetails the originatorDetails to set
	 */
	public void setOriginatorDetails(OriginatorDetailsVO originatorDetails) {
		this.originatorDetails = originatorDetails;
	} 
	
}
