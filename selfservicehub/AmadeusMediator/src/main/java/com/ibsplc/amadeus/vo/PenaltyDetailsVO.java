package com.ibsplc.amadeus.vo;

public class PenaltyDetailsVO extends AbstractVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String penaltyAmount;

	private String penaltyCurrency;

	/**
	 * @return the penaltyAmount
	 */
	public String getPenaltyAmount() {
		return penaltyAmount;
	}

	/**
	 * @param penaltyAmount
	 *            the penaltyAmount to set
	 */
	public void setPenaltyAmount(String penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

	/**
	 * @return the penaltyCurrency
	 */
	public String getPenaltyCurrency() {
		return penaltyCurrency;
	}

	/**
	 * @param penaltyCurrency
	 *            the penaltyCurrency to set
	 */
	public void setPenaltyCurrency(String penaltyCurrency) {
		this.penaltyCurrency = penaltyCurrency;
	}

}
