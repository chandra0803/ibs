package com.ibsplc.pushNotification.vo;

import java.util.List;

public class CabinTotalVO extends AbstractVO {

	private static final long serialVersionUID = 1L;
	/**
	 * Cabin data
	 */
	private CabinAndServiceDetailsVO cabin;
	/**
	 * Total Count
	 */
	private List<QuantityDetailsVO> totalCount;

	/**
	 * @return the cabin
	 */
	public CabinAndServiceDetailsVO getCabin() {
		return cabin;
	}

	/**
	 * @param cabin
	 *            the cabin to set
	 */
	public void setCabin(CabinAndServiceDetailsVO cabin) {
		this.cabin = cabin;
	}

	/**
	 * @return the totalCount
	 */
	public List<QuantityDetailsVO> getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount
	 *            the totalCount to set
	 */
	public void setTotalCount(List<QuantityDetailsVO> totalCount) {
		this.totalCount = totalCount;
	}

}
