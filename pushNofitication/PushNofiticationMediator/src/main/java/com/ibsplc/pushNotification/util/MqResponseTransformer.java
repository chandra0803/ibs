package com.ibsplc.pushNotification.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.CollectionUtils;

import com.amadeus.xml.apalrr_17_1_1a.DCSLSTGetPassengerListReply;
import com.amadeus.xml.apalrr_17_1_1a.DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel;
import com.amadeus.xml.apalrr_17_1_1a.DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel;
import com.amadeus.xml.apalrr_17_1_1a.ReservationControlInformationDetailsTypeI;
import com.amadeus.xml.apalrr_17_1_1a.ReservationControlInformationTypeI;
import com.amadeus.xml.apalrr_17_1_1a.TravellerInformationType;
import com.ibsplc.pushNotification.vo.CustomerDataVO;
import com.ibsplc.pushNotification.vo.CustomerLevelVO;
import com.ibsplc.pushNotification.vo.PassengerListVO;
import com.ibsplc.pushNotification.vo.PaxDetailsVO;
import com.ibsplc.pushNotification.vo.ProductLevelVO;
import com.ibsplc.pushNotification.vo.ReservationVO;
import com.ibsplc.pushNotification.vo.SbrRecordLocatorVO;
	

public class MqResponseTransformer {

	/**
	 * Logger
	 */
	private static final Log log = LogFactory.getLog(MqResponseTransformer.class);

	/**
	 * Transforms the Amadeus PassengerListReply to PassengerListVO
	 * 
	 * @param PassengerListVO
	 * @param passengerListReply
	 * 
	 * @return PassengerListVO
	 */
	public static PassengerListVO transformPassengerListReply(DCSLSTGetPassengerListReply passengerListReply) {

		log.info("Transforming the Amadeus BoardedSummaryReply");
		List<CustomerLevelVO> customerList = new ArrayList<CustomerLevelVO>();
		PassengerListVO passengerListVO = new PassengerListVO();
		if (!CollectionUtils.isEmpty(passengerListReply.getFlightDetailsGroup().getCustomerLevel())) {
			for (CustomerLevel customerLevel : passengerListReply.getFlightDetailsGroup().getCustomerLevel()) {
				CustomerLevelVO customerLevelVO = new CustomerLevelVO();

				TravellerInformationType customerData = customerLevel.getCustomerData();
				if (customerData != null) {
					CustomerDataVO customerDataVO = new CustomerDataVO();
					PaxDetailsVO paxDetailsVO = new PaxDetailsVO();
					if (customerData.getPaxDetails() != null) {
						paxDetailsVO.setSurname(customerData.getPaxDetails().getSurname());
						paxDetailsVO.setType(customerData.getPaxDetails().getType());
						customerDataVO.setPaxDetails(paxDetailsVO);
					}
					customerLevelVO.setCustomerData(customerDataVO);
				}
				ProductLevel productLevel = customerLevel.getProductLevel();
				if (productLevel != null) {
					ProductLevelVO productLevelVO = new ProductLevelVO();
					SbrRecordLocatorVO sbrRecordLocatorVO = new SbrRecordLocatorVO();
					ReservationControlInformationTypeI sbrRecordLocator = productLevel.getSbrRecordLocator();
					if (sbrRecordLocator != null) {
						ReservationControlInformationDetailsTypeI reservation = sbrRecordLocator.getReservation();
						if (reservation != null) {
							ReservationVO reservationVO = new ReservationVO();
							reservationVO.setControlNumber(reservation.getControlNumber());
							sbrRecordLocatorVO.setReservation(reservationVO);
							productLevelVO.setSbrRecordLocator(sbrRecordLocatorVO);
						}
					}
					customerLevelVO.setProductLevel(productLevelVO);
				}
				customerList.add(customerLevelVO);

			}
			passengerListVO.setCustomerLevelList(customerList);
		}
		return passengerListVO;
	}
}
