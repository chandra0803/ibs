package com.ibsplc.reservation.vo;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class BookingInformationVO extends AbstractVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The PNR number associated with booking
	 */
	private String pnrNumber;
	/**
	 * The Surname associated with booking
	 */
	private String surName;
	/**
	 * Remark
	 */
	private String remark;
	/**
	 * Session ID
	 */
	private String sessionId;
	/**
	 * Client Session ID
	 */
	private String clientSessionId;
	/**
	 * Sequence Number
	 */
	private int sequenceNumber;
	/**
	 * Security Token
	 */
	private String securityToken;
	/**
	 * The Ticket number associated with booking
	 */
	private String ticketNumber;
	/**
	 * The EMD Number
	 */
	private String emdNumber;

	public String getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSecurityToken() {
		return securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}

	public String getEmdNumber() {
		return emdNumber;
	}

	public void setEmdNumber(String emdNumber) {
		this.emdNumber = emdNumber;
	}

	/**
	 * @return the sequenceNumber
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * @param sequenceNumber the sequenceNumber to set
	 */
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getClientSessionId() {
		return clientSessionId;
	}

	public void setClientSessionId(String clientSessionId) {
		this.clientSessionId = clientSessionId;
	}

}
