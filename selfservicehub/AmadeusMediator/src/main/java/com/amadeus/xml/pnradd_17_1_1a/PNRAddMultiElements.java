
package com.amadeus.xml.pnradd_17_1_1a;

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
 *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="pnrActions" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OptionalPNRActionsType"/&gt;
 *         &lt;element name="travellerInfo" maxOccurs="100" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="elementManagementPassenger" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ElementManagementSegmentType"/&gt;
 *                   &lt;element name="passengerData" maxOccurs="2" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TravellerInformationTypeI"/&gt;
 *                             &lt;element name="dateOfBirth" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeInformationType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="enhancedPassengerData" maxOccurs="2" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="enhancedTravellerInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}EnhancedTravellerInformationType"/&gt;
 *                             &lt;element name="dateOfBirthInEnhancedPaxData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeInformationType" minOccurs="0"/&gt;
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
 *         &lt;element name="originDestinationDetails" maxOccurs="50" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OriginAndDestinationDetailsTypeI"/&gt;
 *                   &lt;element name="itineraryInfo" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ElementManagementSegmentType"/&gt;
 *                             &lt;element name="airAuxItinerary" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TravelProductInformationType"/&gt;
 *                                       &lt;element name="messageAction" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MessageActionDetailsTypeI"/&gt;
 *                                       &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRADD_17_1_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="selectionDetailsAir" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SelectionDetailsTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="reservationInfoSell" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *                                       &lt;element name="freetextItinerary" type="{http://xml.amadeus.com/PNRADD_17_1_1A}LongFreeTextType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="referenceForSegment" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReferenceInfoType" minOccurs="0"/&gt;
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
 *         &lt;element name="dataElementsMaster" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="marker1" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DummySegmentTypeI"/&gt;
 *                   &lt;element name="dataElementsIndiv" maxOccurs="250" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="elementManagementData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ElementManagementSegmentType"/&gt;
 *                             &lt;element name="pnrSecurity" type="{http://xml.amadeus.com/PNRADD_17_1_1A}IndividualPnrSecurityInformationType" minOccurs="0"/&gt;
 *                             &lt;element name="accounting" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AccountingInformationElementType" minOccurs="0"/&gt;
 *                             &lt;element name="miscellaneousRemark" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MiscellaneousRemarksType" minOccurs="0"/&gt;
 *                             &lt;element name="extendedRemark" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ExtendedRemarkType" minOccurs="0"/&gt;
 *                             &lt;element name="serviceRequest" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SpecialRequirementsDetailsTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="dateAndTimeInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="tourCode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TourCodeType" minOccurs="0"/&gt;
 *                             &lt;element name="ticketElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TicketElementType" minOccurs="0"/&gt;
 *                             &lt;element name="freetextData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}LongFreeTextType" minOccurs="0"/&gt;
 *                             &lt;element name="structuredAddress" type="{http://xml.amadeus.com/PNRADD_17_1_1A}StructuredAddressType" minOccurs="0"/&gt;
 *                             &lt;element name="optionElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OptionElementType" minOccurs="0"/&gt;
 *                             &lt;element name="printer" type="{http://xml.amadeus.com/PNRADD_17_1_1A}PrinterIdentificationType" minOccurs="0"/&gt;
 *                             &lt;element name="seatGroup" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SeatEntityType" minOccurs="0"/&gt;
 *                             &lt;element name="fareElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FareElementsType" minOccurs="0"/&gt;
 *                             &lt;element name="fareDiscount" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FareDiscountElementType" minOccurs="0"/&gt;
 *                             &lt;element name="manualFareDocument" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ManualDocumentRegistrationType" minOccurs="0"/&gt;
 *                             &lt;element name="commission" type="{http://xml.amadeus.com/PNRADD_17_1_1A}CommissionElementType" minOccurs="0"/&gt;
 *                             &lt;element name="originalIssue" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OriginalIssueType" minOccurs="0"/&gt;
 *                             &lt;element name="formOfPayment" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="fopExtension" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MarketSpecificDataType" maxOccurs="3" minOccurs="0"/&gt;
 *                             &lt;element name="serviceDetails" type="{http://xml.amadeus.com/PNRADD_17_1_1A}StatusTypeI" maxOccurs="3" minOccurs="0"/&gt;
 *                             &lt;element name="frequentTravellerVerification" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FrequentTravellerVerificationType" minOccurs="0"/&gt;
 *                             &lt;element name="ticketingCarrier" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TicketingCarrierDesignatorType" minOccurs="0"/&gt;
 *                             &lt;element name="farePrintOverride" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FarePrintOverrideType" minOccurs="0"/&gt;
 *                             &lt;element name="frequentTravellerData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FrequentTravellerInformationTypeU" minOccurs="0"/&gt;
 *                             &lt;element name="accessLevel" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ExtendedOwnershipSecurityDetailsType" minOccurs="0"/&gt;
 *                             &lt;element name="referenceForDataElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReferenceInfoType" minOccurs="0"/&gt;
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
    "reservationInfo",
    "pnrActions",
    "travellerInfo",
    "originDestinationDetails",
    "dataElementsMaster"
})
@XmlRootElement(name = "PNR_AddMultiElements")
public class PNRAddMultiElements {

