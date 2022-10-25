package com.ibsplc.amadeus.vo.response;

import java.util.List;

import com.ibsplc.amadeus.vo.EMDDetailsVO;
import com.ibsplc.amadeus.vo.PassengerDetailsVO;

public class PNRRetrieveReponseVO {

	private String creationOfficeId;
	
	private List<PassengerDetailsVO> passengerDetails;

	private String segmentLineNumber;

	private String segmentReferenceNumber;

	private String departureDateandTime;

	private String arrivalDateandTime;

	private String originAirportCode;

	private String originAirportDescription;

	private String destinationAirportCode;

	private String destinationAirportDescription;

	private String carrierCode;

	private String flightNumber;

	private String classOfTravel;

	private String ticketDeliveryType;

	private String segmentStatus;

	private String equipmentType;

	private String arrivalTerminal;

	private String departureTerminal;

	private String emailAddress;

	private String emailAddressReferenceNumber;

	private String homePhoneNumber;

	private String homePhoneReferencenumber;

	private String mobilePhoneNumber;

	private String mobilePhoneReferenceNumber;

	private String emergencyPhoneNumber;

	private String emergencyPhoneContactReferenceNumber;

	private String ssrPassengerReferenceNumber;

	private String ssrSegmentReferenceNumber;

	private String ssrReferenceNumber;

	private String ssrQualifierNumber;

	private String ssrValue;

	private List<String> eTicketnumbers;

	private List<EMDDetailsVO> emdDetails;

	private String passengerCount;
	
	private String numberOfAdults;
	
	private String numberOfChildren;
	
	private String numberOfInfants;
	
	private String baseFare;
	
	private String totalBaseFare;
	
	private String taxCode;
	
	private String taxdescription;
	
	private String taxAmountPerPassengerType;
	
	private String totalTax;
	
	private String currency;
	
	private String totalFare;
	
	private String baggageWeight;
	
	private String baggageMeasurementUnit;

	/**
	 * 
	 */
	public PNRRetrieveReponseVO() {
		super();
	}

	public String getCreationOfficeId() {
		return creationOfficeId;
	}

	public void setCreationOfficeId(String creationOfficeId) {
		this.creationOfficeId = creationOfficeId;
	}

	public String getSegmentLineNumber() {
		return segmentLineNumber;
	}

	public void setSegmentLineNumber(String segmentLineNumber) {
		this.segmentLineNumber = segmentLineNumber;
	}

	public String getSegmentReferenceNumber() {
		return segmentReferenceNumber;
	}

	public void setSegmentReferenceNumber(String segmentReferenceNumber) {
		this.segmentReferenceNumber = segmentReferenceNumber;
	}

	public String getDepartureDateandTime() {
		return departureDateandTime;
	}

	public void setDepartureDateandTime(String departureDateandTime) {
		this.departureDateandTime = departureDateandTime;
	}

	public String getArrivalDateandTime() {
		return arrivalDateandTime;
	}

	public void setArrivalDateandTime(String arrivalDateandTime) {
		this.arrivalDateandTime = arrivalDateandTime;
	}

	public String getOriginAirportCode() {
		return originAirportCode;
	}

	public void setOriginAirportCode(String originAirportCode) {
		this.originAirportCode = originAirportCode;
	}

	public String getOriginAirportDescription() {
		return originAirportDescription;
	}

