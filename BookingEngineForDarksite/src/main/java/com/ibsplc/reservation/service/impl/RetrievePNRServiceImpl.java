package com.ibsplc.reservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.constants.ServiceParamsKeys;
import com.ibsplc.common.persistence.dao.CommonDao;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.flightsearch.vo.ERetailConfigVO;
import com.ibsplc.framework.exception.model.CustomException;
import com.ibsplc.framework.exception.model.SystemException;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.reservation.service.RetrievePNRService;
import com.ibsplc.reservation.util.ReservationUtil;
import com.ibsplc.reservation.vo.BookingVO;
import com.ibsplc.reservation.vo.CheckInRequestVO;
import com.ibsplc.reservation.vo.LoginRequestVO;
import com.ibsplc.reservation.vo.ManageBookingVO;

@Service("RetrievePNRService")
@ComponentScan(basePackages = "com.ibsplc")

public class RetrievePNRServiceImpl implements RetrievePNRService {
	@Autowired
	private CommonDao commonDao;
//	@Autowired
	//private AmadeusProxy amadeusWSProxy;

	/**
	 * Log4j implementation to log the necessary details
	 */
	private static final Logger LOGGER = Log4j2Logger.create(RetrievePNRServiceImpl.class);

	/**
	 * Method to the booking details from Web service and database
	 * 
	 * @param loginRequestVO
	 * @return bookingVO
	 */
	//TODO
	//public BookingVO getBookingDetails(LoginRequestVO loginRequestVO) throws SystemException, CustomException {
	//	LOGGER.info("inside method getbookingdetails in RetrievePNRServiceImpl");
	//	LOGGER.info("message...." + loginRequestVO.getPnrNumber() + loginRequestVO.getSurName());

		/*String clientSessionId = null;
		if (loginRequestVO.getSessionObj() != null
				&& CommonsUtil.isStringValid(loginRequestVO.getSessionObj().getSessionId())) {
			clientSessionId = loginRequestVO.getSessionObj().getSessionId();
		}
		BookingVO bookingVO = null;
		ManageBookingVO manageBookingVO = null;
		manageBookingVO = createManageBookingVO(loginRequestVO);
		LOGGER.info("Passing to AmadeusProxy params: getPnrNumber:"+manageBookingVO.getPnrNumber()+ ", SureName:"+manageBookingVO.getSurName()+
				" ClientSessionId:"+clientSessionId);
		try {
			// Modify the bookingVO with the data from Retrieve PNR WEBSERVICE
			bookingVO = amadeusWSProxy.retrieve(manageBookingVO.getPnrNumber(), manageBookingVO.getSurName(), null,
					clientSessionId);
			LOGGER.info("Initial bookingVO :" + bookingVO);
			if (bookingVO == null) {
				LOGGER.error("BookingVO is NULL in getBookingDetails:");
				throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
						"An unexpected error occurred while processing your request");
			}
			bookingVO = createBookingVO(manageBookingVO, bookingVO);
		} catch (SystemException e) {
			LOGGER.error("SystemException while getting BookingDetails" + e);
		}
		LOGGER.info("Retrieved fnl booking {" + manageBookingVO.getPnrNumber() + "}" + "-->" + bookingVO);
		return bookingVO;*/
	//}

	/**
	 * Method to create ManageBookingVO using values from loginRequestVO before URL
	 * creation
	 * 
	 * @param loginRequestVO
	 * @return ManageBookingVO
	 */
	public ManageBookingVO createManageBookingVO(LoginRequestVO loginRequestVO) {
		LOGGER.info("inside method createManageBookingVO");
		ManageBookingVO manageBookingVO = new ManageBookingVO();
		manageBookingVO.setPnrNumber(loginRequestVO.getPnrNumber());
		manageBookingVO.setSurName(loginRequestVO.getSurName());
		manageBookingVO.setLanguage(loginRequestVO.getLanguage());
		manageBookingVO.setCountry(loginRequestVO.getCountry());
		manageBookingVO.setProduct(loginRequestVO.getProduct());
		manageBookingVO.setClientSessionId(loginRequestVO.getClientSessionId());
		manageBookingVO.setIsMobileDevice(loginRequestVO.getIsMobileDevice());
		manageBookingVO = getCommonParameters(manageBookingVO);
		LOGGER.info("manageBookingVO.product." + manageBookingVO.getProduct());
		return manageBookingVO;
	}

