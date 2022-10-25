package com.ibsplc.common.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class SegmentInfoVO extends AbstractVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * bagagge allowance details
	 */
	private String bagaggeAllowance;
	/**
	 * getBagaggeAllowance
	 * 
	 * @return the bagaggeAllowance
	 */
	public String getBagaggeAllowance() {
		return bagaggeAllowance;
	}
	/**
	 * To set bagaggeAllowance
	 * 
	 * @param bagaggeAllowance
	 *            the bagaggeAllowance to set
	 */
	public void setBagaggeAllowance(String bagaggeAllowance) {
		this.bagaggeAllowance = bagaggeAllowance;
	}
	
}
