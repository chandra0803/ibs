package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

public class ParameterMasterVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String masterCode;
	private String masterDescription;
	private String value;
	private String otherLanguageDescription;
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
	 * @return the otherLanguageDescription
	 */
	public String getOtherLanguageDescription() {
		return otherLanguageDescription;
	}
	/**
	 * @param otherLanguageDescription the otherLanguageDescription to set
	 */
	public void setOtherLanguageDescription(String otherLanguageDescription) {
		this.otherLanguageDescription = otherLanguageDescription;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ParameterMasterVO [masterCode=" + masterCode + ", masterDescription=" + masterDescription + ", value="
				+ value + ", otherLanguageDescription=" + otherLanguageDescription + "]";
	}
	
	

}