	/**
	 * Method to create BookingVO using values from manageBookingVO before URL
	 * creation
	 * 
	 * @param manageBookingVO
	 * @param bookingVO
	 * 
	 * @return BookingVO
	 */
	public BookingVO createBookingVO(ManageBookingVO manageBookingVO, BookingVO bookingVO) {

		LOGGER.info("inside method createManageBookingVO");
		bookingVO.setPnrNum(manageBookingVO.getPnrNumber());
		bookingVO.setSurName(manageBookingVO.getSurName());
		bookingVO.setLanguage(manageBookingVO.getLanguage());
		bookingVO.setCountry(manageBookingVO.getCountry());
		bookingVO.setProduct(manageBookingVO.getProduct());
		bookingVO.setClientSessionId(manageBookingVO.getClientSessionId());
		bookingVO.setIsMobileDevice(manageBookingVO.getIsMobileDevice());
		bookingVO.setAmadeusLanguageCode(manageBookingVO.getAmadeusLanguageCode());
		bookingVO.setEmbTransRetrieveAction(manageBookingVO.getEmbTransRetrieveAction());
		bookingVO.setSiteID(manageBookingVO.getSiteID());
		// bookingVO.setAmadeusSiteOfficeID(CommonKeys.DEFAULT_AMADEUS_SITE_OFFICE_ID);
		LOGGER.info("Site_id" + manageBookingVO.getSiteID());
		bookingVO.setEncryptionEnabled(manageBookingVO.getEncryptionEnabled());

		return bookingVO;
	}

	/**
	 * Method to retrieve common parameters from DB and to set in BookingVO
	 * 
	 * @param BookingSelfServcieVO
	 * @return
	 */
	private ManageBookingVO getCommonParameters(ManageBookingVO manageBookingVO) {
		List<ERetailConfigVO> eRetailConfigVOList = null;
		List<ERetailConfigVO> eRetailConfigVOLst = null;
		ERetailConfigVO eRetailConfigvo = null;
		List<String> amadeusLanguageCodeList = null;
		String amadeusLanguageCode = null;
		/*try {
			eRetailConfigVOList = commonDao.getERetailConfigDetails();
		} catch (DataAccessException e) {
			LOGGER.error("Error occured while retrieving ERetail Config details" + e);
		}
		try {
			amadeusLanguageCodeList = commonDao.getAmadeusLanguageCode(manageBookingVO.getLanguage());
		} catch (DataAccessException e) {
			LOGGER.error("Exception occured while retrieving amadues language code.." + e);
		}
		try {
			eRetailConfigVOLst = commonDao.getERetailConfigDetailsWithMasterCode(
					ServiceParamsKeys.ERETAIL_PRODUCT_DELIMITER.concat(manageBookingVO.getProduct()));
		} catch (DataAccessException e) {
			LOGGER.error("Exception occured while retrieving amadues language code.." + e);
		}*/

		if (eRetailConfigVOList != null && !eRetailConfigVOList.isEmpty()) {
			for (ERetailConfigVO eRetailConfigVO : eRetailConfigVOList) {
				if (CommonsUtil.isStringValid(eRetailConfigVO.getParameterCode())) {
					if (eRetailConfigVO.getParameterCode().equals(ServiceParamsKeys.ERETAIL_RETRIEVE_PNR)) {
						manageBookingVO.setEmbTransRetrieveAction(eRetailConfigVO.getParameterValue());
					}

					if (eRetailConfigVO.getParameterCode().equals(ServiceParamsKeys.ERETAIL_ENCRYPTION_ENABLED)) {
						manageBookingVO.setEncryptionEnabled(eRetailConfigVO.getParameterValue());
					}
				}
			}
		}
		if (amadeusLanguageCodeList != null && !amadeusLanguageCodeList.isEmpty()) {
			amadeusLanguageCode = amadeusLanguageCodeList.get(0);
		}
		LOGGER.info("amadeusLangCode from DB for the chosen language " + manageBookingVO.getLanguage() + ":"
				+ amadeusLanguageCode);
		if (CommonsUtil.isStringValid(amadeusLanguageCode)) {
			manageBookingVO.setAmadeusLanguageCode(amadeusLanguageCode);
		}
		if (eRetailConfigVOLst != null && !eRetailConfigVOLst.isEmpty()) {
			eRetailConfigvo = eRetailConfigVOLst.get(0);
		}
		if (eRetailConfigvo != null) {
			manageBookingVO.setSiteID(eRetailConfigvo.getParameterValue());
		}
		LOGGER.info("SiteId :" + manageBookingVO.getSiteID());

		return manageBookingVO;
	}

