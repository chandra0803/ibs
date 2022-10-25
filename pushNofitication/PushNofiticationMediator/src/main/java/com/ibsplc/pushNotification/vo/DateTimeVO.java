package com.ibsplc.pushNotification.vo;

import java.math.BigInteger;

/**
 * @author A-6620
 *
 */
public class DateTimeVO {
	
	/**
	 * year
	 */
	private String year;
	
	/**
	 * month
	 */
	private String month;
	
	/**
	 * day
	 */
	private String day;
	
	/**
	 * hour
	 */
	private String hour;
	
	/**
	 * minutes
	 */
	private String minutes;
	
	/**
	 * seconds in BigInteger
	 */
	private BigInteger seconds;

	/**
	 * @return year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * @param month
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * @return
	 */
	public String getDay() {
		return day;
	}

	/**
	 * @param day
	 */
	public void setDay(String day) {
		this.day = day;
	}

	/**
	 * @return hour
	 */
	public String getHour() {
		return hour;
	}

	/**
	 * @param hour
	 */
	public void setHour(String hour) {
		this.hour = hour;
	}

	/**
	 * @return minutes
	 */
	public String getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes
	 */
	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	/**
	 * @return seconds in BigInteger
	 */
	public BigInteger getSeconds() {
		return seconds;
	}

	/**
	 * @param seconds
	 */
	public void setSeconds(BigInteger seconds) {
		this.seconds = seconds;
	}

}
