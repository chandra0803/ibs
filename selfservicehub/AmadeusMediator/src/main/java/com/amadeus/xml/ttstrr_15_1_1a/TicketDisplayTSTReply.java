
package com.amadeus.xml.ttstrr_15_1_1a;

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
 *         &lt;element name="scrollingInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ActionDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="errorGroup" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ErrorGroupType" minOccurs="0"/&gt;
 *         &lt;element name="fareList" maxOccurs="20" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pricingInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}PricingTicketingSubsequentTypeI"/&gt;
 *                   &lt;element name="fareReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ItemReferencesAndVersionsType_144071S"/&gt;
 *                   &lt;element name="fareIndicators" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareInformationType" minOccurs="0"/&gt;
 *                   &lt;element name="lastTktDate" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}StructuredDateTimeInformationType_193776S" maxOccurs="3" minOccurs="0"/&gt;
 *                   &lt;element name="validatingCarrier" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
 *                   &lt;element name="paxSegReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInformationTypeI"/&gt;
 *                   &lt;element name="fareDataInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_185763S" minOccurs="0"/&gt;
 *                   &lt;element name="reasonCode" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="reasonCodes" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AttributeType_21097S"/&gt;
 *                             &lt;element name="reasonCodeComment" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FreeTextInformationType_185885S" maxOccurs="2"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="taxInformation" maxOccurs="120" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="taxDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DutyTaxFeeDetailsTypeU"/&gt;
 *                             &lt;element name="amountDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="bankerRates" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ConversionRateTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="passengerInformation" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationTypeI"/&gt;
 *                             &lt;element name="passengerReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInformationTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="segmentInformation" maxOccurs="96" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="connexInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ConnectionTypeI"/&gt;
 *                             &lt;element name="segDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationTypeI_15391S" minOccurs="0"/&gt;
 *                             &lt;element name="fareQualifier" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareQualifierDetailsTypeI" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="validityInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="bagAllowanceInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="segmentReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="sequenceInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="otherPricingInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CodedAttributeType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="statusInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}StatusTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="officeDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}UserIdentificationType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="warningInformation" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="warningCode" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ApplicationErrorInformationType_6594S"/&gt;
 *                             &lt;element name="warningText" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}InteractiveFreeTextTypeI_6759S" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="automaticReissueInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TicketNumberTypeI"/&gt;
 *                             &lt;element name="couponInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CouponInformationTypeI"/&gt;
 *                             &lt;element name="paperCouponRange" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TicketNumberTypeI"/&gt;
 *                                       &lt;element name="couponInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CouponInformationTypeI"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="baseFareInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
 *                             &lt;element name="firstDpiGroup"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="penalty" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationType"/&gt;
 *                                       &lt;element name="reissueInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
 *                                       &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
 *                                       &lt;element name="reissueBalanceInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="secondDpiGroup"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="penalty" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationType"/&gt;
 *                                       &lt;element name="residualValueInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
 *                                       &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
 *                                       &lt;element name="issueBalanceInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
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
 *                   &lt;element name="carrierFeesGroup" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="carrierFeeType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}SelectionDetailsTypeI"/&gt;
 *                             &lt;element name="carrierFeeInfo" maxOccurs="99" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="carrierFeeSubcode" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}SpecificDataInformationTypeI"/&gt;
 *                                       &lt;element name="commercialName" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}InteractiveFreeTextTypeI"/&gt;
 *                                       &lt;element name="feeAmount" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133222S"/&gt;
 *                                       &lt;element name="feeTax" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
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
 *                   &lt;element name="contextualFop" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="mileage" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="fareComponentDetailsGroup" maxOccurs="32" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="fareComponentID" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ItemNumberType"/&gt;
 *                             &lt;element name="marketFareComponent" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationType" minOccurs="0"/&gt;
 *                             &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/&gt;
 *                             &lt;element name="fareQualifiersDetail" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareQualifierDetailsType" minOccurs="0"/&gt;
 *                             &lt;element name="fareFamilyDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareFamilyType" minOccurs="0"/&gt;
 *                             &lt;element name="fareFamilyOwner" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TransportIdentifierType_156498S" minOccurs="0"/&gt;
 *                             &lt;element name="fareComponentServiceAttributes" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AttributeType" minOccurs="0"/&gt;
 *                             &lt;element name="couponDetailsGroup" maxOccurs="99"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="productId" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInfoType"/&gt;
 *                                       &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationType" minOccurs="0"/&gt;
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
 *                   &lt;element name="endFareList" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DummySegmentTypeI"/&gt;
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
    "scrollingInformation",
    "errorGroup",
    "fareList"
})
@XmlRootElement(name = "Ticket_DisplayTSTReply")
public class TicketDisplayTSTReply {

    protected ActionDetailsTypeI scrollingInformation;
    protected ErrorGroupType errorGroup;
    protected List<TicketDisplayTSTReply.FareList> fareList;

    /**
     * Gets the value of the scrollingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public ActionDetailsTypeI getScrollingInformation() {
        return scrollingInformation;
    }

    /**
     * Sets the value of the scrollingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public void setScrollingInformation(ActionDetailsTypeI value) {
        this.scrollingInformation = value;
    }

    /**
     * Gets the value of the errorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorGroupType }
     *     
     */
    public ErrorGroupType getErrorGroup() {
        return errorGroup;
    }

    /**
     * Sets the value of the errorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorGroupType }
     *     
     */
    public void setErrorGroup(ErrorGroupType value) {
        this.errorGroup = value;
    }

