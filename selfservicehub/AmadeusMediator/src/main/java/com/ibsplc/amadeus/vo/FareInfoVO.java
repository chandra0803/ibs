package com.ibsplc.amadeus.vo;

/**
 * @author a-5316
 *
 */
public class FareInfoVO extends AbstractVO {

	/**
	 * The Fare Type Qualifier associated with the Ticket or EMD
	 */
	private String fareType;
	/**
	 * The Fare Amount associated with the Ticket or EMD
	 */
	private String fareAmount;
	/**
	 * The currency code associated Ticket or EMD
	 */
	private String fareCurrency;

	/**
	 * @return the fareType
	 */
	public String getFareType() {
		return fareType;
	}

	/**
	 * @param fareType
	 *            the fareType to set
	 */
	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	/**
	 * @return the fareAmount
	 */
	public String getFareAmount() {
		return fareAmount;
	}

	/**
	 * @param fareAmount
	 *            the fareAmount to set
	 */
	public void setFareAmount(String fareAmount) {
		this.fareAmount = fareAmount;
	}

	/**
	 * @return the fareCurrency
	 */
	public String getFareCurrency() {
		return fareCurrency;
	}

	/**
	 * @param fareCurrency
	 *            the fareCurrency to set
	 */
	public void setFareCurrency(String fareCurrency) {
		this.fareCurrency = fareCurrency;
	}

}
