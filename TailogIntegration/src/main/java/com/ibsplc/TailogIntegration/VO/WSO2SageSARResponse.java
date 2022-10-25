package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class WSO2SageSARResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SageSARServiceResponse sageSARServiceResponse;

	public SageSARServiceResponse getSageSARServiceResponse() {
		return sageSARServiceResponse;
	}

	public void setSageSARServiceResponse(SageSARServiceResponse sageSARServiceResponse) {
		this.sageSARServiceResponse = sageSARServiceResponse;
	}

	@Override
	public String toString() {
		return "WSO2SageSARResponse [SageSARServiceResponse=" + sageSARServiceResponse + "]";
	}

}
