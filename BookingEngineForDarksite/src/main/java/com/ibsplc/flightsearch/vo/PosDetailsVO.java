package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

public class PosDetailsVO implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	 
	private String regionCode;
	private String countryCode;
	private String countryDesc;
	private String lang;
	private String activeIndicator;
	private String cityCode;
	private String posType;
	private String currency;
	
	/*
	 * amadeus Point of sale
	 */
	private String amadeusPos;
	
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}		 
	/**
	 * @return the regionCode
	 */
	public String getRegionCode() {
		return regionCode;
	}
	/**
	 * @param regionCode the regionCode to set
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	
	
	
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the countryDesc
	 */
	public String getCountryDesc() {
		return countryDesc;
	}
	/**
	 * @param countryDesc the countryDesc to set
	 */
	public void setCountryDesc(String countryDesc) {
		this.countryDesc = countryDesc;
	}
	/**
	 * @return the activeIndicator
	 */
	public String getActiveIndicator() {
		return activeIndicator;
	}
	/**
	 * @param activeIndicator the activeIndicator to set
	 */
	public void setActiveIndicator(String activeIndicator) {
		this.activeIndicator = activeIndicator;
	}
	/**
	 * @return the posType
	 */
	public String getPosType() {
		return posType;
	}
	/**
	 * @param posType the posType to set
	 */
	public void setPosType(String posType) {
		this.posType = posType;
	}
	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}
	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}
	 
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmadeusPos() {
		return amadeusPos;
	}
	public void setAmadeusPos(String amadeusPos) {
		this.amadeusPos = amadeusPos;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PosDetailsVO [regionCode=" + regionCode + ", countryCode=" + countryCode + ", countryDesc="
				+ countryDesc + ", lang=" + lang + ", activeIndicator=" + activeIndicator + ", cityCode=" + cityCode
				+ ", posType=" + posType + ", currency=" + currency + ", amadeusPos=" + amadeusPos + "]";
	}
	 
	
}