package com.ibsplc.pushNotification.vo;

public class ReservationVO {

		String controlNumber;

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

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Reservation [controlNumber=" + controlNumber + "]";
		}
		
		
}
