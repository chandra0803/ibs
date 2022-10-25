package com.ibsplc.flightsearch.vo;

import com.ibsplc.framework.vo.CommonResponseVO;

/**
 * @author A-6620
 *
 */
public class FlightSearchResponseVO extends CommonResponseVO {
	

	private static final long serialVersionUID = 1L;
	
	private String flightSearchRedirectUrl;
	private Boolean isRedirectedToSAA;

	public Boolean getIsRedirectedToSAA() {
		return isRedirectedToSAA;
	}

	public void setIsRedirectedToSAA(Boolean isRedirectedToSAA) {
		this.isRedirectedToSAA = isRedirectedToSAA;
	}

	public String getFlightSearchRedirectUrl() {
		return flightSearchRedirectUrl;
	}

	public void setFlightSearchRedirectUrl(String flightSearchRedirectUrl) {
		this.flightSearchRedirectUrl = flightSearchRedirectUrl;
	}
	
}
