package com.ibsplc.amadeus.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import com.amadeus.xml.pnracc_17_1_1a.AdditionalBusinessSourceInformationType;
import com.amadeus.xml.pnracc_17_1_1a.AdditionalProductDetailsTypeI;
import com.amadeus.xml.pnracc_17_1_1a.AssociatedChargesInformationTypeI198205C;
import com.amadeus.xml.pnracc_17_1_1a.AttributeInformationTypeU198185C;
import com.amadeus.xml.pnracc_17_1_1a.AttributeType;
import com.amadeus.xml.pnracc_17_1_1a.CompanyInformationType;
import com.amadeus.xml.pnracc_17_1_1a.ConsumerReferenceIdentificationTypeI;
import com.amadeus.xml.pnracc_17_1_1a.ConsumerReferenceInformationTypeI;
import com.amadeus.xml.pnracc_17_1_1a.ElementManagementSegmentType;
import com.amadeus.xml.pnracc_17_1_1a.FormOfPaymentDetailsTypeI;
import com.amadeus.xml.pnracc_17_1_1a.FormOfPaymentTypeI;
import com.amadeus.xml.pnracc_17_1_1a.FreeTextDetailsType198207C;
import com.amadeus.xml.pnracc_17_1_1a.InteractiveFreeTextTypeI136698S;
import com.amadeus.xml.pnracc_17_1_1a.LongFreeTextType;
import com.amadeus.xml.pnracc_17_1_1a.MiscellaneousRemarksType136700S;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply.DataElementsMaster.DataElementsIndiv;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply.DcsData.LegSection;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply.DcsData.LegSection.DcsLegInfo;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply.OriginDestinationDetails.ItineraryInfo;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup;
import com.amadeus.xml.pnracc_17_1_1a.PlaceLocationIdentificationTypeU;
import com.amadeus.xml.pnracc_17_1_1a.ProductDateTimeTypeI270055C;
import com.amadeus.xml.pnracc_17_1_1a.ReferenceInfoType;
import com.amadeus.xml.pnracc_17_1_1a.ReferencingDetailsType;
import com.amadeus.xml.pnracc_17_1_1a.ReferencingDetailsType111975C;
import com.amadeus.xml.pnracc_17_1_1a.RelatedProductInformationTypeI;
import com.amadeus.xml.pnracc_17_1_1a.ReservationControlInformationTypeI196503S;
import com.amadeus.xml.pnracc_17_1_1a.SpecialRequirementsDataDetailsTypeI;
import com.amadeus.xml.pnracc_17_1_1a.SpecialRequirementsDetailsTypeI;
import com.amadeus.xml.pnracc_17_1_1a.SpecialRequirementsTypeDetailsTypeI;
import com.amadeus.xml.pnracc_17_1_1a.StatusDetailsTypeI185722C;
import com.amadeus.xml.pnracc_17_1_1a.StatusTypeI127261S;
import com.amadeus.xml.pnracc_17_1_1a.StructuredPeriodInformationType207595S;
import com.amadeus.xml.pnracc_17_1_1a.TariffInformationTypeI136706S;
import com.amadeus.xml.pnracc_17_1_1a.TravelProductInformationTypeI193100S;
import com.amadeus.xml.pnracc_17_1_1a.TravellerDetailsType260694C;
import com.amadeus.xml.pnracc_17_1_1a.TravellerSurnameInformationType260693C;
import com.amadeus.xml.pnracc_17_1_1a.VehicleInformationType;
import com.amadeus.xml.tatres_15_2_1a.MonetaryInformationDetailsTypeI;
import com.amadeus.xml.tatres_15_2_1a.TaxDetailsTypeI;
import com.amadeus.xml.tatres_15_2_1a.TaxTypeI;
import com.amadeus.xml.tatres_15_2_1a.TicketProcessEDocReply;
import com.amadeus.xml.tatres_15_2_1a.TicketProcessEDocReply.DocGroup;
//Added on 11/09/2020 for TaxInvoice deployment -- start
import com.amadeus.xml.tatres_15_2_1a.TicketProcessEDocReply.DocGroup.DocDetailsGroup;
import com.amadeus.xml.tatres_15_2_1a.TicketProcessEDocReply.DocGroup.DocDetailsGroup.CouponGroup;
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
import com.ibsplc.amadeus.vo.AdditionalInfoVO;
import com.ibsplc.amadeus.vo.AlternateContactDetailsVO;
import com.ibsplc.amadeus.vo.AttributeVO;
import com.ibsplc.amadeus.vo.BeginDateTimeVO;
import com.ibsplc.amadeus.vo.BookingSourceVO;
import com.ibsplc.amadeus.vo.BookingVO;
import com.ibsplc.amadeus.vo.CancelOrConfirmNbrVO;
import com.ibsplc.amadeus.vo.ChargeDetailsVO;
import com.ibsplc.amadeus.vo.CompanyIdentificationVO;
import com.ibsplc.amadeus.vo.CriteriaDetailsVO;
import com.ibsplc.amadeus.vo.CustomerInfoVO;
import com.ibsplc.amadeus.vo.CustomerReferencesVO;
import com.ibsplc.amadeus.vo.EMDDetailsVO;
import com.ibsplc.amadeus.vo.EndDateTimeVO;
import com.ibsplc.amadeus.vo.FareCategoriesVO;
import com.ibsplc.amadeus.vo.FareInfoVO;
import com.ibsplc.amadeus.vo.FareVO;
import com.ibsplc.amadeus.vo.FirstLocationDetailsVO;
import com.ibsplc.amadeus.vo.FormOfPaymentVO;
import com.ibsplc.amadeus.vo.FreeTextDetailsVO;
import com.ibsplc.amadeus.vo.ItineraryReferenceVO;
import com.ibsplc.amadeus.vo.ItineraryVO;
import com.ibsplc.amadeus.vo.LocationDescriptionVO;
import com.ibsplc.amadeus.vo.LocationInfoVO;
import com.ibsplc.amadeus.vo.MarketingInfoVO;
import com.ibsplc.amadeus.vo.OriginatorDetailsVO;
import com.ibsplc.amadeus.vo.PaxVO;
import com.ibsplc.amadeus.vo.PaymentVO;
import com.ibsplc.amadeus.vo.PenaltyDetailsVO;
import com.ibsplc.amadeus.vo.PickupDropoffTimesVO;
import com.ibsplc.amadeus.vo.RateCodeGroupVO;
import com.ibsplc.amadeus.vo.RateCodeInfoVO;
import com.ibsplc.amadeus.vo.RateInfoVO;
import com.ibsplc.amadeus.vo.RateInformationVO;
import com.ibsplc.amadeus.vo.ReferenceVO;
import com.ibsplc.amadeus.vo.RemarkDetailsVO;
import com.ibsplc.amadeus.vo.ReservationVO;
import com.ibsplc.amadeus.vo.SKNDetailsVO;
import com.ibsplc.amadeus.vo.SSRVO;
import com.ibsplc.amadeus.vo.SegmentInfoVO;
import com.ibsplc.amadeus.vo.SelfServiceBookingVO;
import com.ibsplc.amadeus.vo.StatusDetailsVO;
import com.ibsplc.amadeus.vo.SupleInfoVO;
import com.ibsplc.amadeus.vo.TariffInfoVO;
import com.ibsplc.amadeus.vo.TaxVO;
import com.ibsplc.amadeus.vo.TypicalCarDataVO;
import com.ibsplc.amadeus.vo.VehicleCharacteristicVO;
import com.ibsplc.amadeus.vo.VehicleInformationVO;
//Added on 11/09/2020 for TaxInvoice deployment -- end

public class BookingTransformerSelfService {

	/**
	 * Logger.
	 */
	//private static final Log log = LogFactory.getLog(BookingTransformer.class);
	final static Logger log = Logger.getLogger(BookingTransformerSelfService.class.getName());

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
	 
