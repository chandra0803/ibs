package com.ibsplc.amadeus.vo;

import java.util.List;

//@JsonInclude(Include.NON_NULL)
public class ItineraryVO extends AbstractVO {

	/**
	 * 
	 */
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
	 * This represents the carrier code of the flight. eg : SA
	 */
	private String carrierCode;

	/**
	 * This represent the flight number of the itinerary. eg : 1234 (if SA1234
	 * if the flight info)
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
	 * The seation information of the passengers in the itinerary Its a
	 * collection of SSRvos
	 */
	private List<SSRVO> seatingInformation;

	/**
	 * The meal information of the passengers in the itinerary Its a collection
	 * of SSRvos
	 */
	private List<SSRVO> mealInformation;

	private List<SSRVO> extraBaggage;

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
	 * This represents the line number of the itinerary as in amadeus. This
	 * number is needed when we use cryptic commands and need to refer to the
	 * passengers
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
	 * car details
	 */
	private  TypicalCarDataVO typicalCarData;
	/**
	 * segment detils
	 */
	private  String segmentName;

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

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
	 * @return the arrivalDate
	 */
	public String getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * @param arrivalDate
	 *            the arrivalDate to set
	 */
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
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
	 * @return the classOfTravel
	 */
	public String getClassOfTravel() {
		return classOfTravel;
	}

	/**
	 * @param classOfTravel
	 *            the classOfTravel to set
	 */
	public void setClassOfTravel(String classOfTravel) {
		this.classOfTravel = classOfTravel;
	}

	/**
	 * @return the classDescription
	 */
	public String getClassDescription() {
		return classDescription;
	}

	/**
	 * @param classDescription
	 *            the classDescription to set
	 */
	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}

	/**
	 * @return the aircraftType
	 */
	public String getAircraftType() {
		return aircraftType;
	}

	/**
	 * @param aircraftType
	 *            the aircraftType to set
	 */
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	/**
	 * @return the seatingInformation
	 */
	public List<SSRVO> getSeatingInformation() {
		return seatingInformation;
	}

	/**
	 * @param seatingInformation
	 *            the seatingInformation to set
	 */
	public void setSeatingInformation(List<SSRVO> seatingInformation) {
		this.seatingInformation = seatingInformation;
	}

	/**
	 * @return the mealInformation
	 */
	public List<SSRVO> getMealInformation() {
		return mealInformation;
	}

	/**
	 * @param mealInformation
	 *            the mealInformation to set
	 */
	public void setMealInformation(List<SSRVO> mealInformation) {
		this.mealInformation = mealInformation;
	}

	/**
	 * @return the extraBaggage
	 */
	public List<SSRVO> getExtraBaggage() {
		return extraBaggage;
	}

	/**
	 * @param extraBaggage
	 *            the extraBaggage to set
	 */
	public void setExtraBaggage(List<SSRVO> extraBaggage) {
		this.extraBaggage = extraBaggage;
	}

	/**
	 * @return the isEticketable
	 */
	public boolean isEticketable() {
		return isEticketable;
	}

	/**
	 * @param isEticketable
	 *            the isEticketable to set
	 */
	public void setEticketable(boolean isEticketable) {
		this.isEticketable = isEticketable;
	}

	/**
	 * @return the referenceNumber
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * @param referenceNumber
	 *            the referenceNumber to set
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the lineNumber
	 */
	public String getLineNumber() {
		return lineNumber;
	}

	/**
	 * @param lineNumber
	 *            the lineNumber to set
	 */
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	/**
	 * @return the departureAirportCode
	 */
	public String getDepartureAirportCode() {
		return departureAirportCode;
	}

	/**
	 * @param departureAirportCode
	 *            the departureAirportCode to set
	 */
	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}

	/**
	 * @return the arrivalAirportCode
	 */
	public String getArrivalAirportCode() {
		return arrivalAirportCode;
	}

	/**
	 * @param arrivalAirportCode
	 *            the arrivalAirportCode to set
	 */
	public void setArrivalAirportCode(String arrivalAirportCode) {
		this.arrivalAirportCode = arrivalAirportCode;
	}

	/**
	 * @return the departureAirportDesc
	 */
	public String getDepartureAirportDesc() {
		return departureAirportDesc;
	}

	/**
	 * @param departureAirportDesc
	 *            the departureAirportDesc to set
	 */
	public void setDepartureAirportDesc(String departureAirportDesc) {
		this.departureAirportDesc = departureAirportDesc;
	}

	/**
	 * @return the arrivalAirportDesc
	 */
	public String getArrivalAirportDesc() {
		return arrivalAirportDesc;
	}

	/**
	 * @param arrivalAirportDesc
	 *            the arrivalAirportDesc to set
	 */
	public void setArrivalAirportDesc(String arrivalAirportDesc) {
		this.arrivalAirportDesc = arrivalAirportDesc;
	}

	/**
	 * @return the departingTerminal
	 */
	public String getDepartingTerminal() {
		return departingTerminal;
	}

	/**
	 * @param departingTerminal
	 *            the departingTerminal to set
	 */
	public void setDepartingTerminal(String departingTerminal) {
		this.departingTerminal = departingTerminal;
	}

	/**
	 * @return the arrivingTerminal
	 */
	public String getArrivingTerminal() {
		return arrivingTerminal;
	}

	/**
	 * @param arrivingTerminal
	 *            the arrivingTerminal to set
	 */
	public void setArrivingTerminal(String arrivingTerminal) {
		this.arrivingTerminal = arrivingTerminal;
	}

	/**
	 * @return the originDescription
	 */
	public String getOriginDescription() {
		return originDescription;
	}

	/**
	 * @param originDescription
	 *            the originDescription to set
	 */
	public void setOriginDescription(String originDescription) {
		this.originDescription = originDescription;
	}

	/**
	 * @return the destinationDescription
	 */
	public String getDestinationDescription() {
		return destinationDescription;
	}

	/**
	 * @param destinationDescription
	 *            the destinationDescription to set
	 */
	public void setDestinationDescription(String destinationDescription) {
		this.destinationDescription = destinationDescription;
	}

	/**
	 * @return the operatedBy
	 */
	public String getOperatedBy() {
		return operatedBy;
	}

	/**
	 * @param operatedBy
	 *            the operatedBy to set
	 */
	public void setOperatedBy(String operatedBy) {
		this.operatedBy = operatedBy;
	}

	/**
	 * @return the typicalCarData
	 */
	public TypicalCarDataVO getTypicalCarData() {
		return typicalCarData;
	}

	/**
	 * @param typicalCarData the typicalCarData to set
	 */
	public void setTypicalCarData(TypicalCarDataVO typicalCarData) {
		this.typicalCarData = typicalCarData;
	}

	/**
	 * @return the segmentName
	 */
	public String getSegmentName() {
		return segmentName;
	}

	/**
	 * @param segmentName the segmentName to set
	 */
	public void setSegmentName(String segmentName) {
		this.segmentName = segmentName;
	}

}
