package com.ibsplc.common.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class TaxVO extends AbstractVO implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * This represents the tax type of the passenger, such as the ZX, YR etc
	 */
	private String taxCode;
	/**
	 * This represents the amount for that tax type.
	 */
	private String amount;
	/**
	 * The below three fields are added for updating the TST Needed for internal
	 * manipulations in Amadeus. Will be populated from Amadeus side
	 */
	private String taxNature;
	/**
	 * The below three fields are added for updating the TST Needed for internal
	 * manipulations in Amadeus. Will be populated from Amadeus side
	 */
	private String taxExempt;
	/**
	 * The below three fields are added for updating the TST Needed for internal
	 * manipulations in Amadeus. Will be populated from Amadeus side
	 */
	private String currency;
	/**
	 * Tax Category
	 */
	private String taxCategory;
	/**
	 * Tax Identifier
	 */
	private String taxIdentifier;

	/**
	 * getTaxCode
	 * 
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}

	/**
	 * To set taxCode
	 * 
	 * @param taxCode
	 *            the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	/**
	 * getAmount
	 * 
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * To set amount
	 * 
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * getTaxNature
	 * 
	 * @return the taxNature
	 */
	public String getTaxNature() {
		return taxNature;
	}

	/**
	 * To set taxNature
	 * 
	 * @param taxNature
	 *            the taxNature to set
	 */
	public void setTaxNature(String taxNature) {
		this.taxNature = taxNature;
	}

	/**
	 * getTaxExempt
	 * 
	 * @return the taxExempt
	 */
	public String getTaxExempt() {
		return taxExempt;
	}

	/**
	 * To set taxExempt
	 * 
	 * @param taxExempt
	 *            the taxExempt to set
	 */
	public void setTaxExempt(String taxExempt) {
		this.taxExempt = taxExempt;
	}

	/**
	 * getCurrency
	 * 
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * To set currency
	 * 
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * getTaxCategory
	 * 
	 * @return the taxCategory
	 */
	public String getTaxCategory() {
		return taxCategory;
	}

	/**
	 * To set taxCategory
	 * 
	 * @param taxCategory
	 *            the taxCategory to set
	 */
	public void setTaxCategory(String taxCategory) {
		this.taxCategory = taxCategory;
	}

	/**
	 * getTaxIdentifier
	 * 
	 * @return the taxIdentifier
	 */
	public String getTaxIdentifier() {
		return taxIdentifier;
	}

	/**
	 * To set taxIdentifier
	 * 
	 * @param taxIdentifier
	 *            the taxIdentifier to set
	 */
	public void setTaxIdentifier(String taxIdentifier) {
		this.taxIdentifier = taxIdentifier;
	}

}
