package com.ibsplc.amadeus.vo;

public class ReservationVO extends AbstractVO {
	
	private String companyId;
	private String controlNumber;
	private String controlType;
	
	
	/**
	 * @return the companyId
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * @return the controlNumber
	 */
	public String getControlNumber() {
		return controlNumber;
	}
	/**
	 * @param controlNumber the controlNumber to set
	 */
	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}
	/**
	 * @return the controlType
	 */
	public String getControlType() {
		return controlType;
	}
	/**
	 * @param controlType the controlType to set
	 */
	public void setControlType(String controlType) {
		this.controlType = controlType;
	}
	
	
}
