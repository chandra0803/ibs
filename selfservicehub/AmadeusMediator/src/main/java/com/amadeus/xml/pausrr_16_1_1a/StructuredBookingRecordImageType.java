
package com.amadeus.xml.pausrr_16_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Maps the structure of a SBR
 * 
 * <p>Java class for StructuredBookingRecordImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredBookingRecordImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amadeusId" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ReservationControlInformationTypeI"/&gt;
 *         &lt;element name="pnrHeader" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="technicalData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}PnrTechnicalDataType"/&gt;
 *                   &lt;element name="reservationInfo" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ReservationControlInformationTypeI_72884S" maxOccurs="10"/&gt;
 *                   &lt;element name="securityInformation" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ReservationSecurityInformationType" maxOccurs="2"/&gt;
 *                   &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}RelatedProductInformationTypeI"/&gt;
 *                   &lt;element name="creditLine" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CreditLineInformationType"/&gt;
 *                   &lt;element name="tagLine" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}LongFreeTextType" minOccurs="0"/&gt;
 *                   &lt;element name="sbrAttributes" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodedAttributeType" minOccurs="0"/&gt;
 *                   &lt;element name="sbrPosDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}POSGroupType" maxOccurs="3" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="travellerInfo" maxOccurs="200" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="elementManagementPassenger" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ElementManagementSegmentType"/&gt;
 *                   &lt;element name="referenceForPassenger" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ReferenceInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="enhancedPassengerData" maxOccurs="2" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="enhancedTravellerInformation" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}EnhancedTravellerInformationType"/&gt;
 *                             &lt;element name="groupCountersInEnhancedPaxData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}NumberOfUnitsType_91398S" minOccurs="0"/&gt;
 *                             &lt;element name="dateOfBirthInEnhancedPaxData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
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
 *         &lt;element name="originDestinationDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}OriginAndDestinationDetailsTypeI"/&gt;
 *                   &lt;element name="itineraryInfo" maxOccurs="198" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ElementManagementSegmentType"/&gt;
 *                             &lt;element name="travelProduct" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TravelProductInformationType"/&gt;
 *                             &lt;element name="messageAction" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MessageActionDetailsTypeI"/&gt;
 *                             &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}RelatedProductInformationTypeI_4795S" minOccurs="0"/&gt;
 *                             &lt;element name="codeSharePartnerInfo" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="codeSharePartner" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TravelProductInformationType_25889S"/&gt;
 *                                       &lt;element name="codeShareDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodeShareDetailsType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="insuranceInfo" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="providerProductDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}InsuranceProductDetailsType"/&gt;
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
 *         &lt;element name="pricingRecordGroup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pricingRecordData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}PricingTicketingDetailsType"/&gt;
 *                   &lt;element name="miscellaneousDocDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MiscDocumentType" maxOccurs="127" minOccurs="0"/&gt;
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
@XmlType(name = "StructuredBookingRecordImageType", propOrder = {
    "amadeusId",
    "pnrHeader",
    "travellerInfo",
    "originDestinationDetails",
    "pricingRecordGroup"
})
public class StructuredBookingRecordImageType {

    @XmlElement(required = true)
    protected ReservationControlInformationTypeI amadeusId;
    protected StructuredBookingRecordImageType.PnrHeader pnrHeader;
    protected List<StructuredBookingRecordImageType.TravellerInfo> travellerInfo;
    protected StructuredBookingRecordImageType.OriginDestinationDetails originDestinationDetails;
    protected StructuredBookingRecordImageType.PricingRecordGroup pricingRecordGroup;

    /**
     * Gets the value of the amadeusId property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getAmadeusId() {
        return amadeusId;
    }

    /**
     * Sets the value of the amadeusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setAmadeusId(ReservationControlInformationTypeI value) {
        this.amadeusId = value;
    }

    /**
     * Gets the value of the pnrHeader property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredBookingRecordImageType.PnrHeader }
     *     
     */
    public StructuredBookingRecordImageType.PnrHeader getPnrHeader() {
        return pnrHeader;
    }

