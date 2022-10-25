
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group together rail segment business data
 * 
 * <p>Java class for TrainInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_19450S"/>
 *         &lt;element name="updatePermission" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_20923S" minOccurs="0"/>
 *         &lt;element name="tripDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TrainDataType"/>
 *         &lt;element name="openSegment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_196879S" minOccurs="0"/>
 *         &lt;element name="journeyDirection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelItineraryInformationTypeI_33275S" minOccurs="0"/>
 *         &lt;element name="providerTattoo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
 *         &lt;element name="serviceInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_20551S" minOccurs="0"/>
 *         &lt;element name="classInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ClassConfigurationDetailsType"/>
 *         &lt;element name="accommodationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AccommodationAllocationInformationTypeU" minOccurs="0"/>
 *         &lt;element name="coachInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CoachProductInformationType" minOccurs="0"/>
 *         &lt;element name="reservableStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityAndActionTypeU_32609S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainInformationType", propOrder = {
    "companyInfo",
    "updatePermission",
    "tripDetails",
    "openSegment",
    "journeyDirection",
    "providerTattoo",
    "serviceInfo",
    "classInfo",
    "accommodationInfo",
    "coachInfo",
    "reservableStatus"
})
public class TrainInformationType {

    @XmlElement(required = true)
    protected CompanyInformationType19450S companyInfo;
    protected StatusTypeI20923S updatePermission;
    @XmlElement(required = true)
    protected TrainDataType tripDetails;
    protected StatusTypeI196879S openSegment;
    protected TravelItineraryInformationTypeI33275S journeyDirection;
    protected ItemReferencesAndVersionsType providerTattoo;
    protected FreeTextInformationType20551S serviceInfo;
    @XmlElement(required = true)
    protected ClassConfigurationDetailsType classInfo;
    protected AccommodationAllocationInformationTypeU accommodationInfo;
    protected CoachProductInformationType coachInfo;
    protected QuantityAndActionTypeU32609S reservableStatus;

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType19450S }
     *     
     */
    public CompanyInformationType19450S getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType19450S }
     *     
     */
    public void setCompanyInfo(CompanyInformationType19450S value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the updatePermission property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTypeI20923S }
     *     
     */
    public StatusTypeI20923S getUpdatePermission() {
        return updatePermission;
    }

    /**
     * Sets the value of the updatePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTypeI20923S }
     *     
     */
    public void setUpdatePermission(StatusTypeI20923S value) {
        this.updatePermission = value;
    }

    /**
     * Gets the value of the tripDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TrainDataType }
     *     
     */
    public TrainDataType getTripDetails() {
        return tripDetails;
    }

    /**
     * Sets the value of the tripDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainDataType }
     *     
     */
    public void setTripDetails(TrainDataType value) {
        this.tripDetails = value;
    }

    /**
     * Gets the value of the openSegment property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTypeI196879S }
     *     
     */
    public StatusTypeI196879S getOpenSegment() {
        return openSegment;
    }

    /**
     * Sets the value of the openSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTypeI196879S }
     *     
     */
    public void setOpenSegment(StatusTypeI196879S value) {
        this.openSegment = value;
    }

    /**
     * Gets the value of the journeyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryInformationTypeI33275S }
     *     
     */
    public TravelItineraryInformationTypeI33275S getJourneyDirection() {
        return journeyDirection;
    }

    /**
     * Sets the value of the journeyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryInformationTypeI33275S }
     *     
     */
    public void setJourneyDirection(TravelItineraryInformationTypeI33275S value) {
        this.journeyDirection = value;
    }

    /**
     * Gets the value of the providerTattoo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersionsType }
     *     
     */
    public ItemReferencesAndVersionsType getProviderTattoo() {
        return providerTattoo;
    }

    /**
     * Sets the value of the providerTattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersionsType }
     *     
     */
    public void setProviderTattoo(ItemReferencesAndVersionsType value) {
        this.providerTattoo = value;
    }

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType20551S }
     *     
     */
    public FreeTextInformationType20551S getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType20551S }
     *     
     */
    public void setServiceInfo(FreeTextInformationType20551S value) {
        this.serviceInfo = value;
    }

    /**
     * Gets the value of the classInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClassConfigurationDetailsType }
     *     
     */
    public ClassConfigurationDetailsType getClassInfo() {
        return classInfo;
    }

    /**
     * Sets the value of the classInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassConfigurationDetailsType }
     *     
     */
    public void setClassInfo(ClassConfigurationDetailsType value) {
        this.classInfo = value;
    }

    /**
     * Gets the value of the accommodationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationAllocationInformationTypeU }
     *     
     */
    public AccommodationAllocationInformationTypeU getAccommodationInfo() {
        return accommodationInfo;
    }

    /**
     * Sets the value of the accommodationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationAllocationInformationTypeU }
     *     
     */
    public void setAccommodationInfo(AccommodationAllocationInformationTypeU value) {
        this.accommodationInfo = value;
    }

    /**
     * Gets the value of the coachInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CoachProductInformationType }
     *     
     */
    public CoachProductInformationType getCoachInfo() {
        return coachInfo;
    }

    /**
     * Sets the value of the coachInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachProductInformationType }
     *     
     */
    public void setCoachInfo(CoachProductInformationType value) {
        this.coachInfo = value;
    }

    /**
     * Gets the value of the reservableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionTypeU32609S }
     *     
     */
    public QuantityAndActionTypeU32609S getReservableStatus() {
        return reservableStatus;
    }

    /**
     * Sets the value of the reservableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionTypeU32609S }
     *     
     */
    public void setReservableStatus(QuantityAndActionTypeU32609S value) {
        this.reservableStatus = value;
    }

}
