package com.ibsplc.amadeus.vo;

public class LocationInfoVO extends AbstractVO {
	private String locationType;
	private LocationDescriptionVO locationDescriptionVO;
	private FirstLocationDetailsVO firstLocationDetailsVO;
	
	
	/**
	 * @return the locationType
	 */
	public String getLocationType() {
		return locationType;
	}
	/**
	 * @param locationType the locationType to set
	 */
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	/**
	 * @return the locationDescriptionVO
	 */
	public LocationDescriptionVO getLocationDescriptionVO() {
		return locationDescriptionVO;
	}
	/**
	 * @param locationDescriptionVO the locationDescriptionVO to set
	 */
	public void setLocationDescriptionVO(LocationDescriptionVO locationDescriptionVO) {
		this.locationDescriptionVO = locationDescriptionVO;
	}
	/**
	 * @return the firstLocationDetailsVO
	 */
	public FirstLocationDetailsVO getFirstLocationDetailsVO() {
		return firstLocationDetailsVO;
	}
	/**
	 * @param firstLocationDetailsVO the firstLocationDetailsVO to set
	 */
	public void setFirstLocationDetailsVO(FirstLocationDetailsVO firstLocationDetailsVO) {
		this.firstLocationDetailsVO = firstLocationDetailsVO;
	}
	
	
	 

}
