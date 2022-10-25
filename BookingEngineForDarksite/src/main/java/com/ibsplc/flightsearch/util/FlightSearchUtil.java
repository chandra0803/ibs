package com.ibsplc.flightsearch.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.flightsearch.util.encryptor.AESEncryption;
import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.framework.util.filereader.FileReader;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.framework.util.sogl.GLOBALLIST;
import com.ibsplc.framework.util.sogl.LISTELEMENT;
import com.ibsplc.framework.util.sogl.LISTVALUE;
import com.ibsplc.framework.util.sogl.SOGL;
import com.ibsplc.framework.util.sogl.SOGLFormatter;

/**
 * @author a-5316
 *
 */
@PropertySource("classpath:eRetail.properties") 
public class FlightSearchUtil {

	private static final Logger LOGGER = Log4j2Logger.create(FlightSearchUtil.class);

	public static final String E_RETAIL_PROPERTIES = "eRetail.properties";
	private static Properties eRetailSpecProperties;
	private static final String TRUE = "TRUE";
	private static final String IS_PRODUCTION_SERVER = "IS_PRODUCTION_SERVER";
	private static final String APPEND_OTHER_TEST_SPEC_PARAMS = "APPEND_OTHER_TEST_SPEC_PARAMS";
	private static final String ENCRYPTION_ENABLED = "ENCRYPTION_ENABLED";
	private static final String ENABLE_SOGL = "ENABLE_SOGL";
	private static final String TRUNCATE_MODE = "TRUNC2";
	@Autowired 
	static Environment environment; 
	
 
	private FlightSearchUtil() {
	}
	
	 

	/**
	 * Method to build the flightSearch request URL for redirection
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String createFlightSearchRedirectURL(FlexPricerRequestVO flexPricerRequestVO) {

		eRetailSpecProperties = FileReader.getProperties(E_RETAIL_PROPERTIES);
 
		
		AESEncryption aesEncryption = new AESEncryption();
		Map<String, String> map = new HashMap<String, String>();

		String baseUrl = eRetailSpecProperties.getProperty("ERETAIL_URL");
		
		StringBuilder flightSearchRedirectURL = new StringBuilder("");
		StringBuilder flightSearchRedirectURLEncrypt = new StringBuilder("");
		String finalURL = "";
		int adtCnt = 0;
		int chdCnt = 0;
		int infCnt = 0;
		// A-10083 - on 17/02/2022
		int yngAdtCnt = 0;
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getAdultCount())) {
			adtCnt = Integer.parseInt(flexPricerRequestVO.getAdultCount());
		}
		// A-10083 - on 17/02/2022
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getYoungAdultCount())) {
			yngAdtCnt = Integer.parseInt(flexPricerRequestVO.getYoungAdultCount());
			// adtCnt = adtCnt + yngAdtCnt;
		}
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getChildCount())) {
			chdCnt = Integer.parseInt(flexPricerRequestVO.getChildCount());
		}
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getInfantCount())) {
			infCnt = Integer.parseInt(flexPricerRequestVO.getInfantCount());
		}
		/*
		 * Site Information
		 */
		 
		flightSearchRedirectURL.append(getSiteInfoParams(flexPricerRequestVO));
 
 
		map.put("baseUrl", baseUrl);
		map.put("site", flexPricerRequestVO.getSiteID());
		map.put("language", flexPricerRequestVO.getAmadeusLanguageCode());
		map.put("embeddedTransaction", "FlexPricerAvailability");

		LOGGER.info("Base URL : " + baseUrl + ", Site : " + flexPricerRequestVO.getSiteID() + ", Language : "
				+ flexPricerRequestVO.getLanguage());

		flightSearchRedirectURLEncrypt.append("COUNTRY_SITE=").append(flexPricerRequestVO.getDepartureCountry());
		String externalIdParameters = generateExternalIDRequestParameters(flexPricerRequestVO);
		flightSearchRedirectURLEncrypt.append("&EXTERNAL_ID=").append(externalIdParameters);
		flightSearchRedirectURLEncrypt.append(getOfficeConfigurations(flexPricerRequestVO));
		
		 
		
		flightSearchRedirectURLEncrypt.append("&BOOKING_FLOW=")
				.append(eRetailSpecProperties.getProperty("BOOKING_FLOW"));
		flightSearchRedirectURLEncrypt.append("&TRIP_FLOW=").append(flexPricerRequestVO.getTripFlow());
		/*
		 * Long names fields
		 */
	 
		flightSearchRedirectURLEncrypt.append("&SO_SITE_TRUNCATE_NAMES_IN_NM=").append(TRUE);
		flightSearchRedirectURLEncrypt.append("&SO_SITE_NM_TRUNC_MODE=").append(TRUNCATE_MODE);
		/*
		 * Adding "SO_SITE_IS_MERCH_TEST_DATA=TRUE" as per Airlink's request
		 * Change made by A-8986 on 21/04/2020
		 */
		// if(flexPricerRequestVO.getDepartureCountry().equalsIgnoreCase("ZA"))
		// {
		// flightSearchRedirectURLEncrypt.append("&SO_SITE_IS_MERCH_TEST_DATA=").append(TRUE);
		// }
		/*
		 * SiD Alternative Form of Payment
		 *
		 * Step 1
		 */
		 