    /**
     * Sets the value of the pnrHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredBookingRecordImageType.PnrHeader }
     *     
     */
    public void setPnrHeader(StructuredBookingRecordImageType.PnrHeader value) {
        this.pnrHeader = value;
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
     * {@link StructuredBookingRecordImageType.TravellerInfo }
     * 
     * 
     */
    public List<StructuredBookingRecordImageType.TravellerInfo> getTravellerInfo() {
        if (travellerInfo == null) {
            travellerInfo = new ArrayList<StructuredBookingRecordImageType.TravellerInfo>();
        }
        return this.travellerInfo;
    }

    /**
     * Gets the value of the originDestinationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredBookingRecordImageType.OriginDestinationDetails }
     *     
     */
    public StructuredBookingRecordImageType.OriginDestinationDetails getOriginDestinationDetails() {
        return originDestinationDetails;
    }

    /**
     * Sets the value of the originDestinationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredBookingRecordImageType.OriginDestinationDetails }
     *     
     */
    public void setOriginDestinationDetails(StructuredBookingRecordImageType.OriginDestinationDetails value) {
        this.originDestinationDetails = value;
    }

    /**
     * Gets the value of the pricingRecordGroup property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredBookingRecordImageType.PricingRecordGroup }
     *     
     */
    public StructuredBookingRecordImageType.PricingRecordGroup getPricingRecordGroup() {
        return pricingRecordGroup;
    }

    /**
     * Sets the value of the pricingRecordGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredBookingRecordImageType.PricingRecordGroup }
     *     
     */
    public void setPricingRecordGroup(StructuredBookingRecordImageType.PricingRecordGroup value) {
        this.pricingRecordGroup = value;
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
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}OriginAndDestinationDetailsTypeI"/&gt;
     *         &lt;element name="itineraryInfo" maxOccurs="198" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ElementManagementSegmentType"/&gt;
     *                   &lt;element name="travelProduct" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TravelProductInformationType"/&gt;
     *                   &lt;element name="messageAction" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MessageActionDetailsTypeI"/&gt;
     *                   &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}RelatedProductInformationTypeI_4795S" minOccurs="0"/&gt;
     *                   &lt;element name="codeSharePartnerInfo" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="codeSharePartner" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TravelProductInformationType_25889S"/&gt;
     *                             &lt;element name="codeShareDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodeShareDetailsType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="insuranceInfo" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="providerProductDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}InsuranceProductDetailsType"/&gt;
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
        "originDestination",
        "itineraryInfo"
    })
    public static class OriginDestinationDetails {

        @XmlElement(required = true)
        protected OriginAndDestinationDetailsTypeI originDestination;
        protected List<StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo> itineraryInfo;

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
         * {@link StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo }
         * 
         * 
         */
        public List<StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo> getItineraryInfo() {
            if (itineraryInfo == null) {
                itineraryInfo = new ArrayList<StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo>();
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
         *         &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ElementManagementSegmentType"/&gt;
         *         &lt;element name="travelProduct" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TravelProductInformationType"/&gt;
         *         &lt;element name="messageAction" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MessageActionDetailsTypeI"/&gt;
         *         &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}RelatedProductInformationTypeI_4795S" minOccurs="0"/&gt;
         *         &lt;element name="codeSharePartnerInfo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="codeSharePartner" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TravelProductInformationType_25889S"/&gt;
         *                   &lt;element name="codeShareDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodeShareDetailsType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="insuranceInfo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="providerProductDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}InsuranceProductDetailsType"/&gt;
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
            "elementManagementItinerary",
            "travelProduct",
            "messageAction",
            "relatedProduct",
            "codeSharePartnerInfo",
            "insuranceInfo"
        })
        public static class ItineraryInfo {

            @XmlElement(required = true)
            protected ElementManagementSegmentType elementManagementItinerary;
            @XmlElement(required = true)
            protected TravelProductInformationType travelProduct;
            @XmlElement(required = true)
            protected MessageActionDetailsTypeI messageAction;
            protected RelatedProductInformationTypeI4795S relatedProduct;
            protected StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.CodeSharePartnerInfo codeSharePartnerInfo;
            protected StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.InsuranceInfo insuranceInfo;

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
             *     {@link RelatedProductInformationTypeI4795S }
             *     
             */
            public RelatedProductInformationTypeI4795S getRelatedProduct() {
                return relatedProduct;
            }

            /**
             * Sets the value of the relatedProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link RelatedProductInformationTypeI4795S }
             *     
             */
            public void setRelatedProduct(RelatedProductInformationTypeI4795S value) {
                this.relatedProduct = value;
            }

            /**
             * Gets the value of the codeSharePartnerInfo property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.CodeSharePartnerInfo }
             *     
             */
            public StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.CodeSharePartnerInfo getCodeSharePartnerInfo() {
                return codeSharePartnerInfo;
            }

            /**
             * Sets the value of the codeSharePartnerInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.CodeSharePartnerInfo }
             *     
             */
            public void setCodeSharePartnerInfo(StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.CodeSharePartnerInfo value) {
                this.codeSharePartnerInfo = value;
            }

            /**
             * Gets the value of the insuranceInfo property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.InsuranceInfo }
             *     
             */
            public StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.InsuranceInfo getInsuranceInfo() {
                return insuranceInfo;
            }

            /**
             * Sets the value of the insuranceInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.InsuranceInfo }
             *     
             */
            public void setInsuranceInfo(StructuredBookingRecordImageType.OriginDestinationDetails.ItineraryInfo.InsuranceInfo value) {
                this.insuranceInfo = value;
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
             *         &lt;element name="codeSharePartner" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TravelProductInformationType_25889S"/&gt;
             *         &lt;element name="codeShareDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodeShareDetailsType" minOccurs="0"/&gt;
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
                "codeSharePartner",
                "codeShareDetails"
            })
            public static class CodeSharePartnerInfo {

                @XmlElement(required = true)
                protected TravelProductInformationType25889S codeSharePartner;
                protected CodeShareDetailsType codeShareDetails;

                /**
                 * Gets the value of the codeSharePartner property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductInformationType25889S }
                 *     
                 */
                public TravelProductInformationType25889S getCodeSharePartner() {
                    return codeSharePartner;
                }

                /**
                 * Sets the value of the codeSharePartner property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductInformationType25889S }
                 *     
                 */
                public void setCodeSharePartner(TravelProductInformationType25889S value) {
                    this.codeSharePartner = value;
                }

                /**
                 * Gets the value of the codeShareDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CodeShareDetailsType }
                 *     
                 */
                public CodeShareDetailsType getCodeShareDetails() {
                    return codeShareDetails;
                }

                /**
                 * Sets the value of the codeShareDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CodeShareDetailsType }
                 *     
                 */
                public void setCodeShareDetails(CodeShareDetailsType value) {
                    this.codeShareDetails = value;
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
             *         &lt;element name="providerProductDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}InsuranceProductDetailsType"/&gt;
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
                "providerProductDetails"
            })
            public static class InsuranceInfo {

                @XmlElement(required = true)
                protected InsuranceProductDetailsType providerProductDetails;

                /**
                 * Gets the value of the providerProductDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InsuranceProductDetailsType }
                 *     
                 */
                public InsuranceProductDetailsType getProviderProductDetails() {
                    return providerProductDetails;
                }

                /**
                 * Sets the value of the providerProductDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InsuranceProductDetailsType }
                 *     
                 */
                public void setProviderProductDetails(InsuranceProductDetailsType value) {
                    this.providerProductDetails = value;
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
     *         &lt;element name="technicalData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}PnrTechnicalDataType"/&gt;
     *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ReservationControlInformationTypeI_72884S" maxOccurs="10"/&gt;
     *         &lt;element name="securityInformation" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ReservationSecurityInformationType" maxOccurs="2"/&gt;
     *         &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}RelatedProductInformationTypeI"/&gt;
     *         &lt;element name="creditLine" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CreditLineInformationType"/&gt;
     *         &lt;element name="tagLine" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}LongFreeTextType" minOccurs="0"/&gt;
     *         &lt;element name="sbrAttributes" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodedAttributeType" minOccurs="0"/&gt;
     *         &lt;element name="sbrPosDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}POSGroupType" maxOccurs="3" minOccurs="0"/&gt;
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
        "technicalData",
        "reservationInfo",
        "securityInformation",
        "relatedProduct",
        "creditLine",
        "tagLine",
        "sbrAttributes",
        "sbrPosDetails"
    })
    public static class PnrHeader {

        @XmlElement(required = true)
        protected PnrTechnicalDataType technicalData;
        @XmlElement(required = true)
        protected List<ReservationControlInformationTypeI72884S> reservationInfo;
        @XmlElement(required = true)
        protected List<ReservationSecurityInformationType> securityInformation;
        @XmlElement(required = true)
        protected RelatedProductInformationTypeI relatedProduct;
        @XmlElement(required = true)
        protected CreditLineInformationType creditLine;
        protected LongFreeTextType tagLine;
        protected CodedAttributeType sbrAttributes;
        protected List<POSGroupType> sbrPosDetails;

        /**
         * Gets the value of the technicalData property.
         * 
         * @return
         *     possible object is
         *     {@link PnrTechnicalDataType }
         *     
         */
        public PnrTechnicalDataType getTechnicalData() {
            return technicalData;
        }

        /**
         * Sets the value of the technicalData property.
         * 
         * @param value
         *     allowed object is
         *     {@link PnrTechnicalDataType }
         *     
         */
        public void setTechnicalData(PnrTechnicalDataType value) {
            this.technicalData = value;
        }

        /**
         * Gets the value of the reservationInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reservationInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReservationInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReservationControlInformationTypeI72884S }
         * 
         * 
         */
        public List<ReservationControlInformationTypeI72884S> getReservationInfo() {
            if (reservationInfo == null) {
                reservationInfo = new ArrayList<ReservationControlInformationTypeI72884S>();
            }
            return this.reservationInfo;
        }

        /**
         * Gets the value of the securityInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the securityInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSecurityInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReservationSecurityInformationType }
         * 
         * 
         */
        public List<ReservationSecurityInformationType> getSecurityInformation() {
            if (securityInformation == null) {
                securityInformation = new ArrayList<ReservationSecurityInformationType>();
            }
            return this.securityInformation;
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
         * Gets the value of the creditLine property.
         * 
         * @return
         *     possible object is
         *     {@link CreditLineInformationType }
         *     
         */
        public CreditLineInformationType getCreditLine() {
            return creditLine;
        }

        /**
         * Sets the value of the creditLine property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreditLineInformationType }
         *     
         */
        public void setCreditLine(CreditLineInformationType value) {
            this.creditLine = value;
        }

        /**
         * Gets the value of the tagLine property.
         * 
         * @return
         *     possible object is
         *     {@link LongFreeTextType }
         *     
         */
        public LongFreeTextType getTagLine() {
            return tagLine;
        }

        /**
         * Sets the value of the tagLine property.
         * 
         * @param value
         *     allowed object is
         *     {@link LongFreeTextType }
         *     
         */
        public void setTagLine(LongFreeTextType value) {
            this.tagLine = value;
        }

        /**
         * Gets the value of the sbrAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType }
         *     
         */
        public CodedAttributeType getSbrAttributes() {
            return sbrAttributes;
        }

        /**
         * Sets the value of the sbrAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType }
         *     
         */
        public void setSbrAttributes(CodedAttributeType value) {
            this.sbrAttributes = value;
        }

        /**
         * Gets the value of the sbrPosDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sbrPosDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSbrPosDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link POSGroupType }
         * 
         * 
         */
        public List<POSGroupType> getSbrPosDetails() {
            if (sbrPosDetails == null) {
                sbrPosDetails = new ArrayList<POSGroupType>();
            }
            return this.sbrPosDetails;
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
     *         &lt;element name="pricingRecordData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}PricingTicketingDetailsType"/&gt;
     *         &lt;element name="miscellaneousDocDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MiscDocumentType" maxOccurs="127" minOccurs="0"/&gt;
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
        "pricingRecordData",
        "miscellaneousDocDetails"
    })
    public static class PricingRecordGroup {

        @XmlElement(required = true)
        protected PricingTicketingDetailsType pricingRecordData;
        protected List<MiscDocumentType> miscellaneousDocDetails;

        /**
         * Gets the value of the pricingRecordData property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public PricingTicketingDetailsType getPricingRecordData() {
            return pricingRecordData;
        }

        /**
         * Sets the value of the pricingRecordData property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public void setPricingRecordData(PricingTicketingDetailsType value) {
            this.pricingRecordData = value;
        }

        /**
         * Gets the value of the miscellaneousDocDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the miscellaneousDocDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMiscellaneousDocDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiscDocumentType }
         * 
         * 
         */
        public List<MiscDocumentType> getMiscellaneousDocDetails() {
            if (miscellaneousDocDetails == null) {
                miscellaneousDocDetails = new ArrayList<MiscDocumentType>();
            }
            return this.miscellaneousDocDetails;
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
     *         &lt;element name="elementManagementPassenger" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ElementManagementSegmentType"/&gt;
     *         &lt;element name="referenceForPassenger" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ReferenceInfoType" minOccurs="0"/&gt;
     *         &lt;element name="enhancedPassengerData" maxOccurs="2" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="enhancedTravellerInformation" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}EnhancedTravellerInformationType"/&gt;
     *                   &lt;element name="groupCountersInEnhancedPaxData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}NumberOfUnitsType_91398S" minOccurs="0"/&gt;
     *                   &lt;element name="dateOfBirthInEnhancedPaxData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
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
        "referenceForPassenger",
        "enhancedPassengerData"
    })
    public static class TravellerInfo {

        @XmlElement(required = true)
        protected ElementManagementSegmentType elementManagementPassenger;
        protected ReferenceInfoType referenceForPassenger;
        protected List<StructuredBookingRecordImageType.TravellerInfo.EnhancedPassengerData> enhancedPassengerData;

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
         * Gets the value of the referenceForPassenger property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType }
         *     
         */
        public ReferenceInfoType getReferenceForPassenger() {
            return referenceForPassenger;
        }

        /**
         * Sets the value of the referenceForPassenger property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType }
         *     
         */
        public void setReferenceForPassenger(ReferenceInfoType value) {
            this.referenceForPassenger = value;
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
         * {@link StructuredBookingRecordImageType.TravellerInfo.EnhancedPassengerData }
         * 
         * 
         */
        public List<StructuredBookingRecordImageType.TravellerInfo.EnhancedPassengerData> getEnhancedPassengerData() {
            if (enhancedPassengerData == null) {
                enhancedPassengerData = new ArrayList<StructuredBookingRecordImageType.TravellerInfo.EnhancedPassengerData>();
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
         *         &lt;element name="enhancedTravellerInformation" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}EnhancedTravellerInformationType"/&gt;
         *         &lt;element name="groupCountersInEnhancedPaxData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}NumberOfUnitsType_91398S" minOccurs="0"/&gt;
         *         &lt;element name="dateOfBirthInEnhancedPaxData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}DateAndTimeInformationTypeI" minOccurs="0"/&gt;
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
            "groupCountersInEnhancedPaxData",
            "dateOfBirthInEnhancedPaxData"
        })
        public static class EnhancedPassengerData {

            @XmlElement(required = true)
            protected EnhancedTravellerInformationType enhancedTravellerInformation;
            protected NumberOfUnitsType91398S groupCountersInEnhancedPaxData;
            protected DateAndTimeInformationTypeI dateOfBirthInEnhancedPaxData;

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
             * Gets the value of the groupCountersInEnhancedPaxData property.
             * 
             * @return
             *     possible object is
             *     {@link NumberOfUnitsType91398S }
             *     
             */
            public NumberOfUnitsType91398S getGroupCountersInEnhancedPaxData() {
                return groupCountersInEnhancedPaxData;
            }

            /**
             * Sets the value of the groupCountersInEnhancedPaxData property.
             * 
             * @param value
             *     allowed object is
             *     {@link NumberOfUnitsType91398S }
             *     
             */
            public void setGroupCountersInEnhancedPaxData(NumberOfUnitsType91398S value) {
                this.groupCountersInEnhancedPaxData = value;
            }

            /**
             * Gets the value of the dateOfBirthInEnhancedPaxData property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationTypeI }
             *     
             */
            public DateAndTimeInformationTypeI getDateOfBirthInEnhancedPaxData() {
                return dateOfBirthInEnhancedPaxData;
            }

            /**
             * Sets the value of the dateOfBirthInEnhancedPaxData property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationTypeI }
             *     
             */
            public void setDateOfBirthInEnhancedPaxData(DateAndTimeInformationTypeI value) {
                this.dateOfBirthInEnhancedPaxData = value;
            }

        }

    }

}
