
package com.amadeus.xml.pausrr_16_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey miscDocument structured group
 * 
 * <p>Java class for MiscDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commonMd" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MiscellaneousDocumentType"/&gt;
 *         &lt;element name="elemTattoo" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ReferenceInformationTypeI"/&gt;
 *         &lt;element name="userInfo" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}UserIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="elementDescription" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodedAttributeType_70481S" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="mdInfo" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StructuredDateTimeInformationType_70487S" minOccurs="0"/&gt;
 *         &lt;element name="validatingCarrier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="issuancePlace" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}OriginAndDestinationDetailsTypeI_70484S" minOccurs="0"/&gt;
 *         &lt;element name="mdFares" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="mdTaxes" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TaxTypeI" maxOccurs="60" minOccurs="0"/&gt;
 *         &lt;element name="mcoDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mco" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MiscellaneousChargeOrderType"/&gt;
 *                   &lt;element name="passengers" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}SpecificTravellerTypeI" maxOccurs="60" minOccurs="0"/&gt;
 *                   &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TicketNumberTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="sizeIndicator" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StatusTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="mcoData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodedAttributeType_70481S" maxOccurs="3" minOccurs="0"/&gt;
 *                   &lt;element name="bankerRate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ConversionRateTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="mcoFares" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="mcoTax" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TaxTypeI" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="svcDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="svcType" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ServiceChargeInformationType"/&gt;
 *                   &lt;element name="passengers" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}SpecificTravellerTypeI" maxOccurs="60" minOccurs="0"/&gt;
 *                   &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TicketNumberTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="sizeIndicator" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StatusTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="mcoData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodedAttributeType_70481S" maxOccurs="3" minOccurs="0"/&gt;
 *                   &lt;element name="bankerRate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ConversionRateTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="mcoFares" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="mcoTax" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TaxTypeI" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="xsbDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="xsb" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ExcessBaggageType"/&gt;
 *                   &lt;element name="xsbWeight" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TicketNumberTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="xsbRate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="globalIndicator" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StatusTypeI" minOccurs="0"/&gt;
 *                   &lt;element name="pricingRouting" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="pricingCities" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}OriginAndDestinationDetailsTypeI_70484S"/&gt;
 *                             &lt;element name="pricingCarrier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="routingDetails" maxOccurs="16" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="connectionPoint" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ConnectionTypeI"/&gt;
 *                             &lt;element name="routingCities" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}OriginAndDestinationDetailsTypeI_70484S"/&gt;
 *                             &lt;element name="routingCarrier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
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
@XmlType(name = "MiscDocumentType", propOrder = {
    "commonMd",
    "elemTattoo",
    "userInfo",
    "elementDescription",
    "mdInfo",
    "creationDate",
    "validatingCarrier",
    "issuancePlace",
    "mdFares",
    "mdTaxes",
    "mcoDetails",
    "svcDetails",
    "xsbDetails"
})
public class MiscDocumentType {

    @XmlElement(required = true)
    protected MiscellaneousDocumentType commonMd;
    @XmlElement(required = true)
    protected ReferenceInformationTypeI elemTattoo;
    protected UserIdentificationType userInfo;
    protected List<CodedAttributeType70481S> elementDescription;
    protected PricingTicketingSubsequentTypeI mdInfo;
    protected StructuredDateTimeInformationType70487S creationDate;
    protected TransportIdentifierType validatingCarrier;
    protected OriginAndDestinationDetailsTypeI70484S issuancePlace;
    protected MonetaryInformationTypeI mdFares;
    protected List<TaxTypeI> mdTaxes;
    protected MiscDocumentType.McoDetails mcoDetails;
    protected MiscDocumentType.SvcDetails svcDetails;
    protected MiscDocumentType.XsbDetails xsbDetails;

    /**
     * Gets the value of the commonMd property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousDocumentType }
     *     
     */
    public MiscellaneousDocumentType getCommonMd() {
        return commonMd;
    }

