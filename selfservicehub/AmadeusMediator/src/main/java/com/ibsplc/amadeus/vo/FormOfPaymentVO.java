package com.ibsplc.amadeus.vo;

public class FormOfPaymentVO extends AbstractVO {
	
	private String type;
	private String vendorCode;
	private String creditCardNumber;
	private String expiryDate;
	private String extendedPayment;
	private String fopFreeText;
	
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the vendorCode
	 */
	public String getVendorCode() {
		return vendorCode;
	}
	/**
	 * @param vendorCode the vendorCode to set
	 */
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	/**
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	/**
	 * @param creditCardNumber the creditCardNumber to set
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}
	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	/**
	 * @return the extendedPayment
	 */
	public String getExtendedPayment() {
		return extendedPayment;
	}
	/**
	 * @param extendedPayment the extendedPayment to set
	 */
	public void setExtendedPayment(String extendedPayment) {
		this.extendedPayment = extendedPayment;
	}
	/**
	 * @return the fopFreeText
	 */
	public String getFopFreeText() {
		return fopFreeText;
	}
	/**
	 * @param fopFreeText the fopFreeText to set
	 */
	public void setFopFreeText(String fopFreeText) {
		this.fopFreeText = fopFreeText;
	}
	
	
}	
