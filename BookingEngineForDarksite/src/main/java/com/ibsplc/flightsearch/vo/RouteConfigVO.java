package com.ibsplc.flightsearch.vo;

import java.io.Serializable;
import java.util.Date;

public class RouteConfigVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String flexConfigName;
	private String isRedirectedToSAA;
	private String threeDsecuredEnabled;
	private String isRouteConfigurational;
	private Date effectiveDate;
	private String origin;
	private String destination;
	private String productMasterCode;
	private String isMulticityEnabled;
	private String isDestinationEnabled; 
	private String isAirlinkRoute;
	private String isBusinessClass;
	private String isRouteOperational;
	private String isPremiumEnabled;
	//private String 4z_live_date;
	private String isSetDirectTrip;
	
	//HD-316604 -Removing 'Redirect to SAA' and '4Z live date' in admin tool by A-10261
			/*private Date effectiveDate;
			private String isRedirectedToSAA;*/
			// HD-316604 Ends
	
	//Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request Parameter -- start
	
 
	
	public String getIsAirlinkRoute() {
		return isAirlinkRoute;
	}

	public void setIsAirlinkRoute(String isAirlinkRoute) {
		this.isAirlinkRoute = isAirlinkRoute;
	}
	
	//Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request Parameter -- end

	//Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request Parameter -- start
			private String isDirectTrip;
			
			
			
			public String getIsDirectTrip() {
				return isDirectTrip;
			}

			public void setIsDirectTrip(String isDirectTrip) {
				this.isDirectTrip = isDirectTrip;
			}
			//Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request Parameter -- End
	/**
	 * @return the flexConfigName
	 */
	public String getFlexConfigName() {
		return flexConfigName;
	}

	/**
	 * @param flexConfigName
	 *            the flexConfigName to set
	 */
	public void setFlexConfigName(String flexConfigName) {
		this.flexConfigName = flexConfigName;
	}
 

	/**
	 * @return the flexConfigName
	 */
	public String getIsRedirectedToSAA() {
		return isRedirectedToSAA;
	}

	/**
	 * @param flexConfigName
	 *            the flexConfigName to set
	 */
	public void setIsRedirectedToSAA(String isRedirectedToSAA) {
		this.isRedirectedToSAA = isRedirectedToSAA;
	}

	/**
	 * @return the threeDsecuredEnabled
	 */
	/*
	 * Commented on 08/09/2020 -- start
	 * 
	public String getThreeDsecuredEnabled() {
		return threeDsecuredEnabled;
	}
	*/

	/**
	 * @param threeDsecuredEnabled
	 *            the threeDsecuredEnabled to set
	 */
	/*
	 *
	public void setThreeDsecuredEnabled(String threeDsecuredEnabled) {
		this.threeDsecuredEnabled = threeDsecuredEnabled;
	}
	*
	*Commented on 08/09/2020 -- end
	*/
	  

		//HD-316604 Ends

	/**
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate() {
		return effectiveDate == null ? null : (Date) effectiveDate.clone();
	}

	/**
	 * @param effectiveDate
	 *            the effectiveDate to set
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate == null ? null : (Date) effectiveDate.clone();
	}

	/*
	 * Added on 08/09/2020 -- start
	 */
	public String getIsRouteConfigurational() {
		return isRouteConfigurational;
	}

	public void setIsRouteConfigurational(String isRouteConfigurational) {
		this.isRouteConfigurational = isRouteConfigurational;
	}

	/**
	 * @return the threeDsecuredEnabled
	 */
	public String getThreeDsecuredEnabled() {
		return threeDsecuredEnabled;
	}

	/**
	 * @param threeDsecuredEnabled the threeDsecuredEnabled to set
	 */
	public void setThreeDsecuredEnabled(String threeDsecuredEnabled) {
		this.threeDsecuredEnabled = threeDsecuredEnabled;
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
	 * @return the productMasterCode
	 */
	public String getProductMasterCode() {
		return productMasterCode;
	}

	/**
	 * @param productMasterCode the productMasterCode to set
	 */
	public void setProductMasterCode(String productMasterCode) {
		this.productMasterCode = productMasterCode;
	}

	/**
	 * @return the isMulticityEnabled
	 */
	public String getIsMulticityEnabled() {
		return isMulticityEnabled;
	}

	/**
	 * @param isMulticityEnabled the isMulticityEnabled to set
	 */
	public void setIsMulticityEnabled(String isMulticityEnabled) {
		this.isMulticityEnabled = isMulticityEnabled;
	}

	/**
	 * @return the isDestinationEnabled
	 */
	public String getIsDestinationEnabled() {
		return isDestinationEnabled;
	}

	/**
	 * @param isDestinationEnabled the isDestinationEnabled to set
	 */
	public void setIsDestinationEnabled(String isDestinationEnabled) {
		this.isDestinationEnabled = isDestinationEnabled;
	}

	/**
	 * @return the isBusinessClass
	 */
	public String getIsBusinessClass() {
		return isBusinessClass;
	}

	/**
	 * @param isBusinessClass the isBusinessClass to set
	 */
	public void setIsBusinessClass(String isBusinessClass) {
		this.isBusinessClass = isBusinessClass;
	}

	/**
	 * @return the isRouteOperational
	 */
	public String getIsRouteOperational() {
		return isRouteOperational;
	}

	/**
	 * @param isRouteOperational the isRouteOperational to set
	 */
	public void setIsRouteOperational(String isRouteOperational) {
		this.isRouteOperational = isRouteOperational;
	}

	/**
	 * @return the isPremiumEnabled
	 */
	public String getIsPremiumEnabled() {
		return isPremiumEnabled;
	}

	/**
	 * @param isPremiumEnabled the isPremiumEnabled to set
	 */
	public void setIsPremiumEnabled(String isPremiumEnabled) {
		this.isPremiumEnabled = isPremiumEnabled;
	}

	/**
	 * @return the isSetDirectTrip
	 */
	public String getIsSetDirectTrip() {
		return isSetDirectTrip;
	}

	/**
	 * @param isSetDirectTrip the isSetDirectTrip to set
	 */
	public void setIsSetDirectTrip(String isSetDirectTrip) {
		this.isSetDirectTrip = isSetDirectTrip;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RouteConfigVO [flexConfigName=" + flexConfigName + ", isRedirectedToSAA=" + isRedirectedToSAA
				+ ", threeDsecuredEnabled=" + threeDsecuredEnabled + ", isRouteConfigurational="
				+ isRouteConfigurational + ", effectiveDate=" + effectiveDate + ", origin=" + origin + ", destination="
				+ destination + ", productMasterCode=" + productMasterCode + ", isMulticityEnabled="
				+ isMulticityEnabled + ", isDestinationEnabled=" + isDestinationEnabled + ", isAirlinkRoute="
				+ isAirlinkRoute + ", isBusinessClass=" + isBusinessClass + ", isRouteOperational=" + isRouteOperational
				+ ", isPremiumEnabled=" + isPremiumEnabled + ", isSetDirectTrip=" + isSetDirectTrip + ", isDirectTrip="
				+ isDirectTrip + "]";
	}
 
	 
}
