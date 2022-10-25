package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

public class PromoFaresVO extends AbstractVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * promoCode - Promo Code
	 */
	private String promoCode;
	/**
	 * fareBasis - Fare Basis Code
	 */
	private String fareBasis;
	/**
	 * maxAdt - Max Adult count
	 */
	private int maxAdt;
	/**
	 * minAdt - Min Adult count
	 */
	private int minAdt;
	/**
	 * maxChd - Max Child count
	 */
	private int maxChd;
	/**
	 * minChd - Min Child count
	 */
	private int minChd;
	/**
	 * maxInf - Max Infant count
	 */
	private int maxInf;
	/**
	 * minInf - Min Infant count
	 */
	private int minInf;

	/**
	 * startTime - promotion start time
	 */
	private float startTime;

	/**
	 * endTime - promotion end time
	 */
	private float endTime;
	/**
	 * promoType - promotion Type(S-STANDARD, T-TACTICAL)
	 */
	private String promoType;

	/**
	 * orginCode - Source code
	 */
	private String orginCode;
	/**
	 * destiCode - Destination code
	 */
	private String destiCode;

	private int promoFareId;

	private String startDate;
	private String endDate;
	/**
	 * Corporate promoCode
	 */
	private String corporatePromoCode;
	/**
	 * Private Fare Account Code
	 */
	private String privateFareAccountCode;

	/**
	 * getPromoCode
	 * 
	 * @return the promoCode
	 */
	public String getPromoCode() {
		return promoCode;
	}

	/**
	 * setPromoCode
	 * 
	 * @param promoCode
	 *            the promoCode to set
	 */
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	/**
	 * getFareBasis
	 * 
	 * @return the fareBasis
	 */
	public String getFareBasis() {
		return fareBasis;
	}

	/**
	 * setFareBasis
	 * 
	 * @param fareBasis
	 *            the fareBasis to set
	 */
	public void setFareBasis(String fareBasis) {
		this.fareBasis = fareBasis;
	}

	/**
	 * getMaxAdt
	 * 
	 * @return the maxAdt
	 */
	public int getMaxAdt() {
		return maxAdt;
	}

	/**
	 * setMaxAdt
	 * 
	 * @param maxAdt
	 *            the maxAdt to set
	 */
	public void setMaxAdt(int maxAdt) {
		this.maxAdt = maxAdt;
	}

	/**
	 * getMinAdt
	 * 
	 * @return the minAdt
	 */
	public int getMinAdt() {
		return minAdt;
	}

	/**
	 * setMinAdt
	 * 
	 * @param minAdt
	 *            the minAdt to set
	 */
	public void setMinAdt(int minAdt) {
		this.minAdt = minAdt;
	}

	/**
	 * getMaxChd
	 * 
	 * @return the maxChd
	 */
	public int getMaxChd() {
		return maxChd;
	}

	/**
	 * setMaxChd
	 * 
	 * @param maxChd
	 *            the maxChd to set
	 */
	public void setMaxChd(int maxChd) {
		this.maxChd = maxChd;
	}

	/**
	 * getMinChd
	 * 
	 * @return the minChd
	 */
	public int getMinChd() {
		return minChd;
	}

	/**
	 * setMinChd
	 * 
	 * @param minChd
	 *            the minChd to set
	 */
	public void setMinChd(int minChd) {
		this.minChd = minChd;
	}

	/**
	 * getMaxInf
	 * 
	 * @return the maxInf
	 */
	public int getMaxInf() {
		return maxInf;
	}

	/**
	 * setMaxInf
	 * 
	 * @param maxInf
	 *            the maxInf to set
	 */
	public void setMaxInf(int maxInf) {
		this.maxInf = maxInf;
	}

	/**
	 * getMinInf
	 * 
	 * @return the minInf
	 */
	public int getMinInf() {
		return minInf;
	}

	/**
	 * setMinInf
	 * 
	 * @param minInf
	 *            the minInf to set
	 */
	public void setMinInf(int minInf) {
		this.minInf = minInf;
	}

	public String getPromoType() {
		return promoType;
	}

	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getOrginCode() {
		return orginCode;
	}

	public void setOrginCode(String orginCode) {
		this.orginCode = orginCode;
	}

	public String getDestiCode() {
		return destiCode;
	}

	public void setDestiCode(String destiCode) {
		this.destiCode = destiCode;
	}

	public int getPromoFareId() {
		return promoFareId;
	}

	public void setPromoFareId(int promoFareId) {
		this.promoFareId = promoFareId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public float getStartTime() {
		return startTime;
	}

	public void setStartTime(float startTime) {
		this.startTime = startTime;
	}

	public float getEndTime() {
		return endTime;
	}

	public void setEndTime(float endTime) {
		this.endTime = endTime;
	}

	public String getCorporatePromoCode() {
		return corporatePromoCode;
	}

	public void setCorporatePromoCode(String corporatePromoCode) {
		this.corporatePromoCode = corporatePromoCode;
	}

	public String getPrivateFareAccountCode() {
		return privateFareAccountCode;
	}

	public void setPrivateFareAccountCode(String privateFareAccountCode) {
		this.privateFareAccountCode = privateFareAccountCode;
	}

	@Override
	public String toString() {
		return "PromoFaresVO [promoCode=" + promoCode + ", fareBasis=" + fareBasis + ", maxAdt=" + maxAdt + ", minAdt="
				+ minAdt + ", maxChd=" + maxChd + ", minChd=" + minChd + ", maxInf=" + maxInf + ", minInf=" + minInf
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", promoType=" + promoType + ", orginCode="
				+ orginCode + ", destiCode=" + destiCode + ", promoFareId=" + promoFareId + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", corporatePromoCode=" + corporatePromoCode + ", privateFareAccountCode="
				+ privateFareAccountCode + "]";
	}
	

}
