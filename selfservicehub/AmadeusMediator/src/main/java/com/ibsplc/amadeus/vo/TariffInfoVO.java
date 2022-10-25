package com.ibsplc.amadeus.vo;

import java.math.BigDecimal;

public class TariffInfoVO  extends AbstractVO {
	
	private String ratePlanIndicator;
	private String amountType;
	private BigDecimal amount;
	private String currency;
 
	 
	/**
	 * @return the ratePlanIndicator
	 */
	public String getRatePlanIndicator() {
		return ratePlanIndicator;
	}
	/**
	 * @param ratePlanIndicator the ratePlanIndicator to set
	 */
	public void setRatePlanIndicator(String ratePlanIndicator) {
		this.ratePlanIndicator = ratePlanIndicator;
	}
	/**
	 * @return the amountType
	 */
	public String getAmountType() {
		return amountType;
	}
	/**
	 * @param amountType the amountType to set
	 */
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}
 
	
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
