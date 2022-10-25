package com.ibsplc.TailogIntegration.util.log;

/**
 * @author a-5316
 *
 */
public interface Logger {

	
	/**
	 * entering
	 * @param loggerType
	 * @param message
	 */

	public void entering(String className, String methodName);
	/**
	 * exiting
	 * @param loggerType
	 * @param message
	 */
	public void exiting(String className, String methodName);
	/**
	 * debug
	 * @param message
	 */
	public void debug(String message) ;
	/**
	 * info
	 * @param message
	 */
	public void info(String message);
	/**
	 * warning
	 * @param message
	 */
	public void warning(String message);
	/**
	 * warning
	 * @param message
	 * @param error
	 */
	public void warning(String message, Throwable error);
	/**
	 * error
	 * @param message
	 */
	public void error(String message);
	/**
	 * error
	 * @param message
	 * @param error
	 */
	public void error(String message, Throwable error);


	/**
	 * fatal
	 * @param message
	 */
	public void fatal(String message);
	/**
	 * fatal
	 * @param message
	 * @param error
	 */
	public void fatal(String message, Throwable error);
}
