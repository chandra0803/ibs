package com.ibsplc.flightsearch.vo;

import java.io.Serializable;


public class FlexPricerDetailsVO implements Serializable {	 
	
		private static final long serialVersionUID = 1L;
		
		
		private String flexConfigName;
		private String routeType;
		private String fareFamily1;
		private String fareFamily2;
		private String fareFamily3;
		private String pricingType;
		private String displayType;
		private String arrangeBy;
		private String dateRangeValue1;		
		private String dateRangeValue2;
		private String dateRangeQualifier1;
		private String dateRangeQualifier2; 
		private String fareFamilyMcity1;
		private String fareFamilyMcity3;
		private String fareFamilyMcity2;
		
		
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
		 * @return the routeType
		 */
		public String getRouteType() {
			return routeType;
		}
		/**
		 * @param routeType the routeType to set
		 */
		public void setRouteType(String routeType) {
			this.routeType = routeType;
		}
		/**
		 * @return the fareFamily1
		 */
		public String getFareFamily1() {
			return fareFamily1;
		}
		/**
		 * @param fareFamily1 the fareFamily1 to set
		 */
		public void setFareFamily1(String fareFamily1) {
			this.fareFamily1 = fareFamily1;
		}
		/**
		 * @return the fareFamily2
		 */
		public String getFareFamily2() {
			return fareFamily2;
		}
		/**
		 * @param fareFamily2 the fareFamily2 to set
		 */
		public void setFareFamily2(String fareFamily2) {
			this.fareFamily2 = fareFamily2;
		}
		/**
		 * @return the fareFamily3
		 */
		public String getFareFamily3() {
			return fareFamily3;
		}
		/**
		 * @param fareFamily3 the fareFamily3 to set
		 */
		public void setFareFamily3(String fareFamily3) {
			this.fareFamily3 = fareFamily3;
		}
		/**
		 * @return the pricingType
		 */
		public String getPricingType() {
			return pricingType;
		}
		/**
		 * @param pricingType the pricingType to set
		 */
		public void setPricingType(String pricingType) {
			this.pricingType = pricingType;
		}
		/**
		 * @return the displayType
		 */
		public String getDisplayType() {
			return displayType;
		}
		/**
		 * @param displayType the displayType to set
		 */
		public void setDisplayType(String displayType) {
			this.displayType = displayType;
		}
		/**
		 * @return the arrangeBy
		 */
		public String getArrangeBy() {
			return arrangeBy;
		}
		/**
		 * @param arrangeBy the arrangeBy to set
		 */
		public void setArrangeBy(String arrangeBy) {
			this.arrangeBy = arrangeBy;
		}
		/**
		 * @return the dateRangeValue1
		 */
		public String getDateRangeValue1() {
			return dateRangeValue1;
		}
		/**
		 * @param dateRangeValue1 the dateRangeValue1 to set
		 */
		public void setDateRangeValue1(String dateRangeValue1) {
			this.dateRangeValue1 = dateRangeValue1;
		}
		/**
		 * @return the dateRangeValue2
		 */
		public String getDateRangeValue2() {
			return dateRangeValue2;
		}
		/**
		 * @param dateRangeValue2 the dateRangeValue2 to set
		 */
		public void setDateRangeValue2(String dateRangeValue2) {
			this.dateRangeValue2 = dateRangeValue2;
		}
		/**
		 * @return the dateRangeQualifier1
		 */
		public String getDateRangeQualifier1() {
			return dateRangeQualifier1;
		}
		/**
		 * @param dateRangeQualifier1 the dateRangeQualifier1 to set
		 */
		public void setDateRangeQualifier1(String dateRangeQualifier1) {
			this.dateRangeQualifier1 = dateRangeQualifier1;
		}
		/**
		 * @return the dateRangeQualifier2
		 */
		public String getDateRangeQualifier2() {
			return dateRangeQualifier2;
		}
		/**
		 * @param dateRangeQualifier2 the dateRangeQualifier2 to set
		 */
		public void setDateRangeQualifier2(String dateRangeQualifier2) {
			this.dateRangeQualifier2 = dateRangeQualifier2;
		}
		/**
		 * @return the fareFamilyMcity1
		 */
		public String getFareFamilyMcity1() {
			return fareFamilyMcity1;
		}
		/**
		 * @param fareFamilyMcity1 the fareFamilyMcity1 to set
		 */
		public void setFareFamilyMcity1(String fareFamilyMcity1) {
			this.fareFamilyMcity1 = fareFamilyMcity1;
		}
		/**
		 * @return the fareFamilyMcity3
		 */
		public String getFareFamilyMcity3() {
			return fareFamilyMcity3;
		}
		/**
		 * @param fareFamilyMcity3 the fareFamilyMcity3 to set
		 */
		public void setFareFamilyMcity3(String fareFamilyMcity3) {
			this.fareFamilyMcity3 = fareFamilyMcity3;
		}
		/**
		 * @return the fareFamilyMcity2
		 */
		public String getFareFamilyMcity2() {
			return fareFamilyMcity2;
		}
		/**
		 * @param fareFamilyMcity2 the fareFamilyMcity2 to set
		 */
		public void setFareFamilyMcity2(String fareFamilyMcity2) {
			this.fareFamilyMcity2 = fareFamilyMcity2;
		}
		
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "FlexPricerDetailsVO [flexConfigName=" + flexConfigName + ", routeType=" + routeType
					+ ", fareFamily1=" + fareFamily1 + ", fareFamily2=" + fareFamily2 + ", fareFamily3=" + fareFamily3
					+ ", pricingType=" + pricingType + ", displayType=" + displayType + ", arrangeBy=" + arrangeBy
					+ ", dateRangeValue1=" + dateRangeValue1 + ", dateRangeValue2=" + dateRangeValue2
					+ ", dateRangeQualifier1=" + dateRangeQualifier1 + ", dateRangeQualifier2=" + dateRangeQualifier2
					+ ", fareFamilyMcity1=" + fareFamilyMcity1 + ", fareFamilyMcity3=" + fareFamilyMcity3
					+ ", fareFamilyMcity2=" + fareFamilyMcity2 + "]";
		}
		 
		
	}

