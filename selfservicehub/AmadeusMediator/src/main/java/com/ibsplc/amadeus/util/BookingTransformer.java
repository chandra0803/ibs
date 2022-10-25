package com.ibsplc.amadeus.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amadeus.xml.pnracc_17_1_1a.AdditionalProductDetailsTypeI;
import com.amadeus.xml.pnracc_17_1_1a.ElementManagementSegmentType;
import com.amadeus.xml.pnracc_17_1_1a.LongFreeTextType;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply.DataElementsMaster.DataElementsIndiv;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply.OriginDestinationDetails.ItineraryInfo;
import com.amadeus.xml.pnracc_17_1_1a.ProductDateTimeTypeI270055C;
import com.amadeus.xml.pnracc_17_1_1a.ReferencingDetailsType;
import com.amadeus.xml.pnracc_17_1_1a.ReferencingDetailsType111975C;
import com.amadeus.xml.pnracc_17_1_1a.RelatedProductInformationTypeI;
import com.amadeus.xml.pnracc_17_1_1a.SpecialRequirementsDataDetailsTypeI;
import com.amadeus.xml.pnracc_17_1_1a.SpecialRequirementsDetailsTypeI;
import com.amadeus.xml.pnracc_17_1_1a.SpecialRequirementsTypeDetailsTypeI;
import com.amadeus.xml.pnracc_17_1_1a.TravelProductInformationTypeI193100S;
import com.amadeus.xml.pnracc_17_1_1a.TravellerDetailsType260694C;
import com.amadeus.xml.pnracc_17_1_1a.TravellerSurnameInformationType260693C;
import com.amadeus.xml.tatres_15_2_1a.MonetaryInformationDetailsTypeI;
import com.amadeus.xml.tatres_15_2_1a.TaxDetailsTypeI;
import com.amadeus.xml.tatres_15_2_1a.TaxTypeI;
import com.amadeus.xml.tatres_15_2_1a.TicketProcessEDocReply;
import com.amadeus.xml.tatres_15_2_1a.TicketProcessEDocReply.DocGroup;
import com.amadeus.xml.ttstrr_15_1_1a.BaggageDetailsTypeI;
import com.amadeus.xml.ttstrr_15_1_1a.DiscountPenaltyMonetaryInformationType;
import com.amadeus.xml.ttstrr_15_1_1a.DutyTaxFeeDetailsTypeU;
import com.amadeus.xml.ttstrr_15_1_1a.MonetaryInformationDetailsTypeI260502C;
import com.amadeus.xml.ttstrr_15_1_1a.MonetaryInformationTypeI;
import com.amadeus.xml.ttstrr_15_1_1a.ReferencingDetailsTypeI;
import com.amadeus.xml.ttstrr_15_1_1a.TicketDisplayTSTReply;
import com.amadeus.xml.ttstrr_15_1_1a.TicketDisplayTSTReply.FareList.SegmentInformation;
import com.ibsplc.amadeus.types.ContactInfoType;
import com.ibsplc.amadeus.types.FareDataType;
import com.ibsplc.amadeus.types.MealType;
import com.ibsplc.amadeus.types.MonetaryAmountType;
import com.ibsplc.amadeus.types.PaxSegmentQualifierType;
import com.ibsplc.amadeus.types.PaxType;
import com.ibsplc.amadeus.types.ReferenceQualifierType;
import com.ibsplc.amadeus.vo.AlternateContactDetailsVO;
import com.ibsplc.amadeus.vo.BookingVO;
import com.ibsplc.amadeus.vo.EMDDetailsVO;
import com.ibsplc.amadeus.vo.FareInfoVO;
import com.ibsplc.amadeus.vo.FareVO;
import com.ibsplc.amadeus.vo.ItineraryVO;
import com.ibsplc.amadeus.vo.PaxVO;
import com.ibsplc.amadeus.vo.PenaltyDetailsVO;
import com.ibsplc.amadeus.vo.SKNDetailsVO;
import com.ibsplc.amadeus.vo.SSRVO;
import com.ibsplc.amadeus.vo.SegmentInfoVO;
import com.ibsplc.amadeus.vo.TaxVO;

import java.util.logging.Logger;

//Added on 11/09/2020 for TaxInvoice deployment -- start
import com.amadeus.xml.tatres_15_2_1a.TicketProcessEDocReply.DocGroup.DocDetailsGroup;	
import com.amadeus.xml.tatres_15_2_1a.TicketProcessEDocReply.DocGroup.DocDetailsGroup.CouponGroup;
//Added on 11/09/2020 for TaxInvoice deployment -- end

public class BookingTransformer {

	/**
	 * Logger.
	 */
	//private static final Log log = LogFactory.getLog(BookingTransformer.class);
	final static Logger log = Logger.getLogger(BookingTransformer.class.getName());

	/**
	 * Date of birth format used on the website.
	 */
	private static final String DOB_FORMAT = "ddMMyyyy";

	private static final String DOB_ID_FORMAT = "ddMMMyy";

	/**
	 * Date+time format for arrival and departure date-times.
	 */
	private static final String DATE_TIME_FORMAT = "ddMMyyHHmm";

	/**
	 * Used to calculate a VAT amount.
	 */
	private final static BigDecimal VAT_PERCENTAGE = new BigDecimal(0.14).setScale(2, BigDecimal.ROUND_HALF_EVEN);

	/**
	 * Used to convert an amount from miles to cash.
	 */
	private final static BigDecimal MILES_TO_CASH_FACTOR = new BigDecimal(0.08).setScale(2, BigDecimal.ROUND_HALF_EVEN);

	/**
	 * Map containing all itineraries retrieved for this booking. The key is the
	 * OD pair.
	 */
	private static final Map<String, ItineraryVO> itineraryVOMap = new HashMap<String, ItineraryVO>();

	/**
	 * SA Airline Code
	 */
	private static final String SA_AIRLINE_CODE = "SA";

