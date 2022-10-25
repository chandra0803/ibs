package com.ibsplc.amadeus.vo;

public class PassengerDetailsVO extends AbstractVO {

	private String passengerFirstName;

	private String passengerSurname;

	private String passengerType;

	private String dateofBirth;

	private String passengerReferenceNumber;

	private String passengerReferenceQualifier;

	private String passengerLineNumber;

	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public String getPassengerSurname() {
		return passengerSurname;
	}

	public void setPassengerSurname(String passengerSurname) {
		this.passengerSurname = passengerSurname;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getPassengerReferenceNumber() {
		return passengerReferenceNumber;
	}

	public void setPassengerReferenceNumber(String passengerReferenceNumber) {
		this.passengerReferenceNumber = passengerReferenceNumber;
	}

	public String getPassengerReferenceQualifier() {
		return passengerReferenceQualifier;
	}

	public void setPassengerReferenceQualifier(String passengerReferenceQualifier) {
		this.passengerReferenceQualifier = passengerReferenceQualifier;
	}

	public String getPassengerLineNumber() {
		return passengerLineNumber;
	}

	public void setPassengerLineNumber(String passengerLineNumber) {
		this.passengerLineNumber = passengerLineNumber;
	}

}
