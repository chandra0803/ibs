package com.ibsplc.pushNotification.vo;

public class SbrRecordLocatorVO {
	ReservationVO reservation;

	/**
	 * @return the reservation
	 */
	public ReservationVO getReservation() {
		return reservation;
	}

	/**
	 * @param reservation the reservation to set
	 */
	public void setReservation(ReservationVO reservation) {
		this.reservation = reservation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SbrRecordLocator [reservation=" + reservation + "]";
	}
	
	
}
