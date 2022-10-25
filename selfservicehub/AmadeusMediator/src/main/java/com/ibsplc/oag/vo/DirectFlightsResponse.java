package com.ibsplc.oag.vo;

import java.io.Serializable;

public class DirectFlightsResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String flightNumber;
	private String frequency;
	private String departureDate;
	private String arrivalDate;
	private String departureTime;
	private String arrivalTime;
	private String arrivalDayOffset;
	private String airline;
	private String flightDuration;
	private String aircraftType;
	private String flightDistance;
	private String depPortCode;
	private String depPortName;
	private String arrPortCode;
	private String arrPortName;
	private String terminal;
	private String effectiveFrom;
	private String effectiveTo;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
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
	public String getArrivalDayOffset() {
		return arrivalDayOffset;
	}
	public void setArrivalDayOffset(String arrivalDayOffset) {
		this.arrivalDayOffset = arrivalDayOffset;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	public String getAircraftType() {
		return aircraftType;
	}
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	public String getFlightDistance() {
		return flightDistance;
	}
	public void setFlightDistance(String flightDistance) {
		this.flightDistance = flightDistance;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
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
	public String getDepPortCode() {
		return depPortCode;
	}
	public void setDepPortCode(String depPortCode) {
		this.depPortCode = depPortCode;
	}
	public String getDepPortName() {
		return depPortName;
	}
	public void setDepPortName(String depPortName) {
		this.depPortName = depPortName;
	}
	public String getArrPortCode() {
		return arrPortCode;
	}
	public void setArrPortCode(String arrPortCode) {
		this.arrPortCode = arrPortCode;
	}
	public String getArrPortName() {
		return arrPortName;
	}
	public void setArrPortName(String arrPortName) {
		this.arrPortName = arrPortName;
	}
	public String getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(String effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	public String getEffectiveTo() {
		return effectiveTo;
	}
	public void setEffectiveTo(String effectiveTo) {
		this.effectiveTo = effectiveTo;
	}
	
	@Override
	public String toString() {
		return "DirectFlightsResponse [flightNumber=" + flightNumber + ", frequency=" + frequency + ", departureDate="
				+ departureDate + ", arrivalDate=" + arrivalDate + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", arrivalDayOffset=" + arrivalDayOffset + ", airline=" + airline + ", flightDuration="
				+ flightDuration + ", aircraftType=" + aircraftType + ", flightDistance=" + flightDistance
				+ ", depPortCode=" + depPortCode + ", depPortName=" + depPortName + ", arrPortCode=" + arrPortCode
				+ ", arrPortName=" + arrPortName + ", terminal=" + terminal + ", effectiveFrom=" + effectiveFrom
				+ ", effectiveTo=" + effectiveTo + "]";
	}	
	
	
}
