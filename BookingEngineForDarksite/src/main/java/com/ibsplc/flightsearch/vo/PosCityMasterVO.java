package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

public class PosCityMasterVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String posId;
	private String cityCode;
	private String productMasterCode;
	private String amadeusOfficeId;
	private String paymentGateway;
	private String mealInfo;
	
	private String preSeating;
	private String activeIndicator;
	private String  paymentGatewayType;
	private String queueOfficeId;
	private String queueCategory;
	private String pointOfTicketing;
	private String queueNumber;
	private String storeNumber;
	
	/**
	 * @return the posId
	 */
	public String getPosId() {
		return posId;
	}
	/**
	 * @param posId the posId to set
	 */
	public void setPosId(String posId) {
		this.posId = posId;
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
	 * @return the productMasterCode
	 */
	public String getProductMasterCode() {
		return productMasterCode;
	}
	/**
	 * @param productMasterCode the productMasterCode to set
	 */
	public void setProductMasterCode(String productMasterCode) {
		this.productMasterCode = productMasterCode;
	}
	/**
	 * @return the amadeusOfficeId
	 */
	public String getAmadeusOfficeId() {
		return amadeusOfficeId;
	}
	/**
	 * @param amadeusOfficeId the amadeusOfficeId to set
	 */
	public void setAmadeusOfficeId(String amadeusOfficeId) {
		this.amadeusOfficeId = amadeusOfficeId;
	}
	/**
	 * @return the paymentGateway
	 */
	public String getPaymentGateway() {
		return paymentGateway;
	}
	/**
	 * @param paymentGateway the paymentGateway to set
	 */
	public void setPaymentGateway(String paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	/**
	 * @return the mealInfo
	 */
	public String getMealInfo() {
		return mealInfo;
	}
	/**
	 * @param mealInfo the mealInfo to set
	 */
	public void setMealInfo(String mealInfo) {
		this.mealInfo = mealInfo;
	}
	/**
	 * @return the preSeating
	 */
	public String getPreSeating() {
		return preSeating;
	}
	/**
	 * @param preSeating the preSeating to set
	 */
	public void setPreSeating(String preSeating) {
		this.preSeating = preSeating;
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
	 * @return the paymentGatewayType
	 */
	public String getPaymentGatewayType() {
		return paymentGatewayType;
	}
	/**
	 * @param paymentGatewayType the paymentGatewayType to set
	 */
	public void setPaymentGatewayType(String paymentGatewayType) {
		this.paymentGatewayType = paymentGatewayType;
	}
	/**
	 * @return the queueOfficeId
	 */
	public String getQueueOfficeId() {
		return queueOfficeId;
	}
	/**
	 * @param queueOfficeId the queueOfficeId to set
	 */
	public void setQueueOfficeId(String queueOfficeId) {
		this.queueOfficeId = queueOfficeId;
	}
	/**
	 * @return the queueCategory
	 */
	public String getQueueCategory() {
		return queueCategory;
	}
	/**
	 * @param queueCategory the queueCategory to set
	 */
	public void setQueueCategory(String queueCategory) {
		this.queueCategory = queueCategory;
	}
	/**
	 * @return the pointOfTicketing
	 */
	public String getPointOfTicketing() {
		return pointOfTicketing;
	}
	/**
	 * @param pointOfTicketing the pointOfTicketing to set
	 */
	public void setPointOfTicketing(String pointOfTicketing) {
		this.pointOfTicketing = pointOfTicketing;
	}
	/**
	 * @return the queueNumber
	 */
	public String getQueueNumber() {
		return queueNumber;
	}
	/**
	 * @param queueNumber the queueNumber to set
	 */
	public void setQueueNumber(String queueNumber) {
		this.queueNumber = queueNumber;
	}
	/**
	 * @return the storeNumber
	 */
	public String getStoreNumber() {
		return storeNumber;
	}
	/**
	 * @param storeNumber the storeNumber to set
	 */
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PosCityMasterVO [posId=" + posId + ", cityCode=" + cityCode + ", productMasterCode=" + productMasterCode
				+ ", amadeusOfficeId=" + amadeusOfficeId + ", paymentGateway=" + paymentGateway + ", mealInfo="
				+ mealInfo + ", preSeating=" + preSeating + ", activeIndicator=" + activeIndicator
				+ ", paymentGatewayType=" + paymentGatewayType + ", queueOfficeId=" + queueOfficeId + ", queueCategory="
				+ queueCategory + ", pointOfTicketing=" + pointOfTicketing + ", queueNumber=" + queueNumber
				+ ", storeNumber=" + storeNumber + "]";
	}
 												
	
	
}