		if ( flexPricerRequestVO.getDepartureCountry().equalsIgnoreCase("ZA")) {
			flightSearchRedirectURLEncrypt.append("&SO_SITE_IS_MERCH_TEST_DATA=")
					.append(eRetailSpecProperties.getProperty("SO_SITE_IS_MERCH_TEST_DATA"));
		}		 
		// Added on 21/01/2020 to remember traveller information -- start
		if (  flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB)) {
		 
			flightSearchRedirectURLEncrypt.append("&SO_SITE_PROFILE_MAINTENANCE=")
					.append(eRetailSpecProperties.getProperty("SO_SITE_PROFILE_MAINTENANCE"));
		}

		// Added on 21/01/2020 to remember traveller information -- end
		
		// Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request
		// Parameter -- start
		/*
		 * //Added on 19/02/2021 to add a new Amadeus Trip Request Parameter --
		 * start
		 * if(flexPricerRequestVO.getIsAirlinkRoute().equalsIgnoreCase("TRUE"))
		 * flightSearchRedirectURLEncrypt.append("&DIRECT_NON_STOP=").append(
		 * "TRUE"); else
		 * flightSearchRedirectURLEncrypt.append("&DIRECT_NON_STOP=").append(
		 * "FALSE"); //Added on 19/02/2021 to add a new Amadeus Trip Request
		 * Parameter -- end
		 */
		flightSearchRedirectURLEncrypt.append("&DIRECT_NON_STOP=").append( flexPricerRequestVO.getIsDirectTrip());
	 
		// Added on 03/11/2021 by A-10083 to add a new Amadeus Trip Request
		// Parameter -- End

		/*
		 * //Added on 19/02/2021 to add a new Amadeus Trip Request Parameter --
		 * start
		 * if(flexPricerRequestVO.getIsAirlinkRoute().equalsIgnoreCase("TRUE"))
		 * flightSearchRedirectURLEncrypt.append("&DIRECT_NON_STOP=").append(
		 * "TRUE"); else
		 * flightSearchRedirectURLEncrypt.append("&DIRECT_NON_STOP=").append(
		 * "FALSE"); //Added on 19/02/2021 to add a new Amadeus Trip Request
		 * Parameter -- end
		 */

		/*
		 * Flight Information - Origin and destination
		 */
		 
		flightSearchRedirectURLEncrypt.append(getFlightInformation(flexPricerRequestVO)); 
		/*
		 * Passenger Information
		 */
		// A-10083 - on 17/02/2022 - pass yngAdtCnt parameter to
		// generateTravellerDetails
		 
		flightSearchRedirectURLEncrypt.append(generateTravellerDetails(adtCnt, yngAdtCnt, chdCnt, infCnt));
	 	/*
		 * Travel Dates and display
		 */
		 
		flightSearchRedirectURLEncrypt.append(getTravelDatesAndDisplayInfo(flexPricerRequestVO));
		//flightSearchRedirectURLEncrypt.append("&CURRENCY=").append(flexPricerRequestVO.getCurrency());
		/*
		 * Search Options
		 */
		 
		flightSearchRedirectURLEncrypt.append("&TRIP_TYPE=").append(flexPricerRequestVO.getTripType());	 
		flightSearchRedirectURLEncrypt.append(getSearchOptionParams(flexPricerRequestVO));
		/*
		 * Pay later activation/deactivation
		 */
		//LOGGER.info("before PaymentInfoParams flightSearchRedirectURLEncrypt:"+flightSearchRedirectURLEncrypt);  
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getEnablePayLater())
				&&  flexPricerRequestVO.getEnablePayLater().equalsIgnoreCase(CommonKeys.YES)) {
			flightSearchRedirectURLEncrypt.append( getPaymentInfoParams(flexPricerRequestVO));
		}
		/*
		 * Ticketing Time limit
		 */
		//LOGGER.info(" after PaymentInfoParams flightSearchRedirectURLEncrypt:"+flightSearchRedirectURLEncrypt); 
		flightSearchRedirectURLEncrypt.append( getTicketingInfo(flexPricerRequestVO));
		/*
		 * Export Trip Plan Details
		 */
		flightSearchRedirectURLEncrypt.append("&SO_SITE_EXPORT_CONF_URL=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_EXPORT_CONF_URL"));
		/*
		 * Corporate codes â€“ Flexpricer flows
		 */
		String privateFareAccCode =  null;
	    privateFareAccCode =  getPrivateFareAccCode(flexPricerRequestVO);
		 
		flightSearchRedirectURLEncrypt.append( getCorporateInfoParams(privateFareAccCode));
		//LOGGER.info(" after privateFareAccCode flightSearchRedirectURLEncrypt:"+flightSearchRedirectURLEncrypt); 
		 /*
		 * Late Login for B2B
		 */
		if (flexPricerRequestVO.getProduct() != null
				&& flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B)) {
			flightSearchRedirectURLEncrypt.append("&DIRECT_LOGIN=").append(CommonKeys.NO);
			flightSearchRedirectURLEncrypt.append("&SO_SITE_EXT_LOGIN_URL=")
					.append(eRetailSpecProperties.getProperty("LATE_LOGIN_URL"));
			flightSearchRedirectURLEncrypt.append("&SO_SITE_SIGNIN_METHOD=LSIGN");
		}
		 
		/*
		 * SOGL_parameter
		 */
		 if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty(ENABLE_SOGL))
				&& TRUE.equals(eRetailSpecProperties.getProperty(ENABLE_SOGL))) {
			String sogl = null;
			 
			  sogl = generateSOGL(flexPricerRequestVO, false);
			 
			flightSearchRedirectURLEncrypt.append("&SO_GL=");
			flightSearchRedirectURLEncrypt.append(sogl);
		}
		// LOGGER.info("urlWithoutEncryption:  " + flightSearchRedirectURLEncrypt);
		/*
		 * Test-specific override parameters
		 */
		if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty(IS_PRODUCTION_SERVER))
				&& TRUE.equals(eRetailSpecProperties.getProperty(IS_PRODUCTION_SERVER))) {
			LOGGER.info("PROD Server");
		} else {
			flightSearchRedirectURLEncrypt.append( appendTestSpecParameters());
			if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty(APPEND_OTHER_TEST_SPEC_PARAMS))
					&& TRUE.equals(eRetailSpecProperties.getProperty(APPEND_OTHER_TEST_SPEC_PARAMS))) {		 
				flightSearchRedirectURLEncrypt.append( appendOtherTestSpecParameters());
			}
		}
		String urlWithoutEncryptn = flightSearchRedirectURL.toString();
		LOGGER.info("FinalURL urlWithoutEncryption:  " + urlWithoutEncryptn + "; Other Params:" + flightSearchRedirectURLEncrypt.toString());
		/*
		 * AES encryption
		 */
		if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty(ENCRYPTION_ENABLED))
				&& TRUE.equals(eRetailSpecProperties.getProperty(ENCRYPTION_ENABLED))) {

			String encryptedURL = null;
			encryptedURL = aesEncryption.encryptAvailabilityRequest(flightSearchRedirectURLEncrypt.toString());
			finalURL = urlWithoutEncryptn + "&" + encryptedURL;
		} else {
			finalURL = urlWithoutEncryptn + "&" + flightSearchRedirectURLEncrypt.toString();
		}
		LOGGER.info("FinalURL urlWithEncryptionreturn:" + finalURL);		
	 
		return finalURL;
	}

	/**
	 * Method to build the Multicity flightSearch request URL for redirection
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String createMultiCityFlightSearchURL(FlexPricerRequestVO flexPricerRequestVO) {
		 
		eRetailSpecProperties = FileReader.getProperties(E_RETAIL_PROPERTIES);
		AESEncryption aesEncryption = new AESEncryption();

		StringBuilder multiCityRedirectURL = new StringBuilder("");
		StringBuilder multiCityRedirectURLEncrypt = new StringBuilder("");
		String multiCityFinalURL = "";

		int adultCount = 0;
		int childCount = 0;
		int infantCount = 0;
		// A-10083 - on 17/02/2022
		int youngAdultCount = 0;
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getAdultCount())) {
			adultCount = Integer.parseInt(flexPricerRequestVO.getAdultCount());
		}
		// A-10083 - on 17/02/2022
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getYoungAdultCount())) {
			youngAdultCount = Integer.parseInt(flexPricerRequestVO.getYoungAdultCount());
			// adultCount = adultCount + youngAdultCount;
		}
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getChildCount())) {
			childCount = Integer.parseInt(flexPricerRequestVO.getChildCount());
		}
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getInfantCount())) {
			infantCount = Integer.parseInt(flexPricerRequestVO.getInfantCount());
		}
		/*
		 * Site Information
		 */
		multiCityRedirectURL.append(getSiteInfoParams(flexPricerRequestVO));
		multiCityRedirectURLEncrypt.append("COUNTRY_SITE=").append(flexPricerRequestVO.getCountry());
		String externalIdParameters = generateExternalIDRequestParameters(flexPricerRequestVO);
		multiCityRedirectURLEncrypt.append("&EXTERNAL_ID=").append(externalIdParameters);
		/*
		 * Office Information
		 */
		multiCityRedirectURLEncrypt.append(getOfficeConfigurations(flexPricerRequestVO));
		multiCityRedirectURLEncrypt.append("&BOOKING_FLOW=").append(eRetailSpecProperties.getProperty("BOOKING_FLOW"));
		multiCityRedirectURLEncrypt.append("&TRIP_FLOW=").append(flexPricerRequestVO.getTripFlow());
		/*
		 * Long names fields
		 */
		multiCityRedirectURLEncrypt.append("&SO_SITE_TRUNCATE_NAMES_IN_NM=").append(TRUE);
		multiCityRedirectURLEncrypt.append("&SO_SITE_NM_TRUNC_MODE=").append(TRUNCATE_MODE);
		//LOGGER.info("multiCityRedirectURLEncrypt:"+multiCityRedirectURLEncrypt);
		// SO_SITE_IS_MERCH_TEST_DATA
		if (flexPricerRequestVO.getCountry().equalsIgnoreCase("ZA"))
			multiCityRedirectURLEncrypt.append("&SO_SITE_IS_MERCH_TEST_DATA=")
					.append(eRetailSpecProperties.getProperty("SO_SITE_IS_MERCH_TEST_DATA"));

		// Added on 21/01/2020 to remember traveller information -- start
		if (flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB)) {
			//LOGGER.info("Product is LRB...setting cookies tag");
			LOGGER.info("eRetailSpecProperties read:"+eRetailSpecProperties.getProperty("SO_SITE_PROFILE_MAINTENANCE"));
			multiCityRedirectURLEncrypt.append("&SO_SITE_PROFILE_MAINTENANCE=")
					.append(eRetailSpecProperties.getProperty("SO_SITE_PROFILE_MAINTENANCE"));
		}
		// Added on 21/01/2020 to remember traveller information -- end

		// Added on 19/02/2021 to add a new Amadeus Trip Request Parameter --
		// start
		if (null != flexPricerRequestVO && null != flexPricerRequestVO.getIsAirlinkRoute() &&
				flexPricerRequestVO.getIsAirlinkRoute().equalsIgnoreCase("TRUE"))
			multiCityRedirectURLEncrypt.append("&DIRECT_NON_STOP=").append("TRUE");
		else
			multiCityRedirectURLEncrypt.append("&DIRECT_NON_STOP=").append("FALSE");
		// Added on 19/02/2021 to add a new Amadeus Trip Request Parameter --
		// end
	 
		/*
		 * Flight Information - Origin and destination
		 */
		multiCityRedirectURLEncrypt.append(setOriginDestination(flexPricerRequestVO));
		/*
		 * Passenger Information
		 */
		// A-10084 - on 17/02/2022, Pass youngAdultCount to
		// generateTravellerDetails
		multiCityRedirectURLEncrypt
				.append(generateTravellerDetails(adultCount, youngAdultCount, childCount, infantCount));
		/*
		 * Travel Dates and display
		 */
	 
		multiCityRedirectURLEncrypt.append(getTravelDatesAndDisplayInfo(flexPricerRequestVO));
		/**
		 * dedicated parameters for multiicty
		 */
		if (flexPricerRequestVO.getTripType().equals("M")) {
			multiCityRedirectURLEncrypt.append("&FROMPAGE=FPCOMPLEXSEARCH");
			multiCityRedirectURLEncrypt.append("&OUTPUT_STRUCTURE=RECOMMENDATION&PBI_NO_ERT_OUTPUT=TRUE");
		}
 
		/*
		 * Search Options
		 */
		multiCityRedirectURLEncrypt.append("&TRIP_TYPE=").append(flexPricerRequestVO.getTripType());
		multiCityRedirectURLEncrypt.append(getSearchOptionParams(flexPricerRequestVO));
		/*
		 * Pay later activation/deactivation
		 */
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getEnablePayLater())
				&& flexPricerRequestVO.getEnablePayLater().equalsIgnoreCase(CommonKeys.YES)) {
			multiCityRedirectURLEncrypt.append(getPaymentInfoParams(flexPricerRequestVO));
		}
		/*
		 * Ticketing Time limit
		 */
		multiCityRedirectURLEncrypt.append(getTicketingInfo(flexPricerRequestVO));
		/*
		 * Corporate codes â€“ Flexpricer flows
		 */
		String privateFareAccCode = getPrivateFareAccCode(flexPricerRequestVO);		 
		multiCityRedirectURLEncrypt.append(getCorporateInfoParams(privateFareAccCode));
		/*
		 * Late Login for B2B
		 */
		if (flexPricerRequestVO.getProduct() != null
				&& flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B)) {
			multiCityRedirectURLEncrypt.append("&DIRECT_LOGIN=").append(CommonKeys.NO);
			multiCityRedirectURLEncrypt.append("&SO_SITE_EXT_LOGIN_URL=")
					.append(eRetailSpecProperties.getProperty("LATE_LOGIN_URL"));
			multiCityRedirectURLEncrypt.append("&SO_SITE_SIGNIN_METHOD=LSIGN");
		}
		/*
		 * SOGL_parameter
		 */
		if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty(ENABLE_SOGL))
				&& TRUE.equals(eRetailSpecProperties.getProperty(ENABLE_SOGL))) {
			String sogl = generateSOGL(flexPricerRequestVO, false);
			multiCityRedirectURLEncrypt.append("&SO_GL=");
			multiCityRedirectURLEncrypt.append(sogl);
		}
	 
		/*
		 * Test-specific override parameters
		 */
		if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty(IS_PRODUCTION_SERVER))
				&& TRUE.equals(eRetailSpecProperties.getProperty(IS_PRODUCTION_SERVER))) {
			LOGGER.info("PROD Server MTCTY");
		} else {
			multiCityRedirectURLEncrypt.append(appendTestSpecParameters());
			if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty(APPEND_OTHER_TEST_SPEC_PARAMS))
					&& TRUE.equals(eRetailSpecProperties.getProperty(APPEND_OTHER_TEST_SPEC_PARAMS))) {
				LOGGER.info("Other TEST Params MTCTY");
				multiCityRedirectURLEncrypt.append(appendOtherTestSpecParameters());
			}
		}
		String multicityUrlWithoutEncryptn = multiCityRedirectURL.toString();
		LOGGER.info(
				"FinalMultiCityURL :  " + multicityUrlWithoutEncryptn + "--" + multiCityRedirectURLEncrypt.toString());
		/*
		 * AES encryption
		 */
		if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty(ENCRYPTION_ENABLED))
				&& TRUE.equals(eRetailSpecProperties.getProperty(ENCRYPTION_ENABLED))) {
			LOGGER.info("Encyrption enabled in MLTCTY");

			String encryptedURL = aesEncryption.encryptAvailabilityRequest(multiCityRedirectURLEncrypt.toString());
			LOGGER.info("Encyrpted MulticutyURL : " + encryptedURL);

			multiCityFinalURL = multicityUrlWithoutEncryptn + "&" + encryptedURL;

		} else {
			multiCityFinalURL = multicityUrlWithoutEncryptn + "&" + multiCityRedirectURLEncrypt.toString();
		}
		LOGGER.info("FinalMulticityURL return :  " + multiCityFinalURL);

		return multiCityFinalURL;
	}

	/**
	 * Method to add the Site Information to the redirection URL
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String getOfficeConfigurations(FlexPricerRequestVO flexPricerRequestVO) {
		 
		StringBuilder officeConfigURL = new StringBuilder("");

		officeConfigURL.append("&SO_SITE_OFFICE_ID=").append(flexPricerRequestVO.getAmadeusSiteOfficeID());
		/*
		 * officeConfigURL.append("&SO_SITE_QUEUE_OFFICE_ID=")
		 * .append(flexPricerRequestVO.getSiteQueueOfficeID());
		 * officeConfigURL.append("&SO_SITE_QUEUE_CATEGORY=")
		 * .append(flexPricerRequestVO.getSiteQueueCategory());
		 */
		 
		return officeConfigURL.toString();
	}

	/**
	 * Method to add the Traveller details to the redirection URL
	 * 
	 * @param adtCnt
	 * @param chdCnt
	 * @param infCnt
	 * @return String
	 */
	// A-10083 Added yngAdtCnt parameter to the function - on 17/02/2022
	public static String generateTravellerDetails(int adtCnt, int yngAdtCnt, int chdCnt, int infCnt) {

		StringBuilder travellerPart = new StringBuilder("");
		int totalNoOfPassengers = 0;
		int adtCntr = 0;
		// A-10083 - Add young adult count to adult count
		adtCnt = adtCnt + yngAdtCnt;
		totalNoOfPassengers = adtCnt + chdCnt + infCnt;

		LOGGER.info("AdultCount :" + adtCnt + ", ChildCount:" + chdCnt + ", InfantCount:" + infCnt);
		if (totalNoOfPassengers <= 9) {
			for (adtCntr = 1; adtCntr <= adtCnt; adtCntr++) {
				if (infCnt > 0 && infCnt >= adtCntr) {
					travellerPart.append("&TRAVELLER_TYPE_").append(adtCntr).append("=ADT");
					travellerPart.append("&HAS_INFANT_").append(adtCntr).append("=TRUE");
				} else {
					travellerPart.append("&TRAVELLER_TYPE_").append(adtCntr).append("=ADT");
					travellerPart.append("&HAS_INFANT_").append(adtCntr).append("=FALSE");
				}
			}
			for (int childCntr = 1; childCntr <= chdCnt; childCntr++) {
				travellerPart.append("&TRAVELLER_TYPE_").append(adtCntr).append("=CHD");
				travellerPart.append("&HAS_INFANT_").append(adtCntr).append("=FALSE");
				adtCntr++;
			}
		}
		 
		return travellerPart.toString();
	}

	/**
	 * Method to add the Search option Parameters to the redirection URL
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String getSearchOptionParams(FlexPricerRequestVO flexPricerRequestVO) {

		StringBuilder searchOptions = new StringBuilder("");
		searchOptions.append("&COMMERCIAL_FARE_FAMILY_1=");

		 

		if (CommonsUtil.isStringValid(flexPricerRequestVO.getCabinClass())) {
			if (flexPricerRequestVO.getCabinClass().equals(CommonKeys.CHAR_0)) {
				searchOptions.append(flexPricerRequestVO.getFareFamily1());
			} else if (flexPricerRequestVO.getCabinClass().equals(CommonKeys.CHAR_1)) {
				searchOptions.append(flexPricerRequestVO.getFareFamily3());
			} else if (flexPricerRequestVO.getCabinClass().equals(CommonKeys.E_CABIN)) {
				searchOptions.append(flexPricerRequestVO.getFareFamily1());
			} else if (flexPricerRequestVO.getCabinClass().equals(CommonKeys.B_CABIN)) {
				searchOptions.append(flexPricerRequestVO.getFareFamily3());
			} else {
				searchOptions.append(flexPricerRequestVO.getFareFamily2());
			}
		}

		searchOptions.append("&ARRANGE_BY=").append(flexPricerRequestVO.getArrangeBy());
		if (flexPricerRequestVO.getTripType().equalsIgnoreCase("M")) {
			searchOptions.append("&PRICING_TYPE=").append("I");
			searchOptions.append("&DISPLAY_TYPE=").append("1");
		} else {
			searchOptions.append("&PRICING_TYPE=").append(flexPricerRequestVO.getPricingType());
			searchOptions.append("&DISPLAY_TYPE=").append(flexPricerRequestVO.getDisplayType());
		}
		searchOptions.append("&SO_SITE_MARKET_ID=");
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getCountry())) {
			searchOptions.append(flexPricerRequestVO.getCountry().toUpperCase());
		}

		return searchOptions.toString();
	}

	/**
	 * Part of the request URL to append the Test
	 * 
	 * specific override parameters
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String appendTestSpecParameters() {

		StringBuilder testSpecParams = new StringBuilder("");
		testSpecParams.append("&SO_SITE_SI_1AXML_FROM=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_SI_1AXML_FROM"));
		testSpecParams.append("&SO_SITE_SI_PASSWORD=").append(eRetailSpecProperties.getProperty("SO_SITE_SI_PASSWORD"));
		testSpecParams.append("&SO_SITE_SI_SAP=").append(eRetailSpecProperties.getProperty("SO_SITE_SI_SAP"));
		testSpecParams.append("&SO_SITE_SI_SERVER_IP=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_SI_SERVER_IP"));
		testSpecParams.append("&SO_SITE_SI_SERVER_PORT=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_SI_SERVER_PORT"));
		testSpecParams.append("&SO_SITE_APIV2_SERVER=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_APIV2_SERVER"));
		testSpecParams.append("&SO_SITE_APIV2_SERVER_PWD=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_APIV2_SERVER_PWD"));
		testSpecParams.append("&SO_SITE_APIV2_SERVER_USER_ID=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_APIV2_SERVER_USER_ID"));
		testSpecParams.append("&SO_SITE_CORPORATE_ID=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_CORPORATE_ID"));
		testSpecParams.append("&SO_SITE_MAX_NUM_PNR_PER_CC=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_MAX_NUM_PNR_PER_CC"));

		return testSpecParams.toString();
	}

	/**
	 * Method to build the SOGL to add remarks in the PNR
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String generateSOGL(FlexPricerRequestVO flexPricerRequestVO, boolean isMobile) {
		String soglString = "";
		SOGL soglRequest = new SOGL();
		GLOBALLIST globalListB2C = new GLOBALLIST();
		String modeB2C = "complete";

		globalListB2C.setMode(modeB2C);
		globalListB2C.setNAME(CommonKeys.SO_SINGLE_MULTIPLE_COMMAND_BUILDER);

		List<LISTELEMENT> listElement = new ArrayList<LISTELEMENT>();

		// Remarks
		String ipAddress = null;
		String BookingSourceRM = null;
		String ipAddressRM = null;
		// added for viewing past and upcoming booking change req
		String foaPnrRM = null;
		// String sessionIdRM = null;
		if (flexPricerRequestVO.getReqObj() != null) {
			ipAddress = flexPricerRequestVO.getReqObj().getHostIpAddress();
		}
		// String sessionId =
		// flexPricerRequestVO.getSessionObj().getSessionId();
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getProduct())
				&& flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB)) {
			if (isMobile)
				BookingSourceRM = "RM 4Z MOBILE BOOKING";
			else
				BookingSourceRM = "RM 4Z INTERNET BOOKING";
		} else {
			BookingSourceRM = "RM FOA - " + flexPricerRequestVO.getCorporateName();
			// added for viewing past and upcoming booking change req
			// if(flexPricerRequestVO.getFoaPnrMainTableEntryId()>0)
			foaPnrRM = generateFOARemarksString(flexPricerRequestVO);
			// System.out.println(foaPnrRM);
		}
		// sessionIdRM = "RM SESSIONID - "+sessionId;
		ipAddressRM = "RM SERVER IP ADDRESS - " + ipAddress;

		LISTELEMENT listElementOne = new LISTELEMENT();
		listElementOne.setCODE("1");
		List<LISTVALUE> listValuesOne = new ArrayList<LISTVALUE>();
		LISTVALUE listValueOneAgain = new LISTVALUE();
		listValueOneAgain.setContent("<![CDATA[" + BookingSourceRM + "]]>");
		listValuesOne.add(listValueOneAgain);

		// Added on 02/02/2021 by A-8986 for every mundo referral id change --
		// start
		LISTVALUE listValueOneS = new LISTVALUE();
		listValueOneS.setContent("S");
		listValuesOne.add(listValueOneS);
		listElementOne.getLISTVALUE().addAll(listValuesOne);
		// Added on 02/02/2021 by A-8986 for every mundo referral id change --
		// end

		/* EveryMundo or GFS referralId */
		LISTELEMENT listElementEmGfs = new LISTELEMENT(); //// Added on
															//// 02/02/2021 by
															//// A-8986 for
															//// every mundo
															//// referral id
															//// change
		try {
			if ("GFS".equalsIgnoreCase(flexPricerRequestVO.getSourceId())
					|| "EveryMundo".equalsIgnoreCase(flexPricerRequestVO.getSourceId())) {
				LOGGER.info("Inside referralId fetching logic EveryMundo or GFS");

				// Added on 02/02/2021 by A-8986 for every mundo referral id
				// change -- start

				listElementEmGfs.setCODE("1");
				List<LISTVALUE> listValuesEmGfs = new ArrayList<LISTVALUE>();

				LISTVALUE listValueEmGfs = new LISTVALUE();
				String extSourceRM = "RM 4Z BOOKING SOURCE " + flexPricerRequestVO.getSourceId().toUpperCase().trim();
				listValueEmGfs.setContent("<![CDATA[" + extSourceRM + "]]>");
				listValuesEmGfs.add(listValueEmGfs);

				LISTVALUE listValueEmGfsS = new LISTVALUE();
				listValueEmGfsS.setContent("S");
				listValuesEmGfs.add(listValueEmGfsS);

				listElementEmGfs.getLISTVALUE().addAll(listValuesEmGfs);

				// Added on 02/02/2021 by A-8986 for every mundo referral id
				// change -- end
			}
		} catch (Exception e) {
			LOGGER.error("Error in creating sogl for gfs or everymundo-->>" + e.getMessage());
		}
		/* EveryMundo or GFS referralId end */

		LISTELEMENT listElementTwo = new LISTELEMENT();
		listElementTwo.setCODE("1");
		List<LISTVALUE> listValuesTwo = new ArrayList<LISTVALUE>();
		LISTVALUE listValueTwoAgain = new LISTVALUE();
		listValueTwoAgain.setContent("<![CDATA[" + ipAddressRM + "]]>");
		listValuesTwo.add(listValueTwoAgain);
		LISTVALUE listValueTwoS = new LISTVALUE();
		listValueTwoS.setContent("S");
		listValuesTwo.add(listValueTwoS);
		listElementTwo.getLISTVALUE().addAll(listValuesTwo);

		listElement.add(listElementOne);

		// Added on 02/02/2021 by A-8986 for every mundo referral id change --
		// start
		if ("GFS".equalsIgnoreCase(flexPricerRequestVO.getSourceId())
				|| "EveryMundo".equalsIgnoreCase(flexPricerRequestVO.getSourceId())) {
			listElement.add(listElementEmGfs);
		}
		// Added on 02/02/2021 by A-8986 for every mundo referral id change --
		// end

		listElement.add(listElementTwo);

		// added for viewing past and upcoming booking change req
		if (CommonsUtil.isStringValid(foaPnrRM)) {
			LISTELEMENT listElementThree = new LISTELEMENT();
			listElementThree.setCODE("1");
			List<LISTVALUE> listValuesThree = new ArrayList<LISTVALUE>();
			LISTVALUE listValueThreeAgain = new LISTVALUE();
			listValueThreeAgain.setContent("<![CDATA[" + foaPnrRM + "]]>");
			listValuesThree.add(listValueThreeAgain);
			LISTVALUE listValueThreeS = new LISTVALUE();
			listValueThreeS.setContent("S");
			listValuesThree.add(listValueThreeS);
			listElementThree.getLISTVALUE().addAll(listValuesThree);
			listElement.add(listElementThree);
		}
		globalListB2C.getLISTELEMENT().addAll(listElement);
		soglRequest.getGLOBALLIST().add(globalListB2C);
		 
		soglString = SOGLFormatter.formatStandAloneSOGL(soglRequest);
		String soglB2C = soglString.replace("&gt;", ">");
		String finalSoglB2C = soglB2C.replace("&lt;", "<");
	 
		return finalSoglB2C;
	}

	/**
	 * Part of the request URL to append the Other Test specific override
	 * parameters
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String appendOtherTestSpecParameters() {

		StringBuilder OtherTestSpecParams = new StringBuilder("");

		OtherTestSpecParams.append("&REFRESH=").append(eRetailSpecProperties.getProperty("REFRESH"));
		OtherTestSpecParams.append("&SO_SITE_EXTERNAL_ID=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_EXTERNAL_ID"));
		OtherTestSpecParams.append("&SO_SITE_EXTERNAL_ID_LIMIT=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_EXTERNAL_ID_LIMIT"));
		OtherTestSpecParams.append("&SO_SITE_FP_TRACES_ON=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_FP_TRACES_ON"));
		OtherTestSpecParams.append("&SO_SITE_FQ_INTERFACE_ACTIVE=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_FQ_INTERFACE_ACTIVE"));
		OtherTestSpecParams.append("&SO_SITE_HOST_TRACE_ACTIVE=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_HOST_TRACE_ACTIVE"));
		OtherTestSpecParams.append("&SO_SITE_SI_USER=").append(eRetailSpecProperties.getProperty("SO_SITE_SI_USER"));

		return OtherTestSpecParams.toString();
	}

	/**
	 * Method to get the private fare account code/corporate code
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String getPrivateFareAccCode(FlexPricerRequestVO flexPricerRequestVO) {
		String privateFareAccCode = null;
		if (flexPricerRequestVO.getPromoFaresVO() != null) {
			privateFareAccCode = flexPricerRequestVO.getPromoFaresVO().getPrivateFareAccountCode();

			if (flexPricerRequestVO.getProduct() != null
					&& (flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B))) {
				if (CommonsUtil.isStringValid(flexPricerRequestVO.getPromoFaresVO().getPrivateFareAccountCode())
						&& !((CommonKeys.DEFAULT_PROMO_CODE_B2B)
								.equals(flexPricerRequestVO.getPromoFaresVO().getPrivateFareAccountCode()))) {
					privateFareAccCode = flexPricerRequestVO.getPromoFaresVO().getPrivateFareAccountCode();
				} else {
					// set the corporate promocode if any otherwise use the
					// default promo code
					if (CommonsUtil.isStringValid(flexPricerRequestVO.getPromoFaresVO().getCorporatePromoCode())) {
						privateFareAccCode = flexPricerRequestVO.getPromoFaresVO().getCorporatePromoCode();
					} else {
						privateFareAccCode = CommonKeys.DEFAULT_PROMO_CODE_B2B;
					}
				}
			}
		}

		return privateFareAccCode;
	}

	/**
	 * Method to add the Site Info Parameters to the redirection URL
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String getSiteInfoParams(FlexPricerRequestVO flexPricerRequestVO) {
		 
		StringBuilder siteInfo = new StringBuilder("");
		 if (flexPricerRequestVO.getProduct() != null
				&& (flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB)
						|| flexPricerRequestVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B))) {
			 if(null != eRetailSpecProperties.getProperty("ERETAIL_URL").split("=")){
					String eRetailURL= eRetailSpecProperties.getProperty("ERETAIL_URL").split("=")[1];
					siteInfo.append(eRetailURL);
				}
			//siteInfo.append(eRetailSpecProperties.getProperty("ERETAIL_URL"));		 	
			siteInfo.append("?SITE=").append(flexPricerRequestVO.getSiteID());
		}

		siteInfo.append("&LANGUAGE=").append(flexPricerRequestVO.getAmadeusLanguageCode());
		if (flexPricerRequestVO.getTripType().equals("M"))
			siteInfo.append("&EMBEDDED_TRANSACTION=").append(CommonKeys.EMBEDDED_TRANSACTION_MULTICITY);
		else
			siteInfo.append("&EMBEDDED_TRANSACTION=").append(flexPricerRequestVO.getEmbTransFlexPricerAction());
		 
		return siteInfo.toString();
	}

	/**
	 * Method to add the Payment Info Parameters to the redirection URL
	 * 
	 * @return String
	 */
	public static String getPaymentInfoParams(FlexPricerRequestVO flexPricerRequestVO) {

		StringBuilder paymentInfoParams = new StringBuilder("");
		// Commented by A-9781 on 31-08-2021 as per HD-314082 to disable pay
		// later --start
		/*
		 * paymentInfoParams.append("&SO_SITE_USE_PENDING_TRIPS=").append(
		 * CommonKeys.CHAR_Y);
		 * paymentInfoParams.append("&SO_SITE_MOP_PAY_LATER=").append(TRUE);
		 * if(CommonsUtil.isStringValid(flexPricerRequestVO.getRouteType())){
		 * if(flexPricerRequestVO.getRouteType().equals(CommonKeys.REGIONAL)){
		 * paymentInfoParams.append("&SO_SITE_PENDING_TIME_LIMIT=")
		 * .append(eRetailSpecProperties.getProperty(
		 * "SO_SITE_PENDING_TIME_LIMIT_72")); } else
		 * if(flexPricerRequestVO.getRouteType().equals(CommonKeys.DOMESTIC)){
		 * paymentInfoParams.append("&SO_SITE_PENDING_TIME_LIMIT=")
		 * .append(eRetailSpecProperties.getProperty(
		 * "SO_SITE_PENDING_TIME_LIMIT_24")); } }
		 */
		// Commented by A-9781 on 31-08-2021 as per HD-314082 to disable pay
		// later --end
		return paymentInfoParams.toString();
	}

	/**
	 * Method to add the Corporate Info Parameters to the redirection URL
	 * 
	 * @return String
	 */
	public static String getCorporateInfoParams(String privateFareAccCode) {

		StringBuilder corporateInfoParams = new StringBuilder("");
		corporateInfoParams.append("&TYPE_OF_CORPORATE_FARE_1=")
				.append(eRetailSpecProperties.getProperty("TYPE_OF_CORPORATE_FARE_1"));
		corporateInfoParams.append("&IS_PRICE_BY_INPUT_1=").append(TRUE);
		corporateInfoParams.append("&LIST_CORPORATE_NUMBER_1_1=").append(privateFareAccCode);

		return corporateInfoParams.toString();
	}

	/**
	 * Method to add the travel Dates and display information to the redirection
	 * URL
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String getTravelDatesAndDisplayInfo(FlexPricerRequestVO flexPricerRequestVO) {
		 
		StringBuilder displayInfo = new StringBuilder("");
		if (flexPricerRequestVO.getTripType().equals(CommonKeys.TRIP_TYPE_MULTI_CITY)) {
			String dateRangeValue; 
			dateRangeValue = calculateDateRangeValue(flexPricerRequestVO);
			//LOGGER.info("DATE RANGE VALUE CALCULATED " + dateRangeValue);
			// calculating the length of departurecities
			String departureCityArray[] = null;
			departureCityArray = flexPricerRequestVO.getDepartureCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
			String dateRangeQualifierString, dateRangeValueString, bAnyTime;
			for (int i = 1; i <= departureCityArray.length; i++) {
				dateRangeQualifierString = "&DATE_RANGE_QUALIFIER_" + i + "=";
				dateRangeValueString = "&DATE_RANGE_VALUE_" + i + "=";
				bAnyTime = "&B_ANY_TIME_" + i + "=";
				displayInfo.append(dateRangeQualifierString).append(flexPricerRequestVO.getDateRangeQualifier1());
				displayInfo.append(dateRangeValueString).append(dateRangeValue);
				displayInfo.append(bAnyTime).append(TRUE);
			}
			LOGGER.info("Date range values appended for multicity trip type :" + displayInfo);
		} else {

			displayInfo.append("&DATE_RANGE_QUALIFIER_1=").append(flexPricerRequestVO.getDateRangeQualifier1());
			displayInfo.append("&DATE_RANGE_VALUE_1=").append(flexPricerRequestVO.getDateRangeValue1());
			displayInfo.append("&B_ANY_TIME_1=").append(TRUE);

			if (CommonsUtil.isStringValid(flexPricerRequestVO.getTripType())
					&& (flexPricerRequestVO.getTripType().equals(CommonKeys.TRIP_TYPE_ROUND_TRIP)
					/*
					 * || flexPricerRequestVO.getTripType().equals(CommonKeys.
					 * TRIP_TYPE_MULTI_CITY)
					 */)) {

				displayInfo.append("&DATE_RANGE_QUALIFIER_2=").append(flexPricerRequestVO.getDateRangeQualifier2());
				displayInfo.append("&DATE_RANGE_VALUE_2=").append(flexPricerRequestVO.getDateRangeValue2());
				displayInfo.append("&B_ANY_TIME_2=").append(TRUE);
			}
		}
	 
		return displayInfo.toString();
	}

	private static String calculateDateRangeValue(FlexPricerRequestVO flexPricerRequestVO) {
		String departureCityArray[] = null;
		String destinationCityArray[] = null;
		departureCityArray = flexPricerRequestVO.getDepartureCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		destinationCityArray = flexPricerRequestVO.getDestinationCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		int segments = 0;
		// String dateRangeValue="";
		try {
			for (int i = 0; i < departureCityArray.length; i++) {
				if ((i + 1) < departureCityArray.length && departureCityArray[i + 1] != null
						&& !(destinationCityArray[i].toString()
								.equalsIgnoreCase(departureCityArray[i + 1].toString()))) {
					segments += 2;
				} else
					segments += 1;
			}
			LOGGER.info("Final no of segments for multicity booking" + segments);
			if (segments == 2)
				return (CommonKeys.DATE_RANGE_VALUE_2_SEGMENTS);
			else if (segments == 3)
				return (CommonKeys.DATE_RANGE_VALUE_3_SEGMENTS);
			else if (segments == 4)
				return (CommonKeys.DATE_RANGE_VALUE_4_SEGMENTS);
			else if (segments == 5)
				return (CommonKeys.DATE_RANGE_VALUE_5_SEGMENTS);
			else if (segments == 6)
				return (CommonKeys.DATE_RANGE_VALUE_6_SEGMENTS);
			else if (segments == 7)
				return (CommonKeys.DATE_RANGE_VALUE_7_SEGMENTS);
			else
				return null;
		} catch (Exception e) {
			LOGGER.info("Error occured while calculating number of segments" + e);
			throw e;
		}
	}

	/**
	 * Method to add the External Id parameters to the redirection URL
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String generateExternalIDRequestParameters(FlexPricerRequestVO flexPricerRequestVO) {
		 
		String extID_RequestParams = "";
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getSessionObj().getSessionId())) {
			extID_RequestParams += "SESSIONID:" + flexPricerRequestVO.getSessionObj().getSessionId() + ";";
		} else {
			extID_RequestParams += "SESSIONID: ;";
		}
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getProduct())) {
			extID_RequestParams += "product:" + flexPricerRequestVO.getProduct() + ";";
		} else {
			extID_RequestParams += "product: ;";
		}
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getLanguage())) {
			extID_RequestParams += "language:" + flexPricerRequestVO.getLanguage() + ";";
		} else {
			extID_RequestParams += "language: ;";
		}
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getCountry())) {
			extID_RequestParams += "country:" + flexPricerRequestVO.getCountry() + ";";
		} else {
			extID_RequestParams += "country: ;";
		}
		if (flexPricerRequestVO.getIsMobileDevice().equalsIgnoreCase("true")) {
			extID_RequestParams += "channel:" + "Mobile";
		} else {
			extID_RequestParams += "channel:" + "Web";
		}
		 
		return extID_RequestParams;
	}

	/**
	 * Method to add the origin and destination parameters to the redirection
	 * URL
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String setOriginDestination(FlexPricerRequestVO flexPricerRequestVO) {

		StringBuilder originDestination = new StringBuilder("");
		String departureDateArray[] = null;
		String departureCityArray[] = null;
		String destinationCityArray[] = null;
		departureDateArray = flexPricerRequestVO.getDepartureDate().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		departureCityArray = flexPricerRequestVO.getDepartureCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		destinationCityArray = flexPricerRequestVO.getDestinationCity().split(CommonKeys.MULTICITY_SPLITTER_REGEX);
		// LOGGER.info("From setOriginDestination destinationCityArray:"+destinationCityArray );
		for (int i = 0; i < departureCityArray.length; i++) {
			String departureCity = departureCityArray[i];
		/*	if ("JNB".equals(departureCity)) {
				departureCity = departureCity + "+";
			}*/
			originDestination.append("&B_LOCATION_" + (i + 1) + ("=") + departureCity);
		}
		for (int i = 0; i < destinationCityArray.length; i++) {
			String destinationCity = destinationCityArray[i];
			/*if ("JNB".equals(destinationCity)) {
				destinationCity = destinationCity + "+";
			}*/
			originDestination.append("&E_LOCATION_" + (i + 1) + "=" + destinationCity);
		}
		for (int i = 0; i < departureDateArray.length; i++) {
			String formattedFromDate = departureDateArray[i];
			originDestination.append("&B_DATE_" + (i + 1) + "=" + formattedFromDate);
		}
		// LOGGER.info("From setOriginDestination originDestination:"+originDestination );
		return originDestination.toString();
	}

	/**
	 * Method to add the Flight Information-Origin/Destination to the
	 * redirection URL
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String getFlightInformation(FlexPricerRequestVO flexPricerRequestVO) {
		 
		String formattedFromDate = flexPricerRequestVO.getDepartureDate();
		String formattedToDate = flexPricerRequestVO.getReturnDate();
		String departureLocation = flexPricerRequestVO.getDepartureCity();
		String arrivalLocation = flexPricerRequestVO.getDestinationCity();

		StringBuilder flightInfoURL = new StringBuilder("");
		flightInfoURL.append("&B_LOCATION_1=").append(departureLocation);
		flightInfoURL.append("&B_DATE_1=").append(formattedFromDate);
		flightInfoURL.append("&E_LOCATION_1=").append(arrivalLocation);
		if (flexPricerRequestVO.getTripType() != null
				&& flexPricerRequestVO.getTripType().equals(CommonKeys.TRIP_TYPE_ROUND_TRIP)) {
			flightInfoURL.append("&B_LOCATION_2=").append(arrivalLocation);
			flightInfoURL.append("&B_DATE_2=").append(formattedToDate);
			flightInfoURL.append("&E_LOCATION_2=").append(departureLocation);
		}
		 
		return flightInfoURL.toString();
	}

	/**
	 * Method to add the Ticketing Information to the redirection URL
	 * 
	 * @param flexPricerRequestVO
	 * @return String
	 */
	public static String getTicketingInfo(FlexPricerRequestVO flexPricerRequestVO) {

		StringBuilder ticketInfoURL = new StringBuilder("");
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getRouteType())) {
			if (flexPricerRequestVO.getRouteType().equals(CommonKeys.REGIONAL)) {
				ticketInfoURL.append("&SO_SITE_TICKETING_TIME_LIMIT=")
						.append(eRetailSpecProperties.getProperty("SO_SITE_TICKETING_TIME_LIMIT_72"));
			} else if (flexPricerRequestVO.getRouteType().equals(CommonKeys.DOMESTIC)) {
				ticketInfoURL.append("&SO_SITE_TICKETING_TIME_LIMIT=")
						.append(eRetailSpecProperties.getProperty("SO_SITE_TICKETING_TIME_LIMIT_24"));
			}
		}
		return ticketInfoURL.toString();
	}

	// added for FOA
	// RM FOA booking Details%%F<sessionId>%%F<crp_id>%%F<usr_id>
	private static String generateFOARemarksString(FlexPricerRequestVO flexPricerRequestVO) {
		//LOGGER.entering("FlightSearchUtil", "generateFOARemarksString");
		String remarks;
		if (CommonsUtil.isStringValid(flexPricerRequestVO.getCorporateId())
				&& CommonsUtil.isStringValid(flexPricerRequestVO.getUserId())
				&& CommonsUtil.isStringValid(flexPricerRequestVO.getSessionObj().getSessionId())) {
			remarks = "RM FOA flightSearch Remarks -" + flexPricerRequestVO.getSessionObj().getSessionId() + "%%F"
					+ flexPricerRequestVO.getCorporateId() + "%%F" + flexPricerRequestVO.getUserId();
			 
			return remarks;
		}
		return null;
	}

	 
}