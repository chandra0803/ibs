package com.ibsplc.flightsearch.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.constants.ServiceParamsKeys;
import com.ibsplc.common.excelparsing.ReadExcel;
import com.ibsplc.common.persistence.dao.CommonDao;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.flightsearch.service.FlightSearchService;
import com.ibsplc.flightsearch.util.RequestParameterValidator;
import com.ibsplc.flightsearch.vo.AirLinkParameterMasterVO;
import com.ibsplc.flightsearch.vo.CitiesVO;
import com.ibsplc.flightsearch.vo.ConfiguredPOSVO;
import com.ibsplc.flightsearch.vo.FlexPricerDetailsVO;
import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchMobileVORequest;
import com.ibsplc.flightsearch.vo.FlightSearchMultiCityMobileRequest;
import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchVO;
import com.ibsplc.flightsearch.vo.PosCityMasterVO;
import com.ibsplc.flightsearch.vo.PosDetailsVO;
import com.ibsplc.flightsearch.vo.PromoFaresVO;
import com.ibsplc.flightsearch.vo.RouteConfigVO;
import com.ibsplc.framework.exception.model.CustomException;
import com.ibsplc.framework.exception.model.SystemException;
import com.ibsplc.framework.util.date.DateUtilities;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

@Service("flightsearchService")
@ComponentScan(basePackages = "com.ibsplc")
 
public class FlightSearchServiceImpl implements FlightSearchService {
	/**
	 * Log4j implementation to log the necessary details
	 */
	private static final Logger LOGGER = Log4j2Logger.create(FlightSearchServiceImpl.class);
	@Autowired
	private CommonDao commonDao;

	@Autowired
	private Environment environment;

