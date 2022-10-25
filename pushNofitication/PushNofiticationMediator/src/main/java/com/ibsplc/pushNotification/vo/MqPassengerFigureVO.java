package com.ibsplc.pushNotification.vo;

import java.util.List;

public class MqPassengerFigureVO extends AbstractVO {

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
	/*
	 * Terminal and gate information
	 */
	
	private List<TerminalGateInformationVO> terminalGateInformationList;
	/**
	 * @return the carrierCode
	 */

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightNumberSuffix() {
		return flightNumberSuffix;
	}

	public void setFlightNumberSuffix(String flightNumberSuffix) {
		this.flightNumberSuffix = flightNumberSuffix;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getBoardPoint() {
		return boardPoint;
	}

	public void setBoardPoint(String boardPoint) {
		this.boardPoint = boardPoint;
	}

	public String getOffPoint() {
		return offPoint;
	}

	public void setOffPoint(String offPoint) {
		this.offPoint = offPoint;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public List<TerminalGateInformationVO> getTerminalGateInformationList() {
		return terminalGateInformationList;
	}

	public void setTerminalGateInformationList(List<TerminalGateInformationVO> terminalGateInformationList) {
		this.terminalGateInformationList = terminalGateInformationList;
	}
}
