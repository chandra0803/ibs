package com.ibsplc.amadeus.vo;

public class DcsSegmentInfoVO extends AbstractVO {
	
	private String booking;
	private PaxTypeVO  paxTypeVO;
	
	
	/**
	 * @return the booking
	 */
	public String getBooking() {
		return booking;
	}
	/**
	 * @param booking the booking to set
	 */
	public void setBooking(String booking) {
		this.booking = booking;
	}
	/**
	 * @return the paxTypeVO
	 */
	public PaxTypeVO getPaxTypeVO() {
		return paxTypeVO;
	}
	/**
	 * @param paxTypeVO the paxTypeVO to set
	 */
	public void setPaxTypeVO(PaxTypeVO paxTypeVO) {
		this.paxTypeVO = paxTypeVO;
	}

	
}
