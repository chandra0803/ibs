package com.ibsplc.amadeus.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@JsonInclude(Include.NON_NULL)
public class BookingVO extends AbstractVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The PNR number associated with booking
	 */
	private String pnrNumber;

	/**
	 * This is the officeId using which the PNR was created. Its based on this
	 * office id that we go to the flows corresponding to normal flysaa booking,
	 * book by miles or travel rands booking
	 */
	private String creatingOfficeId;

	/**
	 * This is the officeId using which the PNR was created. Its based on this
	 * office id that we go to the flows corresponding to normal flysaa booking,
	 * book by miles or travel rands booking
	 */
	private String officeId;
	/**
	 * This is the land line number associated with the PNR
	 */
	private String dayTimeTelephone;

	/**
	 * This is the reference number of the daytime phone number
	 */
	private String dayTimeTelephoneReferenceNumber;

	/**
	 * This is the mobile number associated with the PNR
	 */
	private String mobileTelephone;

	/**
	 * This is the reference number of the mobile phone number
	 */
	private String mobileTelephoneReferenceNumber;

	/**
	 * This is the emailAddress associated with the PNR
	 */
	private String emailAddress;

	/**
	 * This is the reference number of the email address
	 */
	private String emailAddressReferenceNumber;

	private String totalBookingAmount;

	/**
	 * This is the fare associated with the PNR
	 */
	private FareVO fareDetails;
	
	/**
	 * This is the tax associated with the Ticket/EMD
	 */
	private List<TaxVO> taxDetails;

	/**
	 * This is the flight details associated with the PNR
	 */
	private List<ItineraryVO> itineraryDetails;

	/**
	 * This is the pax details associated with the PNR
	 */
	private List<PaxVO> passengerDetails;

	/**
	 * eTicketNumbers
	 *//*
		 * private List<String> eTicketNumbers;
		 */

	private List<EMDDetailsVO> emdDetails;
	
	private List<FareInfoVO> fareInfoDetails;

	/**
	 * To determine if the PNR has already been paid for
	 */
	private boolean isPaid;

	/**
	 * To determine if the itinerary has already flown
	 */
	private boolean isFlown;

	/**
	 * To determine if the PNR has been ticketed.
	 */
	private boolean isTicketed;

	/**
	 * To determine if the booking was created from SAA direct channel, miles or
	 * voyager. To be populated by the rules engine Possible values are
	 * SAA-COM-FTS, SAA-COM-MILES, SAA-COM-RANDS to denote SAA booking, Miles
	 * bookings && TravelRands booking respectively
	 */
	private String bookingSource;

	/**
	 * This indicates whether the PNR is of an international booking or a
	 * domestic one. At present, this value is used for change booking, to
	 * determine the next possible classes of travel. Its possible, that the
	 * same thing will be needed in the future also
	 */
	private boolean isInternational;

	/**
	 * This indicates whehter tbe PNR which we are changing has a return flight.
	 * It does not matter whether only one of the flights is being changed. This
	 * value should be populated from bookingVO
	 */
	private boolean hasReturn;

	/**
	 * This Field is used to find the pricing class incase of Miles upgradation.
	 * This field is included by assuming that the upgrade class for all the
	 * legs are same. This field is not used as of now.
	 */
	private String pricingClass;

	/**
	 * To indicate whether the booking is a premium booking
	 */
	private boolean isPremiumBooking;

	/**
	 * This VO is used to store the SKN details
	 */
	private SKNDetailsVO sknDetailsVO;
	/**
	 * originCity
	 */
	private String originCity;
	
	/**
	 * isOPCExist
	 */
	private String isOPCExist = "N";

	/**
	 * alternateContactDetailsVO - AlternateContactDetailsVO
	 */
	private AlternateContactDetailsVO alternateContactDetailsVO;

	/**
	 * To determine if the booking is a group booking. The PNR will have a 'sk
	 * cuff sa' string
	 */
	private boolean isGroupBooking;



	/**
	 * The amount pending to be paid for all EMDs which are not issued
	 */
	private String emdAmount;

	/**
	 * The currency against all the EMDs
	 */
	private String emdCurrency;

	/**
	 * total amount for adults
	 */
	private BigDecimal totalAmountForAdults;

	/**
	 * total amountfor Children
	 */
	private BigDecimal totalAmountForChildren;

	/**
	 * total amount for Infants
	 */
	private BigDecimal totalAmountForInfants;

	/**
	 * total amount with tax for adults
	 */
	private BigDecimal totalAmountWithTaxForAdults;
	/**
	 * total amount with tax for children
	 */
	private BigDecimal totalAmountWithTaxForChildren;

	/**
	 * total amount with tax for infants
	 */
	private BigDecimal totalAmountWithTaxForInfants;

	/**
	 * total amount without tax for adults
	 */
	private BigDecimal totalAmountWithoutTaxForAdults;

	/**
	 * total amount without tax for children
	 */
	private BigDecimal totalAmountWithoutTaxForChildren;

	/**
	 * total amount without tax for infants
	 */
	private BigDecimal totalAmountWithoutTaxForInfants;

	/**
	 * adultFareBreakDownMap
	 *//*
	private Map<String, BigDecimal> adultFareBreakDownMap;
	*//**
	 * childFareBreakDownMap
	 *//*
	private Map<String, BigDecimal> childFareBreakDownMap;

	*//**
	 * infantFareBreakDownMap
	 *//*
	private Map<String, BigDecimal> infantFareBreakDownMap;*/

	public String enableTicketNumber = "Y";

	/**
	 * @return the pnrNumber
	 */
	public String getPnrNumber() {
		return pnrNumber;
	}

	/**
	 * @param pnrNumber
	 *            the pnrNumber to set
	 */
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	/**
	 * @return the creatingOfficeId
	 */
	public String getCreatingOfficeId() {
		return creatingOfficeId;
	}

	/**
	 * @param creatingOfficeId
	 *            the creatingOfficeId to set
	 */
	public void setCreatingOfficeId(String creatingOfficeId) {
		this.creatingOfficeId = creatingOfficeId;
	}

	/**
	 * @return the officeId
	 */
	public String getOfficeId() {
		return officeId;
	}

	/**
	 * @param officeId
	 *            the officeId to set
	 */
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	/**
	 * @return the dayTimeTelephone
	 */
	public String getDayTimeTelephone() {
		return dayTimeTelephone;
	}

	/**
	 * @param dayTimeTelephone
	 *            the dayTimeTelephone to set
	 */
	public void setDayTimeTelephone(String dayTimeTelephone) {
		this.dayTimeTelephone = dayTimeTelephone;
	}

	/**
	 * @return the dayTimeTelephoneReferenceNumber
	 */
	public String getDayTimeTelephoneReferenceNumber() {
		return dayTimeTelephoneReferenceNumber;
	}

	/**
	 * @param dayTimeTelephoneReferenceNumber
	 *            the dayTimeTelephoneReferenceNumber to set
	 */
	public void setDayTimeTelephoneReferenceNumber(String dayTimeTelephoneReferenceNumber) {
		this.dayTimeTelephoneReferenceNumber = dayTimeTelephoneReferenceNumber;
	}

	/**
	 * @return the mobileTelephone
	 */
	public String getMobileTelephone() {
		return mobileTelephone;
	}

	/**
	 * @param mobileTelephone
	 *            the mobileTelephone to set
	 */
	public void setMobileTelephone(String mobileTelephone) {
		this.mobileTelephone = mobileTelephone;
	}

	/**
	 * @return the mobileTelephoneReferenceNumber
	 */
	public String getMobileTelephoneReferenceNumber() {
		return mobileTelephoneReferenceNumber;
	}

	/**
	 * @param mobileTelephoneReferenceNumber
	 *            the mobileTelephoneReferenceNumber to set
	 */
	public void setMobileTelephoneReferenceNumber(String mobileTelephoneReferenceNumber) {
		this.mobileTelephoneReferenceNumber = mobileTelephoneReferenceNumber;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress
	 *            the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the emailAddressReferenceNumber
	 */
	public String getEmailAddressReferenceNumber() {
		return emailAddressReferenceNumber;
	}

	/**
	 * @param emailAddressReferenceNumber
	 *            the emailAddressReferenceNumber to set
	 */
	public void setEmailAddressReferenceNumber(String emailAddressReferenceNumber) {
		this.emailAddressReferenceNumber = emailAddressReferenceNumber;
	}

	/**
	 * @return the totalBookingAmount
	 */
	public String getTotalBookingAmount() {
		return totalBookingAmount;
	}

	/**
	 * @param totalBookingAmount
	 *            the totalBookingAmount to set
	 */
	public void setTotalBookingAmount(String totalBookingAmount) {
		this.totalBookingAmount = totalBookingAmount;
	}

	/**
	 * @return the fareDetails
	 */
	public FareVO getFareDetails() {
		return fareDetails;
	}

	/**
	 * @param fareDetails
	 *            the fareDetails to set
	 */
	public void setFareDetails(FareVO fareDetails) {
		this.fareDetails = fareDetails;
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
	 * @return the isPaid
	 */
	public boolean isPaid() {
		return isPaid;
	}

	/**
	 * @param isPaid
	 *            the isPaid to set
	 */
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	/**
	 * @return the isFlown
	 */
	public boolean isFlown() {
		return isFlown;
	}

	/**
	 * @param isFlown
	 *            the isFlown to set
	 */
	public void setFlown(boolean isFlown) {
		this.isFlown = isFlown;
	}

	/**
	 * @return the isTicketed
	 */
	public boolean isTicketed() {
		return isTicketed;
	}

	/**
	 * @param isTicketed
	 *            the isTicketed to set
	 */
	public void setTicketed(boolean isTicketed) {
		this.isTicketed = isTicketed;
	}

	/**
	 * @return the bookingSource
	 */
	public String getBookingSource() {
		return bookingSource;
	}

	/**
	 * @param bookingSource
	 *            the bookingSource to set
	 */
	public void setBookingSource(String bookingSource) {
		this.bookingSource = bookingSource;
	}

	/**
	 * @return the isInternational
	 */
	public boolean isInternational() {
		return isInternational;
	}

	/**
	 * @param isInternational
	 *            the isInternational to set
	 */
	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}

	/**
	 * @return the hasReturn
	 */
	public boolean isHasReturn() {
		return hasReturn;
	}

	/**
	 * @param hasReturn
	 *            the hasReturn to set
	 */
	public void setHasReturn(boolean hasReturn) {
		this.hasReturn = hasReturn;
	}

	/**
	 * @return the pricingClass
	 */
	public String getPricingClass() {
		return pricingClass;
	}

	/**
	 * @param pricingClass
	 *            the pricingClass to set
	 */
	public void setPricingClass(String pricingClass) {
		this.pricingClass = pricingClass;
	}

	/**
	 * @return the isPremiumBooking
	 */
	public boolean isPremiumBooking() {
		return isPremiumBooking;
	}

	/**
	 * @param isPremiumBooking
	 *            the isPremiumBooking to set
	 */
	public void setPremiumBooking(boolean isPremiumBooking) {
		this.isPremiumBooking = isPremiumBooking;
	}

	/**
	 * @return the sknDetailsVO
	 */
	public SKNDetailsVO getSknDetailsVO() {
		return sknDetailsVO;
	}

	/**
	 * @param sknDetailsVO
	 *            the sknDetailsVO to set
	 */
	public void setSknDetailsVO(SKNDetailsVO sknDetailsVO) {
		this.sknDetailsVO = sknDetailsVO;
	}

	/**
	 * @return the originCity
	 */
	public String getOriginCity() {
		return originCity;
	}

	/**
	 * @param originCity
	 *            the originCity to set
	 */
	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	/**
	 * @return the isOPCExist
	 */
	public String getIsOPCExist() {
		return isOPCExist;
	}

	/**
	 * @param isOPCExist
	 *            the isOPCExist to set
	 */
	public void setIsOPCExist(String isOPCExist) {
		this.isOPCExist = isOPCExist;
	}

	/**
	 * @return the alternateContactDetailsVO
	 */
	public AlternateContactDetailsVO getAlternateContactDetailsVO() {
		return alternateContactDetailsVO;
	}

	/**
	 * @param alternateContactDetailsVO
	 *            the alternateContactDetailsVO to set
	 */
	public void setAlternateContactDetailsVO(AlternateContactDetailsVO alternateContactDetailsVO) {
		this.alternateContactDetailsVO = alternateContactDetailsVO;
	}

	

	/**
	 * @return the isGroupBooking
	 */
	public boolean isGroupBooking() {
		return isGroupBooking;
	}

	/**
	 * @param isGroupBooking
	 *            the isGroupBooking to set
	 */
	public void setGroupBooking(boolean isGroupBooking) {
		this.isGroupBooking = isGroupBooking;
	}


	/**
	 * @return the emdAmount
	 */
	public String getEmdAmount() {
		return emdAmount;
	}

	/**
	 * @param emdAmount
	 *            the emdAmount to set
	 */
	public void setEmdAmount(String emdAmount) {
		this.emdAmount = emdAmount;
	}

	/**
	 * @return the emdCurrency
	 */
	public String getEmdCurrency() {
		return emdCurrency;
	}

	/**
	 * @param emdCurrency
	 *            the emdCurrency to set
	 */
	public void setEmdCurrency(String emdCurrency) {
		this.emdCurrency = emdCurrency;
	}

	/**
	 * @return the totalAmountForAdults
	 */
	public BigDecimal getTotalAmountForAdults() {
		return totalAmountForAdults;
	}

	/**
	 * @param totalAmountForAdults
	 *            the totalAmountForAdults to set
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
	 * @param totalAmountForChildren
	 *            the totalAmountForChildren to set
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
	 * @param totalAmountForInfants
	 *            the totalAmountForInfants to set
	 */
	public void setTotalAmountForInfants(BigDecimal totalAmountForInfants) {
		this.totalAmountForInfants = totalAmountForInfants;
	}

	/**
	 * @return the totalAmountWithTaxForAdults
	 */
	public BigDecimal getTotalAmountWithTaxForAdults() {
		return totalAmountWithTaxForAdults;
	}

	/**
	 * @param totalAmountWithTaxForAdults
	 *            the totalAmountWithTaxForAdults to set
	 */
	public void setTotalAmountWithTaxForAdults(BigDecimal totalAmountWithTaxForAdults) {
		this.totalAmountWithTaxForAdults = totalAmountWithTaxForAdults;
	}

	/**
	 * @return the totalAmountWithTaxForChildren
	 */
	public BigDecimal getTotalAmountWithTaxForChildren() {
		return totalAmountWithTaxForChildren;
	}

	/**
	 * @param totalAmountWithTaxForChildren
	 *            the totalAmountWithTaxForChildren to set
	 */
	public void setTotalAmountWithTaxForChildren(BigDecimal totalAmountWithTaxForChildren) {
		this.totalAmountWithTaxForChildren = totalAmountWithTaxForChildren;
	}

	/**
	 * @return the totalAmountWithTaxForInfants
	 */
	public BigDecimal getTotalAmountWithTaxForInfants() {
		return totalAmountWithTaxForInfants;
	}

	/**
	 * @param totalAmountWithTaxForInfants
	 *            the totalAmountWithTaxForInfants to set
	 */
	public void setTotalAmountWithTaxForInfants(BigDecimal totalAmountWithTaxForInfants) {
		this.totalAmountWithTaxForInfants = totalAmountWithTaxForInfants;
	}

	/**
	 * @return the totalAmountWithoutTaxForAdults
	 */
	public BigDecimal getTotalAmountWithoutTaxForAdults() {
		return totalAmountWithoutTaxForAdults;
	}

	/**
	 * @param totalAmountWithoutTaxForAdults
	 *            the totalAmountWithoutTaxForAdults to set
	 */
	public void setTotalAmountWithoutTaxForAdults(BigDecimal totalAmountWithoutTaxForAdults) {
		this.totalAmountWithoutTaxForAdults = totalAmountWithoutTaxForAdults;
	}

	/**
	 * @return the totalAmountWithoutTaxForChildren
	 */
	public BigDecimal getTotalAmountWithoutTaxForChildren() {
		return totalAmountWithoutTaxForChildren;
	}

	/**
	 * @param totalAmountWithoutTaxForChildren
	 *            the totalAmountWithoutTaxForChildren to set
	 */
	public void setTotalAmountWithoutTaxForChildren(BigDecimal totalAmountWithoutTaxForChildren) {
		this.totalAmountWithoutTaxForChildren = totalAmountWithoutTaxForChildren;
	}

	/**
	 * @return the totalAmountWithoutTaxForInfants
	 */
	public BigDecimal getTotalAmountWithoutTaxForInfants() {
		return totalAmountWithoutTaxForInfants;
	}

	/**
	 * @param totalAmountWithoutTaxForInfants
	 *            the totalAmountWithoutTaxForInfants to set
	 */
	public void setTotalAmountWithoutTaxForInfants(BigDecimal totalAmountWithoutTaxForInfants) {
		this.totalAmountWithoutTaxForInfants = totalAmountWithoutTaxForInfants;
	}

	/**
	 * @return the enableTicketNumber
	 */
	public String getEnableTicketNumber() {
		return enableTicketNumber;
	}

	/**
	 * @param enableTicketNumber
	 *            the enableTicketNumber to set
	 */
	public void setEnableTicketNumber(String enableTicketNumber) {
		this.enableTicketNumber = enableTicketNumber;
	}

	public List<TaxVO> getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(List<TaxVO> taxDetails) {
		this.taxDetails = taxDetails;
	}

	public List<FareInfoVO> getFareInfoDetails() {
		return fareInfoDetails;
	}

	public void setFareInfoDetails(List<FareInfoVO> fareInfoDetails) {
		this.fareInfoDetails = fareInfoDetails;
	}
	

}
