package com.ibsplc.flightsearch.vo;

import java.util.List;

/**
 * @author A-6620
 *
 */
public class FlightSearchVO extends FlightSearchRequestVO {
	
	private static final long serialVersionUID = 1L;

	private String departureCountry;
	private String posCity;
	private String posCountry;
	private Boolean isPreSeatingAllowedForPos;
	private String masterCode;
	private String masterDescription;
	private String value;
	private String otherLanguageDescription;
	private String flexConfigName;
	
	private boolean isDomesticFlight;
	private boolean isFlexiDomesticFlight;
	private boolean isRegionalFlight;
	private String currency;
	//private boolean threeDsecuredEnabled;
	private String isRouteOperational;
	private String basePspURL;
	private List<ParameterMasterVO> paymentOptions;
	private Boolean isMonthsBetweenValid;
	//HD-316604 -Removing 'Redirect to SAA' and '4Z live date' in admin tool by A-10261
	//private String effectiveDate;
	private Boolean isRedirectedToSAA;
	//HD-316604 ends
	private Boolean isTripEligible;
	
	//Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request Parameter -- start
	
	private String isAirlinkEnabledRoute;
	
	public String getIsAirlinkEnabledRoute() {
		return isAirlinkEnabledRoute;
	}

	public void setIsAirlinkEnabledRoute(String isAirlinkEnabledRoute) {
		this.isAirlinkEnabledRoute = isAirlinkEnabledRoute;
	}
	
	//Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request Parameter -- end
	
	//Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request Parameter -- start
	private String isDirectTripEnabledRoute;
	
	
	public String getIsDirectTripEnabledRoute() {
		return isDirectTripEnabledRoute;
	}

	public void setIsDirectTripEnabledRoute(String isDirectTripEnabledRoute) {
		this.isDirectTripEnabledRoute = isDirectTripEnabledRoute;
	}
	
	//Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request Parameter -- End

	public String getBasePspURL() {
		return basePspURL;
	}
	public void setBasePspURL(String basePspURL) {
		this.basePspURL = basePspURL;
	}
	/**
	 * @return posCity
	 */
	public String getPosCity() {
		return posCity;
	}

	public void setPosCity(String posCity) {
		this.posCity = posCity;
	}

	public String getMasterCode() {
		return masterCode;
	}

	public void setMasterCode(String masterCode) {
		this.masterCode = masterCode;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getFlexConfigName() {
		return flexConfigName;
	}

	public void setFlexConfigName(String flexConfigName) {
		this.flexConfigName = flexConfigName;
	}

	public Boolean getIsPreSeatingAllowedForPos() {
		return isPreSeatingAllowedForPos;
	}

	public void setIsPreSeatingAllowedForPos(Boolean isPreSeatingAllowedForPos) {
		this.isPreSeatingAllowedForPos = isPreSeatingAllowedForPos;
	}

	public Boolean IsRedirectedToSAA() {
		return isRedirectedToSAA;
	}

	public void setIsRedirectedToSAA(Boolean isRedirectedToSAA) {
		this.isRedirectedToSAA = isRedirectedToSAA;
	}

	public String getMasterDescription() {
		return masterDescription;
	}

	public void setMasterDescription(String masterDescription) {
		this.masterDescription = masterDescription;
	}

	public String getOtherLanguageDescription() {
		return otherLanguageDescription;
	}

	public void setOtherLanguageDescription(String otherLanguageDescription) {
		this.otherLanguageDescription = otherLanguageDescription;
	}
	public boolean isDomesticFlight() {
		return isDomesticFlight;
	}

	public void setDomesticFlight(boolean isDomesticFlight) {
		this.isDomesticFlight = isDomesticFlight;
	}

	public boolean isFlexiDomesticFlight() {
		return isFlexiDomesticFlight;
	}

	public void setFlexiDomesticFlight(boolean isFlexiDomesticFlight) {
		this.isFlexiDomesticFlight = isFlexiDomesticFlight;
	}

	public boolean isRegionalFlight() {
		return isRegionalFlight;
	}

	public void setRegionalFlight(boolean isRegionalFlight) {
		this.isRegionalFlight = isRegionalFlight;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDepartureCountry() {
		return departureCountry;
	}

	public void setDepartureCountry(String departureCountry) {
		this.departureCountry = departureCountry;
	}

	public String getPosCountry() {
		return posCountry;
	}

	public void setPosCountry(String posCountry) {
		this.posCountry = posCountry;
	}
	
	/*
	 * Commented on A-8986 -- start
	 * 
	public boolean isThreeDsecuredEnabled() {
		return threeDsecuredEnabled;
	}

	public void setThreeDsecuredEnabled(boolean threeDsecuredEnabled) {
		this.threeDsecuredEnabled = threeDsecuredEnabled;
	}
	*
	*Commented on A-8986 -- end
	*/
	
	public List<ParameterMasterVO> getPaymentOptions() {
		return paymentOptions;
	}
	
	public void setPaymentOptions(List<ParameterMasterVO> paymentOptions) {
		this.paymentOptions = paymentOptions;
	}
	public Boolean getIsMonthsBetweenValid() {
		return isMonthsBetweenValid;
	}
	public void setIsMonthsBetweenValid(Boolean isMonthsBetweenValid) {
		this.isMonthsBetweenValid = isMonthsBetweenValid;
	}
	//HD-316604 -Removing 'Redirect to SAA' and '4Z live date' in admin tool by A-10261
	/*public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}*/
	//HD-316604 ends
	public Boolean getIsTripEligible() {
		return isTripEligible;
	}
	public void setIsTripEligible(Boolean isTripEligible) {
		this.isTripEligible = isTripEligible;
	}
	
	public Boolean getIsRedirectedToSAA() {
		return isRedirectedToSAA;
	}
	
	
	
	/*
	 *Added on 08/09/2020 -- start 
	 */
	public String isRouteOperational() {
		return isRouteOperational;
	}
	public void setIsRouteOperational(String isRouteOperational) {
		this.isRouteOperational = isRouteOperational;
	}
	/*
	 * Added on 08/09/2020 -- end
	 */

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightSearchVO [departureCountry=" + departureCountry + ", posCity=" + posCity + ", posCountry="
				+ posCountry + ", isPreSeatingAllowedForPos=" + isPreSeatingAllowedForPos + ", masterCode=" + masterCode
				+ ", masterDescription=" + masterDescription + ", value=" + value + ", otherLanguageDescription="
				+ otherLanguageDescription + ", flexConfigName=" + flexConfigName + ", isDomesticFlight="
				+ isDomesticFlight + ", isFlexiDomesticFlight=" + isFlexiDomesticFlight + ", isRegionalFlight="
				+ isRegionalFlight + ", currency=" + currency + ", isRouteOperational=" + isRouteOperational
				+ ", basePspURL=" + basePspURL + ", paymentOptions=" + paymentOptions + ", isMonthsBetweenValid="
				+ isMonthsBetweenValid + ", isRedirectedToSAA=" + isRedirectedToSAA + ", isTripEligible="
				+ isTripEligible + ", isAirlinkEnabledRoute=" + isAirlinkEnabledRoute + ", isDirectTripEnabledRoute="
				+ isDirectTripEnabledRoute + "]";
	}
	 
	
}
