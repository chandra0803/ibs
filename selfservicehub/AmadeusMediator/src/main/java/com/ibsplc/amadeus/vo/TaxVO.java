package com.ibsplc.amadeus.vo;

public class TaxVO extends AbstractVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This represents the tax type of the passenger, such as the ZX, YR etc
	 */
	private String taxCode;

	/**
	 * The tax identifier code
	 */
	private String taxIdentifier;

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
	 * This represents the tax Category
	 */
	private String taxCategory;

	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}

	/**
	 * @param taxCode
	 *            the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	/**
	 * @return the taxIdentifier
	 */
	public String getTaxIdentifier() {
		return taxIdentifier;
	}

	/**
	 * @param taxIdentifier
	 *            the taxIdentifier to set
	 */
	public void setTaxIdentifier(String taxIdentifier) {
		this.taxIdentifier = taxIdentifier;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the taxNature
	 */
	public String getTaxNature() {
		return taxNature;
	}

	/**
	 * @param taxNature
	 *            the taxNature to set
	 */
	public void setTaxNature(String taxNature) {
		this.taxNature = taxNature;
	}

	/**
	 * @return the taxExempt
	 */
	public String getTaxExempt() {
		return taxExempt;
	}

	/**
	 * @param taxExempt
	 *            the taxExempt to set
	 */
	public void setTaxExempt(String taxExempt) {
		this.taxExempt = taxExempt;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the taxCategory
	 */
	public String getTaxCategory() {
		return taxCategory;
	}
	/**
	 * @param taxCategory
	 *            the taxCategory to set
	 */
	public void setTaxCategory(String taxCategory) {
		this.taxCategory = taxCategory;
	}

}