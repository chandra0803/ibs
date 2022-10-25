package com.ibsplc.flightsearch.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.controller.CommonController;
import com.ibsplc.common.service.CommonService;
import com.ibsplc.flightsearch.service.FlightSearchService;
import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchMultiCityMobileRequest;
import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchResponseVO;
import com.ibsplc.flightsearch.vo.FlightSearchVO;
import com.ibsplc.flightsearch.vo.RequestParams;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.framework.util.security.JwtUtil;

/**
 * @author a-5316
 *
 */
@CrossOrigin
@RestController

public class FlightSearchController extends CommonController {

	private static final Logger LOGGER = Log4j2Logger.create(FlightSearchController.class);
	@Autowired
	private CommonService commonService;
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private FlightSearchService flightSearchService;
	@Autowired
	JwtUtil jwtUtil; // added for security authentication
	// added for FOA
	public static final String E_RETAIL_PROPERTIES = "eRetail.properties";
	private static Properties eRetailSpecProperties;
	private static final String FOA_REDIRECT_URL = "FOA_REDIRECT_URL";

	private static final String SESSION_ID_MANDATORY = "SessionID is mandatory";
	 final HttpClient httpClient = HttpClientBuilder.create().setRedirectStrategy(new LaxRedirectStrategy()).build(); //org.apache.httpcomponents 
		
  
	/**
	 * Method which invokes the flightSearch service to build the Amadeus
	 * redirection Url for one way and round trips
	 * 
	 * return flightSearchMap
	 */
 
	@RequestMapping(value = { "/flightSearch" }, method = { RequestMethod.POST })
	public Map<String, FlightSearchResponseVO> flightSearch(
			@Valid @RequestBody FlightSearchRequestVO flightSearchRequestVO, Errors errors) {

		LOGGER.info("Starting flightSearch API");		
		 
		Map<String, FlightSearchResponseVO> flightSearchMap = new HashMap<String, FlightSearchResponseVO>();
		FlightSearchResponseVO flightSearchResponseVO = new FlightSearchResponseVO();

		checkIfErrorExists(errors);
		setCommonRequestObjects(flightSearchRequestVO, request);
		setCommonSessionObjects(flightSearchRequestVO);
		LOGGER.info("sessionObj PRDT :" + flightSearchRequestVO.getSessionObj().getProduct() + " LOC :"
				+ flightSearchRequestVO.getSessionObj().getLanguage() + "Country: "
				+ flightSearchRequestVO.getSessionObj().getCountry());
		LOGGER.info(" Session Id: " + getSessionId() + " Request params:  " + flightSearchRequestVO.toString());
		Map<String, Object> flexPricerMap = commonService.getFlightSearchServiceParametersList(flightSearchRequestVO);
		//FlexPricerRequestVO flexPricerRequestVO = (FlexPricerRequestVO) flexPricerMap.get("FlexPricerRequestVO");
	 
		String url = (String) flexPricerMap.get("flightSearchRedirectURL");
		/*Gson gson = new Gson();
		String json = null;

		try {
			 
			json = gson.toJson(flexPricerRequestVO);
		} catch (Exception e) {
			LOGGER.info("Exception occured while converting FlexPricerRequestVO to String : " + e);
		}

		LOGGER.info("FlexPricerRequestVO string : " + json); 
		setSessionValue(CommonKeys.FLEX_PRICER_REQUEST_VO, json);*/
 
		commonService.getCommonResponseBody(CommonKeys.CHAR_Y, getSessionId(),
				flightSearchRequestVO.getClientSessionId(), flightSearchResponseVO);
		flightSearchResponseVO.setFlightSearchRedirectUrl(url);	 
		flightSearchResponseVO.setIsRedirectedToSAA(CommonKeys.FALSE);		
		flightSearchMap.put("FlightSearchResponse", flightSearchResponseVO);
		LOGGER.info("final URL: " + flightSearchMap.get(flightSearchResponseVO));
		return flightSearchMap;
	}

