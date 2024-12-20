
package com.amadeus.xml.tatreq_15_2_1a;

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
 *         &lt;element name="msgActionDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MessageActionDetailsTypeI"/&gt;
 *         &lt;element name="sysProvider" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketAgentInfoTypeI" minOccurs="0"/&gt;
 *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="originDestination" type="{http://xml.amadeus.com/TATREQ_15_2_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="enhancedPaxInfoCriteria" type="{http://xml.amadeus.com/TATREQ_15_2_1A}EnhancedTravellerInformationType_199238S" minOccurs="0"/&gt;
 *         &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="fop" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
 *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="tourInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TourInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumberOfUnitsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="6" minOccurs="0"/&gt;
 *         &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="customerReference" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
 *         &lt;element name="infoGroup" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="docInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketNumberTypeI"/&gt;
 *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CouponInformationTypeI" maxOccurs="4" minOccurs="0"/&gt;
 *                   &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
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
 *                   &lt;element name="paxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravellerInformationTypeI"/&gt;
 *                   &lt;element name="enhancedPaxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}EnhancedTravellerInformationType" minOccurs="0"/&gt;
 *                   &lt;element name="sysProvider" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketAgentInfoTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="fop" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/TATREQ_15_2_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
 *                   &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="tourInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TourInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumberOfUnitsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="5" minOccurs="0"/&gt;
 *                   &lt;element name="documentInformation" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DocumentInformationDetailsTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *                   &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="9" minOccurs="0"/&gt;
 *                   &lt;element name="customerReference" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="fareDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="docDetailsGroup" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="docInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketNumberTypeI"/&gt;
 *                             &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="couponGroup" maxOccurs="4" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CouponInformationTypeI"/&gt;
 *                                       &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" maxOccurs="2" minOccurs="0"/&gt;
 *                                       &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="bookingStatus" type="{http://xml.amadeus.com/TATREQ_15_2_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
 *                                       &lt;element name="baggageInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="validityDates" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="9" minOccurs="0"/&gt;
 *                                       &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
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
 *                             &lt;element name="fareComponentInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareComponentInformationTypeI"/&gt;
 *                             &lt;element name="fareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumberOfUnitsTypeI"/&gt;
 *                                       &lt;element name="pricedFareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ItemNumberTypeI"/&gt;
 *                                                 &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ActionDetailsTypeI"/&gt;
 *                                                           &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                                                 &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
 *                                                 &lt;element name="fareCalculationInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
 *                                                 &lt;element name="fareRulesInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
 *                                                 &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
 *                                                 &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
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
 *                             &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *                             &lt;element name="conversionRate" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ConversionRateTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="refundGroup" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="refundStatus" type="{http://xml.amadeus.com/TATREQ_15_2_1A}StatusTypeI"/&gt;
 *                             &lt;element name="refundLeg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI_51227S" minOccurs="0"/&gt;
 *                             &lt;element name="refundDocumentInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketNumberTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CouponInformationTypeI" maxOccurs="9" minOccurs="0"/&gt;
 *                             &lt;element name="refundPricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
 *                             &lt;element name="refundRoutingDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}RoutingInformationTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *                             &lt;element name="refundProductDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AdditionalProductDetailsTypeI" minOccurs="0"/&gt;
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
 *                             &lt;element name="travellerPriorityInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravellerPriorityDetailsTypeI"/&gt;
 *                             &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SpecificDataInformationTypeI" minOccurs="0"/&gt;
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
 *                             &lt;element name="officeIdentification" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AdditionalBusinessSourceInformationTypeI"/&gt;
 *                             &lt;element name="exchangeDocumentDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DocumentInformationDetailsTypeI" minOccurs="0"/&gt;
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
 *                             &lt;element name="selectionDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SelectionDetailsTypeI"/&gt;
 *                             &lt;element name="carrierFeeInfo" maxOccurs="99"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SpecificDataInformationTypeI"/&gt;
 *                                       &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI"/&gt;
 *                                       &lt;element name="fop" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FormOfPaymentTypeI"/&gt;
 *                                       &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
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
    "enhancedPaxInfoCriteria",
    "leg",
    "fop",
    "frequentTravellerInfo",
    "tourInfo",
    "numberOfUnits",
    "taxInfo",
    "textInfo",
    "customerReference",
    "fareDetails",
    "pricingInfo",
    "infoGroup",
    "docGroup"
})
@XmlRootElement(name = "Ticket_ProcessEDoc")
public class TicketProcessEDoc {

