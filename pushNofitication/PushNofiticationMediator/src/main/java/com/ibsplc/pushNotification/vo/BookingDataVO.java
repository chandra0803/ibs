package com.ibsplc.pushNotification.vo;

public class BookingDataVO {

	private static final long serialVersionUID = 1L;
	private String statusCode;

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode
	 *            the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookingData [statusCode=" + statusCode + "]";
	}

}
