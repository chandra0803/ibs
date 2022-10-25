package com.ibsplc.reservation.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;



/**
 * @author a-5316
 *
 */
public class RetrievePNRResponseVO extends AbstractVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private AmadeusResponseVO amadeusResponse = new AmadeusResponseVO();

	public AmadeusResponseVO getAmadeusResponse() {
		return amadeusResponse;
	}

	public void setAmadeusResponse(AmadeusResponseVO amadeusResponse) {
		this.amadeusResponse = amadeusResponse;
	}

}
