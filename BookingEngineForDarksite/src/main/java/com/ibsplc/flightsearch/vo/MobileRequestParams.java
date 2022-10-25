package com.ibsplc.flightsearch.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MobileRequestParams {
	
	@JsonProperty("APPV")
	private String appv;
	@JsonProperty("MRCVA")
	private String mrcva;
	@JsonProperty("TRIP_TYPE")
	private String tripType;
	@JsonProperty("COUNTRY_SITE")
	private String countrySite;
	@JsonProperty(value="CABIN_CLASS",required=false)
	private String cabinClass;
	@JsonProperty(value="CABIN",required=false)
	private String cabin;
	@JsonProperty("LANGUAGE")
	private String language;
	@JsonProperty("TRAVELLER_TYPE_1")
	private String travellerType1;
	@JsonProperty(value="TRAVELLER_TYPE_2",required=false)
	private String travellerType2;
	@JsonProperty(value="TRAVELLER_TYPE_3",required=false)
	private String travellerType3;
	@JsonProperty(value="TRAVELLER_TYPE_4",required=false)
	private String travellerType4;
	@JsonProperty(value="TRAVELLER_TYPE_5",required=false)
	private String travellerType5;
	@JsonProperty(value="TRAVELLER_TYPE_6",required=false)
	private String travellerType6;
	@JsonProperty(value="TRAVELLER_TYPE_7",required=false)
	private String travellerType7;
	@JsonProperty(value="TRAVELLER_TYPE_8",required=false)
	private String travellerType8;
	@JsonProperty(value="TRAVELLER_TYPE_9",required=false)
	private String travellerType9;
	@JsonProperty(value="HAS_INFANT_1",required=false)
	private String hasInfant1;
	@JsonProperty(value="HAS_INFANT_2",required=false)
	private String hasInfant2;
	@JsonProperty("DATE_RANGE_VALUE_1")
	private String dateRangeValue1;
	@JsonProperty("DATE_RANGE_QUALIFIER_1")
	private String dateRangeQualifier1;
	@JsonProperty("B_DATE_1")
	private String bDate1;
	@JsonProperty(value="B_DATE_2",required=false)
	private String bDate2;
	@JsonProperty(value="B_DATE_3",required=false)
	private String bDate3;
	@JsonProperty(value="B_DATE_4",required=false)
	private String bDate4;
	@JsonProperty(value="B_DATE_5",required=false)
	private String bDate5;
	@JsonProperty(value="B_DATE_6",required=false)
	private String bDate6;
	@JsonProperty(value="B_DATE_7",required=false)
	private String bDate7;
	@JsonProperty("B_LOCATION_1")
	private String bLocation1;
	@JsonProperty(value="B_LOCATION_2",required=false)
	private String bLocation2;
	@JsonProperty(value="B_LOCATION_3",required=false)
	private String bLocation3;
	@JsonProperty(value="B_LOCATION_4",required=false)
	private String bLocation4;
	@JsonProperty(value="B_LOCATION_5",required=false)
	private String bLocation5;
	@JsonProperty(value="B_LOCATION_6",required=false)
	private String bLocation6;
	@JsonProperty(value="B_LOCATION_7",required=false)
	private String bLocation7;
	@JsonProperty("E_LOCATION_1")
	private String eLocation1;
	@JsonProperty(value="E_LOCATION_2",required=false)
	private String eLocation2;
	@JsonProperty(value="E_LOCATION_3",required=false)
	private String eLocation3;
	@JsonProperty(value="E_LOCATION_4",required=false)
	private String eLocation4;
	@JsonProperty(value="E_LOCATION_5",required=false)
	private String eLocation5;
	@JsonProperty(value="E_LOCATION_6",required=false)
	private String eLocation6;
	@JsonProperty(value="E_LOCATION_7",required=false)
	private String eLocation7;
	public String getAppv() {
		return appv;
	}
	public void setAppv(String appv) {
		this.appv = appv;
	}
	public String getMrcva() {
		return mrcva;
	}
	public void setMrcva(String mrcva) {
		this.mrcva = mrcva;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	public String getCountrySite() {
		return countrySite;
	}
	public void setCountrySite(String countrySite) {
		this.countrySite = countrySite;
	}
	public String getCabinClass() {
		return cabinClass;
	}
	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getTravellerType1() {
		return travellerType1;
	}
	public void setTravellerType1(String travellerType1) {
		this.travellerType1 = travellerType1;
	}
	public String getTravellerType2() {
		return travellerType2;
	}
	public void setTravellerType2(String travellerType2) {
		this.travellerType2 = travellerType2;
	}
	public String getTravellerType3() {
		return travellerType3;
	}
	public void setTravellerType3(String travellerType3) {
		this.travellerType3 = travellerType3;
	}
	public String getTravellerType4() {
		return travellerType4;
	}
	public void setTravellerType4(String travellerType4) {
		this.travellerType4 = travellerType4;
	}
	public String getTravellerType5() {
		return travellerType5;
	}
	public void setTravellerType5(String travellerType5) {
		this.travellerType5 = travellerType5;
	}
	public String getTravellerType6() {
		return travellerType6;
	}
	public void setTravellerType6(String travellerType6) {
		this.travellerType6 = travellerType6;
	}
	public String getTravellerType7() {
		return travellerType7;
	}
	public void setTravellerType7(String travellerType7) {
		this.travellerType7 = travellerType7;
	}
	public String getTravellerType8() {
		return travellerType8;
	}
	public void setTravellerType8(String travellerType8) {
		this.travellerType8 = travellerType8;
	}
	public String getTravellerType9() {
		return travellerType9;
	}
	public void setTravellerType9(String travellerType9) {
		this.travellerType9 = travellerType9;
	}
	public String getHasInfant1() {
		return hasInfant1;
	}
	public void setHasInfant1(String hasInfant1) {
		this.hasInfant1 = hasInfant1;
	}
	public String getHasInfant2() {
		return hasInfant2;
	}
	public void setHasInfant2(String hasInfant2) {
		this.hasInfant2 = hasInfant2;
	}
	public String getDateRangeValue1() {
		return dateRangeValue1;
	}
	public void setDateRangeValue1(String dateRangeValue1) {
		this.dateRangeValue1 = dateRangeValue1;
	}
	public String getDateRangeQualifier1() {
		return dateRangeQualifier1;
	}
	public void setDateRangeQualifier1(String dateRangeQualifier1) {
		this.dateRangeQualifier1 = dateRangeQualifier1;
	}
	public String getbDate1() {
		return bDate1;
	}
	public void setbDate1(String bDate1) {
		this.bDate1 = bDate1;
	}
	public String getbDate2() {
		return bDate2;
	}
	public void setbDate2(String bDate2) {
		this.bDate2 = bDate2;
	}
	public String getbDate3() {
		return bDate3;
	}
	public void setbDate3(String bDate3) {
		this.bDate3 = bDate3;
	}
	public String getbDate4() {
		return bDate4;
	}
	public void setbDate4(String bDate4) {
		this.bDate4 = bDate4;
	}
	public String getbDate5() {
		return bDate5;
	}
	public void setbDate5(String bDate5) {
		this.bDate5 = bDate5;
	}
	public String getbDate6() {
		return bDate6;
	}
	public void setbDate6(String bDate6) {
		this.bDate6 = bDate6;
	}
	public String getbDate7() {
		return bDate7;
	}
	public void setbDate7(String bDate7) {
		this.bDate7 = bDate7;
	}
	public String getbLocation1() {
		return bLocation1;
	}
	public void setbLocation1(String bLocation1) {
		this.bLocation1 = bLocation1;
	}
	public String getbLocation2() {
		return bLocation2;
	}
	public void setbLocation2(String bLocation2) {
		this.bLocation2 = bLocation2;
	}
	public String getbLocation3() {
		return bLocation3;
	}
	public void setbLocation3(String bLocation3) {
		this.bLocation3 = bLocation3;
	}
	public String getbLocation4() {
		return bLocation4;
	}
	public void setbLocation4(String bLocation4) {
		this.bLocation4 = bLocation4;
	}
	public String getbLocation5() {
		return bLocation5;
	}
	public void setbLocation5(String bLocation5) {
		this.bLocation5 = bLocation5;
	}
	public String getbLocation6() {
		return bLocation6;
	}
	public void setbLocation6(String bLocation6) {
		this.bLocation6 = bLocation6;
	}
	public String getbLocation7() {
		return bLocation7;
	}
	public void setbLocation7(String bLocation7) {
		this.bLocation7 = bLocation7;
	}
	public String geteLocation1() {
		return eLocation1;
	}
	public void seteLocation1(String eLocation1) {
		this.eLocation1 = eLocation1;
	}
	public String geteLocation2() {
		return eLocation2;
	}
	public void seteLocation2(String eLocation2) {
		this.eLocation2 = eLocation2;
	}
	public String geteLocation3() {
		return eLocation3;
	}
	public void seteLocation3(String eLocation3) {
		this.eLocation3 = eLocation3;
	}
	public String geteLocation4() {
		return eLocation4;
	}
	public void seteLocation4(String eLocation4) {
		this.eLocation4 = eLocation4;
	}
	public String geteLocation5() {
		return eLocation5;
	}
	public void seteLocation5(String eLocation5) {
		this.eLocation5 = eLocation5;
	}
	public String geteLocation6() {
		return eLocation6;
	}
	public void seteLocation6(String eLocation6) {
		this.eLocation6 = eLocation6;
	}
	public String geteLocation7() {
		return eLocation7;
	}
	public void seteLocation7(String eLocation7) {
		this.eLocation7 = eLocation7;
	}

}
