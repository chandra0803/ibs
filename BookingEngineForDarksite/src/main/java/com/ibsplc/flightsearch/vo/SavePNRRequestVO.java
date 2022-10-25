package com.ibsplc.flightsearch.vo;

import java.io.Serializable; 
import com.ibsplc.common.vo.CommonRequestParametersVO;

public class SavePNRRequestVO extends CommonRequestParametersVO implements Serializable{
	  
		/**
		 * serial version ID
		 */
		private static final long serialVersionUID = 1L;
		
		/**
		 * EmailID
		 */	
		 
		private String emailID;	
		/**
		 * pnrNUm
		 */	
		 
		private String pnrNum;	
		/**
		 * Surname
		 */
	 
		private String surName;
		
		 
		private String requestTimeUTC;
		
		/**
		 * @return the requestTimeUTC
		 */
		public String getRequestTimeUTC() {
			return requestTimeUTC;
		}
		/**
		 * @param requestTimeUTC the requestTimeUTC to set
		 */
		public void setRequestTimeUTC(String requestTimeUTC) {
			this.requestTimeUTC = requestTimeUTC;
		}
		/**
		 * @return the emailID
		 */
		public String getEmailID() {
			return emailID;
		}
		/**
		 * @param emailID
		 *            the emailID to set
		 */
		public void setEmailID(String emailID) {
			this.emailID = emailID;
		}
		/**
		 * @return the pnrNum
		 */
		public String getPnrNum() {
			return pnrNum;
		}
		/**
		 * @param pnrNum
		 *            the pnrNum to set
		 */
		public void setPnrNum(String pnrNum) {
			this.pnrNum = pnrNum;
		}
		/**
		 * @return the surName
		 */
		public String getSurName() {
			return surName;
		}
		/**
		 * @param surName
		 *            the surName to set
		 */
		public void setSurName(String surName) {
			this.surName = surName;
		}
		
	}

