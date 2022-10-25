package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

public class AmadeusLanguageCodeVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String AmadeusLangCode;
	private String languageId;
	private String masterNumber;
	private String masterCode;
	private String amadeusLangDesc;
	
	
	/**
	 * @return the amadeusLangCode
	 */
	public String getAmadeusLangCode() {
		return AmadeusLangCode;
	}
	/**
	 * @param amadeusLangCode the amadeusLangCode to set
	 */
	public void setAmadeusLangCode(String amadeusLangCode) {
		AmadeusLangCode = amadeusLangCode;
	}
	/**
	 * @return the languade_id
	 */
	 
	
	
	/**
	 * @return the masterNumber
	 */
	public  String getMasterNumber() {
		return masterNumber;
	}
	/**
	 * @return the languageId
	 */
	public String getLanguageId() {
		return languageId;
	}
	/**
	 * @param languageId the languageId to set
	 */
	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}
	/**
	 * @param masterNumber the masterNumber to set
	 */
	public void setMasterNumber( String masterNumber) {
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
	 * @return the amadeusLangDesc
	 */
	public String getAmadeusLangDesc() {
		return amadeusLangDesc;
	}
	/**
	 * @param amadeusLangDesc the amadeusLangDesc to set
	 */
	public void setAmadeusLangDesc(String amadeusLangDesc) {
		this.amadeusLangDesc = amadeusLangDesc;
	}
	

}
