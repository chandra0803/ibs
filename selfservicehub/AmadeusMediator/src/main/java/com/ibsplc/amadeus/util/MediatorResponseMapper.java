package com.ibsplc.amadeus.util;

import java.util.ArrayList;
import java.util.List;

import com.ibsplc.amadeus.vo.EMDDetailsVO;
import com.ibsplc.amadeus.vo.response.PNRRetrieveReponseVO;
import com.ibsplc.amadeus.vo.PassengerDetailsVO;

public class MediatorResponseMapper {

	public static PNRRetrieveReponseVO createPNRRetrieveResponse() {
		PNRRetrieveReponseVO pnrRetrieveReponseVO = new PNRRetrieveReponseVO();

		pnrRetrieveReponseVO.setCarrierCode("4Z");
		pnrRetrieveReponseVO.setFlightNumber("4Z0092");
		pnrRetrieveReponseVO.setArrivalDateandTime("2018-10-20");
		pnrRetrieveReponseVO.setArrivalTerminal("T1");
		pnrRetrieveReponseVO.setDepartureDateandTime("2018-10-20");
		pnrRetrieveReponseVO.setDepartureTerminal("T3");
		pnrRetrieveReponseVO.setOriginAirportCode("TRV");
		pnrRetrieveReponseVO.setOriginAirportDescription("TRV");
		pnrRetrieveReponseVO.setDestinationAirportCode("BLR");
		pnrRetrieveReponseVO.setDestinationAirportDescription("Bangalore");
		pnrRetrieveReponseVO.setClassOfTravel("E");
		pnrRetrieveReponseVO.setCreationOfficeId("A100");

		pnrRetrieveReponseVO.setEmailAddress("test@test.com");
		pnrRetrieveReponseVO.setEmailAddressReferenceNumber("121212");
		pnrRetrieveReponseVO.setHomePhoneNumber("00919729172");
		pnrRetrieveReponseVO.setHomePhoneReferencenumber("HP18201");
		pnrRetrieveReponseVO.setMobilePhoneNumber("90281278192");
		pnrRetrieveReponseVO.setMobilePhoneReferenceNumber("M02801281");
		pnrRetrieveReponseVO.setEmergencyPhoneNumber("020819297979");
		pnrRetrieveReponseVO.setEmergencyPhoneContactReferenceNumber("EP9208038");

		List<PassengerDetailsVO> passengerDetails = new ArrayList<PassengerDetailsVO>();
		PassengerDetailsVO passengerDetailsVO = new PassengerDetailsVO();
		passengerDetailsVO.setPassengerFirstName("Mike");
		passengerDetailsVO.setPassengerLineNumber("5");
		passengerDetailsVO.setPassengerReferenceNumber("P10280182");
		passengerDetailsVO.setPassengerReferenceQualifier("A");
		passengerDetailsVO.setPassengerSurname("John");
		passengerDetailsVO.setPassengerType("A");
		passengerDetailsVO.setDateofBirth("1998-10-20");
		
		passengerDetails.add(passengerDetailsVO);
		
		pnrRetrieveReponseVO.setPassengerDetails(passengerDetails);

		
		List<EMDDetailsVO> emdDetails = new ArrayList<EMDDetailsVO>();
		EMDDetailsVO emdDetailsVO = new EMDDetailsVO();
		emdDetailsVO.setEmdNumber("E21209210");
		emdDetailsVO.setServiceAmount("200");
		emdDetailsVO.setServiceCurrency("AUD");
		emdDetailsVO.setServiceType("S");
		emdDetails.add(emdDetailsVO);
		pnrRetrieveReponseVO.setEmdDetails(emdDetails);
		
		pnrRetrieveReponseVO.setSegmentLineNumber("3323232");
		pnrRetrieveReponseVO.setSegmentReferenceNumber("3232323");
		pnrRetrieveReponseVO.setSegmentStatus("C");
		pnrRetrieveReponseVO.setSsrPassengerReferenceNumber("SSR323232");
		pnrRetrieveReponseVO.setSsrReferenceNumber("212121");
		pnrRetrieveReponseVO.setSsrSegmentReferenceNumber("1112121");
		pnrRetrieveReponseVO.setSsrValue("1");
		pnrRetrieveReponseVO.setSsrQualifierNumber("SSR203203");
		pnrRetrieveReponseVO.setTicketDeliveryType("P");
		pnrRetrieveReponseVO.setEquipmentType("type");
		return pnrRetrieveReponseVO;
	}

}