	/**
	 * Transforms the Amadeus PNRReply to BookingVO
	 * 
	 * @param pnrReply
	 * @return
	 */
	public static BookingVO transformPNRReply(final PNRReply pnrReply) {
		log.info("Transforming the Amadeus PNR Reply");
		BookingVO bookingVO = new BookingVO();
		bookingVO.setPnrNumber(
				pnrReply.getPnrHeader().get(0).getReservationInfo().getReservation().get(0).getControlNumber());
		String officeId = pnrReply.getSecurityInformation().getResponsibilityInformation().getOfficeId();
		bookingVO.setOfficeId(officeId);
		bookingVO.setCreatingOfficeId(officeId);
		
		if (bookingVO != null && bookingVO.getCreatingOfficeId() != null
				&& bookingVO.getCreatingOfficeId().contains(SA_AIRLINE_CODE)) {
			return bookingVO;
		}

		// Create itineraries
		bookingVO.setItineraryDetails(getItineraries(bookingVO, pnrReply));
		List<String> eTicketNumbers = new ArrayList<String>();
		List<EMDDetailsVO> emdDetails = new ArrayList<EMDDetailsVO>();
		Map<String, String> eTicketMap = new HashMap<String, String>();
		Map<String, String> ssrMap = new HashMap<String, String>();
		Map<String, List<String>> passengerEmdMap = new HashMap<String, List<String>>();
		String currencyCode = "ZAR";
		bookingVO.setEmdAmount("0.0");
		/*
		 * if (pnrReply.getTstData() != null &&
		 * !pnrReply.getTstData().isEmpty()) { currencyCode =
		 * pnrReply.getTstData().get(0).getFareData().getMonetaryInfo().get(0).
		 * getCurrencyCode(); }
		 */
		if (pnrReply.getDataElementsMaster() != null
				&& CollectionUtils.isNotEmpty(pnrReply.getDataElementsMaster().getDataElementsIndiv())) {
			for (DataElementsIndiv dataElementsIndiv : pnrReply.getDataElementsMaster().getDataElementsIndiv()) {
				if (dataElementsIndiv.getElementManagementData() != null) {
					ElementManagementSegmentType segmentType = dataElementsIndiv.getElementManagementData();
					String segmentName = segmentType.getSegmentName();
					String refNumber = null;
					String refQualifier = null;
					if (segmentType.getReference() != null) {
						refNumber = segmentType.getReference().getNumber().toString();
						refQualifier = segmentType.getReference().getQualifier();
					}
					if (StringUtils.equals(segmentName, ContactInfoType.PHONE_DETAILS.getType())) {
						populateContactDetails(bookingVO, refNumber, dataElementsIndiv);
					}
					if (StringUtils.equals(segmentName, ReferenceQualifierType.SSR.name())) {
						populateServiceRequests(bookingVO, refNumber, refQualifier, dataElementsIndiv, ssrMap);
					} else if (StringUtils.equals(segmentName, ReferenceQualifierType.OS.name())
							&& CollectionUtils.isNotEmpty(dataElementsIndiv.getOtherDataFreetext())) {
						for (LongFreeTextType longFreeTextType : dataElementsIndiv.getOtherDataFreetext()) {
							if (longFreeTextType.getLongFreetext() != null
									&& longFreeTextType.getLongFreetext().startsWith("SKN")) {
								SKNDetailsVO sknDetailsVO = new SKNDetailsVO();
								sknDetailsVO.setSknNumber(longFreeTextType.getLongFreetext().substring(3));
								bookingVO.setSknDetailsVO(sknDetailsVO);
							}
						}
					} else {
						log.info("Could not find matching segment type for: " + segmentName);
					}
					// For setting the PnrServicing eligibility check
					if ("OPC".equals(segmentName)) {
						log.info("OPC element exists for PNR");
						bookingVO.setIsOPCExist("Y");
					}
				}
				if (CollectionUtils.isNotEmpty(dataElementsIndiv.getOtherDataFreetext())) {
					populateTicketAndEmdDetails(dataElementsIndiv, bookingVO, currencyCode, eTicketNumbers, eTicketMap,
							emdDetails, ssrMap, passengerEmdMap);
				}

				if (dataElementsIndiv.getMcoRecord() != null
						&& CollectionUtils.isNotEmpty(dataElementsIndiv.getMcoRecord().getGroupOfFareElements())) {
					for (PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements groupOfFareElements : dataElementsIndiv
							.getMcoRecord().getGroupOfFareElements()) {
						if (groupOfFareElements.getFareElementData() != null
								&& groupOfFareElements.getFareElementData().getFreeText() != null
								&& groupOfFareElements.getFareElementData().getFreeText().contains("-")) {
							bookingVO.setTicketed(true);
							bookingVO.setPaid(true);
							log.info("Setting enable ticket = N because MCO Record exists.");
							bookingVO.setEnableTicketNumber("N");
							break;
						}
					}
				}

				if (dataElementsIndiv.getMiscellaneousRemarks() != null
						&& dataElementsIndiv.getMiscellaneousRemarks().getRemarks() != null) {
					if (dataElementsIndiv.getMiscellaneousRemarks().getRemarks().getFreetext() != null
							&& dataElementsIndiv.getMiscellaneousRemarks().getRemarks().getFreetext()
									.contains("BOOKONBIZ")) {
						SKNDetailsVO sknDetailsVO = bookingVO.getSknDetailsVO();
						if (sknDetailsVO == null) {
							sknDetailsVO = new SKNDetailsVO();
						}
						sknDetailsVO.setSaaBizBooking(true);
						bookingVO.setSknDetailsVO(sknDetailsVO);
					}
				}
			}
		}

		if (!bookingVO.isTicketed() && eTicketNumbers.isEmpty()) {
			log.info("Setting enable ticket = N because the booking is not ticketed.");
			bookingVO.setEnableTicketNumber("N");
		}

		bookingVO.setEmdDetails(emdDetails);
		bookingVO.setEmdCurrency(currencyCode);

		List<PaxVO> paxList = getPaxList(pnrReply, eTicketMap, passengerEmdMap);
		bookingVO.setPassengerDetails(sortPaxList(paxList));

		return bookingVO;
	}

