package com.ibsplc.flightsearch.vo;
 

import com.ibsplc.common.vo.CommonRequestParametersVO;

/**
 * @author a-5316
 *
 */
public class RetrieveRequestVO extends CommonRequestParametersVO {
	/**
	 * serial version ID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * EmailId
	 */
	 
	private String emailID;
	
	 
	private String requestTimeUTC;

	/**
	 * @return the emailID
	 */
	public String getEmailID() {
		return emailID;
	}

	/**
	 * @param emailID
	 *            the emailID to set
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	/**
	 * @return the requestTimeUTC
	 */
	public String getRequestTimeUTC() {
		return requestTimeUTC;
	}

	/**
	 * @param requestTimeUTC the requestTimeUTC to set
	 */
	public void setRequestTimeUTC(String requestTimeUTC) {
		this.requestTimeUTC = requestTimeUTC;
	}

}
