package com.ibsplc.TailogIntegration.service;

import com.ibsplc.TailogIntegration.VO.TailogResponse;
import com.ibsplc.TailogIntegration.VO.WSO2Response;

public interface FuelPlusProxy {

	//void fuelPlusWebServiceInvocation(TailogResponse tailogResponse);
	
	void fuelPlusWebServiceInvocation(WSO2Response wso2Response);
}