	/**
	 * Method which invokes the multicityFlightSearchService to build the
	 * Amadeus redirection Url for multicity trips
	 * 
	 * return flightSearchMap
	 */
	@RequestMapping(value = { "/multicityFlightSearchService" }, method = { RequestMethod.POST })
	public Map<String, FlightSearchResponseVO> multiCityFlightSearchService(
			@Valid @RequestBody FlightSearchRequestVO flightSearchRequestVO, Errors errors) {
		FlightSearchResponseVO flightSearchResponseVO = new FlightSearchResponseVO();
		Map<String, FlightSearchResponseVO> flightSearchMap = new HashMap<String, FlightSearchResponseVO>();
		checkIfErrorExists(errors);
		LOGGER.info("Start MulticityFlightSearchService");
		LOGGER.info("Multi city flight search request : " + flightSearchRequestVO.toString());
		setCommonRequestObjects(flightSearchRequestVO, request);
		setCommonSessionObjects(flightSearchRequestVO);
		LOGGER.info("MulticitysessionObj PRDT :" + flightSearchRequestVO.getSessionObj().getProduct() + " LOC :"
				+ flightSearchRequestVO.getSessionObj().getLanguage() + " Country: "
				+ flightSearchRequestVO.getSessionObj().getCountry());

		LOGGER.info("MLTCTY Session Id: " + getSessionId() + " MLTCTY Request params:  "
				+ flightSearchRequestVO.toString());
		Map<String, Object> multiCityflexPricerMap = commonService
				.getMultiCityFlightSearchServiceParametersList(flightSearchRequestVO);
		FlexPricerRequestVO flexPricerRequestVO = (FlexPricerRequestVO) multiCityflexPricerMap
				.get("FlexPricerRequestVO");
		String url = (String) multiCityflexPricerMap.get("flightSearchRedirectURL");

		 //setSessionValue(CommonKeys.FLEX_PRICER_REQUEST_VO,flexPricerRequestVO);

		/*Gson gson = null;
		String json = null;

		try {
			// gson = new Gson();
			gson = new GsonBuilder().serializeNulls().create();
			json = gson.toJson(flexPricerRequestVO);
		} catch (Exception e) {
			LOGGER.info("Exception occured while converting FlexPricerRequestVO to String : " + e);
		}

		setSessionValue(CommonKeys.FLEX_PRICER_REQUEST_VO, json);*/

		commonService.getCommonResponseBody(CommonKeys.CHAR_Y, getSessionId(),
				flightSearchRequestVO.getClientSessionId(), flightSearchResponseVO);
		flightSearchResponseVO.setFlightSearchRedirectUrl(url);
		// HD-316604 -Removing 'Redirect to SAA' and '4Z live date' in admin
		// tool by A-10261
		// flightSearchResponseVO.setIsRedirectedToSAA(flexPricerRequestVO.IsRedirectedToSAA());
		flightSearchResponseVO.setIsRedirectedToSAA(CommonKeys.FALSE);
		// change end HD-316604
		// flightSearchResponseVO.setIsRedirectedToSAA(flexPricerRequestVO.IsRedirectedToSAA());
		flightSearchMap.put("FlightSearchResponse", flightSearchResponseVO);
		LOGGER.info("flightSearchResponseVO: " + flightSearchResponseVO);
		return flightSearchMap;

	} 

