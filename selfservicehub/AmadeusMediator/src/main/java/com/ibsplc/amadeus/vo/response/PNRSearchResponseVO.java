package com.ibsplc.amadeus.vo.response;

public class PNRSearchResponseVO {

	private String pnrNumber;

	private String creatingOfficeId;

	private String officeId;

	/**
	 * @return the pnrNumber
	 */
	public String getPnrNumber() {
		return pnrNumber;
	}

	/**
	 * @param pnrNumber
	 *            the pnrNumber to set
	 */
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	/**
	 * @return the creatingOfficeId
	 */
	public String getCreatingOfficeId() {
		return creatingOfficeId;
	}

	/**
	 * @param creatingOfficeId
	 *            the creatingOfficeId to set
	 */
	public void setCreatingOfficeId(String creatingOfficeId) {
		this.creatingOfficeId = creatingOfficeId;
	}

	/**
	 * @return the officeId
	 */
	public String getOfficeId() {
		return officeId;
	}

	/**
	 * @param officeId
	 *            the officeId to set
	 */
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

}
