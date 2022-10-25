package com.ibsplc.pushNotification.vo;

public class OtherPaxDetailsVO {
	
	private String givenName;

	/**
	 * @return the givenName
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * @param givenName the givenName to set
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OtherPaxDetails [givenName=" + givenName + "]";
	}
	
	
}
