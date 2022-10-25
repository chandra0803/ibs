package com.ibsplc.reservation.vo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.ibsplc.common.vo.EMDDetailsVO;
import com.ibsplc.common.vo.FareVO;
import com.ibsplc.common.vo.ItineraryVO;
import com.ibsplc.common.vo.PaxVO;

public class BookingVO extends ManageBookingVO {
	private static final long serialVersionUID = 1L;
	/**
	 * PNR Num
	 */
	private String pnrNum;
	
	/**
	 * Result Message from Response
	 */
	private String resultMessage;
	/**
	 * Session ID
	 */
	private String serviceSessionId;
	/**
	 * Sequence Number
	 */
	private String sequenceNumber;
	/**
	 * Security Token
	 */
	private String securityToken;

	/**
	 * SurName
	 */
	private String surName;
	/**
	 * Email Address
	 */
	private String emailId;
	/**
	 * Office ID
	 */
	private String amadeusSiteOfficeID;

	/**
	 * Ticket number
	 */
	private String ticketNumber;

	/**
	 * Form of identification
	 */
	private String formOfIdentification;

	/**
	 * This contain the EMD list for the booking
	 */
	private List<EMDDetailsVO> emdDetails;
	
	/**
	 * This contains Fare details and tax codes and tax amounts
	 */
	private FareVO fareDetails;

	/**
	 * This contain the passenger list
	 */
	private List<PaxVO> passengerDetails;
	/**
	 * This list contain the Itinerary Details
	 */
	private List<ItineraryVO> itineraryDetails;
	/**
	 * Boolean value - is PNR Ticketed or not
	 */
	private boolean ticketed;
	/**
	 * Remark
	 */
	private String remark;
	
	private String emdAmount;
	
	private BigDecimal totalBookingAmount;
	
	private boolean isTicketChanged;
	
	private boolean isEmdChanged;
	
	private boolean isNewEmdNumbersPresent;
	
	private BigDecimal totalAmountForAdults;
	
	private BigDecimal totalAmountForChildren;
	
	private BigDecimal totalAmountForInfants;
	
	private BigDecimal penaltyFee;
	
	private boolean isItineraryDomestic;
	
	private boolean isHistoricTaxInvoice;

	private RemarksList remarksList;
	
	

	/**
	 * @return the totalAmountForAdults
	 */
	public BigDecimal getTotalAmountForAdults() {
		return totalAmountForAdults;
	}

	/**
	 * @param totalAmountForAdults the totalAmountForAdults to set
	 */
	public void setTotalAmountForAdults(BigDecimal totalAmountForAdults) {
		this.totalAmountForAdults = totalAmountForAdults;
	}

	/**
	 * @return the totalAmountForChildren
	 */
	public BigDecimal getTotalAmountForChildren() {
		return totalAmountForChildren;
	}

	/**
	 * @param totalAmountForChildren the totalAmountForChildren to set
	 */
	public void setTotalAmountForChildren(BigDecimal totalAmountForChildren) {
		this.totalAmountForChildren = totalAmountForChildren;
	}

	/**
	 * @return the totalAmountForInfants
	 */
	public BigDecimal getTotalAmountForInfants() {
		return totalAmountForInfants;
	}

	/**
	 * @param totalAmountForInfants the totalAmountForInfants to set
	 */
	public void setTotalAmountForInfants(BigDecimal totalAmountForInfants) {
		this.totalAmountForInfants = totalAmountForInfants;
	}

	/**
	 * Map with Adult fare breakdown
	 */
	private Map<String, BigDecimal> adultFareBreakDownMap;

	/**
	 * Map with child fare breakdown
	 */
	private Map<String, BigDecimal> childFareBreakDownMap;

	/**
	 * Map with infant fare breakdown
	 */
	private Map<String, BigDecimal> infantFareBreakDownMap;
	
	/**
	 * Map to store EMD details response
	 * Key - EMD Number
	 * Value - TicketProcessVO of corresponding Emd Number
	 */
	private Map<String, TicketProcessVO> processEdocResponseMap;
	
	/**
	 * Booking Source
	 */
	private String source;
	
	private Double changedBaseFare;
	/**
	 * Identifier
	 */
	private String identifier;

	/**
	 * @return the pnrNum
	 */
	public String getPnrNum() {
		return pnrNum;
	}

	/**
	 * @param pnrNum
	 *            the pnrNum to set
	 */
	public void setPnrNum(String pnrNum) {
		this.pnrNum = pnrNum;
	}

	/**
	 * @return the serviceSessionId
	 */
	public String getServiceSessionId() {
		return serviceSessionId;
	}

	/**
	 * @param serviceSessionId
	 *            the serviceSessionId to set
	 */
	public void setServiceSessionId(String serviceSessionId) {
		this.serviceSessionId = serviceSessionId;
	}

	/**
	 * @return the sequenceNumber
	 */
	public String getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * @param sequenceNumber
	 *            the sequenceNumber to set
	 */
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	/**
	 * @return the securityToken
	 */
	public String getSecurityToken() {
		return securityToken;
	}