    protected ReservationControlInformationTypeI reservationInfo;
    @XmlElement(required = true)
    protected OptionalPNRActionsType pnrActions;
    protected List<PNRAddMultiElements.TravellerInfo> travellerInfo;
    protected List<PNRAddMultiElements.OriginDestinationDetails> originDestinationDetails;
    protected PNRAddMultiElements.DataElementsMaster dataElementsMaster;

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setReservationInfo(ReservationControlInformationTypeI value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the pnrActions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalPNRActionsType }
     *     
     */
    public OptionalPNRActionsType getPnrActions() {
        return pnrActions;
    }

    /**
     * Sets the value of the pnrActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalPNRActionsType }
     *     
     */
    public void setPnrActions(OptionalPNRActionsType value) {
        this.pnrActions = value;
    }

    /**
     * Gets the value of the travellerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRAddMultiElements.TravellerInfo }
     * 
     * 
     */
    public List<PNRAddMultiElements.TravellerInfo> getTravellerInfo() {
        if (travellerInfo == null) {
            travellerInfo = new ArrayList<PNRAddMultiElements.TravellerInfo>();
        }
        return this.travellerInfo;
    }

    /**
     * Gets the value of the originDestinationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRAddMultiElements.OriginDestinationDetails }
     * 
     * 
     */
    public List<PNRAddMultiElements.OriginDestinationDetails> getOriginDestinationDetails() {
        if (originDestinationDetails == null) {
            originDestinationDetails = new ArrayList<PNRAddMultiElements.OriginDestinationDetails>();
        }
        return this.originDestinationDetails;
    }

    /**
     * Gets the value of the dataElementsMaster property.
     * 
     * @return
     *     possible object is
     *     {@link PNRAddMultiElements.DataElementsMaster }
     *     
     */
    public PNRAddMultiElements.DataElementsMaster getDataElementsMaster() {
        return dataElementsMaster;
    }

