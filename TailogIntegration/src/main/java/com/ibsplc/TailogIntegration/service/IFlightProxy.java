package com.ibsplc.TailogIntegration.service;

import java.io.FileWriter;
import java.util.List;

import org.json.JSONObject;

import com.ibsplc.TailogIntegration.VO.IFlightLiteVO;
import com.ibsplc.TailogIntegration.VO.TailogResponse;
import com.ibsplc.TailogIntegration.VO.WSO2Response;

public interface IFlightProxy {

	//public void iFlightLiteWebServiceInvocation(TailogResponse tailogResponse);
	
	public void iFlightLiteWebServiceInvocation(WSO2Response wso2Response);
}
