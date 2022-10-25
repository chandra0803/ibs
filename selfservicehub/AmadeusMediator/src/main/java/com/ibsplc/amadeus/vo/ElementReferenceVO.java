package com.ibsplc.amadeus.vo;

import java.math.BigInteger;

public class ElementReferenceVO extends AbstractVO {
	
	private String qualifier;
	private BigInteger number;
	private String segmentName;
	
	/**
	 * @return the qualifier
	 */
	public String getQualifier() {
		return qualifier;
	}
	/**
	 * @param qualifier the qualifier to set
	 */
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}
	/**
	 * @return the number
	 */
	public BigInteger getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(BigInteger number) {
		this.number = number;
	}
	/**
	 * @return the segmentName
	 */
	public String getSegmentName() {
		return segmentName;
	}
	/**
	 * @param segmentName the segmentName to set
	 */
	public void setSegmentName(String segmentName) {
		this.segmentName = segmentName;
	} 
	
	
}