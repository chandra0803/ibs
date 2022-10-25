package com.ibsplc.pushNotification.vo;

import java.util.List;

/**
 * @author A-6620
 *
 */
public class FlightTimesVO {

	/**
	 * businessSemantic
	 */
	private String businessSemantic;
	
	/**
	 * timeMode
	 * Indicate if the time is expressed in UTC or in local time mode(U/L)
	 * In this case is always L
	 */
	private String timeMode;
	
	/**
	 * dateTime
	 */
	private List<DateTimeVO> dateTime;
	
	/**
	 * @return businessSemantic
	 */
	public String getBusinessSemantic() {
		return businessSemantic;
	}

	/**
	 * @param businessSemantic
	 */
	public void setBusinessSemantic(String businessSemantic) {
		this.businessSemantic = businessSemantic;
	}

	/**
	 * @return timeMode
	 * 
	 */
	public String getTimeMode() {
		return timeMode;
	}

	/**
	 * @param timeMode
	 */
	public void setTimeMode(String timeMode) {
		this.timeMode = timeMode;
	}

	/**
	 * @return dateTime as list
	 */
	public List<DateTimeVO> getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime
	 */
	public void setDateTime(List<DateTimeVO> dateTime) {
		this.dateTime = dateTime;
	}

}
