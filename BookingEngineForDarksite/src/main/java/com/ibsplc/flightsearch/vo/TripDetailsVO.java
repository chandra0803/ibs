package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

public class TripDetailsVO  extends AbstractVO implements Serializable {
	/**
	 * serial version ID
	 */
	private static final long serialVersionUID = 1L;	
	/**
	 * Serial Id
	 */
	private long slId;	
	/** 
	 * EmailId
	 */
    private String emailId;	
	/**
	 * Surname
	 */
	private String surName;
	/**
	 * PNRNumber
	 */
    private String pnrNumber;
    /**
	 * @return the slId
	 */
	public long getSlId() {
		return slId;
	}
	/**
	 * @param slId
	 * 		the slId to set
	 */
	public void setSlId(long slId) {
		this.slId = slId;
	}	
	/**
	 * @return the pnrNumber
	 */
	public String getPnrNumber() {
		return pnrNumber;
	}
	/**
	 * @param pnrNumber
	 * 		the pnrNumber to set
	 */
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	/**
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}
	/**
	 * @param surName
	 * 		the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId
	 * 		the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