	/**
	 * Method to create URL which is to be redirected to Amadeus
	 * 
	 * @param flightSearchRequestVO
	 * @return FlexPricerRequestVO
	 */
	@Override
	public FlexPricerRequestVO getFlightAvailabilityURL(FlightSearchRequestVO flightSearchRequestVO) {
 
		RequestParameterValidator requestParameterValidator = new RequestParameterValidator();
		FlightSearchVO flightSearchVO = null;
		FlexPricerRequestVO flexPricerRequestVO = null;
		if (requestParameterValidator.isFlighSeachRequestParametersValid(flightSearchRequestVO)) {
			 
			flightSearchVO = createFlightSearchVO(flightSearchRequestVO, flightSearchRequestVO.getCorporateId());
			 
			// Added boolean parameter in createFlexPricerRequestVO method as
			// part of mobile api changes
			if (flightSearchRequestVO.getCorporateId() != null)
				flexPricerRequestVO = createFlexPricerRequestVO(flightSearchVO, flightSearchRequestVO.getCorporateId(),
						true);
			else
				flexPricerRequestVO = createFlexPricerRequestVO(flightSearchVO, null, true);
		} else {
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
					environment.getRequiredProperty("req.param.not.valid"));
		}
		LOGGER.info(" getFlightAvailabilityURL  flexPricerRequestVO:"+flexPricerRequestVO);
		return flexPricerRequestVO;
	}

	// Added on 12/10/2020 by A-8986 for Mobile API -- start
	@Override
	public FlexPricerRequestVO getFlightAvailabilityMobileURL(FlightSearchMobileVORequest flightSearchMobileVORequest) {

		RequestParameterValidator requestParameterValidator = new RequestParameterValidator();
		FlightSearchVO flightSearchVO = null;
		FlexPricerRequestVO flexPricerRequestVO = null;
		if (requestParameterValidator.isFlightSeachMobileRequestParametersValid(flightSearchMobileVORequest)) {

			flightSearchVO = createFlightSearchMobileVO(flightSearchMobileVORequest);

			// Added false parameter as part of mobile api changes
			flexPricerRequestVO = createFlexPricerRequestVO(flightSearchVO, null, false);
		} else {
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
					environment.getRequiredProperty("req.param.not.valid"));
		}
		return flexPricerRequestVO;
	}
	// Added on 12/10/2020 by A-8986 for Mobile API -- end

	/**
	 * Method to create FlexPricerrequest VO using values from flight search VO
	 * before URL creation
	 * 
	 * @param flightSearchVO
	 * @return
	 */
	@Override
	public FlexPricerRequestVO createFlexPricerRequestVO(FlightSearchVO flightSearchVO, String corporateId,
			boolean isConvert) {	
		
		FlexPricerRequestVO flexPricerRequestVO = new FlexPricerRequestVO();
		LOGGER.info("from createFlexPricerRequestVO flightSearchVO.getCountry() :" +flightSearchVO.getCountry());
		// Added on 27/01/2021 for everymundo
		flexPricerRequestVO.setSourceId(flightSearchVO.getSource());
		if( null == flightSearchVO.getTripType() ) flightSearchVO.setTripType("S");
		flexPricerRequestVO.setCountry(flightSearchVO.getCountry());
		flexPricerRequestVO.setLanguage(flightSearchVO.getLanguage());
		flexPricerRequestVO.setProduct(flightSearchVO.getProduct());
		flexPricerRequestVO.setIsMobileDevice(flightSearchVO.getIsMobileDevice());
		flexPricerRequestVO.setClientSessionId(flightSearchVO.getClientSessionId());
		flexPricerRequestVO.setTripType(flightSearchVO.getTripType());
		flexPricerRequestVO.setDepartureCity(flightSearchVO.getDepartureCity());
		flexPricerRequestVO.setDepartureCountry(flightSearchVO.getDepartureCountry());
		flexPricerRequestVO.setDestinationCity(flightSearchVO.getDestinationCity());
		// flexPricerRequestVO.setDepartureDate(flightSearchVO.getDepartureDate());
		// flexPricerRequestVO.setReturnDate(flightSearchVO.getReturnDate());
		flexPricerRequestVO.setDateFlexible(flightSearchVO.getDateFlexible());
		flexPricerRequestVO.setAdultCount(flightSearchVO.getAdultCount());
		// A-10083 - on 17/02/2022
		flexPricerRequestVO.setYoungAdultCount(flightSearchVO.getYoungAdultCount());

		flexPricerRequestVO.setChildCount(flightSearchVO.getChildCount());
		flexPricerRequestVO.setInfantCount(flightSearchVO.getInfantCount());
		flexPricerRequestVO.setCabinClass(flightSearchVO.getCabinClass());
		flexPricerRequestVO.setAmadeusReturnUrl(flightSearchVO.getAmadeusReturnUrl());
		flexPricerRequestVO.setPromoCode(flightSearchVO.getPromoCode());
		flexPricerRequestVO.setDomesticFlight(flightSearchVO.isDomesticFlight());
		flexPricerRequestVO.setFlexiDomesticFlight(flightSearchVO.isFlexiDomesticFlight());
		flexPricerRequestVO.setRegionalFlight(flightSearchVO.isRegionalFlight());
		flexPricerRequestVO.setPosCity(flightSearchVO.getPosCity());
		flexPricerRequestVO.setPosCountry(flightSearchVO.getPosCountry());
		flexPricerRequestVO.setCurrency(flightSearchVO.getCurrency());
		flexPricerRequestVO.setFlexConfigName(flightSearchVO.getFlexConfigName());
		// HD-316604 -Removing 'Redirect to SAA' and '4Z live date' in admin
		// tool by A-10261
		flexPricerRequestVO.setIsRedirectedToSAA(flightSearchVO.IsRedirectedToSAA());

		// HD-316604 Ends
		// flexPricerRequestVO.setIsRedirectedToSAA(flightSearchVO.IsRedirectedToSAA());

		flexPricerRequestVO.setIsRouteOperational(flightSearchVO.isRouteOperational());
		flexPricerRequestVO.setBasePspURL(flightSearchVO.getBasePspURL());
		flexPricerRequestVO.setSessionObj(flightSearchVO.getSessionObj());
		flexPricerRequestVO.setReqObj(flightSearchVO.getReqObj());
		flexPricerRequestVO.setCorporateName(flightSearchVO.getCorporateName());
		flexPricerRequestVO.setIsTripEligible(flightSearchVO.getIsTripEligible());
		flexPricerRequestVO.setCorporateId(corporateId);

		// Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request
		// Parameter -- start
		flexPricerRequestVO.setIsAirlinkRoute(flightSearchVO.getIsAirlinkEnabledRoute());
		// Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request
		// Parameter -- end
		// Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request
		// Parameter -- start
		if(null == flightSearchVO.getIsDirectTripEnabledRoute() || flightSearchVO.getIsDirectTripEnabledRoute().isEmpty())
			flexPricerRequestVO.setIsDirectTrip("NO");
		else
			flexPricerRequestVO.setIsDirectTrip(flightSearchVO.getIsDirectTripEnabledRoute());
		// Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request
		// Parameter -- end

		if (flightSearchVO.getUserId() != null && !flightSearchVO.getUserId().isEmpty())
			flexPricerRequestVO.setUserId(flightSearchVO.getUserId());
		/*
		 * flexPricerRequestVO.setAdultPaxCount(Integer.parseInt(flightSearchVO.
		 * getAdultCount()));
		 * flexPricerRequestVO.setChildPaxCount(Integer.parseInt(flightSearchVO.
		 * getChildCount()));
		 * flexPricerRequestVO.setInfantPaxCount(Integer.parseInt(flightSearchVO
		 * .getInfantCount()));
		 */

		/*
		 * Get PrivateFareAccountCode from DB for B2B applications Added on
		 * 11/03/2020 by A-8986
		 */
		String accountCode = null;
		//if (corporateId != null)
		//	accountCode = getPrivateFareAccountCode(corporateId);

		/*
		 * Commented on 30/10/2020 for A-8986 for mobile API changes -- start
		 * 
		 * if(CommonsUtil.isStringValid(flexPricerRequestVO.getTripType()) &&
		 * (flexPricerRequestVO.getTripType().equals(CommonKeys.
		 * TRIP_TYPE_MULTI_CITY))) { flexPricerRequestVO =
		 * setDepartureDate(flightSearchVO, flexPricerRequestVO);
		 * 
		 * }else { flexPricerRequestVO =
		 * getTravelDatesInAmadeusFormat(flightSearchVO, flexPricerRequestVO); }
		 * 
		 * Commented on 30/10/2020 for A-8986 for mobile API changes -- end
		 * 
		 */

		// Added on 30/10/2020 for A-8986 for mobile API changes -- start

		if (isConvert) {
			if (CommonsUtil.isStringValid(flexPricerRequestVO.getTripType())
					&& (flexPricerRequestVO.getTripType().equals(CommonKeys.TRIP_TYPE_MULTI_CITY))) {
				flexPricerRequestVO = setDepartureDate(flightSearchVO, flexPricerRequestVO);

			} else {
				flexPricerRequestVO = getTravelDatesInAmadeusFormat(flightSearchVO, flexPricerRequestVO);
			}
		} else {

			flexPricerRequestVO.setDepartureDate(flightSearchVO.getDepartureDate());
			flexPricerRequestVO.setReturnDate(flightSearchVO.getReturnDate());
		}
		// Added on 30/10/2020 for A-8986 for mobile API changes -- end

		flexPricerRequestVO = setRouteType(flightSearchVO, flexPricerRequestVO);
	 
		/*
		 * set the default FlexConfigName if no flexconfig is configured against
		 * the route and product
		 */
		flexPricerRequestVO = getFlexConfigName(flexPricerRequestVO);

		LOGGER.info("  FlexConfigName:" + flexPricerRequestVO.getFlexConfigName() +", Route Type:"+flexPricerRequestVO.getRouteType());
		 
		LOGGER.info("  flightSearchVO:" + flightSearchVO);
		/*
		 * eRetail common parameters
		 */
		flexPricerRequestVO = getFlexPricerCommonParameters(flexPricerRequestVO);
		/*
		 * Sets the SITE ID and product type
		 */

		flexPricerRequestVO = getFlexPricerSiteCode(flexPricerRequestVO, flightSearchVO.getProduct());		 
		flexPricerRequestVO = getFlexPricerDetails(flexPricerRequestVO);	 
		if (!flightSearchVO.getLanguage().equalsIgnoreCase("GB")) {
			flexPricerRequestVO = setAmadeusLanguage(flexPricerRequestVO, flightSearchVO.getLanguage());
		} else {
			flexPricerRequestVO.setAmadeusLanguageCode(flightSearchVO.getLanguage());
		}
		/*
		 * Sets the site POS details corresponding to the country/departure
		 * country
		 */
		LOGGER.info("flightSearchVO2:" + flightSearchVO);
		 flexPricerRequestVO = getPosDetailsVOParameters(flexPricerRequestVO, flightSearchVO);
		/*
		 * set payment options
		 */
		try {
			flexPricerRequestVO = getPaymentTypesAllowed(flexPricerRequestVO, flightSearchVO);
		} catch (SystemException e) {
			LOGGER.info("SystemException :" + e.getMessage());
		}
		/*
		 * get the promofare details corresponding to the promo code entered by
		 * the user
		 */
		PromoFaresVO promoFaresVO = new PromoFaresVO();
		 
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getPromoCode())
				&& (flexPricerRequestVO.getPromoCode().equals(CommonKeys.DEFAULT_PROMO_CODE)
						|| flexPricerRequestVO.getPromoCode().equals(CommonKeys.DEFAULT_PROMO_CODE_B2B))) {
			/*
			 * Get PrivateFareAccountCode from DB for B2B applications Added on
			 * 11/03/2020 by A-8986
			 */

			if (flexPricerRequestVO.getPromoCode().equals(CommonKeys.DEFAULT_PROMO_CODE_B2B)) {
				if (accountCode != null)
					promoFaresVO.setPrivateFareAccountCode(accountCode);
				else
					promoFaresVO.setPrivateFareAccountCode(flexPricerRequestVO.getPromoCode());
			} else { 
				promoFaresVO.setPrivateFareAccountCode(flexPricerRequestVO.getPromoCode());
			}

			//LOGGER.info("After setting PrivateFareAccountCode :" + promoFaresVO.getPrivateFareAccountCode());

		} else {
			// set the PrivateFareAccountCode corresponding to the promocode
			// from database
			promoFaresVO = getPromoCodeVO(flightSearchVO.getPromoCode());
			LOGGER.info("promoFaresVO :" + promoFaresVO);

			//String privateFare=promoFaresVO.getPrivateFareAccountCode();
		//	LOGGER.info("promoFaresVO acnt code:" + promoFaresVO.getPrivateFareAccountCode());

			promoFaresVO = getPrivateFareAccountDetails(flexPricerRequestVO, promoFaresVO, accountCode);
		}

		// promoFaresVO.setPromoCode(flexPricerRequestVO.getPromoCode());

		if (flexPricerRequestVO.getProduct() != null
				&& (flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B))) {
			promoFaresVO.setCorporatePromoCode(flightSearchVO.getCorporatePromoCode());
		}
		flexPricerRequestVO.setPromoFaresVO(promoFaresVO);
		//LOGGER.info("final flexPricerRequestVO SitePointOfSale:" + flexPricerRequestVO.getSitePointOfSale());
		/*
		 * Office ID and Queue configurations
		 */
		flexPricerRequestVO = getPosDetailsList(flexPricerRequestVO);
		 
		/* if (  (null != flexPricerRequestVO && flexPricerRequestVO.getAmadeusSiteOfficeID() != null
						&& flexPricerRequestVO.getAmadeusSiteOfficeID().trim().isEmpty())) {
			flexPricerRequestVO.setAmadeusSiteOfficeID(CommonKeys.DEFAULT_AMADEUS_SITE_OFFICE_ID);
			flexPricerRequestVO.setSiteQueueOfficeID(CommonKeys.DEFAULT_AMADEUS_SITE_QUEUE_OFFICE_ID);
			if(null == flexPricerRequestVO.getSitePointOfSale())
				flexPricerRequestVO.setSitePointOfSale(CommonKeys.DEFAULT_POS);
			 
		}else{
			flexPricerRequestVO.setAmadeusSiteOfficeID(CommonKeys.DEFAULT_AMADEUS_SITE_OFFICE_ID);
			flexPricerRequestVO.setSiteQueueOfficeID(CommonKeys.DEFAULT_AMADEUS_SITE_QUEUE_OFFICE_ID);
			if(null == flexPricerRequestVO.getSitePointOfSale())
			flexPricerRequestVO.setSitePointOfSale(CommonKeys.DEFAULT_POS);
		} */
		flexPricerRequestVO.setIsMonthsBetweenValid(flightSearchVO.getIsMonthsBetweenValid());
		 
		return flexPricerRequestVO;
	}

	/**
	 * Private method to set Amadeus language retrieved from DB in
	 * flexPricerRequestVO corresponding to Language passed
	 * 
	 * @param flexPricerRequestVO
	 * @param language
	 * @return
	 */
	private FlexPricerRequestVO setAmadeusLanguage(FlexPricerRequestVO flexPricerRequestVO, String language) {
		List<String> amadeusLanguageCodeList = null;
		String amadeusLanguageCode = "GB";
		try {
			amadeusLanguageCodeList = commonDao.getAmadeusLanguageCode(language);
		} catch (DataAccessException e) {
			LOGGER.error("Exception occured while retrieving amadues language code.." + e);
		}
		 
		if(amadeusLanguageCodeList != null && !amadeusLanguageCodeList.isEmpty()){
			flexPricerRequestVO.setAmadeusLanguageCode(amadeusLanguageCodeList.get(0));
		}
		//LOGGER.info("amadeusLangCode from DB for the chosen language " + flexPricerRequestVO.getAmadeusLanguageCode() );
		return flexPricerRequestVO;
	}

	/**
	 * Method to create FlightSearchVO using values from flightSearchRequestVO
	 * and database before final URL creation
	 * 
	 * @param flightSearchRequestVO
	 * @return FlightSearchVO
	 */
	private FlightSearchVO createFlightSearchVO(FlightSearchRequestVO flightSearchRequestVO, String corporateId) {
	  
		FlightSearchVO flightSearchVO = new FlightSearchVO();
	 
		flightSearchVO.setSource(flightSearchRequestVO.getSource());
		flightSearchVO.setLanguage(flightSearchRequestVO.getLanguage());
		flightSearchVO.setCountry(flightSearchRequestVO.getCountry());
		flightSearchVO.setIsMobileDevice(flightSearchRequestVO.getIsMobileDevice());
		flightSearchVO.setProduct(flightSearchRequestVO.getProduct());
		flightSearchVO.setTripType(flightSearchRequestVO.getTripType());
		//flightSearchVO.setTripType(CommonKeys.TRIP_TYPE_ONE_WAY);
		flightSearchVO.setClientSessionId(flightSearchRequestVO.getClientSessionId());
		flightSearchVO.setDepartureCity(flightSearchRequestVO.getDepartureCity());
		flightSearchVO.setDepartureDate(flightSearchRequestVO.getDepartureDate());
		flightSearchVO.setDestinationCity(flightSearchRequestVO.getDestinationCity());
		flightSearchVO.setDateFlexible(flightSearchRequestVO.getDateFlexible());
		flightSearchVO.setReturnDate(flightSearchRequestVO.getReturnDate());
		flightSearchVO.setAdultCount(flightSearchRequestVO.getAdultCount());
		// A-10083 - on 17/02/2022
		flightSearchVO.setYoungAdultCount(flightSearchRequestVO.getYoungAdultCount());

		flightSearchVO.setInfantCount(flightSearchRequestVO.getInfantCount());
		flightSearchVO.setChildCount(flightSearchRequestVO.getChildCount());
		flightSearchVO.setAmadeusReturnUrl(flightSearchRequestVO.getAmadeusReturnUrl());
		flightSearchVO.setCabinClass(flightSearchRequestVO.getCabinClass());
		flightSearchVO.setSessionObj(flightSearchRequestVO.getSessionObj());
		flightSearchVO.setReqObj(flightSearchRequestVO.getReqObj());
		flightSearchVO.setCorporateName(flightSearchRequestVO.getCorporateName());
		if (flightSearchRequestVO.getUserId() != null && !flightSearchRequestVO.getUserId().isEmpty())
			flightSearchVO.setUserId(flightSearchRequestVO.getUserId());
		if (CommonsUtil.isStringValid(flightSearchRequestVO.getPromoCode())) {
			flightSearchVO.setPromoCode(flightSearchRequestVO.getPromoCode());
		} else {
			// IF incoming promocode is null, set it according to product
			if (flightSearchRequestVO.getProduct() != null
					&& (flightSearchRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB))) {
				flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE);
			} else {

				flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE_B2B);
			}
		}
		// Setting Corporate PromoCode
		if (flightSearchRequestVO.getProduct() != null
				&& (flightSearchRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B))
				&& (CommonsUtil.isStringValid(flightSearchRequestVO.getCorporatePromoCode()))) {
			flightSearchVO.setCorporatePromoCode(flightSearchRequestVO.getCorporatePromoCode());
			//LOGGER.info("PRODUCT_B2B CorpCode: " + flightSearchVO.getCorporatePromoCode());
		}
 
		/*
		 * Flex config name configured for the Route and Product
		 */
		flightSearchVO = setRouteConfigVOParameters(flightSearchRequestVO, flightSearchVO);
 

		flightSearchVO.setIsTripEligible(true);
		// HD-316604 Ends

		
		 /* flightSearchVO.setIsTripEligible(
		  isTripAvailableForGivenDate(flightSearchVO.getDepartureDate(),
		 flightSearchVO.getEffectiveDate())); LOGGER.info("Effective Date : "
		  + flightSearchVO.getEffectiveDate() + " DepartDate :" +
		  flightSearchVO.getDepartureDate() + " eligible :" +
		  flightSearchVO.getIsTripEligible());*/
		 

		String departureCountry = null;
		CitiesVO citiesEntity = null;
		List<CitiesVO> citiesEntityList = null;

		try {
			// select country_code, city_code, city_description,
			// airport_description from airlink_city_master where city_code = ?;	 
			citiesEntityList = ReadExcel.getCityMasterEntitiesList("airlink_city_master.xlsx");
		} catch (DataAccessException e) {
			LOGGER.error("Exception while retrieving data getCityMasterEntities " + e);
		}
		 LOGGER.info("find country for :"+flightSearchRequestVO.getDepartureCity()+" city");
		if (citiesEntityList != null && !citiesEntityList.isEmpty()) {
			for (Iterator iterator = citiesEntityList.iterator(); iterator.hasNext();) {
				CitiesVO citiesVO = (CitiesVO) iterator.next();
				if(citiesVO.getCityCode().equalsIgnoreCase(flightSearchRequestVO.getDepartureCity())){
					citiesEntity = citiesVO;
					// LOGGER.info("matched citiesEntity:"+citiesEntity);
					departureCountry = citiesVO.getCountryCode();					 
				}
			}
			//citiesEntity = citiesEntityList.get(0);
			//departureCountry = citiesEntity.getCountryCode();
		}
		LOGGER.info("departureCountry:"+departureCountry);
		flightSearchVO.setDepartureCountry(departureCountry);
		/*
		 * Get the POS City , currency and POS country
		 */

		String country = flightSearchRequestVO.getCountry();
		String language = flightSearchRequestVO.getLanguage();
		String product = flightSearchRequestVO.getProduct();

	 

		// Added on 23/10/2020 by A-8986 for mobile api -- start

		flightSearchVO = setPOSCityandCountry(flightSearchVO, country, language, product, departureCountry);
		flightSearchVO = setDomesticFlightFlag(flightSearchVO, country, language, product);

		// Added on 23/10/2020 by A-8986 for mobile api -- end

		/**
		 * to get the base url.
		 */
		String url = flightSearchRequestVO.getReqObj().getUrl().toString();
		String baseURL = url.substring(0, url.length() - flightSearchRequestVO.getReqObj().getUri().length()) + "/";
		
		baseURL = baseURL.replaceAll("http:", "https:");
		LOGGER.info("testurl:" + url.substring(0, url.length() - flightSearchRequestVO.getReqObj().getUri().length()));
		LOGGER.info("baseURL:" + baseURL);
		flightSearchVO.setBasePspURL(baseURL);
		/*
		 * 6 Month validation for domestic flights
		 */
		int monthsBetween = 0;
		int daysBetween = 0;
		if (CommonsUtil.isStringValid(flightSearchVO.getDepartureDate())
				&& CommonsUtil.isStringValid(flightSearchVO.getReturnDate())) {
			try {

				monthsBetween = DateUtilities.getMonthsBetween(flightSearchVO.getDepartureDate(),
						flightSearchVO.getReturnDate());
				daysBetween = (int) DateUtilities.getDaysBetween(flightSearchVO.getDepartureDate(),
						flightSearchVO.getReturnDate());
			} catch (ParseException e) {
				LOGGER.error("Error occured in DateUtilities.getMonthsBetween method");
			}
			//LOGGER.info("isDomFlight: " + flightSearchVO.isDomesticFlight() + " monthsBetween " + monthsBetween);
			//LOGGER.info("isDomFlight: " + flightSearchVO.isDomesticFlight() + " daysBetween " + daysBetween);

			 
			flightSearchVO.setIsMonthsBetweenValid(true);
		}
		 
		return flightSearchVO;
	}

	/**
	 * Method to retrieve route config parameters and to set in flightSearchVO
	 * 
	 * @param flightSearchRequestVO
	 * @param flightSearchVO
	 * @return
	 */
	@Override
	public FlightSearchVO setRouteConfigVOParameters(FlightSearchRequestVO flightSearchRequestVO,
			FlightSearchVO flightSearchVO) {
		List<RouteConfigVO> routeConfigVOList = null;
		RouteConfigVO routeConfigVO = null;
		String departureCity = null;
		String destinationCity = null;

		// select first city if trip type is multi city
		departureCity = getDepartureCity(flightSearchRequestVO.getDepartureCity(), flightSearchRequestVO.getTripType());
		destinationCity = getDepartureCity(flightSearchVO.getDestinationCity(), flightSearchRequestVO.getTripType());
		LOGGER.info("setRouteConfigVOParameters params departureCity: " + departureCity+", destinationCity:"+destinationCity);
		try {
			// fetching flex_config_name,is_redirected_to_SAA from
			// airlink_route_config
		
			routeConfigVOList = commonDao.getRouteConfigEntities(departureCity, destinationCity,
					flightSearchVO.getProduct());
		 
			 
			if (routeConfigVOList != null && !routeConfigVOList.isEmpty()  ) {
				routeConfigVO = routeConfigVOList.get(0);			 
				if (CommonsUtil.isStringValid(routeConfigVO.getFlexConfigName())) {				 
					flightSearchVO.setFlexConfigName(routeConfigVO.getFlexConfigName());
				} 
				flightSearchVO.setIsRedirectedToSAA(CommonKeys.FALSE);
				 

				/*
				 * Added on 08/09/2020 for routemap changes -- start
				 */
				if (CommonsUtil.isStringValid(routeConfigVO.getIsRouteConfigurational())) {
					if (CommonKeys.CHAR_Y.equals(routeConfigVO.getIsRouteConfigurational())) {
						// flightSearchVO.setThreeDsecuredEnabled(CommonKeys.TRUE);
						// -- Commented on 08/09/2020
						flightSearchVO.setIsRouteOperational(CommonKeys.TRUE.toString());
					} else {
						// flightSearchVO.setThreeDsecuredEnabled(CommonKeys.FALSE);
						flightSearchVO.setIsRouteOperational(CommonKeys.FALSE.toString());

					}
				} else {
					// flightSearchVO.setThreeDsecuredEnabled(CommonKeys.FALSE);
					flightSearchVO.setIsRouteOperational(CommonKeys.FALSE.toString());
				}
				/*
				 * Added on 08/09/2020 for routemap changes -- end
				 */

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

	// Added on 23/10/2020 for mobile API -- start
	@Override
	public FlightSearchVO setRouteConfigMobileVOParameters(FlightSearchMobileVORequest flightSearchMobileVORequest,
			FlightSearchVO flightSearchVO) {
		List<RouteConfigVO> routeConfigVOList = null;
		RouteConfigVO routeConfigVO = null;
		String departureCity = null;
		String destinationCity = null;

		// select first city if trip type is multi city
		departureCity = getDepartureCity(flightSearchVO.getDepartureCity(), flightSearchMobileVORequest.getTrip_type());
		destinationCity = getDepartureCity(flightSearchVO.getDestinationCity(),
				flightSearchMobileVORequest.getTrip_type());

		try {
			// fetching flex_config_name,is_redirected_to_SAA from
			// airlink_route_config
			LOGGER.info("Departure City:" + departureCity + ", Destination City:" + destinationCity);
			routeConfigVOList = commonDao.getRouteConfigEntities(departureCity, destinationCity,
					flightSearchVO.getProduct());
			if (routeConfigVOList != null && !routeConfigVOList.isEmpty()) {
				for (Iterator iterator = routeConfigVOList.iterator(); iterator.hasNext();) {
					RouteConfigVO routeConfigVO2 = (RouteConfigVO) iterator.next();
					if(routeConfigVO2.getOrigin().equalsIgnoreCase(departureCity) && 
							routeConfigVO2.getDestination().equalsIgnoreCase(destinationCity)){
						routeConfigVO = routeConfigVO2;
					}
				}
			//	routeConfigVO = routeConfigVOList.get(0);

				if (CommonsUtil.isStringValid(routeConfigVO.getFlexConfigName())) {
					flightSearchVO.setFlexConfigName(routeConfigVO.getFlexConfigName());
				}
			 
				flightSearchVO.setIsRedirectedToSAA(CommonKeys.FALSE);
				 

				/*
				 * Added on 08/09/2020 for routemap changes -- start
				 */
				if (CommonsUtil.isStringValid(routeConfigVO.getIsRouteConfigurational())) {
					if (CommonKeys.CHAR_Y.equals(routeConfigVO.getIsRouteConfigurational())) {
						// flightSearchVO.setThreeDsecuredEnabled(CommonKeys.TRUE);
						// -- Commented on 08/09/2020
						flightSearchVO.setIsRouteOperational(CommonKeys.TRUE.toString());
					} else {
						// flightSearchVO.setThreeDsecuredEnabled(CommonKeys.FALSE);
						flightSearchVO.setIsRouteOperational(CommonKeys.FALSE.toString());

					}
				} else {
					// flightSearchVO.setThreeDsecuredEnabled(CommonKeys.FALSE);
					flightSearchVO.setIsRouteOperational(CommonKeys.FALSE.toString());
				}
				/*
				 * Added on 08/09/2020 for routemap changes -- end
				 */

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

	public FlightSearchVO setRouteConfigMultiCityMobileVOParameters(
			FlightSearchMultiCityMobileRequest flightSearchMobileVORequest, FlightSearchVO flightSearchVO) {
		List<RouteConfigVO> routeConfigVOList = null;
		RouteConfigVO routeConfigVO = null;
		String departureCity = null;
		String destinationCity = null;

		// select first city if trip type is multi city
		departureCity = getDepartureCity(flightSearchVO.getDepartureCity(), flightSearchMobileVORequest.getTripType());
		destinationCity = getDepartureCity(flightSearchVO.getDestinationCity(),
				flightSearchMobileVORequest.getTripType());
		String dCity = null;
		String dstCity = null;
		String prd = null;
		try {
			// fetching flex_config_name,is_redirected_to_SAA from
			// airlink_route_config
			LOGGER.info("setRouteConfigMultiCityMobile Parameters Departure City:" + departureCity + ", Destination City:" + destinationCity);
			//routeConfigVOList = commonDao.getRouteConfigEntities(departureCity, destinationCity,
			//		flightSearchVO.getProduct());
			routeConfigVOList = commonDao.getRouteConfigEntities(departureCity, destinationCity,
					flightSearchVO.getProduct());
			for (Iterator iterator = routeConfigVOList.iterator(); iterator.hasNext();) {
				RouteConfigVO routeConfigVO2 = (RouteConfigVO) iterator.next();
			 if(routeConfigVO2.getOrigin().equalsIgnoreCase(departureCity)){
				 dCity=routeConfigVO2.getOrigin() ;				 
			 }
			 if(routeConfigVO2.getDestination().equalsIgnoreCase(destinationCity)){
				 dstCity=routeConfigVO2.getDestination() ;				 
			 }
			 if(routeConfigVO2.getProductMasterCode().equalsIgnoreCase(flightSearchVO.getProduct())){
				 prd=routeConfigVO2.getProductMasterCode() ;				 
			 }			 
			 if(null != dCity && null !=  dstCity && null != prd ){				 ;
				 routeConfigVO = routeConfigVO2;
			 }
			}
			if (routeConfigVOList != null && !routeConfigVOList.isEmpty() && routeConfigVO != null) {
				
				//routeConfigVO = routeConfigVOList.get(0);
 
				if (CommonsUtil.isStringValid(routeConfigVO.getFlexConfigName())) {
					flightSearchVO.setFlexConfigName(routeConfigVO.getFlexConfigName());
				}
				 
				flightSearchVO.setIsRedirectedToSAA(CommonKeys.FALSE);
				 

				/*
				 * Added on 08/09/2020 for routemap changes -- start
				 */
				if (CommonsUtil.isStringValid(routeConfigVO.getIsRouteConfigurational())) {
					if (CommonKeys.CHAR_Y.equals(routeConfigVO.getIsRouteConfigurational())) {
						// flightSearchVO.setThreeDsecuredEnabled(CommonKeys.TRUE);
						// -- Commented on 08/09/2020
						flightSearchVO.setIsRouteOperational(CommonKeys.TRUE.toString());
					} else {
						// flightSearchVO.setThreeDsecuredEnabled(CommonKeys.FALSE);
						flightSearchVO.setIsRouteOperational(CommonKeys.FALSE.toString());

					}
				} else {
					// flightSearchVO.setThreeDsecuredEnabled(CommonKeys.FALSE);
					flightSearchVO.setIsRouteOperational(CommonKeys.FALSE.toString());
				}
				/*
				 * Added on 08/09/2020 for routemap changes -- end
				 */

			} else {
				throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
						environment.getRequiredProperty("route.not.configured.in.DB"));
			}
		} catch (DataAccessException e) {
			LOGGER.error("Error while retrieving Route Config Entities");
		}
		return flightSearchVO;
	}
	// Added on 23/10/2020 for mobile API -- end

	/**
	 * Method to return departure city based on checking whether multicity
	 * flight search or not
	 * 
	 * @param departureCity
	 * @param tripType
	 * @return
	 */
	private String getDepartureCity(String departureCity, String tripType) {
		String dCity = null;
		if (CommonsUtil.isStringValid(tripType) && tripType.equals(CommonKeys.TRIP_TYPE_MULTI_CITY)) {
			dCity = departureCity.split(CommonKeys.MULTICITY_SPLITTER_REGEX)[0];
		} else {
			dCity = departureCity;
		}
		return dCity;
	}

	/**
	 * Method to check whether route is Domestic or international or regional
	 * 
	 * @param flightSearchVO
	 * @param flightSearchRequestVO
	 * @return
	 */

	/*
	 * Commented on 23/10/2020 by A-8986 for mobile api -- start
	 *
	 * private FlightSearchVO setDomesticFlightFlag(FlightSearchVO
	 * flightSearchVO, FlightSearchRequestVO flightSearchRequestVO) {
	 * 
	 * //Checking if Domestic flight
	 * 
	 * boolean forRegionalCheck = false; if
	 * (checkForDomesticFlight(flightSearchRequestVO.getDestinationCity(),
	 * flightSearchRequestVO.getDepartureCity(), CommonKeys.COUNTRY_ZA,
	 * flightSearchRequestVO.getLanguage(), flightSearchRequestVO.getProduct(),
	 * forRegionalCheck)) { flightSearchVO.setDomesticFlight(CommonKeys.TRUE);
	 * flightSearchVO.setFlexiDomesticFlight(CommonKeys.TRUE); } else {
	 * flightSearchVO.setDomesticFlight(CommonKeys.FALSE);
	 * flightSearchVO.setFlexiDomesticFlight(CommonKeys.FALSE); }
	 * 
	 * 
	 * //Checking if Regional flight
	 * 
	 * forRegionalCheck = true; if
	 * (checkForDomesticFlight(flightSearchRequestVO.getDestinationCity(),
	 * flightSearchRequestVO.getDepartureCity(),
	 * flightSearchVO.getDepartureCountry(),
	 * flightSearchRequestVO.getLanguage(), flightSearchRequestVO.getProduct(),
	 * forRegionalCheck)) { flightSearchVO.setRegionalFlight(CommonKeys.TRUE); }
	 * else { flightSearchVO.setRegionalFlight(CommonKeys.FALSE); }
	 * 
	 * return flightSearchVO; }
	 *
	 * Commented on 23/10/2020 by A-8986 for mobile api -- end
	 */

	// Added on 23/10/2020 by A-8986 for mobile api -- start
	private FlightSearchVO setDomesticFlightFlag(FlightSearchVO flightSearchVO, String country, String language,
			String product) {

		// Checking if Domestic flight

		boolean forRegionalCheck = false;
		if (checkForDomesticFlight(flightSearchVO.getDestinationCity(), flightSearchVO.getDepartureCity(),
				CommonKeys.COUNTRY_ZA, language, product, forRegionalCheck)) {
			flightSearchVO.setDomesticFlight(CommonKeys.TRUE);
			flightSearchVO.setFlexiDomesticFlight(CommonKeys.TRUE);
		} else {
			flightSearchVO.setDomesticFlight(CommonKeys.FALSE);
			flightSearchVO.setFlexiDomesticFlight(CommonKeys.FALSE);
		}

		// Checking if Regional flight

		forRegionalCheck = true;
		if (checkForDomesticFlight(flightSearchVO.getDestinationCity(), flightSearchVO.getDepartureCity(),
				flightSearchVO.getDepartureCountry(), language, product, forRegionalCheck)) {
			flightSearchVO.setRegionalFlight(CommonKeys.TRUE);
		} else {
			flightSearchVO.setRegionalFlight(CommonKeys.FALSE);
		}

		return flightSearchVO;
	}
	// Added on 23/10/2020 by A-8986 for mobile api -- end

	@Override
	public boolean checkForDomesticFlight(String destination, String origin, String country, String language,
			String product, boolean forRegionalCheck) {
		boolean isOriginDomestic = false;
		boolean isDestinationDomestic = false;
		List<ConfiguredPOSVO> cityList = null;

		try {
			cityList = commonDao.getConfiguredPOSList(country, language, product);
		} catch (DataAccessException e) {
			LOGGER.error("Exception occured while checking for Domestic route" + e);
		}

		if (cityList != null && !cityList.isEmpty()) {
			for (ConfiguredPOSVO cityVO : cityList) {
				if (CommonsUtil.isStringValid(destination) && destination.equalsIgnoreCase(cityVO.getCityCode())) {
					isDestinationDomestic = true;
				}
				if (CommonsUtil.isStringValid(origin) && origin.equalsIgnoreCase(cityVO.getCityCode())) {
					isOriginDomestic = true;
				}
				if (isDestinationDomestic && isOriginDomestic) {
					break;
				}
			}
		}
	 
		if (forRegionalCheck) {
			if (isDestinationDomestic || isOriginDomestic) {
				return CommonKeys.TRUE;
			}
		} else {
			if (isDestinationDomestic && isOriginDomestic) {
				return CommonKeys.TRUE;
			}
		}
		
		return CommonKeys.FALSE;
	}

	/**
	 * Method to retrieve common flexPricer parameters from DB and to set in
	 * flexPricerRequestVO
	 * 
	 * @param flexPricerRequestVO
	 * @param flightSearchVO
	 * @return
	 */
	private FlexPricerRequestVO getFlexPricerCommonParameters(FlexPricerRequestVO flexPricerRequestVO) {
		List<AirLinkParameterMasterVO> eRetailConfigVOList = null;
		try {
			eRetailConfigVOList = commonDao.getERetailConfigDetails();
			
		} catch (DataAccessException e) {
			LOGGER.error("Error occured while retrieving ERetail Config details" + e);
		}
		if (eRetailConfigVOList != null && !eRetailConfigVOList.isEmpty()) {
			for (AirLinkParameterMasterVO eRetailConfigVO : eRetailConfigVOList) {
				if (CommonsUtil.isStringValid(eRetailConfigVO.getMasterCode())) {
				 	if (eRetailConfigVO.getMasterCode().equalsIgnoreCase(ServiceParamsKeys.ERETAIL_TRIP_FLOW)) {
						flexPricerRequestVO.setTripFlow(eRetailConfigVO.getValue());
					}
					if (eRetailConfigVO.getMasterCode().equals(ServiceParamsKeys.ERETAIL_FLEX_PRICER_REQUEST)) {
						flexPricerRequestVO.setEmbTransFlexPricerAction(eRetailConfigVO.getValue());
					}
					/*
					 * if (eRetailConfigVO.getParameterCode().equals(
					 * ServiceParamsKeys.ERETAIL_BOOKING_CONFIRM_ACTION)) {
					 * flexPricerRequestVO.setEmbTransBookingConfirmAction(
					 * eRetailConfigVO.getParameterValue()); } if
					 * (eRetailConfigVO.getParameterCode().equals(
					 * ServiceParamsKeys.ERETAIL_EXT_PSP_URL)) {
					 * flexPricerRequestVO.setSiteExtendedPspURL(eRetailConfigVO
					 * .getParameterValue()); } if
					 * (eRetailConfigVO.getParameterCode().equals(
					 * ServiceParamsKeys.ERETAIL_SITE_EXT_MERCHANTID)) {
					 * flexPricerRequestVO.setSiteExtMerchantID(eRetailConfigVO.
					 * getParameterValue()); }
					 */
					if (eRetailConfigVO.getValue().equals(ServiceParamsKeys.ERETAIL_ENCRYPTION_ENABLED)) {
						flexPricerRequestVO.setEncryptionEnabled(eRetailConfigVO.getValue());
					}
					if (eRetailConfigVO.getValue().equals(ServiceParamsKeys.ERETAIL_EMB_PURCHASE_ACTION)) {
						flexPricerRequestVO.setEmbTransPurchaseAction(eRetailConfigVO.getValue());
					}
				}
			}
		}
		return flexPricerRequestVO;
	}
	/**
	 * Method to retrieve site ID and product type and to set in flex pricer
	 * request VO
	 * 
	 * @param flexPricerRequestVO
	 * @param product
	 * @return
	 */
	private FlexPricerRequestVO getFlexPricerSiteCode(FlexPricerRequestVO flexPricerRequestVO, String product) {
		List<AirLinkParameterMasterVO> eRetailConfigVOList = null;
		AirLinkParameterMasterVO eRetailConfigVO = null;
		
		try {
			eRetailConfigVOList = commonDao
					.getERetailConfigDetailsWithMasterCode(ServiceParamsKeys.ERETAIL_PRODUCT_DELIMITER.concat(product));
		} catch (DataAccessException e) {
			LOGGER.error("Error while retrieving eretails config details with master code" + e);
		}
		//LOGGER.info("product code :" +ServiceParamsKeys.ERETAIL_PRODUCT_DELIMITER.concat(product));
		for (Iterator iterator = eRetailConfigVOList.iterator(); iterator.hasNext();) {
			AirLinkParameterMasterVO parameterMasterVO = (AirLinkParameterMasterVO) iterator.next();
			if(parameterMasterVO.getMasterCode().equalsIgnoreCase(ServiceParamsKeys.ERETAIL_PRODUCT_DELIMITER.concat(product))){
				eRetailConfigVO = parameterMasterVO;
			//	LOGGER.info("matched :" +eRetailConfigVO);
				flexPricerRequestVO.setSiteID(parameterMasterVO.getValue());
				flexPricerRequestVO.setProductType(parameterMasterVO.getMasterDescription());				
			}
		}
		/*if (eRetailConfigVOList != null && !eRetailConfigVOList.isEmpty()) {
			eRetailConfigVO = eRetailConfigVOList.get(0);
		}*/
		/*if (eRetailConfigVO != null) {
			flexPricerRequestVO.setSiteID(eRetailConfigVO.getValue());
			flexPricerRequestVO.setProductType(eRetailConfigVO.getMasterDescription());
		}*/
		LOGGER.info("SiteId :" + flexPricerRequestVO.getSiteID() + "; PrdtType :" + flexPricerRequestVO.getProductType());
		return flexPricerRequestVO;
	}

	/**
	 * Method to get FlexPricer Details and set in flexPricerRequestVo
	 * 
	 * @param flexPricerRequestVO
	 * @return
	 */
	private FlexPricerRequestVO getFlexPricerDetails(FlexPricerRequestVO flexPricerRequestVO) {
		List<FlexPricerDetailsVO> flexPricerDetailsVOList = null;
		FlexPricerDetailsVO flexPricerDetailsVO = null;
		
		//LOGGER.info("from getFlexPricerDetails flexPricerRequestVO:"+flexPricerRequestVO);
		try {
			flexPricerDetailsVOList = commonDao.getFlexPricerDetailsList(flexPricerRequestVO.getFlexConfigName(),
					flexPricerRequestVO.getRouteType());
		 
			/*for (Iterator iterator = flexPricerDetailsVOList.iterator(); iterator.hasNext();) {
				FlexPricerDetailsVO flexPricerDetails = (FlexPricerDetailsVO) iterator.next();
				if(flexPricerDetails.getFlexConfigName().equalsIgnoreCase(flexPricerRequestVO.getFlexConfigName())){
					 
					if(flexPricerDetails.getRouteType().equalsIgnoreCase(flexPricerRequestVO.getRouteType())){
						flexPricerDetailsVO = flexPricerDetails;
						LOGGER.info("flexPricerDetails.getRouteType():"+flexPricerDetails.getRouteType());
					}
				}
			}*/
			//LOGGER.info("After setting params FlexConfigName:" + flexPricerRequestVO.getFlexConfigName()
			//		+ ", RouteType" + flexPricerRequestVO.getRouteType());
		} catch (DataAccessException e) {
			LOGGER.error("Exception occured while retrieving Flex pricer details" + e);
		}
		if (flexPricerDetailsVOList != null && !flexPricerDetailsVOList.isEmpty()) {
			flexPricerDetailsVO = flexPricerDetailsVOList.get(0);
			//LOGGER.info("flexPricerDetailsVO1:"+flexPricerDetailsVO);
		}

		if (flexPricerDetailsVO != null) {
	 
			// added for mcity A-8551
		 
			if (flexPricerRequestVO.getTripType().equalsIgnoreCase("M")) {
				flexPricerRequestVO.setFareFamily1(flexPricerDetailsVO.getFareFamilyMcity1());
				flexPricerRequestVO.setFareFamily3(flexPricerDetailsVO.getFareFamilyMcity3());
				flexPricerRequestVO.setFareFamily2(flexPricerDetailsVO.getFareFamilyMcity2());
			} else {
				flexPricerRequestVO.setFareFamily1(flexPricerDetailsVO.getFareFamily1());
				flexPricerRequestVO.setFareFamily2(flexPricerDetailsVO.getFareFamily2());
				flexPricerRequestVO.setFareFamily3(flexPricerDetailsVO.getFareFamily3());
			}

			flexPricerRequestVO.setPricingType(flexPricerDetailsVO.getPricingType());
			flexPricerRequestVO.setDisplayType(flexPricerDetailsVO.getDisplayType());
			flexPricerRequestVO.setArrangeBy(flexPricerDetailsVO.getArrangeBy());
			flexPricerRequestVO.setDateRangeValue1(flexPricerDetailsVO.getDateRangeValue1());
			flexPricerRequestVO.setDateRangeValue2(flexPricerDetailsVO.getDateRangeValue2());
			flexPricerRequestVO.setDateRangeQualifier1(flexPricerDetailsVO.getDateRangeQualifier1());
			flexPricerRequestVO.setDateRangeQualifier2(flexPricerDetailsVO.getDateRangeQualifier2());
		}
		//LOGGER.info("return from getFlexPricerDetails flexPricerRequestVO:"+flexPricerRequestVO);
	 
		return flexPricerRequestVO;

	}
/*
	/**
	 * Method to retrieve PromocodeVO details and set in flexPricerRequestVO
	 * 
	 * @param promoCode
	 * @return
	 */
	private PromoFaresVO getPromoCodeVO(String promoCode) {
		List<PromoFaresVO> promoFaresVoList = null;
		PromoFaresVO promoFaresVO = new PromoFaresVO();
		try {
			promoFaresVoList = commonDao.getPromofareDetailsByFareCode(promoCode);
		} catch (DataAccessException se) {
			LOGGER.error("Error while retrieving PromoCode details"+se.getMessage());
		}
		if (promoFaresVoList != null && !promoFaresVoList.isEmpty()) {
			promoFaresVO = promoFaresVoList.get(0);
		}
		return promoFaresVO;
	}

	/**
	 * Private method to retrieve POS Details from DB and to set in
	 * flexPricerRequestVO
	 * 
	 * @param flexPricerRequestVO
	 * @return
	 */
	private FlexPricerRequestVO getPosDetailsList(FlexPricerRequestVO flexPricerRequestVO) {
		List<PosCityMasterVO> posDetailsList = null;
		try {
			posDetailsList = commonDao.updateRequestWithPOSDetails(flexPricerRequestVO.getProduct(),
					flexPricerRequestVO.getCityForOfficeID());
		} catch (DataAccessException e) {
			LOGGER.error("Error while retrieving posDetails"+e.getMessage());
		}
		if (posDetailsList != null && !posDetailsList.isEmpty()) {
			flexPricerRequestVO.setSiteQueueOfficeID(posDetailsList.get(0).getQueueOfficeId());
			flexPricerRequestVO.setSitePointOfTicketing(posDetailsList.get(0).getPointOfTicketing());
			flexPricerRequestVO.setSiteQueueNumber(posDetailsList.get(0).getQueueNumber());
			flexPricerRequestVO.setSiteQueueCategory(posDetailsList.get(0).getQueueCategory());
			flexPricerRequestVO.setAmadeusSiteOfficeID(posDetailsList.get(0).getAmadeusOfficeId());
			/*flexPricerRequestVO.setSiteQueueOfficeID(posDetailsList.get(0).getSiteQueueOfficeID());
			flexPricerRequestVO.setSitePointOfTicketing(posDetailsList.get(0).getSitePointOfTicketing());
			flexPricerRequestVO.setSiteQueueNumber(posDetailsList.get(0).getSiteQueueNumber());
			flexPricerRequestVO.setSiteQueueCategory(posDetailsList.get(0).getSiteQueueCategory());
			flexPricerRequestVO.setAmadeusSiteOfficeID(posDetailsList.get(0).getAmadeusSiteOfficeID());*/
		}
		 
		return flexPricerRequestVO;
	}

	/**
	 * Method to retrieve configured POS details
	 * 
	 * @param flightSearchVO
	 * @param flightSearchRequestVO
	 * @param departureCountry
	 * @return
	 */
	@Override
	/*
	 * Commented on 23/10/2020 by A-8986 for mobile API -- start
	 * 
	 * public FlightSearchVO setPOSCityandCountry(FlightSearchVO flightSearchVO,
	 * FlightSearchRequestVO flightSearchRequestVO, String departureCountry){
	 *
	 * Commented on 23/10/2020 by A-8986 for mobile API -- end
	 */

	// Added on 23/10/2020 by A-8986 for mobile API -- start
	public FlightSearchVO setPOSCityandCountry(FlightSearchVO flightSearchVO, String country, String language,
			String product, String departureCountry) {
		// Added on 23/10/2020 by A-8986 for mobile API -- end

		List<ConfiguredPOSVO> configuredPOSVOList = null;
		ConfiguredPOSVO configuredPOSVO = null;
		String configuredPOSCity = null;
		String currency = null;
		String departureCity = null;

		departureCity = getDepartureCity(flightSearchVO.getDepartureCity(), flightSearchVO.getTripType());
	 

		/*
		 * Commented on 23/10/2020 by A-8986 for mobile API -- start
		 *
		 * if (isConfiguredPOSCity(flightSearchRequestVO,departureCity)) { try {
		 * configuredPOSVOList =
		 * commonDao.getConfiguredPosDetails(flightSearchRequestVO.getSessionObj
		 * ().getCountry(),
		 * flightSearchRequestVO.getSessionObj().getLanguage()); } catch
		 * (DataAccessException e) { LOGGER.
		 * error("Exception occured while checking the POS connection ID." + e);
		 * } }
		 *
		 * Commented on 23/10/2020 by A-8986 for mobile API -- end
		 * 
		 * 
		 */

		// Added on 23/10/2020 by A-8986 for mobile API -- start
		if (isConfiguredPOSCity(country, language, product, departureCity)) {
			try {
				configuredPOSVOList = commonDao.getConfiguredPosDetails(country, language);
			} catch (DataAccessException e) {
				LOGGER.error("Exception occured while checking the POS connection ID." + e);
			}
		}
		// Added on 23/10/2020 by A-8986 for mobile API -- end

		if (configuredPOSVOList != null && !configuredPOSVOList.isEmpty()) {
			configuredPOSVO = configuredPOSVOList.get(0);
			//LOGGER.info("configuredPOSVO : " + configuredPOSVO);
			configuredPOSCity = configuredPOSVO.getCityCode();
			currency = configuredPOSVO.getCurrency();
			 
			if (CommonsUtil.isStringValid(configuredPOSCity)) {
				flightSearchVO.setPosCity(configuredPOSCity);
			} else {
				flightSearchVO.setPosCity(departureCity);
			}

			if (CommonsUtil.isStringValid(currency)) {
				flightSearchVO.setCurrency(currency);
			}
		} else {
			flightSearchVO.setPosCity(departureCity);
		}
		//LOGGER.info("POS City1 : " + flightSearchVO.getPosCity());
		if (!CommonsUtil.isStringValid(flightSearchVO.getPosCity())) {
			flightSearchVO.setPosCity(ServiceParamsKeys.DEFAULT_POS_CITY);
		}
		
		/*if (!CommonsUtil.isStringValid(currency)) {
			flightSearchVO.setCurrency(CommonKeys.DEFAULT_CURRENCY);
		}*/
		LOGGER.info("currency : " + flightSearchVO.getCurrency());
		// Commented on 23/10/2020 by A-8986 for mobile API
		 //flightSearchVO.setPosCountry(flightSearchRequestVO.getCountry());

		// Added on 23/10/2020 by A-8986 for mobile API
		//flightSearchVO.setPosCountry(country);
		flightSearchVO.setPosCountry(flightSearchVO.getDepartureCountry());
		/*if (!CommonsUtil.isStringValid(flightSearchVO.getPosCountry())) {
			flightSearchVO.setPosCountry(ServiceParamsKeys.DEFAULT_POS_CON);
		}*/
		//LOGGER.info("POS Country : " + flightSearchVO.getPosCountry());
		 
		LOGGER.info("flightSearchVO : " + flightSearchVO);
		return flightSearchVO;
	}

	/**
	 * To check whether departure city is a configured POS city
	 * 
	 * @param departureCity
	 * @param departureCountry
	 * @param language
	 * @param product
	 * @return
	 */
	/*
	 * Commented on 23/10/2020 by A-8986 for mobile API -- start
	 *
	 * private boolean isConfiguredPOSCity(FlightSearchRequestVO
	 * flightSearchRequestVO,String departureCity) {
	 *
	 * Commented on 23/10/2020 by A-8986 for mobile API -- end
	 */

	// Added on 23/10/2020 by A-8986 for mobile API -- start
	private boolean isConfiguredPOSCity(String countryCode, String language, String productCode, String departureCity) {
		// Added on 23/10/2020 by A-8986 for mobile API -- end

		boolean isConfiguredPosCity = false;
		try {
			List<ConfiguredPOSVO> selectedCountryOriginList = null;
			List<ConfiguredPOSVO> cityList = new ArrayList<ConfiguredPOSVO>();

			/*
			 * Commented on 23/10/2020 by A-8986 for mobile API -- start
			 *
			 * LOGGER.info("session obj:"+flightSearchRequestVO.getSessionObj())
			 * ; String countryCode =
			 * flightSearchRequestVO.getSessionObj().getCountry(); String
			 * language = flightSearchRequestVO.getSessionObj().getLanguage();
			 * String productCode =
			 * flightSearchRequestVO.getSessionObj().getProduct();
			 *
			 * Commented on 23/10/2020 by A-8986 for mobile API -- start
			 */
			LOGGER.info("To find city, params - "+"countryCode :" + countryCode+"; language :" + language+"; productCode :" + productCode);
			 

			//List<ConfiguredPOSVO> domesticOriginList = null;
			//List<ConfiguredPOSVO> regionCityList  = null;
			List<ConfiguredPOSVO> domesticOriginList = commonDao.getConfiguredPOSList("ZA", language, productCode);
			List<ConfiguredPOSVO> regionCityList = commonDao.getRegionalCityList("ZA", language, productCode);
			LOGGER.info("regionCityList size:" + regionCityList.size());
			if (CommonsUtil.isStringValid(countryCode) && !"ZA".equalsIgnoreCase(countryCode)) {
				selectedCountryOriginList = commonDao.getConfiguredPOSList(countryCode, language, productCode);
				//LOGGER.info("selectedCountryOriginList size:" + selectedCountryOriginList.size());
				if (selectedCountryOriginList != null && !selectedCountryOriginList.isEmpty()) {
					cityList.addAll(selectedCountryOriginList);
				}
			}

			if (domesticOriginList != null && !domesticOriginList.isEmpty()) {
				cityList.addAll(domesticOriginList);
			}
			if (regionCityList != null && !regionCityList.isEmpty()) {
				cityList.addAll(regionCityList);
			}
			LOGGER.info("isConfiguredPOScity cityList.size:"+cityList.size());
			if (cityList != null && !cityList.isEmpty()) {

				for (ConfiguredPOSVO cityVO : cityList) {
					if (CommonsUtil.isStringValid(cityVO.getCityCode()) && CommonsUtil.isStringValid(departureCity)
							&& (cityVO.getCityCode().equalsIgnoreCase(departureCity))) {
						isConfiguredPosCity = true;
						break;
					}
				}
			}
		} catch (DataAccessException e) {
			LOGGER.error("Unable to get the check for configured pos cities", e);
		}
		LOGGER.info("isConfiguredPosCity::"+isConfiguredPosCity);
		return isConfiguredPosCity;
	}

	/**
	 * Method to determine the Point of Sale and City for Office Id
	 * 
	 * @param flexPricerRequestVO
	 * @param flightSearchVO
	 * 
	 * @return FlexPricerRequestVO
	 */
	private FlexPricerRequestVO getPosDetailsVOParameters(FlexPricerRequestVO flexPricerRequestVO,
			FlightSearchVO flightSearchVO) {
	 
		List<PosDetailsVO> posDetailsVoList = null;
		List<CitiesVO> cityDetailsVoList = null;
		Map<String, String> map = null;
		PosDetailsVO posDetailsVO = new PosDetailsVO();
		CitiesVO citiesVO = new CitiesVO();
		String departureCountry = null;

		String departureCity = null;
		//LOGGER.info(" getPosDetailsVOParameters flightSearchVO:" + flightSearchVO);
		departureCity = getDepartureCity(flightSearchVO.getDepartureCity(), flightSearchVO.getTripType());
		LOGGER.info("getPosDetailsVOParameters params departureCity : " + departureCity+", country:"+flightSearchVO.getDepartureCountry());
		try {			 		 
			cityDetailsVoList = commonDao.getCityMasterEntities(flightSearchVO.getDepartureCity());
		//	posDetailsVoList = commonDao.getDefaultPosDetailsList(flightSearchVO.getCountry(),
			//		flightSearchVO.getLanguage());
			posDetailsVoList = commonDao.getDefaultPosDetailsList(flightSearchVO.getDepartureCountry(),
					flightSearchVO.getLanguage());
		} catch (DataAccessException e) {
			LOGGER.error("Error occured while retrieving data for citiesVO" + e);
		}
		LOGGER.info("flightSearchVO.getDepartureCity()---" + flightSearchVO.getDepartureCity());
		LOGGER.info("cityDetailsVoList---" + cityDetailsVoList);
		LOGGER.info("posDetailsVoList---" + posDetailsVoList);
		if (cityDetailsVoList != null && !cityDetailsVoList.isEmpty()) {			 
				for (Iterator cityIterator = cityDetailsVoList.iterator(); cityIterator.hasNext();) {
					CitiesVO cityDetailsVO2 = (CitiesVO) cityIterator.next();
					if(cityDetailsVO2.getCityCode().equalsIgnoreCase(flightSearchVO.getDepartureCity())){
						citiesVO = cityDetailsVO2;//posDetailsVoList.get(0);
						//LOGGER.info("Matched citiesVO---" +citiesVO);
				}				 
			}
		/*	posDetailsVoList.stream().forEach(elem -> {
				if(elem.getCityCode().contentEquals(flightSearchVO.getDepartureCity())){
					posDetailsVO = (PosDetailsVO) elem.getCityCode();
				}						 
			});*/
			//posDetailsVO = posDetailsVoList.get(0);
		}
 		if (posDetailsVoList != null && !posDetailsVoList.isEmpty()) {
			posDetailsVO = posDetailsVoList.get(0);
			if (posDetailsVO != null && CommonsUtil.isStringValid(posDetailsVO.getCityCode())) {
				if (citiesVO != null && CommonsUtil.isStringValid(citiesVO.getCityCode())) {
					posDetailsVO.setCityCode(citiesVO.getCityCode());
				}
			}
		} 
	if (posDetailsVO != null && CommonsUtil.isStringValid(posDetailsVO.getCityCode())) {
			flexPricerRequestVO.setSitePointOfSale(posDetailsVO.getCityCode()); 
			flexPricerRequestVO.setCityForOfficeID(flexPricerRequestVO.getSitePointOfSale());
			flexPricerRequestVO.setIsAmadeusPos(CommonKeys.FALSE);
			flexPricerRequestVO.setCurrency(posDetailsVO.getCurrency());
			if (CommonsUtil.isStringValid(flexPricerRequestVO.getCurrency())) {
				flightSearchVO.setCurrency(flexPricerRequestVO.getCurrency());
			}
			//LOGGER.info("from posDetailsVO flexPricerRequestVO---" +flexPricerRequestVO);
	 }
		
 /*	if (citiesVO != null && CommonsUtil.isStringValid(citiesVO.getCityCode())) {
			flexPricerRequestVO.setSitePointOfSale(citiesVO.getCityCode());
			flexPricerRequestVO.setCityForOfficeID(flexPricerRequestVO.getSitePointOfSale());
			flexPricerRequestVO.setIsAmadeusPos(CommonKeys.FALSE); 
			flexPricerRequestVO.setCurrency(posDetailsVO.getCurrency());
			if (CommonsUtil.isStringValid(flexPricerRequestVO.getCurrency())) {
				flightSearchVO.setCurrency(flexPricerRequestVO.getCurrency());
			}
			LOGGER.info(" SitePointOfSale---" + flexPricerRequestVO.getSitePointOfSale()); 
		}  */
	else {
			departureCountry = flexPricerRequestVO.getDepartureCountry();
			LOGGER.info("departure cities country---" + departureCountry);

			try {
				posDetailsVoList = commonDao.getDefaultPosDetailsList(flightSearchVO.getCountry(),
						flightSearchVO.getLanguage());			 
		     } catch (DataAccessException e) {
				LOGGER.error("Error occured while retrieving data for PosDetailsVO" + e);
			}
			if (posDetailsVoList != null && !posDetailsVoList.isEmpty()) {
				for (Iterator iterator = posDetailsVoList.iterator(); iterator.hasNext();) {
					PosDetailsVO posDetailsVO2 = (PosDetailsVO) iterator.next();
					if(posDetailsVO2.getCityCode().equalsIgnoreCase(flightSearchVO.getDepartureCity())){
						posDetailsVO = posDetailsVO2;//posDetailsVoList.get(0);					
					}
				}
			}
			if (CommonsUtil.isStringValid(departureCountry)) {
				if (posDetailsVO != null) {
					if (departureCountry.equals(flexPricerRequestVO.getCountry())
							&& CommonsUtil.isStringValid(posDetailsVO.getAmadeusPos())) {
						flexPricerRequestVO.setSitePointOfSale(posDetailsVO.getAmadeusPos());
						flexPricerRequestVO.setCityForOfficeID(departureCity);
						flexPricerRequestVO.setIsAmadeusPos(CommonKeys.TRUE);
					} else if (departureCountry.equals(flexPricerRequestVO.getCountry())
							&& !CommonsUtil.isStringValid(posDetailsVO.getAmadeusPos())) {
						flexPricerRequestVO.setSitePointOfSale(departureCity);
						flexPricerRequestVO.setCityForOfficeID(flexPricerRequestVO.getSitePointOfSale());
						flexPricerRequestVO.setIsAmadeusPos(CommonKeys.FALSE);
					} else if (!departureCountry.equals(flexPricerRequestVO.getCountry())) {
						map = getPosDetailsVoListFromDB(flexPricerRequestVO, departureCountry,
								flightSearchVO.getLanguage());
						flexPricerRequestVO.setSitePointOfSale(map.get(ServiceParamsKeys.SITE_POINT_OF_SALE));
						flexPricerRequestVO.setCityForOfficeID(map.get(ServiceParamsKeys.CITY_FOR_OFFICE_ID));
						if (map.containsKey(ServiceParamsKeys.IS_AMADEUS_POS)
								&& map.get(ServiceParamsKeys.IS_AMADEUS_POS).equals(CommonKeys.CHAR_Y)) {
							flexPricerRequestVO.setIsAmadeusPos(CommonKeys.TRUE);
						} else {
							flexPricerRequestVO.setIsAmadeusPos(CommonKeys.FALSE);
						}
					}
				} else {
					if (!departureCountry.equals(flexPricerRequestVO.getCountry())) {
						map = getPosDetailsVoListFromDB(flexPricerRequestVO, departureCountry,
								flightSearchVO.getLanguage());
						flexPricerRequestVO.setSitePointOfSale(map.get(ServiceParamsKeys.SITE_POINT_OF_SALE));
						flexPricerRequestVO.setCityForOfficeID(map.get(ServiceParamsKeys.CITY_FOR_OFFICE_ID));
						if (map.containsKey(ServiceParamsKeys.IS_AMADEUS_POS)
								&& CommonsUtil.isStringValid(map.get(ServiceParamsKeys.IS_AMADEUS_POS))
								&& map.get(ServiceParamsKeys.IS_AMADEUS_POS).equals(CommonKeys.CHAR_Y)) {
							flexPricerRequestVO.setIsAmadeusPos(CommonKeys.TRUE);
						} else {
							flexPricerRequestVO.setIsAmadeusPos(CommonKeys.FALSE);
						}
					}
				}
			}
		}
		LOGGER.info("currency : " + flightSearchVO.getCurrency());
		LOGGER.info("SitePointOfSale:" + flexPricerRequestVO.getSitePointOfSale());
		LOGGER.info("cityForOfficeID:" + flexPricerRequestVO.getCityForOfficeID());
		return flexPricerRequestVO;
	}

	/**
	 * Method to fetch the default point of sale details from the database
	 * 
	 * @param flexPricerRequestVO
	 * @param departureCountry
	 * @param language
	 * 
	 * @return Map
	 */
	private Map<String, String> getPosDetailsVoListFromDB(FlexPricerRequestVO flexPricerRequestVO,
			String departureCountry, String language) {
		List<PosDetailsVO> posDetailsVoList = null;
		PosDetailsVO posDetailsVO = null;
		Map<String, String> map = new HashMap<String, String>();
		String departureCity = null;
		 
		departureCity = getDepartureCity(flexPricerRequestVO.getDepartureCity(), flexPricerRequestVO.getTripType());
		LOGGER.info("getPosDetailsVoListFromDB params departureCity:"+departureCity+", departureCountry:"+departureCountry);
		try {
			posDetailsVoList = commonDao.getDefaultPosDetailsList(departureCountry, language);
			for (Iterator iterator = posDetailsVoList.iterator(); iterator.hasNext();) {
				PosDetailsVO posDetailsVO2 = (PosDetailsVO) iterator.next();
				if(posDetailsVO2.getCountryCode().equalsIgnoreCase(departureCountry) 
						&& posDetailsVO2.getLang().equalsIgnoreCase(language)){
					posDetailsVO = posDetailsVO2;
					map.put(ServiceParamsKeys.SITE_POINT_OF_SALE, posDetailsVO.getAmadeusPos());					 
					map.put(ServiceParamsKeys.CITY_FOR_OFFICE_ID, posDetailsVO.getCityCode());
					map.put(ServiceParamsKeys.IS_AMADEUS_POS, posDetailsVO.getAmadeusPos());
				}
			}
		} catch (DataAccessException e) {
			LOGGER.error("Error occured while retrieving data for PosDetailsVO" + e);
		}
 
		/*if (posDetailsVoList != null) {
			posDetailsVO = posDetailsVoList.get(0);
		}*/
		/*if (posDetailsVO != null) {
			if (CommonsUtil.isStringValid(posDetailsVO.getCityCode())) {
				map.put(ServiceParamsKeys.SITE_POINT_OF_SALE, posDetailsVO.getCityCode());
				map.put(ServiceParamsKeys.CITY_FOR_OFFICE_ID, posDetailsVO.getCityCode());
			} else {
				map.put(ServiceParamsKeys.SITE_POINT_OF_SALE, posDetailsVO.getAmadeusPos());
				map.put(ServiceParamsKeys.CITY_FOR_OFFICE_ID, departureCity);
				map.put(ServiceParamsKeys.IS_AMADEUS_POS, CommonKeys.CHAR_Y);
			}
		}*/
		return map;
	}

	/**
	 * This method will give a list of payment types allowed for the Point of
	 * sale and product
	 * 
	 * @param flexPricerRequestVO
	 * @param flightSearchVO
	 * @return FlexPricerRequestVO
	 * 
	 */
	public FlexPricerRequestVO getPaymentTypesAllowed(FlexPricerRequestVO flexPricerRequestVO,
			FlightSearchVO flightSearchVO) throws SystemException {
		List<AirLinkParameterMasterVO> paymentTypes = null;
		String departureDate = null;
		try {
			departureDate = getDepartureDate(flightSearchVO.getDepartureDate(), flightSearchVO.getTripType());
			LOGGER.info("on Payment Language :" + flexPricerRequestVO.getLanguage() + " POS :"
					+ flexPricerRequestVO.getSitePointOfSale() + " Prdt :" + flexPricerRequestVO.getProduct()
					+ " date: " + departureDate);
			paymentTypes = commonDao.getPaymentTypesAllowed(flexPricerRequestVO.getLanguage(),
					flexPricerRequestVO.getSitePointOfSale(), flexPricerRequestVO.getProduct(), departureDate,
					flexPricerRequestVO.getSessionObj().getSessionId());
			 
			if (paymentTypes != null && !paymentTypes.isEmpty()) {
				for (AirLinkParameterMasterVO parameterVO : paymentTypes) {
					 LOGGER.info("payment code :" + parameterVO.getMasterCode() + " desc :"
							+ parameterVO.getMasterDescription() + " hours :" + parameterVO.getValue()); 
					if (CommonsUtil.isStringValid(parameterVO.getMasterCode())
							&& parameterVO.getMasterCode().equalsIgnoreCase(CommonKeys.PAY_LATER)) {
						flexPricerRequestVO.setEnablePayLater(CommonKeys.YES);
					} else {
						flexPricerRequestVO.setEnablePayLater(CommonKeys.NO);
					}
				}
			}
		} catch (DataAccessException e) {
			LOGGER.error("Error occured while retrieving payment details" + e);
		}
		return flexPricerRequestVO;
	}

	/**
	 * Method to set departure Date for Multicity trip type
	 * 
	 * @param flightSearchVO
	 * @param flexPricerRequestVO
	 * 
	 * @return FlexPricerRequestVO
	 */

	private FlexPricerRequestVO setDepartureDate(FlightSearchVO flightSearchVO,
			FlexPricerRequestVO flexPricerRequestVO) {
		try {
			if (CommonsUtil.isStringValid(flightSearchVO.getDepartureDate())) {
				StringBuilder amadeusDate = new StringBuilder("");
				String[] dates = flightSearchVO.getDepartureDate().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
				int length = dates.length;
				int count = 0;
				for (int i = 0; i < length; i++) {
					if (count == length - 1) {
						amadeusDate.append(DateUtilities.getDateInAmadeusFormat(dates[i]));
						break;
					} else {
						amadeusDate.append(DateUtilities.getDateInAmadeusFormat(dates[i]))
								.append(CommonKeys.MULTICITY_SPLITTER_REGEX);
					}
					count = count + 1;
				}
				flexPricerRequestVO.setDepartureDate(amadeusDate.toString().trim());
				//LOGGER.info("setDepartureDate :" + flexPricerRequestVO.getDepartureDate());
			}
		} catch (ParseException e) {
			LOGGER.error("Error occured in setDepartureDate method" + e);
		}
		return flexPricerRequestVO;
	}

	/**
	 * Method to return departure date based on checking whether multicity trip
	 * type or not
	 * 
	 * @param departureDate
	 * @param tripType
	 * 
	 * @return String
	 */
	private String getDepartureDate(String departureDate, String tripType) {
		String dDate = null;
		if (CommonsUtil.isStringValid(tripType) && tripType.equalsIgnoreCase(CommonKeys.TRIP_TYPE_MULTI_CITY)) {
			dDate = departureDate.split(CommonKeys.MULTICITY_SPLITTER_REGEX)[0];
		} else {
			dDate = departureDate;
		}
		return dDate;
	}

	/**
	 * Method to get the travel dates in Amadeus format
	 * 
	 * @param flightSearchVO
	 * @param flexPricerRequestVO
	 * 
	 * @return FlexPricerRequestVO
	 */
	private FlexPricerRequestVO getTravelDatesInAmadeusFormat(FlightSearchVO flightSearchVO,
			FlexPricerRequestVO flexPricerRequestVO) {

		try {
			if (CommonsUtil.isStringValid(flightSearchVO.getDepartureDate())) {
				flexPricerRequestVO
						.setDepartureDate(DateUtilities.getDateInAmadeusFormat(flightSearchVO.getDepartureDate()));
			}
			if (CommonsUtil.isStringValid(flightSearchVO.getReturnDate())) {
				flexPricerRequestVO.setReturnDate(DateUtilities.getDateInAmadeusFormat(flightSearchVO.getReturnDate()));
			}
		} catch (ParseException e) {
			LOGGER.error("Error occured in DateUtilities.getDateInAmadeusDateFormat method");
		}
		return flexPricerRequestVO;
	}

	/**
	 * Method to set the default Flexpricer config name if no flex config is
	 * configured against the route
	 * 
	 * @param flexPricerRequestVO
	 * 
	 * @return FlexPricerRequestVO
	 */
	private FlexPricerRequestVO getFlexConfigName(FlexPricerRequestVO flexPricerRequestVO) {

		if (!CommonsUtil.isStringValid(flexPricerRequestVO.getFlexConfigName())) {
			if (CommonsUtil.isStringValid(flexPricerRequestVO.getRouteType())
					&& flexPricerRequestVO.getRouteType().equals(CommonKeys.INTERNATIONAL)) {
				flexPricerRequestVO.setFlexConfigName(CommonKeys.DEFAULT_FLEX_CONFIG_NAME_FOR_INTERNATIONAL);
			} else if (CommonsUtil.isStringValid(flexPricerRequestVO.getRouteType())
					&& flexPricerRequestVO.getRouteType().equals(CommonKeys.REGIONAL)) {
				flexPricerRequestVO.setFlexConfigName(CommonKeys.DEFAULT_FLEX_CONFIG_NAME_FOR_REGIONAL);
			} else {
				flexPricerRequestVO.setFlexConfigName(CommonKeys.DEFAULT_FLEX_CONFIG_NAME_FOR_DOMESTIC);
			}
		}
		return flexPricerRequestVO;
	}

	/**
	 * Method to set the route type
	 * 
	 * @param flightSearchVO
	 * @param flexPricerRequestVO
	 * 
	 * @return FlexPricerRequestVO
	 */
	private FlexPricerRequestVO setRouteType(FlightSearchVO flightSearchVO, FlexPricerRequestVO flexPricerRequestVO) {

		if (flightSearchVO.isDomesticFlight()) {
			flexPricerRequestVO.setRouteType(CommonKeys.DOMESTIC);
		} else if (flightSearchVO.isRegionalFlight()) {
			flexPricerRequestVO.setRouteType(CommonKeys.REGIONAL);
		} else {
			flexPricerRequestVO.setRouteType(CommonKeys.INTERNATIONAL);
		}
		flexPricerRequestVO.setRouteType(CommonKeys.REGIONAL);
		return flexPricerRequestVO;
	}

	/**
	 * Method to set the Private fare code details
	 * 
	 * @param flexPricerRequestVO
	 * @param promoFaresVO
	 * 
	 * @return PromoFaresVO
	 */
	private PromoFaresVO getPrivateFareAccountDetails(FlexPricerRequestVO flexPricerRequestVO,
			PromoFaresVO promoFaresVO, String accountCode) {
		// If Not a valid promo code

		if (!CommonsUtil.isStringValid(promoFaresVO.getPrivateFareAccountCode())) {
			if (flexPricerRequestVO.getProduct() != null
					&& (flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB))) {
				promoFaresVO.setPrivateFareAccountCode(CommonKeys.DEFAULT_PROMO_CODE);
			} else {

				promoFaresVO.setPrivateFareAccountCode(CommonKeys.DEFAULT_PROMO_CODE_B2B);
			}
		} else {

			LOGGER.info("Origin code list: " + promoFaresVO.getOrginCode());
			LOGGER.info("Dest code list :" + promoFaresVO.getDestiCode());

			if (CommonsUtil.isStringValid(promoFaresVO.getOrginCode())
					&& CommonsUtil.isStringValid(promoFaresVO.getDestiCode())) {
				String depCity = null;
				String destCity = null;
				String originArray[] = promoFaresVO.getOrginCode().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
				String destArray[] = promoFaresVO.getDestiCode().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
				String tripType = flexPricerRequestVO.getTripType();
				String departureCity = flexPricerRequestVO.getDepartureCity();
				String destinationCity = flexPricerRequestVO.getDestinationCity();

				if (CommonsUtil.isStringValid(tripType) && tripType.equals(CommonKeys.TRIP_TYPE_MULTI_CITY)) {
					depCity = departureCity.split(CommonKeys.MULTICITY_SPLITTER_REGEX)[0];
					destCity = destinationCity.split(CommonKeys.MULTICITY_SPLITTER_REGEX)[0];
				} else {
					depCity = departureCity;
					destCity = destinationCity;
				}

				boolean isOriginConfigured = false;
				boolean isDestinationConfigured = false;
				for (String origin : originArray) {
					LOGGER.info("promofare origin  :" + origin);
					// if(origin.contains(depCity)) { //Commented on 25/02/2021
					// by A-8986 as promocode not pushing in Multi city search
					if (origin.equalsIgnoreCase(depCity)) { // Added on
															// 25/02/2021 by
															// A-8986 as
															// promocode not
															// pushing in Multi
															// city search
						isOriginConfigured = true;
						break;
					}
				}
				for (String destination : destArray) {
					LOGGER.info("promofare destination  :" + destination);
					// if(destination.contains(destCity)) { //Commented on
					// 25/02/2021 by A-8986 as promocode not pushing in Multi
					// city search
					if (destination.equalsIgnoreCase(destCity)) { // Added on
																	// 25/02/2021
																	// by A-8986
																	// as
																	// promocode
																	// not
																	// pushing
																	// in Multi
																	// city
																	// search
						isDestinationConfigured = true;
						break;
					}
				}

				// Added on 25/02/2021 by A-8986 as promocode not pushing in
				// Multi city search -- start
				String privateFareCode = promoFaresVO.getPrivateFareAccountCode();

				LOGGER.info("isOriginConfigured : " + isOriginConfigured + ", isDestinationConfigured : "
						+ isDestinationConfigured + "privateFareCode :" + privateFareCode);
				if (isOriginConfigured || isDestinationConfigured) {

					promoFaresVO.setPrivateFareAccountCode(privateFareCode);
					LOGGER.info("Private Fare Account Code :" + promoFaresVO.getPrivateFareAccountCode());

				}
				// Added on 25/02/2021 by A-8986 as promocode not pushing in
				// Multi city search -- end
				else {

					if (flexPricerRequestVO.getProduct() != null
							&& (flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB))) {
						promoFaresVO.setPrivateFareAccountCode(CommonKeys.DEFAULT_PROMO_CODE);
					} else {
						promoFaresVO.setPrivateFareAccountCode(CommonKeys.DEFAULT_PROMO_CODE_B2B);
					}

				}

			} else {
				LOGGER.info("Valid Code-No Routes configured " + promoFaresVO.getPrivateFareAccountCode());
			}

		}
		return promoFaresVO;

	}

	/**
	 * Method to check if the given routes are live
	 * 
	 * @param departureDate
	 * @param effectiveDate
	 * 
	 * @return boolean
	 */
	public boolean isTripAvailableForGivenDate(String departureDate, String effectiveDate) {
		if (CommonsUtil.isStringValid(departureDate) && CommonsUtil.isStringValid(effectiveDate)) {
			return DateUtilities.compareDates(departureDate, effectiveDate);
		}
		return false;
	}

	public boolean isTripAvailableForGivenDateMobile(String departureDate, String effectiveDate) {
		if (CommonsUtil.isStringValid(departureDate) && CommonsUtil.isStringValid(effectiveDate)) {
			return DateUtilities.compareDatesMobile(departureDate, effectiveDate);
		}
		return false;
	}

	/*
	 * To get PrivateFareAccountCode from DB for B2B site Added on 11/03/2020 by
	 * A-8986
	 */

	public String getPrivateFareAccountCode(String corpId) {
		Connection conn = null;
		String acctCode = null;
		try {

			conn = createJDBCConnection();
			String selectQuery = " select * from airlinkdatabase.FOA_CORP_DTL where CRP_ID=?";

			PreparedStatement stmt = conn.prepareStatement(selectQuery);
			stmt.setInt(1, Integer.parseInt(corpId));

			LOGGER.info("Select query(tj):" + stmt);

			ResultSet rs = stmt.executeQuery();

			while (!rs.isClosed() && rs.next()) { // getting error..
				LOGGER.info("Result set is not closed n rs.next() is true");
				acctCode = rs.getString("PVT_FR_ACT_CDE");
				LOGGER.info("Private Fare Account Code:" + acctCode);
			}
		} catch (Exception e) {
			LOGGER.info("Exception occured:" + e);
		} finally {
			try {
				LOGGER.info("Closing connection ...");
				conn.close();
			} catch (SQLException e) {
				LOGGER.error("Sql exception while Closing connection ...", e);
			}
		}

		return acctCode;
	}

	/*
	 * To open DB connection
	 */
	public Connection createJDBCConnection() {

		Connection conn = null;
		try {
			// Step 1: "Load" the JDBC driver
			Class.forName(environment.getProperty("jdbc.driverClassName"));

			// Step 2: Establish the connection to the database
			String url = environment.getProperty("jdbc.url");
			conn = DriverManager.getConnection(url, environment.getProperty("jdbc.username"),
					environment.getProperty("jdbc.password"));
		} catch (Exception e) {
			LOGGER.error("Exception occured during establishing DB connectivity", e);
		}
		return conn;

	}

	public FlightSearchVO mapIsDomesticorRegional(FlightSearchRequestVO flightSearchRequestVO) {
		try {
			FlightSearchVO flightSearchVO = new FlightSearchVO();
			flightSearchVO.setLanguage(flightSearchRequestVO.getLanguage());
			flightSearchVO.setCountry(flightSearchRequestVO.getCountry());
			flightSearchVO.setIsMobileDevice(flightSearchRequestVO.getIsMobileDevice());
			flightSearchVO.setProduct(flightSearchRequestVO.getProduct());
			flightSearchVO.setTripType(flightSearchRequestVO.getTripType());
			flightSearchVO.setClientSessionId(flightSearchRequestVO.getClientSessionId());
			flightSearchVO.setDepartureCity(flightSearchRequestVO.getDepartureCity());
			flightSearchVO.setDepartureDate(flightSearchRequestVO.getDepartureDate());
			flightSearchVO.setDestinationCity(flightSearchRequestVO.getDestinationCity());
			flightSearchVO.setDateFlexible(flightSearchRequestVO.getDateFlexible());
			flightSearchVO.setReturnDate(flightSearchRequestVO.getReturnDate());
			flightSearchVO.setAdultCount(flightSearchRequestVO.getAdultCount());
			// A-10083 - on 17/02/2022
			flightSearchVO.setYoungAdultCount(flightSearchRequestVO.getYoungAdultCount());
			flightSearchVO.setInfantCount(flightSearchRequestVO.getInfantCount());
			flightSearchVO.setChildCount(flightSearchRequestVO.getChildCount());
			flightSearchVO.setAmadeusReturnUrl(flightSearchRequestVO.getAmadeusReturnUrl());
			flightSearchVO.setCabinClass(flightSearchRequestVO.getCabinClass());
			flightSearchVO.setSessionObj(flightSearchRequestVO.getSessionObj());
			flightSearchVO.setReqObj(flightSearchRequestVO.getReqObj());
			flightSearchVO.setCorporateName(flightSearchRequestVO.getCorporateName());
			// added for viewing past and upcoming booking change req
			// flightSearchVO.setUserId(flightSearchRequestVO.getUserId());
			flightSearchVO.setCorporateId(flightSearchRequestVO.getCorporateId());
			if (CommonsUtil.isStringValid(flightSearchRequestVO.getPromoCode())) {
				flightSearchVO.setPromoCode(flightSearchRequestVO.getPromoCode());
			} else {
				// IF incoming promocode is null, set it according to product
				if (flightSearchRequestVO.getProduct() != null
						&& (flightSearchRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB))) {
					flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE);
				} else {

					flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE_B2B);
				}
			}
			// Setting Corporate PromoCode
			if (flightSearchRequestVO.getProduct() != null
					&& (flightSearchRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B))
					&& (CommonsUtil.isStringValid(flightSearchRequestVO.getCorporatePromoCode()))) {
				flightSearchVO.setCorporatePromoCode(flightSearchRequestVO.getCorporatePromoCode());
				LOGGER.info("PRODUCT_B2B CorpCode: " + flightSearchVO.getCorporatePromoCode());
			}
			LOGGER.info("PromoCode : " + flightSearchVO.getPromoCode());
			/*
			 * Flex config name configured for the Route and Product
			 */
			flightSearchVO = setRouteConfigVOParameters(flightSearchRequestVO, flightSearchVO);
			// HD-316604 -Removing 'Redirect to SAA' and '4Z live date' in admin
			// tool by A-10261
			/*
			 * flightSearchVO.setIsTripEligible(
			 * isTripAvailableForGivenDate(flightSearchVO.getDepartureDate(),
			 * flightSearchVO.getEffectiveDate()));
			 * LOGGER.info("Effective Date : " +
			 * flightSearchVO.getEffectiveDate() + " DepartDate :" +
			 * flightSearchVO.getDepartureDate() + " eligible :" +
			 * flightSearchVO.getIsTripEligible());
			 */

			flightSearchVO.setIsTripEligible(true);
			// HD-316604 Ends
			/*
			 * flightSearchVO.setIsTripEligible(
			 * isTripAvailableForGivenDate(flightSearchVO.getDepartureDate(),
			 * flightSearchVO.getEffectiveDate()));
			 * LOGGER.info("Effective Date : " +
			 * flightSearchVO.getEffectiveDate() + " DepartDate :" +
			 * flightSearchVO.getDepartureDate() + " eligible :" +
			 * flightSearchVO.getIsTripEligible());
			 * 
			 */

			String departureCountry = null;
			CitiesVO citiesEntity = null;
			List<CitiesVO> citiesEntityList = null;

			try {
				// select country_code, city_code, city_description,
				// airport_description from airlink_city_master where city_code
				// = ?;
				citiesEntityList = commonDao.getCityMasterEntities(flightSearchRequestVO.getDepartureCity());
				for (Iterator iterator = citiesEntityList.iterator(); iterator.hasNext();) {
					CitiesVO citiesVO = (CitiesVO) iterator.next();
					if(citiesVO.getCityCode().equalsIgnoreCase(flightSearchRequestVO.getDepartureCity())){
						citiesEntity = citiesVO;
						departureCountry = citiesVO.getCountryCode();
					}
				}
			} catch (DataAccessException e) {
				LOGGER.error("Exception while retrieving data getCityMasterEntities " + e);
			}
			LOGGER.info("mapIsDomesticorRegional departureCountry---" + departureCountry);
			if (citiesEntityList != null && !citiesEntityList.isEmpty()) {
				citiesEntity = citiesEntityList.get(0);
				departureCountry = citiesEntity.getCountryCode();
			}
			LOGGER.info("mapIsDomesticorRegional Departure Country : " + departureCountry);
			flightSearchVO.setDepartureCountry(departureCountry);
			/*
			 * Get the POS City , currency and POS country
			 */
			/*
			 * Commented on 23/10/2020 by A-8986 for mobile api -- start
			 *
			 * flightSearchVO = setPOSCityandCountry(flightSearchVO,
			 * flightSearchRequestVO, departureCountry); flightSearchVO =
			 * setDomesticFlightFlag(flightSearchVO, flightSearchRequestVO);
			 *
			 * Commented on 23/10/2020 by A-8986 for mobile api -- end
			 */

			// Added on 23/10/2020 by A-8986 for mobile api -- start
			flightSearchVO = setPOSCityandCountry(flightSearchVO, flightSearchRequestVO.getCountry(),
					flightSearchRequestVO.getLanguage(), flightSearchRequestVO.getProduct(), departureCountry);
			flightSearchVO = setDomesticFlightFlag(flightSearchVO, flightSearchRequestVO.getCountry(),
					flightSearchRequestVO.getLanguage(), flightSearchRequestVO.getProduct());
			// Added on 23/10/2020 by A-8986 for mobile api -- end

			return flightSearchVO;
		} catch (Exception e) {
			LOGGER.info("Exception occured insidemapIsDomesticorRegional " + e);

		}
		return null;
	}

	// Added on 22/10/2020 by A-8986 for mobile API -- start
	private FlightSearchVO createFlightSearchMobileVO(FlightSearchMobileVORequest flightSearchMobileVORequest) {

		FlightSearchVO flightSearchVO = new FlightSearchVO();
		if (flightSearchMobileVORequest.getLanguage() != null)
			flightSearchVO.setLanguage(flightSearchMobileVORequest.getLanguage());

		if (flightSearchMobileVORequest.getCountry() != null)
			flightSearchVO.setCountry(flightSearchMobileVORequest.getCountry());

		flightSearchVO.setIsMobileDevice("true");

		if (flightSearchMobileVORequest.getProduct() != null)
			flightSearchVO.setProduct(flightSearchMobileVORequest.getProduct());

		flightSearchVO.setTripType(flightSearchMobileVORequest.getTrip_type());
		flightSearchVO.setClientSessionId("123");
		flightSearchVO.setDepartureCity(flightSearchMobileVORequest.getB_location_1());
		flightSearchVO.setDepartureDate(flightSearchMobileVORequest.getB_date_1());

		if (flightSearchMobileVORequest.getB_location_2() != null)
			flightSearchVO.setDestinationCity(flightSearchMobileVORequest.getB_location_2());
		else if (flightSearchMobileVORequest.getE_location_1() != null
				&& flightSearchMobileVORequest.getTrip_type().equalsIgnoreCase("O"))
			flightSearchVO.setDestinationCity(flightSearchMobileVORequest.getE_location_1());

		LOGGER.info("Language:" + flightSearchVO.getLanguage() + ", Country:" + flightSearchVO.getCountry()
				+ ", Product:" + flightSearchVO.getProduct() + ". Trip type:" + flightSearchVO.getTripType()
				+ ", Departure city :" + flightSearchVO.getDepartureCity() + "Destination city"
				+ flightSearchVO.getDestinationCity() + ", Departure date:" + flightSearchVO.getDepartureDate());

		// flightSearchVO.setDateFlexible(flightSearchRequestVO.getDateFlexible());
		if (flightSearchMobileVORequest.getB_date_2() != null)
			flightSearchVO.setReturnDate(flightSearchMobileVORequest.getB_date_2());
		/*
		 * flightSearchVO.setAdultCount(flightSearchRequestVO.getAdultCount());
		 * flightSearchVO.setInfantCount(flightSearchRequestVO.getInfantCount())
		 * ;
		 * flightSearchVO.setChildCount(flightSearchRequestVO.getChildCount());
		 */
		// flightSearchVO.setAmadeusReturnUrl(flightSearchRequestVO.getAmadeusReturnUrl());

		LOGGER.info("Return date :" + flightSearchVO.getReturnDate());

		int adtCount = 0;
		// A-10083
		int yngAdtCount = 0;
		int chdCount = 0;
		int infCount = 0;

		if (flightSearchMobileVORequest.getTraveller_type_1() != null) {

			LOGGER.info("Traveller type 1 : " + flightSearchMobileVORequest.getTraveller_type_1());

			if (flightSearchMobileVORequest.getTraveller_type_1().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTraveller_type_1().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTraveller_type_2() != null) {

			LOGGER.info("Traveller type 2 : " + flightSearchMobileVORequest.getTraveller_type_2());

			if (flightSearchMobileVORequest.getTraveller_type_2().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTraveller_type_2().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTraveller_type_3() != null) {

			LOGGER.info("Traveller type 3 : " + flightSearchMobileVORequest.getTraveller_type_3());

			if (flightSearchMobileVORequest.getTraveller_type_3().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTraveller_type_3().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTraveller_type_4() != null) {

			LOGGER.info("Traveller type 4 : " + flightSearchMobileVORequest.getTraveller_type_4());

			if (flightSearchMobileVORequest.getTraveller_type_4().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTraveller_type_4().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTraveller_type_5() != null) {

			LOGGER.info("Traveller type 5 : " + flightSearchMobileVORequest.getTraveller_type_5());

			if (flightSearchMobileVORequest.getTraveller_type_5().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTraveller_type_5().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTraveller_type_6() != null) {

			LOGGER.info("Traveller type 6 : " + flightSearchMobileVORequest.getTraveller_type_6());

			if (flightSearchMobileVORequest.getTraveller_type_6().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTraveller_type_6().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTraveller_type_7() != null) {

			LOGGER.info("Traveller type 7 : " + flightSearchMobileVORequest.getTraveller_type_7());

			if (flightSearchMobileVORequest.getTraveller_type_7().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTraveller_type_7().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTraveller_type_8() != null) {

			LOGGER.info("Traveller type 8 : " + flightSearchMobileVORequest.getTraveller_type_8());

			if (flightSearchMobileVORequest.getTraveller_type_8().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTraveller_type_8().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getTraveller_type_9() != null) {

			LOGGER.info("Traveller type 9 : " + flightSearchMobileVORequest.getTraveller_type_9());

			if (flightSearchMobileVORequest.getTraveller_type_9().equalsIgnoreCase("ADT")) {
				adtCount = adtCount + 1;
			} else if (flightSearchMobileVORequest.getTraveller_type_9().equalsIgnoreCase("CHD")) {
				chdCount = chdCount + 1;
			}

		}

		if (flightSearchMobileVORequest.getHas_infant_1() != null
				&& flightSearchMobileVORequest.getHas_infant_1().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHas_infant_2() != null
				&& flightSearchMobileVORequest.getHas_infant_2().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHas_infant_3() != null
				&& flightSearchMobileVORequest.getHas_infant_3().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHas_infant_4() != null
				&& flightSearchMobileVORequest.getHas_infant_4().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHas_infant_5() != null
				&& flightSearchMobileVORequest.getHas_infant_5().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHas_infant_6() != null
				&& flightSearchMobileVORequest.getHas_infant_6().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHas_infant_7() != null
				&& flightSearchMobileVORequest.getHas_infant_7().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}
		if (flightSearchMobileVORequest.getHas_infant_8() != null
				&& flightSearchMobileVORequest.getHas_infant_8().equalsIgnoreCase("TRUE")) {
			infCount = infCount + 1;
		}

		LOGGER.info("Mobile Adt count:" + adtCount + ", Chd count: " + chdCount + "Inf count:" + infCount);

		flightSearchVO.setAdultCount(new Integer(adtCount).toString());
		// A-10083 - on 17/02/2022
		flightSearchVO.setYoungAdultCount(new Integer(yngAdtCount).toString());
		flightSearchVO.setInfantCount(new Integer(infCount).toString());
		flightSearchVO.setChildCount(new Integer(chdCount).toString());

		LOGGER.info("Adult count:" + flightSearchVO.getAdultCount() + ", Child count: " + flightSearchVO.getChildCount()
				+ "Infant count:" + flightSearchVO.getInfantCount());

		flightSearchVO.setCabinClass(flightSearchMobileVORequest.getCabin_class());
		flightSearchVO.setSessionObj(flightSearchMobileVORequest.getSessionObj());
		flightSearchVO.setReqObj(flightSearchMobileVORequest.getReqObj());
		flightSearchVO.setCorporateName(flightSearchMobileVORequest.getList_corporate_number_1_1());

		LOGGER.info("Cabin class : " + flightSearchMobileVORequest.getCabin_class());

		if (flightSearchMobileVORequest.getList_corporate_number_1_1() != null) {

			//String promoCode = commonDao.getPrivateAcctCode(flightSearchMobileVORequest.getList_corporate_number_1_1());
			String promoCode =  null;
			LOGGER.info("Retrieved Promo Code : " + promoCode);

			flightSearchVO.setPromoCode(promoCode);

		} else {

			// IF incoming promocode is null, set it according to product
			if (flightSearchMobileVORequest.getProduct() != null
					&& (flightSearchMobileVORequest.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB))) {
				flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE);
			} else {

				flightSearchVO.setPromoCode(CommonKeys.DEFAULT_PROMO_CODE_B2B);
			}
		}

		LOGGER.info("PromoCode : " + flightSearchVO.getPromoCode());
		/*
		 * Flex config name configured for the Route and Product
		 */
		flightSearchVO = setRouteConfigMobileVOParameters(flightSearchMobileVORequest, flightSearchVO);
		// HD-316604 -Removing 'Redirect to SAA' and '4Z live date' in admin
		// tool by A-10261
		/*
		 * flightSearchVO.setIsTripEligible(
		 * isTripAvailableForGivenDateMobile(flightSearchVO.getDepartureDate(),
		 * flightSearchVO.getEffectiveDate())); LOGGER.info("Effective Date : "
		 * + flightSearchVO.getEffectiveDate() + " DepartDate :" +
		 * flightSearchVO.getDepartureDate() + " eligible :" +
		 * flightSearchVO.getIsTripEligible());
		 */

		flightSearchVO.setIsTripEligible(true);
		// HD-316604 Ends
		/*
		 * flightSearchVO.setIsTripEligible(
		 * isTripAvailableForGivenDateMobile(flightSearchVO.getDepartureDate(),
		 * flightSearchVO.getEffectiveDate())); LOGGER.info("Effective Date : "
		 * + flightSearchVO.getEffectiveDate() + " DepartDate :" +
		 * flightSearchVO.getDepartureDate() + " eligible :" +
		 * flightSearchVO.getIsTripEligible());
		 */
		String departureCountry = null;
		CitiesVO citiesEntity = null;
		List<CitiesVO> citiesEntityList = null;

		/*try {
			// select country_code, city_code, city_description,
			// airport_description from airlink_city_master where city_code = ?;
			citiesEntityList = commonDao.getCityMasterEntities(flightSearchMobileVORequest.getB_location_1());
		} catch (DataAccessException e) {
			LOGGER.error("Exception while retrieving data getCityMasterEntities " + e);
		}*/

		if (citiesEntityList != null && !citiesEntityList.isEmpty()) {
			citiesEntity = citiesEntityList.get(0);
			departureCountry = citiesEntity.getCountryCode();
		}
		LOGGER.info("Departure Country : " + departureCountry);
		flightSearchVO.setDepartureCountry(departureCountry);
		/*
		 * Get the POS City , currency and POS country
		 */
		/*
		 * Commented on 23/10/2020 by A-8986 for mobile API
		 * 
		 * flightSearchVO = setPOSCityandCountry(flightSearchVO,
		 * flightSearchRequestVO, departureCountry);
		 */

		// Added on 23/10/2020 by A-8986 for mobile API
		flightSearchVO = setPOSCityandCountry(flightSearchVO, flightSearchMobileVORequest.getCountry(),
				flightSearchMobileVORequest.getLanguage(), flightSearchMobileVORequest.getProduct(), departureCountry);

		// Commented on 23/10/2020 by A-8986 for mobile API
		// flightSearchVO = setDomesticFlightFlag(flightSearchVO,
		// flightSearchRequestVO);

		flightSearchVO = setDomesticFlightFlag(flightSearchVO, flightSearchMobileVORequest.getCountry(),
				flightSearchMobileVORequest.getLanguage(), flightSearchMobileVORequest.getProduct());

		/**
		 * to get the base url.
		 */
		String url = flightSearchMobileVORequest.getReqObj().getUrl().toString();
		String baseURL = url.substring(0, url.length() - flightSearchMobileVORequest.getReqObj().getUri().length())
				+ "/";
		LOGGER.info("baseURL>>" + baseURL);
		baseURL = baseURL.replaceAll("http:", "https:");

		flightSearchVO.setBasePspURL(baseURL);
		/*
		 * 6 Month validation for domestic flights
		 */
		int monthsBetween = 0;
		int daysBetween = 0;
		if (CommonsUtil.isStringValid(flightSearchVO.getDepartureDate())
				&& CommonsUtil.isStringValid(flightSearchVO.getReturnDate())) {
			try {

				monthsBetween = DateUtilities.getMonthsBetweenMobile(flightSearchVO.getDepartureDate(),
						flightSearchVO.getReturnDate());
				daysBetween = (int) DateUtilities.getDaysBetween(flightSearchVO.getDepartureDate(),
						flightSearchVO.getReturnDate());
			} catch (ParseException e) {
				LOGGER.error("Error occured in DateUtilities.getMonthsBetween method");
			}
			//LOGGER.info("isDomFlight: " + flightSearchVO.isDomesticFlight() + " monthsBetween " + monthsBetween);
			//LOGGER.info("isDomFlight: " + flightSearchVO.isDomesticFlight() + " daysBetween " + daysBetween);

			/*
			 * Commenting on 21 May 2020 by A-8986 Removing 6 months restriction
			 * for domestic flights
			 *
			 * if (flightSearchVO.isDomesticFlight() && monthsBetween >= Integer
			 * .parseInt(environment.getRequiredProperty(
			 * "flightSearch.monthsBetween.validationLimit.Domestic"))) {
			 * flightSearchVO.setIsMonthsBetweenValid(false);
			 * 
			 * //throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE,
			 * //
			 * environment.getRequiredProperty("error.todate.invalid.Domestic"))
			 * ;
			 * 
			 * } else { flightSearchVO.setIsMonthsBetweenValid(true); }
			 */
			// Added on 21 May 2020 by A-8986
			flightSearchVO.setIsMonthsBetweenValid(true);
		}

		return flightSearchVO;
	}

	// MultiCity

	// Added on 22/10/2020 by A-8986 for mobile API -- end

}
