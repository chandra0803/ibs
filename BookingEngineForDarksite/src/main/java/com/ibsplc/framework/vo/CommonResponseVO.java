package com.ibsplc.framework.vo;

import java.io.Serializable;

/**
 * @author a-5316
 *
 */
public class CommonResponseVO implements Serializable {

	/**
	 * serial version ID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Result Code
	 */
	private String resultCode;
	/**
	 * Message to be displayed
	 */
	private String displayMessage;
	/**
	 * Response Information
	 */
	private String responseInfo;	
	/**
	 * Result Message
	 */
	private String resultMessage;
	private String errorMessage;
	private String errorInfo;
	private String sessionId;
	private String clientSessionId;
	private String requestURL;

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

	public String getResultCode() {
		return resultCode;
	}
	
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	
	public String getDisplayMessage() {
		return displayMessage;
	}
	
	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}
	
	public String getResponseInfo() {
		return responseInfo;
	}
	
	public void setResponseInfo(String responseInfo) {
		this.responseInfo = responseInfo;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getClientSessionId() {
		return clientSessionId;
	}

	public void setClientSessionId(String clientSessionId) {
		this.clientSessionId = clientSessionId;
	}

	public String getRequestURL() {
		return requestURL;
	}

	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}
	
	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

}