	public void setOriginAirportDescription(String originAirportDescription) {
		this.originAirportDescription = originAirportDescription;
	}

	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}

	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}

	public String getDestinationAirportDescription() {
		return destinationAirportDescription;
	}

	public void setDestinationAirportDescription(String destinationAirportDescription) {
		this.destinationAirportDescription = destinationAirportDescription;
	}

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

	public String getClassOfTravel() {
		return classOfTravel;
	}

	public void setClassOfTravel(String classOfTravel) {
		this.classOfTravel = classOfTravel;
	}

	public String getTicketDeliveryType() {
		return ticketDeliveryType;
	}

	public void setTicketDeliveryType(String ticketDeliveryType) {
		this.ticketDeliveryType = ticketDeliveryType;
	}

	public String getSegmentStatus() {
		return segmentStatus;
	}

	public void setSegmentStatus(String segmentStatus) {
		this.segmentStatus = segmentStatus;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getArrivalTerminal() {
		return arrivalTerminal;
	}

	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	public String getDepartureTerminal() {
		return departureTerminal;
	}

	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddressReferenceNumber() {
		return emailAddressReferenceNumber;
	}

	public void setEmailAddressReferenceNumber(String emailAddressReferenceNumber) {
		this.emailAddressReferenceNumber = emailAddressReferenceNumber;
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getHomePhoneReferencenumber() {
		return homePhoneReferencenumber;
	}

	public void setHomePhoneReferencenumber(String homePhoneReferencenumber) {
		this.homePhoneReferencenumber = homePhoneReferencenumber;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getMobilePhoneReferenceNumber() {
		return mobilePhoneReferenceNumber;
	}

	public void setMobilePhoneReferenceNumber(String mobilePhoneReferenceNumber) {
		this.mobilePhoneReferenceNumber = mobilePhoneReferenceNumber;
	}

	public String getEmergencyPhoneNumber() {
		return emergencyPhoneNumber;
	}

	public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}

	public String getEmergencyPhoneContactReferenceNumber() {
		return emergencyPhoneContactReferenceNumber;
	}

	public void setEmergencyPhoneContactReferenceNumber(String emergencyPhoneContactReferenceNumber) {
		this.emergencyPhoneContactReferenceNumber = emergencyPhoneContactReferenceNumber;
	}

	public String getSsrPassengerReferenceNumber() {
		return ssrPassengerReferenceNumber;
	}

	public void setSsrPassengerReferenceNumber(String ssrPassengerReferenceNumber) {
		this.ssrPassengerReferenceNumber = ssrPassengerReferenceNumber;
	}

	public String getSsrSegmentReferenceNumber() {
		return ssrSegmentReferenceNumber;
	}

	public void setSsrSegmentReferenceNumber(String ssrSegmentReferenceNumber) {
		this.ssrSegmentReferenceNumber = ssrSegmentReferenceNumber;
	}

	public String getSsrReferenceNumber() {
		return ssrReferenceNumber;
	}

	public void setSsrReferenceNumber(String ssrReferenceNumber) {
		this.ssrReferenceNumber = ssrReferenceNumber;
	}

	public String getSsrQualifierNumber() {
		return ssrQualifierNumber;
	}

	public void setSsrQualifierNumber(String ssrQualifierNumber) {
		this.ssrQualifierNumber = ssrQualifierNumber;
	}

	public String getSsrValue() {
		return ssrValue;
	}

	public void setSsrValue(String ssrValue) {
		this.ssrValue = ssrValue;
	}

	public List<String> geteTicketnumbers() {
		return eTicketnumbers;
	}

	public void seteTicketnumbers(List<String> eTicketnumbers) {
		this.eTicketnumbers = eTicketnumbers;
	}

	public String getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(String passengerCount) {
		this.passengerCount = passengerCount;
	}

	public String getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(String numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public String getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(String numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public String getNumberOfInfants() {
		return numberOfInfants;
	}

	public void setNumberOfInfants(String numberOfInfants) {
		this.numberOfInfants = numberOfInfants;
	}

	public String getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(String baseFare) {
		this.baseFare = baseFare;
	}

	public String getTotalBaseFare() {
		return totalBaseFare;
	}

	public void setTotalBaseFare(String totalBaseFare) {
		this.totalBaseFare = totalBaseFare;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxdescription() {
		return taxdescription;
	}

	public void setTaxdescription(String taxdescription) {
		this.taxdescription = taxdescription;
	}

	public String getTaxAmountPerPassengerType() {
		return taxAmountPerPassengerType;
	}

	public void setTaxAmountPerPassengerType(String taxAmountPerPassengerType) {
		this.taxAmountPerPassengerType = taxAmountPerPassengerType;
	}

	public String getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(String totalTax) {
		this.totalTax = totalTax;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(String totalFare) {
		this.totalFare = totalFare;
	}

	public String getBaggageWeight() {
		return baggageWeight;
	}

	public void setBaggageWeight(String baggageWeight) {
		this.baggageWeight = baggageWeight;
	}

	public String getBaggageMeasurementUnit() {
		return baggageMeasurementUnit;
	}

	public void setBaggageMeasurementUnit(String baggageMeasurementUnit) {
		this.baggageMeasurementUnit = baggageMeasurementUnit;
	}

	public List<PassengerDetailsVO> getPassengerDetails() {
		return passengerDetails;
	}

	public void setPassengerDetails(List<PassengerDetailsVO> passengerDetails) {
		this.passengerDetails = passengerDetails;
	}

	public List<EMDDetailsVO> getEmdDetails() {
		return emdDetails;
	}

	public void setEmdDetails(List<EMDDetailsVO> emdDetails) {
		this.emdDetails = emdDetails;
	}

}
