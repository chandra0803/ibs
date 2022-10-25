package com.ibsplc.amadeus.vo;

public class CancelOrConfirmNbrVO extends AbstractVO {
 
	 private ReservationVO reservationVO;
	 

	/**
	 * @return the reservationVO
	 */
	public ReservationVO getReservationVO() {
		return reservationVO;
	}

	/**
	 * @param reservationVO the reservationVO to set
	 */
	public void setReservationVO(ReservationVO reservationVO) {
		this.reservationVO = reservationVO;
	}
	 
	 
}
