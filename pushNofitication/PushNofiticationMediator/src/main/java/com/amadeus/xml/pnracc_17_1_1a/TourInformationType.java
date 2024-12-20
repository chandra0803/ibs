
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys tour booking information
 * 
 * <p>Java class for TourInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingSummaryInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeU_25428S"/>
 *         &lt;element name="bookingDurationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityType_25433S" minOccurs="0"/>
 *         &lt;element name="stayingInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_25436S" minOccurs="0"/>
 *         &lt;element name="tourDescriptionInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalProductDetailsTypeU" minOccurs="0"/>
 *         &lt;element name="bookingReferenceInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeU" maxOccurs="2"/>
 *         &lt;element name="statusInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityAndActionTypeU"/>
 *         &lt;element name="insuranceIndication" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceCoverageType_25483S" minOccurs="0"/>
 *         &lt;element name="passengerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationType_25441S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="expireInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_25444S" minOccurs="0"/>
 *         &lt;element name="bookingDescriptionInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_25445S" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="systemProviderInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TransportIdentifierType_25440S" minOccurs="0"/>
 *         &lt;element name="tourOperatorInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_25420S" maxOccurs="10"/>
 *         &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_25447S" minOccurs="0"/>
 *         &lt;element name="passengerAssocation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType_25422S" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="tourAccountDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourAccountDetailsType" minOccurs="0"/>
 *         &lt;element name="tourProductDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourServiceDetailsType" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourInformationType", propOrder = {
    "bookingSummaryInfo",
    "bookingDurationInfo",
    "stayingInfo",
    "tourDescriptionInfo",
    "bookingReferenceInfo",
    "statusInfo",
    "insuranceIndication",
    "passengerInfo",
    "expireInfo",
    "bookingDescriptionInfo",
    "systemProviderInfo",
    "tourOperatorInfo",
    "bookingSource",
    "passengerAssocation",
    "tourAccountDetails",
    "tourProductDetails"
})
public class TourInformationType {

    @XmlElement(required = true)
    protected TravelProductInformationTypeU25428S bookingSummaryInfo;
    protected QuantityType25433S bookingDurationInfo;
    protected PlaceLocationIdentificationTypeU25436S stayingInfo;
    protected AdditionalProductDetailsTypeU tourDescriptionInfo;
    @XmlElement(required = true)
    protected List<ReservationControlInformationTypeU> bookingReferenceInfo;
    @XmlElement(required = true)
    protected QuantityAndActionTypeU statusInfo;
    protected InsuranceCoverageType25483S insuranceIndication;
    protected List<TravellerInformationType25441S> passengerInfo;
    protected StructuredDateTimeInformationType25444S expireInfo;
    protected List<FreeTextInformationType25445S> bookingDescriptionInfo;
    protected TransportIdentifierType25440S systemProviderInfo;
    @XmlElement(required = true)
    protected List<CompanyInformationType25420S> tourOperatorInfo;
    protected UserIdentificationType25447S bookingSource;
    protected List<ReferenceInfoType25422S> passengerAssocation;
    protected TourAccountDetailsType tourAccountDetails;
    @XmlElement(required = true)
    protected List<TourServiceDetailsType> tourProductDetails;

    /**
     * Gets the value of the bookingSummaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationTypeU25428S }
     *     
     */
    public TravelProductInformationTypeU25428S getBookingSummaryInfo() {
        return bookingSummaryInfo;
    }

    /**
     * Sets the value of the bookingSummaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationTypeU25428S }
     *     
     */
    public void setBookingSummaryInfo(TravelProductInformationTypeU25428S value) {
        this.bookingSummaryInfo = value;
    }

    /**
     * Gets the value of the bookingDurationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType25433S }
     *     
     */
    public QuantityType25433S getBookingDurationInfo() {
        return bookingDurationInfo;
    }

    /**
     * Sets the value of the bookingDurationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType25433S }
     *     
     */
    public void setBookingDurationInfo(QuantityType25433S value) {
        this.bookingDurationInfo = value;
    }

    /**
     * Gets the value of the stayingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentificationTypeU25436S }
     *     
     */
    public PlaceLocationIdentificationTypeU25436S getStayingInfo() {
        return stayingInfo;
    }

    /**
     * Sets the value of the stayingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentificationTypeU25436S }
     *     
     */
    public void setStayingInfo(PlaceLocationIdentificationTypeU25436S value) {
        this.stayingInfo = value;
    }

