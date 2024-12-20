
package com.amadeus.xml.tatres_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msgActionDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}MessageActionDetailsTypeI"/&gt;
 *         &lt;element name="sysProvider" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketAgentInfoTypeI" minOccurs="0"/&gt;
 *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="originDestination" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="tourInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TourInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="fop" type="{http://xml.amadeus.com/TATRES_15_2_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
 *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumberOfUnitsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="6" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="documentInformation" type="{http://xml.amadeus.com/TATRES_15_2_1A}DocumentInformationDetailsTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="generalDocGroup" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="docInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketNumberTypeI"/&gt;
 *                   &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI" maxOccurs="4" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="docGroup" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="paxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravellerInformationTypeI"/&gt;
 *                   &lt;element name="enhancedPaxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}EnhancedTravellerInformationType" minOccurs="0"/&gt;
 *                   &lt;element name="sysProvider" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketAgentInfoTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="fop" type="{http://xml.amadeus.com/TATRES_15_2_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="tourInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TourInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumberOfUnitsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="5" minOccurs="0"/&gt;
 *                   &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="documentInformation" type="{http://xml.amadeus.com/TATRES_15_2_1A}DocumentInformationDetailsTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *                   &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *                   &lt;element name="otherTextInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FreeTextInformationType" minOccurs="0"/&gt;
 *                   &lt;element name="customerReference" type="{http://xml.amadeus.com/TATRES_15_2_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="fareDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="docDetailsGroup" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="docInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketNumberTypeI"/&gt;
 *                             &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="validityDates" type="{http://xml.amadeus.com/TATRES_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="customerReference" type="{http://xml.amadeus.com/TATRES_15_2_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="couponGroup" maxOccurs="99" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI"/&gt;
 *                                       &lt;element name="leg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" maxOccurs="2" minOccurs="0"/&gt;
 *                                       &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="bookingStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="baggageInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="validityDates" type="{http://xml.amadeus.com/TATRES_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *                                       &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="fareBasisDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareQualifierDetailsType_174783S" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="fareComponentDetailsGroup" maxOccurs="4" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="fareComponentID" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberType"/&gt;
 *                                       &lt;element name="marketFareComponent" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationType" minOccurs="0"/&gt;
 *                                       &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingOrTicketingSubsequentType" minOccurs="0"/&gt;
 *                                       &lt;element name="fareQualifiersDetail" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareQualifierDetailsType" minOccurs="0"/&gt;
 *                                       &lt;element name="fareFamilyDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareFamilyType" minOccurs="0"/&gt;
 *                                       &lt;element name="fareFamilyOwner" type="{http://xml.amadeus.com/TATRES_15_2_1A}TransportIdentifierType" minOccurs="0"/&gt;
 *                                       &lt;element name="couponDetailsGroup" maxOccurs="99"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="productId" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReferenceInfoType"/&gt;
 *                                                 &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationType" minOccurs="0"/&gt;
 *                                                 &lt;element name="taxDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="fareElementsGroup" maxOccurs="2" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="fareComponentInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareComponentInformationTypeI"/&gt;
 *                             &lt;element name="fareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumberOfUnitsTypeI"/&gt;
 *                                       &lt;element name="pricedFareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberTypeI"/&gt;
 *                                                 &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="structuredFareCalcAction" type="{http://xml.amadeus.com/TATRES_15_2_1A}ActionDetailsTypeI"/&gt;
 *                                                           &lt;element name="structuredFareCalcLeg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="structuredFareCalcMonInfo2" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                                                 &lt;element name="structuredFareCalcPricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
 *                                                 &lt;element name="structuredFareCalcDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
 *                                                 &lt;element name="structuredFareCalcRate" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
 *                                                 &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
 *                                                 &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="structuredFareCalcMonInfo1" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="structuredFareCalcTaxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *                             &lt;element name="structuredFareCalcConversionInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ConversionRateTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="reissuedFlownDetails" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="refundStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}StatusTypeI"/&gt;
 *                             &lt;element name="refundLeg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="refundDocumentInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketNumberTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI" maxOccurs="9" minOccurs="0"/&gt;
 *                             &lt;element name="refundPricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="refundRoutingDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}RoutingInformationTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *                             &lt;element name="refundProductDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}AdditionalProductDetailsTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="staffTravellerGroup" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="travellerStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravellerPriorityDetailsTypeI"/&gt;
 *                             &lt;element name="staffInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}SpecificDataInformationTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="originalIssuanceGroup" maxOccurs="2" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="officeIdentification" type="{http://xml.amadeus.com/TATRES_15_2_1A}AdditionalBusinessSourceInformationTypeI"/&gt;
 *                             &lt;element name="exchangeDocumentDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}DocumentInformationDetailsTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="carrierFeeGroup" maxOccurs="9" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selectionDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}SelectionDetailsTypeI"/&gt;
 *                             &lt;element name="carrierFeeInfo" maxOccurs="99"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}SpecificDataInformationTypeI"/&gt;
 *                                       &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI"/&gt;
 *                                       &lt;element name="fop" type="{http://xml.amadeus.com/TATRES_15_2_1A}FormOfPaymentTypeI"/&gt;
 *                                       &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msgActionDetails",
    "sysProvider",
    "referenceInfo",
    "fareInfo",
    "productInfo",
    "originDestination",
    "tourInfo",
    "fop",
    "numberOfUnits",
    "taxInfo",
    "error",
    "couponInfo",
    "documentInformation",
    "textInfo",
    "fareDetails",
    "generalDocGroup",
    "docGroup"
})
@XmlRootElement(name = "Ticket_ProcessEDocReply")
public class TicketProcessEDocReply {

    @XmlElement(required = true)
    protected MessageActionDetailsTypeI msgActionDetails;
    protected TicketAgentInfoTypeI sysProvider;
    protected ReservationControlInformationTypeI referenceInfo;
    protected MonetaryInformationTypeI fareInfo;
    protected PricingTicketingDetailsTypeI productInfo;
    protected OriginAndDestinationDetailsTypeI originDestination;
    protected TourInformationTypeI tourInfo;
    protected FormOfPaymentTypeI fop;
    protected NumberOfUnitsTypeI numberOfUnits;
    protected List<TaxTypeI> taxInfo;
    protected ApplicationErrorInformationTypeI error;
    protected CouponInformationTypeI couponInfo;
    protected List<DocumentInformationDetailsTypeI> documentInformation;
    protected List<InteractiveFreeTextTypeI> textInfo;
    protected FareInformationTypeI fareDetails;
    protected List<TicketProcessEDocReply.GeneralDocGroup> generalDocGroup;
    protected List<TicketProcessEDocReply.DocGroup> docGroup;

    /**
     * Gets the value of the msgActionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public MessageActionDetailsTypeI getMsgActionDetails() {
        return msgActionDetails;
    }

    /**
     * Sets the value of the msgActionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public void setMsgActionDetails(MessageActionDetailsTypeI value) {
        this.msgActionDetails = value;
    }

    /**
     * Gets the value of the sysProvider property.
     * 
     * @return
     *     possible object is
     *     {@link TicketAgentInfoTypeI }
     *     
     */
    public TicketAgentInfoTypeI getSysProvider() {
        return sysProvider;
    }

    /**
     * Sets the value of the sysProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketAgentInfoTypeI }
     *     
     */
    public void setSysProvider(TicketAgentInfoTypeI value) {
        this.sysProvider = value;
    }

    /**
     * Gets the value of the referenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getReferenceInfo() {
        return referenceInfo;
    }

    /**
     * Sets the value of the referenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setReferenceInfo(ReservationControlInformationTypeI value) {
        this.referenceInfo = value;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationTypeI }
     *     
     */
    public MonetaryInformationTypeI getFareInfo() {
        return fareInfo;
    }

