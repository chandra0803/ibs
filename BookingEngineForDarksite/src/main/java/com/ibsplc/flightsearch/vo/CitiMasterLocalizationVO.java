package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

public class CitiMasterLocalizationVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cityCode;
	private String cityDescription;
	private String localization;
	private String airportDescription;
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
	 * @return the cityDescription
	 */
	public String getCityDescription() {
		return cityDescription;
	}
	/**
	 * @param cityDescription the cityDescription to set
	 */
	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CitiMasterLocalizationVO [cityCode=" + cityCode + ", cityDescription=" + cityDescription
				+ ", localization=" + localization + ", airportDescription=" + airportDescription + "]";
	}
	 
	

}
