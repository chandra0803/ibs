package com.ibsplc.flightsearch.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.framework.util.date.DateUtilities;
import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.persistence.dao.CommonDao;
import com.ibsplc.flightsearch.service.FlightSearchService;
import com.ibsplc.flightsearch.util.RequestParameterValidator;
import com.ibsplc.flightsearch.vo.CitiesVO;
import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchMultiCityMobileRequest;
import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchVO;
import com.ibsplc.flightsearch.vo.RouteConfigVO;
import com.ibsplc.framework.exception.model.CustomException;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.flightsearch.service.MultiCityFlightSearchService;

@Service("multicityflightsearchService")

public class MultiCityFlightSearchServiceImpl implements MultiCityFlightSearchService {
	private static final Logger LOGGER = Log4j2Logger.create(MultiCityFlightSearchServiceImpl.class);

	@Autowired
	private CommonDao commonDao;

	@Autowired
	private FlightSearchService flightSearchService;

	@Autowired
	private Environment environment;

	/**
	 * Method to create URL for multicity flight search parameters
	 * 
	 * @param multiCityFlightSearchServiceRequestMap
	 * @return
	 */
	@Override
	public FlexPricerRequestVO getMultiCityFlightAvailabilityURL(FlightSearchRequestVO multiCityFlightSearchRequestVO) {
		RequestParameterValidator requestParameterValidator = new RequestParameterValidator();
		FlightSearchVO multiCityFlightSearchVO = null;
		FlexPricerRequestVO flexPricerRequestVO = null;
		boolean isMultiCityValid = false;
		if (requestParameterValidator.isFlighSeachRequestParametersValid(multiCityFlightSearchRequestVO)) {
			isMultiCityValid = validateMultiCitySearch(multiCityFlightSearchRequestVO.getDepartureCity(),
					multiCityFlightSearchRequestVO.getDestinationCity(),
					multiCityFlightSearchRequestVO.getDepartureDate());
			if (isMultiCityValid) {
				multiCityFlightSearchVO = createFlightSearchVOForMulticity(multiCityFlightSearchRequestVO);
			} else {
				throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
						environment.getRequiredProperty("multicity.req.param.not.valid"));
			}

			// Added boolean parameter in createFlexPricerRequestVO method for
			// mobile api changes
			if (multiCityFlightSearchRequestVO.getCorporateId() != null)
				flexPricerRequestVO = flightSearchService.createFlexPricerRequestVO(multiCityFlightSearchVO,
						multiCityFlightSearchRequestVO.getCorporateId(), true);
			else
				flexPricerRequestVO = flightSearchService.createFlexPricerRequestVO(multiCityFlightSearchVO, null,
						true);

		} else {
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
					environment.getRequiredProperty("req.param.not.valid"));
		}

		return flexPricerRequestVO;

	}

	/**
	 * Method to retrieve route config parameters and to set in flightSearchVO
	 * for Multicity bookings
	 * 
	 * @param flightSearchRequestVO
	 * @param flightSearchVO
	 * @return
	 */
	@Override
	public FlightSearchVO setRouteParametersMcity(FlightSearchRequestVO flightSearchRequestVO,
			FlightSearchVO flightSearchVO) {
		boolean isRegional = false;
		boolean isDomestic = false;
		if (flightSearchRequestVO.getDepartureCity() != null)
			LOGGER.info("Departure City : " + flightSearchRequestVO.getDepartureCity());
		else
			LOGGER.info("Departure city is null");

		if (flightSearchRequestVO.getDestinationCity() != null)
			LOGGER.info("Destination City : " + flightSearchRequestVO.getDestinationCity());
		else
			LOGGER.info("Destination city is null");

		String[] departureCity = flightSearchRequestVO.getDepartureCity().split(",");
		String[] destinationCity = flightSearchRequestVO.getDestinationCity().split(",");
		FlexConfigName: for (int i = 0; i < departureCity.length; i++) {
			// to check whether there is any regional segments present
			if (flightSearchService.checkForDomesticFlight(destinationCity[i], departureCity[i], CommonKeys.COUNTRY_ZA,
					flightSearchRequestVO.getLanguage(), flightSearchRequestVO.getProduct(), CommonKeys.FALSE)) {
				isDomestic = true;
			} else if (flightSearchService.checkForDomesticFlight(destinationCity[i], departureCity[i],
					flightSearchRequestVO.getCountry(), flightSearchRequestVO.getLanguage(),
					flightSearchRequestVO.getProduct(), CommonKeys.TRUE)) {
				isRegional = true;
				flightSearchVO = setRouteConfigVOParamsMcity(departureCity[i], destinationCity[i], flightSearchVO);
				break FlexConfigName;

			}

		}
		if (isRegional) {
			flightSearchVO.setRegionalFlight(CommonKeys.TRUE);
			flightSearchVO.setDomesticFlight(CommonKeys.FALSE);
		} else if (isDomestic && !isRegional) {
			flightSearchVO.setDomesticFlight(CommonKeys.TRUE);
			flightSearchVO.setRegionalFlight(CommonKeys.FALSE);
			// retrieve the first segment and set the route config vo
			flightSearchVO = setRouteConfigVOParamsMcity(departureCity[0], destinationCity[0], flightSearchVO);
		}
		return flightSearchVO;
	}

	private FlightSearchVO setRouteConfigVOParamsMcity(String departureCity, String destinationCity,
			FlightSearchVO flightSearchVO) {
		List<RouteConfigVO> routeConfigVOList = null;
		RouteConfigVO routeConfigVO = null;
		try {
			// fetching flex_config_name,is_redirected_to_SAA from
			// airlink_route_config

			LOGGER.info("Departure City:" + departureCity + " ,Destination City:" + destinationCity + " ,Product:"
					+ flightSearchVO.getProduct());

			//routeConfigVOList = commonDao.getRouteConfigEntities(departureCity, destinationCity,
			//		flightSearchVO.getProduct());
			if (routeConfigVOList != null && !routeConfigVOList.isEmpty()) {
				routeConfigVO = routeConfigVOList.get(0);

				if (CommonsUtil.isStringValid(routeConfigVO.getFlexConfigName())) {
					flightSearchVO.setFlexConfigName(routeConfigVO.getFlexConfigName());
				}
				// HD-316604 -Removing 'Redirect to SAA' and '4Z live date' in
				// admin tool by A-10261
				/*
				 * if (routeConfigVO.getEffectiveDate() != null) {
				 * SimpleDateFormat screenDateFormat = new
				 * SimpleDateFormat(CommonKeys.SCREEN_DATE_FORMAT);
				 * flightSearchVO.setEffectiveDate(screenDateFormat.format(
				 * routeConfigVO.getEffectiveDate())); } if
				 * (CommonsUtil.isStringValid(routeConfigVO.getIsRedirectedToSAA
				 * ())) { if
				 * (CommonKeys.CHAR_Y.equals(routeConfigVO.getIsRedirectedToSAA(
				 * ))) { flightSearchVO.setIsRedirectedToSAA(CommonKeys.TRUE); }
				 * else { flightSearchVO.setIsRedirectedToSAA(CommonKeys.FALSE);
				 * } } else {
				 * flightSearchVO.setIsRedirectedToSAA(CommonKeys.FALSE); }
				 */
				flightSearchVO.setIsRedirectedToSAA(CommonKeys.FALSE);
				LOGGER.info("### IsRouteOperational:"+routeConfigVO.getIsRouteOperational());
				// HD-316604 Ends
				if (CommonsUtil.isStringValid(routeConfigVO.getIsRouteOperational())) {
					if (CommonKeys.CHAR_Y.equals(routeConfigVO.getIsRouteOperational())) {
						flightSearchVO.setIsRouteOperational(CommonKeys.TRUE.toString());
					} else {
						flightSearchVO.setIsRouteOperational(CommonKeys.FALSE.toString());

					}
				} else {
					flightSearchVO.setIsRouteOperational(CommonKeys.FALSE.toString());
				}

				// Added on 24/02/2021 by A-8986 to add a new Amadeus Trip
				// Request Parameter -- start

				if (CommonsUtil.isStringValid(routeConfigVO.getIsAirlinkRoute())) {
					if (CommonKeys.CHAR_Y.equals(routeConfigVO.getIsAirlinkRoute())) {
						flightSearchVO.setIsAirlinkEnabledRoute(CommonKeys.TRUE.toString());
					} else {
						flightSearchVO.setIsAirlinkEnabledRoute(CommonKeys.FALSE.toString());

					}
				} else {
					flightSearchVO.setIsAirlinkEnabledRoute(CommonKeys.FALSE.toString());
				}

				// Added on 24/02/2021 by A-8986 to add a new Amadeus Trip
				// Request Parameter -- end

				// Added on 03/11/2021 by A-10083 to add a new Amadeus Trip
				// Request Parameter -- start

				if (CommonsUtil.isStringValid(routeConfigVO.getIsDirectTrip())) {
					if (CommonKeys.CHAR_Y.equals(routeConfigVO.getIsDirectTrip())) {
						flightSearchVO.setIsDirectTripEnabledRoute(CommonKeys.TRUE.toString());
					} else {
						flightSearchVO.setIsDirectTripEnabledRoute(CommonKeys.FALSE.toString());

					}
				} else {
					flightSearchVO.setIsDirectTripEnabledRoute(CommonKeys.FALSE.toString());
				}
				// Added on 03/11/2021 by A-10083 to add a new Amadeus Trip
				// Request Parameter -- End

			} else {
				throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
						environment.getRequiredProperty("route.not.configured.in.DB"));
			}
		} catch (DataAccessException e) {
			LOGGER.error("Error while retrieving Route Config Entities");
		}
		return flightSearchVO;
	}

	// ***end**//

	/**
	 * validateMultiCitySearch
	 *
	 * This method does all the Business and Mandatory Feild Validations. If any
	 * of the validation fails , then a 'false' is returned.
	 * 
	 * @return boolean
	 */
	private boolean validateMultiCitySearch(String departureCity, String destinationCity, String departureDate) {
		String[] departureCities = null;
		String[] destinationCities = null;
		String[] departureDates = null;

		departureCities = departureCity.split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		destinationCities = destinationCity.split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		departureDates = departureDate.split(CommonKeys.MULTICITY_SPLITTER_REGEX);

		if (departureCities == null || destinationCities == null || departureDates == null) {
			LOGGER.info("Departurecity or destinationcity or departure date is null");
			return false;
		}
		if (!((departureCities.length == destinationCities.length)
				&& (destinationCities.length == departureDates.length))) {
			LOGGER.info("Departure city length or destination city length or departure date length are not equal "
					+ departureCities.length + " " + destinationCities.length + " " + departureDates.length);
			return false;
		}

		return true;
	}

	/**
	 * Method to create flight search VO based on flight search request VO
	 * parameters
	 * 
	 * @param flightSearchRequestVO
	 * @return
	 */
	private FlightSearchVO createFlightSearchVOForMulticity(FlightSearchRequestVO flightSearchRequestVO) {
		FlightSearchVO flightSearchVO = new FlightSearchVO();

		LOGGER.info("from createFlightSearchVOForMulticity  flightSearchRequestVO:"+flightSearchRequestVO );
		flightSearchVO.setCountry(flightSearchRequestVO.getCountry());
		flightSearchVO.setLanguage(flightSearchRequestVO.getLanguage());
		flightSearchVO.setProduct(flightSearchRequestVO.getProduct());
		flightSearchVO.setIsMobileDevice(flightSearchRequestVO.getIsMobileDevice());
		flightSearchVO.setClientSessionId(flightSearchRequestVO.getClientSessionId());
		flightSearchVO.setTripType(flightSearchRequestVO.getTripType());
		flightSearchVO.setDepartureCity(flightSearchRequestVO.getDepartureCity());
		flightSearchVO.setDestinationCity(flightSearchRequestVO.getDestinationCity());
		flightSearchVO.setDepartureDate(flightSearchRequestVO.getDepartureDate());
		flightSearchVO.setReturnDate(flightSearchRequestVO.getReturnDate());
		flightSearchVO.setDateFlexible(flightSearchRequestVO.getDateFlexible());
		flightSearchVO.setAdultCount(flightSearchRequestVO.getAdultCount());
		// A-10083 - on 17/02/2022
		flightSearchVO.setYoungAdultCount(flightSearchRequestVO.getYoungAdultCount());

		flightSearchVO.setChildCount(flightSearchRequestVO.getChildCount());
		flightSearchVO.setInfantCount(flightSearchRequestVO.getInfantCount());
		flightSearchVO.setCabinClass(flightSearchRequestVO.getCabinClass());
		flightSearchVO.setAmadeusReturnUrl(flightSearchRequestVO.getAmadeusReturnUrl());
		flightSearchVO.setSessionObj(flightSearchRequestVO.getSessionObj());
		flightSearchVO.setReqObj(flightSearchRequestVO.getReqObj());
		flightSearchVO.setCorporateName(flightSearchRequestVO.getCorporateName());
		flightSearchVO = setPromocode(flightSearchVO, flightSearchRequestVO);
		LOGGER.info("PromoCode MULTI CITY : " + flightSearchVO.getPromoCode());
		/*
		 * Flex config name configured for the Route and Product
		 */
		// flightSearchVO =
		// flightSearchService.setRouteConfigVOParameters(flightSearchRequestVO,
		// flightSearchVO);
		/* changed as per business ogic chnage for mcity--A-8551 */
		flightSearchVO = setRouteParametersMcity(flightSearchRequestVO, flightSearchVO);
		flightSearchVO = setDepartureCountry(flightSearchVO, flightSearchRequestVO);
		/*
		 * Get the POS City , currency and POS country
		 */
		/*
		 * Commented on 26/10/2020 as part of mobile api changes -- start
		 *
		 * flightSearchVO =
		 * flightSearchService.setPOSCityandCountry(flightSearchVO,
		 * flightSearchRequestVO, flightSearchVO.getDepartureCountry());
		 *
		 * Commented on 26/10/2020 as part of mobile api changes -- end
		 */
		LOGGER.info("from createFlightSearchVOForMulticity  Country:"+flightSearchRequestVO.getCountry());
		flightSearchVO = flightSearchService.setPOSCityandCountry(flightSearchVO, flightSearchRequestVO.getCountry(),
				flightSearchRequestVO.getLanguage(), flightSearchRequestVO.getProduct(),
				flightSearchVO.getDepartureCountry());

		flightSearchVO = checkForDomesticFlight(flightSearchVO, flightSearchRequestVO);
		// flightSearchVO = setDepartureDate(flightSearchVO,
		// flightSearchRequestVO);

		/*
		 * to get the base URL
		 */
		String url = flightSearchRequestVO.getReqObj().getUrl().toString();
		String baseURL = url.substring(0, url.length() - flightSearchRequestVO.getReqObj().getUri().length()) + "/";
		LOGGER.info("testurl" + url.substring(0, url.length() - flightSearchRequestVO.getReqObj().getUri().length()));
		LOGGER.info("baseURL>>" + baseURL);
		baseURL = baseURL.replaceAll("http:", "https:");
		flightSearchVO.setBasePspURL(baseURL);
		LOGGER.info("Multicity Flight Search VO after setting all Params : " + flightSearchVO.toString());
		return flightSearchVO;

	}

	/**
	 * Method to check demestic flight
	 * 
	 * @param flightSearchVO,flightSearchRequestVO
	 * @return FlightSearchVO
	 */
	private FlightSearchVO checkForDomesticFlight(FlightSearchVO flightSearchVO,
			FlightSearchRequestVO flightSearchRequestVO) {
		boolean isDomestic = false;
		int sectorCount = 0;
		int monthsBetween = 0;
		String[] departureCities = flightSearchRequestVO.getDepartureCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		String[] destinationCities = flightSearchRequestVO.getDestinationCity()
				.split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		String[] departureDates = flightSearchRequestVO.getDepartureDate().split(CommonKeys.MULTICITY_SPLITTER_REGEX);

		int length = departureDates.length;

		try {
			if (CommonsUtil.isStringValid(departureDates[0]) && CommonsUtil.isStringValid(departureDates[length - 1])) {
				monthsBetween = DateUtilities.getMonthsBetween(departureDates[0], departureDates[length - 1]);
			}
		} catch (ParseException e) {
			LOGGER.error("Parse exception on DateUtilities.getMonthsBetween" + e);
		}
		/*
		 * Checking the first route -- domestic flight
		 */
		// if (flightSearchService.checkForDomesticFlight(destinationCities[0],
		// departureCities[0],
		// CommonKeys.COUNTRY_ZA, flightSearchRequestVO.getLanguage(),
		// flightSearchRequestVO.getProduct(), CommonKeys.FALSE)){
		// flightSearchVO.setDomesticFlight(CommonKeys.TRUE);
		// }else{
		// flightSearchVO.setDomesticFlight(CommonKeys.FALSE);
		// }
		/*
		 * Checking the first route -- regional flight
		 */
		// if (flightSearchService.checkForDomesticFlight(destinationCities[0],
		// departureCities[0],
		// flightSearchRequestVO.getCountry(),
		// flightSearchRequestVO.getLanguage(),
		// flightSearchRequestVO.getProduct(), CommonKeys.TRUE)) {
		// flightSearchVO.setRegionalFlight(CommonKeys.TRUE);
		// } else {
		// flightSearchVO.setRegionalFlight(CommonKeys.FALSE);
		// }
		/*
		 * Checking if any one route is domestic flight
		 */
		for (int i = 0; i < length; i++) {
			if (flightSearchService.checkForDomesticFlight(destinationCities[i], departureCities[i],
					flightSearchRequestVO.getCountry(), flightSearchRequestVO.getLanguage(),
					flightSearchRequestVO.getProduct(), CommonKeys.FALSE)) {
				isDomestic = CommonKeys.TRUE;
				sectorCount = i;
			} else {
				isDomestic = CommonKeys.FALSE;
				break;
			}

		}

		if (monthsBetween > 6) {
			if (isDomestic && sectorCount == (length - 1)) {
				try {
					for (int j = 0; j < length; j++) {
						monthsBetween = DateUtilities.getMonthsBetween(departureDates[j], departureDates[j + 1]);
						if (monthsBetween > 6) {
							throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
									environment.getRequiredProperty("error.todate.invalid.segment") + " " + (j + 2));
						}
					}
				} catch (ParseException e) {
					LOGGER.error("Parse exception on DateUtilities.getMonthsBetween" + e);
				}
			} else {
				if (length > 2) {
					throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
							environment.getRequiredProperty("error.todate.invalid"));
				}
			}
		}

		return flightSearchVO;
	}

	/**
	 * Method to set promocode
	 * 
	 * @param flightSearchVO,flightSearchRequestVO
	 * @return FlightSearchVO
	 */
	private FlightSearchVO setPromocode(FlightSearchVO flightSearchVO, FlightSearchRequestVO flightSearchRequestVO) {

		if (flightSearchRequestVO.getProduct() != null
				&& (flightSearchRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B))
				&& (CommonsUtil.isStringValid(flightSearchRequestVO.getCorporatePromoCode()))) {
			flightSearchVO.setCorporatePromoCode(flightSearchRequestVO.getCorporatePromoCode());
			LOGGER.info("PRODUCT_B2B CorpCodeMLTCTY: " + flightSearchVO.getCorporatePromoCode());
		}
		if (CommonsUtil.isStringValid(flightSearchRequestVO.getPromoCode())) {
			flightSearchVO.setPromoCode(flightSearchRequestVO.getPromoCode());
		} else {
			if (flightSearchRequestVO.getProduct() != null
					&& (flightSearchRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB))) {
				flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE);
			} else {
				flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE_B2B);
			}
		}
		return flightSearchVO;
	}

	/**
	 * Method to set departure country
	 * 
	 * @param flightSearchVO,flightSearchRequestVO
	 * @return FlightSearchVO
	 */

	private FlightSearchVO setDepartureCountry(FlightSearchVO flightSearchVO,
			FlightSearchRequestVO flightSearchRequestVO) {
		String[] departureCities = null;
		if (CommonsUtil.isStringValid(flightSearchRequestVO.getDepartureCity())) {
			departureCities = flightSearchRequestVO.getDepartureCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		}
		String departureCountry = null;
		CitiesVO citiesEntity = null;
		List<CitiesVO> citiesEntityList = null;
		LOGGER.info("departureCities   : " + departureCities.toString());
		try {
			// select country_code, city_code, city_description,
			// airport_description from airlink_city_master where city_code = ?;
			if (departureCities != null && departureCities.length > 0
					&& CommonsUtil.isStringValid(departureCities[0])) {
				citiesEntityList = commonDao.getCityMasterEntities(departureCities[0]);
			}
		} catch (DataAccessException e) {
			LOGGER.error("Exception while retrieving data getCityMasterEntities " + e);
		}
		LOGGER.info("citiesEntityList size   : " + citiesEntityList.size());
		if (citiesEntityList != null && !citiesEntityList.isEmpty()) {
			citiesEntity = citiesEntityList.get(0);
			departureCountry = citiesEntity.getCountryCode();
		}
		LOGGER.info("Departure Country : " + departureCountry);
		flightSearchVO.setDepartureCountry(departureCountry);

		return flightSearchVO;
	}

	// Added on 06/11/2020 by A-8986 for MultiCity Mobile API -- start
	@Override
	public FlexPricerRequestVO getFlightAvailabilityMultiCityMobileURL(
			FlightSearchMultiCityMobileRequest flightSearchMultiCityMobileRequest) {

		RequestParameterValidator requestParameterValidator = new RequestParameterValidator();
		FlightSearchVO flightSearchVO = null;
		FlexPricerRequestVO flexPricerRequestVO = null;
		if (requestParameterValidator
				.isFlightSeachMultiCityMobileRequestParametersValid(flightSearchMultiCityMobileRequest)) {

			flightSearchVO = createFlightSearchMultiCityMobileVO(flightSearchMultiCityMobileRequest);

			// Added false parameter as part of mobile api changes

			flexPricerRequestVO = flightSearchService.createFlexPricerRequestVO(flightSearchVO, null, false);
		} else {
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
					environment.getRequiredProperty("req.param.not.valid"));
		}
		return flexPricerRequestVO;
	}

	private FlightSearchVO createFlightSearchMultiCityMobileVO(
			FlightSearchMultiCityMobileRequest flightSearchMobileVORequest) {

		FlightSearchVO flightSearchVO = new FlightSearchVO();
		if (flightSearchMobileVORequest.getLanguage() != null)
			flightSearchVO.setLanguage(flightSearchMobileVORequest.getLanguage());

		if (flightSearchMobileVORequest.getCountry() != null)
			flightSearchVO.setCountry(flightSearchMobileVORequest.getCountry());

		flightSearchVO.setIsMobileDevice("true");

		if (flightSearchMobileVORequest.getProduct() != null)
			flightSearchVO.setProduct(flightSearchMobileVORequest.getProduct());

		flightSearchVO.setTripType(flightSearchMobileVORequest.getTripType());
		flightSearchVO.setClientSessionId("123");

		StringBuilder departureCity = new StringBuilder();
		if (flightSearchMobileVORequest.getbLocation1() != null)
			departureCity.append(flightSearchMobileVORequest.getbLocation1());
		if (flightSearchMobileVORequest.getbLocation2() != null)
			departureCity.append(",").append(flightSearchMobileVORequest.getbLocation2());
		if (flightSearchMobileVORequest.getbLocation3() != null)
			departureCity.append(",").append(flightSearchMobileVORequest.getbLocation3());
		if (flightSearchMobileVORequest.getbLocation4() != null)
			departureCity.append(",").append(flightSearchMobileVORequest.getbLocation4());
		if (flightSearchMobileVORequest.getbLocation5() != null)
			departureCity.append(",").append(flightSearchMobileVORequest.getbLocation5());
		if (flightSearchMobileVORequest.getbLocation6() != null)
			departureCity.append(",").append(flightSearchMobileVORequest.getbLocation6());

		flightSearchVO.setDepartureCity(departureCity.toString());

		StringBuilder departureDate = new StringBuilder();
		if (flightSearchMobileVORequest.getbDate1() != null)
			departureDate.append(flightSearchMobileVORequest.getbDate1());
		if (flightSearchMobileVORequest.getbDate2() != null)
			departureDate.append(",").append(flightSearchMobileVORequest.getbDate2());
		if (flightSearchMobileVORequest.getbDate3() != null)
			departureDate.append(",").append(flightSearchMobileVORequest.getbDate3());
		if (flightSearchMobileVORequest.getbDate4() != null)
			departureDate.append(",").append(flightSearchMobileVORequest.getbDate4());
		if (flightSearchMobileVORequest.getbDate5() != null)
			departureDate.append(",").append(flightSearchMobileVORequest.getbDate5());
		if (flightSearchMobileVORequest.getbDate6() != null)
			departureDate.append(",").append(flightSearchMobileVORequest.getbDate6());

		flightSearchVO.setDepartureDate(departureDate.toString());

		/*
		 * StringBuilder destinationCity=new StringBuilder();
		 * if(flightSearchMobileVORequest.getbLocation2()!=null)
		 * destinationCity.append(flightSearchMobileVORequest.getbLocation2());
		 * if(flightSearchMobileVORequest.geteLocation2()!=null)
		 * destinationCity.append(",").append(flightSearchMobileVORequest.
		 * geteLocation2());
		 * if(flightSearchMobileVORequest.getbLocation4()!=null)
		 * destinationCity.append(",").append(flightSearchMobileVORequest.
		 * getbLocation4());
		 * if(flightSearchMobileVORequest.geteLocation4()!=null)
		 * destinationCity.append(",").append(flightSearchMobileVORequest.
		 * geteLocation4());
		 * if(flightSearchMobileVORequest.getbLocation6()!=null)
		 * destinationCity.append(",").append(flightSearchMobileVORequest.
		 * getbLocation6());
		 * if(flightSearchMobileVORequest.geteLocation6()!=null)
		 * destinationCity.append(",").append(flightSearchMobileVORequest.
		 * geteLocation6());
		 */

		StringBuilder destinationCity = new StringBuilder();
		if (flightSearchMobileVORequest.geteLocation1() != null)
			destinationCity.append(flightSearchMobileVORequest.geteLocation1());
		if (flightSearchMobileVORequest.geteLocation2() != null)
			destinationCity.append(",").append(flightSearchMobileVORequest.geteLocation2());
		if (flightSearchMobileVORequest.geteLocation3() != null)
			destinationCity.append(",").append(flightSearchMobileVORequest.geteLocation3());
		if (flightSearchMobileVORequest.geteLocation4() != null)
			destinationCity.append(",").append(flightSearchMobileVORequest.geteLocation4());
		if (flightSearchMobileVORequest.geteLocation5() != null)
			destinationCity.append(",").append(flightSearchMobileVORequest.geteLocation5());
		if (flightSearchMobileVORequest.geteLocation6() != null)
			destinationCity.append(",").append(flightSearchMobileVORequest.geteLocation6());

		flightSearchVO.setDestinationCity(destinationCity.toString());

		LOGGER.info("Language:" + flightSearchVO.getLanguage() + " ,Country:" + flightSearchVO.getCountry()
				+ " ,Product:" + flightSearchVO.getProduct() + " ,Trip type:" + flightSearchVO.getTripType()
				+ " ,Departure city :" + flightSearchVO.getDepartureCity() + " ,Destination city:"
				+ flightSearchVO.getDestinationCity() + " ,Departure date:" + flightSearchVO.getDepartureDate());

		// flightSearchVO.setDateFlexible(flightSearchRequestVO.getDateFlexible());

		// flightSearchVO.setAmadeusReturnUrl(flightSearchRequestVO.getAmadeusReturnUrl());

		LOGGER.info("Return date :" + flightSearchVO.getReturnDate());

		int adtCount = 0;
		int chdCount = 0;
		int infCount = 0;
		// A-10083
		int yngAdtCount = 0;

		if (flightSearchMobileVORequest.getTravellerType1() != null) {

			LOGGER.info("Traveller type 1 : " + flightSearchMobileVORequest.getTravellerType1());

			if (flightSearchMobileVORequest.getTravellerType1().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTravellerType1().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTravellerType2() != null) {

			LOGGER.info("Traveller type 2 : " + flightSearchMobileVORequest.getTravellerType2());

			if (flightSearchMobileVORequest.getTravellerType2().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTravellerType2().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTravellerType3() != null) {

			LOGGER.info("Traveller type 3 : " + flightSearchMobileVORequest.getTravellerType3());

			if (flightSearchMobileVORequest.getTravellerType3().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTravellerType3().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTravellerType4() != null) {

			LOGGER.info("Traveller type 4 : " + flightSearchMobileVORequest.getTravellerType4());

			if (flightSearchMobileVORequest.getTravellerType4().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTravellerType4().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTravellerType5() != null) {

			LOGGER.info("Traveller type 5 : " + flightSearchMobileVORequest.getTravellerType5());

			if (flightSearchMobileVORequest.getTravellerType5().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTravellerType5().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTravellerType6() != null) {

			LOGGER.info("Traveller type 6 : " + flightSearchMobileVORequest.getTravellerType6());

			if (flightSearchMobileVORequest.getTravellerType6().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTravellerType6().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTravellerType7() != null) {

			LOGGER.info("Traveller type 7 : " + flightSearchMobileVORequest.getTravellerType7());

			if (flightSearchMobileVORequest.getTravellerType7().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTravellerType7().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTravellerType8() != null) {

			LOGGER.info("Traveller type 8 : " + flightSearchMobileVORequest.getTravellerType8());

			if (flightSearchMobileVORequest.getTravellerType8().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTravellerType8().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTravellerType9() != null) {

			LOGGER.info("Traveller type 9 : " + flightSearchMobileVORequest.getTravellerType9());

			if (flightSearchMobileVORequest.getTravellerType9().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTravellerType9().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getHasInfant1() != null
				&& flightSearchMobileVORequest.getHasInfant1().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHasInfant2() != null
				&& flightSearchMobileVORequest.getHasInfant2().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHasInfant3() != null
				&& flightSearchMobileVORequest.getHasInfant3().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHasInfant4() != null
				&& flightSearchMobileVORequest.getHasInfant4().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHasInfant5() != null
				&& flightSearchMobileVORequest.getHasInfant5().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHasInfant6() != null
				&& flightSearchMobileVORequest.getHasInfant6().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHasInfant7() != null
				&& flightSearchMobileVORequest.getHasInfant7().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHasInfant8() != null
				&& flightSearchMobileVORequest.getHasInfant8().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}

		LOGGER.info("Mobile multicity Adt count:" + adtCount + ", Chd count: " + chdCount + "Inf count:" + infCount);

		/*
		 * int totalPaxCount=adtCount+chdCount+infCount; if(totalPaxCount>9)
		 * throw new CustomException("Passenger count is more than 9");
		 */

		flightSearchVO.setAdultCount(new Integer(adtCount).toString());
		// A-10083 - on 17/02/2022
		flightSearchVO.setYoungAdultCount(new Integer(yngAdtCount).toString());
		flightSearchVO.setInfantCount(new Integer(infCount).toString());
		flightSearchVO.setChildCount(new Integer(chdCount).toString());

		LOGGER.info("Adult count:" + flightSearchVO.getAdultCount() + ", Child count: " + flightSearchVO.getChildCount()
				+ "Infant count:" + flightSearchVO.getInfantCount());

		if (flightSearchMobileVORequest.getCabinClass() != null)
			flightSearchVO.setCabinClass(flightSearchMobileVORequest.getCabinClass());

		if (flightSearchMobileVORequest.getSessionObj() != null)
			flightSearchVO.setSessionObj(flightSearchMobileVORequest.getSessionObj());

		if (flightSearchMobileVORequest.getReqObj() != null)
			flightSearchVO.setReqObj(flightSearchMobileVORequest.getReqObj());

		if (flightSearchMobileVORequest.getListCorporateNumber11() != null)
			flightSearchVO.setCorporateName(flightSearchMobileVORequest.getListCorporateNumber11());

		LOGGER.info("Cabin class : " + flightSearchMobileVORequest.getCabinClass());

		LOGGER.info("PromoCode : " + flightSearchVO.getPromoCode());
		/*
		 * Flex config name configured for the Route and Product
		 */
		if (flightSearchMobileVORequest.getListCorporateNumber11() != null) {

			//String promoCode = commonDao.getPrivateAcctCode(flightSearchMobileVORequest.getListCorporateNumber11());
			String promoCode = "promoCode";
			LOGGER.info("Retrieved Promo Code : " + promoCode);

			flightSearchVO.setPromoCode(promoCode);

		} else
			flightSearchVO = setPromocode(flightSearchVO, flightSearchMobileVORequest);

		LOGGER.info("PromoCode MLTCTY : " + flightSearchVO.getPromoCode());

		flightSearchVO = setRouteParametersMobileMcity(flightSearchMobileVORequest, flightSearchVO);
		flightSearchVO = setDepartureCountryMobile(flightSearchVO, flightSearchMobileVORequest);

		flightSearchVO = flightSearchService.setPOSCityandCountry(flightSearchVO,
				flightSearchMobileVORequest.getCountry(), flightSearchMobileVORequest.getLanguage(),
				flightSearchMobileVORequest.getProduct(), flightSearchVO.getDepartureCountry());

		flightSearchVO = checkForDomesticFlightMobile(flightSearchVO, flightSearchMobileVORequest);
		// flightSearchVO = setDepartureDate(flightSearchVO,
		// flightSearchRequestVO);

		/*
		 * to get the base URL
		 */
		String url = flightSearchMobileVORequest.getReqObj().getUrl().toString();
		String baseURL = url.substring(0, url.length() - flightSearchMobileVORequest.getReqObj().getUri().length())
				+ "/";
		LOGGER.info(
				"testurl" + url.substring(0, url.length() - flightSearchMobileVORequest.getReqObj().getUri().length()));
		LOGGER.info("baseURL>>" + baseURL);
		baseURL = baseURL.replaceAll("http:", "https:");
		flightSearchVO.setBasePspURL(baseURL);
		LOGGER.info("Multicity Flight Search VO after setting all Params : " + flightSearchVO.toString());
		return flightSearchVO;

	}

	private FlightSearchVO setPromocode(FlightSearchVO flightSearchVO,
			FlightSearchMultiCityMobileRequest flightSearchRequestVO) {

		if (flightSearchRequestVO.getListCorporateNumber11() != null) {

			//String promoCode = commonDao.getPrivateAcctCode(flightSearchRequestVO.getListCorporateNumber11());
			String promoCode = "promoCode";
			LOGGER.info("Retrieved Promo Code : " + promoCode);

			flightSearchVO.setPromoCode(promoCode);

		} else {
			if (flightSearchRequestVO.getProduct() != null
					&& (flightSearchRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB))) {
				flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE);
			} else {
				flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE_B2B);
			}
		}

		return flightSearchVO;
	}

	public FlightSearchVO setRouteParametersMobileMcity(FlightSearchMultiCityMobileRequest flightSearchRequestVO,
			FlightSearchVO flightSearchVO) {
		boolean isRegional = false;
		boolean isDomestic = false;
		String[] departureCity = flightSearchVO.getDepartureCity().split(",");
		String[] destinationCity = flightSearchVO.getDestinationCity().split(",");

		LOGGER.info("Departure City List:" + departureCity.toString());
		LOGGER.info("Destination City List:" + destinationCity.toString());

		for (int i = 0; i < departureCity.length; i++) {
			// to check whether there is any regional segments present

			LOGGER.info("Departure City:" + departureCity[i]);
			LOGGER.info("Destination City:" + destinationCity[i]);

			if (flightSearchService.checkForDomesticFlight(destinationCity[i], departureCity[i], CommonKeys.COUNTRY_ZA,
					flightSearchRequestVO.getLanguage(), flightSearchRequestVO.getProduct(), CommonKeys.FALSE)) {
				isDomestic = true;
				LOGGER.info("inside isDomestic"  );
			} else if (flightSearchService.checkForDomesticFlight(destinationCity[i], departureCity[i],
					flightSearchRequestVO.getCountry(), flightSearchRequestVO.getLanguage(),
					flightSearchRequestVO.getProduct(), CommonKeys.TRUE)) {
				isRegional = true;
				LOGGER.info("inside isRegional"  );
				flightSearchVO = setRouteConfigVOParamsMcity(departureCity[i], destinationCity[i], flightSearchVO);
				break;

			}

		}
		if (isRegional) {
			flightSearchVO.setRegionalFlight(CommonKeys.TRUE);
			flightSearchVO.setDomesticFlight(CommonKeys.FALSE);
		} else if (isDomestic && !isRegional) {
			flightSearchVO.setDomesticFlight(CommonKeys.TRUE);
			flightSearchVO.setRegionalFlight(CommonKeys.FALSE);
			// retrieve the first segment and set the route config vo
			flightSearchVO = setRouteConfigVOParamsMcity(departureCity[0], destinationCity[0], flightSearchVO);
		}
		return flightSearchVO;
	}

	private FlightSearchVO setDepartureCountryMobile(FlightSearchVO flightSearchVO,
			FlightSearchMultiCityMobileRequest flightSearchRequestVO) {
		String[] departureCities = null;
		if (CommonsUtil.isStringValid(flightSearchVO.getDepartureCity())) {
			departureCities = flightSearchVO.getDepartureCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		}
		String departureCountry = null;
		CitiesVO citiesEntity = null;
		List<CitiesVO> citiesEntityList = null;

		/*try {
			// select country_code, city_code, city_description,
			// airport_description from airlink_city_master where city_code = ?;
			if (departureCities != null && departureCities.length > 0
					&& CommonsUtil.isStringValid(departureCities[0])) {
				citiesEntityList = commonDao.getCityMasterEntities(departureCities[0]);
			}
		} catch (DataAccessException e) {
			LOGGER.error("Exception while retrieving data getCityMasterEntities " + e);
		}*/

		if (citiesEntityList != null && !citiesEntityList.isEmpty()) {
			citiesEntity = citiesEntityList.get(0);
			departureCountry = citiesEntity.getCountryCode();
		}
		LOGGER.info("Departure Country : " + departureCountry);
		flightSearchVO.setDepartureCountry(departureCountry);

		return flightSearchVO;
	}

	private FlightSearchVO checkForDomesticFlightMobile(FlightSearchVO flightSearchVO,
			FlightSearchMultiCityMobileRequest flightSearchRequestVO) {
		boolean isDomestic = false;
		int sectorCount = 0;
		int monthsBetween = 0;
		String[] departureCities = flightSearchVO.getDepartureCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		String[] destinationCities = flightSearchVO.getDestinationCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		String[] departureDates = flightSearchVO.getDepartureDate().split(CommonKeys.MULTICITY_SPLITTER_REGEX);

		int length = departureDates.length;

		try {
			if (CommonsUtil.isStringValid(departureDates[0]) && CommonsUtil.isStringValid(departureDates[length - 1])) {
				monthsBetween = DateUtilities.getMonthsBetween(departureDates[0], departureDates[length - 1]);
			}
		} catch (ParseException e) {
			LOGGER.error("Parse exception on DateUtilities.getMonthsBetween" + e);
		}
		return flightSearchVO;
	}

	// Added on 06/11/2020 by A-8986 for MultiCity Mobile API -- end

}
