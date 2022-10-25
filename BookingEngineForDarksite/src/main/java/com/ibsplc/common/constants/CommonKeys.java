package com.ibsplc.common.constants;

/**
 * @author a-5316
 *
 */
public interface CommonKeys {
	/**
	 * ERROR
	 */
	static String ERROR_MESSAGE = "ERROR";

	/**
	 * ERROR_RESULT_CODE
	 */
	static String ERROR_RESULT_CODE = "201";
	/**
	 * CUSTOM_ERROR_RESULT_CODE
	 */
	static String CUSTOM_ERROR_RESULT_CODE = "202";
	/**
	 * EXCEPTION_RESULT_CODE
	 */
	static String EXCEPTION_RESULT_CODE = "500";
	/**
	 * CUSTOM_ERROR_CODE_1001
	 */
	static String CUSTOM_ERROR_CODE_1001 = "Error 1001";
	/**
	 * CUSTOM_ERROR_CODE_1002
	 */
	static String CUSTOM_ERROR_CODE_1002 = "Error 1002";

	/**
	 * SUCCESS_RESULT_CODE
	 */
	static String SUCCESS_RESULT_CODE = "200";
	
	/**
	 * SUCCESS
	 */
	public static String SUCCESS_MESSAGE = "SUCCESS";
	
	public static String EMPTY_STRING = "";
	
	public static String SPACE_STRING = " ";
	
	/**
	 * CHAR_Y
	 */
	public static final String CHAR_Y = "Y";
	
	public static final char CHARACTER_Y = 'Y';
	public static final char CHARACTER_N = 'N';
	/**
	 * CHAR_N 
	 */
	public static final String CHAR_N = "N";
	
	public static final String UTC = "UTC";
	/**
	 * SESSION_ID
	 */
	static String SESSION_ID = "SESSION_ID";
	/**
	 * SESSION_ID
	 */
	static String SESSIONID = "SESSIONID";
	/**
	 * COUNTRY IN EXTERNAL_ID PARAMETER
	 */
	static String COUNTRY = "country";
	/**
	 * PRODUCT IN EXTERNAL_ID PARAMETER
	 */
	static String PRODUCT = "product";
	/**
	 * LANGUAGE IN EXTERNAL_ID PARAMETER
	 */
	static String LANGUAGE = "language";
	/**
	 * Session Encription Key
	 */
	static final String SESSION_KEY = "session.encrypt.key";
	/**
	 * sessioninitVector
	 */
	static final String SESSION_INITVECTOR = "session.encrypt.initVector";
	/**
	 * sessionIdentifier
	 */
	static final String SESSION_IDENTIFIER = "session.encrypt.identifier";
	/**
	 * ENCODING KEY
	 */
	static final String ENCRYPT_ENCODINGKEY = "UTF-8";
	/**
	 * Encryption type
	 */
	static final String ENCRYPT_TYPE = "AES";
	/**
	 * BOOLEAN TRUE
	 */
	static Boolean TRUE = true;
	/**
	 * BOOLEAN FALSE
	 */
	static Boolean FALSE = false;
	/**
	 * One way Trip type
	 */
	public static String TRIP_TYPE_ONE_WAY = "O";
	/**
	 * Trip type- Round trip
	 */
	public static String TRIP_TYPE_ROUND_TRIP = "R";
	/**
	 * Multicity trip type
	 */
	public static String TRIP_TYPE_MULTI_CITY = "M";
	/**
	 * Regular expression for splitting departure, destination cities and
	 * departure dates for multicity trip
	 */
	public static String MULTICITY_SPLITTER_REGEX = ",";
	/**
	 * Regular expression for splitting external id
	 */
	public static String EXTERNAL_ID_SPLITTER_KEY = ":";
	/**
	 * Regular expression for splitting external id
	 */
	public static String EXTERNAL_ID_SPLITTER_REGEX = ";";