    /**
     * Sets the value of the fareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationTypeI }
     *     
     */
    public void setFareInfo(MonetaryInformationTypeI value) {
        this.fareInfo = value;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingDetailsTypeI }
     *     
     */
    public PricingTicketingDetailsTypeI getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingDetailsTypeI }
     *     
     */
    public void setProductInfo(PricingTicketingDetailsTypeI value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the originDestination property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetailsTypeI }
     *     
     */
    public OriginAndDestinationDetailsTypeI getOriginDestination() {
        return originDestination;
    }

    /**
     * Sets the value of the originDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetailsTypeI }
     *     
     */
    public void setOriginDestination(OriginAndDestinationDetailsTypeI value) {
        this.originDestination = value;
    }

    /**
     * Gets the value of the tourInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TourInformationTypeI }
     *     
     */
    public TourInformationTypeI getTourInfo() {
        return tourInfo;
    }

    /**
     * Sets the value of the tourInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourInformationTypeI }
     *     
     */
    public void setTourInfo(TourInformationTypeI value) {
        this.tourInfo = value;
    }

    /**
     * Gets the value of the fop property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public FormOfPaymentTypeI getFop() {
        return fop;
    }

    /**
     * Sets the value of the fop property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public void setFop(FormOfPaymentTypeI value) {
        this.fop = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsTypeI }
     *     
     */
    public NumberOfUnitsTypeI getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsTypeI }
     *     
     */
    public void setNumberOfUnits(NumberOfUnitsTypeI value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTypeI }
     * 
     * 
     */
    public List<TaxTypeI> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TaxTypeI>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationTypeI }
     *     
     */
    public ApplicationErrorInformationTypeI getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationTypeI }
     *     
     */
    public void setError(ApplicationErrorInformationTypeI value) {
        this.error = value;
    }

    /**
     * Gets the value of the couponInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformationTypeI }
     *     
     */
    public CouponInformationTypeI getCouponInfo() {
        return couponInfo;
    }

    /**
     * Sets the value of the couponInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformationTypeI }
     *     
     */
    public void setCouponInfo(CouponInformationTypeI value) {
        this.couponInfo = value;
    }

    /**
     * Gets the value of the documentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentInformationDetailsTypeI }
     * 
     * 
     */
    public List<DocumentInformationDetailsTypeI> getDocumentInformation() {
        if (documentInformation == null) {
            documentInformation = new ArrayList<DocumentInformationDetailsTypeI>();
        }
        return this.documentInformation;
    }

    /**
     * Gets the value of the textInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractiveFreeTextTypeI }
     * 
     * 
     */
    public List<InteractiveFreeTextTypeI> getTextInfo() {
        if (textInfo == null) {
            textInfo = new ArrayList<InteractiveFreeTextTypeI>();
        }
        return this.textInfo;
    }

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformationTypeI }
     *     
     */
    public FareInformationTypeI getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformationTypeI }
     *     
     */
    public void setFareDetails(FareInformationTypeI value) {
        this.fareDetails = value;
    }

    /**
     * Gets the value of the generalDocGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalDocGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralDocGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketProcessEDocReply.GeneralDocGroup }
     * 
     * 
     */
    public List<TicketProcessEDocReply.GeneralDocGroup> getGeneralDocGroup() {
        if (generalDocGroup == null) {
            generalDocGroup = new ArrayList<TicketProcessEDocReply.GeneralDocGroup>();
        }
        return this.generalDocGroup;
    }

    /**
     * Gets the value of the docGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketProcessEDocReply.DocGroup }
     * 
     * 
     */
    public List<TicketProcessEDocReply.DocGroup> getDocGroup() {
        if (docGroup == null) {
            docGroup = new ArrayList<TicketProcessEDocReply.DocGroup>();
        }
        return this.docGroup;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="paxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravellerInformationTypeI"/&gt;
     *         &lt;element name="enhancedPaxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}EnhancedTravellerInformationType" minOccurs="0"/&gt;
     *         &lt;element name="sysProvider" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketAgentInfoTypeI" minOccurs="0"/&gt;
     *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="fop" type="{http://xml.amadeus.com/TATRES_15_2_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
     *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="tourInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TourInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumberOfUnitsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="5" minOccurs="0"/&gt;
     *         &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="documentInformation" type="{http://xml.amadeus.com/TATRES_15_2_1A}DocumentInformationDetailsTypeI" maxOccurs="99" minOccurs="0"/&gt;
     *         &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/&gt;
     *         &lt;element name="otherTextInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FreeTextInformationType" minOccurs="0"/&gt;
     *         &lt;element name="customerReference" type="{http://xml.amadeus.com/TATRES_15_2_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
     *         &lt;element name="docDetailsGroup" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="docInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketNumberTypeI"/&gt;
     *                   &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="validityDates" type="{http://xml.amadeus.com/TATRES_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="customerReference" type="{http://xml.amadeus.com/TATRES_15_2_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="couponGroup" maxOccurs="99" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI"/&gt;
     *                             &lt;element name="leg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" maxOccurs="2" minOccurs="0"/&gt;
     *                             &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="bookingStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="baggageInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="validityDates" type="{http://xml.amadeus.com/TATRES_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/&gt;
     *                             &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="fareBasisDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareQualifierDetailsType_174783S" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="fareComponentDetailsGroup" maxOccurs="4" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="fareComponentID" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberType"/&gt;
     *                             &lt;element name="marketFareComponent" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationType" minOccurs="0"/&gt;
     *                             &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingOrTicketingSubsequentType" minOccurs="0"/&gt;
     *                             &lt;element name="fareQualifiersDetail" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareQualifierDetailsType" minOccurs="0"/&gt;
     *                             &lt;element name="fareFamilyDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareFamilyType" minOccurs="0"/&gt;
     *                             &lt;element name="fareFamilyOwner" type="{http://xml.amadeus.com/TATRES_15_2_1A}TransportIdentifierType" minOccurs="0"/&gt;
     *                             &lt;element name="couponDetailsGroup" maxOccurs="99"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="productId" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReferenceInfoType"/&gt;
     *                                       &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationType" minOccurs="0"/&gt;
     *                                       &lt;element name="taxDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="fareElementsGroup" maxOccurs="2" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="fareComponentInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareComponentInformationTypeI"/&gt;
     *                   &lt;element name="fareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumberOfUnitsTypeI"/&gt;
     *                             &lt;element name="pricedFareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberTypeI"/&gt;
     *                                       &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="structuredFareCalcAction" type="{http://xml.amadeus.com/TATRES_15_2_1A}ActionDetailsTypeI"/&gt;
     *                                                 &lt;element name="structuredFareCalcLeg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="structuredFareCalcMonInfo2" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *                                       &lt;element name="structuredFareCalcPricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
     *                                       &lt;element name="structuredFareCalcDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
     *                                       &lt;element name="structuredFareCalcRate" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
     *                                       &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
     *                                       &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="structuredFareCalcMonInfo1" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="structuredFareCalcTaxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
     *                   &lt;element name="structuredFareCalcConversionInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ConversionRateTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="reissuedFlownDetails" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="refundStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}StatusTypeI"/&gt;
     *                   &lt;element name="refundLeg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="refundDocumentInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketNumberTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI" maxOccurs="9" minOccurs="0"/&gt;
     *                   &lt;element name="refundPricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="refundRoutingDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}RoutingInformationTypeI" maxOccurs="99" minOccurs="0"/&gt;
     *                   &lt;element name="refundProductDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}AdditionalProductDetailsTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="staffTravellerGroup" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="travellerStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravellerPriorityDetailsTypeI"/&gt;
     *                   &lt;element name="staffInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}SpecificDataInformationTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="originalIssuanceGroup" maxOccurs="2" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="officeIdentification" type="{http://xml.amadeus.com/TATRES_15_2_1A}AdditionalBusinessSourceInformationTypeI"/&gt;
     *                   &lt;element name="exchangeDocumentDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}DocumentInformationDetailsTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="carrierFeeGroup" maxOccurs="9" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selectionDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}SelectionDetailsTypeI"/&gt;
     *                   &lt;element name="carrierFeeInfo" maxOccurs="99"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}SpecificDataInformationTypeI"/&gt;
     *                             &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI"/&gt;
     *                             &lt;element name="fop" type="{http://xml.amadeus.com/TATRES_15_2_1A}FormOfPaymentTypeI"/&gt;
     *                             &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paxInfo",
        "enhancedPaxInfo",
        "sysProvider",
        "referenceInfo",
        "fareInfo",
        "fop",
        "productInfo",
        "originDestination",
        "frequentTravellerInfo",
        "tourInfo",
        "originatorInfo",
        "numberOfUnits",
        "taxInfo",
        "error",
        "documentInformation",
        "textInfo",
        "otherTextInfo",
        "customerReference",
        "fareDetails",
        "pricingInfo",
        "docDetailsGroup",
        "fareElementsGroup",
        "reissuedFlownDetails",
        "staffTravellerGroup",
        "originalIssuanceGroup",
        "carrierFeeGroup"
    })
    public static class DocGroup {

        @XmlElement(required = true)
        protected TravellerInformationTypeI paxInfo;
        protected EnhancedTravellerInformationType enhancedPaxInfo;
        protected TicketAgentInfoTypeI sysProvider;
        protected ReservationControlInformationTypeI referenceInfo;
        protected MonetaryInformationTypeI fareInfo;
        protected FormOfPaymentTypeI fop;
        protected PricingTicketingDetailsTypeI productInfo;
        protected OriginAndDestinationDetailsTypeI originDestination;
        protected FrequentTravellerInformationTypeI frequentTravellerInfo;
        protected TourInformationTypeI tourInfo;
        protected OriginatorOfRequestDetailsTypeI originatorInfo;
        protected NumberOfUnitsTypeI numberOfUnits;
        protected List<TaxTypeI> taxInfo;
        protected ApplicationErrorInformationTypeI error;
        protected List<DocumentInformationDetailsTypeI> documentInformation;
        protected List<InteractiveFreeTextTypeI> textInfo;
        protected FreeTextInformationType otherTextInfo;
        protected ConsumerReferenceInformationTypeI customerReference;
        protected FareInformationTypeI fareDetails;
        protected PricingTicketingSubsequentTypeI pricingInfo;
        protected List<TicketProcessEDocReply.DocGroup.DocDetailsGroup> docDetailsGroup;
        protected List<TicketProcessEDocReply.DocGroup.FareElementsGroup> fareElementsGroup;
        protected List<TicketProcessEDocReply.DocGroup.ReissuedFlownDetails> reissuedFlownDetails;
        protected TicketProcessEDocReply.DocGroup.StaffTravellerGroup staffTravellerGroup;
        protected List<TicketProcessEDocReply.DocGroup.OriginalIssuanceGroup> originalIssuanceGroup;
        protected List<TicketProcessEDocReply.DocGroup.CarrierFeeGroup> carrierFeeGroup;

        /**
         * Gets the value of the paxInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TravellerInformationTypeI }
         *     
         */
        public TravellerInformationTypeI getPaxInfo() {
            return paxInfo;
        }

        /**
         * Sets the value of the paxInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravellerInformationTypeI }
         *     
         */
        public void setPaxInfo(TravellerInformationTypeI value) {
            this.paxInfo = value;
        }

        /**
         * Gets the value of the enhancedPaxInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EnhancedTravellerInformationType }
         *     
         */
        public EnhancedTravellerInformationType getEnhancedPaxInfo() {
            return enhancedPaxInfo;
        }

        /**
         * Sets the value of the enhancedPaxInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnhancedTravellerInformationType }
         *     
         */
        public void setEnhancedPaxInfo(EnhancedTravellerInformationType value) {
            this.enhancedPaxInfo = value;
        }

        /**
         * Gets the value of the sysProvider property.
         * 
         * @return
         *     possible object is
         *     {@link TicketAgentInfoTypeI }
         *     
         */
        public TicketAgentInfoTypeI getSysProvider() {
            return sysProvider;
        }

        /**
         * Sets the value of the sysProvider property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketAgentInfoTypeI }
         *     
         */
        public void setSysProvider(TicketAgentInfoTypeI value) {
            this.sysProvider = value;
        }

        /**
         * Gets the value of the referenceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformationTypeI }
         *     
         */
        public ReservationControlInformationTypeI getReferenceInfo() {
            return referenceInfo;
        }

        /**
         * Sets the value of the referenceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformationTypeI }
         *     
         */
        public void setReferenceInfo(ReservationControlInformationTypeI value) {
            this.referenceInfo = value;
        }

        /**
         * Gets the value of the fareInfo property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public MonetaryInformationTypeI getFareInfo() {
            return fareInfo;
        }

        /**
         * Sets the value of the fareInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public void setFareInfo(MonetaryInformationTypeI value) {
            this.fareInfo = value;
        }

        /**
         * Gets the value of the fop property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public FormOfPaymentTypeI getFop() {
            return fop;
        }

        /**
         * Sets the value of the fop property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public void setFop(FormOfPaymentTypeI value) {
            this.fop = value;
        }

        /**
         * Gets the value of the productInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsTypeI }
         *     
         */
        public PricingTicketingDetailsTypeI getProductInfo() {
            return productInfo;
        }

        /**
         * Sets the value of the productInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsTypeI }
         *     
         */
        public void setProductInfo(PricingTicketingDetailsTypeI value) {
            this.productInfo = value;
        }

        /**
         * Gets the value of the originDestination property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public OriginAndDestinationDetailsTypeI getOriginDestination() {
            return originDestination;
        }

        /**
         * Sets the value of the originDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public void setOriginDestination(OriginAndDestinationDetailsTypeI value) {
            this.originDestination = value;
        }

        /**
         * Gets the value of the frequentTravellerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerInformationTypeI }
         *     
         */
        public FrequentTravellerInformationTypeI getFrequentTravellerInfo() {
            return frequentTravellerInfo;
        }

        /**
         * Sets the value of the frequentTravellerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerInformationTypeI }
         *     
         */
        public void setFrequentTravellerInfo(FrequentTravellerInformationTypeI value) {
            this.frequentTravellerInfo = value;
        }

        /**
         * Gets the value of the tourInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TourInformationTypeI }
         *     
         */
        public TourInformationTypeI getTourInfo() {
            return tourInfo;
        }

        /**
         * Sets the value of the tourInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TourInformationTypeI }
         *     
         */
        public void setTourInfo(TourInformationTypeI value) {
            this.tourInfo = value;
        }

        /**
         * Gets the value of the originatorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OriginatorOfRequestDetailsTypeI }
         *     
         */
        public OriginatorOfRequestDetailsTypeI getOriginatorInfo() {
            return originatorInfo;
        }

        /**
         * Sets the value of the originatorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginatorOfRequestDetailsTypeI }
         *     
         */
        public void setOriginatorInfo(OriginatorOfRequestDetailsTypeI value) {
            this.originatorInfo = value;
        }

        /**
         * Gets the value of the numberOfUnits property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsTypeI }
         *     
         */
        public NumberOfUnitsTypeI getNumberOfUnits() {
            return numberOfUnits;
        }

        /**
         * Sets the value of the numberOfUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsTypeI }
         *     
         */
        public void setNumberOfUnits(NumberOfUnitsTypeI value) {
            this.numberOfUnits = value;
        }

        /**
         * Gets the value of the taxInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxTypeI }
         * 
         * 
         */
        public List<TaxTypeI> getTaxInfo() {
            if (taxInfo == null) {
                taxInfo = new ArrayList<TaxTypeI>();
            }
            return this.taxInfo;
        }

        /**
         * Gets the value of the error property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public ApplicationErrorInformationTypeI getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public void setError(ApplicationErrorInformationTypeI value) {
            this.error = value;
        }

        /**
         * Gets the value of the documentInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentInformationDetailsTypeI }
         * 
         * 
         */
        public List<DocumentInformationDetailsTypeI> getDocumentInformation() {
            if (documentInformation == null) {
                documentInformation = new ArrayList<DocumentInformationDetailsTypeI>();
            }
            return this.documentInformation;
        }

        /**
         * Gets the value of the textInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the textInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTextInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InteractiveFreeTextTypeI }
         * 
         * 
         */
        public List<InteractiveFreeTextTypeI> getTextInfo() {
            if (textInfo == null) {
                textInfo = new ArrayList<InteractiveFreeTextTypeI>();
            }
            return this.textInfo;
        }

        /**
         * Gets the value of the otherTextInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextInformationType }
         *     
         */
        public FreeTextInformationType getOtherTextInfo() {
            return otherTextInfo;
        }

        /**
         * Sets the value of the otherTextInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextInformationType }
         *     
         */
        public void setOtherTextInfo(FreeTextInformationType value) {
            this.otherTextInfo = value;
        }

        /**
         * Gets the value of the customerReference property.
         * 
         * @return
         *     possible object is
         *     {@link ConsumerReferenceInformationTypeI }
         *     
         */
        public ConsumerReferenceInformationTypeI getCustomerReference() {
            return customerReference;
        }

        /**
         * Sets the value of the customerReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConsumerReferenceInformationTypeI }
         *     
         */
        public void setCustomerReference(ConsumerReferenceInformationTypeI value) {
            this.customerReference = value;
        }

        /**
         * Gets the value of the fareDetails property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformationTypeI }
         *     
         */
        public FareInformationTypeI getFareDetails() {
            return fareDetails;
        }

        /**
         * Sets the value of the fareDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformationTypeI }
         *     
         */
        public void setFareDetails(FareInformationTypeI value) {
            this.fareDetails = value;
        }

        /**
         * Gets the value of the pricingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingSubsequentTypeI }
         *     
         */
        public PricingTicketingSubsequentTypeI getPricingInfo() {
            return pricingInfo;
        }

        /**
         * Sets the value of the pricingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingSubsequentTypeI }
         *     
         */
        public void setPricingInfo(PricingTicketingSubsequentTypeI value) {
            this.pricingInfo = value;
        }

        /**
         * Gets the value of the docDetailsGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docDetailsGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocDetailsGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketProcessEDocReply.DocGroup.DocDetailsGroup }
         * 
         * 
         */
        public List<TicketProcessEDocReply.DocGroup.DocDetailsGroup> getDocDetailsGroup() {
            if (docDetailsGroup == null) {
                docDetailsGroup = new ArrayList<TicketProcessEDocReply.DocGroup.DocDetailsGroup>();
            }
            return this.docDetailsGroup;
        }

        /**
         * Gets the value of the fareElementsGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareElementsGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareElementsGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketProcessEDocReply.DocGroup.FareElementsGroup }
         * 
         * 
         */
        public List<TicketProcessEDocReply.DocGroup.FareElementsGroup> getFareElementsGroup() {
            if (fareElementsGroup == null) {
                fareElementsGroup = new ArrayList<TicketProcessEDocReply.DocGroup.FareElementsGroup>();
            }
            return this.fareElementsGroup;
        }

        /**
         * Gets the value of the reissuedFlownDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reissuedFlownDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReissuedFlownDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketProcessEDocReply.DocGroup.ReissuedFlownDetails }
         * 
         * 
         */
        public List<TicketProcessEDocReply.DocGroup.ReissuedFlownDetails> getReissuedFlownDetails() {
            if (reissuedFlownDetails == null) {
                reissuedFlownDetails = new ArrayList<TicketProcessEDocReply.DocGroup.ReissuedFlownDetails>();
            }
            return this.reissuedFlownDetails;
        }

        /**
         * Gets the value of the staffTravellerGroup property.
         * 
         * @return
         *     possible object is
         *     {@link TicketProcessEDocReply.DocGroup.StaffTravellerGroup }
         *     
         */
        public TicketProcessEDocReply.DocGroup.StaffTravellerGroup getStaffTravellerGroup() {
            return staffTravellerGroup;
        }

        /**
         * Sets the value of the staffTravellerGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketProcessEDocReply.DocGroup.StaffTravellerGroup }
         *     
         */
        public void setStaffTravellerGroup(TicketProcessEDocReply.DocGroup.StaffTravellerGroup value) {
            this.staffTravellerGroup = value;
        }

        /**
         * Gets the value of the originalIssuanceGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originalIssuanceGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginalIssuanceGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketProcessEDocReply.DocGroup.OriginalIssuanceGroup }
         * 
         * 
         */
        public List<TicketProcessEDocReply.DocGroup.OriginalIssuanceGroup> getOriginalIssuanceGroup() {
            if (originalIssuanceGroup == null) {
                originalIssuanceGroup = new ArrayList<TicketProcessEDocReply.DocGroup.OriginalIssuanceGroup>();
            }
            return this.originalIssuanceGroup;
        }

        /**
         * Gets the value of the carrierFeeGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrierFeeGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrierFeeGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketProcessEDocReply.DocGroup.CarrierFeeGroup }
         * 
         * 
         */
        public List<TicketProcessEDocReply.DocGroup.CarrierFeeGroup> getCarrierFeeGroup() {
            if (carrierFeeGroup == null) {
                carrierFeeGroup = new ArrayList<TicketProcessEDocReply.DocGroup.CarrierFeeGroup>();
            }
            return this.carrierFeeGroup;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="selectionDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}SelectionDetailsTypeI"/&gt;
         *         &lt;element name="carrierFeeInfo" maxOccurs="99"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}SpecificDataInformationTypeI"/&gt;
         *                   &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI"/&gt;
         *                   &lt;element name="fop" type="{http://xml.amadeus.com/TATRES_15_2_1A}FormOfPaymentTypeI"/&gt;
         *                   &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "selectionDetails",
            "carrierFeeInfo"
        })
        public static class CarrierFeeGroup {

            @XmlElement(required = true)
            protected SelectionDetailsTypeI selectionDetails;
            @XmlElement(required = true)
            protected List<TicketProcessEDocReply.DocGroup.CarrierFeeGroup.CarrierFeeInfo> carrierFeeInfo;

            /**
             * Gets the value of the selectionDetails property.
             * 
             * @return
             *     possible object is
             *     {@link SelectionDetailsTypeI }
             *     
             */
            public SelectionDetailsTypeI getSelectionDetails() {
                return selectionDetails;
            }

            /**
             * Sets the value of the selectionDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link SelectionDetailsTypeI }
             *     
             */
            public void setSelectionDetails(SelectionDetailsTypeI value) {
                this.selectionDetails = value;
            }

            /**
             * Gets the value of the carrierFeeInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the carrierFeeInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCarrierFeeInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketProcessEDocReply.DocGroup.CarrierFeeGroup.CarrierFeeInfo }
             * 
             * 
             */
            public List<TicketProcessEDocReply.DocGroup.CarrierFeeGroup.CarrierFeeInfo> getCarrierFeeInfo() {
                if (carrierFeeInfo == null) {
                    carrierFeeInfo = new ArrayList<TicketProcessEDocReply.DocGroup.CarrierFeeGroup.CarrierFeeInfo>();
                }
                return this.carrierFeeInfo;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}SpecificDataInformationTypeI"/&gt;
             *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI"/&gt;
             *         &lt;element name="fop" type="{http://xml.amadeus.com/TATRES_15_2_1A}FormOfPaymentTypeI"/&gt;
             *         &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "specialDataInfo",
                "fareInfo",
                "fop",
                "taxInfo"
            })
            public static class CarrierFeeInfo {

                @XmlElement(required = true)
                protected SpecificDataInformationTypeI specialDataInfo;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI fareInfo;
                @XmlElement(required = true)
                protected FormOfPaymentTypeI fop;
                protected List<TaxTypeI> taxInfo;

                /**
                 * Gets the value of the specialDataInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecificDataInformationTypeI }
                 *     
                 */
                public SpecificDataInformationTypeI getSpecialDataInfo() {
                    return specialDataInfo;
                }

                /**
                 * Sets the value of the specialDataInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecificDataInformationTypeI }
                 *     
                 */
                public void setSpecialDataInfo(SpecificDataInformationTypeI value) {
                    this.specialDataInfo = value;
                }

                /**
                 * Gets the value of the fareInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI }
                 *     
                 */
                public MonetaryInformationTypeI getFareInfo() {
                    return fareInfo;
                }

                /**
                 * Sets the value of the fareInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI }
                 *     
                 */
                public void setFareInfo(MonetaryInformationTypeI value) {
                    this.fareInfo = value;
                }

                /**
                 * Gets the value of the fop property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FormOfPaymentTypeI }
                 *     
                 */
                public FormOfPaymentTypeI getFop() {
                    return fop;
                }

                /**
                 * Sets the value of the fop property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FormOfPaymentTypeI }
                 *     
                 */
                public void setFop(FormOfPaymentTypeI value) {
                    this.fop = value;
                }

                /**
                 * Gets the value of the taxInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTaxInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TaxTypeI }
                 * 
                 * 
                 */
                public List<TaxTypeI> getTaxInfo() {
                    if (taxInfo == null) {
                        taxInfo = new ArrayList<TaxTypeI>();
                    }
                    return this.taxInfo;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="docInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketNumberTypeI"/&gt;
         *         &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
         *         &lt;element name="validityDates" type="{http://xml.amadeus.com/TATRES_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
         *         &lt;element name="customerReference" type="{http://xml.amadeus.com/TATRES_15_2_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="couponGroup" maxOccurs="99" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI"/&gt;
         *                   &lt;element name="leg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" maxOccurs="2" minOccurs="0"/&gt;
         *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="bookingStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="baggageInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="validityDates" type="{http://xml.amadeus.com/TATRES_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/&gt;
         *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="fareBasisDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareQualifierDetailsType_174783S" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="fareComponentDetailsGroup" maxOccurs="4" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="fareComponentID" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberType"/&gt;
         *                   &lt;element name="marketFareComponent" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationType" minOccurs="0"/&gt;
         *                   &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingOrTicketingSubsequentType" minOccurs="0"/&gt;
         *                   &lt;element name="fareQualifiersDetail" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareQualifierDetailsType" minOccurs="0"/&gt;
         *                   &lt;element name="fareFamilyDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareFamilyType" minOccurs="0"/&gt;
         *                   &lt;element name="fareFamilyOwner" type="{http://xml.amadeus.com/TATRES_15_2_1A}TransportIdentifierType" minOccurs="0"/&gt;
         *                   &lt;element name="couponDetailsGroup" maxOccurs="99"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="productId" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReferenceInfoType"/&gt;
         *                             &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationType" minOccurs="0"/&gt;
         *                             &lt;element name="taxDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "docInfo",
            "error",
            "originatorInfo",
            "validityDates",
            "textInfo",
            "productInfo",
            "customerReference",
            "couponGroup",
            "fareComponentDetailsGroup"
        })
        public static class DocDetailsGroup {

            @XmlElement(required = true)
            protected TicketNumberTypeI docInfo;
            protected ApplicationErrorInformationTypeI error;
            protected OriginatorOfRequestDetailsTypeI originatorInfo;
            protected DateAndTimeInformationTypeI validityDates;
            protected List<InteractiveFreeTextTypeI> textInfo;
            protected PricingTicketingDetailsTypeI productInfo;
            protected ConsumerReferenceInformationTypeI customerReference;
            protected List<TicketProcessEDocReply.DocGroup.DocDetailsGroup.CouponGroup> couponGroup;
            protected List<TicketProcessEDocReply.DocGroup.DocDetailsGroup.FareComponentDetailsGroup> fareComponentDetailsGroup;

            /**
             * Gets the value of the docInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TicketNumberTypeI }
             *     
             */
            public TicketNumberTypeI getDocInfo() {
                return docInfo;
            }

            /**
             * Sets the value of the docInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketNumberTypeI }
             *     
             */
            public void setDocInfo(TicketNumberTypeI value) {
                this.docInfo = value;
            }

            /**
             * Gets the value of the error property.
             * 
             * @return
             *     possible object is
             *     {@link ApplicationErrorInformationTypeI }
             *     
             */
            public ApplicationErrorInformationTypeI getError() {
                return error;
            }

            /**
             * Sets the value of the error property.
             * 
             * @param value
             *     allowed object is
             *     {@link ApplicationErrorInformationTypeI }
             *     
             */
            public void setError(ApplicationErrorInformationTypeI value) {
                this.error = value;
            }

            /**
             * Gets the value of the originatorInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OriginatorOfRequestDetailsTypeI }
             *     
             */
            public OriginatorOfRequestDetailsTypeI getOriginatorInfo() {
                return originatorInfo;
            }

            /**
             * Sets the value of the originatorInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginatorOfRequestDetailsTypeI }
             *     
             */
            public void setOriginatorInfo(OriginatorOfRequestDetailsTypeI value) {
                this.originatorInfo = value;
            }

            /**
             * Gets the value of the validityDates property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationTypeI }
             *     
             */
            public DateAndTimeInformationTypeI getValidityDates() {
                return validityDates;
            }

            /**
             * Sets the value of the validityDates property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationTypeI }
             *     
             */
            public void setValidityDates(DateAndTimeInformationTypeI value) {
                this.validityDates = value;
            }

            /**
             * Gets the value of the textInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the textInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTextInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InteractiveFreeTextTypeI }
             * 
             * 
             */
            public List<InteractiveFreeTextTypeI> getTextInfo() {
                if (textInfo == null) {
                    textInfo = new ArrayList<InteractiveFreeTextTypeI>();
                }
                return this.textInfo;
            }

            /**
             * Gets the value of the productInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PricingTicketingDetailsTypeI }
             *     
             */
            public PricingTicketingDetailsTypeI getProductInfo() {
                return productInfo;
            }

            /**
             * Sets the value of the productInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingTicketingDetailsTypeI }
             *     
             */
            public void setProductInfo(PricingTicketingDetailsTypeI value) {
                this.productInfo = value;
            }

            /**
             * Gets the value of the customerReference property.
             * 
             * @return
             *     possible object is
             *     {@link ConsumerReferenceInformationTypeI }
             *     
             */
            public ConsumerReferenceInformationTypeI getCustomerReference() {
                return customerReference;
            }

            /**
             * Sets the value of the customerReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsumerReferenceInformationTypeI }
             *     
             */
            public void setCustomerReference(ConsumerReferenceInformationTypeI value) {
                this.customerReference = value;
            }

            /**
             * Gets the value of the couponGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketProcessEDocReply.DocGroup.DocDetailsGroup.CouponGroup }
             * 
             * 
             */
            public List<TicketProcessEDocReply.DocGroup.DocDetailsGroup.CouponGroup> getCouponGroup() {
                if (couponGroup == null) {
                    couponGroup = new ArrayList<TicketProcessEDocReply.DocGroup.DocDetailsGroup.CouponGroup>();
                }
                return this.couponGroup;
            }

            /**
             * Gets the value of the fareComponentDetailsGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fareComponentDetailsGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFareComponentDetailsGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketProcessEDocReply.DocGroup.DocDetailsGroup.FareComponentDetailsGroup }
             * 
             * 
             */
            public List<TicketProcessEDocReply.DocGroup.DocDetailsGroup.FareComponentDetailsGroup> getFareComponentDetailsGroup() {
                if (fareComponentDetailsGroup == null) {
                    fareComponentDetailsGroup = new ArrayList<TicketProcessEDocReply.DocGroup.DocDetailsGroup.FareComponentDetailsGroup>();
                }
                return this.fareComponentDetailsGroup;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI"/&gt;
             *         &lt;element name="leg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" maxOccurs="2" minOccurs="0"/&gt;
             *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="bookingStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
             *         &lt;element name="baggageInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
             *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="validityDates" type="{http://xml.amadeus.com/TATRES_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
             *         &lt;element name="textInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/&gt;
             *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
             *         &lt;element name="fareBasisDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareQualifierDetailsType_174783S" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "couponInfo",
                "leg",
                "referenceInfo",
                "bookingStatus",
                "pricingInfo",
                "baggageInfo",
                "frequentTravellerInfo",
                "validityDates",
                "error",
                "originatorInfo",
                "textInfo",
                "productInfo",
                "fareBasisDetails"
            })
            public static class CouponGroup {

                @XmlElement(required = true)
                protected CouponInformationTypeI couponInfo;
                protected List<TravelProductInformationTypeI29340S> leg;
                protected ReservationControlInformationTypeI referenceInfo;
                protected RelatedProductInformationTypeI bookingStatus;
                protected PricingTicketingSubsequentTypeI pricingInfo;
                protected ExcessBaggageTypeI baggageInfo;
                protected FrequentTravellerInformationTypeI frequentTravellerInfo;
                protected DateAndTimeInformationTypeI validityDates;
                protected ApplicationErrorInformationTypeI error;
                protected OriginatorOfRequestDetailsTypeI originatorInfo;
                protected List<InteractiveFreeTextTypeI> textInfo;
                protected PricingTicketingDetailsTypeI productInfo;
                protected FareQualifierDetailsType174783S fareBasisDetails;

                /**
                 * Gets the value of the couponInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CouponInformationTypeI }
                 *     
                 */
                public CouponInformationTypeI getCouponInfo() {
                    return couponInfo;
                }

                /**
                 * Sets the value of the couponInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CouponInformationTypeI }
                 *     
                 */
                public void setCouponInfo(CouponInformationTypeI value) {
                    this.couponInfo = value;
                }

                /**
                 * Gets the value of the leg property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the leg property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLeg().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TravelProductInformationTypeI29340S }
                 * 
                 * 
                 */
                public List<TravelProductInformationTypeI29340S> getLeg() {
                    if (leg == null) {
                        leg = new ArrayList<TravelProductInformationTypeI29340S>();
                    }
                    return this.leg;
                }

                /**
                 * Gets the value of the referenceInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReservationControlInformationTypeI }
                 *     
                 */
                public ReservationControlInformationTypeI getReferenceInfo() {
                    return referenceInfo;
                }

                /**
                 * Sets the value of the referenceInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReservationControlInformationTypeI }
                 *     
                 */
                public void setReferenceInfo(ReservationControlInformationTypeI value) {
                    this.referenceInfo = value;
                }

                /**
                 * Gets the value of the bookingStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RelatedProductInformationTypeI }
                 *     
                 */
                public RelatedProductInformationTypeI getBookingStatus() {
                    return bookingStatus;
                }

                /**
                 * Sets the value of the bookingStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RelatedProductInformationTypeI }
                 *     
                 */
                public void setBookingStatus(RelatedProductInformationTypeI value) {
                    this.bookingStatus = value;
                }

                /**
                 * Gets the value of the pricingInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PricingTicketingSubsequentTypeI }
                 *     
                 */
                public PricingTicketingSubsequentTypeI getPricingInfo() {
                    return pricingInfo;
                }

                /**
                 * Sets the value of the pricingInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PricingTicketingSubsequentTypeI }
                 *     
                 */
                public void setPricingInfo(PricingTicketingSubsequentTypeI value) {
                    this.pricingInfo = value;
                }

                /**
                 * Gets the value of the baggageInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ExcessBaggageTypeI }
                 *     
                 */
                public ExcessBaggageTypeI getBaggageInfo() {
                    return baggageInfo;
                }

                /**
                 * Sets the value of the baggageInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ExcessBaggageTypeI }
                 *     
                 */
                public void setBaggageInfo(ExcessBaggageTypeI value) {
                    this.baggageInfo = value;
                }

                /**
                 * Gets the value of the frequentTravellerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FrequentTravellerInformationTypeI }
                 *     
                 */
                public FrequentTravellerInformationTypeI getFrequentTravellerInfo() {
                    return frequentTravellerInfo;
                }

                /**
                 * Sets the value of the frequentTravellerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FrequentTravellerInformationTypeI }
                 *     
                 */
                public void setFrequentTravellerInfo(FrequentTravellerInformationTypeI value) {
                    this.frequentTravellerInfo = value;
                }

                /**
                 * Gets the value of the validityDates property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DateAndTimeInformationTypeI }
                 *     
                 */
                public DateAndTimeInformationTypeI getValidityDates() {
                    return validityDates;
                }

                /**
                 * Sets the value of the validityDates property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DateAndTimeInformationTypeI }
                 *     
                 */
                public void setValidityDates(DateAndTimeInformationTypeI value) {
                    this.validityDates = value;
                }

                /**
                 * Gets the value of the error property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ApplicationErrorInformationTypeI }
                 *     
                 */
                public ApplicationErrorInformationTypeI getError() {
                    return error;
                }

                /**
                 * Sets the value of the error property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ApplicationErrorInformationTypeI }
                 *     
                 */
                public void setError(ApplicationErrorInformationTypeI value) {
                    this.error = value;
                }

                /**
                 * Gets the value of the originatorInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginatorOfRequestDetailsTypeI }
                 *     
                 */
                public OriginatorOfRequestDetailsTypeI getOriginatorInfo() {
                    return originatorInfo;
                }

                /**
                 * Sets the value of the originatorInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginatorOfRequestDetailsTypeI }
                 *     
                 */
                public void setOriginatorInfo(OriginatorOfRequestDetailsTypeI value) {
                    this.originatorInfo = value;
                }

                /**
                 * Gets the value of the textInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the textInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTextInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InteractiveFreeTextTypeI }
                 * 
                 * 
                 */
                public List<InteractiveFreeTextTypeI> getTextInfo() {
                    if (textInfo == null) {
                        textInfo = new ArrayList<InteractiveFreeTextTypeI>();
                    }
                    return this.textInfo;
                }

                /**
                 * Gets the value of the productInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PricingTicketingDetailsTypeI }
                 *     
                 */
                public PricingTicketingDetailsTypeI getProductInfo() {
                    return productInfo;
                }

                /**
                 * Sets the value of the productInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PricingTicketingDetailsTypeI }
                 *     
                 */
                public void setProductInfo(PricingTicketingDetailsTypeI value) {
                    this.productInfo = value;
                }

                /**
                 * Gets the value of the fareBasisDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareQualifierDetailsType174783S }
                 *     
                 */
                public FareQualifierDetailsType174783S getFareBasisDetails() {
                    return fareBasisDetails;
                }

                /**
                 * Sets the value of the fareBasisDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareQualifierDetailsType174783S }
                 *     
                 */
                public void setFareBasisDetails(FareQualifierDetailsType174783S value) {
                    this.fareBasisDetails = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="fareComponentID" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberType"/&gt;
             *         &lt;element name="marketFareComponent" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationType" minOccurs="0"/&gt;
             *         &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingOrTicketingSubsequentType" minOccurs="0"/&gt;
             *         &lt;element name="fareQualifiersDetail" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareQualifierDetailsType" minOccurs="0"/&gt;
             *         &lt;element name="fareFamilyDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareFamilyType" minOccurs="0"/&gt;
             *         &lt;element name="fareFamilyOwner" type="{http://xml.amadeus.com/TATRES_15_2_1A}TransportIdentifierType" minOccurs="0"/&gt;
             *         &lt;element name="couponDetailsGroup" maxOccurs="99"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="productId" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReferenceInfoType"/&gt;
             *                   &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationType" minOccurs="0"/&gt;
             *                   &lt;element name="taxDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fareComponentID",
                "marketFareComponent",
                "monetaryInformation",
                "componentClassInfo",
                "fareQualifiersDetail",
                "fareFamilyDetails",
                "fareFamilyOwner",
                "couponDetailsGroup"
            })
            public static class FareComponentDetailsGroup {

                @XmlElement(required = true)
                protected ItemNumberType fareComponentID;
                protected TravelProductInformationTypeI marketFareComponent;
                protected MonetaryInformationType monetaryInformation;
                protected PricingOrTicketingSubsequentType componentClassInfo;
                protected FareQualifierDetailsType fareQualifiersDetail;
                protected FareFamilyType fareFamilyDetails;
                protected TransportIdentifierType fareFamilyOwner;
                @XmlElement(required = true)
                protected List<TicketProcessEDocReply.DocGroup.DocDetailsGroup.FareComponentDetailsGroup.CouponDetailsGroup> couponDetailsGroup;

                /**
                 * Gets the value of the fareComponentID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemNumberType }
                 *     
                 */
                public ItemNumberType getFareComponentID() {
                    return fareComponentID;
                }

                /**
                 * Sets the value of the fareComponentID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemNumberType }
                 *     
                 */
                public void setFareComponentID(ItemNumberType value) {
                    this.fareComponentID = value;
                }

                /**
                 * Gets the value of the marketFareComponent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductInformationTypeI }
                 *     
                 */
                public TravelProductInformationTypeI getMarketFareComponent() {
                    return marketFareComponent;
                }

                /**
                 * Sets the value of the marketFareComponent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductInformationTypeI }
                 *     
                 */
                public void setMarketFareComponent(TravelProductInformationTypeI value) {
                    this.marketFareComponent = value;
                }

                /**
                 * Gets the value of the monetaryInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType }
                 *     
                 */
                public MonetaryInformationType getMonetaryInformation() {
                    return monetaryInformation;
                }

                /**
                 * Sets the value of the monetaryInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType }
                 *     
                 */
                public void setMonetaryInformation(MonetaryInformationType value) {
                    this.monetaryInformation = value;
                }

                /**
                 * Gets the value of the componentClassInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PricingOrTicketingSubsequentType }
                 *     
                 */
                public PricingOrTicketingSubsequentType getComponentClassInfo() {
                    return componentClassInfo;
                }

                /**
                 * Sets the value of the componentClassInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PricingOrTicketingSubsequentType }
                 *     
                 */
                public void setComponentClassInfo(PricingOrTicketingSubsequentType value) {
                    this.componentClassInfo = value;
                }

                /**
                 * Gets the value of the fareQualifiersDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareQualifierDetailsType }
                 *     
                 */
                public FareQualifierDetailsType getFareQualifiersDetail() {
                    return fareQualifiersDetail;
                }

                /**
                 * Sets the value of the fareQualifiersDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareQualifierDetailsType }
                 *     
                 */
                public void setFareQualifiersDetail(FareQualifierDetailsType value) {
                    this.fareQualifiersDetail = value;
                }

                /**
                 * Gets the value of the fareFamilyDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareFamilyType }
                 *     
                 */
                public FareFamilyType getFareFamilyDetails() {
                    return fareFamilyDetails;
                }

                /**
                 * Sets the value of the fareFamilyDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareFamilyType }
                 *     
                 */
                public void setFareFamilyDetails(FareFamilyType value) {
                    this.fareFamilyDetails = value;
                }

                /**
                 * Gets the value of the fareFamilyOwner property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransportIdentifierType }
                 *     
                 */
                public TransportIdentifierType getFareFamilyOwner() {
                    return fareFamilyOwner;
                }

                /**
                 * Sets the value of the fareFamilyOwner property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransportIdentifierType }
                 *     
                 */
                public void setFareFamilyOwner(TransportIdentifierType value) {
                    this.fareFamilyOwner = value;
                }

                /**
                 * Gets the value of the couponDetailsGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the couponDetailsGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCouponDetailsGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TicketProcessEDocReply.DocGroup.DocDetailsGroup.FareComponentDetailsGroup.CouponDetailsGroup }
                 * 
                 * 
                 */
                public List<TicketProcessEDocReply.DocGroup.DocDetailsGroup.FareComponentDetailsGroup.CouponDetailsGroup> getCouponDetailsGroup() {
                    if (couponDetailsGroup == null) {
                        couponDetailsGroup = new ArrayList<TicketProcessEDocReply.DocGroup.DocDetailsGroup.FareComponentDetailsGroup.CouponDetailsGroup>();
                    }
                    return this.couponDetailsGroup;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="productId" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReferenceInfoType"/&gt;
                 *         &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationType" minOccurs="0"/&gt;
                 *         &lt;element name="taxDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxType" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "productId",
                    "flightConnectionType",
                    "taxDetails"
                })
                public static class CouponDetailsGroup {

                    @XmlElement(required = true)
                    protected ReferenceInfoType productId;
                    protected TravelProductInformationType flightConnectionType;
                    protected TaxType taxDetails;

                    /**
                     * Gets the value of the productId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReferenceInfoType }
                     *     
                     */
                    public ReferenceInfoType getProductId() {
                        return productId;
                    }

                    /**
                     * Sets the value of the productId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReferenceInfoType }
                     *     
                     */
                    public void setProductId(ReferenceInfoType value) {
                        this.productId = value;
                    }

                    /**
                     * Gets the value of the flightConnectionType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TravelProductInformationType }
                     *     
                     */
                    public TravelProductInformationType getFlightConnectionType() {
                        return flightConnectionType;
                    }

                    /**
                     * Sets the value of the flightConnectionType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TravelProductInformationType }
                     *     
                     */
                    public void setFlightConnectionType(TravelProductInformationType value) {
                        this.flightConnectionType = value;
                    }

                    /**
                     * Gets the value of the taxDetails property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TaxType }
                     *     
                     */
                    public TaxType getTaxDetails() {
                        return taxDetails;
                    }

                    /**
                     * Sets the value of the taxDetails property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TaxType }
                     *     
                     */
                    public void setTaxDetails(TaxType value) {
                        this.taxDetails = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="fareComponentInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareComponentInformationTypeI"/&gt;
         *         &lt;element name="fareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumberOfUnitsTypeI"/&gt;
         *                   &lt;element name="pricedFareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberTypeI"/&gt;
         *                             &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="structuredFareCalcAction" type="{http://xml.amadeus.com/TATRES_15_2_1A}ActionDetailsTypeI"/&gt;
         *                                       &lt;element name="structuredFareCalcLeg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="structuredFareCalcMonInfo2" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
         *                             &lt;element name="structuredFareCalcPricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
         *                             &lt;element name="structuredFareCalcDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
         *                             &lt;element name="structuredFareCalcRate" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
         *                             &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
         *                             &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="structuredFareCalcMonInfo1" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="structuredFareCalcTaxInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
         *         &lt;element name="structuredFareCalcConversionInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}ConversionRateTypeI" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fareComponentInfo",
            "fareComponentsGroup",
            "structuredFareCalcMonInfo1",
            "structuredFareCalcTaxInfo",
            "structuredFareCalcConversionInfo"
        })
        public static class FareElementsGroup {

            @XmlElement(required = true)
            protected FareComponentInformationTypeI fareComponentInfo;
            protected List<TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup> fareComponentsGroup;
            protected MonetaryInformationTypeI structuredFareCalcMonInfo1;
            protected List<TaxTypeI> structuredFareCalcTaxInfo;
            protected ConversionRateTypeI structuredFareCalcConversionInfo;

            /**
             * Gets the value of the fareComponentInfo property.
             * 
             * @return
             *     possible object is
             *     {@link FareComponentInformationTypeI }
             *     
             */
            public FareComponentInformationTypeI getFareComponentInfo() {
                return fareComponentInfo;
            }

            /**
             * Sets the value of the fareComponentInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareComponentInformationTypeI }
             *     
             */
            public void setFareComponentInfo(FareComponentInformationTypeI value) {
                this.fareComponentInfo = value;
            }

            /**
             * Gets the value of the fareComponentsGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fareComponentsGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFareComponentsGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup }
             * 
             * 
             */
            public List<TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup> getFareComponentsGroup() {
                if (fareComponentsGroup == null) {
                    fareComponentsGroup = new ArrayList<TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup>();
                }
                return this.fareComponentsGroup;
            }

            /**
             * Gets the value of the structuredFareCalcMonInfo1 property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getStructuredFareCalcMonInfo1() {
                return structuredFareCalcMonInfo1;
            }

            /**
             * Sets the value of the structuredFareCalcMonInfo1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setStructuredFareCalcMonInfo1(MonetaryInformationTypeI value) {
                this.structuredFareCalcMonInfo1 = value;
            }

            /**
             * Gets the value of the structuredFareCalcTaxInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the structuredFareCalcTaxInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStructuredFareCalcTaxInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TaxTypeI }
             * 
             * 
             */
            public List<TaxTypeI> getStructuredFareCalcTaxInfo() {
                if (structuredFareCalcTaxInfo == null) {
                    structuredFareCalcTaxInfo = new ArrayList<TaxTypeI>();
                }
                return this.structuredFareCalcTaxInfo;
            }

            /**
             * Gets the value of the structuredFareCalcConversionInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ConversionRateTypeI }
             *     
             */
            public ConversionRateTypeI getStructuredFareCalcConversionInfo() {
                return structuredFareCalcConversionInfo;
            }

            /**
             * Sets the value of the structuredFareCalcConversionInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConversionRateTypeI }
             *     
             */
            public void setStructuredFareCalcConversionInfo(ConversionRateTypeI value) {
                this.structuredFareCalcConversionInfo = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumberOfUnitsTypeI"/&gt;
             *         &lt;element name="pricedFareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberTypeI"/&gt;
             *                   &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="structuredFareCalcAction" type="{http://xml.amadeus.com/TATRES_15_2_1A}ActionDetailsTypeI"/&gt;
             *                             &lt;element name="structuredFareCalcLeg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="structuredFareCalcMonInfo2" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
             *                   &lt;element name="structuredFareCalcPricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
             *                   &lt;element name="structuredFareCalcDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
             *                   &lt;element name="structuredFareCalcRate" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
             *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
             *                   &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "numberOfUnits",
                "pricedFareComponentsGroup"
            })
            public static class FareComponentsGroup {

                @XmlElement(required = true)
                protected NumberOfUnitsTypeI numberOfUnits;
                protected List<TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup> pricedFareComponentsGroup;

                /**
                 * Gets the value of the numberOfUnits property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NumberOfUnitsTypeI }
                 *     
                 */
                public NumberOfUnitsTypeI getNumberOfUnits() {
                    return numberOfUnits;
                }

                /**
                 * Sets the value of the numberOfUnits property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NumberOfUnitsTypeI }
                 *     
                 */
                public void setNumberOfUnits(NumberOfUnitsTypeI value) {
                    this.numberOfUnits = value;
                }

                /**
                 * Gets the value of the pricedFareComponentsGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pricedFareComponentsGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPricedFareComponentsGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup }
                 * 
                 * 
                 */
                public List<TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup> getPricedFareComponentsGroup() {
                    if (pricedFareComponentsGroup == null) {
                        pricedFareComponentsGroup = new ArrayList<TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup>();
                    }
                    return this.pricedFareComponentsGroup;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberTypeI"/&gt;
                 *         &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="structuredFareCalcAction" type="{http://xml.amadeus.com/TATRES_15_2_1A}ActionDetailsTypeI"/&gt;
                 *                   &lt;element name="structuredFareCalcLeg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="structuredFareCalcMonInfo2" type="{http://xml.amadeus.com/TATRES_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
                 *         &lt;element name="structuredFareCalcPricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
                 *         &lt;element name="structuredFareCalcDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
                 *         &lt;element name="structuredFareCalcRate" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
                 *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
                 *         &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "structuredFareCalcItem",
                    "fareCouponGroup",
                    "structuredFareCalcMonInfo2",
                    "structuredFareCalcPricingInfo",
                    "structuredFareCalcDetails",
                    "structuredFareCalcRate",
                    "productInfo",
                    "structuredFareCalcFareDetails"
                })
                public static class PricedFareComponentsGroup {

                    @XmlElement(required = true)
                    protected ItemNumberTypeI structuredFareCalcItem;
                    protected List<TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup.FareCouponGroup> fareCouponGroup;
                    protected MonetaryInformationTypeI structuredFareCalcMonInfo2;
                    protected PricingTicketingSubsequentTypeI structuredFareCalcPricingInfo;
                    protected FareCalculationCodeDetailsTypeI structuredFareCalcDetails;
                    protected FareRulesInformationTypeI structuredFareCalcRate;
                    @XmlElement(required = true)
                    protected PricingTicketingDetailsTypeI productInfo;
                    protected FareInformationTypeI structuredFareCalcFareDetails;

                    /**
                     * Gets the value of the structuredFareCalcItem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItemNumberTypeI }
                     *     
                     */
                    public ItemNumberTypeI getStructuredFareCalcItem() {
                        return structuredFareCalcItem;
                    }

                    /**
                     * Sets the value of the structuredFareCalcItem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItemNumberTypeI }
                     *     
                     */
                    public void setStructuredFareCalcItem(ItemNumberTypeI value) {
                        this.structuredFareCalcItem = value;
                    }

                    /**
                     * Gets the value of the fareCouponGroup property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fareCouponGroup property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFareCouponGroup().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup.FareCouponGroup }
                     * 
                     * 
                     */
                    public List<TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup.FareCouponGroup> getFareCouponGroup() {
                        if (fareCouponGroup == null) {
                            fareCouponGroup = new ArrayList<TicketProcessEDocReply.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup.FareCouponGroup>();
                        }
                        return this.fareCouponGroup;
                    }

                    /**
                     * Gets the value of the structuredFareCalcMonInfo2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MonetaryInformationTypeI }
                     *     
                     */
                    public MonetaryInformationTypeI getStructuredFareCalcMonInfo2() {
                        return structuredFareCalcMonInfo2;
                    }

                    /**
                     * Sets the value of the structuredFareCalcMonInfo2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MonetaryInformationTypeI }
                     *     
                     */
                    public void setStructuredFareCalcMonInfo2(MonetaryInformationTypeI value) {
                        this.structuredFareCalcMonInfo2 = value;
                    }

                    /**
                     * Gets the value of the structuredFareCalcPricingInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PricingTicketingSubsequentTypeI }
                     *     
                     */
                    public PricingTicketingSubsequentTypeI getStructuredFareCalcPricingInfo() {
                        return structuredFareCalcPricingInfo;
                    }

                    /**
                     * Sets the value of the structuredFareCalcPricingInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PricingTicketingSubsequentTypeI }
                     *     
                     */
                    public void setStructuredFareCalcPricingInfo(PricingTicketingSubsequentTypeI value) {
                        this.structuredFareCalcPricingInfo = value;
                    }

                    /**
                     * Gets the value of the structuredFareCalcDetails property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareCalculationCodeDetailsTypeI }
                     *     
                     */
                    public FareCalculationCodeDetailsTypeI getStructuredFareCalcDetails() {
                        return structuredFareCalcDetails;
                    }

                    /**
                     * Sets the value of the structuredFareCalcDetails property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareCalculationCodeDetailsTypeI }
                     *     
                     */
                    public void setStructuredFareCalcDetails(FareCalculationCodeDetailsTypeI value) {
                        this.structuredFareCalcDetails = value;
                    }

                    /**
                     * Gets the value of the structuredFareCalcRate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareRulesInformationTypeI }
                     *     
                     */
                    public FareRulesInformationTypeI getStructuredFareCalcRate() {
                        return structuredFareCalcRate;
                    }

                    /**
                     * Sets the value of the structuredFareCalcRate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareRulesInformationTypeI }
                     *     
                     */
                    public void setStructuredFareCalcRate(FareRulesInformationTypeI value) {
                        this.structuredFareCalcRate = value;
                    }

                    /**
                     * Gets the value of the productInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PricingTicketingDetailsTypeI }
                     *     
                     */
                    public PricingTicketingDetailsTypeI getProductInfo() {
                        return productInfo;
                    }

                    /**
                     * Sets the value of the productInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PricingTicketingDetailsTypeI }
                     *     
                     */
                    public void setProductInfo(PricingTicketingDetailsTypeI value) {
                        this.productInfo = value;
                    }

                    /**
                     * Gets the value of the structuredFareCalcFareDetails property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareInformationTypeI }
                     *     
                     */
                    public FareInformationTypeI getStructuredFareCalcFareDetails() {
                        return structuredFareCalcFareDetails;
                    }

                    /**
                     * Sets the value of the structuredFareCalcFareDetails property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareInformationTypeI }
                     *     
                     */
                    public void setStructuredFareCalcFareDetails(FareInformationTypeI value) {
                        this.structuredFareCalcFareDetails = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="structuredFareCalcAction" type="{http://xml.amadeus.com/TATRES_15_2_1A}ActionDetailsTypeI"/&gt;
                     *         &lt;element name="structuredFareCalcLeg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" minOccurs="0"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "structuredFareCalcAction",
                        "structuredFareCalcLeg"
                    })
                    public static class FareCouponGroup {

                        @XmlElement(required = true)
                        protected ActionDetailsTypeI structuredFareCalcAction;
                        protected TravelProductInformationTypeI29340S structuredFareCalcLeg;

                        /**
                         * Gets the value of the structuredFareCalcAction property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ActionDetailsTypeI }
                         *     
                         */
                        public ActionDetailsTypeI getStructuredFareCalcAction() {
                            return structuredFareCalcAction;
                        }

                        /**
                         * Sets the value of the structuredFareCalcAction property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ActionDetailsTypeI }
                         *     
                         */
                        public void setStructuredFareCalcAction(ActionDetailsTypeI value) {
                            this.structuredFareCalcAction = value;
                        }

                        /**
                         * Gets the value of the structuredFareCalcLeg property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TravelProductInformationTypeI29340S }
                         *     
                         */
                        public TravelProductInformationTypeI29340S getStructuredFareCalcLeg() {
                            return structuredFareCalcLeg;
                        }

                        /**
                         * Sets the value of the structuredFareCalcLeg property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TravelProductInformationTypeI29340S }
                         *     
                         */
                        public void setStructuredFareCalcLeg(TravelProductInformationTypeI29340S value) {
                            this.structuredFareCalcLeg = value;
                        }

                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="officeIdentification" type="{http://xml.amadeus.com/TATRES_15_2_1A}AdditionalBusinessSourceInformationTypeI"/&gt;
         *         &lt;element name="exchangeDocumentDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}DocumentInformationDetailsTypeI" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "officeIdentification",
            "exchangeDocumentDetails"
        })
        public static class OriginalIssuanceGroup {

            @XmlElement(required = true)
            protected AdditionalBusinessSourceInformationTypeI officeIdentification;
            protected DocumentInformationDetailsTypeI exchangeDocumentDetails;

            /**
             * Gets the value of the officeIdentification property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalBusinessSourceInformationTypeI }
             *     
             */
            public AdditionalBusinessSourceInformationTypeI getOfficeIdentification() {
                return officeIdentification;
            }

            /**
             * Sets the value of the officeIdentification property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalBusinessSourceInformationTypeI }
             *     
             */
            public void setOfficeIdentification(AdditionalBusinessSourceInformationTypeI value) {
                this.officeIdentification = value;
            }

            /**
             * Gets the value of the exchangeDocumentDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentInformationDetailsTypeI }
             *     
             */
            public DocumentInformationDetailsTypeI getExchangeDocumentDetails() {
                return exchangeDocumentDetails;
            }

            /**
             * Sets the value of the exchangeDocumentDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentInformationDetailsTypeI }
             *     
             */
            public void setExchangeDocumentDetails(DocumentInformationDetailsTypeI value) {
                this.exchangeDocumentDetails = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="refundStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}StatusTypeI"/&gt;
         *         &lt;element name="refundLeg" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravelProductInformationTypeI_29340S" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
         *         &lt;element name="refundDocumentInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketNumberTypeI" minOccurs="0"/&gt;
         *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI" maxOccurs="9" minOccurs="0"/&gt;
         *         &lt;element name="refundPricingInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
         *         &lt;element name="refundRoutingDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}RoutingInformationTypeI" maxOccurs="99" minOccurs="0"/&gt;
         *         &lt;element name="refundProductDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}AdditionalProductDetailsTypeI" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "refundStatus",
            "refundLeg",
            "productInfo",
            "refundDocumentInfo",
            "couponInfo",
            "refundPricingInfo",
            "refundRoutingDetails",
            "refundProductDetails"
        })
        public static class ReissuedFlownDetails {

            @XmlElement(required = true)
            protected StatusTypeI refundStatus;
            protected List<TravelProductInformationTypeI29340S> refundLeg;
            protected PricingTicketingDetailsTypeI productInfo;
            protected TicketNumberTypeI refundDocumentInfo;
            protected List<CouponInformationTypeI> couponInfo;
            protected PricingTicketingSubsequentTypeI refundPricingInfo;
            protected List<RoutingInformationTypeI> refundRoutingDetails;
            protected AdditionalProductDetailsTypeI refundProductDetails;

            /**
             * Gets the value of the refundStatus property.
             * 
             * @return
             *     possible object is
             *     {@link StatusTypeI }
             *     
             */
            public StatusTypeI getRefundStatus() {
                return refundStatus;
            }

            /**
             * Sets the value of the refundStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusTypeI }
             *     
             */
            public void setRefundStatus(StatusTypeI value) {
                this.refundStatus = value;
            }

            /**
             * Gets the value of the refundLeg property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the refundLeg property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRefundLeg().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TravelProductInformationTypeI29340S }
             * 
             * 
             */
            public List<TravelProductInformationTypeI29340S> getRefundLeg() {
                if (refundLeg == null) {
                    refundLeg = new ArrayList<TravelProductInformationTypeI29340S>();
                }
                return this.refundLeg;
            }

            /**
             * Gets the value of the productInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PricingTicketingDetailsTypeI }
             *     
             */
            public PricingTicketingDetailsTypeI getProductInfo() {
                return productInfo;
            }

            /**
             * Sets the value of the productInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingTicketingDetailsTypeI }
             *     
             */
            public void setProductInfo(PricingTicketingDetailsTypeI value) {
                this.productInfo = value;
            }

            /**
             * Gets the value of the refundDocumentInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TicketNumberTypeI }
             *     
             */
            public TicketNumberTypeI getRefundDocumentInfo() {
                return refundDocumentInfo;
            }

            /**
             * Sets the value of the refundDocumentInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketNumberTypeI }
             *     
             */
            public void setRefundDocumentInfo(TicketNumberTypeI value) {
                this.refundDocumentInfo = value;
            }

            /**
             * Gets the value of the couponInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CouponInformationTypeI }
             * 
             * 
             */
            public List<CouponInformationTypeI> getCouponInfo() {
                if (couponInfo == null) {
                    couponInfo = new ArrayList<CouponInformationTypeI>();
                }
                return this.couponInfo;
            }

            /**
             * Gets the value of the refundPricingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PricingTicketingSubsequentTypeI }
             *     
             */
            public PricingTicketingSubsequentTypeI getRefundPricingInfo() {
                return refundPricingInfo;
            }

            /**
             * Sets the value of the refundPricingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingTicketingSubsequentTypeI }
             *     
             */
            public void setRefundPricingInfo(PricingTicketingSubsequentTypeI value) {
                this.refundPricingInfo = value;
            }

            /**
             * Gets the value of the refundRoutingDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the refundRoutingDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRefundRoutingDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RoutingInformationTypeI }
             * 
             * 
             */
            public List<RoutingInformationTypeI> getRefundRoutingDetails() {
                if (refundRoutingDetails == null) {
                    refundRoutingDetails = new ArrayList<RoutingInformationTypeI>();
                }
                return this.refundRoutingDetails;
            }

            /**
             * Gets the value of the refundProductDetails property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public AdditionalProductDetailsTypeI getRefundProductDetails() {
                return refundProductDetails;
            }

            /**
             * Sets the value of the refundProductDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public void setRefundProductDetails(AdditionalProductDetailsTypeI value) {
                this.refundProductDetails = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="travellerStatus" type="{http://xml.amadeus.com/TATRES_15_2_1A}TravellerPriorityDetailsTypeI"/&gt;
         *         &lt;element name="staffInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}SpecificDataInformationTypeI" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "travellerStatus",
            "staffInfo"
        })
        public static class StaffTravellerGroup {

            @XmlElement(required = true)
            protected TravellerPriorityDetailsTypeI travellerStatus;
            protected SpecificDataInformationTypeI staffInfo;

            /**
             * Gets the value of the travellerStatus property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerPriorityDetailsTypeI }
             *     
             */
            public TravellerPriorityDetailsTypeI getTravellerStatus() {
                return travellerStatus;
            }

            /**
             * Sets the value of the travellerStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerPriorityDetailsTypeI }
             *     
             */
            public void setTravellerStatus(TravellerPriorityDetailsTypeI value) {
                this.travellerStatus = value;
            }

            /**
             * Gets the value of the staffInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SpecificDataInformationTypeI }
             *     
             */
            public SpecificDataInformationTypeI getStaffInfo() {
                return staffInfo;
            }

            /**
             * Sets the value of the staffInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecificDataInformationTypeI }
             *     
             */
            public void setStaffInfo(SpecificDataInformationTypeI value) {
                this.staffInfo = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="docInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}TicketNumberTypeI"/&gt;
     *         &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="error" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATRES_15_2_1A}CouponInformationTypeI" maxOccurs="4" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "docInfo",
        "originatorInfo",
        "error",
        "couponInfo"
    })
    public static class GeneralDocGroup {

        @XmlElement(required = true)
        protected TicketNumberTypeI docInfo;
        protected OriginatorOfRequestDetailsTypeI originatorInfo;
        protected ApplicationErrorInformationTypeI error;
        protected List<CouponInformationTypeI> couponInfo;

        /**
         * Gets the value of the docInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public TicketNumberTypeI getDocInfo() {
            return docInfo;
        }

        /**
         * Sets the value of the docInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public void setDocInfo(TicketNumberTypeI value) {
            this.docInfo = value;
        }

        /**
         * Gets the value of the originatorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OriginatorOfRequestDetailsTypeI }
         *     
         */
        public OriginatorOfRequestDetailsTypeI getOriginatorInfo() {
            return originatorInfo;
        }

        /**
         * Sets the value of the originatorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginatorOfRequestDetailsTypeI }
         *     
         */
        public void setOriginatorInfo(OriginatorOfRequestDetailsTypeI value) {
            this.originatorInfo = value;
        }

        /**
         * Gets the value of the error property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public ApplicationErrorInformationTypeI getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public void setError(ApplicationErrorInformationTypeI value) {
            this.error = value;
        }

        /**
         * Gets the value of the couponInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CouponInformationTypeI }
         * 
         * 
         */
        public List<CouponInformationTypeI> getCouponInfo() {
            if (couponInfo == null) {
                couponInfo = new ArrayList<CouponInformationTypeI>();
            }
            return this.couponInfo;
        }

    }

}
