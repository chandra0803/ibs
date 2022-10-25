/**
 * 
 */
package com.ibsplc.common.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-7352
 *
 */
public class PenaltyDetailsVO extends AbstractVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal penaltyAmount;
	
	private String penaltyCurrency;

	/**
	 * @return the penaltyAmount
	 */
	public BigDecimal getPenaltyAmount() {
		return penaltyAmount;
	}

	/**
	 * @param penaltyAmount the penaltyAmount to set
	 */
	public void setPenaltyAmount(BigDecimal penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

	/**
	 * @return the penaltyCurrency
	 */
	public String getPenaltyCurrency() {
		return penaltyCurrency;
	}

	/**
	 * @param penaltyCurrency the penaltyCurrency to set
	 */
	public void setPenaltyCurrency(String penaltyCurrency) {
		this.penaltyCurrency = penaltyCurrency;
	}

	
}
