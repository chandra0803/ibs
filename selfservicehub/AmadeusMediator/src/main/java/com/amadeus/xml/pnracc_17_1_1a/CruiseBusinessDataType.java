
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * cruise business data
 * 
 * <p>Java class for CruiseBusinessDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseBusinessDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sailingShipInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ShipIdentificationType_8952S"/&gt;
 *         &lt;element name="sailingProviderInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_8953S"/&gt;
 *         &lt;element name="sailingPortsInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_8954S"/&gt;
 *         &lt;element name="sailingDateInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_8955S"/&gt;
 *         &lt;element name="passengerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationTypeI_8956S" maxOccurs="9"/&gt;
 *         &lt;element name="bookingDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cruiseBookingReferenceInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_8957S"/&gt;
 *                   &lt;element name="bookingCompany" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_26258S" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bookingDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_207596S"/&gt;
 *         &lt;element name="sailingGroupInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemReferencesAndVersionsType_9271S" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseBusinessDataType", propOrder = {
    "sailingShipInformation",
    "sailingProviderInformation",
    "sailingPortsInformation",
    "sailingDateInformation",
    "passengerInfo",
    "bookingDetails",
    "bookingDate",
    "sailingGroupInformation"
})
public class CruiseBusinessDataType {

    @XmlElement(required = true)
    protected ShipIdentificationType8952S sailingShipInformation;
    @XmlElement(required = true)
    protected CompanyInformationType8953S sailingProviderInformation;
    @XmlElement(required = true)
    protected PlaceLocationIdentificationTypeU8954S sailingPortsInformation;
    @XmlElement(required = true)
    protected StructuredPeriodInformationType8955S sailingDateInformation;
    @XmlElement(required = true)
    protected List<TravellerInformationTypeI8956S> passengerInfo;
    protected CruiseBusinessDataType.BookingDetails bookingDetails;
    @XmlElement(required = true)
    protected StructuredDateTimeInformationType207596S bookingDate;
    protected ItemReferencesAndVersionsType9271S sailingGroupInformation;

    /**
     * Gets the value of the sailingShipInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdentificationType8952S }
     *     
     */
    public ShipIdentificationType8952S getSailingShipInformation() {
        return sailingShipInformation;
    }

    /**
     * Sets the value of the sailingShipInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdentificationType8952S }
     *     
     */
    public void setSailingShipInformation(ShipIdentificationType8952S value) {
        this.sailingShipInformation = value;
    }

    /**
     * Gets the value of the sailingProviderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType8953S }
     *     
     */
    public CompanyInformationType8953S getSailingProviderInformation() {
        return sailingProviderInformation;
    }

    /**
     * Sets the value of the sailingProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType8953S }
     *     
     */
    public void setSailingProviderInformation(CompanyInformationType8953S value) {
        this.sailingProviderInformation = value;
    }

    /**
     * Gets the value of the sailingPortsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentificationTypeU8954S }
     *     
     */
    public PlaceLocationIdentificationTypeU8954S getSailingPortsInformation() {
        return sailingPortsInformation;
    }

    /**
     * Sets the value of the sailingPortsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentificationTypeU8954S }
     *     
     */
    public void setSailingPortsInformation(PlaceLocationIdentificationTypeU8954S value) {
        this.sailingPortsInformation = value;
    }

    /**
     * Gets the value of the sailingDateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPeriodInformationType8955S }
     *     
     */
    public StructuredPeriodInformationType8955S getSailingDateInformation() {
        return sailingDateInformation;
    }

    /**
     * Sets the value of the sailingDateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPeriodInformationType8955S }
     *     
     */
    public void setSailingDateInformation(StructuredPeriodInformationType8955S value) {
        this.sailingDateInformation = value;
    }

    /**
     * Gets the value of the passengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerInformationTypeI8956S }
     * 
     * 
     */
    public List<TravellerInformationTypeI8956S> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<TravellerInformationTypeI8956S>();
        }
        return this.passengerInfo;
    }

    /**
     * Gets the value of the bookingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseBusinessDataType.BookingDetails }
     *     
     */
    public CruiseBusinessDataType.BookingDetails getBookingDetails() {
        return bookingDetails;
    }

    /**
     * Sets the value of the bookingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseBusinessDataType.BookingDetails }
     *     
     */
    public void setBookingDetails(CruiseBusinessDataType.BookingDetails value) {
        this.bookingDetails = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType207596S }
     *     
     */
    public StructuredDateTimeInformationType207596S getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType207596S }
     *     
     */
    public void setBookingDate(StructuredDateTimeInformationType207596S value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the sailingGroupInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersionsType9271S }
     *     
     */
    public ItemReferencesAndVersionsType9271S getSailingGroupInformation() {
        return sailingGroupInformation;
    }

    /**
     * Sets the value of the sailingGroupInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersionsType9271S }
     *     
     */
    public void setSailingGroupInformation(ItemReferencesAndVersionsType9271S value) {
        this.sailingGroupInformation = value;
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
     *         &lt;element name="cruiseBookingReferenceInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_8957S"/&gt;
     *         &lt;element name="bookingCompany" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_26258S" minOccurs="0"/&gt;
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
        "cruiseBookingReferenceInfo",
        "bookingCompany"
    })
    public static class BookingDetails {

        @XmlElement(required = true)
        protected ReservationControlInformationTypeI8957S cruiseBookingReferenceInfo;
        protected CompanyInformationType26258S bookingCompany;

        /**
         * Gets the value of the cruiseBookingReferenceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformationTypeI8957S }
         *     
         */
        public ReservationControlInformationTypeI8957S getCruiseBookingReferenceInfo() {
            return cruiseBookingReferenceInfo;
        }

        /**
         * Sets the value of the cruiseBookingReferenceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformationTypeI8957S }
         *     
         */
        public void setCruiseBookingReferenceInfo(ReservationControlInformationTypeI8957S value) {
            this.cruiseBookingReferenceInfo = value;
        }

        /**
         * Gets the value of the bookingCompany property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyInformationType26258S }
         *     
         */
        public CompanyInformationType26258S getBookingCompany() {
            return bookingCompany;
        }

        /**
         * Sets the value of the bookingCompany property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyInformationType26258S }
         *     
         */
        public void setBookingCompany(CompanyInformationType26258S value) {
            this.bookingCompany = value;
        }

    }

}
