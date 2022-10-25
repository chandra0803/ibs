package com.ibsplc.reservation.util;

import java.util.Properties;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.flightsearch.util.encryptor.AESEncryption;
import com.ibsplc.framework.util.filereader.FileReader;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.reservation.vo.BookingVO;

/**
 * @author a-5316
 *
 */
public class ReservationUtil {

	private static final Logger LOGGER = Log4j2Logger.create(ReservationUtil.class);
	public static final String E_RETAIL_PROPERTIES = "eRetail.properties";
	private static final String IS_PRODUCTION_SERVER = "IS_PRODUCTION_SERVER";
	private static Properties eRetailSpecProperties;
	private static final String TRUE = "TRUE";
	private static final String REDIRECTED_FROM = "RSS";

	private ReservationUtil() {

	}

	/**
	 * Method to build the Manage Booking Redirection URL to Amadeus
	 * 
	 * @param bookingVO
	 * @return String
	 */
	public static String createRetrieveFlowURL(BookingVO bookingVO) {

		LOGGER.info("inside createRetrieveFlowURL : " + bookingVO.toString());
		eRetailSpecProperties = FileReader.getProperties(E_RETAIL_PROPERTIES);

		String finalURL = "";
		StringBuilder loginRedirectURL = new StringBuilder("");
		StringBuilder loginRedirectURLEncrypt = new StringBuilder("");
		AESEncryption aesEncryption = new AESEncryption();
		/*
		 * Site Information
		 */
		if (bookingVO.getProduct() != null && (bookingVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_LRB)
				|| bookingVO.getProduct().equalsIgnoreCase(CommonKeys.PRODUCT_B2B))) {

			loginRedirectURL.append(eRetailSpecProperties.getProperty("MANAGE_BKG_URL"));
			loginRedirectURL.append("?SITE=").append(bookingVO.getSiteID());
		}
		loginRedirectURL.append("&LANGUAGE=").append(bookingVO.getAmadeusLanguageCode());
		loginRedirectURL.append("&EMBEDDED_TRANSACTION=").append(bookingVO.getEmbTransRetrieveAction());

		loginRedirectURLEncrypt.append("SO_SITE_OFFICE_ID=").append(bookingVO.getAmadeusSiteOfficeID());
		loginRedirectURLEncrypt.append("&DIRECT_RETRIEVE=").append(TRUE);
		loginRedirectURLEncrypt.append("&REC_LOC=").append(bookingVO.getPnrNum());
		loginRedirectURLEncrypt.append("&DIRECT_RETRIEVE_LASTNAME=").append(bookingVO.getSurName());
		loginRedirectURLEncrypt.append("&OVERRIDE_ENABLE=").append(TRUE);
		/*
		 * Added on 03 July 2020 by A-8986 to set Export Trip Plan URL in Manage my booking flow 
		 */
		LOGGER.info("SO_SITE_EXPORT_CONF_URL : "+eRetailSpecProperties.getProperty("SO_SITE_EXPORT_CONF_URL"));
		loginRedirectURLEncrypt.append("&SO_SITE_EXPORT_CONF_URL=").append(eRetailSpecProperties.getProperty("SO_SITE_EXPORT_CONF_URL"));
		
		//Added on 15 May 2020 by A-8986 to enable Alternative payment gateway in Amadeus
		/*
		 * 
		 */
		if(bookingVO.getCountry().equalsIgnoreCase("ZA"))
		loginRedirectURLEncrypt.append("&SO_SITE_IS_MERCH_TEST_DATA=").append(eRetailSpecProperties.getProperty("SO_SITE_IS_MERCH_TEST_DATA"));
		
