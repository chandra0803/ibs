package com.ibsplc.oag.vo;

import java.io.Serializable;

public class ConnectionFlights implements Serializable{
	
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
	private String departingCountry;
	private String departurePortCode;
	private String arrivalPortCode;
	private String departurePortName;
	private String arrivalPortName;
	private String arrivingCountry;
	private String airline;
	private String flightDuration;
	private String aircraftType;
	private String flightDistance;
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
	public String getDeparturePortCode() {
		return departurePortCode;
	}
	public void setDeparturePortCode(String departurePortCode) {
		this.departurePortCode = departurePortCode;
	}
	public String getArrivalPortCode() {
		return arrivalPortCode;
	}
	public void setArrivalPortCode(String arrivalPortCode) {
		this.arrivalPortCode = arrivalPortCode;
	}
	public String getDeparturePortName() {
		return departurePortName;
	}
	public void setDeparturePortName(String departurePortName) {
		this.departurePortName = departurePortName;
	}
	public String getArrivalPortName() {
		return arrivalPortName;
	}
	public void setArrivalPortName(String arrivalPortName) {
		this.arrivalPortName = arrivalPortName;
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
	public String getDepartingCountry() {
		return departingCountry;
	}
	public void setDepartingCountry(String departingCountry) {
		this.departingCountry = departingCountry;
	}
	public String getArrivingCountry() {
		return arrivingCountry;
	}
	public void setArrivingCountry(String arrivingCountry) {
		this.arrivingCountry = arrivingCountry;
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
		return "ConnectionFlights [flightNumber=" + flightNumber + ", frequency=" + frequency + ", departureDate="
				+ departureDate + ", arrivalDate=" + arrivalDate + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", departingCountry=" + departingCountry + ", departurePortCode=" + departurePortCode
				+ ", arrivalPortCode=" + arrivalPortCode + ", departurePortName=" + departurePortName
				+ ", arrivalPortName=" + arrivalPortName + ", arrivingCountry=" + arrivingCountry + ", airline="
				+ airline + ", flightDuration=" + flightDuration + ", aircraftType=" + aircraftType
				+ ", flightDistance=" + flightDistance + ", terminal=" + terminal + ", effectiveFrom=" + effectiveFrom
				+ ", effectiveTo=" + effectiveTo + "]";
	}
	
	
}