	/**
	 * Populates the fare information on the booking.
	 *
	 * @param bookingVO
	 *            booking to populate fare information.
	 * @param displayTSTReply
	 *            ticketing reply with fare information.
	 * @return booking with fare information.
	 */
	public static BookingVO populateFareInfo(final BookingVO bookingVO, final TicketDisplayTSTReply displayTSTReply) {
		log.info("BookingTransformer.populateFareInfo");
		if (CollectionUtils.isEmpty(displayTSTReply.getFareList())) {
			log.info("No fares found for this itinerary.");
			return bookingVO;
		}
		// BookingFulfillmentUtil.populateInternationalFlag(bookingVO);
		BigDecimal paxCount = new BigDecimal(1);
		BigDecimal totalTax = new BigDecimal(0);
		BigDecimal totalBaseFare = new BigDecimal(0);
		BigDecimal totalFare = new BigDecimal(0);
		BigDecimal totalMileage = new BigDecimal(0);
		BigDecimal totalPenalty = new BigDecimal(0);
		String penaltyCurrency = null;

		FareVO fareVO = new FareVO();
		HashMap<String, List<TaxVO>> taxVOs = new HashMap<String, List<TaxVO>>();
		HashMap<String, String> fareDetails = new HashMap<String, String>();
		HashMap<String, String> mileageDetails = new HashMap<String, String>();
		HashMap<String, String> paxTypeReferences = getPaxTypeReferenceMap(bookingVO);
		Map<String, String> refQualifiers = new HashMap<String, String>();
		//Added on 03 Aug 2021 to fix the manual penalty ticket issue -- start
		boolean isManual=false;
		boolean isPenaltyTicket=true;
		//Added on 03 Aug 2021 to fix the manual penalty ticket issue -- end
		for (TicketDisplayTSTReply.FareList fareList : displayTSTReply.getFareList()) {
			if (fareList.getPricingInformation() != null
					&& fareList.getPricingInformation().getTstInformation() != null) {
				String tstIndicator = fareList.getPricingInformation().getTstInformation().getTstIndicator();
				if (FareDataType.I.toString().equals(tstIndicator)) {
					fareVO.setITBTTicket(true);
				}
				//Added on 03 Aug 2021 to fix the manual penalty ticket issue -- start
				if (FareDataType.M.toString().equals(tstIndicator)) {
					isManual=true;
				}
				//Added on 03 Aug 2021 to fix the manual penalty ticket issue -- stop
			}

			if (fareList.getPaxSegReference() != null
					&& CollectionUtils.isNotEmpty(fareList.getPaxSegReference().getRefDetails())) {
				paxCount = new BigDecimal(fareList.getPaxSegReference().getRefDetails().size());
			}
			
			//Added on 03 Aug 2021 to fix the manual penalty ticket issue -- start
			if(fareList.getAutomaticReissueInfo()!=null){
				if(fareList.getAutomaticReissueInfo().getSecondDpiGroup()!=null){
					if(fareList.getAutomaticReissueInfo().getSecondDpiGroup().getPenalty()!=null){
						isPenaltyTicket=true;
					}
				}
			}
			//Added on 03 Aug 2021 to fix the manual penalty ticket issue -- end

			BigDecimal paxTotalTax = new BigDecimal(0);
			BigDecimal baseFare = new BigDecimal(0);
			String miles = null;
			String currencyCode = null;
			HashMap<String, BigDecimal> taxValueMap = new HashMap<String, BigDecimal>();
			if (fareList.getFareDataInformation() != null) {
				if (CollectionUtils.isNotEmpty(fareList.getFareDataInformation().getFareDataSupInformation())) {
					// We need to verify whether our booking was made in a
					// different currency first before setting fares.
					boolean isEquivalentFarePresent = false;
					for (MonetaryInformationDetailsTypeI260502C monetaryDetails : fareList.getFareDataInformation()
							.getFareDataSupInformation()) {
						String fareDataQualifier = monetaryDetails.getFareDataQualifier();
						if (MonetaryAmountType.E.name().equals(fareDataQualifier)) {
							isEquivalentFarePresent = true;
							break;
						}
					}

					for (MonetaryInformationDetailsTypeI260502C monetaryDetails : fareList.getFareDataInformation()
							.getFareDataSupInformation()) {
						String fareDataQualifier = monetaryDetails.getFareDataQualifier();
						if (!isEquivalentFarePresent && MonetaryAmountType.B.name().equals(fareDataQualifier)) {
							baseFare = new BigDecimal(monetaryDetails.getFareAmount()).multiply(paxCount);
							totalBaseFare = totalBaseFare.add(baseFare);
						} else if (MonetaryAmountType.E.name().equals(fareDataQualifier)) {
							baseFare = new BigDecimal(monetaryDetails.getFareAmount()).multiply(paxCount);
							totalBaseFare = totalBaseFare.add(baseFare);
						} else if (MonetaryAmountType.TOTAL_FARE.equals(fareDataQualifier)) {
							totalFare = totalFare
									.add(new BigDecimal(monetaryDetails.getFareAmount()).multiply(paxCount));
							currencyCode = monetaryDetails.getFareCurrency();
							fareVO.setCurrencyCode(currencyCode);
							fareVO.setMappedCurrencyCode(currencyCode);
						} else if (MonetaryAmountType.MIL.name().equals(fareDataQualifier)) {
							miles = monetaryDetails.getFareAmount();
							totalMileage = totalMileage.add(new BigDecimal(miles).multiply(paxCount));
						}
						
						//Added on 03 Aug 2021 to fix the manual penalty ticket issue -- start
						if((isManual)&&(isPenaltyTicket)){
							if(MonetaryAmountType.TFT.name().equals(fareDataQualifier)){
								log.info("TFT : "+monetaryDetails.getFareAmount());
								try{
								totalFare=new BigDecimal(monetaryDetails.getFareAmount());
								}catch(Exception e){
									log.info("Exception occured while converting the TFT value to big decimal : "+e);
								}
							}
						}
						//Added on 03 Aug 2021 to fix the manual penalty ticket issue -- end
					}
				}
			} else {
				log.info("No fare data found in fare list");
			}

			if (fareList.getMileage() != null && fareList.getMileage().getMileageTimeDetails() != null) {
				miles = fareList.getMileage().getMileageTimeDetails().getTotalMileage().toString();
				totalMileage = totalMileage.add(new BigDecimal(miles).multiply(paxCount));
			}

			String refQualifier = null;
			String paxType = null;
			String refNumber = null;
			if (fareList.getPaxSegReference() != null
					&& CollectionUtils.isNotEmpty(fareList.getPaxSegReference().getRefDetails())) {

				for (ReferencingDetailsTypeI referencingDetails : fareList.getPaxSegReference().getRefDetails()) {
					refQualifier = referencingDetails.getRefQualifier();
					paxType = paxTypeReferences.get(referencingDetails.getRefNumber().toString());
					refNumber = referencingDetails.getRefNumber().toString();
					if (refQualifiers.containsKey(referencingDetails.getRefNumber().toString())) {
						paxType = "INF";
					} else {
						refQualifiers.put(referencingDetails.getRefNumber().toString(), refQualifier);
					}
				}
			}
			
			if(paxType==null||paxType.equals(null)){
				log.info("Pax type is null...Setting the pax type to ADT(Adult)");
				paxType="ADT";
			}

			List<TaxVO> taxVOList = new ArrayList<TaxVO>();
			BigDecimal paxCountNew = new BigDecimal(1);
			if (paxType != null && taxVOs.get(paxType) != null) {
				log.info(paxType + " - Farelist foud again");
				paxCountNew = paxCount.add(new BigDecimal(1));
			}
			if (CollectionUtils.isNotEmpty(fareList.getTaxInformation())) {
				for (TicketDisplayTSTReply.FareList.TaxInformation taxInformation : fareList.getTaxInformation()) {
					DutyTaxFeeDetailsTypeU taxDetails = taxInformation.getTaxDetails();
					MonetaryInformationTypeI taxMonetaryInfo = taxInformation.getAmountDetails();
					if (taxDetails == null || taxMonetaryInfo == null) {
						log.info("Not enough information to populate tax details.");
						continue;
					}

					TaxVO taxVO = new TaxVO();

					taxVO.setTaxNature(taxDetails.getTaxNature());
					taxVO.setTaxExempt(taxDetails.getTaxExempt());
					String taxCode = taxDetails.getTaxType().getIsoCountry();
					String taxAmount = taxMonetaryInfo.getFareDataMainInformation().getFareAmount();
					String taxIdentifier = taxDetails.getTaxIdentification().getTaxIdentifier();
					BigDecimal taxAmountForPaxType = new BigDecimal(taxAmount).multiply(paxCount);
					totalTax = totalTax.add(taxAmountForPaxType);
					if (paxType != null && taxVOs.get(paxType) != null) {
						taxAmountForPaxType = new BigDecimal(taxAmount).multiply(paxCountNew);
					}
					paxTotalTax = paxTotalTax.add(taxAmountForPaxType);
					taxVO.setTaxCode(taxCode);
					taxVO.setTaxIdentifier(taxIdentifier);
					taxVO.setAmount(taxAmountForPaxType.toString());
					taxVO.setCurrency(taxMonetaryInfo.getFareDataMainInformation().getFareCurrency());
					taxVOList.add(taxVO);
					taxValueMap.put(taxCode, new BigDecimal(taxAmount));
				}
			} else {
				log.info("No taxes found on fare list");
			}

			if (fareList.getFareReference() != null) {
				log.info("Found fare reference type:" + fareList.getFareReference().getReferenceType() + " | "
						+ fareList.getFareReference().getUniqueReference());
			}

			if (fareList.getPaxSegReference() != null
					&& CollectionUtils.isNotEmpty(fareList.getPaxSegReference().getRefDetails())) {

				log.info("PaxType: " + paxType);
				// Adults and infants have the same reference so we use
				// segment ref to distinguish.
				if (("ADT".equals(paxType) || "INF".equals(paxType)) && (!refQualifier.equals("PT"))) {
					PaxSegmentQualifierType paxSegmentQualifierType = PaxSegmentQualifierType.valueOf(refQualifier);
					paxType = paxSegmentQualifierType.getPaxType();
				}
				if (paxType != null /* && fareDetails.get(paxType) == null */) {
					/*
					 * If our base fare is 0 and we have a mileage amount it
					 * means that this booking has been repriced into a mileage
					 * based fare so we need to convert it back to cash.
					 */
					if (baseFare.equals(BigDecimal.ZERO) && miles != null) {
						BigDecimal mileageAmount = new BigDecimal(miles);
						baseFare = mileageAmount.multiply(MILES_TO_CASH_FACTOR).setScale(2, BigDecimal.ROUND_HALF_EVEN);
						// For domestic bookings, we need to add VAT.
						if (!bookingVO.isInternational()) {
							BigDecimal vatAmount = baseFare.multiply(VAT_PERCENTAGE).setScale(2,
									BigDecimal.ROUND_HALF_EVEN);
							TaxVO vat = new TaxVO();
							vat.setTaxNature("GO");
							vat.setTaxCode("ZV");
							vat.setCurrency(currencyCode);
							vat.setAmount(vatAmount.toString());
							taxVOList.add(vat);
						}
					}
					BigDecimal paxTotalFare = baseFare.multiply(paxCountNew).add(paxTotalTax);
					fareDetails.put(paxType, baseFare.toString());
					mileageDetails.put(paxType, miles);
					taxVOs.put(paxType, taxVOList);
					if (PaxType.ADT.name().equals(paxType)) {
						//bookingVO.setAdultFareBreakDownMap(taxValueMap);
						bookingVO.setTotalAmountWithoutTaxForAdults(baseFare);
						bookingVO.setTotalAmountWithTaxForAdults(paxTotalTax);
						bookingVO.setTotalAmountForAdults(paxTotalFare);
					} else if (PaxType.CHD.name().equals(paxType)) {
						//bookingVO.setChildFareBreakDownMap(taxValueMap);
						bookingVO.setTotalAmountWithoutTaxForChildren(baseFare);
						bookingVO.setTotalAmountWithTaxForChildren(paxTotalTax);
						bookingVO.setTotalAmountForChildren(paxTotalFare);
					} else if (PaxType.INF.name().equals(paxType)) {
						//bookingVO.setInfantFareBreakDownMap(taxValueMap);
						bookingVO.setTotalAmountWithoutTaxForInfants(baseFare);
						bookingVO.setTotalAmountWithTaxForInfants(paxTotalTax);
						bookingVO.setTotalAmountForInfants(paxTotalFare);
					}
				} else {
					log.info("Could not find matching pax type for reference:" + refNumber);
				}
			}

			if (CollectionUtils.isNotEmpty(fareList.getSegmentInformation())) {
				List<SegmentInfoVO> segmentInfoList = new ArrayList<SegmentInfoVO>();
				for (SegmentInformation segmentInformation : fareList.getSegmentInformation()) {
					if (segmentInformation.getBagAllowanceInformation() != null) {
						SegmentInfoVO segmentInfoVO = new SegmentInfoVO();
						BaggageDetailsTypeI baggageDetails = segmentInformation.getBagAllowanceInformation()
								.getBagAllowanceDetails();
						segmentInfoVO.setBagaggeAllowance(
								baggageDetails.getBaggageWeight() + " " + baggageDetails.getMeasureUnit());
						segmentInfoList.add(segmentInfoVO);
					}

				}
				fareVO.setSegmentInfo(segmentInfoList);
			}

			if (fareList.getAutomaticReissueInfo() != null
					&& fareList.getAutomaticReissueInfo().getFirstDpiGroup() != null
					&& fareList.getAutomaticReissueInfo().getFirstDpiGroup().getPenalty() != null) {
				log.info("Penalty details avaialble");
				if (!fareList.getAutomaticReissueInfo().getFirstDpiGroup().getPenalty().getDiscountPenaltyDetails()
						.isEmpty()) {
					for (DiscountPenaltyMonetaryInformationType penaltyMonetaryInformation : fareList
							.getAutomaticReissueInfo().getFirstDpiGroup().getPenalty().getDiscountPenaltyDetails()) {
						log.info("Penalty details: Function: " + penaltyMonetaryInformation.getFunction() + " | Amount "
								+ penaltyMonetaryInformation.getAmount() + " | Currency "
								+ penaltyMonetaryInformation.getCurrency());
						penaltyCurrency = penaltyMonetaryInformation.getCurrency();
						totalPenalty = totalPenalty.add(new BigDecimal(penaltyMonetaryInformation.getAmount()));
					}
				}

			}
		}

		if (totalPenalty.intValue() > 0) {
			PenaltyDetailsVO penaltyDetailsVO = new PenaltyDetailsVO();
			penaltyDetailsVO.setPenaltyAmount(totalPenalty.toString());
			penaltyDetailsVO.setPenaltyCurrency(penaltyCurrency);
			fareVO.setPenaltyDetails(penaltyDetailsVO);
		}
		fareVO.setTotalTax(totalTax.toString());
		fareVO.setBaseFare(totalBaseFare.toString());
		fareVO.setTotalMileage(totalMileage.toString());
		fareVO.setTotalFare(totalFare.toString());
		String totalBookingAmount = totalBaseFare.add(totalTax).toString();
		if (bookingVO.getEmdAmount() != null) {
			totalBookingAmount = totalBaseFare.add(new BigDecimal(bookingVO.getEmdAmount())).add(totalTax).toString();
		}
		log.info("TotalBookingAmount for the PNR: " + totalBookingAmount);
		bookingVO.setTotalBookingAmount(totalBookingAmount);
		fareVO.setTaxDetails(taxVOs);
		fareVO.setFareDetails(fareDetails);
		fareVO.setMileageDetails(mileageDetails);
		bookingVO.setFareDetails(fareVO);
		return bookingVO;
	}

