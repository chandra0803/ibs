package com.ibsplc.framework.exception.model;

/**
 * @author a-5316
 *
 */
public class SystemException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 
	 * The error code associated with this exception 
	 */
	private final String errorCode;
	
	/**
	 * Constructor that takes a throwable as argument. This is the preferred
	 * constructor
	 * @param errorCode
	 */
	public SystemException(String errorCode) {
		super();
		this.errorCode = errorCode;
	}
	/**
	 * Constructor that accepts a message and a throwable as argument
	 * @param errorCode
	 * @param exception
	 */
	public SystemException(String errorCode, Throwable exception) {
		super(exception);
		this.errorCode = errorCode;
	}
	/**
	 * 2 argument constructor
	 * @param errorCode
	 * @param errorMessage
	 */
	public SystemException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode=errorCode;
	}
	/**
	 * Constructor that accepts a message,error code and a throwable as argument
	 */
	public SystemException(String errorCode,Throwable exception, String message) {
		super(message,exception);
		this.errorCode = errorCode;
	}
	/**
	 *getErrorCode
	 * @return errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
}
