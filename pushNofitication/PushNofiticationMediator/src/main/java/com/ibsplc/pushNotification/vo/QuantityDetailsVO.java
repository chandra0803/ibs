package com.ibsplc.pushNotification.vo;

import java.math.BigInteger;

public class QuantityDetailsVO extends AbstractVO {

	private static final long serialVersionUID = 1L;
	/**
	 * Quantity Details
	 */
	private BigInteger numberOfUnit;
	/**
	 * Quantity Details
	 */
	private String unitQualifier;

	/**
	 * @return the numberOfUnit
	 */
	public BigInteger getNumberOfUnit() {
		return numberOfUnit;
	}

	/**
	 * @param numberOfUnit
	 *            the numberOfUnit to set
	 */
	public void setNumberOfUnit(BigInteger numberOfUnit) {
		this.numberOfUnit = numberOfUnit;
	}

	/**
	 * @return the unitQualifier
	 */
	public String getUnitQualifier() {
		return unitQualifier;
	}

	/**
	 * @param unitQualifier
	 *            the unitQualifier to set
	 */
	public void setUnitQualifier(String unitQualifier) {
		this.unitQualifier = unitQualifier;
	}

}