	/**
	 * Creates a list of {@see PaxVO} from the {@code PNRReply}.
	 *
	 * @param pnrReply
	 *            itinerary reply retrieved from Amadeus.
	 * @return list of travellers for this itinerary.
	 */
	private static List<PaxVO> getPaxList(final PNRReply pnrReply, final Map<String, String> eTicketMap,
			Map<String, List<String>> passengerEmdMap) {
		log.info("Populating passenger list");
		List<PaxVO> paxList = new ArrayList<PaxVO>();
		for (PNRReply.TravellerInfo travellerInfo : pnrReply.getTravellerInfo()) {
			PaxVO infantTraveller = null;
			String referenceQualifier = null;
			String referenceNumber = null;
			if (travellerInfo.getElementManagementPassenger() != null) {
				if (travellerInfo.getElementManagementPassenger().getReference() != null) {
					referenceQualifier = travellerInfo.getElementManagementPassenger().getReference().getQualifier();
					referenceNumber = travellerInfo.getElementManagementPassenger().getReference().getNumber()
							.toString();
				}
			}
			// paxList.add(paxVO);
			if (CollectionUtils.isNotEmpty(travellerInfo.getPassengerData())) {
				for (PNRReply.TravellerInfo.PassengerData passengerData : travellerInfo.getPassengerData()) {
					PaxVO paxVO = new PaxVO();
					List<String> emdNumbers = null;
					// Populate names
					if (passengerData.getTravellerInformation() != null) {
						if (passengerData.getTravellerInformation().getTraveller() != null) {
							TravellerSurnameInformationType260693C surnameInformationTypeI = passengerData
									.getTravellerInformation().getTraveller();
							paxVO.setSurName(surnameInformationTypeI.getSurname());
							paxVO.seteTicketNumber(eTicketMap.get(referenceNumber));
							log.info("Surname: " + surnameInformationTypeI.getSurname() + " | eTicketNumer: "
									+ eTicketMap.get(referenceNumber));
							if (surnameInformationTypeI.getQuantity().intValue() > 1) {
								log.info("Infant traveller with the same surname found in the reservation.");
								infantTraveller = new PaxVO();
								infantTraveller.setSurName(surnameInformationTypeI.getSurname());
								// infantTraveller.setReferenceQualifier(referenceQualifier);
								// infantTraveller.setReferenceNumber(referenceNumber);
								infantTraveller.seteTicketNumber(eTicketMap.get("INF-" + referenceNumber));
								paxList.add(infantTraveller);
							}
						}
						if (CollectionUtils.isNotEmpty(passengerData.getTravellerInformation().getPassenger())) {
							for (TravellerDetailsType260694C travellerDetails : passengerData.getTravellerInformation()
									.getPassenger()) {
								log.info("Adding passenger info: " + travellerDetails.getType());
								String dob = null;
								if (travellerDetails.getIdentificationCode() != null) {
									dob = travellerDetails.getIdentificationCode().replaceAll("ID", "").trim();
									try {
										dob = DateUtilities.reformatDateofBirth(DOB_ID_FORMAT, dob,
												DateUtilities.DD_MMM_YYYY);
									} catch (ParseException e) {
										log.info("Could not format date of birth" +e);
									}
								}
								if (infantTraveller != null && PaxType.INF.name().equals(travellerDetails.getType())) {
									infantTraveller.setFirstName(travellerDetails.getFirstName());
									infantTraveller.setPaxType(travellerDetails.getType());
									infantTraveller.setDateOfBirth(dob);
									if (dob != null) {
										infantTraveller.setDateOfBirth(dob);
										log.info("Surname: " + infantTraveller.getSurName() + " | PaxType: "
												+ infantTraveller.getPaxType() + " | DOB: " + dob);
									}
								} else {
									paxVO.setFirstName(travellerDetails.getFirstName());
									paxVO.setPaxType(travellerDetails.getType());
									if (dob != null) {
										paxVO.setDateOfBirth(dob);
										log.info("Surname: " + paxVO.getSurName() + " | PaxType: " + paxVO.getPaxType()
												+ " | DOB: " + dob);
									}
								}
								if(infantTraveller == null &&  PaxType.INF.name().equals(travellerDetails.getType())) {
									paxVO.seteTicketNumber(eTicketMap.get("INF-" + referenceNumber));
									
								}
								if(!PaxType.INF.name().equals(travellerDetails.getType())) {
									paxVO.setReferenceNumber(referenceNumber);
									paxVO.setReferenceQualifier(referenceQualifier);
								}
							}
						}
					}
					// Populate date of birth
					if (passengerData.getDateOfBirth() != null
							&& passengerData.getDateOfBirth().getDateAndTimeDetails() != null) {
						String dob = passengerData.getDateOfBirth().getDateAndTimeDetails().getDate();
						try {
							String formattedDob = DateUtilities.reformatDateofBirth(DOB_FORMAT, dob,
									DateUtilities.DD_MMM_YYYY);
							if (infantTraveller != null) {
								infantTraveller.setDateOfBirth(formattedDob);
								log.info("Surname: " + paxVO.getSurName() + " | PaxType: "
										+ infantTraveller.getPaxType() + " | DOB: " + formattedDob);
							} else {
								paxVO.setDateOfBirth(formattedDob);
								log.info("Surname: " + paxVO.getSurName() + " | PaxType: " + paxVO.getPaxType()
										+ " | DOB: " + formattedDob);
							}
						} catch (ParseException e) {
							log.info("Could not format date of birth."+e);
						}
					}
					// Populate references

					
					paxVO.setLineNumber("" + travellerInfo.getElementManagementPassenger().getLineNumber());
					emdNumbers = passengerEmdMap.get(referenceNumber);
					paxVO.setEmdNumbers(emdNumbers);
					paxList.add(paxVO);
				}
			}
		}
		return paxList;
	}