	/**
	 * @param securityToken
	 *            the securityToken to set
	 */
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
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
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the amadeusSiteOfficeID
	 */
	public String getAmadeusSiteOfficeID() {
		return amadeusSiteOfficeID;
	}
	

	/**
	 * @param amadeusSiteOfficeID
	 *            the amadeusSiteOfficeID to set
	 */
	public void setAmadeusSiteOfficeID(String amadeusSiteOfficeID) {
		this.amadeusSiteOfficeID = amadeusSiteOfficeID;
	}
// set selfServiceOfficeID
	
	/**
	 * @return the ticketNumber
	 */
	public String getTicketNumber() {
		return ticketNumber;
	}

	

	/**
	 * @param ticketNumber
	 *            the ticketNumber to set
	 */
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	/**
	 * @return the formOfIdentification
	 */
	public String getFormOfIdentification() {
		return formOfIdentification;
	}

	/**
	 * @param formOfIdentification
	 *            the formOfIdentification to set
	 */
	public void setFormOfIdentification(String formOfIdentification) {
		this.formOfIdentification = formOfIdentification;
	}

	/**
	 * @return the emdDetails
	 */
	public List<EMDDetailsVO> getEmdDetails() {
		return emdDetails;
	}

	/**
	 * @param emdDetails
	 *            the emdDetails to set
	 */
	public void setEmdDetails(List<EMDDetailsVO> emdDetails) {
		this.emdDetails = emdDetails;
	}

	/**
	 * @return the passengerDetails
	 */
	public List<PaxVO> getPassengerDetails() {
		return passengerDetails;
	}

	/**
	 * @param passengerDetails
	 *            the passengerDetails to set
	 */
	public void setPassengerDetails(List<PaxVO> passengerDetails) {
		this.passengerDetails = passengerDetails;
	}

	/**
	 * @return the itineraryDetails
	 */
	public List<ItineraryVO> getItineraryDetails() {
		return itineraryDetails;
	}

	/**
	 * @param itineraryDetails
	 *            the itineraryDetails to set
	 */
	public void setItineraryDetails(List<ItineraryVO> itineraryDetails) {
		this.itineraryDetails = itineraryDetails;
	}

	/**
	 * @return the ticketed
	 */
	public boolean isTicketed() {
		return ticketed;
	}

