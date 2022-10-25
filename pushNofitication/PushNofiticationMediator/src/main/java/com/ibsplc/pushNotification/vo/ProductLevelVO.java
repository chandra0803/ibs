package com.ibsplc.pushNotification.vo;

import java.util.List;

public class ProductLevelVO {
	BookingDataVO bookingData;
	SbrRecordLocatorVO sbrRecordLocator;
	List<TicketInformationVO> ticketInformationList;
	/**
	 * @return the bookingData
	 */
	public BookingDataVO getBookingData() {
		return bookingData;
	}
	/**
	 * @param bookingData the bookingData to set
	 */
	public void setBookingData(BookingDataVO bookingData) {
		this.bookingData = bookingData;
	}
	/**
	 * @return the sbrRecordLocator
	 */
	public SbrRecordLocatorVO getSbrRecordLocator() {
		return sbrRecordLocator;
	}
	/**
	 * @param sbrRecordLocator the sbrRecordLocator to set
	 */
	public void setSbrRecordLocator(SbrRecordLocatorVO sbrRecordLocator) {
		this.sbrRecordLocator = sbrRecordLocator;
	}
	/**
	 * @return the ticketInformationList
	 */
	public List<TicketInformationVO> getTicketInformationList() {
		return ticketInformationList;
	}
	/**
	 * @param ticketInformationList the ticketInformationList to set
	 */
	public void setTicketInformationList(List<TicketInformationVO> ticketInformationList) {
		this.ticketInformationList = ticketInformationList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductLevel [bookingData=" + bookingData + ", sbrRecordLocator=" + sbrRecordLocator
				+ ", ticketInformationList=" + ticketInformationList + "]";
	}
	
	
}
