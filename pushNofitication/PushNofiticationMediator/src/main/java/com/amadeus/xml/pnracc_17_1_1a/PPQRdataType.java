
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PQR data
 * 
 * <p>Java class for PPQRdataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PPQRdataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingRecordId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemReferencesAndVersionsType_94069S"/>
 *         &lt;element name="passengerTattoos" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationType_65487S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="ptcDiscountCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DiscountInformationType_94068S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="fareIds" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_79009S" maxOccurs="8" minOccurs="0"/>
 *         &lt;element name="documentDetailsGroup">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="totalFare" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S"/>
 *                   &lt;element name="otherFares" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S" maxOccurs="7" minOccurs="0"/>
 *                   &lt;element name="taxInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxTypeI_79017S" maxOccurs="198" minOccurs="0"/>
 *                   &lt;element name="issueIdentifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingTicketingDetailsTypeI"/>
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI_79034S" minOccurs="0"/>
 *                   &lt;element name="rfics" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType_79011S" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="manualIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI"/>
 *                   &lt;element name="flags" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="generalIndicators" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_79010S" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="fareCalcRemarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="officeInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_79019S"/>
 *                   &lt;element name="negoDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NegoDataType" minOccurs="0"/>
 *                   &lt;element name="creationDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_79014S"/>
 *                   &lt;element name="otherDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_79014S" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="atcFares" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ATCdataType" minOccurs="0"/>
 *                   &lt;element name="airlineServiceFeeGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OBfeesGroupType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="couponDetailsGroup" maxOccurs="28">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="productId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_79009S"/>
 *                             &lt;element name="rfisc" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType_79011S" minOccurs="0"/>
 *                             &lt;element name="feeOwner" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_79020S" minOccurs="0"/>
 *                             &lt;element name="couponValue" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S" minOccurs="0"/>
 *                             &lt;element name="icw" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InConnectionWithType" maxOccurs="4" minOccurs="0"/>
 *                             &lt;element name="couponFlags" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI" maxOccurs="4" minOccurs="0"/>
 *                             &lt;element name="presentToAtAndRemarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_79018S" maxOccurs="3" minOccurs="0"/>
 *                             &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_79024S" minOccurs="0"/>
 *                             &lt;element name="fareQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType_79023S" minOccurs="0"/>
 *                             &lt;element name="validityDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationTypeI_79021S" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="baggageInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExcessBaggageTypeI" minOccurs="0"/>
 *                             &lt;element name="couponTaxDetailsGroup" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="taxTriggerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DutyTaxFeeDetailsType"/>
 *                                       &lt;element name="taxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxType" minOccurs="0"/>
 *                                       &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationType_193831S" minOccurs="0"/>
 *                                       &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fareComponentDetailsGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareComponentDetailsType" maxOccurs="32" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PPQRdataType", propOrder = {
    "pricingRecordId",
    "passengerTattoos",
    "ptcDiscountCode",
    "fareIds",
    "documentDetailsGroup"
})
public class PPQRdataType {

    @XmlElement(required = true)
    protected ItemReferencesAndVersionsType94069S pricingRecordId;
    protected List<ReferenceInformationType65487S> passengerTattoos;
    protected List<DiscountInformationType94068S> ptcDiscountCode;
    protected List<ReferenceInformationTypeI79009S> fareIds;
    @XmlElement(required = true)
    protected PPQRdataType.DocumentDetailsGroup documentDetailsGroup;

    /**
     * Gets the value of the pricingRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersionsType94069S }
     *     
     */
    public ItemReferencesAndVersionsType94069S getPricingRecordId() {
        return pricingRecordId;
    }

    /**
     * Sets the value of the pricingRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersionsType94069S }
     *     
     */
    public void setPricingRecordId(ItemReferencesAndVersionsType94069S value) {
        this.pricingRecordId = value;
    }

    /**
     * Gets the value of the passengerTattoos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTattoos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTattoos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformationType65487S }
     * 
     * 
     */
    public List<ReferenceInformationType65487S> getPassengerTattoos() {
        if (passengerTattoos == null) {
            passengerTattoos = new ArrayList<ReferenceInformationType65487S>();
        }
        return this.passengerTattoos;
    }