	public static SelfServiceBookingVO transformPNRReplyForSelfService(final PNRReply pnrReply) {
		log.info("Transforming the Amadeus PNR Reply for SelfService");
 
		SelfServiceBookingVO selfServiceBookingVO = new SelfServiceBookingVO();
		selfServiceBookingVO.setPnrNumber(
				pnrReply.getPnrHeader().get(0).getReservationInfo().getReservation().get(0).getControlNumber());
		String officeId = pnrReply.getSecurityInformation().getResponsibilityInformation().getOfficeId();
		selfServiceBookingVO.setOfficeId(officeId);
		selfServiceBookingVO.setCreatingOfficeId(officeId);
		 
		/*if (selfServiceBookingVO != null && selfServiceBookingVO.getCreatingOfficeId() != null
				&& selfServiceBookingVO.getCreatingOfficeId().contains(SA_AIRLINE_CODE)) {
			return  selfServiceBookingVO ;
		}*/
		
 	if (chkNullAndSizeObject(pnrReply) && chkNullAndSizeObject(pnrReply.getDcsData()) && chkNullAndSizeCollection(pnrReply.getDcsData().getLegSection())) {
		if (chkNullAndSizeCollection(pnrReply.getDcsData().getLegSection())) {
		log.info("######## inside the  legSection for selfService");
			List<LegSection> legSectionLst = pnrReply.getDcsData().getLegSection();
			List<ItineraryReferenceVO> itineraryReferenceVOLst= new ArrayList<ItineraryReferenceVO>();
	 	if (chkNullAndSizeCollection(legSectionLst)) {
				for (LegSection legSection : legSectionLst) {
					log.info("######## Calling legSection for selfService");
					/** dcsData -> legSection ->referenceForStructDataElement  **/
					getLegSectionReferenceInfoType(selfServiceBookingVO,legSection);
					/** dcsData -> legSection ->dcsLegInfo ->paxStatus->statusDetails **/
					log.info("######## Calling PAX Details for selfService");
					getPaxStatusDetails(selfServiceBookingVO,legSection);
   			}
		 }
		}
 	}
	  
		// Create itineraries		 
		selfServiceBookingVO.setItineraryDetails(getSelfServiceItineraries(selfServiceBookingVO, pnrReply));
		log.info("######## after calling  itineraries");
		List<String> eTicketNumbers = new ArrayList<String>();
		List<EMDDetailsVO> emdDetails = new ArrayList<EMDDetailsVO>();
		Map<String, String> eTicketMap = new HashMap<String, String>();
		Map<String, String> ssrMap = new HashMap<String, String>();
		Map<String, List<String>> passengerEmdMap = new HashMap<String, List<String>>();
		String currencyCode = "ZAR";
		selfServiceBookingVO.setEmdAmount("0.0");
		/*
		 * if (pnrReply.getTstData() != null &&
		 * !pnrReply.getTstData().isEmpty()) { currencyCode =
		 * pnrReply.getTstData().get(0).getFareData().getMonetaryInfo().get(0).
		 * getCurrencyCode(); }
		 */
		
		  if(chkNullAndSizeObject(pnrReply.getDataElementsMaster()) && chkNullAndSizeCollection(pnrReply.getDataElementsMaster().getDataElementsIndiv())) {	
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
					 
					if (chkStringEquals(segmentName, ContactInfoType.PHONE_DETAILS.getType())) {
						populateContactDetails(selfServiceBookingVO, refNumber, dataElementsIndiv);
					}				 
					if (chkStringEquals(segmentName, ReferenceQualifierType.SSR.name())) {
						populateServiceRequests(selfServiceBookingVO, refNumber, refQualifier, dataElementsIndiv, ssrMap);
					} else if (chkStringEquals(segmentName, ReferenceQualifierType.OS.name())
							&& chkNullAndSizeCollection(dataElementsIndiv.getOtherDataFreetext())) {
						for (LongFreeTextType longFreeTextType : dataElementsIndiv.getOtherDataFreetext()) {
							if (longFreeTextType.getLongFreetext() != null
									&& longFreeTextType.getLongFreetext().startsWith("SKN")) {
								SKNDetailsVO sknDetailsVO = new SKNDetailsVO();
								sknDetailsVO.setSknNumber(longFreeTextType.getLongFreetext().substring(3));
								selfServiceBookingVO.setSknDetailsVO(sknDetailsVO);
							}
						}
					} else {
						log.info("Could not find matching segment type for: " + segmentName);
					}
					// For setting the PnrServicing eligibility check
					if ("OPC".equals(segmentName)) {
						log.info("OPC element exists for PNR");
						selfServiceBookingVO.setIsOPCExist("Y");
					}
				}
				
				if (chkNullAndSizeCollection(dataElementsIndiv.getOtherDataFreetext())) {
					populateTicketAndEmdDetails(dataElementsIndiv, selfServiceBookingVO, currencyCode, eTicketNumbers, eTicketMap,
							emdDetails, ssrMap, passengerEmdMap);
				}

				//if (dataElementsIndiv.getMcoRecord() != null
						//&& chkNullAndSizeCollection(dataElementsIndiv.getMcoRecord().getGroupOfFareElements())) {
			if(chkNullAndSizeObject(dataElementsIndiv) && chkNullAndSizeObject(dataElementsIndiv.getMcoRecord()) && chkNullAndSizeCollection(dataElementsIndiv.getMcoRecord().getGroupOfFareElements())) {
					for (PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements groupOfFareElements : dataElementsIndiv
							.getMcoRecord().getGroupOfFareElements()) {
						if (groupOfFareElements.getFareElementData() != null
								&& groupOfFareElements.getFareElementData().getFreeText() != null
								&& groupOfFareElements.getFareElementData().getFreeText().contains("-")) {
							selfServiceBookingVO.setTicketed(true);
							selfServiceBookingVO.setPaid(true);
							log.info("Setting enable ticket = N because MCO Record exists.");
							selfServiceBookingVO.setEnableTicketNumber("N");
							break;
						}
					}
				}
		 
				if (dataElementsIndiv.getMiscellaneousRemarks() != null
						&& dataElementsIndiv.getMiscellaneousRemarks().getRemarks() != null) {
					if (dataElementsIndiv.getMiscellaneousRemarks().getRemarks().getFreetext() != null
							&& dataElementsIndiv.getMiscellaneousRemarks().getRemarks().getFreetext()
									.contains("BOOKONBIZ")) {
						SKNDetailsVO sknDetailsVO = selfServiceBookingVO.getSknDetailsVO();
						if (sknDetailsVO == null) {
							sknDetailsVO = new SKNDetailsVO();
						}
						sknDetailsVO.setSaaBizBooking(true);
						selfServiceBookingVO.setSknDetailsVO(sknDetailsVO);
					}
				}
			}
		}
		 
		if (!selfServiceBookingVO.isTicketed() && eTicketNumbers.isEmpty()) {
			log.info("Setting enable ticket = N because the booking is not ticketed.");
			selfServiceBookingVO.setEnableTicketNumber("N");
		}

		//selfServiceBookingVO.setEmdDetails(emdDetails);
		selfServiceBookingVO.setEmdCurrency(currencyCode);

		List<PaxVO> paxList = getPaxList(pnrReply, eTicketMap, passengerEmdMap);
		selfServiceBookingVO.setPassengerDetails(sortPaxList(paxList));
    
		return selfServiceBookingVO;	 
	 
} 
	/**
	 * Populates the fare information on the booking.
	 *
	 * @param selfServiceBookingVO
	 *            booking to populate fare information.
	 * @param displayTSTReply
	 *            ticketing reply with fare information.
	 * @return booking with fare information.
	 */
	public static BookingVO populateFareInfo(final BookingVO selfServiceBookingVO, final TicketDisplayTSTReply displayTSTReply) {
		log.info("BookingTransformer.populateFareInfo");
		if (chkNullAndSizeObject(displayTSTReply.getFareList())) {
			log.info("No fares found for this itinerary.");
			return selfServiceBookingVO;
		}
		// BookingFulfillmentUtil.populateInternationalFlag(selfServiceBookingVO);
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
		HashMap<String, String> paxTypeReferences = getPaxTypeReferenceMap(selfServiceBookingVO);
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
					&& chkNullAndSizeCollection(fareList.getPaxSegReference().getRefDetails())) {
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
				if (chkNullAndSizeCollection(fareList.getFareDataInformation().getFareDataSupInformation())) {
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
					&& chkNullAndSizeCollection(fareList.getPaxSegReference().getRefDetails())) {

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
			if (chkNullAndSizeCollection(fareList.getTaxInformation())) {
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
					&& chkNullAndSizeCollection(fareList.getPaxSegReference().getRefDetails())) {

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
						if (!selfServiceBookingVO.isInternational()) {
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
						//selfServiceBookingVO.setAdultFareBreakDownMap(taxValueMap);
						selfServiceBookingVO.setTotalAmountWithoutTaxForAdults(baseFare);
						selfServiceBookingVO.setTotalAmountWithTaxForAdults(paxTotalTax);
						selfServiceBookingVO.setTotalAmountForAdults(paxTotalFare);
					} else if (PaxType.CHD.name().equals(paxType)) {
						//selfServiceBookingVO.setChildFareBreakDownMap(taxValueMap);
						selfServiceBookingVO.setTotalAmountWithoutTaxForChildren(baseFare);
						selfServiceBookingVO.setTotalAmountWithTaxForChildren(paxTotalTax);
						selfServiceBookingVO.setTotalAmountForChildren(paxTotalFare);
					} else if (PaxType.INF.name().equals(paxType)) {
						//selfServiceBookingVO.setInfantFareBreakDownMap(taxValueMap);
						selfServiceBookingVO.setTotalAmountWithoutTaxForInfants(baseFare);
						selfServiceBookingVO.setTotalAmountWithTaxForInfants(paxTotalTax);
						selfServiceBookingVO.setTotalAmountForInfants(paxTotalFare);
					}
				} else {
					log.info("Could not find matching pax type for reference:" + refNumber);
				}
			}

			if (chkNullAndSizeCollection(fareList.getSegmentInformation())) {
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
		if (selfServiceBookingVO.getEmdAmount() != null) {
			totalBookingAmount = totalBaseFare.add(new BigDecimal(selfServiceBookingVO.getEmdAmount())).add(totalTax).toString();
		}
		log.info("TotalBookingAmount for the PNR: " + totalBookingAmount);
		selfServiceBookingVO.setTotalBookingAmount(totalBookingAmount);
		fareVO.setTaxDetails(taxVOs);
		fareVO.setFareDetails(fareDetails);
		fareVO.setMileageDetails(mileageDetails);
		selfServiceBookingVO.setFareDetails(fareVO);
		return selfServiceBookingVO;
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
			if (chkNullAndSizeCollection(travellerInfo.getPassengerData())) {
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
						if (chkNullAndSizeCollection(passengerData.getTravellerInformation().getPassenger())) {
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
	 * @param selfServiceBookingVO
	 *            booking value object.
	 * @return map containing pax reference numbers and their types.
	 */
	private static HashMap<String, String> getPaxTypeReferenceMap(final BookingVO selfServiceBookingVO) {
		HashMap<String, String> paxTypeReferences = new HashMap<String, String>();
		for (PaxVO paxVO : selfServiceBookingVO.getPassengerDetails()) {
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
	private static List<ItineraryVO> getSelfServiceItineraries(SelfServiceBookingVO selfServiceBookingVO, final PNRReply pnrReply) {
		log.info("Populating itinerary details for selfservice");
	  int counter=1;
	  int itineraryInfoCounter=1;
		List<ItineraryVO> itineraries = new ArrayList<ItineraryVO>();
		if (chkNullAndSizeCollection(pnrReply.getOriginDestinationDetails())) {
			for (PNRReply.OriginDestinationDetails originDestination : pnrReply.getOriginDestinationDetails()) {
				log.info("OriginDestinationDetails counter:"+counter);
				if (chkNullAndSizeObject(originDestination)  && chkNullAndSizeCollection(originDestination.getItineraryInfo())) {
				 	for (ItineraryInfo itineraryInfo : originDestination.getItineraryInfo()) {
				 		try{
				 		log.info("itineraryInfoCounter:"+itineraryInfoCounter+",  ######## next itineraryInfo:"+itineraryInfo.getTypicalCarData());
				 		
						ItineraryVO itineraryVO = new ItineraryVO();						
						itineraries.add(itineraryVO);
						itineraryVO.setSeatingInformation(new ArrayList<SSRVO>());
						itineraryVO.setMealInformation(new ArrayList<SSRVO>());
						itineraryVO.setExtraBaggage(new ArrayList<SSRVO>());
						
						if(chkNullAndSizeObject(itineraryInfo) && chkNullAndSizeObject(itineraryInfo.getTypicalCarData())){
					  		TypicalCarData  typicalCarData = itineraryInfo.getTypicalCarData();
							/** itineraryInfo -> typicalCarData **/
							log.info("######## Calling carDetails ... ");
							TypicalCarDataVO typicalCarDataVO = new TypicalCarDataVO();							
						 	getCarDetails(typicalCarDataVO,typicalCarData,itineraryVO);
						 	//selfServiceBookingVO.setTypicalCarData(typicalCarDataVO);
						}
						ElementManagementSegmentType segmentType = itineraryInfo.getElementManagementItinerary();
						if (segmentType != null) {
							/*if (!"AIR".equals(segmentType.getSegmentName())) {
								log.info("Found " + segmentType.getSegmentName() + " segment in itinerary list");
								continue;
							}*/
							itineraryVO.setLineNumber(segmentType.getLineNumber() + "");
							if (segmentType.getReference() != null) {
								itineraryVO.setReferenceNumber(segmentType.getReference().getNumber() + "");
							}
							itineraryVO.setSegmentName( segmentType.getSegmentName());
							log.info("Found segmentType.getSegmentName" + segmentType.getSegmentName() + " segment in itinerary list");
						}
						log.info("##### ReferenceNumber"+itineraryVO.getReferenceNumber());
						 
						//Added on 11/09/2020 for TaxInvoice deployment -- start						
						if (itineraryInfo.getTravelProduct() != null) {
							TravelProductInformationTypeI193100S travelProduct = itineraryInfo.getTravelProduct();
							String processingIndicator="Y";
							
							if(travelProduct.getProcessingIndicator()!=null)
								processingIndicator=travelProduct.getProcessingIndicator();
							
							if(processingIndicator.equals("Y")){
							// Populate travel dates and times
							ProductDateTimeTypeI270055C travelTimes = travelProduct.getProduct();
							
							if(travelTimes!=null){
								String d_Time=travelTimes.getDepTime();
								String a_Time=travelTimes.getArrTime();
								log.info("Setting departureDate and arrivalDate from travelProduct");
								log.info("departureDateTime1:"+travelTimes.getDepDate() + " - "+ travelTimes.getDepTime());
								log.info("arrivalDateTime1:"+travelTimes.getArrDate() + " - "+ travelTimes.getArrTime());
								if(null == travelTimes.getDepTime())  d_Time = "0000";
								if(null == travelTimes.getArrTime())  a_Time = "0000";
							String departureDateTime = travelTimes.getDepDate() + d_Time;
							String arrivalDateTime = travelTimes.getArrDate() + a_Time;
							itineraryVO.setDepartureDate(formatDateTime(departureDateTime));
							itineraryVO.setArrivalDate(formatDateTime(arrivalDateTime));

							log.info("departureDateTime2:"+departureDateTime);
							log.info("arrivalDateTime2:"+arrivalDateTime);
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
							 if (chkNullAndSizeCollection(relatedProduct.getStatus())) {
								log.info("Related product list matched " + relatedProduct.getStatus().size()
										+ " statuses");
								itineraryVO.setStatus(relatedProduct.getStatus().get(0));
								for (String status : relatedProduct.getStatus()) {
									if ("B".equals(status)) {
										itineraryVO.setStatus("B");
										selfServiceBookingVO.setFlown(true);
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
						
						itineraryInfoCounter++;
				 		}catch(Exception e){
				 			log.info(" Error occurred due to "+e);
				 			e.getMessage();
				 		}
					}
				}
			}
		counter++;	 
		}
		
		log.info("######## returning from itineraries");
		return itineraries;
	}
/**
 * 
 * @param typicalCarDataVO
 * @param typicalCarData
 */
private static void getCarDetails(TypicalCarDataVO typicalCarDataVO,TypicalCarData  typicalCarData, ItineraryVO itineraryVO){
	 log.info("######## calling  getCarDetails");
	 
	List<VehicleInformationVO> vehicleInformationVOLst =  new ArrayList<VehicleInformationVO>();
  	List<CompanyIdentificationVO> companyIdentificationDetails =  new ArrayList<CompanyIdentificationVO>();
	List<LocationInfoVO> locationInfoVOLst = new ArrayList<LocationInfoVO>();
 	List<CustomerInfoVO> customerReferencesLst = new ArrayList<CustomerInfoVO>();	
 	 
				if(chkNullAndSizeObject(typicalCarData) ){
					VehicleInformationVO vehicleInformation = new VehicleInformationVO();
					VehicleInformationType vehicleInformationAll = typicalCarData.getVehicleInformation();
					if(chkNullAndSizeObject(vehicleInformationAll)){						
					if(chkNullAndSizeObject(vehicleInformationAll.getVehicleCharacteristic())){	 
						VehicleCharacteristicVO vehicleCharacteristic = new VehicleCharacteristicVO();
						vehicleCharacteristic.setVehicleRentalPrefType(vehicleInformationAll.getVehicleCharacteristic().getVehicleRentalPrefType());
						vehicleCharacteristic.setVehicleTypeOwner(vehicleInformationAll.getVehicleCharacteristic().getVehicleTypeOwner());
						vehicleInformation.setVehicleCharacteristicVO(vehicleCharacteristic);
						vehicleInformation.setCarModel(vehicleInformationAll.getCarModel()); 
					}
					if(chkNullAndSizeObject(vehicleInformationAll.getFreeTextDetails())){
						FreeTextDetailsType198207C freeTextDetailsAll = vehicleInformationAll.getFreeTextDetails();
						if(chkNullAndSizeObject(freeTextDetailsAll)){		 
						FreeTextDetailsVO freeTextDetails = new FreeTextDetailsVO();
						freeTextDetails.setTextSubjectQualifier(freeTextDetailsAll.getTextSubjectQualifier());
						freeTextDetails.setInformationType(freeTextDetailsAll.getInformationType());
						freeTextDetails.setCompanyId(freeTextDetailsAll.getCompanyId());
						freeTextDetails.setLanguage(freeTextDetailsAll.getLanguage());
						freeTextDetails.setSource(freeTextDetailsAll.getSource());
						freeTextDetails.setEncoding(freeTextDetailsAll.getEncoding());
						vehicleInformation.setFreeTextDetails(freeTextDetails);	
					}
					}
					vehicleInformationVOLst.add(vehicleInformation);	
		 
					if(chkNullAndSizeObject(vehicleInformationVOLst)){
						typicalCarDataVO.setVehicleInformationDetails(vehicleInformationVOLst);
					}
					CompanyInformationType  companyIdentificationType = typicalCarData.getCompanyIdentification();
					if(chkNullAndSizeObject(companyIdentificationType)){
						CompanyIdentificationVO companyIdentificationVO = new CompanyIdentificationVO();
						companyIdentificationVO.setTravelSector(companyIdentificationType.getTravelSector());
						companyIdentificationVO.setCompanyCodeContext(companyIdentificationType.getCompanyCodeContext());
						companyIdentificationVO.setCompanyCode(companyIdentificationType.getCompanyCode());
						companyIdentificationVO.setCompanyName(companyIdentificationType.getCompanyName());
						companyIdentificationVO.setAccessLevel(companyIdentificationType.getAccessLevel());
						companyIdentificationDetails.add(companyIdentificationVO);
						typicalCarDataVO.setCompanyIdentificationDetails(companyIdentificationVO);
					}					
 
				    List<PlaceLocationIdentificationTypeU>  locationInformationType = typicalCarData.getLocationInfo();
					if(chkNullAndSizeCollection(locationInformationType)){
						//locationInfoVOLst						
						for (PlaceLocationIdentificationTypeU statusDetailsType : locationInformationType) {
							LocationInfoVO locationInfo = new LocationInfoVO();
							
							if(chkNullAndSizeObject(statusDetailsType)){
								locationInfo.setLocationType(statusDetailsType.getLocationType());							
							LocationDescriptionVO  locationDescription = new LocationDescriptionVO();
							if(chkNullAndSizeObject(statusDetailsType.getLocationDescription())){
								locationDescription.setCode(statusDetailsType.getLocationDescription().getCode());
								locationDescription.setName(statusDetailsType.getLocationDescription().getName());
								locationInfo.setLocationDescriptionVO(locationDescription); 
							}
							
							FirstLocationDetailsVO  firstLocationDetails = new FirstLocationDetailsVO();
							if(chkNullAndSizeObject(statusDetailsType.getFirstLocationDetails())){
								firstLocationDetails.setCode(statusDetailsType.getFirstLocationDetails().getCode());
								firstLocationDetails.setQualifier(statusDetailsType.getFirstLocationDetails().getQualifier());
								firstLocationDetails.setAgency(statusDetailsType.getFirstLocationDetails().getAgency());
								locationInfo.setFirstLocationDetailsVO(firstLocationDetails);															
							} 
							locationInfoVOLst.add(locationInfo);							
							}
						}
						typicalCarDataVO.setLocationInfoDetails(locationInfoVOLst);
					}
 
					StructuredPeriodInformationType207595S  structuredPeriodInformationType = typicalCarData.getPickupDropoffTimes();	
					if(chkNullAndSizeObject(structuredPeriodInformationType)){
						PickupDropoffTimesVO pickupDropoffTimesVO = new PickupDropoffTimesVO();
						BeginDateTimeVO  beginDateTime = new BeginDateTimeVO();
						EndDateTimeVO  endDateTime = new EndDateTimeVO();
					if(chkNullAndSizeObject(structuredPeriodInformationType.getBeginDateTime())){
						beginDateTime.setYear(structuredPeriodInformationType.getBeginDateTime().getYear());
						beginDateTime.setMonth(structuredPeriodInformationType.getBeginDateTime().getMonth());
						beginDateTime.setDay(structuredPeriodInformationType.getBeginDateTime().getDay());
						beginDateTime.setHour(structuredPeriodInformationType.getBeginDateTime().getHour());
						beginDateTime.setMinutes(structuredPeriodInformationType.getBeginDateTime().getMinutes());
						pickupDropoffTimesVO.setBeginDateTimeVO(beginDateTime); 
					} 
					if(chkNullAndSizeObject(structuredPeriodInformationType.getEndDateTime())){
						endDateTime.setYear(structuredPeriodInformationType.getEndDateTime().getYear());
						endDateTime.setMonth(structuredPeriodInformationType.getEndDateTime().getMonth());
						endDateTime.setDay(structuredPeriodInformationType.getEndDateTime().getDay());
						endDateTime.setHour(structuredPeriodInformationType.getEndDateTime().getHour());
						endDateTime.setMinutes(structuredPeriodInformationType.getEndDateTime().getMinutes());
						pickupDropoffTimesVO.setEndDateTimeVO(endDateTime); 		
					} 
					typicalCarDataVO.setPickupDropoffTimesDetails(pickupDropoffTimesVO);
			 
					//cancelOrConfirmNbr
					List<ReservationControlInformationTypeI196503S>  cancelOrConfirmNbrAll = typicalCarData.getCancelOrConfirmNbr();	
					CancelOrConfirmNbrVO  cancelOrConfirmNbr = new CancelOrConfirmNbrVO();
					if(chkNullAndSizeObject(cancelOrConfirmNbrAll)){					
					for (ReservationControlInformationTypeI196503S cancelOrConfirmNbrLst : cancelOrConfirmNbrAll) {
						ReservationVO reservationVO = new ReservationVO();
						reservationVO.setCompanyId(cancelOrConfirmNbrLst.getReservation().getCompanyId());
						reservationVO.setControlNumber(cancelOrConfirmNbrLst.getReservation().getControlNumber());
						reservationVO.setControlType(cancelOrConfirmNbrLst.getReservation().getControlType());
						cancelOrConfirmNbr.setReservationVO(reservationVO); 
					}
					}
 
					if(chkNullAndSizeObject(cancelOrConfirmNbr)){
					typicalCarDataVO.setCancelOrConfirmNbrDetails(cancelOrConfirmNbr);
					}
					//RateCodeGroup
					RateCodeGroup  rateCodeGroup = typicalCarData.getRateCodeGroup();
					RateCodeGroupVO  rateCodeGroupVO = new RateCodeGroupVO();
					RateCodeInfoVO rateCodeInfoVO = new RateCodeInfoVO();
					FareCategoriesVO fareCategoriesVO = new FareCategoriesVO();
					
					if(chkNullAndSizeObject(rateCodeGroup)){
						if ( chkNullAndSizeObject(rateCodeGroup.getRateCodeInfo())
							 && chkNullAndSizeObject(rateCodeGroup.getRateCodeInfo().getFareCategories())){			
						fareCategoriesVO.setFareType(rateCodeGroup.getRateCodeInfo().getFareCategories().getFareType());
					}
					rateCodeInfoVO.setFareCategoriesVO(fareCategoriesVO);
					rateCodeGroupVO.setRateCodeInfoVO(rateCodeInfoVO); 
					
					//AdditionalInfo
					AdditionalInfoVO  additionalInfoVO = new AdditionalInfoVO();
					if (chkNullAndSizeObject(rateCodeGroup.getAdditionalInfo()) &&
					chkNullAndSizeObject(rateCodeGroup.getAdditionalInfo().getFreeTextDetails())){
						FreeTextDetailsVO  freeTextDetailsForRateCode = new FreeTextDetailsVO();
						freeTextDetailsForRateCode.setTextSubjectQualifier(rateCodeGroup.getAdditionalInfo().getFreeTextDetails().getTextSubjectQualifier());
						freeTextDetailsForRateCode.setInformationType(rateCodeGroup.getAdditionalInfo().getFreeTextDetails().getInformationType());
						freeTextDetailsForRateCode.setCompanyId(rateCodeGroup.getAdditionalInfo().getFreeTextDetails().getCompanyId());
						freeTextDetailsForRateCode.setLanguage(rateCodeGroup.getAdditionalInfo().getFreeTextDetails().getLanguage());
						freeTextDetailsForRateCode.setSource(rateCodeGroup.getAdditionalInfo().getFreeTextDetails().getSource());
						freeTextDetailsForRateCode.setEncoding(rateCodeGroup.getAdditionalInfo().getFreeTextDetails().getEncoding());
						additionalInfoVO.setFreeTextDetails(freeTextDetailsForRateCode); 
						additionalInfoVO.setFreeText(rateCodeGroup.getAdditionalInfo().getFreeText());
					}
					rateCodeGroupVO.setAdditionalInfoVO(additionalInfoVO);
 
					if ( chkNullAndSizeObject(rateCodeGroup.getAdditionalInfo())) {
						typicalCarDataVO.setRateCodeGroupDetails(rateCodeGroupVO);
					}
					}
 
					//customerInfo					
					ConsumerReferenceInformationTypeI  customerInfo = typicalCarData.getCustomerInfo();
					CustomerInfoVO customerInfoVO = new CustomerInfoVO();

					if ( chkNullAndSizeObject(customerInfo)
						&& chkNullAndSizeObject(customerInfo.getCustomerReferences())){
						for ( ConsumerReferenceIdentificationTypeI customerReferences : customerInfo.getCustomerReferences() ){
							CustomerReferencesVO customerReferencesVO = new CustomerReferencesVO();
							customerReferencesVO.setReferenceNumber(customerReferences.getReferenceNumber());
							customerReferencesVO.setReferenceQualifier(customerReferences.getReferenceQualifier());
							customerInfoVO.setCustomerReferencesVO(customerReferencesVO);
							customerReferencesLst.add(customerInfoVO); 							
						}
						if ( chkNullAndSizeObject(customerReferencesLst)){
						typicalCarDataVO.setCustomerInfoDetails(customerReferencesLst);
						}
					}
				 
					//rateInfo	
					List<TariffInformationTypeI136706S>  rateInfoAll = typicalCarData.getRateInfo();					
					List<RateInfoVO> rateInfoLst = new ArrayList<RateInfoVO>();
					if ( chkNullAndSizeObject(rateInfoAll)){
						for (TariffInformationTypeI136706S tariffInfo : rateInfoAll){
							RateInfoVO rateInfo = new RateInfoVO();
							if ( chkNullAndSizeObject(tariffInfo.getTariffInfo())){							
								TariffInfoVO  tariffInfoDetails = new TariffInfoVO();
								tariffInfoDetails.setAmount(tariffInfo.getTariffInfo().getAmount());
								tariffInfoDetails.setAmountType(tariffInfo.getTariffInfo().getAmountType());
								tariffInfoDetails.setRatePlanIndicator(tariffInfo.getTariffInfo().getRatePlanIndicator());
								tariffInfoDetails.setCurrency(tariffInfo.getTariffInfo().getCurrency());
								rateInfo.setTariffInfo(tariffInfoDetails);
								rateInfoLst.add(rateInfo);						 
							}
							RateInformationVO  rateInformationVO = new RateInformationVO();
							if (chkNullAndSizeObject(tariffInfo.getRateInformation()))
							rateInformationVO.setCategory(tariffInfo.getRateInformation().getCategory());
							rateInfo.setRateInformation(rateInformationVO);						 
							rateInfoLst.add(rateInfo);
 
					//chargeDetails
							if (chkNullAndSizeObject(tariffInfo.getChargeDetails())){ 
								for ( AssociatedChargesInformationTypeI198205C chargeDetatils : tariffInfo.getChargeDetails()){
									ChargeDetailsVO chargeDetailsVO = new ChargeDetailsVO();
									chargeDetailsVO.setType(chargeDetatils.getType());
									chargeDetailsVO.setNumberInParty(chargeDetatils.getNumberInParty());
									rateInfo.setChargeDetails(chargeDetailsVO);
									rateInfoLst.add(rateInfo); 
								}
							}
						}
						if (chkNullAndSizeObject(rateInfoLst)){
							typicalCarDataVO.setRateInfoDetails(rateInfoLst);
						}
						 
					}
					//payment
					FormOfPaymentTypeI  payment = typicalCarData.getPayment();
					PaymentVO  paymentVO = new PaymentVO();
					if (chkNullAndSizeObject(payment) && chkNullAndSizeObject(payment.getFormOfPayment())){
						for( FormOfPaymentDetailsTypeI formpayment : payment.getFormOfPayment()){
						 	FormOfPaymentVO	 formOfPayment = new FormOfPaymentVO();					
							formOfPayment.setType(formpayment.getType());
							formOfPayment.setVendorCode(formpayment.getVendorCode());
							formOfPayment.setCreditCardNumber(formpayment.getCreditCardNumber());				
							formOfPayment.setExpiryDate(formpayment.getExpiryDate());
							formOfPayment.setExtendedPayment(formpayment.getExtendedPayment());
							formOfPayment.setFopFreeText(formpayment.getFopFreeText());
							paymentVO.setFormOfPayment(formOfPayment);						
						}
					}
					typicalCarDataVO.setPaymentDetails(paymentVO);
					 
					//bookingSource				
					AdditionalBusinessSourceInformationType  bookingSource = typicalCarData.getBookingSource();
					BookingSourceVO bookingSourceVO = new BookingSourceVO();
					
					if (chkNullAndSizeObject(bookingSource) && chkNullAndSizeObject(bookingSource.getOriginatorDetails()) ){
						OriginatorDetailsVO originatorDetailsVO = new OriginatorDetailsVO();
						originatorDetailsVO.setOriginatorId(bookingSource.getOriginatorDetails().getOriginatorId());
						bookingSourceVO.setOriginatorDetails(originatorDetailsVO);					 
						typicalCarDataVO.setBookingSourceDetails(bookingSourceVO);
					}					 
					
					//marketingInfo
					List<InteractiveFreeTextTypeI136698S>  marketingInfo = typicalCarData.getMarketingInfo();
					List<MarketingInfoVO> marketingInfoVOLst = new ArrayList<MarketingInfoVO>();
							
					List<String> marketingTextLst = new ArrayList<String>();
				 
					if (chkNullAndSizeObject(marketingInfo)){
						for (InteractiveFreeTextTypeI136698S marketingInfoLst : marketingInfo){
							if (chkNullAndSizeObject(marketingInfoLst) && chkNullAndSizeObject(marketingInfoLst.getFreetextDetail())){
								MarketingInfoVO marketingInfoVO = new MarketingInfoVO();		
								FreeTextDetailsVO  marketingInfo_FreeTextDetails = new FreeTextDetailsVO();
								marketingInfo_FreeTextDetails.setTextSubjectQualifier(marketingInfoLst.getFreetextDetail().getSubjectQualifier());
								marketingInfo_FreeTextDetails.setType(marketingInfoLst.getFreetextDetail().getType());
								marketingInfo_FreeTextDetails.setCompanyId(marketingInfoLst.getFreetextDetail().getCompanyId());
								marketingInfo_FreeTextDetails.setLanguage(marketingInfoLst.getFreetextDetail().getLanguage());
								marketingInfoVO.setFreetextDetail(marketingInfo_FreeTextDetails); 
			 
								for(String text: marketingInfoLst.getText()){
									marketingTextLst.add(text);
								}
								marketingInfoVO.setText(marketingTextLst);
								marketingInfoVOLst.add(marketingInfoVO);
							}
							
							typicalCarDataVO.setMarketingInfoDetails(marketingInfoVOLst);
						}
					} 
					//supleInfo
					List<MiscellaneousRemarksType136700S>  supleInfoAll = typicalCarData.getSupleInfo();
					List<SupleInfoVO>  supleInfoVOLst = new ArrayList<SupleInfoVO>();
					
				
					if (chkNullAndSizeObject(supleInfoAll)){
						for(MiscellaneousRemarksType136700S supleInfoLst : supleInfoAll){
							if(chkNullAndSizeObject(supleInfoLst)){
								SupleInfoVO  supleInfo = new SupleInfoVO();
								RemarkDetailsVO remarkDetails = new RemarkDetailsVO();
								remarkDetails.setType(supleInfoLst.getRemarkDetails().getType());
								remarkDetails.setFreetext(supleInfoLst.getRemarkDetails().getFreetext());
								remarkDetails.setLanguage(supleInfoLst.getRemarkDetails().getLanguage());
								remarkDetails.setEncoding(supleInfoLst.getRemarkDetails().getEncoding());
								supleInfo.setRemarkDetails(remarkDetails);
							supleInfoVOLst.add(supleInfo);
						}
							typicalCarDataVO.setSupleInfoDetails(supleInfoVOLst); 
						}					
					}				 
					
					//AttributeType
					AttributeType  attribute = typicalCarData.getAttribute();
					AttributeVO attributeTypeVO = new AttributeVO();
					
					if (chkNullAndSizeObject(attribute)){ 					
						attributeTypeVO.setCriteriaSetType(attribute.getCriteriaSetType());
						for(AttributeInformationTypeU198185C criteriaDetails : attribute.getCriteriaDetails()){
							CriteriaDetailsVO  criteriaDetailsVO = new CriteriaDetailsVO();
							criteriaDetailsVO.setAttributeType(criteriaDetails.getAttributeType());
							attributeTypeVO.setCriteriaDetailsVO(criteriaDetailsVO);
						}
					 typicalCarDataVO.setAttributeDetails(attributeTypeVO);
					} 					 
					}
			 	}
 
	//log.info("######## typicalCarDataVO:"+typicalCarDataVO);
	itineraryVO.setTypicalCarData(typicalCarDataVO);
	}
} 	
	/**
	 * Populates contact information on the booking.
	 *
	 * @param selfServiceBookingVO
	 *            booking.
	 * @param refNumber
	 *            contact info reference.
	 * @param dataElementsIndiv
	 *            contact info data element.
	 */
	private static void populateContactDetails(final SelfServiceBookingVO selfServiceBookingVO, final String refNumber,
			final DataElementsIndiv dataElementsIndiv) {
		if (chkNullAndSizeObject(dataElementsIndiv.getOtherDataFreetext())) {
			log.info("DataElementsIndiv does not contain OtherDataFreetext for AP reference:" + refNumber);
			return;
		}
		log.info("Populating contact details");
		for (LongFreeTextType longFreeTextType : dataElementsIndiv.getOtherDataFreetext()) {
			if (longFreeTextType.getFreetextDetail() != null) {
				String contactInfoType = longFreeTextType.getFreetextDetail().getType();
				if (longFreeTextType.getLongFreetext() != null) {
					if (chkStringEquals(contactInfoType, ContactInfoType.CONTACT_NUMBER.getType())) {
						setPhoneNumbers(selfServiceBookingVO, refNumber, longFreeTextType);
					} else if (chkStringEquals(contactInfoType, ContactInfoType.EMAIL_ADDRESS.getType())) {
						selfServiceBookingVO.setEmailAddress(longFreeTextType.getLongFreetext());
						selfServiceBookingVO.setEmailAddressReferenceNumber(refNumber);
					}
				}
			}
		}
	}

	/**
	 * Sets phone numbers from the {@see LongFreeTextType} to the
	 * {@see BookingVO}.
	 *
	 * @param selfServiceBookingVO
	 *            booking to set phone numbers on.
	 * @param refNumber
	 *            phone number reference.
	 * @param longFreeTextType
	 *            object containing phone numbers.
	 */
	private static void setPhoneNumbers(final SelfServiceBookingVO selfServiceBookingVO, final String refNumber,
			final LongFreeTextType longFreeTextType) {
		log.info("Setting phone number from: " + longFreeTextType.getLongFreetext());
		String[] phoneNumberDetails = longFreeTextType.getLongFreetext().split("-");
		if (phoneNumberDetails.length == 2) {
			String phoneNumberType = phoneNumberDetails[1];
			if (chkStringEquals(phoneNumberType, ContactInfoType.MOBILE_PHONE.getType())) {
				selfServiceBookingVO.setMobileTelephone(phoneNumberDetails[0]);
				selfServiceBookingVO.setMobileTelephoneReferenceNumber(refNumber);
			} else if (chkStringEquals(phoneNumberType, ContactInfoType.HOME_PHONE.getType())) {
				selfServiceBookingVO.setDayTimeTelephone(phoneNumberDetails[0]);
				selfServiceBookingVO.setDayTimeTelephoneReferenceNumber(refNumber);
			} else if (chkStringEquals(phoneNumberType, ContactInfoType.EMERGENCY_PHONE.getType())) {
				AlternateContactDetailsVO alternateContactDetailsVO = new AlternateContactDetailsVO();
				alternateContactDetailsVO.setAltTelePhoneNumber(phoneNumberDetails[0]);
				alternateContactDetailsVO.setReferenceNumber(refNumber);
				selfServiceBookingVO.setAlternateContactDetailsVO(alternateContactDetailsVO);
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
	private static void populateServiceRequests(final SelfServiceBookingVO selfServiceBookingVO, final String refNumber,
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
				&& chkNullAndSizeCollection(dataElementsIndiv.getReferenceForDataElement().getReference())) {
			for (ReferencingDetailsType111975C referenceDetails : dataElementsIndiv.getReferenceForDataElement()
					.getReference()) {
				if (chkNullAndSizeObject(referenceDetails)) {
				if (ReferenceQualifierType.ST.toString().equals(referenceDetails.getQualifier())) {
					segmentReferences.add(referenceDetails.getNumber());
				} else if (ReferenceQualifierType.PT.toString().equals(referenceDetails.getQualifier())) {
					passengerReferences.add(referenceDetails.getNumber());
				}
			}
		}
		}
		if (dataElementsIndiv.getElementManagementData() != null && ReferenceQualifierType.OT.toString()
				.equals(dataElementsIndiv.getElementManagementData().getReference().getQualifier())) {
			ssrQualifierNumber = dataElementsIndiv.getElementManagementData().getReference().getNumber().toString();
		}
		// SSR Info
		log.info("Found an SSR serviceRequest::"+serviceRequest);
		SpecialRequirementsTypeDetailsTypeI ssrInfo = null;
		if (chkNullAndSizeObject(serviceRequest.getSsr())) {
		  ssrInfo = serviceRequest.getSsr();
		}
		 
		if (chkNullAndSizeObject(ssrInfo)) {
			//ssrMap.put(ssrQualifierNumber, ssrInfo.getType());
			 
			if (ReferenceQualifierType.RQST.name().equals(ssrInfo.getType())) {
				log.info("calling populateSeats ::"); 
				ssrMap.put(ssrQualifierNumber, "RQST");				 
				populateSeats(refNumber, refQualifier, segmentReferences, dataElementsIndiv, serviceRequest);
			} else if ("EXWB".equals(ssrInfo.getType())) {
				ssrMap.put(ssrQualifierNumber, "EXWB");				 
				populateExtraBaggages(refNumber, refQualifier, segmentReferences, dataElementsIndiv, serviceRequest,
						passengerReferences);
			}		 
			if (chkNullAndSizeObject(ssrInfo.getType()) && MealType.containsValue(ssrInfo.getType())) {
				MealType mealType = MealType.valueOf(ssrInfo.getType());				 
				populateMeals(refNumber, refQualifier, segmentReferences, passengerReferences, mealType);
			}
			if ("CUFF".equals(ssrInfo.getType()) && "4Z".equals(ssrInfo.getCompanyId())) {
				log.info("setting GroupBooking ::"); 
				selfServiceBookingVO.setGroupBooking(true);
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
		log.info("############# calling populateSeats"); 
		//if (chkNullAndSizeObject(serviceRequest.getSsrb())) {
		//	log.info("No seat details found on this ssr.");
		//	return;
		//}

		// Map of reference numbers and their qualifiers. Used for cross
		// referencing.
		Map<String, String> referenceQualifierMap = new HashMap<String, String>();
		if (chkNullAndSizeCollection(dataElementsIndiv.getSeatPaxInfo())) {
			for (DataElementsIndiv.SeatPaxInfo seatPaxInfo : dataElementsIndiv.getSeatPaxInfo()) {
				if (seatPaxInfo.getCrossRef() != null
						&& chkNullAndSizeCollection(seatPaxInfo.getCrossRef().getReference())) {
					
					for (ReferencingDetailsType referencingDetailsType : seatPaxInfo.getCrossRef().getReference()) {
						log.info("#############  populateSeats referencingDetailsType"); 
						referenceQualifierMap.put(referencingDetailsType.getNumber(),
								referencingDetailsType.getQualifier());
					}
				} else {
					log.info("Found SeatPaxInfo with missing cross referencing details.");
				}
			}
		}
		if(chkNullAndSizeObject( serviceRequest.getSsrb())){
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
			ssrVO.setSsrDescription(String.join(ssrDetails.getSeatType().toString(), ","));
			if(chkNullAndSizeObject(segmentReferences) && chkNullAndSizeObject(itineraryVOMap)){			 
				for (String segRef : segmentReferences) {
					itineraryVOMap.get(segRef).getSeatingInformation().add(ssrVO);
				}
			} else {
				log.info("Cannot assign seats because there are not segment references found.");
			}
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
	 

		SpecialRequirementsTypeDetailsTypeI specialRequirementsType = serviceRequest.getSsr();
		if ( chkNullAndSizeObject(passengerReferences) && chkNullAndSizeObject(ReferenceQualifierType.PT) && chkNullAndSizeObject(specialRequirementsType)) {
			 
			for (String paxReference : passengerReferences) {
				SSRVO ssrVO = new SSRVO();
				ssrVO.setSsrValue(specialRequirementsType.getType());
				ssrVO.setSsrDescription(specialRequirementsType.getFreeText().get(0));
				ssrVO.setReferenceQualifier(ReferenceQualifierType.PT.name());
				ssrVO.setReferenceNumber(paxReference);
				ssrVO.setSsrReferenceQualifier(refNumber);
				ssrVO.setSsrReferenceNumber(refQualifier);
				if (chkNullAndSizeObject(segmentReferences) && chkNullAndSizeObject(itineraryVOMap)) {
					for (String segRef : segmentReferences) {
						if(chkNullAndSizeObject(itineraryVOMap.get(segRef).getExtraBaggage())){
						itineraryVOMap.get(segRef).getExtraBaggage().add(ssrVO);
						}
					}
				} else {
					log.info("Cannot assign ExtraBaggages because there are not segment references found.");
				}
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
 
		String referenceQualifier = "NoQualifier";
		if(chkNullAndSizeObject(passengerReferences) && chkNullAndSizeObject(mealType)&& 
				chkNullAndSizeObject(ReferenceQualifierType.PT)){
		 
			if(chkNullAndSizeObject(ReferenceQualifierType.PT.name())){
				referenceQualifier=ReferenceQualifierType.PT.name();
			}
			 
		for (String paxReference : passengerReferences) {
			SSRVO ssrVO = new SSRVO();
			ssrVO.setSsrValue(mealType.name());
			ssrVO.setSsrDescription(mealType.getDescription());
			ssrVO.setReferenceQualifier(referenceQualifier);
			ssrVO.setReferenceNumber(paxReference);
			ssrVO.setSsrReferenceQualifier(refNumber);
			ssrVO.setSsrReferenceNumber(refQualifier);
 
			if (chkNullAndSizeObject(segmentReferences) && chkNullAndSizeObject(itineraryVOMap)) {
				for (String segRef : segmentReferences) {			 
					if (chkNullAndSizeObject(itineraryVOMap.get(segRef)) && 
							chkNullAndSizeObject(itineraryVOMap.get(segRef).getMealInformation())) {
						log.info("MealInformation:"+itineraryVOMap.get(segRef).getMealInformation());
						itineraryVOMap.get(segRef).getMealInformation().add(ssrVO);
				}
				}
			} else {
				log.info("Cannot assign meals because there are not segment references found.");
			}
			 
		}
	}
		log.info("Leaving populateMeals");
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
	 * @param selfServiceBookingVO
	 * @param currencyCode
	 * @param eTicketNumbers
	 * @param eTicketMap
	 * @param emdDetails
	 * @param ssrMap
	 * @param passengerEmdMap
	 */
	private static void populateTicketAndEmdDetails(DataElementsIndiv dataElementsIndiv, SelfServiceBookingVO selfServiceBookingVO,
			String currencyCode, List<String> eTicketNumbers, Map<String, String> eTicketMap,
			List<EMDDetailsVO> emdDetails, Map<String, String> ssrMap, Map<String, List<String>> passengerEmdMap) {
		//log.info("Populate Ticket and Emd Details");
		List<String> emdNumbers = new ArrayList<String>();

		String referenceNumber = null;
		String ssrReferenceNumber = null;
		String ticketNumber = null;
		BigDecimal emdTotal = null;
		if (chkNullAndSizeObject(selfServiceBookingVO.getEmdAmount()))
		emdTotal = new BigDecimal(selfServiceBookingVO.getEmdAmount());
		if (chkNullAndSizeObject(dataElementsIndiv) && chkNullAndSizeObject(dataElementsIndiv.getReferenceForDataElement())) {
	 
			if (chkNullAndSizeObject(dataElementsIndiv.getReferenceForDataElement()
					.getReference())){				 
			List<ReferencingDetailsType111975C> referenceQualifiers = dataElementsIndiv.getReferenceForDataElement()
					.getReference();
			if (chkNullAndSizeObject(referenceQualifiers) ) {
			for (ReferencingDetailsType111975C referencingDetails : referenceQualifiers) {
				if (referencingDetails.getQualifier().equals("PT")) {
					referenceNumber = referencingDetails.getNumber();
				} else if (referencingDetails.getQualifier().equals("OT")) {
					ssrReferenceNumber = referencingDetails.getNumber();
				}
			}
		}
		}
	}
		if (referenceNumber != null && null!= passengerEmdMap && passengerEmdMap.get(referenceNumber) != null
				&& !passengerEmdMap.get(referenceNumber).isEmpty()) {
			emdNumbers = passengerEmdMap.get(referenceNumber);
		}
		
		String emdNumber;
		if (chkNullAndSizeObject(dataElementsIndiv.getOtherDataFreetext())){
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
						selfServiceBookingVO.setTicketed(true);
						selfServiceBookingVO.setPaid(true);
						break;
					} else {
						log.info("Setting enable ticket = N because of ticket number.");
						selfServiceBookingVO.setEnableTicketNumber("N");
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
					//log.info("EMD number found: " + emdNumber);
				}
			}
		}
		}
		if (!emdNumbers.isEmpty()) {
			passengerEmdMap.put(referenceNumber, emdNumbers);
		}
		selfServiceBookingVO.setEmdAmount(emdTotal.toString());

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
		BookingVO selfServiceBookingVO = new BookingVO();
		List<FareInfoVO> fareInfoList = new ArrayList<FareInfoVO>();
		List<TaxVO> taxInfoList = new ArrayList<TaxVO>();
		if (ticketProcessReply.getDocGroup() != null && chkNullAndSizeCollection(ticketProcessReply.getDocGroup())) {
			for (DocGroup docGroup : ticketProcessReply.getDocGroup()) {

				if (docGroup.getFareInfo() != null) {
					if (chkNullAndSizeCollection(docGroup.getFareInfo().getMonetaryDetails())) {
						for (MonetaryInformationDetailsTypeI monetaryDetails : docGroup.getFareInfo()
								.getMonetaryDetails()) {
							FareInfoVO fareInfoVO = new FareInfoVO();
							fareInfoVO.setFareAmount(monetaryDetails.getAmount());
							fareInfoVO.setFareCurrency(monetaryDetails.getCurrency());
							fareInfoVO.setFareType(monetaryDetails.getTypeQualifier());
							fareInfoList.add(fareInfoVO);
						}
						selfServiceBookingVO.setFareInfoDetails(fareInfoList);
					}
				}

				if (chkNullAndSizeCollection(docGroup.getTaxInfo())) {
					for (TaxTypeI taxInfo : docGroup.getTaxInfo()) {
						String taxCategory = taxInfo.getTaxCategory();
						if (chkNullAndSizeCollection(taxInfo.getTaxDetails())) {
							for (TaxDetailsTypeI taxDetails : taxInfo.getTaxDetails()) {
								TaxVO taxVO = new TaxVO();
								taxVO.setAmount(taxDetails.getRate());
								taxVO.setCurrency(taxDetails.getCurrencyCode());
								taxVO.setTaxCategory(taxCategory);
								if (chkNullAndSizeCollection(taxDetails.getType())) {
									String taxType = taxDetails.getType().get(0);
									taxVO.setTaxCode(taxType);
								}
								taxInfoList.add(taxVO);

							}
							selfServiceBookingVO.setTaxDetails(taxInfoList);
						}
					}
				}
			}
		}
		return selfServiceBookingVO;

	}
	*/
	//Commented on 11/09/2020 for TaxInvoice deployment -- end
	
	//Added on 11/09/2020 for TaxInvoice deployment -- start
	//Tax Invoice CR changes added 996 (RFISC) A-8572
		public static SelfServiceBookingVO transformResponse(final TicketProcessEDocReply ticketProcessReply) {

			log.info("Transforming the Amadeus eDoc Reply to BookingVO.");
			SelfServiceBookingVO bookingVO = new SelfServiceBookingVO();
			List<FareInfoVO> fareInfoList = new ArrayList<FareInfoVO>();
			List<TaxVO> taxInfoList = new ArrayList<TaxVO>();
			int i = 0, j = 0;
			if (ticketProcessReply.getDocGroup() != null && chkNullAndSizeCollection(ticketProcessReply.getDocGroup())) {
				for (DocGroup docGroup : ticketProcessReply.getDocGroup()) {

					if (docGroup.getFareInfo() != null) {
						if (chkNullAndSizeCollection(docGroup.getFareInfo().getMonetaryDetails())) {
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
					if (chkNullAndSizeCollection(docGroup.getTaxInfo())) {
						for (TaxTypeI taxInfo : docGroup.getTaxInfo()) {
							String taxCategory = taxInfo.getTaxCategory();
							if (chkNullAndSizeCollection(taxInfo.getTaxDetails())) {
								for (TaxDetailsTypeI taxDetails : taxInfo.getTaxDetails()) {
									TaxVO taxVO = new TaxVO();
									taxVO.setAmount(taxDetails.getRate());
									taxVO.setCurrency(taxDetails.getCurrencyCode());
									taxVO.setTaxCategory(taxCategory);
									if (chkNullAndSizeCollection(taxDetails.getType())) {
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
	/**
	 * 
	 * @param selfServiceBookingVO
	 * @param legSection
	 */
	private static void getLegSectionReferenceInfoType(SelfServiceBookingVO selfServiceBookingVO, LegSection legSection) {
		
		List<ReferenceVO> referencesVOLst = new ArrayList<ReferenceVO>();
		ReferenceInfoType referenceInfoType = legSection.getReferenceForStructDataElement();
		if (chkNullAndSizeObject(referenceInfoType)) {
			List<ReferencingDetailsType111975C> referenceList = referenceInfoType.getReference();
			if (chkNullAndSizeCollection(referenceList)) {
				for (ReferencingDetailsType111975C reference : referenceList) {
					//if (chkNullAndSizeObject(reference)) {
						ReferenceVO referenceVO = new ReferenceVO();
				
						referenceVO.setNumber(reference.getNumber());
						referenceVO.setQualifier(reference.getQualifier());
						referencesVOLst.add(referenceVO);
					
				//	selfServiceBookingVO.setReferenceForStructDataElement_ReferenceNumber(reference.getNumber());
					/*if (reference.getQualifier().equals("PT")) {
						referenceNumber = referencingDetails.getNumber();
					} else if (reference.getQualifier().equals("OT")) {
						ssrReferenceNumber = referencingDetails.getNumber();
					}*/
						 
					}
				}
				
			} 		 
		selfServiceBookingVO.setReferenceDetails(referencesVOLst);
	}
/**
 * 		
 * @param selfServiceBookingVO
 * @param legSection
 */
private static void getPaxStatusDetails(SelfServiceBookingVO selfServiceBookingVO, LegSection legSection ){
			DcsLegInfo dcsLegInfo = legSection.getDcsLegInfo();
			
			List <StatusDetailsVO> statusDetailsVOLst = new ArrayList<StatusDetailsVO>();
			//if (chkNullAndSizeObject(dcsLegInfo)) {
				StatusTypeI127261S paxStatus = dcsLegInfo.getPaxStatus();
				if (chkNullAndSizeObject(paxStatus) && chkNullAndSizeCollection(paxStatus.getStatusDetails())) {
					for (StatusDetailsTypeI185722C statusDetailsType : paxStatus.getStatusDetails()) {
						if (chkNullAndSizeObject(statusDetailsType)) {
							StatusDetailsVO statusDetailsVO = new StatusDetailsVO();
							statusDetailsVO.setIndicator(statusDetailsType.getIndicator());
							statusDetailsVO.setType(statusDetailsType.getType());
							statusDetailsVOLst.add(statusDetailsVO);
							//selfServiceBookingVO.setStatusDetailsVO(statusDetailsVOLst);
								 
						/*if (referencingDetails.getQualifier().equals("PT")) {
							referenceNumber = referencingDetails.getNumber();
						} else if (referencingDetails.getQualifier().equals("OT")) {
							ssrReferenceNumber = referencingDetails.getNumber();
						}*/
						}
					}
				}
			//}
			selfServiceBookingVO.setStatusDetails(statusDetailsVOLst);
		} 
/**
 * 	
 * @param collection
 * @return
 */
	private static boolean chkNullAndSizeCollection(List list) {
		//return collection != null && !CollectionUtils.sizeIsEmpty(collection);
		return (list != null && !list.isEmpty());
		//return true;
	}
/**
 * 
 * @param obj
 * @return
 */
	private static boolean chkNullAndSizeObject(Object obj) {
		return obj != null && Objects.nonNull(obj);		 
	}
/**
 * 
 * @param str1
 * @param str2
 * @return
 */
	private static boolean chkStringEquals(String str1, String str2){
		//return true;
		return str1!=null && str2!=null &&  str1.equals(str2)  && str1 instanceof java.lang.String && str2 instanceof java.lang.String;
	}
 
}
