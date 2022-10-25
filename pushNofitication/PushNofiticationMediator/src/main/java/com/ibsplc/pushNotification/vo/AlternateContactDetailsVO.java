package com.ibsplc.pushNotification.vo;

public class AlternateContactDetailsVO extends AbstractVO {

	/**
	 * serialVersionUID - long
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * altName - name of the alternate contact person
	 */
	private String altName;

	/**
	 * The two letter country code
	 */
	private String isoCountryCode;

	/**
	 * altCountryCode - country code of the alternate contact person
	 */
	private String altCountryCode;

	/**
	 * altAreaCode - area code of the alternate contact person
	 */
	private String altAreaCode;

	/**
	 * altTelePhoneNumber - telephone number of the alternate contact person.
	 */
	private String altTelePhoneNumber;

	/**
	 * This is the reference number in Amadeus. Used for internal purposes in
	 * eai layer.
	 */
	private String referenceNumber;

	/**
	 * alternateContact - true / false
	 */
	private boolean alternateContact;

	/**
	 * Return the altName
	 * 
	 * @return altName.
	 */
	public String getAltName() {
		return altName;
	}

	/**
	 * The altName to set.
	 * 
	 * @param altName
	 */
	public void setAltName(String altName) {
		this.altName = altName;
	}

	/**
	 * getAltTelePhoneNumber
	 * 
	 * @return private getter to return value
	 */
	public String getAltTelePhoneNumber() {
		return altTelePhoneNumber;
	}

	/**
	 * setAltTelePhoneNumber
	 * 
	 * @param altTelePhoneNumber
	 *            the setter to set the value
	 */
	public void setAltTelePhoneNumber(String altTelePhoneNumber) {
		this.altTelePhoneNumber = altTelePhoneNumber;
	}

	/**
	 * isAlternateContact
	 * 
	 * @return private getter to return value
	 */
	public boolean isAlternateContact() {
		return alternateContact;
	}

	/**
	 * setAlternateContact
	 * 
	 * @param alternateContact
	 *            the setter to set the value
	 */
	public void setAlternateContact(boolean alternateContact) {
		this.alternateContact = alternateContact;
	}

	/**
	 * Return the isoCountryCode
	 * 
	 * @return isoCountryCode.
	 */
	public String getIsoCountryCode() {
		return isoCountryCode;
	}

	/**
	 * The isoCountryCode to set.
	 * 
	 * @param isoCountryCode
	 */
	public void setIsoCountryCode(String isoCountryCode) {
		this.isoCountryCode = isoCountryCode;
	}

	/**
	 * getAltCountryCode
	 * 
	 * @return private getter to return value
	 */
	public String getAltCountryCode() {
		return altCountryCode;
	}

	/**
	 * setAltCountryCode
	 * 
	 * @param altCountryCode
	 *            the setter to set the value
	 */
	public void setAltCountryCode(String altCountryCode) {
		this.altCountryCode = altCountryCode;
	}

	/**
	 * getAltAreaCode
	 * 
	 * @return private getter to return value
	 */
	public String getAltAreaCode() {
		return altAreaCode;
	}

	/**
	 * setAltAreaCode
	 * 
	 * @param altAreaCode
	 *            the setter to set the value
	 */
	public void setAltAreaCode(String altAreaCode) {
		this.altAreaCode = altAreaCode;
	}

	/**
	 * Return the referenceNumber
	 * 
	 * @return referenceNumber.
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * The referenceNumber to set.
	 * 
	 * @param referenceNumber
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
}
