package com.ibsplc.pushNotification.vo;

import java.util.List;

import com.amadeus.xml.acsfrr_16_1_1a.StatusType;

public class PassengerListVO extends AbstractVO {

	private static final long serialVersionUID = 1L;
	/**
	 * Marketing carrier code
	 */
	private String carrierCode;
	/**
	 * Flight Number
	 */
	private String flightNumber;
	/**
	 * Flight Number Suffix
	 */
	private String flightNumberSuffix;
	/**
	 * Departure Date
	 */
	private String departureDate;
	/**
	 * Arrival Date
	 */
	private String arrivalDate;
	/**
	 * Board Point
	 */
	private String boardPoint;
	/**
	 * Off Point
	 */
	private String offPoint;
	/**
	 * Departure Time
	 */
	private String departureTime;
	/**
	 * Arrival Time
	 */
	private String arrivalTime;
	/**
	 * Leg Cabin information
	 */
	private List<LegCabinInformationVO> legCabinInfo;
	/**
	 * Total count Information per Cabin
	 */
	private List<CabinTotalVO> totalByCabinInfo;
	
	private List<StatusType> listOfFlightStatusIndicators;
	
	private List<CustomerLevelVO> customerLevelList;
	
	/*
	//Added by A-8986 on 22/10/2021 as part of CS0006615 -- start
	private List<CabinTotalInfo> cabinTotalInfoList;
	//Added by A-8986 on 22/10/2021 as part of CS0006615 -- end
	 * 
	 */

	/**
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * @param carrierCode
	 *            the carrierCode to set
	 */
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 *            the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the flightNumberSuffix
	 */
	public String getFlightNumberSuffix() {
		return flightNumberSuffix;
	}

	/**
	 * @param flightNumberSuffix
	 *            the flightNumberSuffix to set
	 */
	public void setFlightNumberSuffix(String flightNumberSuffix) {
		this.flightNumberSuffix = flightNumberSuffix;
	}

	/**
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate
	 *            the departureDate to set
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return the boardPoint
	 */
	public String getBoardPoint() {
		return boardPoint;
	}

	/**
	 * @param boardPoint
	 *            the boardPoint to set
	 */
	public void setBoardPoint(String boardPoint) {
		this.boardPoint = boardPoint;
	}

	/**
	 * @return the offPoint
	 */
	public String getOffPoint() {
		return offPoint;
	}

	/**
	 * @param offPoint
	 *            the offPoint to set
	 */
	public void setOffPoint(String offPoint) {
		this.offPoint = offPoint;
	}

	/**
	 * @return the legCabinInfo
	 */
	public List<LegCabinInformationVO> getLegCabinInfo() {
		return legCabinInfo;
	}

	/**
	 * @param legCabinInfo
	 *            the legCabinInfo to set
	 */
	public void setLegCabinInfo(List<LegCabinInformationVO> legCabinInfo) {
		this.legCabinInfo = legCabinInfo;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime
	 *            the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalTime
	 *            the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the totalByCabinInfo
	 */
	public List<CabinTotalVO> getTotalByCabinInfo() {
		return totalByCabinInfo;
	}

	/**
	 * @param totalByCabinInfo
	 *            the totalByCabinInfo to set
	 */
	public void setTotalByCabinInfo(List<CabinTotalVO> totalByCabinInfo) {
		this.totalByCabinInfo = totalByCabinInfo;
	}

	public List<StatusType> getListOfFlightStatusIndicators() {
		return listOfFlightStatusIndicators;
	}

	public void setListOfFlightStatusIndicators(List<StatusType> listOfFlightStatusIndicators) {
		this.listOfFlightStatusIndicators = listOfFlightStatusIndicators;
	}

	/**
	 * @return the customerLevelList
	 */
	public List<CustomerLevelVO> getCustomerLevelList() {
		return customerLevelList;
	}

	/**
	 * @param customerLevelList the customerLevelList to set
	 */
	public void setCustomerLevelList(List<CustomerLevelVO> customerLevelList) {
		this.customerLevelList = customerLevelList;
	}
	
	
/*
	//Added by A-8986 on 22/10/2021 as part of CS0006615 -- start
	public List<CabinTotalInfo> getCabinTotalInfoList() {
		return cabinTotalInfoList;
	}

	public void setCabinTotalInfoList(List<CabinTotalInfo> cabinTotalInfoList) {
		this.cabinTotalInfoList = cabinTotalInfoList;
	}
	//Added by A-8986 on 22/10/2021 as part of CS0006615 -- end
	 * 
	 */

}
