/**
 * 
 */
package com.ibsplc.viewmytrips.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.bookingEngine.bookingenginejunittest.BookingEngineJunitTest;
import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.vo.ItineraryVO;
import com.ibsplc.common.vo.PaxVO;
import com.ibsplc.common.vo.SSRVO;
import com.ibsplc.framework.exception.model.SystemException;
import com.ibsplc.framework.util.date.DateUtilities;
import com.ibsplc.framework.vo.CommonResponseVO;
import com.ibsplc.reservation.vo.BookingVO;

/**
 * @author a-7352
 *
 */
public class ViewTripServiceImplTest extends BookingEngineJunitTest {

	/*@Mock
	private ViewTripsDao viewTripsDao;

	@Mock
	private ViewMyTripsMapper viewMyTripsMapper;

	@Mock
	private AmadeusProxy amadeusWSProxy;

	@InjectMocks
	private ViewTripServiceImpl viewTripService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		super.setup();

	}

	private static final String REQUEST_TIME_UTC_DATE_FORMAT = "dd-MM-yyyy HH:mm";
	private static final String SESSION_ID = "testSession";
	private static final String PNR = "NEBLS2";
	private static final String SUR_NAME = "ISMAIL";
	private static final String EMAIL_ID = "test@test.com";
	
	@Test
	public void viewTripDetailsServiceTest6() throws SystemException {
		ViewTripDetailsRequestVO viewTripDetailsRequestVO = getViewTripDetailsRequestVO();
		viewTripDetailsRequestVO.setIsPastTrip(false);
		ViewTripsPnrMainTableEntity viewTripsPnrMainTableEntity = getViewTripsPnrMainTableEntity();
		BookingVO bookingVO = getBookingVO();
		bookingVO.setPassengerDetails(Arrays.asList(getPax1()));
		ViewMyTripsMapper mapper1 = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap1 = mapper1.createViewTripResponseWithPnrTripDataFromWebService(
				bookingVO, SESSION_ID, CommonKeys.EN, CommonKeys.EMPTY_STRING);

		Mockito.when(viewTripsDao.getPnrDetailEntity(Mockito.anyString())).thenReturn(viewTripsPnrMainTableEntity);
		Mockito.when(amadeusWSProxy.retrieve(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(),
				Mockito.anyString())).thenReturn(bookingVO);
		Mockito.when(viewTripsDao.deletePnrData1(Mockito.anyString(), Mockito.anyLong())).thenReturn(true);
		Mockito.doNothing().when(viewTripsDao).saveViewTripsPnrDetails(Mockito.any(ViewTripsPnrMainTableEntity.class));
		Mockito.when(viewMyTripsMapper.createViewTripResponseWithPnrTripDataFromWebService(Mockito.any(BookingVO.class),
				Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenReturn(expectedMap1);

		Map<String, PnrTripDetailsResponseVO> resultMap1 = viewTripService
				.viewTripDetailsService(viewTripDetailsRequestVO, SESSION_ID);

		assertNotNull(resultMap1);
		assertTrue(resultMap1.containsKey(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertNotNull(resultMap1.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertEquals(CommonKeys.SUCCESS_RESULT_CODE,
				resultMap1.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE).getResultCode());

	}

	@Test
	public void viewTripDetailsServiceTest5() throws SystemException {
		ViewTripDetailsRequestVO viewTripDetailsRequestVO = getViewTripDetailsRequestVO();
		viewTripDetailsRequestVO.setIsPastTrip(false);
		ViewTripsPnrMainTableEntity viewTripsPnrMainTableEntity = getViewTripsPnrMainTableEntity();
		BookingVO bookingVO = new BookingVO();
		bookingVO.setTicketed(false);
		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap = mapper
				.createPNRNotTicketedErrorResponse(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE, SESSION_ID);

		Mockito.when(viewTripsDao.getPnrDetailEntity(Mockito.anyString())).thenReturn(viewTripsPnrMainTableEntity);
		Mockito.when(amadeusWSProxy.retrieve(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(),
				Mockito.anyString())).thenReturn(bookingVO);
		Mockito.when(viewMyTripsMapper.createPNRNotTicketedErrorResponse(Mockito.anyString(), Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, PnrTripDetailsResponseVO> resultMap = viewTripService
				.viewTripDetailsService(viewTripDetailsRequestVO, SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertEquals(CommonKeys.ERROR_RESULT_CODE, resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE).getResultCode());
	}

	@Test
	public void viewTripDetailsServiceTest4() throws SystemException {
		ViewTripDetailsRequestVO viewTripDetailsRequestVO = getViewTripDetailsRequestVO();
		viewTripDetailsRequestVO.setIsPastTrip(false);
		ViewTripsPnrMainTableEntity viewTripsPnrMainTableEntity = getViewTripsPnrMainTableEntity();
		BookingVO bookingVO = null;
		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap = mapper
				.createViewTripsNoTripDetailsErrorResponse(SESSION_ID);

		Mockito.when(viewTripsDao.getPnrDetailEntity(Mockito.anyString())).thenReturn(viewTripsPnrMainTableEntity);
		Mockito.when(amadeusWSProxy.retrieve(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(),
				Mockito.anyString())).thenReturn(bookingVO);
		Mockito.when(viewMyTripsMapper.createViewTripsNoTripDetailsErrorResponse(Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, PnrTripDetailsResponseVO> resultMap = viewTripService
				.viewTripDetailsService(viewTripDetailsRequestVO, SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertEquals(CommonKeys.ERROR_RESULT_CODE, resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE).getResultCode());
	}

	@Test
	public void viewTripDetailsServiceTest3() throws SystemException {
		ViewTripDetailsRequestVO viewTripDetailsRequestVO = getViewTripDetailsRequestVO();
		viewTripDetailsRequestVO.setIsPastTrip(false);
		ViewTripsPnrMainTableEntity viewTripsPnrMainTableEntity = getViewTripsPnrMainTableEntity();
		BookingVO bookingVO = getBookingVO();
		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap = mapper.createViewTripResponseWithPnrTripDataFromWebService(
				bookingVO, SESSION_ID, CommonKeys.EN, CommonKeys.EMPTY_STRING);

		Mockito.when(viewTripsDao.getPnrDetailEntity(Mockito.anyString())).thenReturn(viewTripsPnrMainTableEntity);
		Mockito.when(amadeusWSProxy.retrieve(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(),
				Mockito.anyString())).thenReturn(bookingVO);
		Mockito.when(viewTripsDao.deletePnrData1(Mockito.anyString(), Mockito.anyLong())).thenReturn(true);
		Mockito.doNothing().when(viewTripsDao).saveViewTripsPnrDetails(Mockito.any(ViewTripsPnrMainTableEntity.class));
		Mockito.when(viewMyTripsMapper.createViewTripResponseWithPnrTripDataFromWebService(Mockito.any(BookingVO.class),
				Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenReturn(expectedMap);

		Map<String, PnrTripDetailsResponseVO> resultMap = viewTripService
				.viewTripDetailsService(viewTripDetailsRequestVO, SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertEquals(CommonKeys.SUCCESS_RESULT_CODE,
				resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE).getResultCode());

	}

	@Test
	public void viewTripDetailsServiceTest2() {

		ViewTripDetailsRequestVO viewTripDetailsRequestVO = getViewTripDetailsRequestVO();

		ViewTripsPnrMainTableEntity viewTripsPnrMainTableEntity = getViewTripsPnrMainTableEntity();

		Map<String, PnrTripDetailsResponseVO> expectedMap = null;
		Mockito.when(viewTripsDao.getPnrDetailEntity(Mockito.anyString())).thenReturn(viewTripsPnrMainTableEntity);
		Mockito.when(viewMyTripsMapper.createViewTripResponseWithPnrTripDataFromDatabase(
				Mockito.any(ViewTripsPnrMainTableEntity.class), Mockito.anyString(), Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, PnrTripDetailsResponseVO> resultMap = viewTripService
				.viewTripDetailsService(viewTripDetailsRequestVO, SESSION_ID);

		assertNull(resultMap);
	}

	@Test
	public void viewTripDetailsServiceTest() {
		ViewTripDetailsRequestVO viewTripDetailsRequestVO = getViewTripDetailsRequestVO();

		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap = mapper
				.createViewTripsNoTripDetailsErrorResponse(SESSION_ID);
		Mockito.doThrow(Exception.class).when(viewTripsDao).getPnrDetailEntity(Mockito.anyString());
		Mockito.when(viewMyTripsMapper.createViewTripsNoTripDetailsErrorResponse(Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, PnrTripDetailsResponseVO> resultMap = viewTripService
				.viewTripDetailsService(viewTripDetailsRequestVO, SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertEquals(CommonKeys.ERROR_RESULT_CODE, resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE).getResultCode());

	}

	private ViewTripDetailsRequestVO getViewTripDetailsRequestVO() {
		ViewTripDetailsRequestVO viewTripDetailsRequestVO = new ViewTripDetailsRequestVO();
		viewTripDetailsRequestVO.setPnrNum(PNR);
		viewTripDetailsRequestVO.setSurName(SUR_NAME);
		viewTripDetailsRequestVO.setLanguage(CommonKeys.EN);
		viewTripDetailsRequestVO.setIsPastTrip(true);
		return viewTripDetailsRequestVO;
	}

	@Test
	public void savePNRDetailsTest5() throws SystemException {
		String requestTimeUTC = DateUtilities.getDateInFormat(REQUEST_TIME_UTC_DATE_FORMAT, Calendar.getInstance());
		BookingVO bookingVO = new BookingVO();
		bookingVO.setTicketChanged(false);
		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap = mapper
				.createPNRNotTicketedErrorResponse(ViewMyTripsKeys.ADD_TRIPS_RESPONSE, SESSION_ID);

		Mockito.when(viewTripsDao.getCountOfPnrData(Mockito.anyString())).thenReturn(0);
		Mockito.when(amadeusWSProxy.retrieve(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(),
				Mockito.anyString())).thenReturn(bookingVO);

		Mockito.when(viewMyTripsMapper.createPNRNotTicketedErrorResponse(Mockito.anyString(), Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, PnrTripDetailsResponseVO> resultMap = viewTripService
				.savePNRDetails(getRequestVO(EMAIL_ID, PNR, SUR_NAME, requestTimeUTC), SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertEquals(CommonKeys.ERROR_RESULT_CODE, resultMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE).getResultCode());
	}

	@Test
	public void savePNRDetailsTest4() throws SystemException {
		String requestTimeUTC = DateUtilities.getDateInFormat(REQUEST_TIME_UTC_DATE_FORMAT, Calendar.getInstance());
		BookingVO bookingVO = getBookingVO();
		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap = mapper.createAddPNRErrorResponse(SESSION_ID);

		Mockito.when(viewTripsDao.getCountOfPnrData(Mockito.anyString())).thenReturn(0);
		Mockito.when(amadeusWSProxy.retrieve(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(),
				Mockito.anyString())).thenReturn(bookingVO);
		Mockito.doThrow(Exception.class).when(viewTripsDao)
				.saveViewTripsPnrDetails(Mockito.any(ViewTripsPnrMainTableEntity.class));

		Mockito.when(viewMyTripsMapper.createAddPNRErrorResponse(Mockito.anyString())).thenReturn(expectedMap);

		Map<String, PnrTripDetailsResponseVO> resultMap = viewTripService
				.savePNRDetails(getRequestVO(EMAIL_ID, PNR, SUR_NAME, requestTimeUTC), SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertEquals(CommonKeys.ERROR_RESULT_CODE, resultMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE).getResultCode());
	}

	@Test
	public void savePNRDetailsTest3() throws SystemException {
		String requestTimeUTC = DateUtilities.getDateInFormat(REQUEST_TIME_UTC_DATE_FORMAT, Calendar.getInstance());
		BookingVO bookingVO = getBookingVO();
		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap = mapper
				.createPNRDataAddedSuccessfullyResponseWithPnrtripData(bookingVO, SESSION_ID, CommonKeys.EN,
						CommonKeys.EMPTY_STRING);

		Mockito.when(viewTripsDao.getCountOfPnrData(Mockito.anyString())).thenReturn(0);
		Mockito.when(amadeusWSProxy.retrieve(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(),
				Mockito.anyString())).thenReturn(bookingVO);
		Mockito.doNothing().when(viewTripsDao).saveViewTripsPnrDetails(Mockito.any(ViewTripsPnrMainTableEntity.class));

		Mockito.when(viewMyTripsMapper.createPNRDataAddedSuccessfullyResponseWithPnrtripData(
				Mockito.any(BookingVO.class), Mockito.anyString(), Mockito.anyString(), Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, PnrTripDetailsResponseVO> resultMap = viewTripService
				.savePNRDetails(getRequestVO(EMAIL_ID, PNR, SUR_NAME, requestTimeUTC), SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertEquals(CommonKeys.SUCCESS_RESULT_CODE, resultMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE).getResultCode());
	}

	@Test
	public void savePNRDetailsTest2() throws SystemException {
		String requestTimeUTC = DateUtilities.getDateInFormat(REQUEST_TIME_UTC_DATE_FORMAT, Calendar.getInstance());

		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap = mapper.createAddTripsNoBookingVOErrorResponse(SESSION_ID);
		// BookingVO bookingVO = null;

		Mockito.doThrow(Exception.class).when(viewTripsDao).getCountOfPnrData(Mockito.anyString());
		Mockito.doThrow(SystemException.class).when(amadeusWSProxy).retrieve(Mockito.anyString(), Mockito.anyString(),
				Mockito.anyString(), Mockito.anyString());
		
		 * Mockito.when(amadeusWSProxy.retrieve(Mockito.anyString(),
		 * Mockito.anyString(), Mockito.anyString(),
		 * Mockito.anyString())).thenReturn(bookingVO);
		 
		Mockito.when(viewMyTripsMapper.createAddTripsNoBookingVOErrorResponse(Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, PnrTripDetailsResponseVO> actualMap = viewTripService
				.savePNRDetails(getRequestVO(EMAIL_ID, PNR, SUR_NAME, requestTimeUTC), SESSION_ID);
		assertNotNull(actualMap);
		assertTrue(actualMap.containsKey(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertNotNull(actualMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertEquals(CommonKeys.ERROR_RESULT_CODE, actualMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE).getResultCode());
	}

	@Test
	public void savePNRDetailsTest1() {
		String requestTimeUTC = DateUtilities.getDateInFormat(REQUEST_TIME_UTC_DATE_FORMAT, Calendar.getInstance());

		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, PnrTripDetailsResponseVO> expectedMap = mapper.createPNRDataAlreadyExistsErrorResponse(SESSION_ID);
		Mockito.when(viewTripsDao.getCountOfPnrData(Mockito.anyString())).thenReturn(1);
		Mockito.when(viewMyTripsMapper.createPNRDataAlreadyExistsErrorResponse(Mockito.anyString()))
				.thenReturn(expectedMap);
		Map<String, PnrTripDetailsResponseVO> actualMap = viewTripService
				.savePNRDetails(getRequestVO(EMAIL_ID, PNR, SUR_NAME, requestTimeUTC), SESSION_ID);

		assertNotNull(actualMap);
		assertTrue(actualMap.containsKey(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertNotNull(actualMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE));
		assertEquals(CommonKeys.ERROR_RESULT_CODE, actualMap.get(ViewMyTripsKeys.ADD_TRIPS_RESPONSE).getResultCode());
	}

	@Test
	public void deleteTripDetailsTest() {
		String requestTimeUTC = DateUtilities.getDateInFormat(REQUEST_TIME_UTC_DATE_FORMAT, Calendar.getInstance());

		ViewTripsPnrMainTableEntity entity = getViewTripsPnrMainTableEntity();

		ViewMyTripsMapper mapper = new ViewMyTripsMapper();

		Map<String, CommonResponseVO> expectedMap = mapper.createDeleteTripDetailsSuccessResponse(SESSION_ID);

		Mockito.when(viewTripsDao.getPnrDetailEntity(Mockito.anyString())).thenReturn(entity);
		Mockito.when(viewTripsDao.deletePnrData1(Mockito.anyString(), Mockito.anyLong())).thenReturn(true);
		Mockito.when(viewMyTripsMapper.createDeleteTripDetailsSuccessResponse(Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, CommonResponseVO> resultMap = viewTripService
				.deleteTripDetails(getRequestVO(EMAIL_ID, PNR, SUR_NAME, requestTimeUTC), SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE));
		assertEquals(CommonKeys.SUCCESS_RESULT_CODE,
				resultMap.get(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE).getResultCode());
		assertEquals(SESSION_ID, resultMap.get(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE).getSessionId());
	}

	@Test
	public void deleteTripDetailsTest2() {
		String requestTimeUTC = DateUtilities.getDateInFormat(REQUEST_TIME_UTC_DATE_FORMAT, Calendar.getInstance());

		ViewMyTripsMapper mapper = new ViewMyTripsMapper();

		Map<String, CommonResponseVO> expectedMap = mapper.createDeleteTripDetailsErrorResponse(SESSION_ID);
		Mockito.doThrow(Exception.class).when(viewTripsDao).getPnrDetailEntity(Mockito.anyString());
		Mockito.when(viewMyTripsMapper.createDeleteTripDetailsErrorResponse(Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, CommonResponseVO> resultMap = viewTripService
				.deleteTripDetails(getRequestVO(EMAIL_ID, PNR, SUR_NAME, requestTimeUTC), SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE));
		assertEquals(CommonKeys.ERROR_RESULT_CODE,
				resultMap.get(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE).getResultCode());
		assertEquals(SESSION_ID, resultMap.get(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE).getSessionId());
	}

	@Test
	public void deletetripDetailsTest3() {
		String requestTimeUTC = DateUtilities.getDateInFormat(REQUEST_TIME_UTC_DATE_FORMAT, Calendar.getInstance());
		ViewTripsPnrMainTableEntity entity = getViewTripsPnrMainTableEntity();
		ViewMyTripsMapper mapper = new ViewMyTripsMapper();
		Map<String, CommonResponseVO> expectedMap = mapper.createDeleteTripDetailsErrorResponse(SESSION_ID);

		Mockito.when(viewTripsDao.getPnrDetailEntity(Mockito.anyString())).thenReturn(entity);
		Mockito.doThrow(Exception.class).when(viewTripsDao).deletePnrData1(Mockito.anyString(), Mockito.anyLong());
		Mockito.when(viewMyTripsMapper.createDeleteTripDetailsErrorResponse(Mockito.anyString()))
				.thenReturn(expectedMap);

		Map<String, CommonResponseVO> resultMap = viewTripService
				.deleteTripDetails(getRequestVO(EMAIL_ID, PNR, SUR_NAME, requestTimeUTC), SESSION_ID);

		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE));
		assertEquals(CommonKeys.ERROR_RESULT_CODE,
				resultMap.get(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE).getResultCode());
		assertEquals(SESSION_ID, resultMap.get(ViewMyTripsKeys.DELETE_TRIPS_RESPONSE).getSessionId());

	}

	private ViewTripsPnrMainTableEntity getViewTripsPnrMainTableEntity() {

		ViewTripServiceImpl service = new ViewTripServiceImpl();
		ViewTripsPnrMainTableEntity entity = service.getViewTripsPnrMainTableEntity(getBookingVO(), PNR, SUR_NAME,
				EMAIL_ID, CommonKeys.EMPTY_STRING, new Date());
		entity.setPnrSeqNo(1);
		return entity;
	}

	private SavePNRRequestVO getRequestVO(String emailId, String pnrNum, String surName, String requestTimeUTC) {
		SavePNRRequestVO tripDetailsRequestVO = new SavePNRRequestVO();
		tripDetailsRequestVO.setEmailID(emailId);
		tripDetailsRequestVO.setPnrNum(pnrNum);
		tripDetailsRequestVO.setSurName(surName);
		tripDetailsRequestVO.setRequestTimeUTC(requestTimeUTC);
		tripDetailsRequestVO.setLanguage(CommonKeys.EN);
		return tripDetailsRequestVO;
	}

	public BookingVO getBookingVO() {
		BookingVO bookingVO = new BookingVO();
		bookingVO.setPnrNumber(PNR);
		bookingVO.setPnrNum(PNR);
		bookingVO.setSurName(SUR_NAME);
		bookingVO.setEmailId(EMAIL_ID);
		bookingVO.setItineraryDetails(getItineraryList());
		bookingVO.setPassengerDetails(getPassengerDetails());
		bookingVO.setTicketChanged(true);
		bookingVO.setTicketed(true);

		return bookingVO;
	}

	private List<PaxVO> getPassengerDetails() {
		List<PaxVO> passengerList = new ArrayList<PaxVO>();
		
		PaxVO pax2 = new PaxVO();
		pax2.setFirstName("SAHAF MR");
		pax2.setSurName("ISMAIL");
		pax2.setPaxType("ADT");
		pax2.seteTicketNumber("749-2400001169");
		List<String> emdNumbers2 = new ArrayList<String>();
		emdNumbers2.add("749-4550001101");
		pax2.setEmdNumbers(emdNumbers2);
		pax2.setReferenceNumber("3");

		PaxVO pax3 = new PaxVO();
		pax3.setFirstName("BAZIL MR");
		pax3.setSurName("SHEREEF");
		pax3.setPaxType("CHD");
		pax3.seteTicketNumber("749-2400001170");
		List<String> emdNumbers3 = new ArrayList<String>();
		emdNumbers3.add("749-4550001102");
		emdNumbers3.add("749-4550001103");
		pax3.setEmdNumbers(emdNumbers3);
		pax3.setDateOfBirth("27-10-2015");
		pax3.setReferenceNumber("4");

		passengerList.add(getPax1());
		passengerList.add(pax2);
		passengerList.add(pax3);
		return passengerList;
	}

	private PaxVO getPax1() {
		PaxVO pax1 = new PaxVO();
		pax1.setFirstName("ABIN MR");
		pax1.setSurName("ISMAIL");
		pax1.setPaxType("ADT");
		pax1.seteTicketNumber("749-2400001168");
		List<String> emdNumbers1 = new ArrayList<String>();
		emdNumbers1.add("749-4550001099");
		emdNumbers1.add("749-4550001100");
		pax1.setEmdNumbers(emdNumbers1);
		pax1.setReferenceNumber("2");
		return pax1;
	}

	private List<ItineraryVO> getItineraryList() {
		List<ItineraryVO> itinerarylist = new ArrayList<ItineraryVO>();

		// 1st itinerary
		ItineraryVO itinerary1 = new ItineraryVO();
		itinerary1.setOrigin("JNB");
		itinerary1.setOriginDescription("Johannesberg");
		itinerary1.setDestination("MQP");
		itinerary1.setDestinationDescription("Nelspruit");
		itinerary1.setCarrierCode("4Z");
		itinerary1.setFlightNumber("800");
		itinerary1.setDepartureDate("20-OCT-2018 07:00");
		itinerary1.setArrivalDate("20-OCT-2018 07:50");
		itinerary1.setClassOfTravel("V");
		itinerary1.setClassDescription("Economy Plus");

		List<SSRVO> seatingInformationList1 = new ArrayList<SSRVO>();
		SSRVO ssrVO11 = new SSRVO();
		ssrVO11.setSsrValue("04C");
		ssrVO11.setReferenceNumber("2");

		SSRVO ssrVO12 = new SSRVO();
		ssrVO12.setSsrValue("04B");
		ssrVO12.setReferenceNumber("3");

		SSRVO ssrVO13 = new SSRVO();
		ssrVO13.setSsrValue("03B");
		ssrVO13.setReferenceNumber("4");

		seatingInformationList1.add(ssrVO11);
		seatingInformationList1.add(ssrVO12);
		seatingInformationList1.add(ssrVO13);

		itinerary1.setSeatingInformation(seatingInformationList1);

		// 2nd itinerary
		ItineraryVO itinerary2 = new ItineraryVO();
		itinerary2.setOrigin("MQP");
		itinerary2.setOriginDescription("Nelspruit");
		itinerary2.setDestination("JNB");
		itinerary2.setDestinationDescription("Johannesberg");
		itinerary2.setCarrierCode("4Z");
		itinerary2.setFlightNumber("801");
		itinerary2.setDepartureDate("31-OCT-2018 08:25");
		itinerary2.setArrivalDate("31-OCT-2018 09:15");
		itinerary2.setClassOfTravel("V");
		itinerary2.setClassDescription("Economy Plus");

		List<SSRVO> seatingInformationList2 = new ArrayList<SSRVO>();
		SSRVO ssrVO21 = new SSRVO();
		ssrVO21.setSsrValue("05C");
		ssrVO21.setReferenceNumber("2");

		SSRVO ssrVO22 = new SSRVO();
		ssrVO22.setSsrValue("06C");
		ssrVO22.setReferenceNumber("3");

		SSRVO ssrVO23 = new SSRVO();
		ssrVO23.setSsrValue("06B");
		ssrVO23.setReferenceNumber("4");

		seatingInformationList2.add(ssrVO21);
		seatingInformationList2.add(ssrVO22);
		seatingInformationList2.add(ssrVO23);

		itinerary2.setSeatingInformation(seatingInformationList2);

		// adding itineraries to list
		itinerarylist.add(itinerary1);
		itinerarylist.add(itinerary2);
		return itinerarylist;
	}
*/
}
