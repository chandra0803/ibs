package com.ibsplc.flightsearch.vo;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("PMD.TooManyFields")
public class FlexPricerRequestVO extends FlightSearchVO{
	private static final long serialVersionUID = 1L;
	
	private int paxCount;
	private int adultPaxCount;
	private int childPaxCount;
	private int youthPaxCount;
	private int infantPaxCount;
	private boolean isAmadeusPos;
	private PromoFaresVO promoFaresVO;	
	private String sitePointOfSale;
	private String amadeusLanguageCode;
	private String cityForOfficeID;
	private String siteQueueOfficeID;
	private String sitePointOfTicketing;
	private String siteQueueNumber;
	private String siteQueueCategory;
	private String amadeusSiteOfficeID;
	
	private String routeType;
	private String dateRangeQualifier1;
	private String dateRangeQualifier2;
	private String arrangeBy;
	private String fareFamily2;
	private String fareFamily3;
	private String pricingType;
	private String fareFamily1;
	private String displayType;
	private String dateRangeValue1;
	private String dateRangeValue2;
	private String tripFlow;
	private String siteExtendedPspURL;
	private String siteExtMerchantID;
	private String encryptionEnabled;
	private String siteID;
	private String productType;
	private String embTransFlexPricerAction;
	/*
	 * Commented on 08/09/2020
	 * 
	@SerializedName("threeDsecuredEnabledChild")
	private String threeDsecuredEnabled;
	*/
	@SerializedName("isRouteOperationalChild")
	private String isRouteOperational; //Added on 08/09/2020
	
	private String embTransPurchaseAction;
	private String enablePayLater;
	

	//Added on 27/01/2021 for everymundo -- start
	
	private String sourceId;
	

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	
	//Added on 27/01/2021 for everymundo -- end
	
	//Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request Parameter -- start
	
	private String isAirlinkRoute;
	
	public String getIsAirlinkRoute() {
		return isAirlinkRoute;
	}

	public void setIsAirlinkRoute(String isAirlinkRoute) {
		this.isAirlinkRoute = isAirlinkRoute;
	}
	
	//Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request Parameter -- end
	
	//Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request Parameter -- start
		 private String isDirectTrip;
		
		public String getIsDirectTrip() {
			return isDirectTrip;
		}

		public void setIsDirectTrip(String isDirectTrip) {
			this.isDirectTrip = isDirectTrip;
		}
		//Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request Parameter -- end


