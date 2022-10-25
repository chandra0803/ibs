package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RouteConfig implements Serializable {
 
 private static final long serialVersionUID = 1L;
		
	
	@ExcelCellName("FLEX CONFIG NAME") 
	private String flexConfigName; 
	
	@ExcelCellName("ROUTE OPERATIONAL") 
	private String isRouteConfigurational; 
	
	@ExcelCellName("AIRLINK ROUTE") 
	private String isAirlinkRoute;
	@ExcelRow                    
	private int rowIndex;
	
	@ExcelCellName("ORIGIN CODE") 
	private String origincode;
	
	@ExcelCellName("ORIGIN")    
	private String origin;
	
	@ExcelCellName("DESTINATION CODE")   
	private String destinationcode;
	
	@ExcelCellName("DESTINATION") 
	private String destination;	 
	
	@ExcelCellName("MULTICITY ENABLED") 
	private String multicityenabled;
	
	@ExcelCellName("DESTINATION ENABLED") 
	private String destinationenabled;
	
	@ExcelCellName("PREMIUM ECONOMY CLASS") 
	private String premiumeconomyclass;
	
	@ExcelCellName("BUSINESSCLASS") 
	private String businessclass;
	 
	
	@ExcelCellName("ORIGINAL PRODUCT CODE") 
	private String originalproductcode;
	
	
	@ExcelCellName("PRODUCT MASTERCODE") 
	private String productmastercode;
	
	@ExcelCellName("SET DIRECT TRIP") 
	private String directTrip;
	
	 

	/**
	 * @return the flexConfigName
	 */
	public String getFlexConfigName() {
		return flexConfigName;
	}



	/**
	 * @param flexConfigName the flexConfigName to set
	 */
	public void setFlexConfigName(String flexConfigName) {
		this.flexConfigName = flexConfigName;
	}



	/**
	 * @return the isRouteConfigurational
	 */
	public String getIsRouteConfigurational() {
		return isRouteConfigurational;
	}



	/**
	 * @param isRouteConfigurational the isRouteConfigurational to set
	 */
	public void setIsRouteConfigurational(String isRouteConfigurational) {
		this.isRouteConfigurational = isRouteConfigurational;
	}



	/**
	 * @return the isAirlinkRoute
	 */
	public String getIsAirlinkRoute() {
		return isAirlinkRoute;
	}



	/**
	 * @param isAirlinkRoute the isAirlinkRoute to set
	 */
	public void setIsAirlinkRoute(String isAirlinkRoute) {
		this.isAirlinkRoute = isAirlinkRoute;
	}



	/**
	 * @return the rowIndex
	 */
	public int getRowIndex() {
		return rowIndex;
	}



	/**
	 * @param rowIndex the rowIndex to set
	 */
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}



	/**
	 * @return the origincode
	 */
	public String getOrigincode() {
		return origincode;
	}



	/**
	 * @param origincode the origincode to set
	 */
	public void setOrigincode(String origincode) {
		this.origincode = origincode;
	}



	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}



	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}



	/**
	 * @return the destinationcode
	 */
	public String getDestinationcode() {
		return destinationcode;
	}



	/**
	 * @param destinationcode the destinationcode to set
	 */
	public void setDestinationcode(String destinationcode) {
		this.destinationcode = destinationcode;
	}



	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}



	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}



	/**
	 * @return the multicityenabled
	 */
	public String getMulticityenabled() {
		return multicityenabled;
	}



	/**
	 * @param multicityenabled the multicityenabled to set
	 */
	public void setMulticityenabled(String multicityenabled) {
		this.multicityenabled = multicityenabled;
	}



	/**
	 * @return the destinationenabled
	 */
	public String getDestinationenabled() {
		return destinationenabled;
	}



	/**
	 * @param destinationenabled the destinationenabled to set
	 */
	public void setDestinationenabled(String destinationenabled) {
		this.destinationenabled = destinationenabled;
	}



	/**
	 * @return the premiumeconomyclass
	 */
	public String getPremiumeconomyclass() {
		return premiumeconomyclass;
	}



	/**
	 * @param premiumeconomyclass the premiumeconomyclass to set
	 */
	public void setPremiumeconomyclass(String premiumeconomyclass) {
		this.premiumeconomyclass = premiumeconomyclass;
	}



	/**
	 * @return the businessclass
	 */
	public String getBusinessclass() {
		return businessclass;
	}



	/**
	 * @param businessclass the businessclass to set
	 */
	public void setBusinessclass(String businessclass) {
		this.businessclass = businessclass;
	}



	/**
	 * @return the originalproductcode
	 */
	public String getOriginalproductcode() {
		return originalproductcode;
	}



	/**
	 * @param originalproductcode the originalproductcode to set
	 */
	public void setOriginalproductcode(String originalproductcode) {
		this.originalproductcode = originalproductcode;
	}



	/**
	 * @return the productmastercode
	 */
	public String getProductmastercode() {
		return productmastercode;
	}



	/**
	 * @param productmastercode the productmastercode to set
	 */
	public void setProductmastercode(String productmastercode) {
		this.productmastercode = productmastercode;
	}



	/**
	 * @return the directTrip
	 */
	public String getDirectTrip() {
		return directTrip;
	}



	/**
	 * @param directTrip the directTrip to set
	 */
	public void setDirectTrip(String directTrip) {
		this.directTrip = directTrip;
	}



	@Override
	public String toString() {
		return "[rowIndex=" + rowIndex + ", ORIGINCODE=" + origincode + ", DESTINATION=" + destination + ", AIRLINKROUTE=" + isAirlinkRoute
				+ ", FLEXCONFIGNAME=" + flexConfigName + "]";
	}
		
	}
