package com.ibsplc.flightsearch.vo;
 
import com.ibsplc.common.vo.CommonRequestParametersVO;

/**
 * @author A-6620
 *
 */
public class FlightSearchRequestVO extends CommonRequestParametersVO {
	
	private static final long serialVersionUID = 1L;
 
	private String country;	
	private String language;
	private String product;
	private String isMobileDevice;
	private String tripType;
	private String departureCity;	 
	private String destinationCity;	 
	private String departureDate;
	private String returnDate;
	private String dateFlexible;	 
	private String adultCount; 
	private String youngAdultCount;
	private String childCount;
	private String infantCount;	 
	private String cabinClass;
	private String amadeusReturnUrl;
	private String promoCode;
	private String corporatePromoCode;
	private String corporateName;
	private String corporateId; 
	private String source; 
	private String userId; 
	
	
	
	
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}




	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
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




	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}




	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}




	/**
	 * @return the isMobileDevice
	 */
	public String getIsMobileDevice() {
		return isMobileDevice;
	}




	/**
	 * @param isMobileDevice the isMobileDevice to set
	 */
	public void setIsMobileDevice(String isMobileDevice) {
		this.isMobileDevice = isMobileDevice;
	}




	/**
	 * @return the tripType
	 */
	public String getTripType() {
		return tripType;
	}




	/**
	 * @param tripType the tripType to set
	 */
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}




	/**
	 * @return the departureCity
	 */
	public String getDepartureCity() {
		return departureCity;
	}




	/**
	 * @param departureCity the departureCity to set
	 */
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}




	/**
	 * @return the destinationCity
	 */
	public String getDestinationCity() {
		return destinationCity;
	}




	/**
	 * @param destinationCity the destinationCity to set
	 */
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}




	/**
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}




	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}




	/**
	 * @return the returnDate
	 */
	public String getReturnDate() {
		return returnDate;
	}




	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}




	/**
	 * @return the dateFlexible
	 */
	public String getDateFlexible() {
		return dateFlexible;
	}




	/**
	 * @param dateFlexible the dateFlexible to set
	 */
	public void setDateFlexible(String dateFlexible) {
		this.dateFlexible = dateFlexible;
	}




	/**
	 * @return the adultCount
	 */
	public String getAdultCount() {
		return adultCount;
	}




	/**
	 * @param adultCount the adultCount to set
	 */
	public void setAdultCount(String adultCount) {
		this.adultCount = adultCount;
	}




	/**
	 * @return the youngAdultCount
	 */
	public String getYoungAdultCount() {
		return youngAdultCount;
	}




	/**
	 * @param youngAdultCount the youngAdultCount to set
	 */
	public void setYoungAdultCount(String youngAdultCount) {
		this.youngAdultCount = youngAdultCount;
	}




	/**
	 * @return the childCount
	 */
	public String getChildCount() {
		return childCount;
	}




	/**
	 * @param childCount the childCount to set
	 */
	public void setChildCount(String childCount) {
		this.childCount = childCount;
	}




	/**
	 * @return the infantCount
	 */
	public String getInfantCount() {
		return infantCount;
	}




	/**
	 * @param infantCount the infantCount to set
	 */
	public void setInfantCount(String infantCount) {
		this.infantCount = infantCount;
	}




	/**
	 * @return the cabinClass
	 */
	public String getCabinClass() {
		return cabinClass;
	}




	/**
	 * @param cabinClass the cabinClass to set
	 */
	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}




	/**
	 * @return the amadeusReturnUrl
	 */
	public String getAmadeusReturnUrl() {
		return amadeusReturnUrl;
	}




	/**
	 * @param amadeusReturnUrl the amadeusReturnUrl to set
	 */
	public void setAmadeusReturnUrl(String amadeusReturnUrl) {
		this.amadeusReturnUrl = amadeusReturnUrl;
	}




	/**
	 * @return the promoCode
	 */
	public String getPromoCode() {
		return promoCode;
	}




	/**
	 * @param promoCode the promoCode to set
	 */
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}




	/**
	 * @return the corporatePromoCode
	 */
	public String getCorporatePromoCode() {
		return corporatePromoCode;
	}




	/**
	 * @param corporatePromoCode the corporatePromoCode to set
	 */
	public void setCorporatePromoCode(String corporatePromoCode) {
		this.corporatePromoCode = corporatePromoCode;
	}




	/**
	 * @return the corporateName
	 */
	public String getCorporateName() {
		return corporateName;
	}




	/**
	 * @param corporateName the corporateName to set
	 */
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}




	/**
	 * @return the corporateId
	 */
	public String getCorporateId() {
		return corporateId;
	}




	/**
	 * @param corporateId the corporateId to set
	 */
	public void setCorporateId(String corporateId) {
		this.corporateId = corporateId;
	}




	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}




	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}




	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}




	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
 

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightSearchRequestVO [country=" + country + ", language=" + language + ", product=" + product
				+ ", isMobileDevice=" + isMobileDevice + ", tripType=" + tripType + ", departureCity=" + departureCity
				+ ", destinationCity=" + destinationCity + ", departureDate=" + departureDate + ", returnDate="
				+ returnDate + ", dateFlexible=" + dateFlexible + ", adultCount=" + adultCount + ", youngAdultCount="
				+ youngAdultCount + ", childCount=" + childCount + ", infantCount=" + infantCount + ", cabinClass="
				+ cabinClass + ", amadeusReturnUrl=" + amadeusReturnUrl + ", promoCode=" + promoCode
				+ ", corporatePromoCode=" + corporatePromoCode + ", corporateName=" + corporateName + ", corporateId="
				+ corporateId + ", source=" + source + ", userId=" + userId + "]";
	} 
}

