package com.ibsplc.TailogIntegration.util.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.apache.logging.log4j.spi.ExtendedLoggerWrapper;



/**
 * @author a-5316
 *
 */
public class Log4j2Logger extends ExtendedLoggerWrapper implements com.ibsplc.TailogIntegration.util.log.Logger {


	private static final long serialVersionUID = -7125144740054567413L;
	private static final Level VERBOSE = Level.forName("VERBOSE", 550);
	
	private Log4j2Logger(final Logger logger) {
		super((AbstractLogger) logger, logger.getName(), logger.getMessageFactory());
	}
	
	/**
	 * Returns a custom Logger using the fully qualified name of the Class as
	 * the Logger name.
	 * 
	 * @param loggerName
	 *            The Class whose name should be used as the Logger name. If
	 *            null it will default to the calling class.
	 * @return The custom Logger.
	 */
	public static Log4j2Logger create(final Class<?> loggerName) {
		final Logger wrapped = LogManager.getLogger(loggerName);
		return new Log4j2Logger(wrapped);
	}
	
	/**
	 * Logs a message with the specific Marker at the {@code VERBOSE} level.
	 * 
	 * @param marker
	 *            the marker data specific to this log statement
	 * @param msg
	 *            the message string to be logged
	 */
	public void verbose(final Marker marker, final Message msg) {
		logger.log(VERBOSE, marker, msg);
	}
	
	/**
	 * Logs a message with the specific Marker at the {@code VERBOSE} level.
	 * 
	 * @param marker
	 *            the marker data specific to this log statement
	 * @param msg
	 *            the message string to be logged
	 * @param t
	 *            A Throwable or null.
	 */
	public void verbose(final Marker marker, final Message msg, final Throwable t) {
		logger.log(VERBOSE, marker, msg, t);
	}
	
	/**
	 * Logs a message object with the {@code VERBOSE} level.
	 * 
	 * @param marker
	 *            the marker data specific to this log statement
	 * @param message
	 *            the message object to log.
	 */
	public void verbose(final Marker marker, final Object message) {
		logger.log(VERBOSE, marker, message);

	}
	
	/**
	 * Logs a message at the {@code VERBOSE} level including the stack trace of
	 * the {@link Throwable} {@code t} passed as parameter.
	 * 
	 * @param marker
	 *            the marker data specific to this log statement
	 * @param message
	 *            the message to log.
	 * @param t
	 *            the exception to log, including its stack trace.
	 */
	public void verbose(final Marker marker, final Object message, final Throwable t) {
		logger.log(VERBOSE, marker, message, t);
	}
	
	/**
	 * Logs a message object with the {@code VERBOSE} level.
	 * 
	 * @param marker
	 *            the marker data specific to this log statement
	 * @param message
	 *            the message object to log.
	 */
	public void verbose(final Marker marker, final String message) {
		logger.log(VERBOSE, marker, message);
	}
	
	/**
	 * Logs a message with parameters at the {@code VERBOSE} level.
	 * 
	 * @param marker
	 *            the marker data specific to this log statement
	 * @param message
	 *            the message to log; the format depends on the message factory.
	 * @param params
	 *            parameters to the message.
	 * @see #getMessageFactory()
	 */
	public void verbose(final Marker marker, final String message, final Object... params) {
		logger.log(VERBOSE, marker, message, params);
	}
	
	/**
	 * Logs a message at the {@code VERBOSE} level including the stack trace of
	 * the {@link Throwable} {@code t} passed as parameter.
	 * 
	 * @param marker
	 *            the marker data specific to this log statement
	 * @param message
	 *            the message to log.
	 * @param t
	 *            the exception to log, including its stack trace.
	 */
	public void verbose(final Marker marker, final String message, final Throwable t) {
		logger.log(VERBOSE, marker, message, t);
	}
	
	/**
	 * Logs a message with the specific Marker at the {@code VERBOSE} level.
	 * 
	 * @param msg
	 *            the message string to be logged
	 */
	public void verbose(final Message msg) {
		logger.log(VERBOSE, msg);
	}
	
	/**
	 * Logs a message with the specific Marker at the {@code VERBOSE} level.
	 * 
	 * @param msg
	 *            the message string to be logged
	 * @param t
	 *            A Throwable or null.
	 */
	public void verbose(final Message msg, final Throwable t) {
		logger.log(VERBOSE, msg, t);
	}
	
	/**
	 * Logs a message object with the {@code VERBOSE} level.
	 * 
	 * @param message
	 *            the message object to log.
	 */
	public void verbose(final Object message) {
		logger.log(VERBOSE, message);
	}
	
	/**
	 * Logs a message at the {@code VERBOSE} level including the stack trace of
	 * the {@link Throwable} {@code t} passed as parameter.
	 * 
	 * @param message
	 *            the message to log.
	 * @param t
	 *            the exception to log, including its stack trace.
	 */
	public void verbose(final Object message, final Throwable t) {
		logger.log(VERBOSE, message, t);
	}
	
	/**
	 * Logs a message object with the {@code VERBOSE} level.
	 * 
	 * @param message
	 *            the message object to log.
	 */
	public void verbose(final String message) {
		logger.log(VERBOSE, message);
	}
	
	/**
	 * Logs a message with parameters at the {@code VERBOSE} level.
	 * 
	 * @param message
	 *            the message to log; the format depends on the message factory.
	 * @param params
	 *            parameters to the message.
	 * @see #getMessageFactory()
	 */
	public void verbose(final String message, final Object... params) {
		logger.log(VERBOSE, message, params);
	}
	
	/**
	 * Logs a message at the {@code VERBOSE} level including the stack trace of
	 * the {@link Throwable} {@code t} passed as parameter.
	 * 
	 * @param message
	 *            the message to log.
	 * @param t
	 *            the exception to log, including its stack trace.
	 */
	public void verbose(final String message, final Throwable t) {
		logger.log(VERBOSE, message, t);
	}
	
	public void entering(String className, String methodName) {
		logger.log(Level.DEBUG, "Entering : " + className + " - " + methodName);
	}

	public void exiting(String className, String methodName) {
		logger.log(Level.DEBUG, "Exiting : " + className + " - " + className);
	}

	public void warning(String message) {

		logger.log(Level.WARN, message);
	}

	public void warning(String message, Throwable error) {
		logger.log(Level.WARN, message, error);

	}
	
	/**
	 * error
	 * 
	 * @param message
	 */
	@Override
	public void error(String message) {
		logger.log(Level.ERROR, message);
	}
	
	/**
	 * error
	 * 
	 * @param message
	 * @param error
	 */
	@Override
	public void error(String message, Throwable error) {
		logger.log(Level.ERROR, message, error);
	}
	
	/**
	 * fatal
	 * 
	 * @param message
	 */
	@Override
	public void fatal(String message) {
		logger.log(Level.FATAL, message);
	}
	
	/**
	 * fatal
	 * 
	 * @param message
	 * @param error
	 */
	@Override
	public void fatal(String message, Throwable error) {
		logger.log(Level.FATAL, message, error);
	}
	
	/**
	 * debug
	 * 
	 * @param message
	 */
	@Override
	public void debug(String message) {
		logger.log(Level.DEBUG, message);
	}
	
	/**
	 * info
	 * 
	 * @param message
	 */
	@Override
	public void info(String message) {
		logger.log(Level.INFO, message);
	}

}