	/**
	 * @param ticketed
	 *            the ticketed to set
	 */
	public void setTicketed(boolean ticketed) {
		this.ticketed = ticketed;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the adultFareBreakDownMap
	 */
	public Map<String, BigDecimal> getAdultFareBreakDownMap() {
		return adultFareBreakDownMap;
	}

	/**
	 * @return the childFareBreakDownMap
	 */
	public Map<String, BigDecimal> getChildFareBreakDownMap() {
		return childFareBreakDownMap;
	}

	/**
	 * @return the infantFareBreakDownMap
	 */
	public Map<String, BigDecimal> getInfantFareBreakDownMap() {
		return infantFareBreakDownMap;
	}

	/**
	 * @param adultFareBreakDownMap
	 *            the adultFareBreakDownMap to set
	 */
	public void setAdultFareBreakDownMap(Map<String, BigDecimal> adultFareBreakDownMap) {
		this.adultFareBreakDownMap = adultFareBreakDownMap;
	}

	/**
	 * @param childFareBreakDownMap
	 *            the childFareBreakDownMap to set
	 */
	public void setChildFareBreakDownMap(Map<String, BigDecimal> childFareBreakDownMap) {
		this.childFareBreakDownMap = childFareBreakDownMap;
	}

	/**
	 * @param infantFareBreakDownMap
	 *            the infantFareBreakDownMap to set
	 */
	public void setInfantFareBreakDownMap(Map<String, BigDecimal> infantFareBreakDownMap) {
		this.infantFareBreakDownMap = infantFareBreakDownMap;
	}

	/**
	 * @return the fareDetails
	 */
	public FareVO getFareDetails() {
		return fareDetails;
	}

	/**
	 * @param fareDetails the fareDetails to set
	 */
	public void setFareDetails(FareVO fareDetails) {
		this.fareDetails = fareDetails;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the processEdocResponseMap
	 */
	public Map<String, TicketProcessVO> getProcessEdocResponseMap() {
		return processEdocResponseMap;
	}

	/**
	 * @param processEdocResponseMap the processEdocResponseMap to set
	 */
	public void setProcessEdocResponseMap(Map<String, TicketProcessVO> processEdocResponseMap) {
		this.processEdocResponseMap = processEdocResponseMap;
	}

	/**
	 * @return the resultMessage
	 */
	public String getResultMessage() {
		return resultMessage;
	}

	/**
	 * @param resultMessage the resultMessage to set
	 */
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	/**
	 * @return the emdAmount
	 */
	public String getEmdAmount() {
		return emdAmount;
	}

	/**
	 * @param emdAmount the emdAmount to set
	 */
	public void setEmdAmount(String emdAmount) {
		this.emdAmount = emdAmount;
	}

	/**
	 * @return the totalBookingAmount
	 */
	public BigDecimal getTotalBookingAmount() {
		return totalBookingAmount;
	}

	/**
	 * @param totalBookingAmount the totalBookingAmount to set
	 */
	public void setTotalBookingAmount(BigDecimal totalBookingAmount) {
		this.totalBookingAmount = totalBookingAmount;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return the changedBaseFare
	 */
	public Double getChangedBaseFare() {
		return changedBaseFare;
	}

	/**
	 * @param changedBaseFare the changedBaseFare to set
	 */
	public void setChangedBaseFare(Double changedBaseFare) {
		this.changedBaseFare = changedBaseFare;
	}

	/**
	 * @return the isTicketChanged
	 */
	public boolean isTicketChanged() {
		return isTicketChanged;
	}

	/**
	 * @param isTicketChanged the isTicketChanged to set
	 */
	public void setTicketChanged(boolean isTicketChanged) {
		this.isTicketChanged = isTicketChanged;
	}

	/**
	 * @return the isEmdChanged
	 */
	public boolean isEmdChanged() {
		return isEmdChanged;
	}

	/**
	 * @param isEmdChanged the isEmdChanged to set
	 */
	public void setEmdChanged(boolean isEmdChanged) {
		this.isEmdChanged = isEmdChanged;
	}

	/**
	 * @return the isNewEmdNumbersPresent
	 */
	public boolean isNewEmdNumbersPresent() {
		return isNewEmdNumbersPresent;
	}

	/**
	 * @param isNewEmdNumbersPresent the isNewEmdNumbersPresent to set
	 */
	public void setNewEmdNumbersPresent(boolean isNewEmdNumbersPresent) {
		this.isNewEmdNumbersPresent = isNewEmdNumbersPresent;
	}

	/**
	 * @return the penaltyFee
	 */
	public BigDecimal getPenaltyFee() {
		return penaltyFee;
	}

	/**
	 * @param penaltyFee the penaltyFee to set
	 */
	public void setPenaltyFee(BigDecimal penaltyFee) {
		this.penaltyFee = penaltyFee;
	}

	/**
	 * @return the isItineraryDomestic
	 */
	public boolean isItineraryDomestic() {
		return isItineraryDomestic;
	}

	/**
	 * @param isItineraryDomestic the isItineraryDomestic to set
	 */
	public void setItineraryDomestic(boolean isItineraryDomestic) {
		this.isItineraryDomestic = isItineraryDomestic;
	}

	/**
	 * @return the isHistoricTaxInvoice
	 */
	public boolean isHistoricTaxInvoice() {
		return isHistoricTaxInvoice;
	}

	/**
	 * @param isHistoricTaxInvoice the isHistoricTaxInvoice to set
	 */
	public void setHistoricTaxInvoice(boolean isHistoricTaxInvoice) {
		this.isHistoricTaxInvoice = isHistoricTaxInvoice;
	}

	public RemarksList getRemarksList() {
		return remarksList;
	}

	public void setRemarksList(RemarksList remarksList) {
		this.remarksList = remarksList;
	}

	@Override
	public String toString() {
		return "BookingVO [pnrNum=" + pnrNum + ", resultMessage=" + resultMessage + ", serviceSessionId="
				+ serviceSessionId + ", sequenceNumber=" + sequenceNumber + ", securityToken=" + securityToken
				+ ", surName=" + surName + ", emailId=" + emailId + ", amadeusSiteOfficeID=" + amadeusSiteOfficeID
				+ ", ticketNumber=" + ticketNumber + ", formOfIdentification=" + formOfIdentification + ", emdDetails="
				+ emdDetails + ", fareDetails=" + fareDetails + ", passengerDetails=" + passengerDetails
				+ ", itineraryDetails=" + itineraryDetails + ", ticketed=" + ticketed + ", remark=" + remark
				+ ", emdAmount=" + emdAmount + ", totalBookingAmount=" + totalBookingAmount + ", isTicketChanged="
				+ isTicketChanged + ", isEmdChanged=" + isEmdChanged + ", isNewEmdNumbersPresent="
				+ isNewEmdNumbersPresent + ", totalAmountForAdults=" + totalAmountForAdults
				+ ", totalAmountForChildren=" + totalAmountForChildren + ", totalAmountForInfants="
				+ totalAmountForInfants + ", penaltyFee=" + penaltyFee + ", isItineraryDomestic=" + isItineraryDomestic
				+ ", isHistoricTaxInvoice=" + isHistoricTaxInvoice + ", remarksList=" + remarksList
				+ ", adultFareBreakDownMap=" + adultFareBreakDownMap + ", childFareBreakDownMap="
				+ childFareBreakDownMap + ", infantFareBreakDownMap=" + infantFareBreakDownMap
				+ ", processEdocResponseMap=" + processEdocResponseMap + ", source=" + source + ", changedBaseFare="
				+ changedBaseFare + ", identifier=" + identifier + "]";
	}

}
