package com.ibsplc.amadeus.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@JsonInclude(Include.NON_NULL)
public class FareVO extends AbstractVO {
	/**
	 * 
	 */
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
	 * The currency code associated with the PNR. This will be the same as is
	 * got from Amadeus. eg ZAR.
	 */
	private String currencyCode;

	/**
	 * The currency code used for display purposes. This need not be the same as
	 * is got from Amadeus. eg R instead of ZAR.
	 */
	private String mappedCurrencyCode;

	/**
	 * To determine if the PNR is an ITBT ticket, since such tickets are not
	 * eligible for upgrage.
	 */
	private boolean isITBTTicket;

	/**
	 * This variable is used for keeping the split up of the taxes, based on
	 * paxType. The key's possible are ADT, CHD, INF. Taxes which comes as part
	 * of Admin fees for change booking, will come in the arrayList taxVO's,
	 * since its a one time charge and is constant throught the PNR. If this is
	 * not the case, then the details have to be present in this field Also,
	 * when giving FOP for change booking, it is necessary that we specify the
	 * old tax rate, if at all the new tax rate is different.
	 * 
	 * @IMPORTANT...The value present is of type ArrayList of TaxVO. The fare in
	 *                  this TaxVO will be the rate of that tax for that
	 *                  paxType, and will not be the total tax.
	 */
	private HashMap<String, List<TaxVO>> taxDetails;

	/**
	 * This variable is used for keeping the split up of the mileage base fare,
	 * based on paxType. The key's possible are ADT, B15, CHD, INF.
	 * 
	 * @IMPORTANT...The value present is of type String, which will be the fare
	 *                  rate of that paxType, and will not be the total mileage
	 *                  of all the pax in that type. This mileage fare is the
	 *                  sum of the miles of all sectors.
	 */
	private HashMap<String, String> mileageDetails;

	/**
	 * This variable is used for keeping the splite up of the base fare, based
	 * on paxType. The key's possible are ADT, CHD, INF. When giving FOP for
	 * change booking, it is necessary that we specify the old fare rate, if at
	 * all the new fare rate is different.
	 * 
	 * @IMPORTANT...The value present is of type String, which will be the fare
	 *                  rate of that paxType, and will not be the total fare of
	 *                  all the pax in that type. This base fare is the sum of
	 *                  the base fare of both the flown and unflown sectors.
	 */
	private Map<String, String> fareDetails;

	/**
	 * This list contain the segment information VO
	 */
	private List<SegmentInfoVO> segmentInfo;

	private PenaltyDetailsVO penaltyDetails;

	/**
	 * @return the totalTax
	 */
	public String getTotalTax() {
		return totalTax;
	}

	/**
	 * @param totalTax
	 *            the totalTax to set
	 */
	public void setTotalTax(String totalTax) {
		this.totalTax = totalTax;
	}

	/**
	 * @return the totalFare
	 */
	public String getTotalFare() {
		return totalFare;
	}

	/**
	 * @param totalFare
	 *            the totalFare to set
	 */
	public void setTotalFare(String totalFare) {
		this.totalFare = totalFare;
	}

	/**
	 * @return the totalMileage
	 */
	public String getTotalMileage() {
		return totalMileage;
	}

	/**
	 * @param totalMileage
	 *            the totalMileage to set
	 */
	public void setTotalMileage(String totalMileage) {
		this.totalMileage = totalMileage;
	}

	/**
	 * @return the fareClassUsed
	 */
	public String getFareClassUsed() {
		return fareClassUsed;
	}

	/**
	 * @param fareClassUsed
	 *            the fareClassUsed to set
	 */
	public void setFareClassUsed(String fareClassUsed) {
		this.fareClassUsed = fareClassUsed;
	}

	/**
	 * @return the baseFare
	 */
	public String getBaseFare() {
		return baseFare;
	}

	/**
	 * @param baseFare
	 *            the baseFare to set
	 */
	public void setBaseFare(String baseFare) {
		this.baseFare = baseFare;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode
	 *            the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the mappedCurrencyCode
	 */
	public String getMappedCurrencyCode() {
		return mappedCurrencyCode;
	}

	/**
	 * @param mappedCurrencyCode
	 *            the mappedCurrencyCode to set
	 */
	public void setMappedCurrencyCode(String mappedCurrencyCode) {
		this.mappedCurrencyCode = mappedCurrencyCode;
	}

	/**
	 * @return the isITBTTicket
	 */
	public boolean isITBTTicket() {
		return isITBTTicket;
	}

	/**
	 * @param isITBTTicket
	 *            the isITBTTicket to set
	 */
	public void setITBTTicket(boolean isITBTTicket) {
		this.isITBTTicket = isITBTTicket;
	}

	/**
	 * @return the taxDetails
	 */
	public HashMap<String, List<TaxVO>> getTaxDetails() {
		return taxDetails;
	}

	/**
	 * @param taxDetails
	 *            the taxDetails to set
	 */
	public void setTaxDetails(HashMap<String, List<TaxVO>> taxDetails) {
		this.taxDetails = taxDetails;
	}

	/**
	 * @return the mileageDetails
	 */
	public HashMap<String, String> getMileageDetails() {
		return mileageDetails;
	}

	/**
	 * @param mileageDetails
	 *            the mileageDetails to set
	 */
	public void setMileageDetails(HashMap<String, String> mileageDetails) {
		this.mileageDetails = mileageDetails;
	}

	/**
	 * @return the fareDetails
	 */
	public Map<String, String> getFareDetails() {
		return fareDetails;
	}

	/**
	 * @param fareDetails
	 *            the fareDetails to set
	 */
	public void setFareDetails(Map<String, String> fareDetails) {
		this.fareDetails = fareDetails;
	}

	/**
	 * @return the segmentInfo
	 */
	public List<SegmentInfoVO> getSegmentInfo() {
		return segmentInfo;
	}

	/**
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
	 * @param penaltyDetails
	 *            the penaltyDetails to set
	 */
	public void setPenaltyDetails(PenaltyDetailsVO penaltyDetails) {
		this.penaltyDetails = penaltyDetails;
	}

}