	/**
	 * Sorts the list of travellers returned from Amadeus by pax type.
	 *
	 * @param paxList
	 *            list of travellers.
	 * @return sorted list of travellers.
	 */
	private static List<PaxVO> sortPaxList(List<PaxVO> paxList) {
		Collections.sort(paxList, new Comparator<PaxVO>() {
			public int compare(PaxVO traveller1, PaxVO traveller2) {
				//return (traveller1.getPaxType()).compareTo(traveller2.getPaxType());
				int value=8;
				
				if((traveller1.getPaxType()!=null)&&(traveller2.getPaxType()!=null))
					value=traveller1.getPaxType().compareTo(traveller2.getPaxType());
				else if((traveller1.getSurName()!=null)&&(traveller2.getSurName()!=null))
					value=traveller1.getSurName().compareTo(traveller2.getSurName());
				
				log.info("Comparison value:"+value);
				return value;
				
			}
		});
		return paxList;
	}

	/**
	 * Creates a map of pax reference numbers and their pax types.
	 * 
	 * @param bookingVO
	 *            booking value object.
	 * @return map containing pax reference numbers and their types.
	 */
	private static HashMap<String, String> getPaxTypeReferenceMap(final BookingVO bookingVO) {
		HashMap<String, String> paxTypeReferences = new HashMap<String, String>();
		for (PaxVO paxVO : bookingVO.getPassengerDetails()) {
			paxTypeReferences.put(paxVO.getReferenceNumber(), paxVO.getPaxType());
		}
		return paxTypeReferences;
	}

	/**
	 * Creates a list of itineraries from the given {@code PNRReply}
	 *
	 * @param pnrReply
	 *            itinerary reply retrieved from Amadeus.
	 * @return list of itineraries for this booking.
	 */
	private static List<ItineraryVO> getItineraries(BookingVO bookingVO, final PNRReply pnrReply) {
		log.info("Populating itinerary details");
		List<ItineraryVO> itineraries = new ArrayList<ItineraryVO>();
		if (CollectionUtils.isNotEmpty(pnrReply.getOriginDestinationDetails())) {
			for (PNRReply.OriginDestinationDetails originDestination : pnrReply.getOriginDestinationDetails()) {
				if (originDestination != null && CollectionUtils.isNotEmpty(originDestination.getItineraryInfo())) {
					for (ItineraryInfo itineraryInfo : originDestination.getItineraryInfo()) {
						ItineraryVO itineraryVO = new ItineraryVO();
						itineraries.add(itineraryVO);
						itineraryVO.setSeatingInformation(new ArrayList<SSRVO>());
						itineraryVO.setMealInformation(new ArrayList<SSRVO>());
						itineraryVO.setExtraBaggage(new ArrayList<SSRVO>());
						ElementManagementSegmentType segmentType = itineraryInfo.getElementManagementItinerary();
						if (segmentType != null) {
							if (!"AIR".equals(segmentType.getSegmentName())) {
								log.info("Found " + segmentType.getSegmentName() + " segment in itinerary list");
								continue;
							}
							itineraryVO.setLineNumber(segmentType.getLineNumber() + "");
							if (segmentType.getReference() != null) {
								itineraryVO.setReferenceNumber(segmentType.getReference().getNumber() + "");
							}
						}
						//Commented on 11/09/2020 for TaxInvoice deployment -- start
						/*
						if (itineraryInfo.getTravelProduct() != null) {
							TravelProductInformationTypeI193100S travelProduct = itineraryInfo.getTravelProduct();
							// Populate travel dates and times
							ProductDateTimeTypeI270055C travelTimes = travelProduct.getProduct();
							String departureDateTime = travelTimes.getDepDate() + travelTimes.getDepTime();
							String arrivalDateTime = travelTimes.getArrDate() + travelTimes.getArrTime();
							itineraryVO.setDepartureDate(formatDateTime(departureDateTime));
							itineraryVO.setArrivalDate(formatDateTime(arrivalDateTime));
							// Populate origin/destination points
							if (travelProduct.getBoardpointDetail() != null) {
								itineraryVO.setOrigin(travelProduct.getBoardpointDetail().getCityCode());
								itineraryVO.setDepartureAirportCode(travelProduct.getBoardpointDetail().getCityCode());
							}
							if (travelProduct.getOffpointDetail() != null) {
								itineraryVO.setDestination(travelProduct.getOffpointDetail().getCityCode());
								itineraryVO.setArrivalAirportCode(travelProduct.getOffpointDetail().getCityCode());
							}
							// Populate fight info
							if (travelProduct.getCompanyDetail() != null) {
								itineraryVO.setCarrierCode(travelProduct.getCompanyDetail().getIdentification());
							}
							if (travelProduct.getProductDetails() != null) {
								itineraryVO.setFlightNumber(travelProduct.getProductDetails().getIdentification());
								itineraryVO.setClassOfTravel(travelProduct.getProductDetails().getClassOfService());
							}
							if (travelProduct.getTypeDetail() != null
									&& "ET".equals(travelProduct.getTypeDetail().getDetail())) {
								itineraryVO.setEticketable(true);
							}
						}
						*/
						//Commented on 11/09/2020 for TaxInvoice deployment -- end
						
						//Added on 11/09/2020 for TaxInvoice deployment -- start
						
						if (itineraryInfo.getTravelProduct() != null) {
							TravelProductInformationTypeI193100S travelProduct = itineraryInfo.getTravelProduct();
							String processingIndicator="Y";
							
							if(travelProduct.getProcessingIndicator()!=null)
								processingIndicator=travelProduct.getProcessingIndicator();
							
							if(processingIndicator.equals("Y")){
							// Populate travel dates and times
							ProductDateTimeTypeI270055C travelTimes = travelProduct.getProduct();
							log.info("If traveltimes is not null");
							if(travelTimes!=null){
								log.info("Setting departureDate and arrivalDate from travelProduct");
							String departureDateTime = travelTimes.getDepDate() + travelTimes.getDepTime();
							String arrivalDateTime = travelTimes.getArrDate() + travelTimes.getArrTime();
							itineraryVO.setDepartureDate(formatDateTime(departureDateTime));
							itineraryVO.setArrivalDate(formatDateTime(arrivalDateTime));
							}
							// Populate origin/destination points
							if (travelProduct.getBoardpointDetail() != null) {
								itineraryVO.setOrigin(travelProduct.getBoardpointDetail().getCityCode());
								itineraryVO.setDepartureAirportCode(travelProduct.getBoardpointDetail().getCityCode());
							}
							if (travelProduct.getOffpointDetail() != null) {
								itineraryVO.setDestination(travelProduct.getOffpointDetail().getCityCode());
								itineraryVO.setArrivalAirportCode(travelProduct.getOffpointDetail().getCityCode());
							}
							// Populate fight info
							if (travelProduct.getCompanyDetail() != null) {
								itineraryVO.setCarrierCode(travelProduct.getCompanyDetail().getIdentification());
							}
							if (travelProduct.getProductDetails() != null) {
								if(travelProduct.getProductDetails().getIdentification()!=null)
								itineraryVO.setFlightNumber(travelProduct.getProductDetails().getIdentification());
								if(travelProduct.getProductDetails().getClassOfService()!=null)
								itineraryVO.setClassOfTravel(travelProduct.getProductDetails().getClassOfService());
							}
							if (travelProduct.getTypeDetail() != null
									&& "ET".equals(travelProduct.getTypeDetail().getDetail())) {
								itineraryVO.setEticketable(true);
							}
							}
						}
						
						//Added on 11/09/2020 for TaxInvoice deployment -- end
						
						// Populate flight status
						if (itineraryInfo.getRelatedProduct() != null) {
							RelatedProductInformationTypeI relatedProduct = itineraryInfo.getRelatedProduct();
							if (CollectionUtils.isNotEmpty(relatedProduct.getStatus())) {
								log.info("Related product list matched " + relatedProduct.getStatus().size()
										+ " statuses");
								itineraryVO.setStatus(relatedProduct.getStatus().get(0));
								for (String status : relatedProduct.getStatus()) {
									if ("B".equals(status)) {
										itineraryVO.setStatus("B");
										bookingVO.setFlown(true);
										break;
									}
								}
							}
						}
						// Populate aircraft and terminals
						if (itineraryInfo.getFlightDetail() != null) {
							AdditionalProductDetailsTypeI additionalDetails = itineraryInfo.getFlightDetail();
							if (additionalDetails.getProductDetails() != null) {
								itineraryVO.setAircraftType(additionalDetails.getProductDetails().getEquipment());
							}
							if (additionalDetails.getArrivalStationInfo() != null) {
								itineraryVO
										.setArrivingTerminal(additionalDetails.getArrivalStationInfo().getTerminal());
							}
							if (additionalDetails.getDepartureInformation() != null) {
								itineraryVO.setDepartingTerminal(
										additionalDetails.getDepartureInformation().getDepartTerminal());
							}
						}
						itineraryVOMap.put(itineraryVO.getReferenceNumber(), itineraryVO);
					}
				}
			}
		}
		return itineraries;
	}

