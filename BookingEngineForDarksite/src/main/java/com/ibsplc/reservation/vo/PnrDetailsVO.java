package com.ibsplc.reservation.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibsplc.common.vo.AlternateContactDetailsVO;
import com.ibsplc.common.vo.EMDDetailsVO;
import com.ibsplc.common.vo.FareInfoVO;
import com.ibsplc.common.vo.FareVO;
import com.ibsplc.common.vo.ItineraryVO;
import com.ibsplc.common.vo.PaxVO;
import com.ibsplc.common.vo.SKNDetailsVO;
import com.ibsplc.common.vo.TaxVO;
import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class PnrDetailsVO extends AbstractVO implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * The PNR number associated with booking
	 */
	private String pnrNumber;
	/**
	 * This is the officeId using which the PNR was created
	 */
	private String creatingOfficeId;
	/**
	 * This is the officeId using which the PNR was created
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
	/**
	 * This is the fare associated with the PNR
	 */
	private FareVO fareDetails = new FareVO();
	/**
	 * This contain the passenger list for the Rebooking - list of PaxVO
	 */
	private List<PaxVO> passengerDetails = new ArrayList<PaxVO>();
	/**
	 * This contain the Tax Details list for the EMD/ETKT
	 */
	private List<TaxVO> taxDetails = new ArrayList<TaxVO>();
	/**
	 * This contain the Fare Details list for the EMD/ETKT
	 */
	private List<FareInfoVO> fareInfoDetails = new ArrayList<FareInfoVO>();
	/**
	 * This contain the EMD list for the booking
	 */
	private List<EMDDetailsVO> emdDetails = new ArrayList<EMDDetailsVO>();
	/**
	 * This is the flight details associated with the PNR
	 */
	private List<ItineraryVO> itineraryDetails = new ArrayList<ItineraryVO>();
	/**
	 * To determine if the booking was created from Airlink direct channel, Call
	 * Center etc
	 */
	private List<FareList> fareLists=new ArrayList<FareList>();
	
	private List<RemarkList> remarkLists=new ArrayList<RemarkList>();
	private String bookingSource;
	/**
	 * This Field is used to find the pricing class
	 */
	private String pricingClass;
	/**
	 * To indicate whether the booking is a premium booking
	 */
	private boolean premiumBooking;
	/**
	 * This VO is used to store the SKN details
	 */
	private SKNDetailsVO sknDetailsVO = new SKNDetailsVO();
	/**
	 * originCity
	 */
	private String originCity;
	/**
	 * isOPCExist
	 */
	private String isOPCExist;
	/**
	 * alternateContactDetailsVO - AlternateContactDetailsVO
	 */
	private AlternateContactDetailsVO alternateContactDetailsVO = new AlternateContactDetailsVO();
	/**
	 * The amount pending to be paid for all EMDs which are not issued
	 */
	private String emdAmount;
	/**
	 * The currency against all the EMDs
	 */
	private String emdCurrency;
	/**
	 * total amount without tax for adults
	 */
	private BigDecimal totalAmountWithoutTaxForAdults;
	/**
	 * total amount for Infants
	 */
	private BigDecimal totalAmountForInfants;
	/**
	 * total amountfor Children
	 */
	private BigDecimal totalAmountForChildren;
	/**
	 * total amount for adults
	 */
	private BigDecimal totalAmountForAdults;
	/**
	 * total amount with tax for infants
	 */
	private BigDecimal totalAmountWithTaxForInfants;
	/**
	 * total amount without tax for children
	 */
	private BigDecimal totalAmountWithoutTaxForChildren;
	/**
	 * total amount with tax for children
	 */
	private BigDecimal totalAmountWithTaxForChildren;
	/**
	 * total amount without tax for infants
	 */
	private BigDecimal totalAmountWithoutTaxForInfants;
	/**
	 * total amount with tax for adults
	 */
	private BigDecimal totalAmountWithTaxForAdults;
	/**
	 * adultFareBreakDownMap
	 */
	private Map<String, BigDecimal> adultFareBreakDownMap = new HashMap<String, BigDecimal>();
	/**
	 * childFareBreakDownMap
	 */
	private Map<String, BigDecimal> childFareBreakDownMap = new HashMap<String, BigDecimal>();
	/**
	 * infantFareBreakDownMap
	 */
	private Map<String, BigDecimal> infantFareBreakDownMap = new HashMap<String, BigDecimal>();
	/**
	 * enableTicketNumber
	 */
	private String enableTicketNumber;
	/**
	 * To determine if the PNR has been ticketed.
	 */
	private boolean ticketed;
	/**
	 * To determine if the PNR has been paid
	 */
	private boolean paid;
	/**
	 * This indicates whether the PNR is of an international booking or a domestic
	 * one. At present, this value is used for change booking, to determine the next
	 * possible classes of travel. Its possible, that the same thing will be needed
	 * in the future also
	 */
	private boolean international;
	/**
	 * To determine if the itinerary has already flown
	 */
	private boolean flown;
	/**
	 * To determine if the booking is a group booking. The PNR will have a 'sk cuff
	 * sa' string
	 */
	private boolean groupBooking;
	/**
	 * This indicates whehter tbe PNR which we are changing has a return flight. It
	 * does not matter whether only one of the flights is being changed. This value
	 * should be populated from bookingVO
	 */
	private boolean hasReturn;
	
	private BigDecimal totalBookingAmount;

	public String getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getCreatingOfficeId() {
		return creatingOfficeId;
	}

	public void setCreatingOfficeId(String creatingOfficeId) {
		this.creatingOfficeId = creatingOfficeId;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	public String getDayTimeTelephone() {
		return dayTimeTelephone;
	}

	public void setDayTimeTelephone(String dayTimeTelephone) {
		this.dayTimeTelephone = dayTimeTelephone;
	}

	public String getDayTimeTelephoneReferenceNumber() {
		return dayTimeTelephoneReferenceNumber;
	}

	public void setDayTimeTelephoneReferenceNumber(String dayTimeTelephoneReferenceNumber) {
		this.dayTimeTelephoneReferenceNumber = dayTimeTelephoneReferenceNumber;
	}

	public String getMobileTelephone() {
		return mobileTelephone;
	}

	public void setMobileTelephone(String mobileTelephone) {
		this.mobileTelephone = mobileTelephone;
	}

	public String getMobileTelephoneReferenceNumber() {
		return mobileTelephoneReferenceNumber;
	}

	public void setMobileTelephoneReferenceNumber(String mobileTelephoneReferenceNumber) {
		this.mobileTelephoneReferenceNumber = mobileTelephoneReferenceNumber;
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

	public FareVO getFareDetails() {
		return fareDetails;
	}

	public void setFareDetails(FareVO fareDetails) {
		this.fareDetails = fareDetails;
	}

	public List<PaxVO> getPassengerDetails() {
		return passengerDetails;
	}

	public void setPassengerDetails(List<PaxVO> passengerDetails) {
		this.passengerDetails = passengerDetails;
	}

	public String getBookingSource() {
		return bookingSource;
	}

	public void setBookingSource(String bookingSource) {
		this.bookingSource = bookingSource;
	}

	public String getPricingClass() {
		return pricingClass;
	}

	public void setPricingClass(String pricingClass) {
		this.pricingClass = pricingClass;
	}

	public boolean isPremiumBooking() {
		return premiumBooking;
	}

	public void setPremiumBooking(boolean premiumBooking) {
		this.premiumBooking = premiumBooking;
	}

	public SKNDetailsVO getSknDetailsVO() {
		return sknDetailsVO;
	}

	public void setSknDetailsVO(SKNDetailsVO sknDetailsVO) {
		this.sknDetailsVO = sknDetailsVO;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getIsOPCExist() {
		return isOPCExist;
	}

	public void setIsOPCExist(String isOPCExist) {
		this.isOPCExist = isOPCExist;
	}

	public AlternateContactDetailsVO getAlternateContactDetailsVO() {
		return alternateContactDetailsVO;
	}

	public void setAlternateContactDetailsVO(AlternateContactDetailsVO alternateContactDetailsVO) {
		this.alternateContactDetailsVO = alternateContactDetailsVO;
	}

	public String getEmdAmount() {
		return emdAmount;
	}

	public void setEmdAmount(String emdAmount) {
		this.emdAmount = emdAmount;
	}

	public String getEmdCurrency() {
		return emdCurrency;
	}

	public void setEmdCurrency(String emdCurrency) {
		this.emdCurrency = emdCurrency;
	}

	public BigDecimal getTotalAmountWithoutTaxForAdults() {
		return totalAmountWithoutTaxForAdults;
	}

	public void setTotalAmountWithoutTaxForAdults(BigDecimal totalAmountWithoutTaxForAdults) {
		this.totalAmountWithoutTaxForAdults = totalAmountWithoutTaxForAdults;
	}

	public BigDecimal getTotalAmountForInfants() {
		return totalAmountForInfants;
	}

	public void setTotalAmountForInfants(BigDecimal totalAmountForInfants) {
		this.totalAmountForInfants = totalAmountForInfants;
	}

	public BigDecimal getTotalAmountForChildren() {
		return totalAmountForChildren;
	}

	public void setTotalAmountForChildren(BigDecimal totalAmountForChildren) {
		this.totalAmountForChildren = totalAmountForChildren;
	}

	public BigDecimal getTotalAmountForAdults() {
		return totalAmountForAdults;
	}

	public void setTotalAmountForAdults(BigDecimal totalAmountForAdults) {
		this.totalAmountForAdults = totalAmountForAdults;
	}

	public BigDecimal getTotalAmountWithTaxForInfants() {
		return totalAmountWithTaxForInfants;
	}

	public void setTotalAmountWithTaxForInfants(BigDecimal totalAmountWithTaxForInfants) {
		this.totalAmountWithTaxForInfants = totalAmountWithTaxForInfants;
	}

	public BigDecimal getTotalAmountWithoutTaxForChildren() {
		return totalAmountWithoutTaxForChildren;
	}

	public void setTotalAmountWithoutTaxForChildren(BigDecimal totalAmountWithoutTaxForChildren) {
		this.totalAmountWithoutTaxForChildren = totalAmountWithoutTaxForChildren;
	}

	public BigDecimal getTotalAmountWithTaxForChildren() {
		return totalAmountWithTaxForChildren;
	}

	public void setTotalAmountWithTaxForChildren(BigDecimal totalAmountWithTaxForChildren) {
		this.totalAmountWithTaxForChildren = totalAmountWithTaxForChildren;
	}

	public BigDecimal getTotalAmountWithoutTaxForInfants() {
		return totalAmountWithoutTaxForInfants;
	}

	public void setTotalAmountWithoutTaxForInfants(BigDecimal totalAmountWithoutTaxForInfants) {
		this.totalAmountWithoutTaxForInfants = totalAmountWithoutTaxForInfants;
	}

	public BigDecimal getTotalAmountWithTaxForAdults() {
		return totalAmountWithTaxForAdults;
	}

	public void setTotalAmountWithTaxForAdults(BigDecimal totalAmountWithTaxForAdults) {
		this.totalAmountWithTaxForAdults = totalAmountWithTaxForAdults;
	}

	public Map<String, BigDecimal> getAdultFareBreakDownMap() {
		return adultFareBreakDownMap;
	}

	public void setAdultFareBreakDownMap(Map<String, BigDecimal> adultFareBreakDownMap) {
		this.adultFareBreakDownMap = adultFareBreakDownMap;
	}

	public Map<String, BigDecimal> getChildFareBreakDownMap() {
		return childFareBreakDownMap;
	}

	public void setChildFareBreakDownMap(Map<String, BigDecimal> childFareBreakDownMap) {
		this.childFareBreakDownMap = childFareBreakDownMap;
	}

	public Map<String, BigDecimal> getInfantFareBreakDownMap() {
		return infantFareBreakDownMap;
	}

	public void setInfantFareBreakDownMap(Map<String, BigDecimal> infantFareBreakDownMap) {
		this.infantFareBreakDownMap = infantFareBreakDownMap;
	}

	public String getEnableTicketNumber() {
		return enableTicketNumber;
	}

	public void setEnableTicketNumber(String enableTicketNumber) {
		this.enableTicketNumber = enableTicketNumber;
	}

	public boolean isTicketed() {
		return ticketed;
	}

	public void setTicketed(boolean ticketed) {
		this.ticketed = ticketed;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public boolean isInternational() {
		return international;
	}

	public void setInternational(boolean international) {
		this.international = international;
	}

	public boolean isFlown() {
		return flown;
	}

	public void setFlown(boolean flown) {
		this.flown = flown;
	}

	public boolean isGroupBooking() {
		return groupBooking;
	}

	public void setGroupBooking(boolean groupBooking) {
		this.groupBooking = groupBooking;
	}

	public boolean isHasReturn() {
		return hasReturn;
	}

	public void setHasReturn(boolean hasReturn) {
		this.hasReturn = hasReturn;
	}

	public List<ItineraryVO> getItineraryDetails() {
		return itineraryDetails;
	}

	public void setItineraryDetails(List<ItineraryVO> itineraryDetails) {
		this.itineraryDetails = itineraryDetails;
	}

	public List<EMDDetailsVO> getEmdDetails() {
		return emdDetails;
	}

	public void setEmdDetails(List<EMDDetailsVO> emdDetails) {
		this.emdDetails = emdDetails;
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

	public List<FareList> getFareLists() {
		return fareLists;
	}

	public void setFareLists(List<FareList> fareLists) {
		this.fareLists = fareLists;
	}

	public List<RemarkList> getRemarkLists() {
		return remarkLists;
	}

	public void setRemarkLists(List<RemarkList> remarkLists) {
		this.remarkLists = remarkLists;
	}

	@Override
	public String toString() {
		return "PnrDetailsVO [pnrNumber=" + pnrNumber + ", creatingOfficeId=" + creatingOfficeId + ", officeId="
				+ officeId + ", dayTimeTelephone=" + dayTimeTelephone + ", dayTimeTelephoneReferenceNumber="
				+ dayTimeTelephoneReferenceNumber + ", mobileTelephone=" + mobileTelephone
				+ ", mobileTelephoneReferenceNumber=" + mobileTelephoneReferenceNumber + ", emailAddress="
				+ emailAddress + ", emailAddressReferenceNumber=" + emailAddressReferenceNumber + ", fareDetails="
				+ fareDetails + ", passengerDetails=" + passengerDetails + ", taxDetails=" + taxDetails
				+ ", fareInfoDetails=" + fareInfoDetails + ", emdDetails=" + emdDetails + ", itineraryDetails="
				+ itineraryDetails + ", fareLists=" + fareLists + ", remarkLists=" + remarkLists + ", bookingSource="
				+ bookingSource + ", pricingClass=" + pricingClass + ", premiumBooking=" + premiumBooking
				+ ", sknDetailsVO=" + sknDetailsVO + ", originCity=" + originCity + ", isOPCExist=" + isOPCExist
				+ ", alternateContactDetailsVO=" + alternateContactDetailsVO + ", emdAmount=" + emdAmount
				+ ", emdCurrency=" + emdCurrency + ", totalAmountWithoutTaxForAdults=" + totalAmountWithoutTaxForAdults
				+ ", totalAmountForInfants=" + totalAmountForInfants + ", totalAmountForChildren="
				+ totalAmountForChildren + ", totalAmountForAdults=" + totalAmountForAdults
				+ ", totalAmountWithTaxForInfants=" + totalAmountWithTaxForInfants
				+ ", totalAmountWithoutTaxForChildren=" + totalAmountWithoutTaxForChildren
				+ ", totalAmountWithTaxForChildren=" + totalAmountWithTaxForChildren
				+ ", totalAmountWithoutTaxForInfants=" + totalAmountWithoutTaxForInfants
				+ ", totalAmountWithTaxForAdults=" + totalAmountWithTaxForAdults + ", adultFareBreakDownMap="
				+ adultFareBreakDownMap + ", childFareBreakDownMap=" + childFareBreakDownMap
				+ ", infantFareBreakDownMap=" + infantFareBreakDownMap + ", enableTicketNumber=" + enableTicketNumber
				+ ", ticketed=" + ticketed + ", paid=" + paid + ", international=" + international + ", flown=" + flown
				+ ", groupBooking=" + groupBooking + ", hasReturn=" + hasReturn + ", totalBookingAmount="
				+ totalBookingAmount + "]";
	}

}
