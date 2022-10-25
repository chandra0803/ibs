package com.ibsplc.common.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class SSRVO extends AbstractVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * SSR Cross Reference
	 */
	private String ssrbCrossRef;
	/**
	 * This denotes the value of the SSR. eg VEGMEAL etc
	 */
	private String ssrValue;
	/**
	 * This denoted the description of the SSR code
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
	 * getSsrbCrossRef
	 * 
	 * @return the ssrbCrossRef
	 */
	public String getSsrbCrossRef() {
		return ssrbCrossRef;
	}
	/**
	 * To set ssrbCrossRef
	 * 
	 * @param ssrbCrossRef
	 *            the ssrbCrossRef to set
	 */
	public void setSsrbCrossRef(String ssrbCrossRef) {
		this.ssrbCrossRef = ssrbCrossRef;
	}
	/**
	 * getSsrValue
	 * 
	 * @return the ssrValue
	 */
	public String getSsrValue() {
		return ssrValue;
	}
	/**
	 * To set ssrValue
	 * 
	 * @param ssrValue
	 *            the ssrValue to set
	 */
	public void setSsrValue(String ssrValue) {
		this.ssrValue = ssrValue;
	}
	/**
	 * getSsrDescription
	 * 
	 * @return the ssrDescription
	 */
	public String getSsrDescription() {
		return ssrDescription;
	}
	/**
	 * To set ssrDescription
	 * 
	 * @param ssrDescription
	 *            the ssrDescription to set
	 */
	public void setSsrDescription(String ssrDescription) {
		this.ssrDescription = ssrDescription;
	}
	/**
	 * getReferenceQualifier
	 * 
	 * @return the referenceQualifier
	 */
	public String getReferenceQualifier() {
		return referenceQualifier;
	}
	/**
	 * To set referenceQualifier
	 * 
	 * @param referenceQualifier
	 *            the referenceQualifier to set
	 */
	public void setReferenceQualifier(String referenceQualifier) {
		this.referenceQualifier = referenceQualifier;
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
	 * getSsrReferenceQualifier
	 * 
	 * @return the ssrReferenceQualifier
	 */
	public String getSsrReferenceQualifier() {
		return ssrReferenceQualifier;
	}
	/**
	 * To set ssrReferenceQualifier
	 * 
	 * @param ssrReferenceQualifier
	 *            the ssrReferenceQualifier to set
	 */
	public void setSsrReferenceQualifier(String ssrReferenceQualifier) {
		this.ssrReferenceQualifier = ssrReferenceQualifier;
	}
	/**
	 * getSsrReferenceNumber
	 * 
	 * @return the ssrReferenceNumber
	 */
	public String getSsrReferenceNumber() {
		return ssrReferenceNumber;
	}
	/**
	 * To set ssrReferenceNumber
	 * 
	 * @param ssrReferenceNumber
	 *            the ssrReferenceNumber to set
	 */
	public void setSsrReferenceNumber(String ssrReferenceNumber) {
		this.ssrReferenceNumber = ssrReferenceNumber;
	}

}
