package com.ibsplc.amadeus.vo;

import com.ibsplc.amadeus.vo.AbstractVO;

public class ParameterVO extends AbstractVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This field represents the master code
	 */
	private String masterCode;

	/**
	 * This field represents the description of the master code
	 */
	private String masterDescription;

	/**
	 * Getting masterCode
	 * 
	 * @return the masterCode
	 */
	public String getMasterCode() {
		return masterCode;
	}

	/**
	 * To set masterCode
	 * 
	 * @param masterCode
	 *            the masterCode to set
	 */
	public void setMasterCode(String masterCode) {
		this.masterCode = masterCode;
	}

	/**
	 * Getting masterDescription
	 * 
	 * @return the masterDescription
	 */
	public String getMasterDescription() {
		return masterDescription;
	}

	/**
	 * To set masterDescription
	 * 
	 * @param masterDescription
	 *            the masterDescription to set
	 */
	public void setMasterDescription(String masterDescription) {
		this.masterDescription = masterDescription;
	}

}