package com.ibsplc.amadeus.vo;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*	*//**
			 * sessionId
			 *//*
			 * protected String sessionId=null;
			 */

	/**
	 * Logger
	 */
	private static final Log log = LogFactory.getLog(AbstractVO.class);

	/**
	 * Getter method of sessionId
	 * 
	 * @return the sessionId
	 */
	/*
	 * public String getSessionId() { return sessionId; }
	 * 
	 *//**
		 * Setter method of sessionId
		 * 
		 * @param sessionId
		 *            the sessionId to set
		 *//*
		 * public void setSessionId(String sessionId) { this.sessionId =
		 * sessionId; }
		 */

	/**
	 * The method to return the values of a VO.
	 */
	public String toString() {

		java.lang.reflect.Method[] methods = this.getClass().getMethods();
		int fieldCount = methods.length;
		StringBuffer sBuff = new StringBuffer();
		String methodName;
		String maskCC = null;
		String cardNum = null;
		String maskCVV = "";
		for (int i = 0; i < fieldCount; i++) {
			try {
				methodName = methods[i].getName();
				if (methodName.equalsIgnoreCase("getCreditCardNumber")) {
					cardNum = (String) methods[i].invoke(this, new Object[] {});
					// log.info("cardNum--"+cardNum);
					if (cardNum != null && cardNum.length() > 10) {
						maskCC = cardNum.substring(0, 4);
						for (int x = 4; x < cardNum.length() - 4; x++) {
							maskCC = maskCC.concat("X");
						}
						maskCC = maskCC.concat(cardNum.substring(cardNum.length() - 4, cardNum.length()));
						log.debug("maskCC--" + maskCC);
					}

					sBuff.append("\n").append(methodName).append("-->").append(maskCC);
				} else if (methodName.equalsIgnoreCase("getCvcNumber") || methodName.equalsIgnoreCase("getCvvNumber")) {
					String cvv = (String) methods[i].invoke(this, new Object[] {});
					// log.info("cvv--"+cvv);
					if (cvv != null && maskCVV != null) {
						for (int x = 0; x < cvv.length(); x++) {
							maskCVV = maskCVV.concat("X");
						}
					} else {
						maskCVV = null;
					}
					sBuff.append("\n").append(methodName).append("-->").append(maskCVV);
					log.debug("maskCVV--" + maskCVV);
				} else {
					if ((methodName.startsWith("get")) || (methodName.startsWith("is"))
							|| (methodName.startsWith("has"))) {

						sBuff.append("\n").append(methodName).append("-->")
								.append(methods[i].invoke(this, new Object[] {}));
					}
				}
			} catch (IllegalArgumentException e) {
				log.error("IllegalArgumentException--", e);
			} catch (IllegalAccessException e) {
				log.error("IllegalAccessException--", e);
			} catch (InvocationTargetException e) {
				log.error("InvocationTargetException --", e);
			}
		}
		return sBuff.toString();
	}
}
