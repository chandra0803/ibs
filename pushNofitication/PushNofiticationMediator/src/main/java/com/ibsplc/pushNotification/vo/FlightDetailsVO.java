package com.ibsplc.pushNotification.vo;

import java.math.BigInteger;
import java.util.List;

/**
 * @author A-6620
 *
 */
public class FlightDetailsVO {
	
	/**
	 * Operating carrier.
	 */
	private String operatingCarrier;
	
	/**
	 * Flight number.
	 */
	private BigInteger flightNumber;
	
	/**
	 * Departure date and time
	 */
	private String departureDate;
	
	/**
	 * place of departure
	 */
	private String boardPoint;
	
	/**
	 * port of destination
	 */
	private String offPoint;	
	
	/**
	 * dcsLegStatus - indicator and action
	 */
	private List<DcsLegStatusVO>  dcsLegStatus;
	
	/**
	 * The flight gate and/or Aircraft Location
	 */
	private List<GateLocationVO>  gateLocation;
	
	/**
	 * flightTimes
	 */
	private List<FlightTimesVO>  flightTimes;

	/**
	 * @return operatingCarrier
	 */
	public String getOperatingCarrier() {
		return operatingCarrier;
	}

	/**
	 * @param operatingCarrier
	 */
	public void setOperatingCarrier(String operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}

	/**
	 * @return flightNumber
	 */
	public BigInteger getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 */
	public void setFlightNumber(BigInteger flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return boardPoint
	 */
	public String getBoardPoint() {
		return boardPoint;
	}

	/**
	 * @param boardPoint
	 */
	public void setBoardPoint(String boardPoint) {
		this.boardPoint = boardPoint;
	}
	
	/**
	 * @return offPoint
	 */
	public String getOffPoint() {
		return offPoint;
	}

	/**
	 * @param offPoint
	 */
	public void setOffPoint(String offPoint) {
		this.offPoint = offPoint;
	}

	/**
	 * @return dcsLegStatus
	 */ 
	public List<DcsLegStatusVO> getDcsLegStatus() {
		return dcsLegStatus;
	}

	/**
	 * @param dcsLegStatus
	 */
	public void setDcsLegStatus(List<DcsLegStatusVO> dcsLegStatus) {
		this.dcsLegStatus = dcsLegStatus;
	}
	
	/**
	 * @return gateLocation
	 */
	public List<GateLocationVO> getGateLocation() {
		return gateLocation;
	}

	/**
	 * @param gateLocation
	 */
	public void setGateLocation(List<GateLocationVO> gateLocation) {
		this.gateLocation = gateLocation;
	}
	
	/**
	 * @return flightTimes
	 */
	public List<FlightTimesVO> getFlightTimes() {
		return flightTimes;
	}

	/**
	 * @param flightTimes
	 */
	public void setFlightTimes(List<FlightTimesVO> flightTimes) {
		this.flightTimes = flightTimes;
	}

}
