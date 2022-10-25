package com.ibsplc.reservation.vo;

import com.ibsplc.framework.vo.CommonResponseVO;

/**
 * @author a-5316
 *
 */
public class CheckInResponseVO extends CommonResponseVO {

	private static final long serialVersionUID = 1L;
	/**
	 * Check in redirect URL
	 */
	private String checkInRedirectUrl;

	/**
	 * @return the checkInRedirectUrl
	 */
	public String getCheckInRedirectUrl() {
		return checkInRedirectUrl;
	}

	/**
	 * @param checkInRedirectUrl
	 *            the checkInRedirectUrl to set
	 */
	public void setCheckInRedirectUrl(String checkInRedirectUrl) {
		this.checkInRedirectUrl = checkInRedirectUrl;
	}

}