	/**
	 * Populates contact information on the booking.
	 *
	 * @param bookingVO
	 *            booking.
	 * @param refNumber
	 *            contact info reference.
	 * @param dataElementsIndiv
	 *            contact info data element.
	 */
	private static void populateContactDetails(final BookingVO bookingVO, final String refNumber,
			final DataElementsIndiv dataElementsIndiv) {
		if (CollectionUtils.isEmpty(dataElementsIndiv.getOtherDataFreetext())) {
			log.info("DataElementsIndiv does not contain OtherDataFreetext for AP reference:" + refNumber);
			return;
		}
		log.info("Populating contact details");
		for (LongFreeTextType longFreeTextType : dataElementsIndiv.getOtherDataFreetext()) {
			if (longFreeTextType.getFreetextDetail() != null) {
				String contactInfoType = longFreeTextType.getFreetextDetail().getType();
				if (longFreeTextType.getLongFreetext() != null) {
					if (StringUtils.equals(contactInfoType, ContactInfoType.CONTACT_NUMBER.getType())) {
						setPhoneNumbers(bookingVO, refNumber, longFreeTextType);
					} else if (StringUtils.equals(contactInfoType, ContactInfoType.EMAIL_ADDRESS.getType())) {
						bookingVO.setEmailAddress(longFreeTextType.getLongFreetext());
						bookingVO.setEmailAddressReferenceNumber(refNumber);
					}
				}
			}
		}
	}

	/**
	 * Sets phone numbers from the {@see LongFreeTextType} to the
	 * {@see BookingVO}.
	 *
	 * @param bookingVO
	 *            booking to set phone numbers on.
	 * @param refNumber
	 *            phone number reference.
	 * @param longFreeTextType
	 *            object containing phone numbers.
	 */
	private static void setPhoneNumbers(final BookingVO bookingVO, final String refNumber,
			final LongFreeTextType longFreeTextType) {
		log.info("Setting phone number from: " + longFreeTextType.getLongFreetext());
		String[] phoneNumberDetails = longFreeTextType.getLongFreetext().split("-");
		if (phoneNumberDetails.length == 2) {
			String phoneNumberType = phoneNumberDetails[1];
			if (StringUtils.equals(phoneNumberType, ContactInfoType.MOBILE_PHONE.getType())) {
				bookingVO.setMobileTelephone(phoneNumberDetails[0]);
				bookingVO.setMobileTelephoneReferenceNumber(refNumber);
			} else if (StringUtils.equals(phoneNumberType, ContactInfoType.HOME_PHONE.getType())) {
				bookingVO.setDayTimeTelephone(phoneNumberDetails[0]);
				bookingVO.setDayTimeTelephoneReferenceNumber(refNumber);
			} else if (StringUtils.equals(phoneNumberType, ContactInfoType.EMERGENCY_PHONE.getType())) {
				AlternateContactDetailsVO alternateContactDetailsVO = new AlternateContactDetailsVO();
				alternateContactDetailsVO.setAltTelePhoneNumber(phoneNumberDetails[0]);
				alternateContactDetailsVO.setReferenceNumber(refNumber);
				bookingVO.setAlternateContactDetailsVO(alternateContactDetailsVO);
			}
		}
	}

	/**
	 * Populates special service requests.
	 *
	 * @param refNumber
	 *            ssr reference number.
	 * @param dataElementsIndiv
	 *            ssr data element.
	 */
	private static void populateServiceRequests(final BookingVO bookingVO, final String refNumber,
			final String refQualifier, final DataElementsIndiv dataElementsIndiv, Map<String, String> ssrMap) {
		SpecialRequirementsDetailsTypeI serviceRequest = dataElementsIndiv.getServiceRequest();
		if (serviceRequest == null || serviceRequest.getSsr() == null) {
			log.info("Found an SSR object with no request info.");
			return;
		}
		// Populate segment tattoo's
		List<String> segmentReferences = new ArrayList<String>();
		List<String> passengerReferences = new ArrayList<String>();
		String ssrQualifierNumber = null;
		if (dataElementsIndiv.getReferenceForDataElement() != null
				&& CollectionUtils.isNotEmpty(dataElementsIndiv.getReferenceForDataElement().getReference())) {
			for (ReferencingDetailsType111975C referenceDetails : dataElementsIndiv.getReferenceForDataElement()
					.getReference()) {
				if (ReferenceQualifierType.ST.toString().equals(referenceDetails.getQualifier())) {
					segmentReferences.add(referenceDetails.getNumber());
				} else if (ReferenceQualifierType.PT.toString().equals(referenceDetails.getQualifier())) {
					passengerReferences.add(referenceDetails.getNumber());
				}
			}
		}

		if (dataElementsIndiv.getElementManagementData() != null && ReferenceQualifierType.OT.toString()
				.equals(dataElementsIndiv.getElementManagementData().getReference().getQualifier())) {
			ssrQualifierNumber = dataElementsIndiv.getElementManagementData().getReference().getNumber().toString();
		}
		// SSR Info
		SpecialRequirementsTypeDetailsTypeI ssrInfo = serviceRequest.getSsr();
		if (ssrInfo != null) {
			ssrMap.put(ssrQualifierNumber, ssrInfo.getType());
			if (ReferenceQualifierType.RQST.name().equals(ssrInfo.getType())) {
				// ssrMap.put(ssrQualifierNumber, "RQST");
				populateSeats(refNumber, refQualifier, segmentReferences, dataElementsIndiv, serviceRequest);
			} else if ("EXWB".equals(ssrInfo.getType())) {
				// ssrMap.put(ssrQualifierNumber, "EXWB");
				populateExtraBaggages(refNumber, refQualifier, segmentReferences, dataElementsIndiv, serviceRequest,
						passengerReferences);
			}
			if (MealType.containsValue(ssrInfo.getType())) {
				MealType mealType = MealType.valueOf(ssrInfo.getType());
				populateMeals(refNumber, refQualifier, segmentReferences, passengerReferences, mealType);
			}
			if ("CUFF".equals(ssrInfo.getType()) && "4Z".equals(ssrInfo.getCompanyId())) {
				bookingVO.setGroupBooking(true);
			}
		}
	}