	/**
	 * Method which invokes the populateFlightSearch service populate values
	 * redirection Url for one way and round trips
	 * 
	 * return flightSearchMap
	 * 
	 * @throws ParseException
	 */
	/*@RequestMapping(value = { "/populateFlightSearch" }, method = { RequestMethod.POST })
	public Map<String, FlexPricerResponseVO> populateFlightSearch(
			@Valid @RequestBody CommonRequestParametersVO commonRequestParametersVO, Errors errors) {
		String headerSessionId = request.getHeader("session_id");
		if (headerSessionId != null) {
			LOGGER.info("populateFlightSearch ");
			Map<String, FlexPricerResponseVO> flightSearchMap = new HashMap<String, FlexPricerResponseVO>();
			
			 * FlexPricerRequestVO flexPricerRequestVO = (FlexPricerRequestVO)
			 * getSessionValues( CommonKeys.FLEX_PRICER_REQUEST_VO);
			 
			String jsonString = getSessionValues(CommonKeys.FLEX_PRICER_REQUEST_VO);
			Gson gson = null;
			FlexPricerRequestVO flexPricerRequestVO = null;

			try {

				gson = new GsonBuilder().serializeNulls().create();
				flexPricerRequestVO = gson.fromJson(jsonString, FlexPricerRequestVO.class);

			} catch (Exception e) {

				LOGGER.info("Exception occured while converting json string to FlexPricerRequestVO : "
						+ flexPricerRequestVO.toString());
			}
			if (flexPricerRequestVO == null) {
				throw new CustomException(CommonKeys.ERROR_RESULT_CODE, CommonKeys.INVALID_SESSION);
			} else {
				FlexPricerResponseVO flexPricerResponseVO = new FlexPricerResponseVO();
				try {
					if (flexPricerRequestVO.getTripType().equalsIgnoreCase("M")) {
						String[] departureDateArray = flexPricerRequestVO.getDepartureDate()
								.split(CommonKeys.MULTICITY_SPLITTER_REGEX);
						String formatedDate = null;
						for (int i = 0; i < departureDateArray.length; i++) {

							if (i == 0)
								formatedDate = DateUtilities.parseAmadeusFormat(departureDateArray[i]);
							else
								formatedDate += DateUtilities.parseAmadeusFormat(departureDateArray[i]);
							if (i + 1 < departureDateArray.length)
								formatedDate += ",";

						}
						flexPricerResponseVO.setDepartureDate(formatedDate);
					} else
						flexPricerResponseVO.setDepartureDate(
								DateUtilities.parseAmadeusFormat(flexPricerRequestVO.getDepartureDate()));
					LOGGER.info("DepartureDate:"
							+ DateUtilities.parseAmadeusFormat(flexPricerRequestVO.getDepartureDate()));

					if (flexPricerRequestVO.getTripType() != null && "R".equals(flexPricerRequestVO.getTripType())) {
						flexPricerResponseVO
								.setReturnDate(DateUtilities.parseAmadeusFormat(flexPricerRequestVO.getReturnDate()));
						LOGGER.info(
								"ReturnDate:" + DateUtilities.parseAmadeusFormat(flexPricerRequestVO.getReturnDate()));
					}
				} catch (ParseException e) {
					LOGGER.error("Error occured in DateUtilities.parseAmadeusFormat method");
				}

				LOGGER.info("Cabin class : " + flexPricerRequestVO.getCabinClass() + ", ");
				flexPricerResponseVO.setCabinClass(flexPricerRequestVO.getCabinClass());
				flexPricerResponseVO.setDepartureCity(flexPricerRequestVO.getDepartureCity());
				// A-10083 0n 17/02/2022
				flexPricerResponseVO.setYoungAdultCount(flexPricerRequestVO.getYoungAdultCount());

				flexPricerResponseVO.setAdultCount(flexPricerRequestVO.getAdultCount());
				flexPricerResponseVO.setChildCount(flexPricerRequestVO.getChildCount());
				flexPricerResponseVO.setInfantCount(flexPricerRequestVO.getInfantCount());
				flexPricerResponseVO.setDestinationCity(flexPricerRequestVO.getDestinationCity());

				if (flexPricerRequestVO.getPromoCode() != null && "232323".equals(flexPricerRequestVO.getPromoCode())) {
					flexPricerResponseVO.setPromoCode("");
				} else {
					flexPricerResponseVO.setPromoCode(flexPricerRequestVO.getPromoCode());
				}
				flexPricerResponseVO.setTripType(flexPricerRequestVO.getTripType());
				*//**
				 * to check if its a foa booking session
				 *//*
				String productIdString = getSessionValues("LOGGED_IN_PRODUCT");
				if (CommonsUtil.isStringValid(productIdString) && productIdString.equalsIgnoreCase("B2B")) {

					eRetailSpecProperties = FileReader.getProperties(E_RETAIL_PROPERTIES);
					flexPricerResponseVO.setRedirectUrl(eRetailSpecProperties.getProperty(FOA_REDIRECT_URL));
				}

				flightSearchMap.put("FlexPricerResponseVO", flexPricerResponseVO);
				return flightSearchMap;
			}
		} else {
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE, SESSION_ID_MANDATORY);
		}
	}*/

