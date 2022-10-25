package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class TailogServiceResponse implements Serializable{

	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String resultCode;
		private String resultMessage;
		private String updatedAfter;
		
		public String getResultCode() {
			return resultCode;
		}
		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}
		public String getResultMessage() {
			return resultMessage;
		}
		public void setResultMessage(String resultMessage) {
			this.resultMessage = resultMessage;
		}
		public String getUpdatedAfter() {
			return updatedAfter;
		}
		public void setUpdatedAfter(String updatedAfter) {
			this.updatedAfter = updatedAfter;
		}
		@Override
		public String toString() {
			return "TailogServiceResponse [resultCode=" + resultCode + ", resultMessage=" + resultMessage
					+ ", updatedAfter=" + updatedAfter + "]";
		}
	
	
}
