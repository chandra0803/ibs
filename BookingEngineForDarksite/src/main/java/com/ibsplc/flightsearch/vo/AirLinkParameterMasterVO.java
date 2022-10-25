package com.ibsplc.flightsearch.vo;

import java.io.Serializable;
import java.math.BigInteger;

public class AirLinkParameterMasterVO  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String categoryNumber;
	private String masterNumber;
	private String masterCode;
	private String masterDescription;
	private String value;
	private String actInd;
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
	 * @return the masterCode
	 */
	public String getMasterCode() {
		return masterCode;
	}
	/**
	 * @param masterCode the masterCode to set
	 */
	public void setMasterCode(String masterCode) {
		this.masterCode = masterCode;
	}
	/**
	 * @return the masterDescription
	 */
	public String getMasterDescription() {
		return masterDescription;
	}
	/**
	 * @param masterDescription the masterDescription to set
	 */
	public void setMasterDescription(String masterDescription) {
		this.masterDescription = masterDescription;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AirLinkParameterMasterVO [categoryNumber=" + categoryNumber + ", masterNumber=" + masterNumber
				+ ", masterCode=" + masterCode + ", masterDescription=" + masterDescription + ", value=" + value
				+ ", actInd=" + actInd + "]";
	}
	

}
