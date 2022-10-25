package com.ibsplc.framework.vo;


/**
 * @author a-5316
 *
 */
public class GenerateExceptionResponseVO extends CommonResponseVO {
	
	/**
	 * serial version ID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Result Message
	 */
	private String resultMessage;
	/**
	 * Error Message
	 */
	private String errorMessage;
	/**
	 * Error Information
	 */
	private String errorInfo;
	
	public String getResultMessage() {
		return resultMessage;
	}
	
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getErrorInfo() {
		return errorInfo;
	}
	
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

}
