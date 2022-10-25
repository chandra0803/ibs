/**
 * 
 */
package com.ibsplc.common.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class AlternateContactDetailsVO extends AbstractVO implements Serializable {
	
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
	 * getAltName
	 * 
	 * @return the altName
	 */
	public String getAltName() {
		return altName;
	}
	/**
	 * To set altName
	 * 
	 * @param altName
	 *            the altName to set
	 */
	public void setAltName(String altName) {
		this.altName = altName;
	}
	/**
	 * getIsoCountryCode
	 * 
	 * @return the isoCountryCode
	 */
	public String getIsoCountryCode() {
		return isoCountryCode;
	}
	/**
	 * To set isoCountryCode
	 * 
	 * @param isoCountryCode
	 *            the isoCountryCode to set
	 */
	public void setIsoCountryCode(String isoCountryCode) {
		this.isoCountryCode = isoCountryCode;
	}
	/**
	 * getAltCountryCode
	 * 
	 * @return the altCountryCode
	 */
	public String getAltCountryCode() {
		return altCountryCode;
	}
	/**
	 * To set altCountryCode
	 * 
	 * @param altCountryCode
	 *            the altCountryCode to set
	 */
	public void setAltCountryCode(String altCountryCode) {
		this.altCountryCode = altCountryCode;
	}
	/**
	 * getAltAreaCode
	 * 
	 * @return the altAreaCode
	 */
	public String getAltAreaCode() {
		return altAreaCode;
	}
	/**
	 * To set altAreaCode
	 * 
	 * @param altAreaCode
	 *            the altAreaCode to set
	 */
	public void setAltAreaCode(String altAreaCode) {
		this.altAreaCode = altAreaCode;
	}
	/**
	 * getAltTelePhoneNumber
	 * 
	 * @return the altTelePhoneNumber
	 */
	public String getAltTelePhoneNumber() {
		return altTelePhoneNumber;
	}
	/**
	 * To set altTelePhoneNumber
	 * 
	 * @param altTelePhoneNumber
	 *            the altTelePhoneNumber to set
	 */
	public void setAltTelePhoneNumber(String altTelePhoneNumber) {
		this.altTelePhoneNumber = altTelePhoneNumber;
	}
	/**
	 * getReferenceNumber
	 * 
	 * @return the referenceNumber
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}
	/**
	 * To set referenceNumber
	 * 
	 * @param referenceNumber
	 *            the referenceNumber to set
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	/**
	 * isAlternateContact
	 * 
	 * @return the alternateContact
	 */
	public boolean isAlternateContact() {
		return alternateContact;
	}
	/**
	 * To set alternateContact
	 * 
	 * @param alternateContact
	 *            the alternateContact to set
	 */
	public void setAlternateContact(boolean alternateContact) {
		this.alternateContact = alternateContact;
	}

}
