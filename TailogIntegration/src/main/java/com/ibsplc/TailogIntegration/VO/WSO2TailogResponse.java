package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class WSO2TailogResponse extends AbstractVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TailogServiceResponse TailogServiceResponse;

	public TailogServiceResponse getTailogServiceResponse() {
		return TailogServiceResponse;
	}

	public void setTailogServiceResponse(TailogServiceResponse TailogServiceResponse) {
		this.TailogServiceResponse = TailogServiceResponse;
	}

	@Override
	public String toString() {
		return "WSO2TailogResponse [TailogServiceResponse=" + TailogServiceResponse + "]";
	}
	
}
