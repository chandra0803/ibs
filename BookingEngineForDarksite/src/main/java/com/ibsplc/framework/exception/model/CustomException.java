package com.ibsplc.framework.exception.model;

/**
 * @author a-5316
 *
 */
public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errMsg;
	private String errCode;
	private String excMsg;

	public CustomException() {

	}

	public CustomException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public CustomException(String errCode, Exception e) {

		this.errCode = errCode;
		this.errMsg = e.getMessage();

	}

	public CustomException(String errCode, Exception e, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
		this.excMsg = e.getMessage();

	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getExcMsg() {
		return excMsg;
	}

	public void setExcMsg(String excMsg) {
		this.excMsg = excMsg;
	}

}
