
package com.amadeus.xml.pausrq_16_1_1a;

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
 *         &lt;element name="options" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}CodedAttributeType" maxOccurs="3"/&gt;
 *         &lt;element name="flightInformation" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}TravelProductInformationType" minOccurs="0"/&gt;
 *         &lt;element name="enhancedPassengerNameInfo" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}EnhancedTravellerInformationType" minOccurs="0"/&gt;
 *         &lt;element name="office" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}UserIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="segmentType" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}CompanyInformationType" minOccurs="0"/&gt;
 *         &lt;element name="dateInformation" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}StructuredPeriodInformationType" minOccurs="0"/&gt;
 *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}OriginAndDestinationDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="frequentTravellerInformation" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="annoutNumber" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}AccountingInformationElementType" minOccurs="0"/&gt;
 *         &lt;element name="recordLocator" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}ReservationControlInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}TicketNumberType" minOccurs="0"/&gt;
 *         &lt;element name="ticketProvider" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}TransportIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="cardNumber" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}CreditCardDataType" minOccurs="0"/&gt;
 *         &lt;element name="providerProductDetails" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}InsuranceProductDetailsType" minOccurs="0"/&gt;
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
    "options",
    "flightInformation",
    "enhancedPassengerNameInfo",
    "office",
    "segmentType",
    "dateInformation",
    "locationInfo",
    "frequentTravellerInformation",
    "annoutNumber",
    "recordLocator",
    "ticketNumber",
    "ticketProvider",
    "cardNumber",
    "providerProductDetails"
})
@XmlRootElement(name = "PNR_Search")
public class PNRSearch {

    @XmlElement(required = true)
    protected List<CodedAttributeType> options;
    protected TravelProductInformationType flightInformation;
    protected EnhancedTravellerInformationType enhancedPassengerNameInfo;
    protected UserIdentificationType office;
    protected CompanyInformationType segmentType;
    protected StructuredPeriodInformationType dateInformation;
    protected OriginAndDestinationDetailsType locationInfo;
    protected FrequentTravellerIdentificationCodeType frequentTravellerInformation;
    protected AccountingInformationElementType annoutNumber;
    protected ReservationControlInformationType recordLocator;
    protected TicketNumberType ticketNumber;
    protected TransportIdentifierType ticketProvider;
    protected CreditCardDataType cardNumber;
    protected InsuranceProductDetailsType providerProductDetails;

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeType }
     * 
     * 
     */
    public List<CodedAttributeType> getOptions() {
        if (options == null) {
            options = new ArrayList<CodedAttributeType>();
        }
        return this.options;
    }

    /**
     * Gets the value of the flightInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationType }
     *     
     */
    public TravelProductInformationType getFlightInformation() {
        return flightInformation;
    }

    /**
     * Sets the value of the flightInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationType }
     *     
     */
    public void setFlightInformation(TravelProductInformationType value) {
        this.flightInformation = value;
    }

    /**
     * Gets the value of the enhancedPassengerNameInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedTravellerInformationType }
     *     
     */
    public EnhancedTravellerInformationType getEnhancedPassengerNameInfo() {
        return enhancedPassengerNameInfo;
    }

    /**
     * Sets the value of the enhancedPassengerNameInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedTravellerInformationType }
     *     
     */
    public void setEnhancedPassengerNameInfo(EnhancedTravellerInformationType value) {
        this.enhancedPassengerNameInfo = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificationType }
     *     
     */
    public UserIdentificationType getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificationType }
     *     
     */
    public void setOffice(UserIdentificationType value) {
        this.office = value;
    }

    /**
     * Gets the value of the segmentType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType }
     *     
     */
    public CompanyInformationType getSegmentType() {
        return segmentType;
    }

    /**
     * Sets the value of the segmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType }
     *     
     */
    public void setSegmentType(CompanyInformationType value) {
        this.segmentType = value;
    }

    /**
     * Gets the value of the dateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPeriodInformationType }
     *     
     */
    public StructuredPeriodInformationType getDateInformation() {
        return dateInformation;
    }

    /**
     * Sets the value of the dateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPeriodInformationType }
     *     
     */
    public void setDateInformation(StructuredPeriodInformationType value) {
        this.dateInformation = value;
    }

    /**
     * Gets the value of the locationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetailsType }
     *     
     */
    public OriginAndDestinationDetailsType getLocationInfo() {
        return locationInfo;
    }

    /**
     * Sets the value of the locationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetailsType }
     *     
     */
    public void setLocationInfo(OriginAndDestinationDetailsType value) {
        this.locationInfo = value;
    }

    /**
     * Gets the value of the frequentTravellerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationCodeType }
     *     
     */
    public FrequentTravellerIdentificationCodeType getFrequentTravellerInformation() {
        return frequentTravellerInformation;
    }

    /**
     * Sets the value of the frequentTravellerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationCodeType }
     *     
     */
    public void setFrequentTravellerInformation(FrequentTravellerIdentificationCodeType value) {
        this.frequentTravellerInformation = value;
    }

    /**
     * Gets the value of the annoutNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingInformationElementType }
     *     
     */
    public AccountingInformationElementType getAnnoutNumber() {
        return annoutNumber;
    }

    /**
     * Sets the value of the annoutNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingInformationElementType }
     *     
     */
    public void setAnnoutNumber(AccountingInformationElementType value) {
        this.annoutNumber = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationType }
     *     
     */
    public ReservationControlInformationType getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationType }
     *     
     */
    public void setRecordLocator(ReservationControlInformationType value) {
        this.recordLocator = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumberType }
     *     
     */
    public TicketNumberType getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumberType }
     *     
     */
    public void setTicketNumber(TicketNumberType value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the ticketProvider property.
     * 
     * @return
     *     possible object is
     *     {@link TransportIdentifierType }
     *     
     */
    public TransportIdentifierType getTicketProvider() {
        return ticketProvider;
    }

    /**
     * Sets the value of the ticketProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportIdentifierType }
     *     
     */
    public void setTicketProvider(TransportIdentifierType value) {
        this.ticketProvider = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataType }
     *     
     */
    public CreditCardDataType getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataType }
     *     
     */
    public void setCardNumber(CreditCardDataType value) {
        this.cardNumber = value;
    }

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
