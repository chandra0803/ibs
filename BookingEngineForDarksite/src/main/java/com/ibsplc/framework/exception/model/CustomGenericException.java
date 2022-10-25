package com.ibsplc.framework.exception.model;

/**
 * @author a-5316
 *
 */
public class CustomGenericException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private String errCode;
	private String errMsg;
	
	public CustomGenericException() {
		
	}
	
	public CustomGenericException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
	
	public CustomGenericException(String errCode, Exception e) {
		
		this.errCode = errCode;
		this.errMsg = e.getMessage();
		
	}
	
	public CustomGenericException(String errCode, Exception e, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
		this.errMsg = e.getMessage();
		
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
