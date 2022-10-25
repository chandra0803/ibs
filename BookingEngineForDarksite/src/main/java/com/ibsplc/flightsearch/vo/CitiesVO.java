package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CitiesVO implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * countryCode
	 */
	private String countryCode;
	
	
	/**
	 * cityCode
	 */	
	private String cityCode;
	
	/**
	 * cityDesciption
	 */
	private String cityDesciption;
	

	/**
	 * airportDescription
	 */
	private String airportDescription;

	/**
	 * longitude
	 */
	private String longitude;

	
	/**
	 * lattitude
	 */
	private String lattitude;

	
	/**
	 * localization
	 */
	private String localization;

	/**
	 * localization
	 */
	private String actInd;

	/**
	 * localization
	 */
	private String originIndicator;

	/**
	 * localization
	 */
	private String isLodgelink;
	
	/**
	 * fltStatus
	 */
	private String fltStatus;

	/**
	 * checkinStatus
	 */
	private String checkinStatus;
	
	
	/**
	 * isMultiCityEnable
	 */	
	private String isMultiCityEnable;
	
	

	/**
	 * countryDescription
	 */
	private String countryDescription;



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
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}



	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}



	/**
	 * @return the cityDesciption
	 */
	public String getCityDesciption() {
		return cityDesciption;
	}



	/**
	 * @param cityDesciption the cityDesciption to set
	 */
	public void setCityDesciption(String cityDesciption) {
		this.cityDesciption = cityDesciption;
	}



	/**
	 * @return the airportDescription
	 */
	public String getAirportDescription() {
		return airportDescription;
	}



	/**
	 * @param airportDescription the airportDescription to set
	 */
	public void setAirportDescription(String airportDescription) {
		this.airportDescription = airportDescription;
	}



	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}



	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	/**
	 * @return the lattitude
	 */
	public String getLattitude() {
		return lattitude;
	}



	/**
	 * @param lattitude the lattitude to set
	 */
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}



	/**
	 * @return the localization
	 */
	public String getLocalization() {
		return localization;
	}



	/**
	 * @param localization the localization to set
	 */
	public void setLocalization(String localization) {
		this.localization = localization;
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
	 * @return the originIndicator
	 */
	public String getOriginIndicator() {
		return originIndicator;
	}



	/**
	 * @param originIndicator the originIndicator to set
	 */
	public void setOriginIndicator(String originIndicator) {
		this.originIndicator = originIndicator;
	}



	/**
	 * @return the isLodgelink
	 */
	public String getIsLodgelink() {
		return isLodgelink;
	}



	/**
	 * @param isLodgelink the isLodgelink to set
	 */
	public void setIsLodgelink(String isLodgelink) {
		this.isLodgelink = isLodgelink;
	}



	/**
	 * @return the fltStatus
	 */
	public String getFltStatus() {
		return fltStatus;
	}



	/**
	 * @param fltStatus the fltStatus to set
	 */
	public void setFltStatus(String fltStatus) {
		this.fltStatus = fltStatus;
	}



	/**
	 * @return the checkinStatus
	 */
	public String getCheckinStatus() {
		return checkinStatus;
	}



	/**
	 * @param checkinStatus the checkinStatus to set
	 */
	public void setCheckinStatus(String checkinStatus) {
		this.checkinStatus = checkinStatus;
	}



	/**
	 * @return the isMultiCityEnable
	 */
	public String getIsMultiCityEnable() {
		return isMultiCityEnable;
	}



	/**
	 * @param isMultiCityEnable the isMultiCityEnable to set
	 */
	public void setIsMultiCityEnable(String isMultiCityEnable) {
		this.isMultiCityEnable = isMultiCityEnable;
	}



	/**
	 * @return the countryDescription
	 */
	public String getCountryDescription() {
		return countryDescription;
	}



	/**
	 * @param countryDescription the countryDescription to set
	 */
	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CitiesVO [countryCode=" + countryCode + ", cityCode=" + cityCode + ", cityDesciption=" + cityDesciption
				+ ", airportDescription=" + airportDescription + ", longitude=" + longitude + ", lattitude=" + lattitude
				+ ", localization=" + localization + ", actInd=" + actInd + ", originIndicator=" + originIndicator
				+ ", isLodgelink=" + isLodgelink + ", fltStatus=" + fltStatus + ", checkinStatus=" + checkinStatus
				+ ", isMultiCityEnable=" + isMultiCityEnable + ", countryDescription=" + countryDescription + "]";
	}
	 
		
}

