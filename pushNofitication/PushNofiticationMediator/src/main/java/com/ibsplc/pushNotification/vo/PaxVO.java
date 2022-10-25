package com.ibsplc.pushNotification.vo;

import java.util.List;

//@JsonInclude(Include.NON_NULL)
public class PaxVO extends AbstractVO {
	/**
	 * 
	 */
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
	 * eTicket number for the passenger
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
	 * The FFP number of the passenger. For Voyager, it will be the voyager id
	 */
	private String frequentFlyerNumber;

	/**
	 * The FFP category code of the passenger. For Voyager, it will be the award
	 * code
	 */
	private String frequentFlyerCategory;

	/**
	 * The FFP version number of the passenger. For Voyager, it will be the
	 * certificate number
	 */
	private String frequentFlyerVersionNumber;

	/**
	 * The FFP approval code of the passenger. For Voyager, it will be of form
	 * 08308421450295
	 */
	private String frequentFlyerApprovalCode;

	/**
	 * The program name e.g. South African Airways - Voyager
	 */
	private String frequentFlyerProgram;

	/**
	 * Represents the internal qualifier reference used in Amadeus. Should be
	 * used in combination with referenceNumber. It is to be noted that, this
	 * combination will repeat if an Infant is associated with an Adult, as both
	 * of them will have the same combination.
	 */
	private String referenceQualifier;

	/**
	 * Represents the internal number reference used in Amadeus. Should be used
	 * in combination with referenceQualifier. It is to be noted that, this
	 * combination will repeat if an Infant is associated with an Adult, as both
	 * of them will have the same combination.
	 */
	private String referenceNumber;

	/**
	 * This represents the line number of the pax as in amadeus. This number is
	 * needed when we use cryptic commands and need to refer to the passengers
	 */
	private String lineNumber;
	
		/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

		/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * @param surName
	 *            the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the paxType
	 */
	public String getPaxType() {
		return paxType;
	}

	/**
	 * @param paxType
	 *            the paxType to set
	 */
	public void setPaxType(String paxType) {
		this.paxType = paxType;
	}

	/**
	 * @return the eTicketNumber
	 */
	public String geteTicketNumber() {
		return eTicketNumber;
	}

	/**
	 * @param eTicketNumber
	 *            the eTicketNumber to set
	 */
	public void seteTicketNumber(String eTicketNumber) {
		this.eTicketNumber = eTicketNumber;
	}

	public List<String> getEmdNumbers() {
		return emdNumbers;
	}

	public void setEmdNumbers(List<String> emdNumbers) {
		this.emdNumbers = emdNumbers;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the frequentFlyerMembershipType
	 */
	public String getFrequentFlyerMembershipType() {
		return frequentFlyerMembershipType;
	}

	/**
	 * @param frequentFlyerMembershipType
	 *            the frequentFlyerMembershipType to set
	 */
	public void setFrequentFlyerMembershipType(String frequentFlyerMembershipType) {
		this.frequentFlyerMembershipType = frequentFlyerMembershipType;
	}

	/**
	 * @return the frequentFlyerNumber
	 */
	public String getFrequentFlyerNumber() {
		return frequentFlyerNumber;
	}

	/**
	 * @param frequentFlyerNumber
	 *            the frequentFlyerNumber to set
	 */
	public void setFrequentFlyerNumber(String frequentFlyerNumber) {
		this.frequentFlyerNumber = frequentFlyerNumber;
	}

	/**
	 * @return the frequentFlyerCategory
	 */
	public String getFrequentFlyerCategory() {
		return frequentFlyerCategory;
	}

	/**
	 * @param frequentFlyerCategory
	 *            the frequentFlyerCategory to set
	 */
	public void setFrequentFlyerCategory(String frequentFlyerCategory) {
		this.frequentFlyerCategory = frequentFlyerCategory;
	}

	/**
	 * @return the frequentFlyerVersionNumber
	 */
	public String getFrequentFlyerVersionNumber() {
		return frequentFlyerVersionNumber;
	}

	/**
	 * @param frequentFlyerVersionNumber
	 *            the frequentFlyerVersionNumber to set
	 */
	public void setFrequentFlyerVersionNumber(String frequentFlyerVersionNumber) {
		this.frequentFlyerVersionNumber = frequentFlyerVersionNumber;
	}

	/**
	 * @return the frequentFlyerApprovalCode
	 */
	public String getFrequentFlyerApprovalCode() {
		return frequentFlyerApprovalCode;
	}

	/**
	 * @param frequentFlyerApprovalCode
	 *            the frequentFlyerApprovalCode to set
	 */
	public void setFrequentFlyerApprovalCode(String frequentFlyerApprovalCode) {
		this.frequentFlyerApprovalCode = frequentFlyerApprovalCode;
	}

	/**
	 * @return the frequentFlyerProgram
	 */
	public String getFrequentFlyerProgram() {
		return frequentFlyerProgram;
	}

	/**
	 * @param frequentFlyerProgram
	 *            the frequentFlyerProgram to set
	 */
	public void setFrequentFlyerProgram(String frequentFlyerProgram) {
		this.frequentFlyerProgram = frequentFlyerProgram;
	}

	/**
	 * @return the referenceQualifier
	 */
	public String getReferenceQualifier() {
		return referenceQualifier;
	}

	/**
	 * @param referenceQualifier
	 *            the referenceQualifier to set
	 */
	public void setReferenceQualifier(String referenceQualifier) {
		this.referenceQualifier = referenceQualifier;
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
	 * Copies the paxVO to create another object
	 * 
	 * @return copy
	 */
	public PaxVO copy() {
		PaxVO paxVO = new PaxVO();
		paxVO.setFirstName(this.firstName);
		paxVO.setSurName(this.surName);
		paxVO.setTitle(this.title);
		paxVO.setPaxType(this.paxType);
		paxVO.setDateOfBirth(this.dateOfBirth);
		paxVO.setFrequentFlyerMembershipType(this.frequentFlyerMembershipType);
		paxVO.setFrequentFlyerNumber(this.frequentFlyerNumber);
		paxVO.setFrequentFlyerCategory(this.frequentFlyerCategory);
		paxVO.setFrequentFlyerVersionNumber(this.frequentFlyerVersionNumber);
		paxVO.setFrequentFlyerApprovalCode(this.frequentFlyerApprovalCode);
		paxVO.setFrequentFlyerProgram(this.frequentFlyerProgram);
		paxVO.setReferenceQualifier(this.referenceQualifier);
		paxVO.setReferenceNumber(this.referenceNumber);
		paxVO.setLineNumber(this.lineNumber);
		//paxVO.setTotalAmount(this.totalAmount);
		return paxVO;
	}

}
