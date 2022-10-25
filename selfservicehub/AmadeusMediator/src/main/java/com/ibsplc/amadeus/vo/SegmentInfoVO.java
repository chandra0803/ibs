
package com.ibsplc.amadeus.vo;

import com.ibsplc.amadeus.vo.AbstractVO;

public class SegmentInfoVO extends AbstractVO {
	/**
	 * bagagge allowance details
	 */
	String bagaggeAllowance;

	/**
	 * get bagagge allowance
	 */
	public String getBagaggeAllowance() {
		return bagaggeAllowance;
	}

	/**
	 * Set bagaggage allowance
	 * 
	 * @param bagaggeAllowance
	 */
	public void setBagaggeAllowance(String bagaggeAllowance) {
		this.bagaggeAllowance = bagaggeAllowance;
	}

}
