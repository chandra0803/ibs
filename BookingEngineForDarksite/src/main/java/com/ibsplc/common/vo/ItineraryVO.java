package com.ibsplc.common.vo;

import java.io.Serializable;
import java.util.List;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class ItineraryVO extends AbstractVO implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * This represents the origin of the itinerary
	 */
	private String origin;
	/**
	 * This represents the destination of the itinerary
	 */
	private String destination;
	/**
	 * This represents the carrier code of the flight
	 */
	private String carrierCode;
	/**
	 * This represent the flight number of the itinerary. eg : 1234 (if SA1234 if
	 * the flight info)
	 */
	private String flightNumber;

	/**
	 * The arrival time of the flight in the destination The format is
	 * DD_MMM_YYYY_HH24MI = "dd-MMM-yyyy HH:mm";
	 */
	private String arrivalDate;
	/**
	 * The departure time of the flight from the origin The format is
	 * DD_MMM_YYYY_HH24MI = "dd-MMM-yyyy HH:mm";
	 */
	private String departureDate;
	/**
	 * The class of travel in the itinerary
	 */
	private String classOfTravel;
	/**
	 * The description of the class of travel
	 */
	private String classDescription;
	/**
	 * The aircraft type used in the itinerary
	 */
	private String aircraftType;
	/**
	 * The seating information of the passengers in the itinerary Its a collection
	 * of SSRvos
	 */
	private List<SSRVO> seatingInformation;
	/**
	 * The meal information of the passengers in the itinerary Its a collection of
	 * SSRvos
	 */
	private List<SSRVO> mealInformation;
	/**
	 * To indicate if the flight supports eticket in the route
	 */
	private boolean isEticketable;
	/***
	 * Represents the internal number reference used in Amadeus.
	 */
	private String referenceNumber;
	/**
	 * This denotes the status of the flight such as HK, HL, FL and so on Only
	 * flights of status HK are supposed to be handled by us.
	 */
	private String status;
	/**
	 * This represents the line number of the itinerary as in Amadeus. This number
	 * is needed when we use cryptic commands and need to refer to the passengers
	 */
	private String lineNumber;
	/**
	 * departureAirportCode
	 */
	private String departureAirportCode;
	/**
	 * arrivalAirportCode
	 */
	private String arrivalAirportCode;
	/**
	 * departureAirportDesc
	 */
	private String departureAirportDesc;
	/**
	 * arrivalAirportDesc
	 */
	private String arrivalAirportDesc;
	/**
	 * departingTerminal
	 */
	private String departingTerminal;
	/**
	 * arrivingTerminal
	 */
	private String arrivingTerminal;
	/**
	 * origin description
	 */
	private String originDescription;
	/**
	 * destination description
	 */
	private String destinationDescription;
	/**
	 * Operator of this itinerary
	 */
	private String operatedBy;

	/**
	 * getOrigin
	 * 
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * To set origin
	 * 
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * getDestination
	 * 
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * To set destination
	 * 
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * getCarrierCode
	 * 
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * To set carrierCode
	 * 
	 * @param carrierCode
	 *            the carrierCode to set
	 */
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * getFlightNumber
	 * 
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * To set flightNumber
	 * 
	 * @param flightNumber
	 *            the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * getArrivalDate
	 * 
	 * @return the arrivalDate
	 */
	public String getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * To set arrivalDate
	 * 
	 * @param arrivalDate
	 *            the arrivalDate to set
	 */
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * getDepartureDate
	 * 
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}

	/**
	 * To set departureDate
	 * 
	 * @param departureDate
	 *            the departureDate to set
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * getClassOfTravel
	 * 
	 * @return the classOfTravel
	 */
	public String getClassOfTravel() {
		return classOfTravel;
	}

	/**
	 * To set classOfTravel
	 * 
	 * @param classOfTravel
	 *            the classOfTravel to set
	 */
	public void setClassOfTravel(String classOfTravel) {
		this.classOfTravel = classOfTravel;
	}

	/**
	 * getClassDescription
	 * 
	 * @return the classDescription
	 */
	public String getClassDescription() {
		return classDescription;
	}

	/**
	 * To set classDescription
	 * 
	 * @param classDescription
	 *            the classDescription to set
	 */
	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}

	/**
	 * getAircraftType
	 * 
	 * @return the aircraftType
	 */
	public String getAircraftType() {
		return aircraftType;
	}

	/**
	 * To set aircraftType
	 * 
	 * @param aircraftType
	 *            the aircraftType to set
	 */
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	/**
	 * getSeatingInformation
	 * 
	 * @return the seatingInformation
	 */
	public List<SSRVO> getSeatingInformation() {
		return seatingInformation;
	}

	/**
	 * To set seatingInformation
	 * 
	 * @param seatingInformation
	 *            the seatingInformation to set
	 */
	public void setSeatingInformation(List<SSRVO> seatingInformation) {
		this.seatingInformation = seatingInformation;
	}

	/**
	 * getMealInformation
	 * 
	 * @return the mealInformation
	 */
	public List<SSRVO> getMealInformation() {
		return mealInformation;
	}

	/**
	 * To set mealInformation
	 * 
	 * @param mealInformation
	 *            the mealInformation to set
	 */
	public void setMealInformation(List<SSRVO> mealInformation) {
		this.mealInformation = mealInformation;
	}

	/**
	 * isEticketable
	 * 
	 * @return the isEticketable
	 */
	public boolean isEticketable() {
		return isEticketable;
	}

	/**
	 * To set isEticketable
	 * 
	 * @param isEticketable
	 *            the isEticketable to set
	 */
	public void setEticketable(boolean isEticketable) {
		this.isEticketable = isEticketable;
	}

	/**
	 * getReferenceNumber
	 * 
	 * @return the referenceNumber
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * To set referenceNumber
	 * 
	 * @param referenceNumber
	 *            the referenceNumber to set
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	/**
	 * getStatus
	 * 
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * To set status
	 * 
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * getLineNumber
	 * 
	 * @return the lineNumber
	 */
	public String getLineNumber() {
		return lineNumber;
	}

	/**
	 * To set lineNumber
	 * 
	 * @param lineNumber
	 *            the lineNumber to set
	 */
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	/**
	 * getDepartureAirportCode
	 * 
	 * @return the departureAirportCode
	 */
	public String getDepartureAirportCode() {
		return departureAirportCode;
	}

	/**
	 * To set departureAirportCode
	 * 
	 * @param departureAirportCode
	 *            the departureAirportCode to set
	 */
	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}

	/**
	 * getArrivalAirportCode
	 * 
	 * @return the arrivalAirportCode
	 */
	public String getArrivalAirportCode() {
		return arrivalAirportCode;
	}

	/**
	 * To set arrivalAirportCode
	 * 
	 * @param arrivalAirportCode
	 *            the arrivalAirportCode to set
	 */
	public void setArrivalAirportCode(String arrivalAirportCode) {
		this.arrivalAirportCode = arrivalAirportCode;
	}

	/**
	 * getDepartureAirportDesc
	 * 
	 * @return the departureAirportDesc
	 */
	public String getDepartureAirportDesc() {
		return departureAirportDesc;
	}

	/**
	 * To set departureAirportDesc
	 * 
	 * @param departureAirportDesc
	 *            the departureAirportDesc to set
	 */
	public void setDepartureAirportDesc(String departureAirportDesc) {
		this.departureAirportDesc = departureAirportDesc;
	}

	/**
	 * getArrivalAirportDesc
	 * 
	 * @return the arrivalAirportDesc
	 */
	public String getArrivalAirportDesc() {
		return arrivalAirportDesc;
	}

	/**
	 * To set arrivalAirportDesc
	 * 
	 * @param arrivalAirportDesc
	 *            the arrivalAirportDesc to set
	 */
	public void setArrivalAirportDesc(String arrivalAirportDesc) {
		this.arrivalAirportDesc = arrivalAirportDesc;
	}

	/**
	 * getDepartingTerminal
	 * 
	 * @return the departingTerminal
	 */
	public String getDepartingTerminal() {
		return departingTerminal;
	}

	/**
	 * To set departingTerminal
	 * 
	 * @param departingTerminal
	 *            the departingTerminal to set
	 */
	public void setDepartingTerminal(String departingTerminal) {
		this.departingTerminal = departingTerminal;
	}

	/**
	 * getArrivingTerminal
	 * 
	 * @return the arrivingTerminal
	 */
	public String getArrivingTerminal() {
		return arrivingTerminal;
	}

	/**
	 * To set arrivingTerminal
	 * 
	 * @param arrivingTerminal
	 *            the arrivingTerminal to set
	 */
	public void setArrivingTerminal(String arrivingTerminal) {
		this.arrivingTerminal = arrivingTerminal;
	}

	/**
	 * getOriginDescription
	 * 
	 * @return the originDescription
	 */
	public String getOriginDescription() {
		return originDescription;
	}

	/**
	 * To set originDescription
	 * 
	 * @param originDescription
	 *            the originDescription to set
	 */
	public void setOriginDescription(String originDescription) {
		this.originDescription = originDescription;
	}

	/**
	 * getDestinationDescription
	 * 
	 * @return the destinationDescription
	 */
	public String getDestinationDescription() {
		return destinationDescription;
	}

	/**
	 * To set destinationDescription
	 * 
	 * @param destinationDescription
	 *            the destinationDescription to set
	 */
	public void setDestinationDescription(String destinationDescription) {
		this.destinationDescription = destinationDescription;
	}

	/**
	 * getOperatedBy
	 * 
	 * @return the operatedBy
	 */
	public String getOperatedBy() {
		return operatedBy;
	}

	/**
	 * To set operatedBy
	 * 
	 * @param operatedBy
	 *            the operatedBy to set
	 */
	public void setOperatedBy(String operatedBy) {
		this.operatedBy = operatedBy;
	}

	@Override
	public String toString() {
		return "ItineraryVO [origin=" + origin + ", destination=" + destination + ", carrierCode=" + carrierCode
				+ ", flightNumber=" + flightNumber + ", arrivalDate=" + arrivalDate + ", departureDate=" + departureDate
				+ ", classOfTravel=" + classOfTravel + ", classDescription=" + classDescription + ", aircraftType="
				+ aircraftType + ", seatingInformation=" + seatingInformation + ", mealInformation=" + mealInformation
				+ ", isEticketable=" + isEticketable + ", referenceNumber=" + referenceNumber + ", status=" + status
				+ ", lineNumber=" + lineNumber + ", departureAirportCode=" + departureAirportCode
				+ ", arrivalAirportCode=" + arrivalAirportCode + ", departureAirportDesc=" + departureAirportDesc
				+ ", arrivalAirportDesc=" + arrivalAirportDesc + ", departingTerminal=" + departingTerminal
				+ ", arrivingTerminal=" + arrivingTerminal + ", originDescription=" + originDescription
				+ ", destinationDescription=" + destinationDescription + ", operatedBy=" + operatedBy + "]";
	}

	
}
