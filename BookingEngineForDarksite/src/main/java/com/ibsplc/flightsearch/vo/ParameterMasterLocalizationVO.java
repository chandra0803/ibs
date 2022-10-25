package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

public class ParameterMasterLocalizationVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String masterNumber;
	private String masterDescription;
	private String language;
	
	
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
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
 

}
