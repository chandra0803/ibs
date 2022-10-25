package com.ibsplc.amadeus.vo;

import java.math.BigInteger;

public class ElementManagementItineraryVO  extends AbstractVO {
	
	private String segmentName;
	private BigInteger lineNumber;
	private String status;
	private ReferenceVO referenceVO = new ReferenceVO();
	private ItineraryReferenceVO itineraryReferenceVO = new ItineraryReferenceVO();
	
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
	/**
	 * @return the lineNumber
	 */
	public BigInteger getLineNumber() {
		return lineNumber;
	}
	/**
	 * @param lineNumber the lineNumber to set
	 */
	public void setLineNumber(BigInteger lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the referenceVO
	 */
	public ReferenceVO getReferenceVO() {
		return referenceVO;
	}
	/**
	 * @param referenceVO the referenceVO to set
	 */
	public void setReferenceVO(ReferenceVO referenceVO) {
		this.referenceVO = referenceVO;
	}
	/**
	 * @return the itineraryReferenceVO
	 */
	public ItineraryReferenceVO getItineraryReferenceVO() {
		return itineraryReferenceVO;
	}
	/**
	 * @param itineraryReferenceVO the itineraryReferenceVO to set
	 */
	public void setItineraryReferenceVO(ItineraryReferenceVO itineraryReferenceVO) {
		this.itineraryReferenceVO = itineraryReferenceVO;
	}
	
	

}