		/*
		 * Test-specific override parameters
		 */
		if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty(IS_PRODUCTION_SERVER))
				&& TRUE.equals(eRetailSpecProperties.getProperty(IS_PRODUCTION_SERVER))) {
			LOGGER.info("PROD Env:");
		} else {
			loginRedirectURLEncrypt.append(appendTestSpecParameters());
		}

		String urlWithoutEncryptn = loginRedirectURL.toString();
		LOGGER.info("RetrievePNR URL" + urlWithoutEncryptn + "--" + loginRedirectURLEncrypt.toString());
		/*
		 * AES encryption
		 */
		if (CommonsUtil.isStringValid(eRetailSpecProperties.getProperty("MNGBKG_ENCRYPTION_ENABLED"))
				&& TRUE.equals(eRetailSpecProperties.getProperty("MNGBKG_ENCRYPTION_ENABLED"))) {
			LOGGER.info("Encyrption enabled in Retrieve FLow");

			String encryptedURL = aesEncryption.encryptAvailabilityRequest(loginRedirectURLEncrypt.toString());
			LOGGER.info("Retrieve Flow Encyrpted URL : " + encryptedURL);

			finalURL = urlWithoutEncryptn + "&" + encryptedURL;

		} else {
			finalURL = urlWithoutEncryptn + "&" + loginRedirectURLEncrypt.toString();
		}
		LOGGER.info("Final Retrieve URL :  " + finalURL);
		return finalURL;
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
		testSpecParams.append("&SO_SITE_SI_USER=").append(eRetailSpecProperties.getProperty("SO_SITE_SI_USER"));
		testSpecParams.append("&SO_SITE_PNR_SERV_REQ_LOGIN=").append(CommonKeys.NO);
		testSpecParams.append("&SO_SITE_MAX_NUM_PNR_PER_CC=")
				.append(eRetailSpecProperties.getProperty("SO_SITE_MAX_NUM_PNR_PER_CC"));

		return testSpecParams.toString();
	}

	/**
	 * Method to build the Check-In Redirection URL to Amadeus for Airlink
	 * 
	 * @param bookingVO
	 * @return String
	 */
	public static String createCheckInURLForAirlink(BookingVO bookingVO) {
		LOGGER.info("inside createRetrieveFlowURL : " + bookingVO.toString());
		eRetailSpecProperties = FileReader.getProperties(E_RETAIL_PROPERTIES);

		String finalURL = "";
		StringBuilder checkInURL = new StringBuilder("");
		checkInURL.append(eRetailSpecProperties.getProperty("CHECK_IN_URL_AIRLINK"));
		checkInURL.append(createCheckInCommonParams(bookingVO));
		finalURL = checkInURL.toString();
		LOGGER.info("Final 4Z Check-In URL :  " + finalURL);
		return finalURL;

	}

	/**
	 * Method to build the Check-In Redirection URL to Amadeus for SA
	 * 
	 * @param bookingVO
	 * @return String
	 */
	public static String createCheckInURL(BookingVO bookingVO) {
		LOGGER.info("inside createRetrieveFlowURL : " + bookingVO.toString());
		eRetailSpecProperties = FileReader.getProperties(E_RETAIL_PROPERTIES);
		String finalURL = "";
		StringBuilder checkInURL = new StringBuilder("");
		checkInURL.append(eRetailSpecProperties.getProperty("CHECK_IN_URL_SAA"));
		checkInURL.append(createCheckInCommonParams(bookingVO));
		finalURL = checkInURL.toString();
		LOGGER.info("Final SA Check-In URL :  " + finalURL);
		return finalURL;

	}

	/**
	 * Part of the request URL to append the Common parameters
	 * 
	 * @param bookingVO
	 * @return String
	 */
	public static String createCheckInCommonParams(BookingVO bookingVO) {

		StringBuilder commonParams = new StringBuilder("");
		commonParams.append("?IFormOfIdentification=").append(bookingVO.getFormOfIdentification());
		if (CommonsUtil.isStringValid(bookingVO.getFormOfIdentification())) {
			if (bookingVO.getFormOfIdentification().equalsIgnoreCase(CommonKeys.PNR)) {
				// commonParams.append("&IGroupTravel=").append(CommonKeys.ON.toLowerCase());
				commonParams.append("&IIdentification=").append(bookingVO.getPnrNumber());
			} else if (bookingVO.getFormOfIdentification().equalsIgnoreCase(CommonKeys.ETICKET)) {
				if (CommonsUtil.isStringValid(bookingVO.getTicketNumber())) {
					commonParams.append("&IIdentification=")
							.append(bookingVO.getTicketNumber().replace(CommonKeys.HYPHEN, ""));
				}
				commonParams.append("&RedirectedFrom=").append(REDIRECTED_FROM);
			}
		}
		commonParams.append("&IGroupTravel=").append(bookingVO.getIdentifier());
		commonParams.append("&ISurname=").append(bookingVO.getSurName());
		commonParams.append("&ln=").append(CommonKeys.EN.toLowerCase());
		commonParams.append("&appRedirected=").append(TRUE.toLowerCase());

		return commonParams.toString();
	}

}
