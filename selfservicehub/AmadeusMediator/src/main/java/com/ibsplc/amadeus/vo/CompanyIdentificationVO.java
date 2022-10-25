package com.ibsplc.amadeus.vo;

public class CompanyIdentificationVO extends AbstractVO {
	
 private String  travelSector; 
 private String  companyCodeContext;
 private String  companyCode;
 private String  companyName;
 private String  accessLevel;
 
 
/**
 * @return the travelSector
 */
public String getTravelSector() {
	return travelSector;
}
/**
 * @param travelSector the travelSector to set
 */
public void setTravelSector(String travelSector) {
	this.travelSector = travelSector;
}
/**
 * @return the companyCodeContext
 */
public String getCompanyCodeContext() {
	return companyCodeContext;
}
/**
 * @param companyCodeContext the companyCodeContext to set
 */
public void setCompanyCodeContext(String companyCodeContext) {
	this.companyCodeContext = companyCodeContext;
}
/**
 * @return the companyCode
 */
public String getCompanyCode() {
	return companyCode;
}
/**
 * @param companyCode the companyCode to set
 */
public void setCompanyCode(String companyCode) {
	this.companyCode = companyCode;
}
/**
 * @return the companyName
 */
public String getCompanyName() {
	return companyName;
}
/**
 * @param companyName the companyName to set
 */
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
/**
 * @return the accessLevel
 */
public String getAccessLevel() {
	return accessLevel;
}
/**
 * @param accessLevel the accessLevel to set
 */
public void setAccessLevel(String accessLevel) {
	this.accessLevel = accessLevel;
}
 
 
}
