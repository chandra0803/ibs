package com.ibsplc.amadeus.vo;

import java.math.BigInteger;

public class EndDateTimeVO extends AbstractVO {
  private String year;
  private BigInteger month;
  private BigInteger day;
  private BigInteger hour;
  private BigInteger minutes;
  
  
/**
 * @return the year
 */
public String getYear() {
	return year;
}
/**
 * @param year the year to set
 */
public void setYear(String year) {
	this.year = year;
}
/**
 * @return the month
 */
public BigInteger getMonth() {
	return month;
}
/**
 * @param month the month to set
 */
public void setMonth(BigInteger month) {
	this.month = month;
}
/**
 * @return the day
 */
public BigInteger getDay() {
	return day;
}
/**
 * @param day the day to set
 */
public void setDay(BigInteger day) {
	this.day = day;
}
/**
 * @return the hour
 */
public BigInteger getHour() {
	return hour;
}
/**
 * @param hour the hour to set
 */
public void setHour(BigInteger hour) {
	this.hour = hour;
}
/**
 * @return the minutes
 */
public BigInteger getMinutes() {
	return minutes;
}
/**
 * @param minutes the minutes to set
 */
public void setMinutes(BigInteger minutes) {
	this.minutes = minutes;
} 
 
  
}
