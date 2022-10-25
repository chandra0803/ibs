package com.ibsplc.amadeus.vo;

import java.util.List;

public class DcsDataVO extends AbstractVO {
	
	private String markerPax;
	private String markerSegment;
	private List<SegmentSectionVO> segmentSectionVO;
	private List<LegSectionVO> legSectionVO;
	
	
	
	/**
	 * @return the markerPax
	 */
	public String getMarkerPax() {
		return markerPax;
	}
	/**
	 * @param markerPax the markerPax to set
	 */
	public void setMarkerPax(String markerPax) {
		this.markerPax = markerPax;
	}
	/**
	 * @return the markerSegment
	 */
	public String getMarkerSegment() {
		return markerSegment;
	}
	/**
	 * @param markerSegment the markerSegment to set
	 */
	public void setMarkerSegment(String markerSegment) {
		this.markerSegment = markerSegment;
	}
	/**
	 * @return the segmentSectionVO
	 */
	public List<SegmentSectionVO> getSegmentSectionVO() {
		return segmentSectionVO;
	}
	/**
	 * @param segmentSectionVO the segmentSectionVO to set
	 */
	public void setSegmentSectionVO(List<SegmentSectionVO> segmentSectionVO) {
		this.segmentSectionVO = segmentSectionVO;
	}
	/**
	 * @return the legSectionVO
	 */
	public List<LegSectionVO> getLegSectionVO() {
		return legSectionVO;
	}
	/**
	 * @param legSectionVO the legSectionVO to set
	 */
	public void setLegSectionVO(List<LegSectionVO> legSectionVO) {
		this.legSectionVO = legSectionVO;
	}
 	 
}