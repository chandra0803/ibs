package com.ibsplc.amadeus.vo;

import com.ibsplc.amadeus.vo.AbstractVO;

public class SSRVO extends AbstractVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ssrbCrossRef;
	/**
	 * This denotes the value of the SSR. eg VEGMEAL etc..
	 */
	private String ssrValue;

	/**
	 * This denoted the description of the ssr code
	 */
	private String ssrDescription;

	/**
	 * Represents the passenger internal qualifier reference used in Amadeus.
	 * Should be used in combination with referenceNumber. It is to be noted
	 * that, this combination will repeat if an Infant is associated with an
	 * Adult, as both of them will have the same combination.
	 * 
	 * @important - This represents the passenger reference number, ie PT
	 */
	private String referenceQualifier;

	/**
	 * Represents the passenger internal number reference used in Amadeus.
	 * Should be used in combination with referenceQualifier. It is to be noted
	 * that, this combination will repeat if an Infant is associated with an
	 * Adult, as both of them will have the same combination.
	 * 
	 * @important - This represents the passenger reference number, ie PT
	 */
	private String referenceNumber;

	/**
	 * This represents the reference qualifier of the SSR element. Its needed,
	 * when doing a deletion of an existing information
	 */
	private String ssrReferenceQualifier;

	/**
	 * This represents the reference number of the SSR element. Its needed, when
	 * doing a deletion of an existing information
	 */
	private String ssrReferenceNumber;

	/**
	 * @return the ssrbCrossRef
	 */
	public String getSsrbCrossRef() {
		return ssrbCrossRef;
	}

	/**
	 * @param ssrbCrossRef
	 *            the ssrbCrossRef to set
	 */
	public void setSsrbCrossRef(String ssrbCrossRef) {
		this.ssrbCrossRef = ssrbCrossRef;
	}

	/**
	 * get
	 * 
	 * @return Returns the referenceNumber.
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * set
	 * 
	 * @param referenceNumber
	 *            The referenceNumber to set.
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	/**
	 * get
	 * 
	 * @return Returns the referenceQualifier.
	 */
	public String getReferenceQualifier() {
		return referenceQualifier;
	}

	/**
	 * set
	 * 
	 * @param referenceQualifier
	 *            The referenceQualifier to set.
	 */
	public void setReferenceQualifier(String referenceQualifier) {
		this.referenceQualifier = referenceQualifier;
	}

	/**
	 * get
	 * 
	 * @return
	 */
	public String getSsrValue() {
		return ssrValue;
	}

	/**
	 * set
	 * 
	 * @param ssrValue
	 */
	public void setSsrValue(String ssrValue) {
		this.ssrValue = ssrValue;
	}

	/**
	 * set
	 * 
	 * @return Returns the ssrDescription.
	 */
	public String getSsrDescription() {
		return ssrDescription;
	}

	/**
	 * set
	 * 
	 * @param ssrDescription
	 *            The ssrDescription to set.
	 */
	public void setSsrDescription(String ssrDescription) {
		this.ssrDescription = ssrDescription;
	}

	/**
	 * get
	 * 
	 * @return Returns the ssrReferenceNumber.
	 */
	public String getSsrReferenceNumber() {
		return ssrReferenceNumber;
	}

	/**
	 * set
	 * 
	 * @param ssrReferenceNumber
	 *            The ssrReferenceNumber to set.
	 */
	public void setSsrReferenceNumber(String ssrReferenceNumber) {
		this.ssrReferenceNumber = ssrReferenceNumber;
	}

	/**
	 * get
	 * 
	 * @return Returns the ssrReferenceQualifier.
	 */
	public String getSsrReferenceQualifier() {
		return ssrReferenceQualifier;
	}

	/**
	 * set
	 * 
	 * @param ssrReferenceQualifier
	 *            The ssrReferenceQualifier to set.
	 */
	public void setSsrReferenceQualifier(String ssrReferenceQualifier) {
		this.ssrReferenceQualifier = ssrReferenceQualifier;
	}

}