    /**
     * Sets the value of the commonMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousDocumentType }
     *     
     */
    public void setCommonMd(MiscellaneousDocumentType value) {
        this.commonMd = value;
    }

    /**
     * Gets the value of the elemTattoo property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationTypeI }
     *     
     */
    public ReferenceInformationTypeI getElemTattoo() {
        return elemTattoo;
    }

    /**
     * Sets the value of the elemTattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationTypeI }
     *     
     */
    public void setElemTattoo(ReferenceInformationTypeI value) {
        this.elemTattoo = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificationType }
     *     
     */
    public UserIdentificationType getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificationType }
     *     
     */
    public void setUserInfo(UserIdentificationType value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the elementDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeType70481S }
     * 
     * 
     */
    public List<CodedAttributeType70481S> getElementDescription() {
        if (elementDescription == null) {
            elementDescription = new ArrayList<CodedAttributeType70481S>();
        }
        return this.elementDescription;
    }

    /**
     * Gets the value of the mdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingSubsequentTypeI }
     *     
     */
    public PricingTicketingSubsequentTypeI getMdInfo() {
        return mdInfo;
    }

    /**
     * Sets the value of the mdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingSubsequentTypeI }
     *     
     */
    public void setMdInfo(PricingTicketingSubsequentTypeI value) {
        this.mdInfo = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType70487S }
     *     
     */
    public StructuredDateTimeInformationType70487S getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType70487S }
     *     
     */
    public void setCreationDate(StructuredDateTimeInformationType70487S value) {
        this.creationDate = value;
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
     * Gets the value of the issuancePlace property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetailsTypeI70484S }
     *     
     */
    public OriginAndDestinationDetailsTypeI70484S getIssuancePlace() {
        return issuancePlace;
    }

    /**
     * Sets the value of the issuancePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetailsTypeI70484S }
     *     
     */
    public void setIssuancePlace(OriginAndDestinationDetailsTypeI70484S value) {
        this.issuancePlace = value;
    }

    /**
     * Gets the value of the mdFares property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationTypeI }
     *     
     */
    public MonetaryInformationTypeI getMdFares() {
        return mdFares;
    }

    /**
     * Sets the value of the mdFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationTypeI }
     *     
     */
    public void setMdFares(MonetaryInformationTypeI value) {
        this.mdFares = value;
    }

    /**
     * Gets the value of the mdTaxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mdTaxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMdTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTypeI }
     * 
     * 
     */
    public List<TaxTypeI> getMdTaxes() {
        if (mdTaxes == null) {
            mdTaxes = new ArrayList<TaxTypeI>();
        }
        return this.mdTaxes;
    }

    /**
     * Gets the value of the mcoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscDocumentType.McoDetails }
     *     
     */
    public MiscDocumentType.McoDetails getMcoDetails() {
        return mcoDetails;
    }

    /**
     * Sets the value of the mcoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscDocumentType.McoDetails }
     *     
     */
    public void setMcoDetails(MiscDocumentType.McoDetails value) {
        this.mcoDetails = value;
    }

    /**
     * Gets the value of the svcDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscDocumentType.SvcDetails }
     *     
     */
    public MiscDocumentType.SvcDetails getSvcDetails() {
        return svcDetails;
    }

    /**
     * Sets the value of the svcDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscDocumentType.SvcDetails }
     *     
     */
    public void setSvcDetails(MiscDocumentType.SvcDetails value) {
        this.svcDetails = value;
    }

    /**
     * Gets the value of the xsbDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscDocumentType.XsbDetails }
     *     
     */
    public MiscDocumentType.XsbDetails getXsbDetails() {
        return xsbDetails;
    }

    /**
     * Sets the value of the xsbDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscDocumentType.XsbDetails }
     *     
     */
    public void setXsbDetails(MiscDocumentType.XsbDetails value) {
        this.xsbDetails = value;
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
     *         &lt;element name="mco" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MiscellaneousChargeOrderType"/&gt;
     *         &lt;element name="passengers" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}SpecificTravellerTypeI" maxOccurs="60" minOccurs="0"/&gt;
     *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TicketNumberTypeI" minOccurs="0"/&gt;
     *         &lt;element name="sizeIndicator" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StatusTypeI" minOccurs="0"/&gt;
     *         &lt;element name="mcoData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodedAttributeType_70481S" maxOccurs="3" minOccurs="0"/&gt;
     *         &lt;element name="bankerRate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ConversionRateTypeI" minOccurs="0"/&gt;
     *         &lt;element name="mcoFares" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="mcoTax" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TaxTypeI" minOccurs="0"/&gt;
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
        "mco",
        "passengers",
        "ticketNumber",
        "sizeIndicator",
        "mcoData",
        "bankerRate",
        "mcoFares",
        "mcoTax"
    })
    public static class McoDetails {

        @XmlElement(required = true)
        protected MiscellaneousChargeOrderType mco;
        protected List<SpecificTravellerTypeI> passengers;
        protected TicketNumberTypeI ticketNumber;
        protected StatusTypeI sizeIndicator;
        protected List<CodedAttributeType70481S> mcoData;
        protected ConversionRateTypeI bankerRate;
        protected MonetaryInformationTypeI mcoFares;
        protected TaxTypeI mcoTax;

        /**
         * Gets the value of the mco property.
         * 
         * @return
         *     possible object is
         *     {@link MiscellaneousChargeOrderType }
         *     
         */
        public MiscellaneousChargeOrderType getMco() {
            return mco;
        }

        /**
         * Sets the value of the mco property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscellaneousChargeOrderType }
         *     
         */
        public void setMco(MiscellaneousChargeOrderType value) {
            this.mco = value;
        }

        /**
         * Gets the value of the passengers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecificTravellerTypeI }
         * 
         * 
         */
        public List<SpecificTravellerTypeI> getPassengers() {
            if (passengers == null) {
                passengers = new ArrayList<SpecificTravellerTypeI>();
            }
            return this.passengers;
        }

        /**
         * Gets the value of the ticketNumber property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public TicketNumberTypeI getTicketNumber() {
            return ticketNumber;
        }

        /**
         * Sets the value of the ticketNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public void setTicketNumber(TicketNumberTypeI value) {
            this.ticketNumber = value;
        }

        /**
         * Gets the value of the sizeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link StatusTypeI }
         *     
         */
        public StatusTypeI getSizeIndicator() {
            return sizeIndicator;
        }

        /**
         * Sets the value of the sizeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusTypeI }
         *     
         */
        public void setSizeIndicator(StatusTypeI value) {
            this.sizeIndicator = value;
        }

        /**
         * Gets the value of the mcoData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcoData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMcoData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodedAttributeType70481S }
         * 
         * 
         */
        public List<CodedAttributeType70481S> getMcoData() {
            if (mcoData == null) {
                mcoData = new ArrayList<CodedAttributeType70481S>();
            }
            return this.mcoData;
        }

        /**
         * Gets the value of the bankerRate property.
         * 
         * @return
         *     possible object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public ConversionRateTypeI getBankerRate() {
            return bankerRate;
        }

        /**
         * Sets the value of the bankerRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public void setBankerRate(ConversionRateTypeI value) {
            this.bankerRate = value;
        }

        /**
         * Gets the value of the mcoFares property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public MonetaryInformationTypeI getMcoFares() {
            return mcoFares;
        }

        /**
         * Sets the value of the mcoFares property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public void setMcoFares(MonetaryInformationTypeI value) {
            this.mcoFares = value;
        }

        /**
         * Gets the value of the mcoTax property.
         * 
         * @return
         *     possible object is
         *     {@link TaxTypeI }
         *     
         */
        public TaxTypeI getMcoTax() {
            return mcoTax;
        }

        /**
         * Sets the value of the mcoTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxTypeI }
         *     
         */
        public void setMcoTax(TaxTypeI value) {
            this.mcoTax = value;
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
     *         &lt;element name="svcType" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ServiceChargeInformationType"/&gt;
     *         &lt;element name="passengers" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}SpecificTravellerTypeI" maxOccurs="60" minOccurs="0"/&gt;
     *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TicketNumberTypeI" minOccurs="0"/&gt;
     *         &lt;element name="sizeIndicator" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StatusTypeI" minOccurs="0"/&gt;
     *         &lt;element name="mcoData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CodedAttributeType_70481S" maxOccurs="3" minOccurs="0"/&gt;
     *         &lt;element name="bankerRate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ConversionRateTypeI" minOccurs="0"/&gt;
     *         &lt;element name="mcoFares" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="mcoTax" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TaxTypeI" minOccurs="0"/&gt;
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
        "svcType",
        "passengers",
        "ticketNumber",
        "sizeIndicator",
        "mcoData",
        "bankerRate",
        "mcoFares",
        "mcoTax"
    })
    public static class SvcDetails {

        @XmlElement(required = true)
        protected ServiceChargeInformationType svcType;
        protected List<SpecificTravellerTypeI> passengers;
        protected TicketNumberTypeI ticketNumber;
        protected StatusTypeI sizeIndicator;
        protected List<CodedAttributeType70481S> mcoData;
        protected ConversionRateTypeI bankerRate;
        protected MonetaryInformationTypeI mcoFares;
        protected TaxTypeI mcoTax;

        /**
         * Gets the value of the svcType property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceChargeInformationType }
         *     
         */
        public ServiceChargeInformationType getSvcType() {
            return svcType;
        }

        /**
         * Sets the value of the svcType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceChargeInformationType }
         *     
         */
        public void setSvcType(ServiceChargeInformationType value) {
            this.svcType = value;
        }

        /**
         * Gets the value of the passengers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecificTravellerTypeI }
         * 
         * 
         */
        public List<SpecificTravellerTypeI> getPassengers() {
            if (passengers == null) {
                passengers = new ArrayList<SpecificTravellerTypeI>();
            }
            return this.passengers;
        }

        /**
         * Gets the value of the ticketNumber property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public TicketNumberTypeI getTicketNumber() {
            return ticketNumber;
        }

        /**
         * Sets the value of the ticketNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public void setTicketNumber(TicketNumberTypeI value) {
            this.ticketNumber = value;
        }

        /**
         * Gets the value of the sizeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link StatusTypeI }
         *     
         */
        public StatusTypeI getSizeIndicator() {
            return sizeIndicator;
        }

        /**
         * Sets the value of the sizeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusTypeI }
         *     
         */
        public void setSizeIndicator(StatusTypeI value) {
            this.sizeIndicator = value;
        }

        /**
         * Gets the value of the mcoData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcoData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMcoData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodedAttributeType70481S }
         * 
         * 
         */
        public List<CodedAttributeType70481S> getMcoData() {
            if (mcoData == null) {
                mcoData = new ArrayList<CodedAttributeType70481S>();
            }
            return this.mcoData;
        }

        /**
         * Gets the value of the bankerRate property.
         * 
         * @return
         *     possible object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public ConversionRateTypeI getBankerRate() {
            return bankerRate;
        }

        /**
         * Sets the value of the bankerRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public void setBankerRate(ConversionRateTypeI value) {
            this.bankerRate = value;
        }

        /**
         * Gets the value of the mcoFares property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public MonetaryInformationTypeI getMcoFares() {
            return mcoFares;
        }

        /**
         * Sets the value of the mcoFares property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public void setMcoFares(MonetaryInformationTypeI value) {
            this.mcoFares = value;
        }

        /**
         * Gets the value of the mcoTax property.
         * 
         * @return
         *     possible object is
         *     {@link TaxTypeI }
         *     
         */
        public TaxTypeI getMcoTax() {
            return mcoTax;
        }

        /**
         * Sets the value of the mcoTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxTypeI }
         *     
         */
        public void setMcoTax(TaxTypeI value) {
            this.mcoTax = value;
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
     *         &lt;element name="xsb" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ExcessBaggageType"/&gt;
     *         &lt;element name="xsbWeight" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ExcessBaggageTypeI" minOccurs="0"/&gt;
     *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TicketNumberTypeI" minOccurs="0"/&gt;
     *         &lt;element name="xsbRate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *         &lt;element name="globalIndicator" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StatusTypeI" minOccurs="0"/&gt;
     *         &lt;element name="pricingRouting" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="pricingCities" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}OriginAndDestinationDetailsTypeI_70484S"/&gt;
     *                   &lt;element name="pricingCarrier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="routingDetails" maxOccurs="16" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="connectionPoint" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ConnectionTypeI"/&gt;
     *                   &lt;element name="routingCities" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}OriginAndDestinationDetailsTypeI_70484S"/&gt;
     *                   &lt;element name="routingCarrier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
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
        "xsb",
        "xsbWeight",
        "ticketNumber",
        "xsbRate",
        "globalIndicator",
        "pricingRouting",
        "routingDetails"
    })
    public static class XsbDetails {

        @XmlElement(required = true)
        protected ExcessBaggageType xsb;
        protected ExcessBaggageTypeI xsbWeight;
        protected TicketNumberTypeI ticketNumber;
        protected MonetaryInformationTypeI xsbRate;
        protected StatusTypeI globalIndicator;
        protected MiscDocumentType.XsbDetails.PricingRouting pricingRouting;
        protected List<MiscDocumentType.XsbDetails.RoutingDetails> routingDetails;

        /**
         * Gets the value of the xsb property.
         * 
         * @return
         *     possible object is
         *     {@link ExcessBaggageType }
         *     
         */
        public ExcessBaggageType getXsb() {
            return xsb;
        }

        /**
         * Sets the value of the xsb property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExcessBaggageType }
         *     
         */
        public void setXsb(ExcessBaggageType value) {
            this.xsb = value;
        }

        /**
         * Gets the value of the xsbWeight property.
         * 
         * @return
         *     possible object is
         *     {@link ExcessBaggageTypeI }
         *     
         */
        public ExcessBaggageTypeI getXsbWeight() {
            return xsbWeight;
        }

        /**
         * Sets the value of the xsbWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExcessBaggageTypeI }
         *     
         */
        public void setXsbWeight(ExcessBaggageTypeI value) {
            this.xsbWeight = value;
        }

        /**
         * Gets the value of the ticketNumber property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public TicketNumberTypeI getTicketNumber() {
            return ticketNumber;
        }

        /**
         * Sets the value of the ticketNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public void setTicketNumber(TicketNumberTypeI value) {
            this.ticketNumber = value;
        }

        /**
         * Gets the value of the xsbRate property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public MonetaryInformationTypeI getXsbRate() {
            return xsbRate;
        }

        /**
         * Sets the value of the xsbRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public void setXsbRate(MonetaryInformationTypeI value) {
            this.xsbRate = value;
        }

        /**
         * Gets the value of the globalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link StatusTypeI }
         *     
         */
        public StatusTypeI getGlobalIndicator() {
            return globalIndicator;
        }

        /**
         * Sets the value of the globalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusTypeI }
         *     
         */
        public void setGlobalIndicator(StatusTypeI value) {
            this.globalIndicator = value;
        }

        /**
         * Gets the value of the pricingRouting property.
         * 
         * @return
         *     possible object is
         *     {@link MiscDocumentType.XsbDetails.PricingRouting }
         *     
         */
        public MiscDocumentType.XsbDetails.PricingRouting getPricingRouting() {
            return pricingRouting;
        }

        /**
         * Sets the value of the pricingRouting property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscDocumentType.XsbDetails.PricingRouting }
         *     
         */
        public void setPricingRouting(MiscDocumentType.XsbDetails.PricingRouting value) {
            this.pricingRouting = value;
        }

        /**
         * Gets the value of the routingDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routingDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoutingDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiscDocumentType.XsbDetails.RoutingDetails }
         * 
         * 
         */
        public List<MiscDocumentType.XsbDetails.RoutingDetails> getRoutingDetails() {
            if (routingDetails == null) {
                routingDetails = new ArrayList<MiscDocumentType.XsbDetails.RoutingDetails>();
            }
            return this.routingDetails;
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
         *         &lt;element name="pricingCities" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}OriginAndDestinationDetailsTypeI_70484S"/&gt;
         *         &lt;element name="pricingCarrier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
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
            "pricingCities",
            "pricingCarrier"
        })
        public static class PricingRouting {

            @XmlElement(required = true)
            protected OriginAndDestinationDetailsTypeI70484S pricingCities;
            protected TransportIdentifierType pricingCarrier;

            /**
             * Gets the value of the pricingCities property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationDetailsTypeI70484S }
             *     
             */
            public OriginAndDestinationDetailsTypeI70484S getPricingCities() {
                return pricingCities;
            }

            /**
             * Sets the value of the pricingCities property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationDetailsTypeI70484S }
             *     
             */
            public void setPricingCities(OriginAndDestinationDetailsTypeI70484S value) {
                this.pricingCities = value;
            }

            /**
             * Gets the value of the pricingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link TransportIdentifierType }
             *     
             */
            public TransportIdentifierType getPricingCarrier() {
                return pricingCarrier;
            }

            /**
             * Sets the value of the pricingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransportIdentifierType }
             *     
             */
            public void setPricingCarrier(TransportIdentifierType value) {
                this.pricingCarrier = value;
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
         *         &lt;element name="connectionPoint" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ConnectionTypeI"/&gt;
         *         &lt;element name="routingCities" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}OriginAndDestinationDetailsTypeI_70484S"/&gt;
         *         &lt;element name="routingCarrier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
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
            "connectionPoint",
            "routingCities",
            "routingCarrier"
        })
        public static class RoutingDetails {

            @XmlElement(required = true)
            protected ConnectionTypeI connectionPoint;
            @XmlElement(required = true)
            protected OriginAndDestinationDetailsTypeI70484S routingCities;
            protected TransportIdentifierType routingCarrier;

            /**
             * Gets the value of the connectionPoint property.
             * 
             * @return
             *     possible object is
             *     {@link ConnectionTypeI }
             *     
             */
            public ConnectionTypeI getConnectionPoint() {
                return connectionPoint;
            }

            /**
             * Sets the value of the connectionPoint property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConnectionTypeI }
             *     
             */
            public void setConnectionPoint(ConnectionTypeI value) {
                this.connectionPoint = value;
            }

            /**
             * Gets the value of the routingCities property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationDetailsTypeI70484S }
             *     
             */
            public OriginAndDestinationDetailsTypeI70484S getRoutingCities() {
                return routingCities;
            }

            /**
             * Sets the value of the routingCities property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationDetailsTypeI70484S }
             *     
             */
            public void setRoutingCities(OriginAndDestinationDetailsTypeI70484S value) {
                this.routingCities = value;
            }

            /**
             * Gets the value of the routingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link TransportIdentifierType }
             *     
             */
            public TransportIdentifierType getRoutingCarrier() {
                return routingCarrier;
            }

            /**
             * Sets the value of the routingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransportIdentifierType }
             *     
             */
            public void setRoutingCarrier(TransportIdentifierType value) {
                this.routingCarrier = value;
            }

        }

    }

}