    @XmlElement(required = true)
    protected MessageActionDetailsTypeI msgActionDetails;
    protected TicketAgentInfoTypeI sysProvider;
    protected ReservationControlInformationTypeI referenceInfo;
    protected MonetaryInformationTypeI fareInfo;
    protected PricingTicketingDetailsTypeI productInfo;
    protected OriginAndDestinationDetailsTypeI originDestination;
    protected EnhancedTravellerInformationType199238S enhancedPaxInfoCriteria;
    protected TravelProductInformationTypeI leg;
    protected FormOfPaymentTypeI fop;
    protected FrequentTravellerInformationTypeI frequentTravellerInfo;
    protected TourInformationTypeI tourInfo;
    protected NumberOfUnitsTypeI numberOfUnits;
    protected List<TaxTypeI> taxInfo;
    protected List<InteractiveFreeTextTypeI> textInfo;
    protected ConsumerReferenceInformationTypeI customerReference;
    protected FareInformationTypeI fareDetails;
    protected PricingTicketingSubsequentTypeI pricingInfo;
    protected List<TicketProcessEDoc.InfoGroup> infoGroup;
    protected List<TicketProcessEDoc.DocGroup> docGroup;

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
     * Gets the value of the enhancedPaxInfoCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedTravellerInformationType199238S }
     *     
     */
    public EnhancedTravellerInformationType199238S getEnhancedPaxInfoCriteria() {
        return enhancedPaxInfoCriteria;
    }

    /**
     * Sets the value of the enhancedPaxInfoCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedTravellerInformationType199238S }
     *     
     */
    public void setEnhancedPaxInfoCriteria(EnhancedTravellerInformationType199238S value) {
        this.enhancedPaxInfoCriteria = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationTypeI }
     *     
     */
    public TravelProductInformationTypeI getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationTypeI }
     *     
     */
    public void setLeg(TravelProductInformationTypeI value) {
        this.leg = value;
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
     * Gets the value of the infoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketProcessEDoc.InfoGroup }
     * 
     * 
     */
    public List<TicketProcessEDoc.InfoGroup> getInfoGroup() {
        if (infoGroup == null) {
            infoGroup = new ArrayList<TicketProcessEDoc.InfoGroup>();
        }
        return this.infoGroup;
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
     * {@link TicketProcessEDoc.DocGroup }
     * 
     * 
     */
    public List<TicketProcessEDoc.DocGroup> getDocGroup() {
        if (docGroup == null) {
            docGroup = new ArrayList<TicketProcessEDoc.DocGroup>();
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
     *         &lt;element name="paxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravellerInformationTypeI"/&gt;
     *         &lt;element name="enhancedPaxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}EnhancedTravellerInformationType" minOccurs="0"/&gt;
     *         &lt;element name="sysProvider" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketAgentInfoTypeI" minOccurs="0"/&gt;
     *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="fop" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
     *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/TATREQ_15_2_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
     *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="tourInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TourInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumberOfUnitsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="5" minOccurs="0"/&gt;
     *         &lt;element name="documentInformation" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DocumentInformationDetailsTypeI" maxOccurs="99" minOccurs="0"/&gt;
     *         &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="9" minOccurs="0"/&gt;
     *         &lt;element name="customerReference" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="docDetailsGroup" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="docInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketNumberTypeI"/&gt;
     *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="couponGroup" maxOccurs="4" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CouponInformationTypeI"/&gt;
     *                             &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" maxOccurs="2" minOccurs="0"/&gt;
     *                             &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="bookingStatus" type="{http://xml.amadeus.com/TATREQ_15_2_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
     *                             &lt;element name="baggageInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="validityDates" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="9" minOccurs="0"/&gt;
     *                             &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
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
     *                   &lt;element name="fareComponentInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareComponentInformationTypeI"/&gt;
     *                   &lt;element name="fareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumberOfUnitsTypeI"/&gt;
     *                             &lt;element name="pricedFareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ItemNumberTypeI"/&gt;
     *                                       &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ActionDetailsTypeI"/&gt;
     *                                                 &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *                                       &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
     *                                       &lt;element name="fareCalculationInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
     *                                       &lt;element name="fareRulesInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
     *                                       &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
     *                                       &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
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
     *                   &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
     *                   &lt;element name="conversionRate" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ConversionRateTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="refundGroup" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="refundStatus" type="{http://xml.amadeus.com/TATREQ_15_2_1A}StatusTypeI"/&gt;
     *                   &lt;element name="refundLeg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI_51227S" minOccurs="0"/&gt;
     *                   &lt;element name="refundDocumentInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketNumberTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CouponInformationTypeI" maxOccurs="9" minOccurs="0"/&gt;
     *                   &lt;element name="refundPricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
     *                   &lt;element name="refundRoutingDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}RoutingInformationTypeI" maxOccurs="99" minOccurs="0"/&gt;
     *                   &lt;element name="refundProductDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AdditionalProductDetailsTypeI" minOccurs="0"/&gt;
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
     *                   &lt;element name="travellerPriorityInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravellerPriorityDetailsTypeI"/&gt;
     *                   &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SpecificDataInformationTypeI" minOccurs="0"/&gt;
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
     *                   &lt;element name="officeIdentification" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AdditionalBusinessSourceInformationTypeI"/&gt;
     *                   &lt;element name="exchangeDocumentDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DocumentInformationDetailsTypeI" minOccurs="0"/&gt;
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
     *                   &lt;element name="selectionDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SelectionDetailsTypeI"/&gt;
     *                   &lt;element name="carrierFeeInfo" maxOccurs="99"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SpecificDataInformationTypeI"/&gt;
     *                             &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI"/&gt;
     *                             &lt;element name="fop" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FormOfPaymentTypeI"/&gt;
     *                             &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
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
        "leg",
        "pricingInfo",
        "frequentTravellerInfo",
        "tourInfo",
        "numberOfUnits",
        "taxInfo",
        "documentInformation",
        "textInfo",
        "customerReference",
        "fareDetails",
        "docDetailsGroup",
        "fareElementsGroup",
        "refundGroup",
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
        protected TravelProductInformationTypeI leg;
        protected PricingTicketingSubsequentTypeI51235S pricingInfo;
        protected FrequentTravellerInformationTypeI frequentTravellerInfo;
        protected TourInformationTypeI tourInfo;
        protected NumberOfUnitsTypeI numberOfUnits;
        protected List<TaxTypeI> taxInfo;
        protected List<DocumentInformationDetailsTypeI> documentInformation;
        protected List<InteractiveFreeTextTypeI> textInfo;
        protected ConsumerReferenceInformationTypeI customerReference;
        protected FareInformationTypeI fareDetails;
        protected List<TicketProcessEDoc.DocGroup.DocDetailsGroup> docDetailsGroup;
        protected List<TicketProcessEDoc.DocGroup.FareElementsGroup> fareElementsGroup;
        protected List<TicketProcessEDoc.DocGroup.RefundGroup> refundGroup;
        protected TicketProcessEDoc.DocGroup.StaffTravellerGroup staffTravellerGroup;
        protected List<TicketProcessEDoc.DocGroup.OriginalIssuanceGroup> originalIssuanceGroup;
        protected List<TicketProcessEDoc.DocGroup.CarrierFeeGroup> carrierFeeGroup;

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
         * Gets the value of the leg property.
         * 
         * @return
         *     possible object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public TravelProductInformationTypeI getLeg() {
            return leg;
        }

        /**
         * Sets the value of the leg property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public void setLeg(TravelProductInformationTypeI value) {
            this.leg = value;
        }

        /**
         * Gets the value of the pricingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingSubsequentTypeI51235S }
         *     
         */
        public PricingTicketingSubsequentTypeI51235S getPricingInfo() {
            return pricingInfo;
        }

        /**
         * Sets the value of the pricingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingSubsequentTypeI51235S }
         *     
         */
        public void setPricingInfo(PricingTicketingSubsequentTypeI51235S value) {
            this.pricingInfo = value;
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
         * {@link TicketProcessEDoc.DocGroup.DocDetailsGroup }
         * 
         * 
         */
        public List<TicketProcessEDoc.DocGroup.DocDetailsGroup> getDocDetailsGroup() {
            if (docDetailsGroup == null) {
                docDetailsGroup = new ArrayList<TicketProcessEDoc.DocGroup.DocDetailsGroup>();
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
         * {@link TicketProcessEDoc.DocGroup.FareElementsGroup }
         * 
         * 
         */
        public List<TicketProcessEDoc.DocGroup.FareElementsGroup> getFareElementsGroup() {
            if (fareElementsGroup == null) {
                fareElementsGroup = new ArrayList<TicketProcessEDoc.DocGroup.FareElementsGroup>();
            }
            return this.fareElementsGroup;
        }

        /**
         * Gets the value of the refundGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refundGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefundGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketProcessEDoc.DocGroup.RefundGroup }
         * 
         * 
         */
        public List<TicketProcessEDoc.DocGroup.RefundGroup> getRefundGroup() {
            if (refundGroup == null) {
                refundGroup = new ArrayList<TicketProcessEDoc.DocGroup.RefundGroup>();
            }
            return this.refundGroup;
        }

        /**
         * Gets the value of the staffTravellerGroup property.
         * 
         * @return
         *     possible object is
         *     {@link TicketProcessEDoc.DocGroup.StaffTravellerGroup }
         *     
         */
        public TicketProcessEDoc.DocGroup.StaffTravellerGroup getStaffTravellerGroup() {
            return staffTravellerGroup;
        }

        /**
         * Sets the value of the staffTravellerGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketProcessEDoc.DocGroup.StaffTravellerGroup }
         *     
         */
        public void setStaffTravellerGroup(TicketProcessEDoc.DocGroup.StaffTravellerGroup value) {
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
         * {@link TicketProcessEDoc.DocGroup.OriginalIssuanceGroup }
         * 
         * 
         */
        public List<TicketProcessEDoc.DocGroup.OriginalIssuanceGroup> getOriginalIssuanceGroup() {
            if (originalIssuanceGroup == null) {
                originalIssuanceGroup = new ArrayList<TicketProcessEDoc.DocGroup.OriginalIssuanceGroup>();
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
         * {@link TicketProcessEDoc.DocGroup.CarrierFeeGroup }
         * 
         * 
         */
        public List<TicketProcessEDoc.DocGroup.CarrierFeeGroup> getCarrierFeeGroup() {
            if (carrierFeeGroup == null) {
                carrierFeeGroup = new ArrayList<TicketProcessEDoc.DocGroup.CarrierFeeGroup>();
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
         *         &lt;element name="selectionDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SelectionDetailsTypeI"/&gt;
         *         &lt;element name="carrierFeeInfo" maxOccurs="99"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SpecificDataInformationTypeI"/&gt;
         *                   &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI"/&gt;
         *                   &lt;element name="fop" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FormOfPaymentTypeI"/&gt;
         *                   &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
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
            protected List<TicketProcessEDoc.DocGroup.CarrierFeeGroup.CarrierFeeInfo> carrierFeeInfo;

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
             * {@link TicketProcessEDoc.DocGroup.CarrierFeeGroup.CarrierFeeInfo }
             * 
             * 
             */
            public List<TicketProcessEDoc.DocGroup.CarrierFeeGroup.CarrierFeeInfo> getCarrierFeeInfo() {
                if (carrierFeeInfo == null) {
                    carrierFeeInfo = new ArrayList<TicketProcessEDoc.DocGroup.CarrierFeeGroup.CarrierFeeInfo>();
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
             *         &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SpecificDataInformationTypeI"/&gt;
             *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI"/&gt;
             *         &lt;element name="fop" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FormOfPaymentTypeI"/&gt;
             *         &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
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
         *         &lt;element name="docInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketNumberTypeI"/&gt;
         *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
         *         &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" minOccurs="0"/&gt;
         *         &lt;element name="couponGroup" maxOccurs="4" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CouponInformationTypeI"/&gt;
         *                   &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" maxOccurs="2" minOccurs="0"/&gt;
         *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="bookingStatus" type="{http://xml.amadeus.com/TATREQ_15_2_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
         *                   &lt;element name="baggageInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="validityDates" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="9" minOccurs="0"/&gt;
         *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
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
            "productInfo",
            "textInfo",
            "couponGroup"
        })
        public static class DocDetailsGroup {

            @XmlElement(required = true)
            protected TicketNumberTypeI docInfo;
            protected PricingTicketingDetailsTypeI productInfo;
            protected InteractiveFreeTextTypeI textInfo;
            protected List<TicketProcessEDoc.DocGroup.DocDetailsGroup.CouponGroup> couponGroup;

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
             * Gets the value of the textInfo property.
             * 
             * @return
             *     possible object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public InteractiveFreeTextTypeI getTextInfo() {
                return textInfo;
            }

            /**
             * Sets the value of the textInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public void setTextInfo(InteractiveFreeTextTypeI value) {
                this.textInfo = value;
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
             * {@link TicketProcessEDoc.DocGroup.DocDetailsGroup.CouponGroup }
             * 
             * 
             */
            public List<TicketProcessEDoc.DocGroup.DocDetailsGroup.CouponGroup> getCouponGroup() {
                if (couponGroup == null) {
                    couponGroup = new ArrayList<TicketProcessEDoc.DocGroup.DocDetailsGroup.CouponGroup>();
                }
                return this.couponGroup;
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
             *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CouponInformationTypeI"/&gt;
             *         &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" maxOccurs="2" minOccurs="0"/&gt;
             *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="bookingStatus" type="{http://xml.amadeus.com/TATREQ_15_2_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
             *         &lt;element name="baggageInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
             *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="validityDates" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="textInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InteractiveFreeTextTypeI" maxOccurs="9" minOccurs="0"/&gt;
             *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI" minOccurs="0"/&gt;
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
                "textInfo",
                "productInfo"
            })
            public static class CouponGroup {

                @XmlElement(required = true)
                protected CouponInformationTypeI couponInfo;
                protected List<TravelProductInformationTypeI> leg;
                protected ReservationControlInformationTypeI referenceInfo;
                protected RelatedProductInformationTypeI bookingStatus;
                protected PricingTicketingSubsequentTypeI51235S pricingInfo;
                protected ExcessBaggageTypeI baggageInfo;
                protected FrequentTravellerInformationTypeI frequentTravellerInfo;
                protected DateAndTimeInformationTypeI validityDates;
                protected List<InteractiveFreeTextTypeI> textInfo;
                protected PricingTicketingDetailsTypeI productInfo;

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
                 * {@link TravelProductInformationTypeI }
                 * 
                 * 
                 */
                public List<TravelProductInformationTypeI> getLeg() {
                    if (leg == null) {
                        leg = new ArrayList<TravelProductInformationTypeI>();
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
                 *     {@link PricingTicketingSubsequentTypeI51235S }
                 *     
                 */
                public PricingTicketingSubsequentTypeI51235S getPricingInfo() {
                    return pricingInfo;
                }

                /**
                 * Sets the value of the pricingInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PricingTicketingSubsequentTypeI51235S }
                 *     
                 */
                public void setPricingInfo(PricingTicketingSubsequentTypeI51235S value) {
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
         *         &lt;element name="fareComponentInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareComponentInformationTypeI"/&gt;
         *         &lt;element name="fareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumberOfUnitsTypeI"/&gt;
         *                   &lt;element name="pricedFareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ItemNumberTypeI"/&gt;
         *                             &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ActionDetailsTypeI"/&gt;
         *                                       &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
         *                             &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
         *                             &lt;element name="fareCalculationInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
         *                             &lt;element name="fareRulesInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
         *                             &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
         *                             &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
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
         *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="taxInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
         *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ConversionRateTypeI" minOccurs="0"/&gt;
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
            "fareInfo",
            "taxInfo",
            "conversionRate"
        })
        public static class FareElementsGroup {

            @XmlElement(required = true)
            protected FareComponentInformationTypeI fareComponentInfo;
            protected List<TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup> fareComponentsGroup;
            protected MonetaryInformationTypeI fareInfo;
            protected List<TaxTypeI> taxInfo;
            protected ConversionRateTypeI conversionRate;

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
             * {@link TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup }
             * 
             * 
             */
            public List<TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup> getFareComponentsGroup() {
                if (fareComponentsGroup == null) {
                    fareComponentsGroup = new ArrayList<TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup>();
                }
                return this.fareComponentsGroup;
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
             * Gets the value of the conversionRate property.
             * 
             * @return
             *     possible object is
             *     {@link ConversionRateTypeI }
             *     
             */
            public ConversionRateTypeI getConversionRate() {
                return conversionRate;
            }

            /**
             * Sets the value of the conversionRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConversionRateTypeI }
             *     
             */
            public void setConversionRate(ConversionRateTypeI value) {
                this.conversionRate = value;
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
             *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumberOfUnitsTypeI"/&gt;
             *         &lt;element name="pricedFareComponentsGroup" maxOccurs="99" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ItemNumberTypeI"/&gt;
             *                   &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ActionDetailsTypeI"/&gt;
             *                             &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
             *                   &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
             *                   &lt;element name="fareCalculationInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
             *                   &lt;element name="fareRulesInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
             *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
             *                   &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
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
                protected List<TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup> pricedFareComponentsGroup;

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
                 * {@link TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup }
                 * 
                 * 
                 */
                public List<TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup> getPricedFareComponentsGroup() {
                    if (pricedFareComponentsGroup == null) {
                        pricedFareComponentsGroup = new ArrayList<TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup>();
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
                 *         &lt;element name="structuredFareCalcItem" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ItemNumberTypeI"/&gt;
                 *         &lt;element name="fareCouponGroup" maxOccurs="99" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ActionDetailsTypeI"/&gt;
                 *                   &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
                 *         &lt;element name="pricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
                 *         &lt;element name="fareCalculationInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/&gt;
                 *         &lt;element name="fareRulesInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareRulesInformationTypeI" minOccurs="0"/&gt;
                 *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI"/&gt;
                 *         &lt;element name="structuredFareCalcFareDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareInformationTypeI" minOccurs="0"/&gt;
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
                    "fareInfo",
                    "pricingInfo",
                    "fareCalculationInfo",
                    "fareRulesInfo",
                    "productInfo",
                    "structuredFareCalcFareDetails"
                })
                public static class PricedFareComponentsGroup {

                    @XmlElement(required = true)
                    protected ItemNumberTypeI structuredFareCalcItem;
                    protected List<TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup.FareCouponGroup> fareCouponGroup;
                    protected MonetaryInformationTypeI fareInfo;
                    protected PricingTicketingSubsequentTypeI51235S pricingInfo;
                    protected FareCalculationCodeDetailsTypeI fareCalculationInfo;
                    protected FareRulesInformationTypeI fareRulesInfo;
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
                     * {@link TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup.FareCouponGroup }
                     * 
                     * 
                     */
                    public List<TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup.FareCouponGroup> getFareCouponGroup() {
                        if (fareCouponGroup == null) {
                            fareCouponGroup = new ArrayList<TicketProcessEDoc.DocGroup.FareElementsGroup.FareComponentsGroup.PricedFareComponentsGroup.FareCouponGroup>();
                        }
                        return this.fareCouponGroup;
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
                     * Gets the value of the pricingInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PricingTicketingSubsequentTypeI51235S }
                     *     
                     */
                    public PricingTicketingSubsequentTypeI51235S getPricingInfo() {
                        return pricingInfo;
                    }

                    /**
                     * Sets the value of the pricingInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PricingTicketingSubsequentTypeI51235S }
                     *     
                     */
                    public void setPricingInfo(PricingTicketingSubsequentTypeI51235S value) {
                        this.pricingInfo = value;
                    }

                    /**
                     * Gets the value of the fareCalculationInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareCalculationCodeDetailsTypeI }
                     *     
                     */
                    public FareCalculationCodeDetailsTypeI getFareCalculationInfo() {
                        return fareCalculationInfo;
                    }

                    /**
                     * Sets the value of the fareCalculationInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareCalculationCodeDetailsTypeI }
                     *     
                     */
                    public void setFareCalculationInfo(FareCalculationCodeDetailsTypeI value) {
                        this.fareCalculationInfo = value;
                    }

                    /**
                     * Gets the value of the fareRulesInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareRulesInformationTypeI }
                     *     
                     */
                    public FareRulesInformationTypeI getFareRulesInfo() {
                        return fareRulesInfo;
                    }

                    /**
                     * Sets the value of the fareRulesInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareRulesInformationTypeI }
                     *     
                     */
                    public void setFareRulesInfo(FareRulesInformationTypeI value) {
                        this.fareRulesInfo = value;
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
                     *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ActionDetailsTypeI"/&gt;
                     *         &lt;element name="leg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
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
                        "leg"
                    })
                    public static class FareCouponGroup {

                        @XmlElement(required = true)
                        protected ActionDetailsTypeI couponInfo;
                        protected TravelProductInformationTypeI leg;

                        /**
                         * Gets the value of the couponInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ActionDetailsTypeI }
                         *     
                         */
                        public ActionDetailsTypeI getCouponInfo() {
                            return couponInfo;
                        }

                        /**
                         * Sets the value of the couponInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ActionDetailsTypeI }
                         *     
                         */
                        public void setCouponInfo(ActionDetailsTypeI value) {
                            this.couponInfo = value;
                        }

                        /**
                         * Gets the value of the leg property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TravelProductInformationTypeI }
                         *     
                         */
                        public TravelProductInformationTypeI getLeg() {
                            return leg;
                        }

                        /**
                         * Sets the value of the leg property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TravelProductInformationTypeI }
                         *     
                         */
                        public void setLeg(TravelProductInformationTypeI value) {
                            this.leg = value;
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
         *         &lt;element name="officeIdentification" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AdditionalBusinessSourceInformationTypeI"/&gt;
         *         &lt;element name="exchangeDocumentDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DocumentInformationDetailsTypeI" minOccurs="0"/&gt;
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
         *         &lt;element name="refundStatus" type="{http://xml.amadeus.com/TATREQ_15_2_1A}StatusTypeI"/&gt;
         *         &lt;element name="refundLeg" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravelProductInformationTypeI" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingDetailsTypeI_51227S" minOccurs="0"/&gt;
         *         &lt;element name="refundDocumentInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketNumberTypeI" minOccurs="0"/&gt;
         *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CouponInformationTypeI" maxOccurs="9" minOccurs="0"/&gt;
         *         &lt;element name="refundPricingInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingSubsequentTypeI_51235S" minOccurs="0"/&gt;
         *         &lt;element name="refundRoutingDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}RoutingInformationTypeI" maxOccurs="99" minOccurs="0"/&gt;
         *         &lt;element name="refundProductDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AdditionalProductDetailsTypeI" minOccurs="0"/&gt;
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
        public static class RefundGroup {

            @XmlElement(required = true)
            protected StatusTypeI refundStatus;
            protected List<TravelProductInformationTypeI> refundLeg;
            protected PricingTicketingDetailsTypeI51227S productInfo;
            protected TicketNumberTypeI refundDocumentInfo;
            protected List<CouponInformationTypeI> couponInfo;
            protected PricingTicketingSubsequentTypeI51235S refundPricingInfo;
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
             * {@link TravelProductInformationTypeI }
             * 
             * 
             */
            public List<TravelProductInformationTypeI> getRefundLeg() {
                if (refundLeg == null) {
                    refundLeg = new ArrayList<TravelProductInformationTypeI>();
                }
                return this.refundLeg;
            }

            /**
             * Gets the value of the productInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PricingTicketingDetailsTypeI51227S }
             *     
             */
            public PricingTicketingDetailsTypeI51227S getProductInfo() {
                return productInfo;
            }

            /**
             * Sets the value of the productInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingTicketingDetailsTypeI51227S }
             *     
             */
            public void setProductInfo(PricingTicketingDetailsTypeI51227S value) {
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
             *     {@link PricingTicketingSubsequentTypeI51235S }
             *     
             */
            public PricingTicketingSubsequentTypeI51235S getRefundPricingInfo() {
                return refundPricingInfo;
            }

            /**
             * Sets the value of the refundPricingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingTicketingSubsequentTypeI51235S }
             *     
             */
            public void setRefundPricingInfo(PricingTicketingSubsequentTypeI51235S value) {
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
         *         &lt;element name="travellerPriorityInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravellerPriorityDetailsTypeI"/&gt;
         *         &lt;element name="specialDataInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SpecificDataInformationTypeI" minOccurs="0"/&gt;
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
            "travellerPriorityInfo",
            "specialDataInfo"
        })
        public static class StaffTravellerGroup {

            @XmlElement(required = true)
            protected TravellerPriorityDetailsTypeI travellerPriorityInfo;
            protected SpecificDataInformationTypeI specialDataInfo;

            /**
             * Gets the value of the travellerPriorityInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerPriorityDetailsTypeI }
             *     
             */
            public TravellerPriorityDetailsTypeI getTravellerPriorityInfo() {
                return travellerPriorityInfo;
            }

            /**
             * Sets the value of the travellerPriorityInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerPriorityDetailsTypeI }
             *     
             */
            public void setTravellerPriorityInfo(TravellerPriorityDetailsTypeI value) {
                this.travellerPriorityInfo = value;
            }

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
     *         &lt;element name="docInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TicketNumberTypeI"/&gt;
     *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CouponInformationTypeI" maxOccurs="4" minOccurs="0"/&gt;
     *         &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TATREQ_15_2_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/&gt;
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
        "couponInfo",
        "originatorInfo"
    })
    public static class InfoGroup {

        @XmlElement(required = true)
        protected TicketNumberTypeI docInfo;
        protected List<CouponInformationTypeI> couponInfo;
        protected OriginatorOfRequestDetailsTypeI originatorInfo;

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

    }

}