    /**
     * Gets the value of the fareList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDisplayTSTReply.FareList }
     * 
     * 
     */
    public List<TicketDisplayTSTReply.FareList> getFareList() {
        if (fareList == null) {
            fareList = new ArrayList<TicketDisplayTSTReply.FareList>();
        }
        return this.fareList;
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
     *         &lt;element name="pricingInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}PricingTicketingSubsequentTypeI"/&gt;
     *         &lt;element name="fareReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ItemReferencesAndVersionsType_144071S"/&gt;
     *         &lt;element name="fareIndicators" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareInformationType" minOccurs="0"/&gt;
     *         &lt;element name="lastTktDate" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}StructuredDateTimeInformationType_193776S" maxOccurs="3" minOccurs="0"/&gt;
     *         &lt;element name="validatingCarrier" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
     *         &lt;element name="paxSegReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInformationTypeI"/&gt;
     *         &lt;element name="fareDataInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_185763S" minOccurs="0"/&gt;
     *         &lt;element name="reasonCode" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="reasonCodes" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AttributeType_21097S"/&gt;
     *                   &lt;element name="reasonCodeComment" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FreeTextInformationType_185885S" maxOccurs="2"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="taxInformation" maxOccurs="120" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="taxDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DutyTaxFeeDetailsTypeU"/&gt;
     *                   &lt;element name="amountDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="bankerRates" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ConversionRateTypeI" minOccurs="0"/&gt;
     *         &lt;element name="passengerInformation" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationTypeI"/&gt;
     *                   &lt;element name="passengerReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInformationTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="segmentInformation" maxOccurs="96" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="connexInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ConnectionTypeI"/&gt;
     *                   &lt;element name="segDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationTypeI_15391S" minOccurs="0"/&gt;
     *                   &lt;element name="fareQualifier" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareQualifierDetailsTypeI" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="validityInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="bagAllowanceInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="segmentReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="sequenceInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="otherPricingInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CodedAttributeType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="statusInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}StatusTypeI" minOccurs="0"/&gt;
     *         &lt;element name="officeDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}UserIdentificationType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="warningInformation" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="warningCode" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ApplicationErrorInformationType_6594S"/&gt;
     *                   &lt;element name="warningText" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}InteractiveFreeTextTypeI_6759S" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="automaticReissueInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TicketNumberTypeI"/&gt;
     *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CouponInformationTypeI"/&gt;
     *                   &lt;element name="paperCouponRange" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TicketNumberTypeI"/&gt;
     *                             &lt;element name="couponInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CouponInformationTypeI"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="baseFareInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
     *                   &lt;element name="firstDpiGroup"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="penalty" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationType"/&gt;
     *                             &lt;element name="reissueInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
     *                             &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
     *                             &lt;element name="reissueBalanceInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="secondDpiGroup"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="penalty" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationType"/&gt;
     *                             &lt;element name="residualValueInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
     *                             &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
     *                             &lt;element name="issueBalanceInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
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
     *         &lt;element name="carrierFeesGroup" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="carrierFeeType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}SelectionDetailsTypeI"/&gt;
     *                   &lt;element name="carrierFeeInfo" maxOccurs="99" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="carrierFeeSubcode" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}SpecificDataInformationTypeI"/&gt;
     *                             &lt;element name="commercialName" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}InteractiveFreeTextTypeI"/&gt;
     *                             &lt;element name="feeAmount" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133222S"/&gt;
     *                             &lt;element name="feeTax" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
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
     *         &lt;element name="contextualFop" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
     *         &lt;element name="mileage" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/&gt;
     *         &lt;element name="fareComponentDetailsGroup" maxOccurs="32" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="fareComponentID" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ItemNumberType"/&gt;
     *                   &lt;element name="marketFareComponent" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationType" minOccurs="0"/&gt;
     *                   &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/&gt;
     *                   &lt;element name="fareQualifiersDetail" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareQualifierDetailsType" minOccurs="0"/&gt;
     *                   &lt;element name="fareFamilyDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareFamilyType" minOccurs="0"/&gt;
     *                   &lt;element name="fareFamilyOwner" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TransportIdentifierType_156498S" minOccurs="0"/&gt;
     *                   &lt;element name="fareComponentServiceAttributes" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AttributeType" minOccurs="0"/&gt;
     *                   &lt;element name="couponDetailsGroup" maxOccurs="99"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="productId" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInfoType"/&gt;
     *                             &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationType" minOccurs="0"/&gt;
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
     *         &lt;element name="endFareList" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DummySegmentTypeI"/&gt;
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
        "pricingInformation",
        "fareReference",
        "fareIndicators",
        "lastTktDate",
        "validatingCarrier",
        "paxSegReference",
        "fareDataInformation",
        "reasonCode",
        "taxInformation",
        "bankerRates",
        "passengerInformation",
        "originDestination",
        "segmentInformation",
        "otherPricingInfo",
        "statusInformation",
        "officeDetails",
        "warningInformation",
        "automaticReissueInfo",
        "carrierFeesGroup",
        "contextualFop",
        "mileage",
        "fareComponentDetailsGroup",
        "endFareList"
    })
    public static class FareList {

        @XmlElement(required = true)
        protected PricingTicketingSubsequentTypeI pricingInformation;
        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType144071S fareReference;
        protected FareInformationType fareIndicators;
        protected List<StructuredDateTimeInformationType193776S> lastTktDate;
        protected TransportIdentifierType validatingCarrier;
        @XmlElement(required = true)
        protected ReferenceInformationTypeI paxSegReference;
        protected MonetaryInformationTypeI185763S fareDataInformation;
        protected List<TicketDisplayTSTReply.FareList.ReasonCode> reasonCode;
        protected List<TicketDisplayTSTReply.FareList.TaxInformation> taxInformation;
        protected ConversionRateTypeI bankerRates;
        protected List<TicketDisplayTSTReply.FareList.PassengerInformation> passengerInformation;
        protected OriginAndDestinationDetailsTypeI originDestination;
        protected List<TicketDisplayTSTReply.FareList.SegmentInformation> segmentInformation;
        protected List<CodedAttributeType> otherPricingInfo;
        protected StatusTypeI statusInformation;
        protected List<UserIdentificationType> officeDetails;
        protected List<TicketDisplayTSTReply.FareList.WarningInformation> warningInformation;
        protected TicketDisplayTSTReply.FareList.AutomaticReissueInfo automaticReissueInfo;
        protected List<TicketDisplayTSTReply.FareList.CarrierFeesGroup> carrierFeesGroup;
        protected FormOfPaymentTypeI contextualFop;
        protected AdditionalProductDetailsTypeI mileage;
        protected List<TicketDisplayTSTReply.FareList.FareComponentDetailsGroup> fareComponentDetailsGroup;
        @XmlElement(required = true)
        protected DummySegmentTypeI endFareList;

        /**
         * Gets the value of the pricingInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingSubsequentTypeI }
         *     
         */
        public PricingTicketingSubsequentTypeI getPricingInformation() {
            return pricingInformation;
        }

        /**
         * Sets the value of the pricingInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingSubsequentTypeI }
         *     
         */
        public void setPricingInformation(PricingTicketingSubsequentTypeI value) {
            this.pricingInformation = value;
        }

        /**
         * Gets the value of the fareReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType144071S }
         *     
         */
        public ItemReferencesAndVersionsType144071S getFareReference() {
            return fareReference;
        }

        /**
         * Sets the value of the fareReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType144071S }
         *     
         */
        public void setFareReference(ItemReferencesAndVersionsType144071S value) {
            this.fareReference = value;
        }

        /**
         * Gets the value of the fareIndicators property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformationType }
         *     
         */
        public FareInformationType getFareIndicators() {
            return fareIndicators;
        }

        /**
         * Sets the value of the fareIndicators property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformationType }
         *     
         */
        public void setFareIndicators(FareInformationType value) {
            this.fareIndicators = value;
        }

        /**
         * Gets the value of the lastTktDate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lastTktDate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLastTktDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType193776S }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType193776S> getLastTktDate() {
            if (lastTktDate == null) {
                lastTktDate = new ArrayList<StructuredDateTimeInformationType193776S>();
            }
            return this.lastTktDate;
        }

        /**
         * Gets the value of the validatingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link TransportIdentifierType }
         *     
         */
        public TransportIdentifierType getValidatingCarrier() {
            return validatingCarrier;
        }

        /**
         * Sets the value of the validatingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransportIdentifierType }
         *     
         */
        public void setValidatingCarrier(TransportIdentifierType value) {
            this.validatingCarrier = value;
        }

        /**
         * Gets the value of the paxSegReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public ReferenceInformationTypeI getPaxSegReference() {
            return paxSegReference;
        }

        /**
         * Sets the value of the paxSegReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public void setPaxSegReference(ReferenceInformationTypeI value) {
            this.paxSegReference = value;
        }

        /**
         * Gets the value of the fareDataInformation property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationTypeI185763S }
         *     
         */
        public MonetaryInformationTypeI185763S getFareDataInformation() {
            return fareDataInformation;
        }

        /**
         * Sets the value of the fareDataInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationTypeI185763S }
         *     
         */
        public void setFareDataInformation(MonetaryInformationTypeI185763S value) {
            this.fareDataInformation = value;
        }

        /**
         * Gets the value of the reasonCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reasonCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReasonCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketDisplayTSTReply.FareList.ReasonCode }
         * 
         * 
         */
        public List<TicketDisplayTSTReply.FareList.ReasonCode> getReasonCode() {
            if (reasonCode == null) {
                reasonCode = new ArrayList<TicketDisplayTSTReply.FareList.ReasonCode>();
            }
            return this.reasonCode;
        }

        /**
         * Gets the value of the taxInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketDisplayTSTReply.FareList.TaxInformation }
         * 
         * 
         */
        public List<TicketDisplayTSTReply.FareList.TaxInformation> getTaxInformation() {
            if (taxInformation == null) {
                taxInformation = new ArrayList<TicketDisplayTSTReply.FareList.TaxInformation>();
            }
            return this.taxInformation;
        }

        /**
         * Gets the value of the bankerRates property.
         * 
         * @return
         *     possible object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public ConversionRateTypeI getBankerRates() {
            return bankerRates;
        }

        /**
         * Sets the value of the bankerRates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public void setBankerRates(ConversionRateTypeI value) {
            this.bankerRates = value;
        }

        /**
         * Gets the value of the passengerInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketDisplayTSTReply.FareList.PassengerInformation }
         * 
         * 
         */
        public List<TicketDisplayTSTReply.FareList.PassengerInformation> getPassengerInformation() {
            if (passengerInformation == null) {
                passengerInformation = new ArrayList<TicketDisplayTSTReply.FareList.PassengerInformation>();
            }
            return this.passengerInformation;
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
         * Gets the value of the segmentInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketDisplayTSTReply.FareList.SegmentInformation }
         * 
         * 
         */
        public List<TicketDisplayTSTReply.FareList.SegmentInformation> getSegmentInformation() {
            if (segmentInformation == null) {
                segmentInformation = new ArrayList<TicketDisplayTSTReply.FareList.SegmentInformation>();
            }
            return this.segmentInformation;
        }

        /**
         * Gets the value of the otherPricingInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherPricingInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherPricingInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodedAttributeType }
         * 
         * 
         */
        public List<CodedAttributeType> getOtherPricingInfo() {
            if (otherPricingInfo == null) {
                otherPricingInfo = new ArrayList<CodedAttributeType>();
            }
            return this.otherPricingInfo;
        }

        /**
         * Gets the value of the statusInformation property.
         * 
         * @return
         *     possible object is
         *     {@link StatusTypeI }
         *     
         */
        public StatusTypeI getStatusInformation() {
            return statusInformation;
        }

        /**
         * Sets the value of the statusInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusTypeI }
         *     
         */
        public void setStatusInformation(StatusTypeI value) {
            this.statusInformation = value;
        }

        /**
         * Gets the value of the officeDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the officeDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfficeDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserIdentificationType }
         * 
         * 
         */
        public List<UserIdentificationType> getOfficeDetails() {
            if (officeDetails == null) {
                officeDetails = new ArrayList<UserIdentificationType>();
            }
            return this.officeDetails;
        }

        /**
         * Gets the value of the warningInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warningInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarningInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketDisplayTSTReply.FareList.WarningInformation }
         * 
         * 
         */
        public List<TicketDisplayTSTReply.FareList.WarningInformation> getWarningInformation() {
            if (warningInformation == null) {
                warningInformation = new ArrayList<TicketDisplayTSTReply.FareList.WarningInformation>();
            }
            return this.warningInformation;
        }

        /**
         * Gets the value of the automaticReissueInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TicketDisplayTSTReply.FareList.AutomaticReissueInfo }
         *     
         */
        public TicketDisplayTSTReply.FareList.AutomaticReissueInfo getAutomaticReissueInfo() {
            return automaticReissueInfo;
        }

        /**
         * Sets the value of the automaticReissueInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketDisplayTSTReply.FareList.AutomaticReissueInfo }
         *     
         */
        public void setAutomaticReissueInfo(TicketDisplayTSTReply.FareList.AutomaticReissueInfo value) {
            this.automaticReissueInfo = value;
        }

        /**
         * Gets the value of the carrierFeesGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrierFeesGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrierFeesGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketDisplayTSTReply.FareList.CarrierFeesGroup }
         * 
         * 
         */
        public List<TicketDisplayTSTReply.FareList.CarrierFeesGroup> getCarrierFeesGroup() {
            if (carrierFeesGroup == null) {
                carrierFeesGroup = new ArrayList<TicketDisplayTSTReply.FareList.CarrierFeesGroup>();
            }
            return this.carrierFeesGroup;
        }

        /**
         * Gets the value of the contextualFop property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public FormOfPaymentTypeI getContextualFop() {
            return contextualFop;
        }

        /**
         * Sets the value of the contextualFop property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public void setContextualFop(FormOfPaymentTypeI value) {
            this.contextualFop = value;
        }

        /**
         * Gets the value of the mileage property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public AdditionalProductDetailsTypeI getMileage() {
            return mileage;
        }

        /**
         * Sets the value of the mileage property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public void setMileage(AdditionalProductDetailsTypeI value) {
            this.mileage = value;
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
         * {@link TicketDisplayTSTReply.FareList.FareComponentDetailsGroup }
         * 
         * 
         */
        public List<TicketDisplayTSTReply.FareList.FareComponentDetailsGroup> getFareComponentDetailsGroup() {
            if (fareComponentDetailsGroup == null) {
                fareComponentDetailsGroup = new ArrayList<TicketDisplayTSTReply.FareList.FareComponentDetailsGroup>();
            }
            return this.fareComponentDetailsGroup;
        }

        /**
         * Gets the value of the endFareList property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getEndFareList() {
            return endFareList;
        }

        /**
         * Sets the value of the endFareList property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setEndFareList(DummySegmentTypeI value) {
            this.endFareList = value;
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
         *         &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TicketNumberTypeI"/&gt;
         *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CouponInformationTypeI"/&gt;
         *         &lt;element name="paperCouponRange" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TicketNumberTypeI"/&gt;
         *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CouponInformationTypeI"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="baseFareInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
         *         &lt;element name="firstDpiGroup"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="penalty" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationType"/&gt;
         *                   &lt;element name="reissueInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
         *                   &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
         *                   &lt;element name="reissueBalanceInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="secondDpiGroup"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="penalty" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationType"/&gt;
         *                   &lt;element name="residualValueInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
         *                   &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
         *                   &lt;element name="issueBalanceInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
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
            "ticketInfo",
            "couponInfo",
            "paperCouponRange",
            "baseFareInfo",
            "firstDpiGroup",
            "secondDpiGroup"
        })
        public static class AutomaticReissueInfo {

            @XmlElement(required = true)
            protected TicketNumberTypeI ticketInfo;
            @XmlElement(required = true)
            protected CouponInformationTypeI couponInfo;
            protected TicketDisplayTSTReply.FareList.AutomaticReissueInfo.PaperCouponRange paperCouponRange;
            @XmlElement(required = true)
            protected MonetaryInformationTypeI132703S baseFareInfo;
            @XmlElement(required = true)
            protected TicketDisplayTSTReply.FareList.AutomaticReissueInfo.FirstDpiGroup firstDpiGroup;
            @XmlElement(required = true)
            protected TicketDisplayTSTReply.FareList.AutomaticReissueInfo.SecondDpiGroup secondDpiGroup;

            /**
             * Gets the value of the ticketInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TicketNumberTypeI }
             *     
             */
            public TicketNumberTypeI getTicketInfo() {
                return ticketInfo;
            }

            /**
             * Sets the value of the ticketInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketNumberTypeI }
             *     
             */
            public void setTicketInfo(TicketNumberTypeI value) {
                this.ticketInfo = value;
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
             * Gets the value of the paperCouponRange property.
             * 
             * @return
             *     possible object is
             *     {@link TicketDisplayTSTReply.FareList.AutomaticReissueInfo.PaperCouponRange }
             *     
             */
            public TicketDisplayTSTReply.FareList.AutomaticReissueInfo.PaperCouponRange getPaperCouponRange() {
                return paperCouponRange;
            }

            /**
             * Sets the value of the paperCouponRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketDisplayTSTReply.FareList.AutomaticReissueInfo.PaperCouponRange }
             *     
             */
            public void setPaperCouponRange(TicketDisplayTSTReply.FareList.AutomaticReissueInfo.PaperCouponRange value) {
                this.paperCouponRange = value;
            }

            /**
             * Gets the value of the baseFareInfo property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI132703S }
             *     
             */
            public MonetaryInformationTypeI132703S getBaseFareInfo() {
                return baseFareInfo;
            }

            /**
             * Sets the value of the baseFareInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI132703S }
             *     
             */
            public void setBaseFareInfo(MonetaryInformationTypeI132703S value) {
                this.baseFareInfo = value;
            }

            /**
             * Gets the value of the firstDpiGroup property.
             * 
             * @return
             *     possible object is
             *     {@link TicketDisplayTSTReply.FareList.AutomaticReissueInfo.FirstDpiGroup }
             *     
             */
            public TicketDisplayTSTReply.FareList.AutomaticReissueInfo.FirstDpiGroup getFirstDpiGroup() {
                return firstDpiGroup;
            }

            /**
             * Sets the value of the firstDpiGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketDisplayTSTReply.FareList.AutomaticReissueInfo.FirstDpiGroup }
             *     
             */
            public void setFirstDpiGroup(TicketDisplayTSTReply.FareList.AutomaticReissueInfo.FirstDpiGroup value) {
                this.firstDpiGroup = value;
            }

            /**
             * Gets the value of the secondDpiGroup property.
             * 
             * @return
             *     possible object is
             *     {@link TicketDisplayTSTReply.FareList.AutomaticReissueInfo.SecondDpiGroup }
             *     
             */
            public TicketDisplayTSTReply.FareList.AutomaticReissueInfo.SecondDpiGroup getSecondDpiGroup() {
                return secondDpiGroup;
            }

            /**
             * Sets the value of the secondDpiGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketDisplayTSTReply.FareList.AutomaticReissueInfo.SecondDpiGroup }
             *     
             */
            public void setSecondDpiGroup(TicketDisplayTSTReply.FareList.AutomaticReissueInfo.SecondDpiGroup value) {
                this.secondDpiGroup = value;
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
             *         &lt;element name="penalty" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationType"/&gt;
             *         &lt;element name="reissueInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
             *         &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
             *         &lt;element name="reissueBalanceInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
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
                "penalty",
                "reissueInfo",
                "oldTaxInfo",
                "reissueBalanceInfo"
            })
            public static class FirstDpiGroup {

                @XmlElement(required = true)
                protected DiscountAndPenaltyInformationType penalty;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI133223S reissueInfo;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI133223S oldTaxInfo;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI132703S reissueBalanceInfo;

                /**
                 * Gets the value of the penalty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DiscountAndPenaltyInformationType }
                 *     
                 */
                public DiscountAndPenaltyInformationType getPenalty() {
                    return penalty;
                }

                /**
                 * Sets the value of the penalty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DiscountAndPenaltyInformationType }
                 *     
                 */
                public void setPenalty(DiscountAndPenaltyInformationType value) {
                    this.penalty = value;
                }

                /**
                 * Gets the value of the reissueInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI133223S }
                 *     
                 */
                public MonetaryInformationTypeI133223S getReissueInfo() {
                    return reissueInfo;
                }

                /**
                 * Sets the value of the reissueInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI133223S }
                 *     
                 */
                public void setReissueInfo(MonetaryInformationTypeI133223S value) {
                    this.reissueInfo = value;
                }

                /**
                 * Gets the value of the oldTaxInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI133223S }
                 *     
                 */
                public MonetaryInformationTypeI133223S getOldTaxInfo() {
                    return oldTaxInfo;
                }

                /**
                 * Sets the value of the oldTaxInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI133223S }
                 *     
                 */
                public void setOldTaxInfo(MonetaryInformationTypeI133223S value) {
                    this.oldTaxInfo = value;
                }

                /**
                 * Gets the value of the reissueBalanceInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI132703S }
                 *     
                 */
                public MonetaryInformationTypeI132703S getReissueBalanceInfo() {
                    return reissueBalanceInfo;
                }

                /**
                 * Sets the value of the reissueBalanceInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI132703S }
                 *     
                 */
                public void setReissueBalanceInfo(MonetaryInformationTypeI132703S value) {
                    this.reissueBalanceInfo = value;
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
             *         &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TicketNumberTypeI"/&gt;
             *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CouponInformationTypeI"/&gt;
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
                "ticketInfo",
                "couponInfo"
            })
            public static class PaperCouponRange {

                @XmlElement(required = true)
                protected TicketNumberTypeI ticketInfo;
                @XmlElement(required = true)
                protected CouponInformationTypeI couponInfo;

                /**
                 * Gets the value of the ticketInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TicketNumberTypeI }
                 *     
                 */
                public TicketNumberTypeI getTicketInfo() {
                    return ticketInfo;
                }

                /**
                 * Sets the value of the ticketInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TicketNumberTypeI }
                 *     
                 */
                public void setTicketInfo(TicketNumberTypeI value) {
                    this.ticketInfo = value;
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
             *         &lt;element name="penalty" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationType"/&gt;
             *         &lt;element name="residualValueInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
             *         &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133223S"/&gt;
             *         &lt;element name="issueBalanceInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_132703S"/&gt;
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
                "penalty",
                "residualValueInfo",
                "oldTaxInfo",
                "issueBalanceInfo"
            })
            public static class SecondDpiGroup {

                @XmlElement(required = true)
                protected DiscountAndPenaltyInformationType penalty;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI133223S residualValueInfo;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI133223S oldTaxInfo;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI132703S issueBalanceInfo;

                /**
                 * Gets the value of the penalty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DiscountAndPenaltyInformationType }
                 *     
                 */
                public DiscountAndPenaltyInformationType getPenalty() {
                    return penalty;
                }

                /**
                 * Sets the value of the penalty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DiscountAndPenaltyInformationType }
                 *     
                 */
                public void setPenalty(DiscountAndPenaltyInformationType value) {
                    this.penalty = value;
                }

                /**
                 * Gets the value of the residualValueInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI133223S }
                 *     
                 */
                public MonetaryInformationTypeI133223S getResidualValueInfo() {
                    return residualValueInfo;
                }

                /**
                 * Sets the value of the residualValueInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI133223S }
                 *     
                 */
                public void setResidualValueInfo(MonetaryInformationTypeI133223S value) {
                    this.residualValueInfo = value;
                }

                /**
                 * Gets the value of the oldTaxInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI133223S }
                 *     
                 */
                public MonetaryInformationTypeI133223S getOldTaxInfo() {
                    return oldTaxInfo;
                }

                /**
                 * Sets the value of the oldTaxInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI133223S }
                 *     
                 */
                public void setOldTaxInfo(MonetaryInformationTypeI133223S value) {
                    this.oldTaxInfo = value;
                }

                /**
                 * Gets the value of the issueBalanceInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI132703S }
                 *     
                 */
                public MonetaryInformationTypeI132703S getIssueBalanceInfo() {
                    return issueBalanceInfo;
                }

                /**
                 * Sets the value of the issueBalanceInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI132703S }
                 *     
                 */
                public void setIssueBalanceInfo(MonetaryInformationTypeI132703S value) {
                    this.issueBalanceInfo = value;
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
         *         &lt;element name="carrierFeeType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}SelectionDetailsTypeI"/&gt;
         *         &lt;element name="carrierFeeInfo" maxOccurs="99" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="carrierFeeSubcode" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}SpecificDataInformationTypeI"/&gt;
         *                   &lt;element name="commercialName" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}InteractiveFreeTextTypeI"/&gt;
         *                   &lt;element name="feeAmount" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133222S"/&gt;
         *                   &lt;element name="feeTax" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
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
            "carrierFeeType",
            "carrierFeeInfo"
        })
        public static class CarrierFeesGroup {

            @XmlElement(required = true)
            protected SelectionDetailsTypeI carrierFeeType;
            protected List<TicketDisplayTSTReply.FareList.CarrierFeesGroup.CarrierFeeInfo> carrierFeeInfo;

            /**
             * Gets the value of the carrierFeeType property.
             * 
             * @return
             *     possible object is
             *     {@link SelectionDetailsTypeI }
             *     
             */
            public SelectionDetailsTypeI getCarrierFeeType() {
                return carrierFeeType;
            }

            /**
             * Sets the value of the carrierFeeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link SelectionDetailsTypeI }
             *     
             */
            public void setCarrierFeeType(SelectionDetailsTypeI value) {
                this.carrierFeeType = value;
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
             * {@link TicketDisplayTSTReply.FareList.CarrierFeesGroup.CarrierFeeInfo }
             * 
             * 
             */
            public List<TicketDisplayTSTReply.FareList.CarrierFeesGroup.CarrierFeeInfo> getCarrierFeeInfo() {
                if (carrierFeeInfo == null) {
                    carrierFeeInfo = new ArrayList<TicketDisplayTSTReply.FareList.CarrierFeesGroup.CarrierFeeInfo>();
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
             *         &lt;element name="carrierFeeSubcode" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}SpecificDataInformationTypeI"/&gt;
             *         &lt;element name="commercialName" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}InteractiveFreeTextTypeI"/&gt;
             *         &lt;element name="feeAmount" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI_133222S"/&gt;
             *         &lt;element name="feeTax" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/&gt;
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
                "carrierFeeSubcode",
                "commercialName",
                "feeAmount",
                "feeTax"
            })
            public static class CarrierFeeInfo {

                @XmlElement(required = true)
                protected SpecificDataInformationTypeI carrierFeeSubcode;
                @XmlElement(required = true)
                protected InteractiveFreeTextTypeI commercialName;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI133222S feeAmount;
                protected List<TaxTypeI> feeTax;

                /**
                 * Gets the value of the carrierFeeSubcode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecificDataInformationTypeI }
                 *     
                 */
                public SpecificDataInformationTypeI getCarrierFeeSubcode() {
                    return carrierFeeSubcode;
                }

                /**
                 * Sets the value of the carrierFeeSubcode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecificDataInformationTypeI }
                 *     
                 */
                public void setCarrierFeeSubcode(SpecificDataInformationTypeI value) {
                    this.carrierFeeSubcode = value;
                }

                /**
                 * Gets the value of the commercialName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InteractiveFreeTextTypeI }
                 *     
                 */
                public InteractiveFreeTextTypeI getCommercialName() {
                    return commercialName;
                }

                /**
                 * Sets the value of the commercialName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InteractiveFreeTextTypeI }
                 *     
                 */
                public void setCommercialName(InteractiveFreeTextTypeI value) {
                    this.commercialName = value;
                }

                /**
                 * Gets the value of the feeAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI133222S }
                 *     
                 */
                public MonetaryInformationTypeI133222S getFeeAmount() {
                    return feeAmount;
                }

                /**
                 * Sets the value of the feeAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI133222S }
                 *     
                 */
                public void setFeeAmount(MonetaryInformationTypeI133222S value) {
                    this.feeAmount = value;
                }

                /**
                 * Gets the value of the feeTax property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the feeTax property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFeeTax().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TaxTypeI }
                 * 
                 * 
                 */
                public List<TaxTypeI> getFeeTax() {
                    if (feeTax == null) {
                        feeTax = new ArrayList<TaxTypeI>();
                    }
                    return this.feeTax;
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
         *         &lt;element name="fareComponentID" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ItemNumberType"/&gt;
         *         &lt;element name="marketFareComponent" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationType" minOccurs="0"/&gt;
         *         &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/&gt;
         *         &lt;element name="fareQualifiersDetail" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareQualifierDetailsType" minOccurs="0"/&gt;
         *         &lt;element name="fareFamilyDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareFamilyType" minOccurs="0"/&gt;
         *         &lt;element name="fareFamilyOwner" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TransportIdentifierType_156498S" minOccurs="0"/&gt;
         *         &lt;element name="fareComponentServiceAttributes" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AttributeType" minOccurs="0"/&gt;
         *         &lt;element name="couponDetailsGroup" maxOccurs="99"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="productId" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInfoType"/&gt;
         *                   &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationType" minOccurs="0"/&gt;
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
            "fareComponentServiceAttributes",
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
            protected TransportIdentifierType156498S fareFamilyOwner;
            protected AttributeType fareComponentServiceAttributes;
            @XmlElement(required = true)
            protected List<TicketDisplayTSTReply.FareList.FareComponentDetailsGroup.CouponDetailsGroup> couponDetailsGroup;

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
             *     {@link TransportIdentifierType156498S }
             *     
             */
            public TransportIdentifierType156498S getFareFamilyOwner() {
                return fareFamilyOwner;
            }

            /**
             * Sets the value of the fareFamilyOwner property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransportIdentifierType156498S }
             *     
             */
            public void setFareFamilyOwner(TransportIdentifierType156498S value) {
                this.fareFamilyOwner = value;
            }

            /**
             * Gets the value of the fareComponentServiceAttributes property.
             * 
             * @return
             *     possible object is
             *     {@link AttributeType }
             *     
             */
            public AttributeType getFareComponentServiceAttributes() {
                return fareComponentServiceAttributes;
            }

            /**
             * Sets the value of the fareComponentServiceAttributes property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttributeType }
             *     
             */
            public void setFareComponentServiceAttributes(AttributeType value) {
                this.fareComponentServiceAttributes = value;
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
             * {@link TicketDisplayTSTReply.FareList.FareComponentDetailsGroup.CouponDetailsGroup }
             * 
             * 
             */
            public List<TicketDisplayTSTReply.FareList.FareComponentDetailsGroup.CouponDetailsGroup> getCouponDetailsGroup() {
                if (couponDetailsGroup == null) {
                    couponDetailsGroup = new ArrayList<TicketDisplayTSTReply.FareList.FareComponentDetailsGroup.CouponDetailsGroup>();
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
             *         &lt;element name="productId" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInfoType"/&gt;
             *         &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationType" minOccurs="0"/&gt;
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
                "flightConnectionType"
            })
            public static class CouponDetailsGroup {

                @XmlElement(required = true)
                protected ReferenceInfoType productId;
                protected TravelProductInformationType flightConnectionType;

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
         *         &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountAndPenaltyInformationTypeI"/&gt;
         *         &lt;element name="passengerReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInformationTypeI" minOccurs="0"/&gt;
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
            "penDisInformation",
            "passengerReference"
        })
        public static class PassengerInformation {

            @XmlElement(required = true)
            protected DiscountAndPenaltyInformationTypeI penDisInformation;
            protected ReferenceInformationTypeI passengerReference;

            /**
             * Gets the value of the penDisInformation property.
             * 
             * @return
             *     possible object is
             *     {@link DiscountAndPenaltyInformationTypeI }
             *     
             */
            public DiscountAndPenaltyInformationTypeI getPenDisInformation() {
                return penDisInformation;
            }

            /**
             * Sets the value of the penDisInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiscountAndPenaltyInformationTypeI }
             *     
             */
            public void setPenDisInformation(DiscountAndPenaltyInformationTypeI value) {
                this.penDisInformation = value;
            }

            /**
             * Gets the value of the passengerReference property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInformationTypeI }
             *     
             */
            public ReferenceInformationTypeI getPassengerReference() {
                return passengerReference;
            }

            /**
             * Sets the value of the passengerReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInformationTypeI }
             *     
             */
            public void setPassengerReference(ReferenceInformationTypeI value) {
                this.passengerReference = value;
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
         *         &lt;element name="reasonCodes" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AttributeType_21097S"/&gt;
         *         &lt;element name="reasonCodeComment" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FreeTextInformationType_185885S" maxOccurs="2"/&gt;
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
            "reasonCodes",
            "reasonCodeComment"
        })
        public static class ReasonCode {

            @XmlElement(required = true)
            protected AttributeType21097S reasonCodes;
            @XmlElement(required = true)
            protected List<FreeTextInformationType185885S> reasonCodeComment;

            /**
             * Gets the value of the reasonCodes property.
             * 
             * @return
             *     possible object is
             *     {@link AttributeType21097S }
             *     
             */
            public AttributeType21097S getReasonCodes() {
                return reasonCodes;
            }

            /**
             * Sets the value of the reasonCodes property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttributeType21097S }
             *     
             */
            public void setReasonCodes(AttributeType21097S value) {
                this.reasonCodes = value;
            }

            /**
             * Gets the value of the reasonCodeComment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reasonCodeComment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReasonCodeComment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FreeTextInformationType185885S }
             * 
             * 
             */
            public List<FreeTextInformationType185885S> getReasonCodeComment() {
                if (reasonCodeComment == null) {
                    reasonCodeComment = new ArrayList<FreeTextInformationType185885S>();
                }
                return this.reasonCodeComment;
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
         *         &lt;element name="connexInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ConnectionTypeI"/&gt;
         *         &lt;element name="segDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}TravelProductInformationTypeI_15391S" minOccurs="0"/&gt;
         *         &lt;element name="fareQualifier" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareQualifierDetailsTypeI" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="validityInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="bagAllowanceInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
         *         &lt;element name="segmentReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ReferenceInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="sequenceInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/&gt;
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
            "connexInformation",
            "segDetails",
            "fareQualifier",
            "validityInformation",
            "bagAllowanceInformation",
            "segmentReference",
            "sequenceInformation"
        })
        public static class SegmentInformation {

            @XmlElement(required = true)
            protected ConnectionTypeI connexInformation;
            protected TravelProductInformationTypeI15391S segDetails;
            protected List<FareQualifierDetailsTypeI> fareQualifier;
            protected List<StructuredDateTimeInformationType> validityInformation;
            protected ExcessBaggageTypeI bagAllowanceInformation;
            protected ReferenceInformationTypeI segmentReference;
            protected ItemReferencesAndVersionsType sequenceInformation;

            /**
             * Gets the value of the connexInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ConnectionTypeI }
             *     
             */
            public ConnectionTypeI getConnexInformation() {
                return connexInformation;
            }

            /**
             * Sets the value of the connexInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConnectionTypeI }
             *     
             */
            public void setConnexInformation(ConnectionTypeI value) {
                this.connexInformation = value;
            }

            /**
             * Gets the value of the segDetails property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI15391S }
             *     
             */
            public TravelProductInformationTypeI15391S getSegDetails() {
                return segDetails;
            }

            /**
             * Sets the value of the segDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI15391S }
             *     
             */
            public void setSegDetails(TravelProductInformationTypeI15391S value) {
                this.segDetails = value;
            }

            /**
             * Gets the value of the fareQualifier property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fareQualifier property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFareQualifier().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareQualifierDetailsTypeI }
             * 
             * 
             */
            public List<FareQualifierDetailsTypeI> getFareQualifier() {
                if (fareQualifier == null) {
                    fareQualifier = new ArrayList<FareQualifierDetailsTypeI>();
                }
                return this.fareQualifier;
            }

            /**
             * Gets the value of the validityInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the validityInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getValidityInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StructuredDateTimeInformationType }
             * 
             * 
             */
            public List<StructuredDateTimeInformationType> getValidityInformation() {
                if (validityInformation == null) {
                    validityInformation = new ArrayList<StructuredDateTimeInformationType>();
                }
                return this.validityInformation;
            }

            /**
             * Gets the value of the bagAllowanceInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ExcessBaggageTypeI }
             *     
             */
            public ExcessBaggageTypeI getBagAllowanceInformation() {
                return bagAllowanceInformation;
            }

            /**
             * Sets the value of the bagAllowanceInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExcessBaggageTypeI }
             *     
             */
            public void setBagAllowanceInformation(ExcessBaggageTypeI value) {
                this.bagAllowanceInformation = value;
            }

            /**
             * Gets the value of the segmentReference property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInformationTypeI }
             *     
             */
            public ReferenceInformationTypeI getSegmentReference() {
                return segmentReference;
            }

            /**
             * Sets the value of the segmentReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInformationTypeI }
             *     
             */
            public void setSegmentReference(ReferenceInformationTypeI value) {
                this.segmentReference = value;
            }

            /**
             * Gets the value of the sequenceInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public ItemReferencesAndVersionsType getSequenceInformation() {
                return sequenceInformation;
            }

            /**
             * Sets the value of the sequenceInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public void setSequenceInformation(ItemReferencesAndVersionsType value) {
                this.sequenceInformation = value;
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
         *         &lt;element name="taxDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DutyTaxFeeDetailsTypeU"/&gt;
         *         &lt;element name="amountDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
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
            "taxDetails",
            "amountDetails"
        })
        public static class TaxInformation {

            @XmlElement(required = true)
            protected DutyTaxFeeDetailsTypeU taxDetails;
            protected MonetaryInformationTypeI amountDetails;

            /**
             * Gets the value of the taxDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DutyTaxFeeDetailsTypeU }
             *     
             */
            public DutyTaxFeeDetailsTypeU getTaxDetails() {
                return taxDetails;
            }

            /**
             * Sets the value of the taxDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DutyTaxFeeDetailsTypeU }
             *     
             */
            public void setTaxDetails(DutyTaxFeeDetailsTypeU value) {
                this.taxDetails = value;
            }

            /**
             * Gets the value of the amountDetails property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getAmountDetails() {
                return amountDetails;
            }

            /**
             * Sets the value of the amountDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setAmountDetails(MonetaryInformationTypeI value) {
                this.amountDetails = value;
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
         *         &lt;element name="warningCode" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ApplicationErrorInformationType_6594S"/&gt;
         *         &lt;element name="warningText" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}InteractiveFreeTextTypeI_6759S" minOccurs="0"/&gt;
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
            "warningCode",
            "warningText"
        })
        public static class WarningInformation {

            @XmlElement(required = true)
            protected ApplicationErrorInformationType6594S warningCode;
            protected InteractiveFreeTextTypeI6759S warningText;

            /**
             * Gets the value of the warningCode property.
             * 
             * @return
             *     possible object is
             *     {@link ApplicationErrorInformationType6594S }
             *     
             */
            public ApplicationErrorInformationType6594S getWarningCode() {
                return warningCode;
            }

            /**
             * Sets the value of the warningCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ApplicationErrorInformationType6594S }
             *     
             */
            public void setWarningCode(ApplicationErrorInformationType6594S value) {
                this.warningCode = value;
            }

            /**
             * Gets the value of the warningText property.
             * 
             * @return
             *     possible object is
             *     {@link InteractiveFreeTextTypeI6759S }
             *     
             */
            public InteractiveFreeTextTypeI6759S getWarningText() {
                return warningText;
            }

            /**
             * Sets the value of the warningText property.
             * 
             * @param value
             *     allowed object is
             *     {@link InteractiveFreeTextTypeI6759S }
             *     
             */
            public void setWarningText(InteractiveFreeTextTypeI6759S value) {
                this.warningText = value;
            }

        }

    }

}