	public String getEmbTransPurchaseAction() {
		return embTransPurchaseAction;
	}
	public void setEmbTransPurchaseAction(String embTransPurchaseAction) {
		this.embTransPurchaseAction = embTransPurchaseAction;
	}
	public int getPaxCount() {
		return paxCount;
	}
	public void setPaxCount(int paxCount) {
		this.paxCount = paxCount;
	}
	public int getAdultPaxCount() {
		return adultPaxCount;
	}
	public void setAdultPaxCount(int adultPaxCount) {
		this.adultPaxCount = adultPaxCount;
	}
	public int getChildPaxCount() {
		return childPaxCount;
	}
	public void setChildPaxCount(int childPaxCount) {
		this.childPaxCount = childPaxCount;
	}
	public int getYouthPaxCount() {
		return youthPaxCount;
	}
	public void setYouthPaxCount(int youthPaxCount) {
		this.youthPaxCount = youthPaxCount;
	}
	public int getInfantPaxCount() {
		return infantPaxCount;
	}
	public void setInfantPaxCount(int infantPaxCount) {
		this.infantPaxCount = infantPaxCount;
	}
	public boolean setAmadeusPos() {
		return isAmadeusPos;
	}
	public void setIsAmadeusPos(boolean isAmadeus) {
		this.isAmadeusPos = isAmadeus;
	}
	public String getSitePointOfSale() {
		return sitePointOfSale;
	}
	public void setSitePointOfSale(String sitePointOfSale) {
		this.sitePointOfSale = sitePointOfSale;
	}
	public String getAmadeusLanguageCode() {
		return amadeusLanguageCode;
	}
	public void setAmadeusLanguageCode(String amadeusLanguageCode) {
		this.amadeusLanguageCode = amadeusLanguageCode;
	}
	public String getCityForOfficeID() {
		return cityForOfficeID;
	}
	public void setCityForOfficeID(String cityForOfficeID) {
		this.cityForOfficeID = cityForOfficeID;
	}
	public String getSiteQueueOfficeID() {
		return siteQueueOfficeID;
	}
	public void setSiteQueueOfficeID(String siteQueueOfficeID) {
		this.siteQueueOfficeID = siteQueueOfficeID;
	}
	public String getSitePointOfTicketing() {
		return sitePointOfTicketing;
	}
	public void setSitePointOfTicketing(String sitePointOfTicketing) {
		this.sitePointOfTicketing = sitePointOfTicketing;
	}
	public String getSiteQueueNumber() {
		return siteQueueNumber;
	}
	public void setSiteQueueNumber(String siteQueueNumber) {
		this.siteQueueNumber = siteQueueNumber;
	}
	public String getSiteQueueCategory() {
		return siteQueueCategory;
	}
	public void setSiteQueueCategory(String siteQueueCategory) {
		this.siteQueueCategory = siteQueueCategory;
	}
	public String getAmadeusSiteOfficeID() {
		return amadeusSiteOfficeID;
	}
	public void setAmadeusSiteOfficeID(String amadeusSiteOfficeID) {
		this.amadeusSiteOfficeID = amadeusSiteOfficeID;
	}
	public String getRouteType() {
		return routeType;
	}
	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}
	public String getDateRangeQualifier1() {
		return dateRangeQualifier1;
	}
	public void setDateRangeQualifier1(String dateRangeQualifier1) {
		this.dateRangeQualifier1 = dateRangeQualifier1;
	}
	public String getDateRangeQualifier2() {
		return dateRangeQualifier2;
	}
	public void setDateRangeQualifier2(String dateRangeQualifier2) {
		this.dateRangeQualifier2 = dateRangeQualifier2;
	}
	public String getArrangeBy() {
		return arrangeBy;
	}
	public void setArrangeBy(String arrangeBy) {
		this.arrangeBy = arrangeBy;
	}
	public String getFareFamily2() {
		return fareFamily2;
	}
	public void setFareFamily2(String fareFamily2) {
		this.fareFamily2 = fareFamily2;
	}
	public String getFareFamily3() {
		return fareFamily3;
	}
	public void setFareFamily3(String fareFamily3) {
		this.fareFamily3 = fareFamily3;
	}
	public String getPricingType() {
		return pricingType;
	}
	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}
	public String getFareFamily1() {
		return fareFamily1;
	}
	public void setFareFamily1(String fareFamily1) {
		this.fareFamily1 = fareFamily1;
	}
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getDateRangeValue1() {
		return dateRangeValue1;
	}
	public void setDateRangeValue1(String dateRangeValue1) {
		this.dateRangeValue1 = dateRangeValue1;
	}
	public String getDateRangeValue2() {
		return dateRangeValue2;
	}
	public void setDateRangeValue2(String dateRangeValue2) {
		this.dateRangeValue2 = dateRangeValue2;
	}
	public String getTripFlow() {
		return tripFlow;
	}
	public void setTripFlow(String tripFlow) {
		this.tripFlow = tripFlow;
	}
	public String getSiteExtendedPspURL() {
		return siteExtendedPspURL;
	}
	public void setSiteExtendedPspURL(String siteExtendedPspURL) {
		this.siteExtendedPspURL = siteExtendedPspURL;
	}
	public String getSiteExtMerchantID() {
		return siteExtMerchantID;
	}
	public void setSiteExtMerchantID(String siteExtMerchantID) {
		this.siteExtMerchantID = siteExtMerchantID;
	}
	public String getEncryptionEnabled() {
		return encryptionEnabled;
	}
	public void setEncryptionEnabled(String encryptionEnabled) {
		this.encryptionEnabled = encryptionEnabled;
	}
	public String getSiteID() {
		return siteID;
	}
	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public PromoFaresVO getPromoFaresVO() {
		return promoFaresVO;
	}
	public void setPromoFaresVO(PromoFaresVO promoFaresVO) {
		this.promoFaresVO = promoFaresVO;
	}
	public String getEmbTransFlexPricerAction() {
		return embTransFlexPricerAction;
	}
	public void setEmbTransFlexPricerAction(String embTransFlexPricerAction) {
		this.embTransFlexPricerAction = embTransFlexPricerAction;
	}
	/*
	 * Commented on 08/09/2020 -- start
	 * 
	public String getThreeDsecuredEnabled() {
		return threeDsecuredEnabled;
	}
	public void setThreeDsecuredEnabled(String threeDsecuredEnabled) {
		this.threeDsecuredEnabled = threeDsecuredEnabled;
	}
	*
	*Commented on 08/09/2020 -- end
	*/
	
	/*
	 * Added on 08/09/2020 -- start
	 */
	public String getIsRouteOperational() {
		return isRouteOperational;
	}
	public void setIsRouteOperational(String isRouteOperational) {
		this.isRouteOperational = isRouteOperational;
	}
	/*
	 * Added on 08/09/2020 -- end
	 */
	
	public String getEnablePayLater() {
		return enablePayLater;
	}
	
	
	public void setEnablePayLater(String enablePayLater) {
		this.enablePayLater = enablePayLater;
	}
	@Override
	public String toString() {
		return "FlexPricerRequestVO [paxCount=" + paxCount + ", adultPaxCount=" + adultPaxCount + ", childPaxCount="
				+ childPaxCount + ", currency="
						+ getCurrency()+ ", youthPaxCount=" + youthPaxCount + ", infantPaxCount=" + infantPaxCount
				+ ", isAmadeusPos=" + isAmadeusPos + ", promoFaresVO=" + promoFaresVO + ", sitePointOfSale="
				+ sitePointOfSale + ", amadeusLanguageCode=" + amadeusLanguageCode + ", cityForOfficeID="
				+ cityForOfficeID + ", siteQueueOfficeID=" + siteQueueOfficeID + ", sitePointOfTicketing="
				+ sitePointOfTicketing + ", siteQueueNumber=" + siteQueueNumber + ", siteQueueCategory="
				+ siteQueueCategory + ", amadeusSiteOfficeID=" + amadeusSiteOfficeID + ", routeType=" + routeType
				+ ", dateRangeQualifier1=" + dateRangeQualifier1 + ", dateRangeQualifier2=" + dateRangeQualifier2
				+ ", arrangeBy=" + arrangeBy + ", fareFamily2=" + fareFamily2 + ", fareFamily3=" + fareFamily3
				+ ", pricingType=" + pricingType + ", fareFamily1=" + fareFamily1 + ", displayType=" + displayType
				+ ", dateRangeValue1=" + dateRangeValue1 + ", dateRangeValue2=" + dateRangeValue2 + ", tripFlow="
				+ tripFlow + ", siteExtendedPspURL=" + siteExtendedPspURL + ", siteExtMerchantID=" + siteExtMerchantID
				+ ", encryptionEnabled=" + encryptionEnabled + ", siteID=" + siteID + ", productType=" + productType
				+ ", embTransFlexPricerAction=" + embTransFlexPricerAction + ", isRouteOperational="
				+ isRouteOperational + ", embTransPurchaseAction=" + embTransPurchaseAction + ", enablePayLater="
				+ enablePayLater + "]";
	} 
}
