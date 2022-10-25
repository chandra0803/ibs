package com.ibsplc.common.persistence.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ibsplc.flightsearch.vo.AirLinkParameterMasterVO;
import com.ibsplc.flightsearch.vo.CitiesVO; 
import com.ibsplc.flightsearch.vo.ConfiguredPOSVO;
import com.ibsplc.flightsearch.vo.ERetailConfigVO;
import com.ibsplc.flightsearch.vo.FlexPricerDetails;
import com.ibsplc.flightsearch.vo.FlexPricerDetailsVO;
import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.ParameterMasterVO;
import com.ibsplc.flightsearch.vo.PosCityMasterVO;
import com.ibsplc.flightsearch.vo.PosDetailsVO;
import com.ibsplc.flightsearch.vo.PromoFaresVO;
import com.ibsplc.flightsearch.vo.RouteConfigVO;

/**
 * @author a-5316
 *
 */
public interface CommonDao { 
	
	public List<PosDetailsVO> getDefaultPosDetailsList(String country, String language) throws DataAccessException;

	public List<CitiesVO> getCityMasterEntities(String departureCity) throws DataAccessException;

	 
	public List<RouteConfigVO> getRouteConfigEntities(String origin, String destination, String productMasterCode)
			throws DataAccessException;

	public List<ConfiguredPOSVO> getConfiguredPOSList(String countryCode, String language, String productCode)
			throws DataAccessException;

	public List<AirLinkParameterMasterVO> getERetailConfigDetails() throws DataAccessException;

	public List<AirLinkParameterMasterVO> getERetailConfigDetailsWithMasterCode(String masterCode) throws DataAccessException;

	public List<FlexPricerDetailsVO> getFlexPricerDetailsList(String flexConfigName, String routeType)
			throws DataAccessException;
  
	public List<String> getAmadeusLanguageCode(String language) throws DataAccessException;

	public List<PromoFaresVO> getPromofareDetailsByFareCode(String promoCode) throws DataAccessException;

	public List<PosCityMasterVO> updateRequestWithPOSDetails(String product, String departureCity)
			throws DataAccessException;

	public List<ConfiguredPOSVO> getConfiguredPosDetails(String countryCode, String language)
			throws DataAccessException;

	public List<ConfiguredPOSVO> getRegionalCityList(String countryCode, String language, String product)
			throws DataAccessException;

	//public void deleteSessionDtl();

	public List<AirLinkParameterMasterVO> getPaymentTypesAllowed(final String language, final String posCity,
			final String productCode, final String departureDate, String sessionID) throws DataAccessException;

	List<CitiesVO> getCityMasterEntitiesByCountry(String country) throws DataAccessException;

	 

}