	/**
	 * Method to create the check-in URL based on the creation Office ID before URL
	 * creation
	 * 
	 * @param checkInRequestVO
	 * @return checkInRedirectURL
	 * @throws SystemException
	 */
	public String getCheckInResponseURL(CheckInRequestVO checkInRequestVO) throws SystemException, CustomException {
		LOGGER.info("inside method getCheckInResponseURL :");
		LOGGER.info("message...." + checkInRequestVO.getSurName());
		String checkInRedirectURL = "";

		String clientSessionId = null;
		if (checkInRequestVO.getSessionObj() != null
				&& CommonsUtil.isStringValid(checkInRequestVO.getSessionObj().getSessionId())) {
			clientSessionId = checkInRequestVO.getSessionObj().getSessionId();
		}
		//TODO
		// Web service call to retrieve the Booking Details from Amadeus
		BookingVO bookingVO = null;
		/*if (CommonsUtil.isStringValid(checkInRequestVO.getFormOfIdentification())) {
			if (checkInRequestVO.getFormOfIdentification().equalsIgnoreCase(CommonKeys.PNR)) {
				bookingVO = amadeusWSProxy.retrieve(checkInRequestVO.getPnrNumber(), checkInRequestVO.getSurName(),
						null, clientSessionId);
				LOGGER.info("ChckIn Initial bookingVO :" + bookingVO);
			} else if (checkInRequestVO.getFormOfIdentification().equalsIgnoreCase(CommonKeys.ETICKET)) {
				bookingVO = amadeusWSProxy.retrieveBooking(checkInRequestVO.getTicketNumber(),
						checkInRequestVO.getSurName(), clientSessionId);
				LOGGER.info("ChckIn eTckt bookingVO :" + bookingVO);
			}
		}*/
		if (bookingVO == null) {
			LOGGER.error("BookingVO is NULL :");
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
					"An unexpected error occurred while processing your request");

		}
		bookingVO.setSurName(checkInRequestVO.getSurName());
		bookingVO.setFormOfIdentification(checkInRequestVO.getFormOfIdentification());
		bookingVO.setPnrNumber(checkInRequestVO.getPnrNumber());
		bookingVO.setTicketNumber(checkInRequestVO.getTicketNumber());
		bookingVO.setIdentifier(checkInRequestVO.getGroupTravel());
		// Validate the creation Office ID to build the check in URL
		if (CommonsUtil.isStringValid(bookingVO.getAmadeusSiteOfficeID())) {
			if (bookingVO.getAmadeusSiteOfficeID().contains(CommonKeys.AIRLINK_AIRLINE_CODE)) {
				checkInRedirectURL = ReservationUtil.createCheckInURLForAirlink(bookingVO);
			} else if (bookingVO.getAmadeusSiteOfficeID().contains(CommonKeys.SA_AIRLINE_CODE)) {
				checkInRedirectURL = ReservationUtil.createCheckInURL(bookingVO);
			}
		}
		return checkInRedirectURL;
	}

}