package com.ibsplc.common.constants;

public final class ServiceParamsKeys {
	// adding non-public constructor to utility class
	private ServiceParamsKeys() {

	}
	/**
	 * FLIGHT_SEARCH_SERVICE_REQUEST_PARAMS
	 */
	// A-10083 - on 18/02/2022 - Added youngAdultCount
	
		public enum FLIGHT_SEARCH_SERVICE_REQUEST_PARAMS {
			tripType, departureCity, destinationCity, departureDate, returnDate, 
			dateFlexible, adultCount, youngAdultCount, childCount, infantCount, cabinClass, 
			amadeusReturnUrl, promocode, clientSessionId, country, language, product, isMobileDevice
		};
	/**
	 * OPTIONAL_FLIGHT_SEARCH_SERVICE_REQUEST_PARAMS
	 */
	public enum OPTIONAL_FLIGHT_SEARCH_SERVICE_REQUEST_PARAMS {
		dateFlexible, childCount, infantCount, cabinClass, amadeusReturnUrl, promocode
	};

	/**
	 * Flex Pricer Keys
	 */
	public static final String ERETAIL_TRIP_FLOW = "TRIP_FLOW";
	public static final String ERETAIL_FLEX_PRICER_REQUEST = "FLEX_PRICER_REQUEST";
	public static final String ERETAIL_BOOKING_CONFIRM_ACTION = "EMB_BOOKNG_CONFIRM";
	public static final String ERETAIL_EXT_PSP_URL = "EXT_PSP_URL";
	public static final String ERETAIL_SITE_EXT_MERCHANTID = "SITE_EXT_MerchantID";
	public static final String ERETAIL_ENCRYPTION_ENABLED = "ENCRYPTION_ENABLED";
	public static final String ERETAIL_PRODUCT_DELIMITER = "ERETAIL_";
	public static final String ERETAIL_RETRIEVE_PNR ="ERETAIL_RETRIEVE_PNR";
	public static final String ERETAIL_EMB_PURCHASE_ACTION ="EMB_PURCHASE_ACTION";
	/**
	 * DEFAULT_POS_CITY
	 */
	public static final String DEFAULT_POS_CITY = "JNB";

	/**
	 * DEFAULT_POS_CON
	 */
	public static final String DEFAULT_POS_CON = "ZA";
	/**
	 * Site point of sale
	 */
	public static final String SITE_POINT_OF_SALE = "sitePointOfSale";
	/**
	 * City for office id
	 */
	public static final String CITY_FOR_OFFICE_ID = "cityForOfficeID";
	/**
	 * is amadeus pos
	 */
	public static final String IS_AMADEUS_POS = "isAmadeusPos";
	
	

}