	/**
	 * Screen date format
	 */
	public static final String SCREEN_DATE_FORMAT = "dd-MM-yyyy";
	
	public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
	/**
	 * Amadeus Date format
	 */
	public static final String AMADEUS_DATE_FORMAT = "yyyyMMddHHmm";
	/**
	 * Amadeus DOB format
	 */
	public static final String AMADEUS_DOB_FORMAT = "yyyyMMdd";
	/**
	 * Date format with time
	 */
	public static final String DATE_FORMAT_WITH_TIME = "yyyy-MM-dd HH:mm:ss";
	
	public static final String DATE_FORMAT_DD_MM_YYYY_HH_MM = "dd-MMM-yyyy HH:mm";
	
	public static final String DATE_FORMAT_WITH_DAY_AND_DATE = "EEEE, dd MMM yyyy";
	/**
	 * Amadeus Date format with time
	 */
	public static final String AMADEUS_DATE_FORMAT_WITH_TIME = "yyyyMMddHHmmss";
	/**
	 * COUNTRY_ZA
	 */
	static String COUNTRY_ZA = "ZA";
	/*
	 * Route tyoe-international
	 */
	public static final String INTERNATIONAL = "INT";
	/*
	 * Route type-Domestic
	 */
	public static final String DOMESTIC = "DOM";
	/*
	 * Route type-regional
	 */
	public static final String REGIONAL = "REG";

	/*
	 * default flex config for international routes
	 */
	public static final String DEFAULT_FLEX_CONFIG_NAME_FOR_INTERNATIONAL = "FLEXINT";
	/*
	 * default flex config for domestic routes
	 */
	public static final String DEFAULT_FLEX_CONFIG_NAME_FOR_DOMESTIC = "FLEXDOM";
	/*
	 * default flex config for domestic routes
	 */
	public static final String DEFAULT_FLEX_CONFIG_NAME_FOR_REGIONAL = "FLEXREG";
	/**
	 * default fare family 1 for international route
	 */
	public static final String DEFAULT_FARE_FAMILY1_FOR_INTERNATIONAL = "IBIZ";
	/**
	 * default fare family 1 for domestic route
	 */
	public static final String DEFAULT_FARE_FAMILY1_FOR_DOMESTIC = "DBIZ";
	/**
	 * Number 1
	 */
	public static final String CHAR_1 = "1";
	/**
	 * Number 0
	 */
	public static final String CHAR_0 = "0";
	/**
	 * DEFAULT PROMOCODE WHICH IS ENTERED FOR ALL TRANSACTIONS FOR B2C
	 */
	static String DEFAULT_PROMO_CODE = "232323";
	/**
	 * DEFAULT PROMOCODE WHICH IS ENTERED FOR ALL TRANSACTIONS FOR B2B
	 */
	static String DEFAULT_PROMO_CODE_B2B = "343434";
	/**
	 * Default site office id
	 */
	public static final String DEFAULT_AMADEUS_SITE_OFFICE_ID = "JNB4Z08AA";
	/**
	 * Default site queue id
	 */
	public static final String DEFAULT_AMADEUS_SITE_QUEUE_OFFICE_ID = "JNB4Z08AA";
	/**
	 * Default Point of sale
	 */
	public static final String DEFAULT_POS = "JNB";
	/**
	 * Product - Revenue Booking Flow
	 */
	public static String PRODUCT_LRB="LRB";
	/**
	 * Product - Business-To-Business
	 */
	public static String PRODUCT_B2B="B2B";
	
	
	/**
	 * Default currency code
	 */
	public static String DEFAULT_CURRENCY = "ZAR";
	/**
	 * SERVICE_DOT_PROPERTIES
	 */
	static String SERVICE_DOT_PROPERTIES="appconfig.properties";
	/**
	 * eRetail Embedded Transaction
	 */
	public static String EMBEDDED_TRANSACTION = "FlexPricerAvailability";
	/**
	 * SESSION_USER_LANGUAGE
	 */
	static String SESSION_LOGGED_IN_LOCALE = "LOGGED_IN_LOCALE";

