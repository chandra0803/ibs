package com.ibsplc.common.vo;

import java.io.Serializable;
import java.util.List;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class PaxVO extends AbstractVO implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * The first name of the passenger
	 */
	private String firstName;
	/**
	 * The surname of the passenger
	 */
	private String surName;
	/**
	 * The title of the passenger
	 */
	private String title;
	/**
	 * The possible values for this are ADT, CHD and INF
	 */
	private String paxType;
	/**
	 * E-Ticket Number
	 */
	private String eTicketNumber;
	/**
	 * EMD document numbers associated with the passenger
	 */
	private List<String> emdNumbers;
	/**
	 * The DOB of the passenger
	 */
	private String dateOfBirth;
	/**
	 * The ffp memebership type of the passenger. Usually with an airline
	 */
	private String frequentFlyerMembershipType;
	/**
	 * The FFP number of the passenger
	 */
	private String frequentFlyerNumber;
	/**
	 * The FFP category code of the passenger
	 */
	private String frequentFlyerCategory;
	/**
	 * The FFP version number of the passenger
	 */
	private String frequentFlyerVersionNumber;
	/**
	 * The FFP approval code of the passenger
	 */
	private String frequentFlyerApprovalCode;
	/**
	 * The FF program name
	 */
	private String frequentFlyerProgram;
	/**
	 * Represents the internal qualifier reference used in Amadeus. Should be used
	 * in combination with referenceNumber. It is to be noted that, this combination
	 * will repeat if an Infant is associated with an Adult, as both of them will
	 * have the same combination.
	 */
	private String referenceQualifier;
	/**
	 * Represents the internal number reference used in Amadeus. Should be used in
	 * combination with referenceQualifier. It is to be noted that, this combination
	 * will repeat if an Infant is associated with an Adult, as both of them will
	 * have the same combination.
	 */
	private String referenceNumber;
	/**
	 * This represents the line number of the pax as in amadeus. This number is
	 * needed when we use cryptic commands and need to refer to the passengers
	 */
	private String lineNumber;

	/**
	 * getFirstName
	 * 
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * To set firstName
	 * 
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * getSurName
	 * 
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * To set surName
	 * 
	 * @param surName
	 *            the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}

	/**
	 * getTitle
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * To set title
	 * 
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * getPaxType
	 * 
	 * @return the paxType
	 */
	public String getPaxType() {
		return paxType;
	}

	/**
	 * To set paxType
	 * 
	 * @param paxType
	 *            the paxType to set
	 */
	public void setPaxType(String paxType) {
		this.paxType = paxType;
	}

	/**
	 * getDateOfBirth
	 * 
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * To set dateOfBirth
	 * 
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * getFrequentFlyerMembershipType
	 * 
	 * @return the frequentFlyerMembershipType
	 */
	public String getFrequentFlyerMembershipType() {
		return frequentFlyerMembershipType;
	}

	/**
	 * To set frequentFlyerMembershipType
	 * 
	 * @param frequentFlyerMembershipType
	 *            the frequentFlyerMembershipType to set
	 */
	public void setFrequentFlyerMembershipType(String frequentFlyerMembershipType) {
		this.frequentFlyerMembershipType = frequentFlyerMembershipType;
	}

	/**
	 * getFrequentFlyerNumber
	 * 
	 * @return the frequentFlyerNumber
	 */
	public String getFrequentFlyerNumber() {
		return frequentFlyerNumber;
	}

	/**
	 * To set frequentFlyerNumber
	 * 
	 * @param frequentFlyerNumber
	 *            the frequentFlyerNumber to set
	 */
	public void setFrequentFlyerNumber(String frequentFlyerNumber) {
		this.frequentFlyerNumber = frequentFlyerNumber;
	}

	/**
	 * getFrequentFlyerCategory
	 * 
	 * @return the frequentFlyerCategory
	 */
	public String getFrequentFlyerCategory() {
		return frequentFlyerCategory;
	}

	/**
	 * To set frequentFlyerCategory
	 * 
	 * @param frequentFlyerCategory
	 *            the frequentFlyerCategory to set
	 */
	public void setFrequentFlyerCategory(String frequentFlyerCategory) {
		this.frequentFlyerCategory = frequentFlyerCategory;
	}

	/**
	 * getFrequentFlyerVersionNumber
	 * 
	 * @return the frequentFlyerVersionNumber
	 */
	public String getFrequentFlyerVersionNumber() {
		return frequentFlyerVersionNumber;
	}

	/**
	 * To set frequentFlyerVersionNumber
	 * 
	 * @param frequentFlyerVersionNumber
	 *            the frequentFlyerVersionNumber to set
	 */
	public void setFrequentFlyerVersionNumber(String frequentFlyerVersionNumber) {
		this.frequentFlyerVersionNumber = frequentFlyerVersionNumber;
	}

	/**
	 * getFrequentFlyerApprovalCode
	 * 
	 * @return the frequentFlyerApprovalCode
	 */
	public String getFrequentFlyerApprovalCode() {
		return frequentFlyerApprovalCode;
	}

	/**
	 * To set frequentFlyerApprovalCode
	 * 
	 * @param frequentFlyerApprovalCode
	 *            the frequentFlyerApprovalCode to set
	 */
	public void setFrequentFlyerApprovalCode(String frequentFlyerApprovalCode) {
		this.frequentFlyerApprovalCode = frequentFlyerApprovalCode;
	}

	/**
	 * getFrequentFlyerProgram
	 * 
	 * @return the frequentFlyerProgram
	 */
	public String getFrequentFlyerProgram() {
		return frequentFlyerProgram;
	}

	/**
	 * To set frequentFlyerProgram
	 * 
	 * @param frequentFlyerProgram
	 *            the frequentFlyerProgram to set
	 */
	public void setFrequentFlyerProgram(String frequentFlyerProgram) {
		this.frequentFlyerProgram = frequentFlyerProgram;
	}

	/**
	 * getReferenceQualifier
	 * 
	 * @return the referenceQualifier
	 */
	public String getReferenceQualifier() {
		return referenceQualifier;
	}

	/**
	 * To set referenceQualifier
	 * 
	 * @param referenceQualifier
	 *            the referenceQualifier to set
	 */
	public void setReferenceQualifier(String referenceQualifier) {
		this.referenceQualifier = referenceQualifier;
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
	 * geteTicketNumber
	 * 
	 * @return the eTicketNumber
	 */
	public String geteTicketNumber() {
		return eTicketNumber;
	}

	/**
	 * To set eTicketNumber
	 * 
	 * @param eTicketNumber
	 *            the eTicketNumber to set
	 */
	public void seteTicketNumber(String eTicketNumber) {
		this.eTicketNumber = eTicketNumber;
	}

	/**
	 * getEmdNumbers
	 * 
	 * @return the emdNumbers
	 */
	public List<String> getEmdNumbers() {
		return emdNumbers;
	}

	/**
	 * To set emdNumbers
	 * 
	 * @param emdNumbers
	 *            the emdNumbers to set
	 */
	public void setEmdNumbers(List<String> emdNumbers) {
		this.emdNumbers = emdNumbers;
	}

	@Override
	public String toString() {
		return "PaxVO [firstName=" + firstName + ", surName=" + surName + ", title=" + title + ", paxType=" + paxType
				+ ", eTicketNumber=" + eTicketNumber + ", emdNumbers=" + emdNumbers + ", dateOfBirth=" + dateOfBirth
				+ ", frequentFlyerMembershipType=" + frequentFlyerMembershipType + ", frequentFlyerNumber="
				+ frequentFlyerNumber + ", frequentFlyerCategory=" + frequentFlyerCategory
				+ ", frequentFlyerVersionNumber=" + frequentFlyerVersionNumber + ", frequentFlyerApprovalCode="
				+ frequentFlyerApprovalCode + ", frequentFlyerProgram=" + frequentFlyerProgram + ", referenceQualifier="
				+ referenceQualifier + ", referenceNumber=" + referenceNumber + ", lineNumber=" + lineNumber + "]";
	}

}
