/**
 * 
 */
package com.ibsplc.viewmytrips.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.bookingEngine.bookingenginejunittest.BookingEngineJunitTest;
import com.ibsplc.common.persistence.dao.CommonDao;
import com.ibsplc.flightsearch.vo.CitiesVO;

/**
 * @author a-7352
 *
 */
public class ViewMyTripsMapperTest extends BookingEngineJunitTest {

	//@InjectMocks
	//private ViewMyTripsMapper viewMyTripsMapper;

	@Mock
	private CommonDao commonDao;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		super.setup();

	}

	//private static final String REQUEST_TIME_UTC_DATE_FORMAT = "dd-MM-yyyy HH:mm";
	private static final String SESSION_ID = "testSession";
	private static final String PNR = "NEBLS2";
	private static final String SUR_NAME = "ISMAIL";
	private static final String EMAIL_ID = "test@test.com";

	/*@Test
	public void createViewTripResponseWithPnrTripDataFromDatabaseTest() {
		//String requestTimeUTC = DateUtilities.getDateInFormat(REQUEST_TIME_UTC_DATE_FORMAT, Calendar.getInstance());
		ViewTripServiceImpl viewMyTripsService = new ViewTripServiceImpl();
		ViewTripServiceImplTest test = new ViewTripServiceImplTest();
		List<CitiesVO> citiesVOList = getCitiesVOList();
		
		Mockito.when(commonDao.getAirportDescription(Mockito.anyString(), Mockito.anyString())).thenReturn(citiesVOList);
		Map<String, PnrTripDetailsResponseVO> resultMap = viewMyTripsMapper.createViewTripResponseWithPnrTripDataFromDatabase(
				viewMyTripsService.getViewTripsPnrMainTableEntity(test.getBookingVO(), PNR, SUR_NAME, EMAIL_ID,
						CommonKeys.EMPTY_STRING, new Date()),
				SESSION_ID, CommonKeys.EN);
		
		assertNotNull(resultMap);
		assertTrue(resultMap.containsKey(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertNotNull(resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE));
		assertEquals(CommonKeys.SUCCESS_RESULT_CODE, resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE).getResultCode());
		assertEquals(PNR, resultMap.get(ViewMyTripsKeys.VIEW_TRIPS_RESPONSE).getPnrTripDetails().getPnrNumber());
		
	}*/

	private List<CitiesVO> getCitiesVOList() {
		List<CitiesVO> citiesVOList = new ArrayList<>();
		CitiesVO city = new CitiesVO();
		city.setCityDesciption("Johannesberg");
		citiesVOList.add(city);
		return citiesVOList;
	}

}