    /**
     * Gets the value of the tourDescriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductDetailsTypeU }
     *     
     */
    public AdditionalProductDetailsTypeU getTourDescriptionInfo() {
        return tourDescriptionInfo;
    }

    /**
     * Sets the value of the tourDescriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductDetailsTypeU }
     *     
     */
    public void setTourDescriptionInfo(AdditionalProductDetailsTypeU value) {
        this.tourDescriptionInfo = value;
    }

    /**
     * Gets the value of the bookingReferenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingReferenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingReferenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationControlInformationTypeU }
     * 
     * 
     */
    public List<ReservationControlInformationTypeU> getBookingReferenceInfo() {
        if (bookingReferenceInfo == null) {
            bookingReferenceInfo = new ArrayList<ReservationControlInformationTypeU>();
        }
        return this.bookingReferenceInfo;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionTypeU }
     *     
     */
    public QuantityAndActionTypeU getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionTypeU }
     *     
     */
    public void setStatusInfo(QuantityAndActionTypeU value) {
        this.statusInfo = value;
    }

    /**
     * Gets the value of the insuranceIndication property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverageType25483S }
     *     
     */
    public InsuranceCoverageType25483S getInsuranceIndication() {
        return insuranceIndication;
    }

    /**
     * Sets the value of the insuranceIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverageType25483S }
     *     
     */
    public void setInsuranceIndication(InsuranceCoverageType25483S value) {
        this.insuranceIndication = value;
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
     * {@link TravellerInformationType25441S }
     * 
     * 
     */
    public List<TravellerInformationType25441S> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<TravellerInformationType25441S>();
        }
        return this.passengerInfo;
    }

    /**
     * Gets the value of the expireInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType25444S }
     *     
     */
    public StructuredDateTimeInformationType25444S getExpireInfo() {
        return expireInfo;
    }

    /**
     * Sets the value of the expireInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType25444S }
     *     
     */
    public void setExpireInfo(StructuredDateTimeInformationType25444S value) {
        this.expireInfo = value;
    }

    /**
     * Gets the value of the bookingDescriptionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingDescriptionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingDescriptionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextInformationType25445S }
     * 
     * 
     */
    public List<FreeTextInformationType25445S> getBookingDescriptionInfo() {
        if (bookingDescriptionInfo == null) {
            bookingDescriptionInfo = new ArrayList<FreeTextInformationType25445S>();
        }
        return this.bookingDescriptionInfo;
    }

    /**
     * Gets the value of the systemProviderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransportIdentifierType25440S }
     *     
     */
    public TransportIdentifierType25440S getSystemProviderInfo() {
        return systemProviderInfo;
    }

    /**
     * Sets the value of the systemProviderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportIdentifierType25440S }
     *     
     */
    public void setSystemProviderInfo(TransportIdentifierType25440S value) {
        this.systemProviderInfo = value;
    }

    /**
     * Gets the value of the tourOperatorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourOperatorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourOperatorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInformationType25420S }
     * 
     * 
     */
    public List<CompanyInformationType25420S> getTourOperatorInfo() {
        if (tourOperatorInfo == null) {
            tourOperatorInfo = new ArrayList<CompanyInformationType25420S>();
        }
        return this.tourOperatorInfo;
    }

    /**
     * Gets the value of the bookingSource property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificationType25447S }
     *     
     */
    public UserIdentificationType25447S getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificationType25447S }
     *     
     */
    public void setBookingSource(UserIdentificationType25447S value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the passengerAssocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerAssocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerAssocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType25422S }
     * 
     * 
     */
    public List<ReferenceInfoType25422S> getPassengerAssocation() {
        if (passengerAssocation == null) {
            passengerAssocation = new ArrayList<ReferenceInfoType25422S>();
        }
        return this.passengerAssocation;
    }

    /**
     * Gets the value of the tourAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TourAccountDetailsType }
     *     
     */
    public TourAccountDetailsType getTourAccountDetails() {
        return tourAccountDetails;
    }

    /**
     * Sets the value of the tourAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourAccountDetailsType }
     *     
     */
    public void setTourAccountDetails(TourAccountDetailsType value) {
        this.tourAccountDetails = value;
    }

    /**
     * Gets the value of the tourProductDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourProductDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourProductDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourServiceDetailsType }
     * 
     * 
     */
    public List<TourServiceDetailsType> getTourProductDetails() {
        if (tourProductDetails == null) {
            tourProductDetails = new ArrayList<TourServiceDetailsType>();
        }
        return this.tourProductDetails;
    }

}
