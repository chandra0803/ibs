package com.ibsplc.common.vo;

 

import com.ibsplc.common.constants.CommonRequestObject;
import com.ibsplc.common.constants.CommonSessionObject;
import com.ibsplc.framework.vo.AbstractVO;

public class CommonRequestParametersVO extends AbstractVO {

	private static final long serialVersionUID = 1L;
 
	private String country;
	 
	private String language;
	 
	private String product;
	 
	private String isMobileDevice;
	 
	private String clientSessionId;
	private CommonSessionObject sessionObj;
	private CommonRequestObject reqObj;
	public String getCountry() {
		return country;
	}

	public CommonRequestObject getReqObj() {
		return reqObj;
	}

	public void setReqObj(CommonRequestObject reqObj) {
		this.reqObj = reqObj;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public CommonSessionObject getSessionObj() {
		return sessionObj;
	}

	public void setSessionObj(CommonSessionObject sessionObj) {
		this.sessionObj = sessionObj;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getIsMobileDevice() {
		return isMobileDevice;
	}

	public void setIsMobileDevice(String isMobileDevice) {
		this.isMobileDevice = isMobileDevice;
	}

	public String getClientSessionId() {
		return clientSessionId;
	}

	public void setClientSessionId(String clientSessionId) {
		this.clientSessionId = clientSessionId;
	}

}
