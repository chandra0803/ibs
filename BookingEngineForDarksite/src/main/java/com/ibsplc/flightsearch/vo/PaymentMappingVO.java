package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

public class PaymentMappingVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String posId;
	private String categoryNumber;
	private String masterNumber;
	private String  hours;
	private String actInd;
	private String fpValue;
	
	
	/**
	 * @return the posId
	 */
	public String getPosId() {
		return posId;
	}
	/**
	 * @param posId the posId to set
	 */
	public void setPosId(String posId) {
		this.posId = posId;
	}
	/**
	 * @return the categoryNumber
	 */
	public String getCategoryNumber() {
		return categoryNumber;
	}
	/**
	 * @param categoryNumber the categoryNumber to set
	 */
	public void setCategoryNumber(String categoryNumber) {
		this.categoryNumber = categoryNumber;
	}
	/**
	 * @return the masterNumber
	 */
	public String getMasterNumber() {
		return masterNumber;
	}
	/**
	 * @param masterNumber the masterNumber to set
	 */
	public void setMasterNumber(String masterNumber) {
		this.masterNumber = masterNumber;
	}
	/**
	 * @return the hours
	 */
	public String getHours() {
		return hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(String hours) {
		this.hours = hours;
	}
	/**
	 * @return the actInd
	 */
	public String getActInd() {
		return actInd;
	}
	/**
	 * @param actInd the actInd to set
	 */
	public void setActInd(String actInd) {
		this.actInd = actInd;
	}
	/**
	 * @return the fpValue
	 */
	public String getFpValue() {
		return fpValue;
	}
	/**
	 * @param fpValue the fpValue to set
	 */
	public void setFpValue(String fpValue) {
		this.fpValue = fpValue;
	}


}