	/**
	 * SESSION_USER_COUNTRY
	 */
	static String SESSION_LOGGED_IN_COUNTRY = "LOGGED_IN_COUNTRY";

	/**
	 * SESSION_USER_PRODUCT
	 */
	static String SESSION_LOGGED_IN_PRODUCT = "LOGGED_IN_PRODUCT";
	static String DOMESTIC_CHECK = "D";
	static String FLEXI_DOMESTIC_CHECK = "F";
	static String REGION_CHECK = "R";
	static final String SO_SITE_FARE_COMMANDS_AND_OPTIONS = "SITE_SITE_FARE_COMMANDS_AND_OPTIONS";
    static final String SITE_AIRLINE_SEAT_OCCUPATION      = "SITE_AIRLINE_SEAT_OCCUPATION";
    static final String SO_SINGLE_MULTIPLE_COMMAND_BUILDER = "SO_SINGLE_MULTIPLE_COMMAND_BUILDER";
    /**
	 * FLEX_PRICER_REQUEST_VO
	 */
	static String FLEX_PRICER_REQUEST_VO = "FLEX_PRICER_REQUEST_VO";
	
	/**
	 * SESSION_ACTIVE
	 */
	static String PNRNUM = "pnrNo";

	/**
	 * SESSION_ACTIVE
	 */
	static String SURNAME = "surName";
	/**
	 * DATE_FORMAT
	 */
	public static final String DATE_FORMAT 			= "dd MM yyyy";
	public static final String CAL_DATE_FORMAT      = "dd MMM yyyy";
	/*
	 * Passenger type for Adult
	 */
	public static final String ADULT_TYPE = "ADT";
	
	public static final String ADULT_DESCRIPTION = "ADULT";
	public static final String CHILD_DESCRIPTION = "CHILD";
	public static final String INFANT_DESCRIPTION = "INFANT";
	/**
	 * Passenger type for Child
	 */
	public static final String CHILD_TYPE = "CHD";
	/**
	 * Passenger type for Infant
	 */
	public static final String INFANT_TYPE = "INF";
	/**
	 * YES
	 */
	public static final String YES = "YES";
	/**
	 * NO
	 */
	public static final String NO = "NO";
	/**
	 * ERROR message
	 */
	static String INVALID_SESSION = "invalid session";
	/**
	 * PAY LATER
	 */
	public static String PAY_LATER = "PL";
	/**
	 * Airlink Airline Code
	 */
	public static String AIRLINK_AIRLINE_CODE = "4Z";
	/**
	 * SA Airline Code
	 */
	public static String SA_AIRLINE_CODE = "SA";
	/**
	 * PNR
	 */
	public static String PNR = "PNR";
	/**
	 * E- Ticket
	 */
	public static String ETICKET = "ETKT";
	/**
	 * ON
	 */
	public static final String ON = "ON";
	/**
	 * EN
	 */
	public static final String EN = "EN";
	/**
	 * HYPHEN
	 */
	public static final String HYPHEN = "-";
	/**
	 * DATA RANGE VALUE FOR multicity booking depending on number of segmnets
	 */
    public static final String DATE_RANGE_VALUE_2_SEGMENTS ="3";
    public static final String DATE_RANGE_VALUE_3_SEGMENTS ="2";
    public static final String DATE_RANGE_VALUE_4_SEGMENTS ="1";
    public static final String DATE_RANGE_VALUE_5_SEGMENTS ="1";
    public static final String DATE_RANGE_VALUE_6_SEGMENTS ="1";
    public static final String DATE_RANGE_VALUE_7_SEGMENTS ="1";
    public static String EMBEDDED_TRANSACTION_MULTICITY = "FlexPricerComplexItineraryAvailability";
    
    public static final String E_CABIN="E";
    
    public static final String B_CABIN="B";
    
}
