package com.ibsplc.reservation.vo;

 

import com.ibsplc.common.vo.CommonRequestParametersVO;

/**
 * @author a-5316
 *
 */
public class CheckInRequestVO extends CommonRequestParametersVO {

	private static final long serialVersionUID = 1L;
	/**
	 * surName - SurName
	 */
 
	private String surName;

	/**
	 * formOfIdentification - Form of identification
	 */
 
	private String formOfIdentification;
	/**
	 * pnrNumber - PNR Number
	 */
	private String pnrNumber;
	/**
	 * ticketNumber - Ticket Number
	 */
	private String ticketNumber;
	/**
	 * Group Travel
	 */
 
	private String groupTravel;

	/**
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * @param surName
	 *            the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}

	/**
	 * @return the formOfIdentification
	 */
	public String getFormOfIdentification() {
		return formOfIdentification;
	}

	/**
	 * @param formOfIdentification
	 *            the formOfIdentification to set
	 */
	public void setFormOfIdentification(String formOfIdentification) {
		this.formOfIdentification = formOfIdentification;
	}

	/**
	 * @return the pnrNumber
	 */
	public String getPnrNumber() {
		return pnrNumber;
	}

	/**
	 * @param pnrNumber
	 *            the pnrNumber to set
	 */
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	/**
	 * @return the ticketNumber
	 */
	public String getTicketNumber() {
		return ticketNumber;
	}

	/**
	 * @param ticketNumber
	 *            the ticketNumber to set
	 */
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	/**
	 * @return the groupTravel
	 */
	public String getGroupTravel() {
		return groupTravel;
	}
	/**
	 * @param groupTravel
	 *            the groupTravel to set
	 */
	public void setGroupTravel(String groupTravel) {
		this.groupTravel = groupTravel;
	}	

}