	/**
	 * Added by Athia Mary Ivan Code to check if the selected flight route is a
	 * domestic or regional route
	 ***/
	@RequestMapping(value = { "/checkIfDomesticOrRegional" }, method = { RequestMethod.POST })
	public Map<String, String> checkIfDomesticOrRegional(
			@Valid @RequestBody FlightSearchRequestVO flightSearchRequestVO, Errors errors) {

		LOGGER.info("In FlightSearchController " + "checkIfDomesticOrRegional ");
		try {
			FlightSearchVO flightSearchVO = new FlightSearchVO();
			setCommonSessionObjects(flightSearchRequestVO);
			LOGGER.info("sessionObj PRDT :" + flightSearchRequestVO.getSessionObj().getProduct() + " LOC :"
					+ flightSearchRequestVO.getSessionObj().getLanguage() + " Country: "
					+ flightSearchRequestVO.getSessionObj().getCountry());
			LOGGER.info(" Session Id: " + getSessionId() + " Request params:  " + flightSearchRequestVO.toString());
			flightSearchVO = flightSearchService.mapIsDomesticorRegional(flightSearchRequestVO);
			Map<String, String> resultMap = new HashMap<>();

			if (flightSearchVO.isDomesticFlight())
				resultMap.put("Response", "Domestic");
			else if (flightSearchVO.isRegionalFlight())
				resultMap.put("Response", "Regional");
			return resultMap;

		} catch (Exception e) {
			LOGGER.info("Exception occured in the method checkIfDomesticOrRegional in FlightSearchController "+e.getMessage());
		}
		return null;
	}

 
	private FlightSearchMultiCityMobileRequest createFlightSearchMultiCityMobileVORequest(RequestParams params) {

		FlightSearchMultiCityMobileRequest flightSearchMobileVORequest = new FlightSearchMultiCityMobileRequest();

		// Added on 10/12/2020 by A-8986 for mobile api request -- start
		if (params.getCountry_site().trim() != null && params.getCountry_site().trim().equalsIgnoreCase("ZA"))
			flightSearchMobileVORequest.setCountry(params.getCountry_site());
		else
			flightSearchMobileVORequest.setCountry("ZA");

		if (params.getLanguage().trim() != null && params.getLanguage().trim().equalsIgnoreCase("GB"))
			flightSearchMobileVORequest.setLanguage("EN");
		else
			flightSearchMobileVORequest.setLanguage(params.getLanguage().trim());
		// Added on 10/12/2020 by A-8986 for mobile api request -- end

		flightSearchMobileVORequest.setProduct("LRB");
		if (params.getAppv() != null)
			flightSearchMobileVORequest.setAppv(params.getAppv());
		if (params.getB_date_1() != null)
			flightSearchMobileVORequest.setbDate1(params.getB_date_1());
		if (params.getB_date_2() != null)
			flightSearchMobileVORequest.setbDate2(params.getB_date_2());
		if (params.getbDate3() != null)
			flightSearchMobileVORequest.setbDate3(params.getbDate3());
		if (params.getbDate4() != null)
			flightSearchMobileVORequest.setbDate4(params.getbDate4());
		if (params.getbDate5() != null)
			flightSearchMobileVORequest.setbDate5(params.getbDate5());
		if (params.getbDate6() != null)
			flightSearchMobileVORequest.setbDate6(params.getbDate6());

		if (params.getB_location_1() != null)
			flightSearchMobileVORequest.setbLocation1(params.getB_location_1());
		if (params.getB_location_2() != null)
			flightSearchMobileVORequest.setbLocation2(params.getB_location_2());
		if (params.getbLocation3() != null)
			flightSearchMobileVORequest.setbLocation3(params.getbLocation3());
		if (params.getbLocation4() != null)
			flightSearchMobileVORequest.setbLocation4(params.getbLocation4());
		if (params.getbLocation5() != null)
			flightSearchMobileVORequest.setbLocation5(params.getbLocation5());
		if (params.getbLocation6() != null)
			flightSearchMobileVORequest.setbLocation6(params.getbLocation6());
		if (params.getCabin_class() != null)
			flightSearchMobileVORequest.setCabinClass(params.getCabin_class());
		else if (params.getCabin() != null)
			flightSearchMobileVORequest.setCabinClass(params.getCabin());

		if (params.getDate_range_qualifier_1() != null)
			flightSearchMobileVORequest.setDateRangeQualifier1(params.getDate_range_qualifier_1());

		if (params.getDate_range_value_1() != null)
			flightSearchMobileVORequest.setDateRangeValue1(params.getDate_range_value_1());

		if (params.getE_location_1() != null)
			flightSearchMobileVORequest.seteLocation1(params.getE_location_1());
		if (params.getE_location_2() != null)
			flightSearchMobileVORequest.seteLocation2(params.getE_location_2());
		if (params.geteLocation3() != null)
			flightSearchMobileVORequest.seteLocation3(params.geteLocation3());
		if (params.geteLocation4() != null)
			flightSearchMobileVORequest.seteLocation4(params.geteLocation4());
		if (params.geteLocation5() != null)
			flightSearchMobileVORequest.seteLocation5(params.geteLocation5());
		if (params.geteLocation6() != null)
			flightSearchMobileVORequest.seteLocation6(params.geteLocation6());
		if (params.getHas_infant_1() != null)
			flightSearchMobileVORequest.setHasInfant1(params.getHas_infant_1());
		if (params.getHas_infant_2() != null)
			flightSearchMobileVORequest.setHasInfant2(params.getHas_infant_2());
		if (params.getHas_infant_3() != null)
			flightSearchMobileVORequest.setHasInfant3(params.getHas_infant_3());
		if (params.getHas_infant_4() != null)
			flightSearchMobileVORequest.setHasInfant4(params.getHas_infant_4());
		if (params.getHas_infant_5() != null)
			flightSearchMobileVORequest.setHasInfant5(params.getHas_infant_5());
		if (params.getHas_infant_6() != null)
			flightSearchMobileVORequest.setHasInfant6(params.getHas_infant_6());
		if (params.getHas_infant_7() != null)
			flightSearchMobileVORequest.setHasInfant7(params.getHas_infant_7());
		if (params.getHas_infant_8() != null)
			flightSearchMobileVORequest.setHasInfant8(params.getHas_infant_8());

		if (params.getMrcvi() != null)
			flightSearchMobileVORequest.setMrcvi(params.getMrcvi());
		if (params.getTraveller_type_1() != null)
			flightSearchMobileVORequest.setTravellerType1(params.getTraveller_type_1());
		if (params.getTraveller_type_2() != null)
			flightSearchMobileVORequest.setTravellerType2(params.getTraveller_type_2());
		if (params.getTraveller_type_3() != null)
			flightSearchMobileVORequest.setTravellerType3(params.getTraveller_type_3());
		if (params.getTraveller_type_4() != null)
			flightSearchMobileVORequest.setTravellerType4(params.getTraveller_type_4());
		if (params.getTraveller_type_5() != null)
			flightSearchMobileVORequest.setTravellerType5(params.getTraveller_type_5());
		if (params.getTraveller_type_6() != null)
			flightSearchMobileVORequest.setTravellerType6(params.getTraveller_type_6());
		if (params.getTraveller_type_7() != null)
			flightSearchMobileVORequest.setTravellerType7(params.getTraveller_type_7());
		if (params.getTraveller_type_8() != null)
			flightSearchMobileVORequest.setTravellerType8(params.getTraveller_type_8());
		if (params.getTraveller_type_9() != null)
			flightSearchMobileVORequest.setTravellerType9(params.getTraveller_type_9());
		if (params.getTrip_type() != null)
			flightSearchMobileVORequest.setTripType(params.getTrip_type());

		flightSearchMobileVORequest.setListCorporateNumber11(params.getList_corporate_number_1_1());

		return flightSearchMobileVORequest;

	}
	
	 

}