    /**
     * Sets the value of the dataElementsMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRAddMultiElements.DataElementsMaster }
     *     
     */
    public void setDataElementsMaster(PNRAddMultiElements.DataElementsMaster value) {
        this.dataElementsMaster = value;
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
     *         &lt;element name="marker1" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DummySegmentTypeI"/&gt;
     *         &lt;element name="dataElementsIndiv" maxOccurs="250" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="elementManagementData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ElementManagementSegmentType"/&gt;
     *                   &lt;element name="pnrSecurity" type="{http://xml.amadeus.com/PNRADD_17_1_1A}IndividualPnrSecurityInformationType" minOccurs="0"/&gt;
     *                   &lt;element name="accounting" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AccountingInformationElementType" minOccurs="0"/&gt;
     *                   &lt;element name="miscellaneousRemark" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MiscellaneousRemarksType" minOccurs="0"/&gt;
     *                   &lt;element name="extendedRemark" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ExtendedRemarkType" minOccurs="0"/&gt;
     *                   &lt;element name="serviceRequest" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SpecialRequirementsDetailsTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="dateAndTimeInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="tourCode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TourCodeType" minOccurs="0"/&gt;
     *                   &lt;element name="ticketElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TicketElementType" minOccurs="0"/&gt;
     *                   &lt;element name="freetextData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}LongFreeTextType" minOccurs="0"/&gt;
     *                   &lt;element name="structuredAddress" type="{http://xml.amadeus.com/PNRADD_17_1_1A}StructuredAddressType" minOccurs="0"/&gt;
     *                   &lt;element name="optionElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OptionElementType" minOccurs="0"/&gt;
     *                   &lt;element name="printer" type="{http://xml.amadeus.com/PNRADD_17_1_1A}PrinterIdentificationType" minOccurs="0"/&gt;
     *                   &lt;element name="seatGroup" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SeatEntityType" minOccurs="0"/&gt;
     *                   &lt;element name="fareElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FareElementsType" minOccurs="0"/&gt;
     *                   &lt;element name="fareDiscount" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FareDiscountElementType" minOccurs="0"/&gt;
     *                   &lt;element name="manualFareDocument" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ManualDocumentRegistrationType" minOccurs="0"/&gt;
     *                   &lt;element name="commission" type="{http://xml.amadeus.com/PNRADD_17_1_1A}CommissionElementType" minOccurs="0"/&gt;
     *                   &lt;element name="originalIssue" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OriginalIssueType" minOccurs="0"/&gt;
     *                   &lt;element name="formOfPayment" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="fopExtension" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MarketSpecificDataType" maxOccurs="3" minOccurs="0"/&gt;
     *                   &lt;element name="serviceDetails" type="{http://xml.amadeus.com/PNRADD_17_1_1A}StatusTypeI" maxOccurs="3" minOccurs="0"/&gt;
     *                   &lt;element name="frequentTravellerVerification" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FrequentTravellerVerificationType" minOccurs="0"/&gt;
     *                   &lt;element name="ticketingCarrier" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TicketingCarrierDesignatorType" minOccurs="0"/&gt;
     *                   &lt;element name="farePrintOverride" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FarePrintOverrideType" minOccurs="0"/&gt;
     *                   &lt;element name="frequentTravellerData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FrequentTravellerInformationTypeU" minOccurs="0"/&gt;
     *                   &lt;element name="accessLevel" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ExtendedOwnershipSecurityDetailsType" minOccurs="0"/&gt;
     *                   &lt;element name="referenceForDataElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReferenceInfoType" minOccurs="0"/&gt;
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
        "marker1",
        "dataElementsIndiv"
    })
    public static class DataElementsMaster {

        @XmlElement(required = true)
        protected DummySegmentTypeI marker1;
        protected List<PNRAddMultiElements.DataElementsMaster.DataElementsIndiv> dataElementsIndiv;

        /**
         * Gets the value of the marker1 property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getMarker1() {
            return marker1;
        }

        /**
         * Sets the value of the marker1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setMarker1(DummySegmentTypeI value) {
            this.marker1 = value;
        }

        /**
         * Gets the value of the dataElementsIndiv property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataElementsIndiv property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataElementsIndiv().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRAddMultiElements.DataElementsMaster.DataElementsIndiv }
         * 
         * 
         */
        public List<PNRAddMultiElements.DataElementsMaster.DataElementsIndiv> getDataElementsIndiv() {
            if (dataElementsIndiv == null) {
                dataElementsIndiv = new ArrayList<PNRAddMultiElements.DataElementsMaster.DataElementsIndiv>();
            }
            return this.dataElementsIndiv;
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
         *         &lt;element name="elementManagementData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ElementManagementSegmentType"/&gt;
         *         &lt;element name="pnrSecurity" type="{http://xml.amadeus.com/PNRADD_17_1_1A}IndividualPnrSecurityInformationType" minOccurs="0"/&gt;
         *         &lt;element name="accounting" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AccountingInformationElementType" minOccurs="0"/&gt;
         *         &lt;element name="miscellaneousRemark" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MiscellaneousRemarksType" minOccurs="0"/&gt;
         *         &lt;element name="extendedRemark" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ExtendedRemarkType" minOccurs="0"/&gt;
         *         &lt;element name="serviceRequest" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SpecialRequirementsDetailsTypeI" minOccurs="0"/&gt;
         *         &lt;element name="dateAndTimeInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="tourCode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TourCodeType" minOccurs="0"/&gt;
         *         &lt;element name="ticketElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TicketElementType" minOccurs="0"/&gt;
         *         &lt;element name="freetextData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}LongFreeTextType" minOccurs="0"/&gt;
         *         &lt;element name="structuredAddress" type="{http://xml.amadeus.com/PNRADD_17_1_1A}StructuredAddressType" minOccurs="0"/&gt;
         *         &lt;element name="optionElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OptionElementType" minOccurs="0"/&gt;
         *         &lt;element name="printer" type="{http://xml.amadeus.com/PNRADD_17_1_1A}PrinterIdentificationType" minOccurs="0"/&gt;
         *         &lt;element name="seatGroup" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SeatEntityType" minOccurs="0"/&gt;
         *         &lt;element name="fareElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FareElementsType" minOccurs="0"/&gt;
         *         &lt;element name="fareDiscount" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FareDiscountElementType" minOccurs="0"/&gt;
         *         &lt;element name="manualFareDocument" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ManualDocumentRegistrationType" minOccurs="0"/&gt;
         *         &lt;element name="commission" type="{http://xml.amadeus.com/PNRADD_17_1_1A}CommissionElementType" minOccurs="0"/&gt;
         *         &lt;element name="originalIssue" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OriginalIssueType" minOccurs="0"/&gt;
         *         &lt;element name="formOfPayment" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FormOfPaymentTypeI" minOccurs="0"/&gt;
         *         &lt;element name="fopExtension" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MarketSpecificDataType" maxOccurs="3" minOccurs="0"/&gt;
         *         &lt;element name="serviceDetails" type="{http://xml.amadeus.com/PNRADD_17_1_1A}StatusTypeI" maxOccurs="3" minOccurs="0"/&gt;
         *         &lt;element name="frequentTravellerVerification" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FrequentTravellerVerificationType" minOccurs="0"/&gt;
         *         &lt;element name="ticketingCarrier" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TicketingCarrierDesignatorType" minOccurs="0"/&gt;
         *         &lt;element name="farePrintOverride" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FarePrintOverrideType" minOccurs="0"/&gt;
         *         &lt;element name="frequentTravellerData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FrequentTravellerInformationTypeU" minOccurs="0"/&gt;
         *         &lt;element name="accessLevel" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ExtendedOwnershipSecurityDetailsType" minOccurs="0"/&gt;
         *         &lt;element name="referenceForDataElement" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReferenceInfoType" minOccurs="0"/&gt;
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
            "elementManagementData",
            "pnrSecurity",
            "accounting",
            "miscellaneousRemark",
            "extendedRemark",
            "serviceRequest",
            "dateAndTimeInformation",
            "tourCode",
            "ticketElement",
            "freetextData",
            "structuredAddress",
            "optionElement",
            "printer",
            "seatGroup",
            "fareElement",
            "fareDiscount",
            "manualFareDocument",
            "commission",
            "originalIssue",
            "formOfPayment",
            "fopExtension",
            "serviceDetails",
            "frequentTravellerVerification",
            "ticketingCarrier",
            "farePrintOverride",
            "frequentTravellerData",
            "accessLevel",
            "referenceForDataElement"
        })
        public static class DataElementsIndiv {

            @XmlElement(required = true)
            protected ElementManagementSegmentType elementManagementData;
            protected IndividualPnrSecurityInformationType pnrSecurity;
            protected AccountingInformationElementType accounting;
            protected MiscellaneousRemarksType miscellaneousRemark;
            protected ExtendedRemarkType extendedRemark;
            protected SpecialRequirementsDetailsTypeI serviceRequest;
            protected DateAndTimeInformationTypeI dateAndTimeInformation;
            protected TourCodeType tourCode;
            protected TicketElementType ticketElement;
            protected LongFreeTextType freetextData;
            protected StructuredAddressType structuredAddress;
            protected OptionElementType optionElement;
            protected PrinterIdentificationType printer;
            protected SeatEntityType seatGroup;
            protected FareElementsType fareElement;
            protected FareDiscountElementType fareDiscount;
            protected ManualDocumentRegistrationType manualFareDocument;
            protected CommissionElementType commission;
            protected OriginalIssueType originalIssue;
            protected FormOfPaymentTypeI formOfPayment;
            protected List<MarketSpecificDataType> fopExtension;
            protected List<StatusTypeI> serviceDetails;
            protected FrequentTravellerVerificationType frequentTravellerVerification;
            protected TicketingCarrierDesignatorType ticketingCarrier;
            protected FarePrintOverrideType farePrintOverride;
            protected FrequentTravellerInformationTypeU frequentTravellerData;
            protected ExtendedOwnershipSecurityDetailsType accessLevel;
            protected ReferenceInfoType referenceForDataElement;

            /**
             * Gets the value of the elementManagementData property.
             * 
             * @return
             *     possible object is
             *     {@link ElementManagementSegmentType }
             *     
             */
            public ElementManagementSegmentType getElementManagementData() {
                return elementManagementData;
            }

            /**
             * Sets the value of the elementManagementData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElementManagementSegmentType }
             *     
             */
            public void setElementManagementData(ElementManagementSegmentType value) {
                this.elementManagementData = value;
            }

            /**
             * Gets the value of the pnrSecurity property.
             * 
             * @return
             *     possible object is
             *     {@link IndividualPnrSecurityInformationType }
             *     
             */
            public IndividualPnrSecurityInformationType getPnrSecurity() {
                return pnrSecurity;
            }

            /**
             * Sets the value of the pnrSecurity property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndividualPnrSecurityInformationType }
             *     
             */
            public void setPnrSecurity(IndividualPnrSecurityInformationType value) {
                this.pnrSecurity = value;
            }

            /**
             * Gets the value of the accounting property.
             * 
             * @return
             *     possible object is
             *     {@link AccountingInformationElementType }
             *     
             */
            public AccountingInformationElementType getAccounting() {
                return accounting;
            }

            /**
             * Sets the value of the accounting property.
             * 
             * @param value
             *     allowed object is
             *     {@link AccountingInformationElementType }
             *     
             */
            public void setAccounting(AccountingInformationElementType value) {
                this.accounting = value;
            }

            /**
             * Gets the value of the miscellaneousRemark property.
             * 
             * @return
             *     possible object is
             *     {@link MiscellaneousRemarksType }
             *     
             */
            public MiscellaneousRemarksType getMiscellaneousRemark() {
                return miscellaneousRemark;
            }

            /**
             * Sets the value of the miscellaneousRemark property.
             * 
             * @param value
             *     allowed object is
             *     {@link MiscellaneousRemarksType }
             *     
             */
            public void setMiscellaneousRemark(MiscellaneousRemarksType value) {
                this.miscellaneousRemark = value;
            }

            /**
             * Gets the value of the extendedRemark property.
             * 
             * @return
             *     possible object is
             *     {@link ExtendedRemarkType }
             *     
             */
            public ExtendedRemarkType getExtendedRemark() {
                return extendedRemark;
            }

            /**
             * Sets the value of the extendedRemark property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExtendedRemarkType }
             *     
             */
            public void setExtendedRemark(ExtendedRemarkType value) {
                this.extendedRemark = value;
            }

            /**
             * Gets the value of the serviceRequest property.
             * 
             * @return
             *     possible object is
             *     {@link SpecialRequirementsDetailsTypeI }
             *     
             */
            public SpecialRequirementsDetailsTypeI getServiceRequest() {
                return serviceRequest;
            }

            /**
             * Sets the value of the serviceRequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecialRequirementsDetailsTypeI }
             *     
             */
            public void setServiceRequest(SpecialRequirementsDetailsTypeI value) {
                this.serviceRequest = value;
            }

            /**
             * Gets the value of the dateAndTimeInformation property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationTypeI }
             *     
             */
            public DateAndTimeInformationTypeI getDateAndTimeInformation() {
                return dateAndTimeInformation;
            }

            /**
             * Sets the value of the dateAndTimeInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationTypeI }
             *     
             */
            public void setDateAndTimeInformation(DateAndTimeInformationTypeI value) {
                this.dateAndTimeInformation = value;
            }

            /**
             * Gets the value of the tourCode property.
             * 
             * @return
             *     possible object is
             *     {@link TourCodeType }
             *     
             */
            public TourCodeType getTourCode() {
                return tourCode;
            }

            /**
             * Sets the value of the tourCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link TourCodeType }
             *     
             */
            public void setTourCode(TourCodeType value) {
                this.tourCode = value;
            }

            /**
             * Gets the value of the ticketElement property.
             * 
             * @return
             *     possible object is
             *     {@link TicketElementType }
             *     
             */
            public TicketElementType getTicketElement() {
                return ticketElement;
            }

            /**
             * Sets the value of the ticketElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketElementType }
             *     
             */
            public void setTicketElement(TicketElementType value) {
                this.ticketElement = value;
            }

            /**
             * Gets the value of the freetextData property.
             * 
             * @return
             *     possible object is
             *     {@link LongFreeTextType }
             *     
             */
            public LongFreeTextType getFreetextData() {
                return freetextData;
            }

            /**
             * Sets the value of the freetextData property.
             * 
             * @param value
             *     allowed object is
             *     {@link LongFreeTextType }
             *     
             */
            public void setFreetextData(LongFreeTextType value) {
                this.freetextData = value;
            }

            /**
             * Gets the value of the structuredAddress property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredAddressType }
             *     
             */
            public StructuredAddressType getStructuredAddress() {
                return structuredAddress;
            }

            /**
             * Sets the value of the structuredAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredAddressType }
             *     
             */
            public void setStructuredAddress(StructuredAddressType value) {
                this.structuredAddress = value;
            }

            /**
             * Gets the value of the optionElement property.
             * 
             * @return
             *     possible object is
             *     {@link OptionElementType }
             *     
             */
            public OptionElementType getOptionElement() {
                return optionElement;
            }

            /**
             * Sets the value of the optionElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link OptionElementType }
             *     
             */
            public void setOptionElement(OptionElementType value) {
                this.optionElement = value;
            }

            /**
             * Gets the value of the printer property.
             * 
             * @return
             *     possible object is
             *     {@link PrinterIdentificationType }
             *     
             */
            public PrinterIdentificationType getPrinter() {
                return printer;
            }

            /**
             * Sets the value of the printer property.
             * 
             * @param value
             *     allowed object is
             *     {@link PrinterIdentificationType }
             *     
             */
            public void setPrinter(PrinterIdentificationType value) {
                this.printer = value;
            }

            /**
             * Gets the value of the seatGroup property.
             * 
             * @return
             *     possible object is
             *     {@link SeatEntityType }
             *     
             */
            public SeatEntityType getSeatGroup() {
                return seatGroup;
            }

            /**
             * Sets the value of the seatGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link SeatEntityType }
             *     
             */
            public void setSeatGroup(SeatEntityType value) {
                this.seatGroup = value;
            }

            /**
             * Gets the value of the fareElement property.
             * 
             * @return
             *     possible object is
             *     {@link FareElementsType }
             *     
             */
            public FareElementsType getFareElement() {
                return fareElement;
            }

            /**
             * Sets the value of the fareElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareElementsType }
             *     
             */
            public void setFareElement(FareElementsType value) {
                this.fareElement = value;
            }

            /**
             * Gets the value of the fareDiscount property.
             * 
             * @return
             *     possible object is
             *     {@link FareDiscountElementType }
             *     
             */
            public FareDiscountElementType getFareDiscount() {
                return fareDiscount;
            }

            /**
             * Sets the value of the fareDiscount property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareDiscountElementType }
             *     
             */
            public void setFareDiscount(FareDiscountElementType value) {
                this.fareDiscount = value;
            }

            /**
             * Gets the value of the manualFareDocument property.
             * 
             * @return
             *     possible object is
             *     {@link ManualDocumentRegistrationType }
             *     
             */
            public ManualDocumentRegistrationType getManualFareDocument() {
                return manualFareDocument;
            }

            /**
             * Sets the value of the manualFareDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link ManualDocumentRegistrationType }
             *     
             */
            public void setManualFareDocument(ManualDocumentRegistrationType value) {
                this.manualFareDocument = value;
            }

            /**
             * Gets the value of the commission property.
             * 
             * @return
             *     possible object is
             *     {@link CommissionElementType }
             *     
             */
            public CommissionElementType getCommission() {
                return commission;
            }

            /**
             * Sets the value of the commission property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommissionElementType }
             *     
             */
            public void setCommission(CommissionElementType value) {
                this.commission = value;
            }

            /**
             * Gets the value of the originalIssue property.
             * 
             * @return
             *     possible object is
             *     {@link OriginalIssueType }
             *     
             */
            public OriginalIssueType getOriginalIssue() {
                return originalIssue;
            }

            /**
             * Sets the value of the originalIssue property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginalIssueType }
             *     
             */
            public void setOriginalIssue(OriginalIssueType value) {
                this.originalIssue = value;
            }

            /**
             * Gets the value of the formOfPayment property.
             * 
             * @return
             *     possible object is
             *     {@link FormOfPaymentTypeI }
             *     
             */
            public FormOfPaymentTypeI getFormOfPayment() {
                return formOfPayment;
            }

            /**
             * Sets the value of the formOfPayment property.
             * 
             * @param value
             *     allowed object is
             *     {@link FormOfPaymentTypeI }
             *     
             */
            public void setFormOfPayment(FormOfPaymentTypeI value) {
                this.formOfPayment = value;
            }

            /**
             * Gets the value of the fopExtension property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fopExtension property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFopExtension().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MarketSpecificDataType }
             * 
             * 
             */
            public List<MarketSpecificDataType> getFopExtension() {
                if (fopExtension == null) {
                    fopExtension = new ArrayList<MarketSpecificDataType>();
                }
                return this.fopExtension;
            }

            /**
             * Gets the value of the serviceDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusTypeI }
             * 
             * 
             */
            public List<StatusTypeI> getServiceDetails() {
                if (serviceDetails == null) {
                    serviceDetails = new ArrayList<StatusTypeI>();
                }
                return this.serviceDetails;
            }

            /**
             * Gets the value of the frequentTravellerVerification property.
             * 
             * @return
             *     possible object is
             *     {@link FrequentTravellerVerificationType }
             *     
             */
            public FrequentTravellerVerificationType getFrequentTravellerVerification() {
                return frequentTravellerVerification;
            }

            /**
             * Sets the value of the frequentTravellerVerification property.
             * 
             * @param value
             *     allowed object is
             *     {@link FrequentTravellerVerificationType }
             *     
             */
            public void setFrequentTravellerVerification(FrequentTravellerVerificationType value) {
                this.frequentTravellerVerification = value;
            }

            /**
             * Gets the value of the ticketingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link TicketingCarrierDesignatorType }
             *     
             */
            public TicketingCarrierDesignatorType getTicketingCarrier() {
                return ticketingCarrier;
            }

            /**
             * Sets the value of the ticketingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketingCarrierDesignatorType }
             *     
             */
            public void setTicketingCarrier(TicketingCarrierDesignatorType value) {
                this.ticketingCarrier = value;
            }

            /**
             * Gets the value of the farePrintOverride property.
             * 
             * @return
             *     possible object is
             *     {@link FarePrintOverrideType }
             *     
             */
            public FarePrintOverrideType getFarePrintOverride() {
                return farePrintOverride;
            }

            /**
             * Sets the value of the farePrintOverride property.
             * 
             * @param value
             *     allowed object is
             *     {@link FarePrintOverrideType }
             *     
             */
            public void setFarePrintOverride(FarePrintOverrideType value) {
                this.farePrintOverride = value;
            }

            /**
             * Gets the value of the frequentTravellerData property.
             * 
             * @return
             *     possible object is
             *     {@link FrequentTravellerInformationTypeU }
             *     
             */
            public FrequentTravellerInformationTypeU getFrequentTravellerData() {
                return frequentTravellerData;
            }

            /**
             * Sets the value of the frequentTravellerData property.
             * 
             * @param value
             *     allowed object is
             *     {@link FrequentTravellerInformationTypeU }
             *     
             */
            public void setFrequentTravellerData(FrequentTravellerInformationTypeU value) {
                this.frequentTravellerData = value;
            }

            /**
             * Gets the value of the accessLevel property.
             * 
             * @return
             *     possible object is
             *     {@link ExtendedOwnershipSecurityDetailsType }
             *     
             */
            public ExtendedOwnershipSecurityDetailsType getAccessLevel() {
                return accessLevel;
            }

            /**
             * Sets the value of the accessLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExtendedOwnershipSecurityDetailsType }
             *     
             */
            public void setAccessLevel(ExtendedOwnershipSecurityDetailsType value) {
                this.accessLevel = value;
            }

            /**
             * Gets the value of the referenceForDataElement property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getReferenceForDataElement() {
                return referenceForDataElement;
            }

            /**
             * Sets the value of the referenceForDataElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setReferenceForDataElement(ReferenceInfoType value) {
                this.referenceForDataElement = value;
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
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OriginAndDestinationDetailsTypeI"/&gt;
     *         &lt;element name="itineraryInfo" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ElementManagementSegmentType"/&gt;
     *                   &lt;element name="airAuxItinerary" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TravelProductInformationType"/&gt;
     *                             &lt;element name="messageAction" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MessageActionDetailsTypeI"/&gt;
     *                             &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRADD_17_1_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="selectionDetailsAir" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SelectionDetailsTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="reservationInfoSell" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
     *                             &lt;element name="freetextItinerary" type="{http://xml.amadeus.com/PNRADD_17_1_1A}LongFreeTextType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="referenceForSegment" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReferenceInfoType" minOccurs="0"/&gt;
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
        "originDestination",
        "itineraryInfo"
    })
    public static class OriginDestinationDetails {

        @XmlElement(required = true)
        protected OriginAndDestinationDetailsTypeI originDestination;
        protected List<PNRAddMultiElements.OriginDestinationDetails.ItineraryInfo> itineraryInfo;

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
         * Gets the value of the itineraryInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itineraryInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItineraryInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRAddMultiElements.OriginDestinationDetails.ItineraryInfo }
         * 
         * 
         */
        public List<PNRAddMultiElements.OriginDestinationDetails.ItineraryInfo> getItineraryInfo() {
            if (itineraryInfo == null) {
                itineraryInfo = new ArrayList<PNRAddMultiElements.OriginDestinationDetails.ItineraryInfo>();
            }
            return this.itineraryInfo;
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
         *         &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ElementManagementSegmentType"/&gt;
         *         &lt;element name="airAuxItinerary" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TravelProductInformationType"/&gt;
         *                   &lt;element name="messageAction" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MessageActionDetailsTypeI"/&gt;
         *                   &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRADD_17_1_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="selectionDetailsAir" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SelectionDetailsTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="reservationInfoSell" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
         *                   &lt;element name="freetextItinerary" type="{http://xml.amadeus.com/PNRADD_17_1_1A}LongFreeTextType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="referenceForSegment" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReferenceInfoType" minOccurs="0"/&gt;
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
            "elementManagementItinerary",
            "airAuxItinerary",
            "referenceForSegment"
        })
        public static class ItineraryInfo {

            @XmlElement(required = true)
            protected ElementManagementSegmentType elementManagementItinerary;
            protected PNRAddMultiElements.OriginDestinationDetails.ItineraryInfo.AirAuxItinerary airAuxItinerary;
            protected ReferenceInfoType referenceForSegment;

            /**
             * Gets the value of the elementManagementItinerary property.
             * 
             * @return
             *     possible object is
             *     {@link ElementManagementSegmentType }
             *     
             */
            public ElementManagementSegmentType getElementManagementItinerary() {
                return elementManagementItinerary;
            }

            /**
             * Sets the value of the elementManagementItinerary property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElementManagementSegmentType }
             *     
             */
            public void setElementManagementItinerary(ElementManagementSegmentType value) {
                this.elementManagementItinerary = value;
            }

            /**
             * Gets the value of the airAuxItinerary property.
             * 
             * @return
             *     possible object is
             *     {@link PNRAddMultiElements.OriginDestinationDetails.ItineraryInfo.AirAuxItinerary }
             *     
             */
            public PNRAddMultiElements.OriginDestinationDetails.ItineraryInfo.AirAuxItinerary getAirAuxItinerary() {
                return airAuxItinerary;
            }

            /**
             * Sets the value of the airAuxItinerary property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRAddMultiElements.OriginDestinationDetails.ItineraryInfo.AirAuxItinerary }
             *     
             */
            public void setAirAuxItinerary(PNRAddMultiElements.OriginDestinationDetails.ItineraryInfo.AirAuxItinerary value) {
                this.airAuxItinerary = value;
            }

            /**
             * Gets the value of the referenceForSegment property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getReferenceForSegment() {
                return referenceForSegment;
            }

            /**
             * Sets the value of the referenceForSegment property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setReferenceForSegment(ReferenceInfoType value) {
                this.referenceForSegment = value;
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
             *         &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TravelProductInformationType"/&gt;
             *         &lt;element name="messageAction" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MessageActionDetailsTypeI"/&gt;
             *         &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRADD_17_1_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="selectionDetailsAir" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SelectionDetailsTypeI" minOccurs="0"/&gt;
             *         &lt;element name="reservationInfoSell" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
             *         &lt;element name="freetextItinerary" type="{http://xml.amadeus.com/PNRADD_17_1_1A}LongFreeTextType" minOccurs="0"/&gt;
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
                "travelProduct",
                "messageAction",
                "relatedProduct",
                "selectionDetailsAir",
                "reservationInfoSell",
                "freetextItinerary"
            })
            public static class AirAuxItinerary {

                @XmlElement(required = true)
                protected TravelProductInformationType travelProduct;
                @XmlElement(required = true)
                protected MessageActionDetailsTypeI messageAction;
                protected RelatedProductInformationTypeI relatedProduct;
                protected SelectionDetailsTypeI selectionDetailsAir;
                protected ReservationControlInformationTypeI reservationInfoSell;
                protected LongFreeTextType freetextItinerary;

                /**
                 * Gets the value of the travelProduct property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductInformationType }
                 *     
                 */
                public TravelProductInformationType getTravelProduct() {
                    return travelProduct;
                }

                /**
                 * Sets the value of the travelProduct property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductInformationType }
                 *     
                 */
                public void setTravelProduct(TravelProductInformationType value) {
                    this.travelProduct = value;
                }

                /**
                 * Gets the value of the messageAction property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MessageActionDetailsTypeI }
                 *     
                 */
                public MessageActionDetailsTypeI getMessageAction() {
                    return messageAction;
                }

                /**
                 * Sets the value of the messageAction property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MessageActionDetailsTypeI }
                 *     
                 */
                public void setMessageAction(MessageActionDetailsTypeI value) {
                    this.messageAction = value;
                }

                /**
                 * Gets the value of the relatedProduct property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RelatedProductInformationTypeI }
                 *     
                 */
                public RelatedProductInformationTypeI getRelatedProduct() {
                    return relatedProduct;
                }

                /**
                 * Sets the value of the relatedProduct property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RelatedProductInformationTypeI }
                 *     
                 */
                public void setRelatedProduct(RelatedProductInformationTypeI value) {
                    this.relatedProduct = value;
                }

                /**
                 * Gets the value of the selectionDetailsAir property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SelectionDetailsTypeI }
                 *     
                 */
                public SelectionDetailsTypeI getSelectionDetailsAir() {
                    return selectionDetailsAir;
                }

                /**
                 * Sets the value of the selectionDetailsAir property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SelectionDetailsTypeI }
                 *     
                 */
                public void setSelectionDetailsAir(SelectionDetailsTypeI value) {
                    this.selectionDetailsAir = value;
                }

                /**
                 * Gets the value of the reservationInfoSell property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReservationControlInformationTypeI }
                 *     
                 */
                public ReservationControlInformationTypeI getReservationInfoSell() {
                    return reservationInfoSell;
                }

                /**
                 * Sets the value of the reservationInfoSell property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReservationControlInformationTypeI }
                 *     
                 */
                public void setReservationInfoSell(ReservationControlInformationTypeI value) {
                    this.reservationInfoSell = value;
                }

                /**
                 * Gets the value of the freetextItinerary property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LongFreeTextType }
                 *     
                 */
                public LongFreeTextType getFreetextItinerary() {
                    return freetextItinerary;
                }

                /**
                 * Sets the value of the freetextItinerary property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LongFreeTextType }
                 *     
                 */
                public void setFreetextItinerary(LongFreeTextType value) {
                    this.freetextItinerary = value;
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
     *         &lt;element name="elementManagementPassenger" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ElementManagementSegmentType"/&gt;
     *         &lt;element name="passengerData" maxOccurs="2" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TravellerInformationTypeI"/&gt;
     *                   &lt;element name="dateOfBirth" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeInformationType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="enhancedPassengerData" maxOccurs="2" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="enhancedTravellerInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}EnhancedTravellerInformationType"/&gt;
     *                   &lt;element name="dateOfBirthInEnhancedPaxData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeInformationType" minOccurs="0"/&gt;
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
        "elementManagementPassenger",
        "passengerData",
        "enhancedPassengerData"
    })
    public static class TravellerInfo {

        @XmlElement(required = true)
        protected ElementManagementSegmentType elementManagementPassenger;
        protected List<PNRAddMultiElements.TravellerInfo.PassengerData> passengerData;
        protected List<PNRAddMultiElements.TravellerInfo.EnhancedPassengerData> enhancedPassengerData;

        /**
         * Gets the value of the elementManagementPassenger property.
         * 
         * @return
         *     possible object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public ElementManagementSegmentType getElementManagementPassenger() {
            return elementManagementPassenger;
        }

        /**
         * Sets the value of the elementManagementPassenger property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public void setElementManagementPassenger(ElementManagementSegmentType value) {
            this.elementManagementPassenger = value;
        }

        /**
         * Gets the value of the passengerData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRAddMultiElements.TravellerInfo.PassengerData }
         * 
         * 
         */
        public List<PNRAddMultiElements.TravellerInfo.PassengerData> getPassengerData() {
            if (passengerData == null) {
                passengerData = new ArrayList<PNRAddMultiElements.TravellerInfo.PassengerData>();
            }
            return this.passengerData;
        }

        /**
         * Gets the value of the enhancedPassengerData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enhancedPassengerData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnhancedPassengerData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRAddMultiElements.TravellerInfo.EnhancedPassengerData }
         * 
         * 
         */
        public List<PNRAddMultiElements.TravellerInfo.EnhancedPassengerData> getEnhancedPassengerData() {
            if (enhancedPassengerData == null) {
                enhancedPassengerData = new ArrayList<PNRAddMultiElements.TravellerInfo.EnhancedPassengerData>();
            }
            return this.enhancedPassengerData;
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
         *         &lt;element name="enhancedTravellerInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}EnhancedTravellerInformationType"/&gt;
         *         &lt;element name="dateOfBirthInEnhancedPaxData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeInformationType" minOccurs="0"/&gt;
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
            "enhancedTravellerInformation",
            "dateOfBirthInEnhancedPaxData"
        })
        public static class EnhancedPassengerData {

            @XmlElement(required = true)
            protected EnhancedTravellerInformationType enhancedTravellerInformation;
            protected DateAndTimeInformationType dateOfBirthInEnhancedPaxData;

            /**
             * Gets the value of the enhancedTravellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link EnhancedTravellerInformationType }
             *     
             */
            public EnhancedTravellerInformationType getEnhancedTravellerInformation() {
                return enhancedTravellerInformation;
            }

            /**
             * Sets the value of the enhancedTravellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link EnhancedTravellerInformationType }
             *     
             */
            public void setEnhancedTravellerInformation(EnhancedTravellerInformationType value) {
                this.enhancedTravellerInformation = value;
            }

            /**
             * Gets the value of the dateOfBirthInEnhancedPaxData property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationType }
             *     
             */
            public DateAndTimeInformationType getDateOfBirthInEnhancedPaxData() {
                return dateOfBirthInEnhancedPaxData;
            }

            /**
             * Sets the value of the dateOfBirthInEnhancedPaxData property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationType }
             *     
             */
            public void setDateOfBirthInEnhancedPaxData(DateAndTimeInformationType value) {
                this.dateOfBirthInEnhancedPaxData = value;
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
         *         &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TravellerInformationTypeI"/&gt;
         *         &lt;element name="dateOfBirth" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeInformationType" minOccurs="0"/&gt;
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
            "travellerInformation",
            "dateOfBirth"
        })
        public static class PassengerData {

            @XmlElement(required = true)
            protected TravellerInformationTypeI travellerInformation;
            protected DateAndTimeInformationType dateOfBirth;

            /**
             * Gets the value of the travellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerInformationTypeI }
             *     
             */
            public TravellerInformationTypeI getTravellerInformation() {
                return travellerInformation;
            }

            /**
             * Sets the value of the travellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerInformationTypeI }
             *     
             */
            public void setTravellerInformation(TravellerInformationTypeI value) {
                this.travellerInformation = value;
            }

            /**
             * Gets the value of the dateOfBirth property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationType }
             *     
             */
            public DateAndTimeInformationType getDateOfBirth() {
                return dateOfBirth;
            }

            /**
             * Sets the value of the dateOfBirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationType }
             *     
             */
            public void setDateOfBirth(DateAndTimeInformationType value) {
                this.dateOfBirth = value;
            }

        }

    }

}
