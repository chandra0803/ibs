package com.ibsplc.common.vo;

import java.io.Serializable;

import com.ibsplc.common.constants.CommonRequestObject;
import com.ibsplc.common.constants.CommonSessionObject;

public class CommonMobileRequestVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CommonRequestObject reqObj;
	private CommonSessionObject sessionObj;
	
	public CommonRequestObject getReqObj() {
		return reqObj;
	}
	public void setReqObj(CommonRequestObject reqObj) {
		this.reqObj = reqObj;
	}
	public CommonSessionObject getSessionObj() {
		return sessionObj;
	}
	public void setSessionObj(CommonSessionObject sessionObj) {
		this.sessionObj = sessionObj;
	}
	
	
	

}