	/**
	 * Adds seat details to the related itinerary.
	 *
	 * @param refNumber
	 *            ssr reference number.
	 * @param refQualifier
	 *            ssr qualifier.
	 * @param segmentReferences
	 *            list of segment references.
	 * @param dataElementsIndiv
	 *            data element for this ssr.
	 * @param serviceRequest
	 *            ssr request info.
	 */
	private static void populateSeats(final String refNumber, final String refQualifier,
			final List<String> segmentReferences, final DataElementsIndiv dataElementsIndiv,
			final SpecialRequirementsDetailsTypeI serviceRequest) {

		if (CollectionUtils.isEmpty(serviceRequest.getSsrb())) {
			log.info("No seat details found on this ssr.");
			return;
		}

		// Map of reference numbers and their qualifiers. Used for cross
		// referencing.
		Map<String, String> referenceQualifierMap = new HashMap<String, String>();
		if (CollectionUtils.isNotEmpty(dataElementsIndiv.getSeatPaxInfo())) {
			for (DataElementsIndiv.SeatPaxInfo seatPaxInfo : dataElementsIndiv.getSeatPaxInfo()) {
				if (seatPaxInfo.getCrossRef() != null
						&& CollectionUtils.isNotEmpty(seatPaxInfo.getCrossRef().getReference())) {
					for (ReferencingDetailsType referencingDetailsType : seatPaxInfo.getCrossRef().getReference()) {
						referenceQualifierMap.put(referencingDetailsType.getNumber(),
								referencingDetailsType.getQualifier());
					}
				} else {
					log.info("Found SeatPaxInfo with missing cross referencing details.");
				}
			}
		}

		for (SpecialRequirementsDataDetailsTypeI ssrDetails : serviceRequest.getSsrb()) {
			SSRVO ssrVO = new SSRVO();
			String ssrRefNumber = ssrDetails.getCrossRef();
			ssrVO.setSsrbCrossRef(ssrRefNumber);
			ssrVO.setSsrValue(ssrDetails.getData());
			ssrVO.setSsrReferenceNumber(refNumber);
			ssrVO.setSsrReferenceQualifier(refQualifier);
			String ssrRefQualifier = referenceQualifierMap.get(ssrRefNumber);
			if (ssrRefQualifier == null) {
				log.info("Could not cross match ref:" + ssrRefNumber + " to a referenceForDataElement.");
			}
			ssrVO.setReferenceNumber(ssrRefNumber);
			ssrVO.setReferenceQualifier(ssrRefQualifier);
			ssrVO.setSsrDescription(StringUtils.join(ssrDetails.getSeatType(), ","));
			if (!segmentReferences.isEmpty()) {
				for (String segRef : segmentReferences) {
					itineraryVOMap.get(segRef).getSeatingInformation().add(ssrVO);
				}
			} else {
				log.info("Cannot assign seats because there are not segment references found.");
			}
		}
	}

	/**
	 * Populate ExtraBaggage details
	 * 
	 * @param refNumber
	 * @param refQualifier
	 * @param segmentReferences
	 * @param dataElementsIndiv
	 * @param serviceRequest
	 * @param passengerReferences
	 */
	private static void populateExtraBaggages(final String refNumber, final String refQualifier,
			final List<String> segmentReferences, final DataElementsIndiv dataElementsIndiv,
			final SpecialRequirementsDetailsTypeI serviceRequest, final List<String> passengerReferences) {
		log.info("Populate ExtraBaggage details");

		SpecialRequirementsTypeDetailsTypeI specialRequirementsType = serviceRequest.getSsr();

		for (String paxReference : passengerReferences) {
			SSRVO ssrVO = new SSRVO();
			ssrVO.setSsrValue(specialRequirementsType.getType());
			ssrVO.setSsrDescription(specialRequirementsType.getFreeText().get(0));
			ssrVO.setReferenceQualifier(ReferenceQualifierType.PT.name());
			ssrVO.setReferenceNumber(paxReference);
			ssrVO.setSsrReferenceQualifier(refNumber);
			ssrVO.setSsrReferenceNumber(refQualifier);
			if (!segmentReferences.isEmpty()) {
				for (String segRef : segmentReferences) {
					itineraryVOMap.get(segRef).getExtraBaggage().add(ssrVO);
				}
			} else {
				log.info("Cannot assign ExtraBaggages because there are not segment references found.");
			}
		}
	}

	/**
	 * Populates meal information to the relevant itineraries.
	 *
	 * @param refNumber
	 *            ssr reference number.
	 * @param refQualifier
	 *            ssr qualifier.
	 * @param segmentReferences
	 *            list of segment references.
	 * @param passengerReferences
	 *            list of passenger references.
	 * @param mealType
	 *            meal to create SSR for.
	 */
	private static void populateMeals(final String refNumber, final String refQualifier,
			final List<String> segmentReferences, final List<String> passengerReferences, final MealType mealType) {

		for (String paxReference : passengerReferences) {
			SSRVO ssrVO = new SSRVO();
			ssrVO.setSsrValue(mealType.name());
			ssrVO.setSsrDescription(mealType.getDescription());
			ssrVO.setReferenceQualifier(ReferenceQualifierType.PT.name());
			ssrVO.setReferenceNumber(paxReference);
			ssrVO.setSsrReferenceQualifier(refNumber);
			ssrVO.setSsrReferenceNumber(refQualifier);
			if (!segmentReferences.isEmpty()) {
				for (String segRef : segmentReferences) {
					itineraryVOMap.get(segRef).getMealInformation().add(ssrVO);
				}
			} else {
				log.info("Cannot assign meals because there are not segment references found.");
			}
		}
	}

	/**
	 * Formats the given date/time string into the desired format
	 * {@code dd-MMM-yyyy HH:mm}.
	 *
	 * @param dateTime
	 *            date time string to format.
	 * @return date time formatted into {@code dd-MMM-yyyy HH:mm}.
	 */
	private static String formatDateTime(final String dateTime) {
		try {
			return DateUtilities.reformatDateTimeString(DATE_TIME_FORMAT, dateTime, DateUtilities.DD_MMM_YYYY_HH24MI);
		} catch (ParseException dateFormatException) {
			log.info("Failed to format give date/times."+dateFormatException);
		}
		return null;
	}

	/**
	 * Populate Ticket and Emd Details
	 * 
	 * @param dataElementsIndiv
	 * @param bookingVO
	 * @param currencyCode
	 * @param eTicketNumbers
	 * @param eTicketMap
	 * @param emdDetails
	 * @param ssrMap
	 * @param passengerEmdMap
	 */
	private static void populateTicketAndEmdDetails(DataElementsIndiv dataElementsIndiv, BookingVO bookingVO,
			String currencyCode, List<String> eTicketNumbers, Map<String, String> eTicketMap,
			List<EMDDetailsVO> emdDetails, Map<String, String> ssrMap, Map<String, List<String>> passengerEmdMap) {
		log.info("Populate Ticket and Emd Details");
		List<String> emdNumbers = new ArrayList<String>();

		String referenceNumber = null;
		String ssrReferenceNumber = null;
		String ticketNumber = null;
		BigDecimal emdTotal = new BigDecimal(bookingVO.getEmdAmount());
		if (dataElementsIndiv.getReferenceForDataElement() != null) {
			List<ReferencingDetailsType111975C> referenceQualifiers = dataElementsIndiv.getReferenceForDataElement()
					.getReference();
			for (ReferencingDetailsType111975C referencingDetails : referenceQualifiers) {
				if (referencingDetails.getQualifier().equals("PT")) {
					referenceNumber = referencingDetails.getNumber();
				} else if (referencingDetails.getQualifier().equals("OT")) {
					ssrReferenceNumber = referencingDetails.getNumber();
				}
			}
		}
		if (referenceNumber != null && passengerEmdMap.get(referenceNumber) != null
				&& !passengerEmdMap.get(referenceNumber).isEmpty()) {
			emdNumbers = passengerEmdMap.get(referenceNumber);
		}
		String emdNumber;
		for (LongFreeTextType longFreeTextType : dataElementsIndiv.getOtherDataFreetext()) {

			if (longFreeTextType.getFreetextDetail() != null
					&& "P06".equals(longFreeTextType.getFreetextDetail().getType())) {
				ticketNumber = longFreeTextType.getLongFreetext().substring(4,
						longFreeTextType.getLongFreetext().indexOf("/"));
				eTicketNumbers.add(ticketNumber);
				if (longFreeTextType.getLongFreetext().contains("PAX ")
						&& longFreeTextType.getLongFreetext().contains("ET")) {
					if (referenceNumber != null) {
						eTicketMap.put(referenceNumber, ticketNumber);
					}
					if (ticketNumber.startsWith("749") || ticketNumber.startsWith("INF749")
							|| ticketNumber.startsWith("083") || ticketNumber.startsWith("INF083")) {
						log.info("PNR is paid and ticketed");
						bookingVO.setTicketed(true);
						bookingVO.setPaid(true);
						break;
					} else {
						log.info("Setting enable ticket = N because of ticket number.");
						bookingVO.setEnableTicketNumber("N");
					}
				} else if (longFreeTextType.getLongFreetext().contains("INF ")
						&& longFreeTextType.getLongFreetext().contains("ET")) {
					eTicketMap.put("INF-" + referenceNumber, ticketNumber);
				} else if (longFreeTextType.getLongFreetext().contains("PAX ")
						&& longFreeTextType.getLongFreetext().contains("DT")) {
					emdNumber = longFreeTextType.getLongFreetext().substring(4,
							longFreeTextType.getLongFreetext().indexOf("/"));
					String emdFareDetails = longFreeTextType.getLongFreetext().split("/")[2];
					currencyCode = emdFareDetails.substring(0, 3);
					emdFareDetails = emdFareDetails.substring(3);
					EMDDetailsVO emdDetailsVO = new EMDDetailsVO();
					emdDetailsVO.setEmdNumber(emdNumber);
					emdDetailsVO.setServiceType(ssrMap.get(ssrReferenceNumber));
					emdDetailsVO.setServiceCurrency(currencyCode);
					emdDetailsVO.setServiceAmount(emdFareDetails);
					emdDetails.add(emdDetailsVO);
					log.info("EMD Currency: " + currencyCode + " | EMD Fare: " + emdFareDetails);
					emdTotal = emdTotal.add(new BigDecimal(emdFareDetails));
					if (referenceNumber != null) {
						emdNumbers.add(emdNumber);
					}
					log.info("EMD number found: " + emdNumber);
				}
			}
		}
		if (!emdNumbers.isEmpty()) {
			passengerEmdMap.put(referenceNumber, emdNumbers);
		}
		bookingVO.setEmdAmount(emdTotal.toString());

	}

