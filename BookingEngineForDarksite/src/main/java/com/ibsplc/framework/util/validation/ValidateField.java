package com.ibsplc.framework.util.validation;

/**
 * @author a-5316
 *
 */
public class ValidateField {

	private ValidateField() {
	}

	/**
	 * This is a pattern String specifically used for e-mail validation
	 */
	private static final String EMAIL_REGEX = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[_A-Za-z0-9-]+"
			+ "(\\.[A-Za-z0-9-]+)*(\\.[_A-Za-z0-9-]+)";

	/**
	 * Email Validation
	 * 
	 * @param value
	 * @return boolean     
	 */
	public static boolean validateEmail(String email) {
		boolean status = false;
		if (email != null && email.length() > 0 && email.matches(EMAIL_REGEX)) {
			status = true;
		}
		return status;
	}

}
