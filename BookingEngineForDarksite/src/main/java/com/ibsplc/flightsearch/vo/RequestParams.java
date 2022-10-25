package com.ibsplc.flightsearch.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestParams {
	
	@JsonProperty("APPV")
	private String appv;
	@JsonProperty("MRCVI")
	private String mrcvi;
	@JsonProperty("LANGUAGE")
	private String language;
	@JsonProperty("COUNTRY_SITE")
	private String country_site;
	@JsonProperty("TRIP_TYPE")
	private String trip_type;
	@JsonProperty("B_LOCATION_1")
	private String b_location_1;
	@JsonProperty(value="B_LOCATION_2",required=false)
	private String b_location_2;
	@JsonProperty(value="E_LOCATION_1",required=false)
	private String e_location_1;
	@JsonProperty(value="E_LOCATION_2",required=false)
	private String e_location_2;
	@JsonProperty("B_DATE_1")
	private String b_date_1;
	@JsonProperty(value="B_DATE_2",required=false)
	private String b_date_2;
	@JsonProperty("COMMERCIAL_FARE_FAMILY_1")
	private String commercial_fare_family_1;
	@JsonProperty(value="CABIN_CLASS",required=false)
	private String cabin_class;
	@JsonProperty(value="CABIN",required=false)
	private String cabin;
	@JsonProperty(value="DATE_RANGE_VALUE_1",required=false)
	private String date_range_value_1;
	@JsonProperty(value="DATE_RANGE_VALUE_2",required=false)
	private String date_range_value_2;
	@JsonProperty(value="DATE_RANGE_QUALIFIER_1",required=false)
	private String date_range_qualifier_1;
	@JsonProperty(value="DATE_RANGE_QUALIFIER_2",required=false)
	private String date_range_qualifier_2;
	
	@JsonProperty(value="TRAVELLER_TYPE_1",required=true)
	private String traveller_type_1;
	@JsonProperty(value="TRAVELLER_TYPE_2",required=false)
	private String traveller_type_2;
	@JsonProperty(value="TRAVELLER_TYPE_3",required=false)
	private String traveller_type_3;
	@JsonProperty(value="TRAVELLER_TYPE_4",required=false)
	private String traveller_type_4;
	@JsonProperty(value="TRAVELLER_TYPE_5",required=false)
	private String traveller_type_5;
	@JsonProperty(value="TRAVELLER_TYPE_6",required=false)
	private String traveller_type_6;
	@JsonProperty(value="TRAVELLER_TYPE_7",required=false)
	private String traveller_type_7;
	@JsonProperty(value="TRAVELLER_TYPE_8",required=false)
	private String traveller_type_8;
	@JsonProperty(value="TRAVELLER_TYPE_9",required=false)
	private String traveller_type_9;
	
	@JsonProperty(value="HAS_INFANT_1",required=false)
	private String has_infant_1;
	@JsonProperty(value="HAS_INFANT_2",required=false)
	private String has_infant_2;
	@JsonProperty(value="HAS_INFANT_3",required=false)
	private String has_infant_3;
	@JsonProperty(value="HAS_INFANT_4",required=false)
	private String has_infant_4;
	@JsonProperty(value="HAS_INFANT_5",required=false)
	private String has_infant_5;
	@JsonProperty(value="HAS_INFANT_6",required=false)
	private String has_infant_6;
	@JsonProperty(value="HAS_INFANT_7",required=false)
	private String has_infant_7;
	@JsonProperty(value="HAS_INFANT_8",required=false)
	private String has_infant_8;
	
	
	@JsonProperty(value="LIST_CORPORATE_NUMBER_1_1",required=false)
	private String list_corporate_number_1_1;
	
	//Parameters needed for multicity request -- start
	
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
	
	//Parameters needed for multicity request -- end
	
	
	public String getAppv() {
		return appv;
	}
	public void setAppv(String appv) {
		this.appv = appv;
	}
	public String getMrcvi() {
		return mrcvi;
	}
	public void setMrcvi(String mrcvi) {
		this.mrcvi = mrcvi;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry_site() {
		return country_site;
	}
	public void setCountry_site(String country_site) {
		this.country_site = country_site;
	}
	public String getTrip_type() {
		return trip_type;
	}
	public void setTrip_type(String trip_type) {
		this.trip_type = trip_type;
	}
	public String getB_location_1() {
		return b_location_1;
	}
	public void setB_location_1(String b_location_1) {
		this.b_location_1 = b_location_1;
	}
	public String getB_location_2() {
		return b_location_2;
	}
	public void setB_location_2(String b_location_2) {
		this.b_location_2 = b_location_2;
	}
	public String getE_location_1() {
		return e_location_1;
	}
	public void setE_location_1(String e_location_1) {
		this.e_location_1 = e_location_1;
	}
	public String getE_location_2() {
		return e_location_2;
	}
	public void setE_location_2(String e_location_2) {
		this.e_location_2 = e_location_2;
	}
	public String getB_date_1() {
		return b_date_1;
	}
	public void setB_date_1(String b_date_1) {
		this.b_date_1 = b_date_1;
	}
	public String getB_date_2() {
		return b_date_2;
	}
	public void setB_date_2(String b_date_2) {
		this.b_date_2 = b_date_2;
	}
	public String getCommercial_fare_family_1() {
		return commercial_fare_family_1;
	}
	public void setCommercial_fare_family_1(String commercial_fare_family_1) {
		this.commercial_fare_family_1 = commercial_fare_family_1;
	}
	public String getCabin_class() {
		return cabin_class;
	}
	public void setCabin_class(String cabin_class) {
		this.cabin_class = cabin_class;
	}
	public String getDate_range_value_1() {
		return date_range_value_1;
	}
	public void setDate_range_value_1(String date_range_value_1) {
		this.date_range_value_1 = date_range_value_1;
	}
	public String getDate_range_value_2() {
		return date_range_value_2;
	}
	public void setDate_range_value_2(String date_range_value_2) {
		this.date_range_value_2 = date_range_value_2;
	}
	public String getDate_range_qualifier_1() {
		return date_range_qualifier_1;
	}
	public void setDate_range_qualifier_1(String date_range_qualifier_1) {
		this.date_range_qualifier_1 = date_range_qualifier_1;
	}
	public String getDate_range_qualifier_2() {
		return date_range_qualifier_2;
	}
	public void setDate_range_qualifier_2(String date_range_qualifier_2) {
		this.date_range_qualifier_2 = date_range_qualifier_2;
	}
	public String getTraveller_type_1() {
		return traveller_type_1;
	}
	public void setTraveller_type_1(String traveller_type_1) {
		this.traveller_type_1 = traveller_type_1;
	}
	public String getTraveller_type_2() {
		return traveller_type_2;
	}
	public void setTraveller_type_2(String traveller_type_2) {
		this.traveller_type_2 = traveller_type_2;
	}
	public String getTraveller_type_3() {
		return traveller_type_3;
	}
	public void setTraveller_type_3(String traveller_type_3) {
		this.traveller_type_3 = traveller_type_3;
	}
	public String getTraveller_type_4() {
		return traveller_type_4;
	}
	public void setTraveller_type_4(String traveller_type_4) {
		this.traveller_type_4 = traveller_type_4;
	}
	public String getHas_infant_1() {
		return has_infant_1;
	}
	public void setHas_infant_1(String has_infant_1) {
		this.has_infant_1 = has_infant_1;
	}
	public String getHas_infant_2() {
		return has_infant_2;
	}
	public void setHas_infant_2(String has_infant_2) {
		this.has_infant_2 = has_infant_2;
	}
	public String getList_corporate_number_1_1() {
		return list_corporate_number_1_1;
	}
	public void setList_corporate_number_1_1(String list_corporate_number_1_1) {
		this.list_corporate_number_1_1 = list_corporate_number_1_1;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getTraveller_type_5() {
		return traveller_type_5;
	}
	public void setTraveller_type_5(String traveller_type_5) {
		this.traveller_type_5 = traveller_type_5;
	}
	public String getTraveller_type_6() {
		return traveller_type_6;
	}
	public void setTraveller_type_6(String traveller_type_6) {
		this.traveller_type_6 = traveller_type_6;
	}
	public String getTraveller_type_7() {
		return traveller_type_7;
	}
	public void setTraveller_type_7(String traveller_type_7) {
		this.traveller_type_7 = traveller_type_7;
	}
	public String getTraveller_type_8() {
		return traveller_type_8;
	}
	public void setTraveller_type_8(String traveller_type_8) {
		this.traveller_type_8 = traveller_type_8;
	}
	public String getTraveller_type_9() {
		return traveller_type_9;
	}
	public void setTraveller_type_9(String traveller_type_9) {
		this.traveller_type_9 = traveller_type_9;
	}

	
	//Methods needed for multicity request -- start
	
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
	public String getHas_infant_3() {
		return has_infant_3;
	}
	public void setHas_infant_3(String has_infant_3) {
		this.has_infant_3 = has_infant_3;
	}
	public String getHas_infant_4() {
		return has_infant_4;
	}
	public void setHas_infant_4(String has_infant_4) {
		this.has_infant_4 = has_infant_4;
	}
	public String getHas_infant_5() {
		return has_infant_5;
	}
	public void setHas_infant_5(String has_infant_5) {
		this.has_infant_5 = has_infant_5;
	}
	public String getHas_infant_6() {
		return has_infant_6;
	}
	public void setHas_infant_6(String has_infant_6) {
		this.has_infant_6 = has_infant_6;
	}
	public String getHas_infant_7() {
		return has_infant_7;
	}
	public void setHas_infant_7(String has_infant_7) {
		this.has_infant_7 = has_infant_7;
	}
	public String getHas_infant_8() {
		return has_infant_8;
	}
	public void setHas_infant_8(String has_infant_8) {
		this.has_infant_8 = has_infant_8;
	}
	
	
	
	//Methods needed for multicity request -- end


}