    /**
     * Gets the value of the ptcDiscountCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcDiscountCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtcDiscountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountInformationType94068S }
     * 
     * 
     */
    public List<DiscountInformationType94068S> getPtcDiscountCode() {
        if (ptcDiscountCode == null) {
            ptcDiscountCode = new ArrayList<DiscountInformationType94068S>();
        }
        return this.ptcDiscountCode;
    }

    /**
     * Gets the value of the fareIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformationTypeI79009S }
     * 
     * 
     */
    public List<ReferenceInformationTypeI79009S> getFareIds() {
        if (fareIds == null) {
            fareIds = new ArrayList<ReferenceInformationTypeI79009S>();
        }
        return this.fareIds;
    }

    /**
     * Gets the value of the documentDetailsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PPQRdataType.DocumentDetailsGroup }
     *     
     */
    public PPQRdataType.DocumentDetailsGroup getDocumentDetailsGroup() {
        return documentDetailsGroup;
    }

    /**
     * Sets the value of the documentDetailsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PPQRdataType.DocumentDetailsGroup }
     *     
     */
    public void setDocumentDetailsGroup(PPQRdataType.DocumentDetailsGroup value) {
        this.documentDetailsGroup = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="totalFare" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S"/>
     *         &lt;element name="otherFares" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S" maxOccurs="7" minOccurs="0"/>
     *         &lt;element name="taxInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxTypeI_79017S" maxOccurs="198" minOccurs="0"/>
     *         &lt;element name="issueIdentifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingTicketingDetailsTypeI"/>
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI_79034S" minOccurs="0"/>
     *         &lt;element name="rfics" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType_79011S" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="manualIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI"/>
     *         &lt;element name="flags" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="generalIndicators" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_79010S" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="fareCalcRemarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="officeInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_79019S"/>
     *         &lt;element name="negoDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NegoDataType" minOccurs="0"/>
     *         &lt;element name="creationDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_79014S"/>
     *         &lt;element name="otherDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_79014S" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="atcFares" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ATCdataType" minOccurs="0"/>
     *         &lt;element name="airlineServiceFeeGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OBfeesGroupType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="couponDetailsGroup" maxOccurs="28">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="productId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_79009S"/>
     *                   &lt;element name="rfisc" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType_79011S" minOccurs="0"/>
     *                   &lt;element name="feeOwner" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_79020S" minOccurs="0"/>
     *                   &lt;element name="couponValue" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S" minOccurs="0"/>
     *                   &lt;element name="icw" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InConnectionWithType" maxOccurs="4" minOccurs="0"/>
     *                   &lt;element name="couponFlags" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI" maxOccurs="4" minOccurs="0"/>
     *                   &lt;element name="presentToAtAndRemarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_79018S" maxOccurs="3" minOccurs="0"/>
     *                   &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_79024S" minOccurs="0"/>
     *                   &lt;element name="fareQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType_79023S" minOccurs="0"/>
     *                   &lt;element name="validityDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationTypeI_79021S" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="baggageInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExcessBaggageTypeI" minOccurs="0"/>
     *                   &lt;element name="couponTaxDetailsGroup" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="taxTriggerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DutyTaxFeeDetailsType"/>
     *                             &lt;element name="taxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxType" minOccurs="0"/>
     *                             &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationType_193831S" minOccurs="0"/>
     *                             &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fareComponentDetailsGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareComponentDetailsType" maxOccurs="32" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalFare",
        "otherFares",
        "taxInformation",
        "issueIdentifier",
        "originDestination",
        "rfics",
        "manualIndicator",
        "flags",
        "generalIndicators",
        "fareCalcRemarks",
        "officeInformation",
        "negoDetails",
        "creationDate",
        "otherDates",
        "atcFares",
        "airlineServiceFeeGroup",
        "couponDetailsGroup",
        "fareComponentDetailsGroup"
    })
    public static class DocumentDetailsGroup {

        @XmlElement(required = true)
        protected MonetaryInformationTypeI79012S totalFare;
        protected List<MonetaryInformationTypeI79012S> otherFares;
        protected List<TaxTypeI79017S> taxInformation;
        @XmlElement(required = true)
        protected PricingTicketingDetailsTypeI issueIdentifier;
        protected OriginAndDestinationDetailsTypeI79034S originDestination;
        protected List<AttributeType79011S> rfics;
        @XmlElement(required = true)
        protected StatusTypeI manualIndicator;
        protected List<StatusTypeI> flags;
        protected List<CodedAttributeType79010S> generalIndicators;
        protected List<FreeTextInformationType> fareCalcRemarks;
        @XmlElement(required = true)
        protected UserIdentificationType79019S officeInformation;
        protected NegoDataType negoDetails;
        @XmlElement(required = true)
        protected StructuredDateTimeInformationType79014S creationDate;
        protected List<StructuredDateTimeInformationType79014S> otherDates;
        protected ATCdataType atcFares;
        protected List<OBfeesGroupType> airlineServiceFeeGroup;
        @XmlElement(required = true)
        protected List<PPQRdataType.DocumentDetailsGroup.CouponDetailsGroup> couponDetailsGroup;
        protected List<FareComponentDetailsType> fareComponentDetailsGroup;

        /**
         * Gets the value of the totalFare property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationTypeI79012S }
         *     
         */
        public MonetaryInformationTypeI79012S getTotalFare() {
            return totalFare;
        }

        /**
         * Sets the value of the totalFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationTypeI79012S }
         *     
         */
        public void setTotalFare(MonetaryInformationTypeI79012S value) {
            this.totalFare = value;
        }

        /**
         * Gets the value of the otherFares property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherFares property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherFares().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonetaryInformationTypeI79012S }
         * 
         * 
         */
        public List<MonetaryInformationTypeI79012S> getOtherFares() {
            if (otherFares == null) {
                otherFares = new ArrayList<MonetaryInformationTypeI79012S>();
            }
            return this.otherFares;
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
         * {@link TaxTypeI79017S }
         * 
         * 
         */
        public List<TaxTypeI79017S> getTaxInformation() {
            if (taxInformation == null) {
                taxInformation = new ArrayList<TaxTypeI79017S>();
            }
            return this.taxInformation;
        }

        /**
         * Gets the value of the issueIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsTypeI }
         *     
         */
        public PricingTicketingDetailsTypeI getIssueIdentifier() {
            return issueIdentifier;
        }

        /**
         * Sets the value of the issueIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsTypeI }
         *     
         */
        public void setIssueIdentifier(PricingTicketingDetailsTypeI value) {
            this.issueIdentifier = value;
        }

        /**
         * Gets the value of the originDestination property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationDetailsTypeI79034S }
         *     
         */
        public OriginAndDestinationDetailsTypeI79034S getOriginDestination() {
            return originDestination;
        }

        /**
         * Sets the value of the originDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationDetailsTypeI79034S }
         *     
         */
        public void setOriginDestination(OriginAndDestinationDetailsTypeI79034S value) {
            this.originDestination = value;
        }

        /**
         * Gets the value of the rfics property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rfics property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRfics().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType79011S }
         * 
         * 
         */
        public List<AttributeType79011S> getRfics() {
            if (rfics == null) {
                rfics = new ArrayList<AttributeType79011S>();
            }
            return this.rfics;
        }

        /**
         * Gets the value of the manualIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link StatusTypeI }
         *     
         */
        public StatusTypeI getManualIndicator() {
            return manualIndicator;
        }

        /**
         * Sets the value of the manualIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusTypeI }
         *     
         */
        public void setManualIndicator(StatusTypeI value) {
            this.manualIndicator = value;
        }

        /**
         * Gets the value of the flags property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flags property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlags().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatusTypeI }
         * 
         * 
         */
        public List<StatusTypeI> getFlags() {
            if (flags == null) {
                flags = new ArrayList<StatusTypeI>();
            }
            return this.flags;
        }

        /**
         * Gets the value of the generalIndicators property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the generalIndicators property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeneralIndicators().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodedAttributeType79010S }
         * 
         * 
         */
        public List<CodedAttributeType79010S> getGeneralIndicators() {
            if (generalIndicators == null) {
                generalIndicators = new ArrayList<CodedAttributeType79010S>();
            }
            return this.generalIndicators;
        }

        /**
         * Gets the value of the fareCalcRemarks property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareCalcRemarks property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareCalcRemarks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeTextInformationType }
         * 
         * 
         */
        public List<FreeTextInformationType> getFareCalcRemarks() {
            if (fareCalcRemarks == null) {
                fareCalcRemarks = new ArrayList<FreeTextInformationType>();
            }
            return this.fareCalcRemarks;
        }

        /**
         * Gets the value of the officeInformation property.
         * 
         * @return
         *     possible object is
         *     {@link UserIdentificationType79019S }
         *     
         */
        public UserIdentificationType79019S getOfficeInformation() {
            return officeInformation;
        }

        /**
         * Sets the value of the officeInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIdentificationType79019S }
         *     
         */
        public void setOfficeInformation(UserIdentificationType79019S value) {
            this.officeInformation = value;
        }

        /**
         * Gets the value of the negoDetails property.
         * 
         * @return
         *     possible object is
         *     {@link NegoDataType }
         *     
         */
        public NegoDataType getNegoDetails() {
            return negoDetails;
        }

        /**
         * Sets the value of the negoDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link NegoDataType }
         *     
         */
        public void setNegoDetails(NegoDataType value) {
            this.negoDetails = value;
        }

        /**
         * Gets the value of the creationDate property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType79014S }
         *     
         */
        public StructuredDateTimeInformationType79014S getCreationDate() {
            return creationDate;
        }

        /**
         * Sets the value of the creationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType79014S }
         *     
         */
        public void setCreationDate(StructuredDateTimeInformationType79014S value) {
            this.creationDate = value;
        }

        /**
         * Gets the value of the otherDates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherDates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherDates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType79014S }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType79014S> getOtherDates() {
            if (otherDates == null) {
                otherDates = new ArrayList<StructuredDateTimeInformationType79014S>();
            }
            return this.otherDates;
        }

        /**
         * Gets the value of the atcFares property.
         * 
         * @return
         *     possible object is
         *     {@link ATCdataType }
         *     
         */
        public ATCdataType getAtcFares() {
            return atcFares;
        }

        /**
         * Sets the value of the atcFares property.
         * 
         * @param value
         *     allowed object is
         *     {@link ATCdataType }
         *     
         */
        public void setAtcFares(ATCdataType value) {
            this.atcFares = value;
        }

        /**
         * Gets the value of the airlineServiceFeeGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineServiceFeeGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineServiceFeeGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OBfeesGroupType }
         * 
         * 
         */
        public List<OBfeesGroupType> getAirlineServiceFeeGroup() {
            if (airlineServiceFeeGroup == null) {
                airlineServiceFeeGroup = new ArrayList<OBfeesGroupType>();
            }
            return this.airlineServiceFeeGroup;
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
         * {@link PPQRdataType.DocumentDetailsGroup.CouponDetailsGroup }
         * 
         * 
         */
        public List<PPQRdataType.DocumentDetailsGroup.CouponDetailsGroup> getCouponDetailsGroup() {
            if (couponDetailsGroup == null) {
                couponDetailsGroup = new ArrayList<PPQRdataType.DocumentDetailsGroup.CouponDetailsGroup>();
            }
            return this.couponDetailsGroup;
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
         * {@link FareComponentDetailsType }
         * 
         * 
         */
        public List<FareComponentDetailsType> getFareComponentDetailsGroup() {
            if (fareComponentDetailsGroup == null) {
                fareComponentDetailsGroup = new ArrayList<FareComponentDetailsType>();
            }
            return this.fareComponentDetailsGroup;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="productId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_79009S"/>
         *         &lt;element name="rfisc" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType_79011S" minOccurs="0"/>
         *         &lt;element name="feeOwner" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_79020S" minOccurs="0"/>
         *         &lt;element name="couponValue" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S" minOccurs="0"/>
         *         &lt;element name="icw" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InConnectionWithType" maxOccurs="4" minOccurs="0"/>
         *         &lt;element name="couponFlags" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI" maxOccurs="4" minOccurs="0"/>
         *         &lt;element name="presentToAtAndRemarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_79018S" maxOccurs="3" minOccurs="0"/>
         *         &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_79024S" minOccurs="0"/>
         *         &lt;element name="fareQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType_79023S" minOccurs="0"/>
         *         &lt;element name="validityDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationTypeI_79021S" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="baggageInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExcessBaggageTypeI" minOccurs="0"/>
         *         &lt;element name="couponTaxDetailsGroup" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="taxTriggerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DutyTaxFeeDetailsType"/>
         *                   &lt;element name="taxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxType" minOccurs="0"/>
         *                   &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationType_193831S" minOccurs="0"/>
         *                   &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "productId",
            "rfisc",
            "feeOwner",
            "couponValue",
            "icw",
            "couponFlags",
            "presentToAtAndRemarks",
            "flightConnectionType",
            "fareQualifier",
            "validityDates",
            "baggageInformation",
            "couponTaxDetailsGroup"
        })
        public static class CouponDetailsGroup {

            @XmlElement(required = true)
            protected ReferenceInformationTypeI79009S productId;
            protected AttributeType79011S rfisc;
            protected CompanyInformationType79020S feeOwner;
            protected MonetaryInformationTypeI79012S couponValue;
            protected List<InConnectionWithType> icw;
            protected List<StatusTypeI> couponFlags;
            protected List<FreeTextInformationType79018S> presentToAtAndRemarks;
            protected TravelProductInformationTypeI79024S flightConnectionType;
            protected PricingOrTicketingSubsequentType79023S fareQualifier;
            protected List<DateAndTimeInformationTypeI79021S> validityDates;
            protected ExcessBaggageTypeI baggageInformation;
            protected List<PPQRdataType.DocumentDetailsGroup.CouponDetailsGroup.CouponTaxDetailsGroup> couponTaxDetailsGroup;

            /**
             * Gets the value of the productId property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInformationTypeI79009S }
             *     
             */
            public ReferenceInformationTypeI79009S getProductId() {
                return productId;
            }

            /**
             * Sets the value of the productId property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInformationTypeI79009S }
             *     
             */
            public void setProductId(ReferenceInformationTypeI79009S value) {
                this.productId = value;
            }

            /**
             * Gets the value of the rfisc property.
             * 
             * @return
             *     possible object is
             *     {@link AttributeType79011S }
             *     
             */
            public AttributeType79011S getRfisc() {
                return rfisc;
            }

            /**
             * Sets the value of the rfisc property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttributeType79011S }
             *     
             */
            public void setRfisc(AttributeType79011S value) {
                this.rfisc = value;
            }

            /**
             * Gets the value of the feeOwner property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyInformationType79020S }
             *     
             */
            public CompanyInformationType79020S getFeeOwner() {
                return feeOwner;
            }

            /**
             * Sets the value of the feeOwner property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyInformationType79020S }
             *     
             */
            public void setFeeOwner(CompanyInformationType79020S value) {
                this.feeOwner = value;
            }

            /**
             * Gets the value of the couponValue property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI79012S }
             *     
             */
            public MonetaryInformationTypeI79012S getCouponValue() {
                return couponValue;
            }

            /**
             * Sets the value of the couponValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI79012S }
             *     
             */
            public void setCouponValue(MonetaryInformationTypeI79012S value) {
                this.couponValue = value;
            }

            /**
             * Gets the value of the icw property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the icw property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIcw().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InConnectionWithType }
             * 
             * 
             */
            public List<InConnectionWithType> getIcw() {
                if (icw == null) {
                    icw = new ArrayList<InConnectionWithType>();
                }
                return this.icw;
            }

            /**
             * Gets the value of the couponFlags property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponFlags property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponFlags().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusTypeI }
             * 
             * 
             */
            public List<StatusTypeI> getCouponFlags() {
                if (couponFlags == null) {
                    couponFlags = new ArrayList<StatusTypeI>();
                }
                return this.couponFlags;
            }

            /**
             * Gets the value of the presentToAtAndRemarks property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the presentToAtAndRemarks property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPresentToAtAndRemarks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FreeTextInformationType79018S }
             * 
             * 
             */
            public List<FreeTextInformationType79018S> getPresentToAtAndRemarks() {
                if (presentToAtAndRemarks == null) {
                    presentToAtAndRemarks = new ArrayList<FreeTextInformationType79018S>();
                }
                return this.presentToAtAndRemarks;
            }

            /**
             * Gets the value of the flightConnectionType property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI79024S }
             *     
             */
            public TravelProductInformationTypeI79024S getFlightConnectionType() {
                return flightConnectionType;
            }

            /**
             * Sets the value of the flightConnectionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI79024S }
             *     
             */
            public void setFlightConnectionType(TravelProductInformationTypeI79024S value) {
                this.flightConnectionType = value;
            }

            /**
             * Gets the value of the fareQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link PricingOrTicketingSubsequentType79023S }
             *     
             */
            public PricingOrTicketingSubsequentType79023S getFareQualifier() {
                return fareQualifier;
            }

            /**
             * Sets the value of the fareQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingOrTicketingSubsequentType79023S }
             *     
             */
            public void setFareQualifier(PricingOrTicketingSubsequentType79023S value) {
                this.fareQualifier = value;
            }

            /**
             * Gets the value of the validityDates property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the validityDates property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getValidityDates().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DateAndTimeInformationTypeI79021S }
             * 
             * 
             */
            public List<DateAndTimeInformationTypeI79021S> getValidityDates() {
                if (validityDates == null) {
                    validityDates = new ArrayList<DateAndTimeInformationTypeI79021S>();
                }
                return this.validityDates;
            }

            /**
             * Gets the value of the baggageInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ExcessBaggageTypeI }
             *     
             */
            public ExcessBaggageTypeI getBaggageInformation() {
                return baggageInformation;
            }

            /**
             * Sets the value of the baggageInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExcessBaggageTypeI }
             *     
             */
            public void setBaggageInformation(ExcessBaggageTypeI value) {
                this.baggageInformation = value;
            }

            /**
             * Gets the value of the couponTaxDetailsGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponTaxDetailsGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponTaxDetailsGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PPQRdataType.DocumentDetailsGroup.CouponDetailsGroup.CouponTaxDetailsGroup }
             * 
             * 
             */
            public List<PPQRdataType.DocumentDetailsGroup.CouponDetailsGroup.CouponTaxDetailsGroup> getCouponTaxDetailsGroup() {
                if (couponTaxDetailsGroup == null) {
                    couponTaxDetailsGroup = new ArrayList<PPQRdataType.DocumentDetailsGroup.CouponDetailsGroup.CouponTaxDetailsGroup>();
                }
                return this.couponTaxDetailsGroup;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="taxTriggerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DutyTaxFeeDetailsType"/>
             *         &lt;element name="taxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxType" minOccurs="0"/>
             *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationType_193831S" minOccurs="0"/>
             *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "taxTriggerInfo",
                "taxDetails",
                "monetaryInfo",
                "locationInfo"
            })
            public static class CouponTaxDetailsGroup {

                @XmlElement(required = true)
                protected DutyTaxFeeDetailsType taxTriggerInfo;
                protected TaxType taxDetails;
                protected MonetaryInformationType193831S monetaryInfo;
                protected PlaceLocationIdentificationType locationInfo;

                /**
                 * Gets the value of the taxTriggerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DutyTaxFeeDetailsType }
                 *     
                 */
                public DutyTaxFeeDetailsType getTaxTriggerInfo() {
                    return taxTriggerInfo;
                }

                /**
                 * Sets the value of the taxTriggerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DutyTaxFeeDetailsType }
                 *     
                 */
                public void setTaxTriggerInfo(DutyTaxFeeDetailsType value) {
                    this.taxTriggerInfo = value;
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

                /**
                 * Gets the value of the monetaryInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType193831S }
                 *     
                 */
                public MonetaryInformationType193831S getMonetaryInfo() {
                    return monetaryInfo;
                }

                /**
                 * Sets the value of the monetaryInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType193831S }
                 *     
                 */
                public void setMonetaryInfo(MonetaryInformationType193831S value) {
                    this.monetaryInfo = value;
                }

                /**
                 * Gets the value of the locationInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PlaceLocationIdentificationType }
                 *     
                 */
                public PlaceLocationIdentificationType getLocationInfo() {
                    return locationInfo;
                }

                /**
                 * Sets the value of the locationInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PlaceLocationIdentificationType }
                 *     
                 */
                public void setLocationInfo(PlaceLocationIdentificationType value) {
                    this.locationInfo = value;
                }

            }

        }

    }

}
