package com.ibsplc.pushNotification.vo;

import java.util.List;

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
	 * This is the pax details associated with the PNR
	 */
	private List<PaxVO> passengerDetails;
	
	private String currTime;
	
	public String getCurrTime() {
		return currTime;
	}

	public void setCurrTime(String currTime) {
		this.currTime = currTime;
	}

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
	 * This is the Notify mobile number associated with the PNR
	 */
	private String NotifymobileTelephone;
	private String NotifymobileTelephoneRefNumber;

	public String getNotifymobileTelephone() {
		return NotifymobileTelephone;
	}

	public void setNotifymobileTelephone(String notifymobileTelephone) {
		NotifymobileTelephone = notifymobileTelephone;
	}

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
	 * alternateContactDetailsVO - AlternateContactDetailsVO
	 */
	private AlternateContactDetailsVO alternateContactDetailsVO;

	

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

	public String getNotifymobileTelephoneRefNumber() {
		return NotifymobileTelephoneRefNumber;
	}

	public void setNotifymobileTelephoneRefNumber(String notifymobileTelephoneRefNumber) {
		NotifymobileTelephoneRefNumber = notifymobileTelephoneRefNumber;
	}
	

}