	/**
	 * Transforms a TicketProcessEDocReply into BookingVO
	 *
	 * @param ticketProcessReply
	 *            itinerary reply retrieved from Amadeus
	 * @return BookingVO created from the given itinerary
	 */
	//Commented on 11/09/2020 for TaxInvoice deployment -- start
	/*
	public static BookingVO transformResponse(final TicketProcessEDocReply ticketProcessReply) {

		log.info("Transforming the Amadeus eDoc Reply to BookingVO.");
		BookingVO bookingVO = new BookingVO();
		List<FareInfoVO> fareInfoList = new ArrayList<FareInfoVO>();
		List<TaxVO> taxInfoList = new ArrayList<TaxVO>();
		if (ticketProcessReply.getDocGroup() != null && CollectionUtils.isNotEmpty(ticketProcessReply.getDocGroup())) {
			for (DocGroup docGroup : ticketProcessReply.getDocGroup()) {

				if (docGroup.getFareInfo() != null) {
					if (CollectionUtils.isNotEmpty(docGroup.getFareInfo().getMonetaryDetails())) {
						for (MonetaryInformationDetailsTypeI monetaryDetails : docGroup.getFareInfo()
								.getMonetaryDetails()) {
							FareInfoVO fareInfoVO = new FareInfoVO();
							fareInfoVO.setFareAmount(monetaryDetails.getAmount());
							fareInfoVO.setFareCurrency(monetaryDetails.getCurrency());
							fareInfoVO.setFareType(monetaryDetails.getTypeQualifier());
							fareInfoList.add(fareInfoVO);
						}
						bookingVO.setFareInfoDetails(fareInfoList);
					}
				}

				if (CollectionUtils.isNotEmpty(docGroup.getTaxInfo())) {
					for (TaxTypeI taxInfo : docGroup.getTaxInfo()) {
						String taxCategory = taxInfo.getTaxCategory();
						if (CollectionUtils.isNotEmpty(taxInfo.getTaxDetails())) {
							for (TaxDetailsTypeI taxDetails : taxInfo.getTaxDetails()) {
								TaxVO taxVO = new TaxVO();
								taxVO.setAmount(taxDetails.getRate());
								taxVO.setCurrency(taxDetails.getCurrencyCode());
								taxVO.setTaxCategory(taxCategory);
								if (CollectionUtils.isNotEmpty(taxDetails.getType())) {
									String taxType = taxDetails.getType().get(0);
									taxVO.setTaxCode(taxType);
								}
								taxInfoList.add(taxVO);

							}
							bookingVO.setTaxDetails(taxInfoList);
						}
					}
				}
			}
		}
		return bookingVO;

	}
	*/
	//Commented on 11/09/2020 for TaxInvoice deployment -- end
	
	//Added on 11/09/2020 for TaxInvoice deployment -- start
	//Tax Invoice CR changes added 996 (RFISC) A-8572
		public static BookingVO transformResponse(final TicketProcessEDocReply ticketProcessReply) {

			log.info("Transforming the Amadeus eDoc Reply to BookingVO.");
			BookingVO bookingVO = new BookingVO();
			List<FareInfoVO> fareInfoList = new ArrayList<FareInfoVO>();
			List<TaxVO> taxInfoList = new ArrayList<TaxVO>();
			int i = 0, j = 0;
			if (ticketProcessReply.getDocGroup() != null && CollectionUtils.isNotEmpty(ticketProcessReply.getDocGroup())) {
				for (DocGroup docGroup : ticketProcessReply.getDocGroup()) {

					if (docGroup.getFareInfo() != null) {
						if (CollectionUtils.isNotEmpty(docGroup.getFareInfo().getMonetaryDetails())) {
							for (MonetaryInformationDetailsTypeI monetaryDetails : docGroup.getFareInfo()
									.getMonetaryDetails()) {
								FareInfoVO fareInfoVO = new FareInfoVO();
								fareInfoVO.setFareAmount(monetaryDetails.getAmount());
								fareInfoVO.setFareCurrency(monetaryDetails.getCurrency());
								fareInfoVO.setFareType(monetaryDetails.getTypeQualifier());
								fareInfoList.add(fareInfoVO);
							}
							bookingVO.setFareInfoDetails(fareInfoList);
						}
					}
					// Tax invoice CR 996 (RFISC) A-8572
					for(DocDetailsGroup docDetailsGroup : docGroup.getDocDetailsGroup() ){
						log.info("PNR EMD which has a Reason for Issuance Code (1) of 996");
						for(CouponGroup couponGroup:docDetailsGroup.getCouponGroup()){
							log.info("PNR EMD which has a Reason for Issuance Code (2) of 996");
							if(couponGroup.getPricingInfo()!=null){
								if(couponGroup.getPricingInfo().getOtherSpecialCondition()!=null &&
										!couponGroup.getPricingInfo().getOtherSpecialCondition().isEmpty()
										&&couponGroup.getPricingInfo().getOtherSpecialCondition().contains("996")){
								i++;
								log.info("PNR EMD which has a Reason for Issuance Code (RFISC) of 996");
								}else{
									j++;
								}
							
							}
							
						}
					}
					if(i==0){
					if (CollectionUtils.isNotEmpty(docGroup.getTaxInfo())) {
						for (TaxTypeI taxInfo : docGroup.getTaxInfo()) {
							String taxCategory = taxInfo.getTaxCategory();
							if (CollectionUtils.isNotEmpty(taxInfo.getTaxDetails())) {
								for (TaxDetailsTypeI taxDetails : taxInfo.getTaxDetails()) {
									TaxVO taxVO = new TaxVO();
									taxVO.setAmount(taxDetails.getRate());
									taxVO.setCurrency(taxDetails.getCurrencyCode());
									taxVO.setTaxCategory(taxCategory);
									if (CollectionUtils.isNotEmpty(taxDetails.getType())) {
										String taxType = taxDetails.getType().get(0);
										taxVO.setTaxCode(taxType);
									}
									taxInfoList.add(taxVO);

								}
								bookingVO.setTaxDetails(taxInfoList);
							}
						}
					}
				}
				}
			}
			return bookingVO;

		}
		//Added on 11/09/2020 for TaxInvoice deployment -- end

}
