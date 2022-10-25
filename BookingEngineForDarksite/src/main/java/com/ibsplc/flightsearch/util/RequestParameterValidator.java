package com.ibsplc.flightsearch.util;


import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.service.impl.CommonServiceImpl;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.framework.exception.model.CustomException;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.flightsearch.vo.FlightSearchMobileVORequest;
import com.ibsplc.flightsearch.vo.FlightSearchMultiCityMobileRequest;
import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;

public class RequestParameterValidator {
	
	private static final Logger LOGGER = Log4j2Logger.create(CommonServiceImpl.class);
	
	public boolean isFlighSeachRequestParametersValid(FlightSearchRequestVO flightSearchRequestVO) {
 
		StringBuilder missingParameters = new StringBuilder("Parameters Missing:ReturnDate ");
		boolean isParametersValid = CommonKeys.TRUE;
 		
			if (!CommonsUtil.isStringValid(flightSearchRequestVO.getReturnDate())) {
	
				if(CommonsUtil.isStringValid(flightSearchRequestVO.getTripType())
					&& (flightSearchRequestVO.getTripType().equals(CommonKeys.TRIP_TYPE_ONE_WAY) 
						|| flightSearchRequestVO.getTripType().equals(CommonKeys.TRIP_TYPE_MULTI_CITY))){
							isParametersValid=CommonKeys.TRUE;
				}
				else{
					isParametersValid=CommonKeys.FALSE;
				}
			}

		if (!isParametersValid) {
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE, missingParameters.toString());
		}
		if (CommonsUtil.isStringValid(flightSearchRequestVO.getProduct())
				&& (flightSearchRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B))
				&& (!CommonsUtil.isStringValid(flightSearchRequestVO.getCorporateName()))) {
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE, "Parameters Missing:CorporateName ");
		}
 
		return CommonKeys.TRUE;

	}
	
	public boolean isFlightSeachMobileRequestParametersValid(FlightSearchMobileVORequest flightSearchMobileVORequest) {
		StringBuilder missingParameters = new StringBuilder("Parameters Missing:ReturnDate ");
		boolean isParametersValid = CommonKeys.TRUE;
 	
			if (!CommonsUtil.isStringValid(flightSearchMobileVORequest.getTrip_type())) {
	
				if(CommonsUtil.isStringValid(flightSearchMobileVORequest.getTrip_type())
					&& (flightSearchMobileVORequest.getTrip_type().equals(CommonKeys.TRIP_TYPE_ONE_WAY) 
						|| flightSearchMobileVORequest.getTrip_type().equals(CommonKeys.TRIP_TYPE_MULTI_CITY))){
							isParametersValid=CommonKeys.TRUE;
				}
				else{
					isParametersValid=CommonKeys.FALSE;
				}
			}

		if (!isParametersValid) {
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE, missingParameters.toString());
		}

		return CommonKeys.TRUE;

	}
	
	public boolean isFlightSeachMultiCityMobileRequestParametersValid(FlightSearchMultiCityMobileRequest flightSearchMultiCityMobileRequest) {
		StringBuilder missingParameters = new StringBuilder("Parameters Missing:ReturnDate ");
		boolean isParametersValid = CommonKeys.TRUE;
 		
			if (!CommonsUtil.isStringValid(flightSearchMultiCityMobileRequest.getTripType())) {
	
				if(CommonsUtil.isStringValid(flightSearchMultiCityMobileRequest.getTripType())
					&& (flightSearchMultiCityMobileRequest.getTripType().equals(CommonKeys.TRIP_TYPE_ONE_WAY) 
						|| flightSearchMultiCityMobileRequest.getTripType().equals(CommonKeys.TRIP_TYPE_MULTI_CITY))){
							isParametersValid=CommonKeys.TRUE;
				}
				else{
					isParametersValid=CommonKeys.FALSE;
				}
			}

		if (!isParametersValid) {
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE, missingParameters.toString());
		}

		return CommonKeys.TRUE;

	}
}
