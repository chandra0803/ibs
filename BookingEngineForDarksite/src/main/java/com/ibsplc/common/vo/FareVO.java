package com.ibsplc.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class FareVO extends AbstractVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * The total totalTax associated with the PNR
	 */
	private String totalTax;
	/**
	 * The (tax + basefare) associated with the PNR
	 */
	private String totalFare;
	
	/**
	 * The total amount paid when change booking was made
	 */
	private String totalRebookFare;

	/**
	 * The total mileage associated with the PNR
	 */
	private String totalMileage;

	/**
	 * The fare class used for pricing the PNR
	 */
	private String fareClassUsed;

	/**
	 * The total base fare associated with the PNR
	 */
	private String baseFare;

	/**
	 * The currency code associated with the PNR. This will be the same as is got
	 * from Amadeus. eg ZAR
	 */
	private String currencyCode;

	/**
	 * The currency code used for display purposes. This need not be the same as is
	 * got from Amadeus. eg R instead of ZAR
	 */
	private String mappedCurrencyCode;

	/**
	 * To determine if the PNR is an ITBT ticket, since such tickets are not
	 * eligible for upgrade
	 */
	private boolean isITBTTicket;
	/**
	 * This variable is used for keeping the split up of the taxes, based on
	 * paxType. The key's possible are ADT, CHD, INF. Taxes which comes as part of
	 * Admin fees for change booking, will come in the arrayList taxVO's, since its
	 * a one time charge and is constant throughout the PNR. If this is not the
	 * case, then the details have to be present in this field Also, when giving FOP
	 * for change booking, it is necessary that we specify the old tax rate, if at
	 * all the new tax rate is different.
	 * 
	 * @IMPORTANT...The value present is of type ArrayList of TaxVO. The fare in
	 *                  this TaxVO will be the rate of that tax for that paxType,
	 *                  and will not be the total tax.
	 */
	private Map<String, List<TaxVO>> taxDetails = new HashMap<String, List<TaxVO>>();

	/**
	 * This variable is used for keeping the split up of the mileage base fare,
	 * based on paxType. The key's possible are ADT, B15, CHD, INF.
	 * 
	 * @IMPORTANT...The value present is of type String, which will be the fare rate
	 *                  of that paxType, and will not be the total mileage of all
	 *                  the pax in that type. This mileage fare is the sum of the
	 *                  miles of all sectors.
	 */
	private Map<String, String> mileageDetails = new HashMap<String, String>();

	/**
	 * This variable is used for keeping the split up of the base fare, based on
	 * paxType. The key's possible are ADT, CHD, INF. When giving FOP for change
	 * booking, it is necessary that we specify the old fare rate, if at all the new
	 * fare rate is different.
	 * 
	 * @IMPORTANT...The value present is of type String, which will be the fare rate
	 *                  of that paxType, and will not be the total fare of all the
	 *                  pax in that type. This base fare is the sum of the base fare
	 *                  of both the flown and unflown sectors.
	 */
	private Map<String, String> fareDetails = new HashMap<String, String>();

	/**
	 * This list contain the segment information VO
	 */
	private List<SegmentInfoVO> segmentInfo = new ArrayList<SegmentInfoVO>();
	
	private PenaltyDetailsVO penaltyDetails;

	/**
	 * getTotalTax
	 * 
	 * @return the totalTax
	 */
	public String getTotalTax() {
		return totalTax;
	}

	/**
	 * To set totalTax
	 * 
	 * @param totalTax
	 *            the totalTax to set
	 */
	public void setTotalTax(String totalTax) {
		this.totalTax = totalTax;
	}

	/**
	 * getTotalFare
	 * 
	 * @return the totalFare
	 */
	public String getTotalFare() {
		return totalFare;
	}

	/**
	 * To set totalFare
	 * 
	 * @param totalFare
	 *            the totalFare to set
	 */
	public void setTotalFare(String totalFare) {
		this.totalFare = totalFare;
	}

	/**
	 * getTotalMileage
	 * 
	 * @return the totalMileage
	 */
	public String getTotalMileage() {
		return totalMileage;
	}

	/**
	 * To set totalMileage
	 * 
	 * @param totalMileage
	 *            the totalMileage to set
	 */
	public void setTotalMileage(String totalMileage) {
		this.totalMileage = totalMileage;
	}

	/**
	 * getFareClassUsed
	 * 
	 * @return the fareClassUsed
	 */
	public String getFareClassUsed() {
		return fareClassUsed;
	}

	/**
	 * To set fareClassUsed
	 * 
	 * @param fareClassUsed
	 *            the fareClassUsed to set
	 */
	public void setFareClassUsed(String fareClassUsed) {
		this.fareClassUsed = fareClassUsed;
	}

	/**
	 * getBaseFare
	 * 
	 * @return the baseFare
	 */
	public String getBaseFare() {
		return baseFare;
	}

	/**
	 * To set baseFare
	 * 
	 * @param baseFare
	 *            the baseFare to set
	 */
	public void setBaseFare(String baseFare) {
		this.baseFare = baseFare;
	}

	/**
	 * getCurrencyCode
	 * 
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * To set currencyCode
	 * 
	 * @param currencyCode
	 *            the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * getMappedCurrencyCode
	 * 
	 * @return the mappedCurrencyCode
	 */
	public String getMappedCurrencyCode() {
		return mappedCurrencyCode;
	}

	/**
	 * To set mappedCurrencyCode
	 * 
	 * @param mappedCurrencyCode
	 *            the mappedCurrencyCode to set
	 */
	public void setMappedCurrencyCode(String mappedCurrencyCode) {
		this.mappedCurrencyCode = mappedCurrencyCode;
	}

	/**
	 * isITBTTicket
	 * 
	 * @return the isITBTTicket
	 */
	public boolean isITBTTicket() {
		return isITBTTicket;
	}

	/**
	 * To set isITBTTicket
	 * 
	 * @param isITBTTicket
	 *            the isITBTTicket to set
	 */
	public void setITBTTicket(boolean isITBTTicket) {
		this.isITBTTicket = isITBTTicket;
	}

	/**
	 * getTaxDetails
	 * 
	 * @return the taxDetails
	 */
	public Map<String, List<TaxVO>> getTaxDetails() {
		return taxDetails;
	}

	/**
	 * getMileageDetails
	 * 
	 * @return the mileageDetails
	 */
	public Map<String, String> getMileageDetails() {
		return mileageDetails;
	}

	/**
	 * To set mileageDetails
	 * 
	 * @param mileageDetails
	 *            the mileageDetails to set
	 */
	public void setMileageDetails(Map<String, String> mileageDetails) {
		this.mileageDetails = mileageDetails;
	}

	/**
	 * To set taxDetails
	 * 
	 * @param taxDetails
	 *            the taxDetails to set
	 */
	public void setTaxDetails(Map<String, List<TaxVO>> taxDetails) {
		this.taxDetails = taxDetails;
	}

	/**
	 * getSegmentInfo
	 * 
	 * @return the segmentInfo
	 */
	public List<SegmentInfoVO> getSegmentInfo() {
		return segmentInfo;
	}

	/**
	 * getFareDetails
	 * 
	 * @return the fareDetails
	 */
	public Map<String, String> getFareDetails() {
		return fareDetails;
	}

	/**
	 * To set fareDetails
	 * 
	 * @param fareDetails
	 *            the fareDetails to set
	 */
	public void setFareDetails(Map<String, String> fareDetails) {
		this.fareDetails = fareDetails;
	}

	/**
	 * To set segmentInfo
	 * 
	 * @param segmentInfo
	 *            the segmentInfo to set
	 */
	public void setSegmentInfo(List<SegmentInfoVO> segmentInfo) {
		this.segmentInfo = segmentInfo;
	}

	/**
	 * @return the penaltyDetails
	 */
	public PenaltyDetailsVO getPenaltyDetails() {
		return penaltyDetails;
	}

	/**
	 * @param penaltyDetails the penaltyDetails to set
	 */
	public void setPenaltyDetails(PenaltyDetailsVO penaltyDetails) {
		this.penaltyDetails = penaltyDetails;
	}

	/**
	 * @return the totalRebookFare
	 */
	public String getTotalRebookFare() {
		return totalRebookFare;
	}

	/**
	 * @param totalRebookFare the totalRebookFare to set
	 */
	public void setTotalRebookFare(String totalRebookFare) {
		this.totalRebookFare = totalRebookFare;
	}

	@Override
	public String toString() {
		return "FareVO [totalTax=" + totalTax + ", totalFare=" + totalFare + ", totalRebookFare=" + totalRebookFare
				+ ", totalMileage=" + totalMileage + ", fareClassUsed=" + fareClassUsed + ", baseFare=" + baseFare
				+ ", currencyCode=" + currencyCode + ", mappedCurrencyCode=" + mappedCurrencyCode + ", isITBTTicket="
				+ isITBTTicket + ", taxDetails=" + taxDetails + ", mileageDetails=" + mileageDetails + ", fareDetails="
				+ fareDetails + ", segmentInfo=" + segmentInfo + ", penaltyDetails=" + penaltyDetails + "]";
	}

}
