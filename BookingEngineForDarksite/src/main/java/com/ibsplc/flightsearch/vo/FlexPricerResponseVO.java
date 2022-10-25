package com.ibsplc.flightsearch.vo;
/**
 * @author A-6620
 *
 */
public class FlexPricerResponseVO {
	
	/**
	 * Trip Type
	 */
	private String tripType;
	/**
	 * departure city
	 */
	private String departureCity;	
	/**
	 * destination city
	 */
	private String destinationCity;
	/**
	 * Departure Date
	 */
	private String departureDate;
	/**
	 * return Date
	 */
	private String returnDate;
	/**
	 * adultCount
	 */
	private String adultCount;
	/* A-10083 - on 17/02/2022 */
	/**
	 * youngadultCount
	 */
	private String youngAdultCount;
	/**
	 * childCount
	 */
	private String childCount;
	/**
	 * infantCount
	 */
	private String infantCount;
	/**
	 * cabinClass
	 */
	private String cabinClass;
	/**
	 * promoCode
	 */
	private String promoCode;
	/**
	 * added to redirect to foa when amadeus session out happens
	 */
	private String redirectUrl;
	
	/**
	 * @return tripType
	 */
	public String getTripType() {
		return tripType;
	}
	/**
	 * @param tripType
	 */
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	/**
	 * @return departureCity
	 */
	public String getDepartureCity() {
		return departureCity;
	}
	/**
	 * @param departureCity
	 */
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	/**
	 * @return
	 */
	public String getDestinationCity() {
		return destinationCity;
	}
	/**
	 * @param destinationCity
	 */
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	/**
	 * @return
	 */
	public String getDepartureDate() {
		return departureDate;
	}
	/**
	 * @param departureDate
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	/**
	 * @return
	 */
	public String getReturnDate() {
		return returnDate;
	}
	/**
	 * @param returnDate
	 */
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	/* A-10083  - on 17/02/2022 */
	/**
	 * @return
	 */
	public String getYoungAdultCount() {
		return youngAdultCount;
	}
	/**
	 * @param youngAdultCount
	 */
	public void setYoungAdultCount(String youngAdultCount) {
		this.youngAdultCount = youngAdultCount;
	}
	/**
	 * @return
	 */
	public String getAdultCount() {
		return adultCount;
	}
	/**
	 * @param adultCount
	 */
	public void setAdultCount(String adultCount) {
		this.adultCount = adultCount;
	}
	/**
	 * @return
	 */
	public String getChildCount() {
		return childCount;
	}
	/**
	 * @param childCount
	 */
	public void setChildCount(String childCount) {
		this.childCount = childCount;
	}
	/**
	 * @return
	 */
	public String getInfantCount() {
		return infantCount;
	}
	/**
	 * @param infantCount
	 */
	public void setInfantCount(String infantCount) {
		this.infantCount = infantCount;
	}
	/**
	 * @return
	 */
	public String getCabinClass() {
		return cabinClass;
	}
	/**
	 * @param cabinClass
	 */
	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}
	/**
	 * @return promoCode
	 */
	public String getPromoCode() {
		return promoCode;
	}
	/**
	 * @param promoCode
	 */
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	
	

}
