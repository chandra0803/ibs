package com.ibsplc.amadeus.vo;

public class CustomerReferencesVO extends AbstractVO {

	private String referenceQualifier;
	private String referenceNumber;
	
	
	/**
	 * @return the referenceQualifier
	 */
	public String getReferenceQualifier() {
		return referenceQualifier;
	}
	/**
	 * @param referenceQualifier the referenceQualifier to set
	 */
	public void setReferenceQualifier(String referenceQualifier) {
		this.referenceQualifier = referenceQualifier;
	}
	/**
	 * @return the referenceNumber
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}
	/**
	 * @param referenceNumber the referenceNumber to set
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
		
	
}
