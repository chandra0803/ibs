package com.ibsplc.amadeus.vo;

import java.util.ArrayList;
import java.util.List;

public class TypicalCarDataVO extends AbstractVO {
	
	private List<VehicleInformationVO> vehicleInformationDetails = new ArrayList<VehicleInformationVO>();
	private CompanyIdentificationVO companyIdentificationDetails;
	private List <LocationInfoVO> locationInfoDetails = new ArrayList<LocationInfoVO>();
	private PickupDropoffTimesVO pickupDropoffTimesDetails;
	private CancelOrConfirmNbrVO cancelOrConfirmNbrDetails;
	private RateCodeGroupVO rateCodeGroupDetails;
	private List<CustomerInfoVO> customerInfoDetails = new ArrayList<CustomerInfoVO>();
 
	private List<RateInfoVO> rateInfoDetails = new ArrayList<RateInfoVO>();
	private PaymentVO paymentDetails;
	private BookingSourceVO bookingSourceDetails;
	private List<MarketingInfoVO> marketingInfoDetails = new ArrayList<MarketingInfoVO>();
	private List<SupleInfoVO> supleInfoDetails = new ArrayList<SupleInfoVO>();
	private AttributeVO attributeDetails;
	private List<ReferenceVO> referenceDetails = new ArrayList<ReferenceVO>();
	/**
	 * @return the vehicleInformationDetails
	 */
	public List<VehicleInformationVO> getVehicleInformationDetails() {
		return vehicleInformationDetails;
	}
	/**
	 * @param vehicleInformationDetails the vehicleInformationDetails to set
	 */
	public void setVehicleInformationDetails(List<VehicleInformationVO> vehicleInformationDetails) {
		this.vehicleInformationDetails = vehicleInformationDetails;
	}
	/**
	 * @return the companyIdentificationDetails
	 */
	public CompanyIdentificationVO getCompanyIdentificationDetails() {
		return companyIdentificationDetails;
	}
	/**
	 * @param companyIdentificationDetails the companyIdentificationDetails to set
	 */
	public void setCompanyIdentificationDetails(CompanyIdentificationVO companyIdentificationDetails) {
		this.companyIdentificationDetails = companyIdentificationDetails;
	}
	 

	/**
	 * @return the locationInfoDetails
	 */
	public List<LocationInfoVO> getLocationInfoDetails() {
		return locationInfoDetails;
	}
	/**
	 * @param locationInfoDetails the locationInfoDetails to set
	 */
	public void setLocationInfoDetails(List<LocationInfoVO> locationInfoDetails) {
		this.locationInfoDetails = locationInfoDetails;
	}
	/**
	 * @return the pickupDropoffTimesDetails
	 */
	public PickupDropoffTimesVO getPickupDropoffTimesDetails() {
		return pickupDropoffTimesDetails;
	}
	/**
	 * @param pickupDropoffTimesDetails the pickupDropoffTimesDetails to set
	 */
	public void setPickupDropoffTimesDetails(PickupDropoffTimesVO pickupDropoffTimesDetails) {
		this.pickupDropoffTimesDetails = pickupDropoffTimesDetails;
	}
	/**
	 * @return the cancelOrConfirmNbrDetails
	 */
	public CancelOrConfirmNbrVO getCancelOrConfirmNbrDetails() {
		return cancelOrConfirmNbrDetails;
	}
	/**
	 * @param cancelOrConfirmNbrDetails the cancelOrConfirmNbrDetails to set
	 */
	public void setCancelOrConfirmNbrDetails(CancelOrConfirmNbrVO cancelOrConfirmNbrDetails) {
		this.cancelOrConfirmNbrDetails = cancelOrConfirmNbrDetails;
	}
	/**
	 * @return the rateCodeGroupDetails
	 */
	public RateCodeGroupVO getRateCodeGroupDetails() {
		return rateCodeGroupDetails;
	}
	/**
	 * @param rateCodeGroupDetails the rateCodeGroupDetails to set
	 */
	public void setRateCodeGroupDetails(RateCodeGroupVO rateCodeGroupDetails) {
		this.rateCodeGroupDetails = rateCodeGroupDetails;
	}
	/**
	 * @return the customerInfoDetails
	 */
	public List<CustomerInfoVO> getCustomerInfoDetails() {
		return customerInfoDetails;
	}
	/**
	 * @param customerInfoDetails the customerInfoDetails to set
	 */
	public void setCustomerInfoDetails(List<CustomerInfoVO> customerInfoDetails) {
		this.customerInfoDetails = customerInfoDetails;
	}
 
	/**
	 * @return the rateInfoDetails
	 */
	public List<RateInfoVO> getRateInfoDetails() {
		return rateInfoDetails;
	}
	/**
	 * @param rateInfoDetails the rateInfoDetails to set
	 */
	public void setRateInfoDetails(List<RateInfoVO> rateInfoDetails) {
		this.rateInfoDetails = rateInfoDetails;
	}
	/**
	 * @return the paymentDetails
	 */
	public PaymentVO getPaymentDetails() {
		return paymentDetails;
	}
	/**
	 * @param paymentDetails the paymentDetails to set
	 */
	public void setPaymentDetails(PaymentVO paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	/**
	 * @return the bookingSourceDetails
	 */
	public BookingSourceVO getBookingSourceDetails() {
		return bookingSourceDetails;
	}
	/**
	 * @param bookingSourceDetails the bookingSourceDetails to set
	 */
	public void setBookingSourceDetails(BookingSourceVO bookingSourceDetails) {
		this.bookingSourceDetails = bookingSourceDetails;
	}
 
	/**
	 * @return the marketingInfoDetails
	 */
	public List<MarketingInfoVO> getMarketingInfoDetails() {
		return marketingInfoDetails;
	}
	/**
	 * @param marketingInfoDetails the marketingInfoDetails to set
	 */
	public void setMarketingInfoDetails(List<MarketingInfoVO> marketingInfoDetails) {
		this.marketingInfoDetails = marketingInfoDetails;
	}
	/**
	 * @return the supleInfoDetails
	 */
	public List<SupleInfoVO> getSupleInfoDetails() {
		return supleInfoDetails;
	}
	/**
	 * @param supleInfoDetails the supleInfoDetails to set
	 */
	public void setSupleInfoDetails(List<SupleInfoVO> supleInfoDetails) {
		this.supleInfoDetails = supleInfoDetails;
	}
	/**
	 * @return the attributeDetails
	 */
	public AttributeVO getAttributeDetails() {
		return attributeDetails;
	}
	/**
	 * @param attributeDetails the attributeDetails to set
	 */
	public void setAttributeDetails(AttributeVO attributeDetails) {
		this.attributeDetails = attributeDetails;
	}
	/**
	 * @return the referenceDetails
	 */
	public List<ReferenceVO> getReferenceDetails() {
		return referenceDetails;
	}
	/**
	 * @param referenceDetails the referenceDetails to set
	 */
	public void setReferenceDetails(List<ReferenceVO> referenceDetails) {
		this.referenceDetails = referenceDetails;
	}
	 
	 	
 
}
