
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * insurance booked data
 * 
 * <p>Java class for InsuranceBusinessDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceBusinessDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="providerProductDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceProductDetailsType"/&gt;
 *         &lt;element name="substiteName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationTypeI" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="extraPremium" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="productSection" maxOccurs="48" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="productCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceProductDetailsType_20774S"/&gt;
 *                   &lt;element name="informationLines" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_6235S" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="planCostInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_22057S" minOccurs="0"/&gt;
 *         &lt;element name="planTypeDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="planType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceProviderAndProductsType"/&gt;
 *                   &lt;element name="travelValue" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contactDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="miscelaneous" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_12240S"/&gt;
 *                   &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_32298S" minOccurs="0"/&gt;
 *                   &lt;element name="contactName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationTypeI" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subscriberAddressSection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nameDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameTypeU"/&gt;
 *                   &lt;element name="addressInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU" minOccurs="0"/&gt;
 *                   &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_32298S" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="coverageDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="policyDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsurancePolicyType"/&gt;
 *                   &lt;element name="coverageInfo" maxOccurs="3" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="coverage" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceCoverageType"/&gt;
 *                             &lt;element name="coverageValues" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="coveredPassenger" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationTypeI_15923S" maxOccurs="3" minOccurs="0"/&gt;
 *                   &lt;element name="coverageDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType" minOccurs="0"/&gt;
 *                   &lt;element name="subscriptionDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_20644S" minOccurs="0"/&gt;
 *                   &lt;element name="agentReferenceDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_9456S" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="comissionAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CommissionInformationType" minOccurs="0"/&gt;
 *         &lt;element name="insuranceFopSection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="formOfPaymentSection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI_16862S"/&gt;
 *                   &lt;element name="fopExtendedData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_13270S" maxOccurs="3" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="confirmationNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="productKnowledge" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ActionDetailsTypeI" maxOccurs="20" minOccurs="0"/&gt;
 *         &lt;element name="passengerDetails" maxOccurs="198" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationType"/&gt;
 *                   &lt;element name="perPaxProdKnowledge" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ActionDetailsTypeI" maxOccurs="9" minOccurs="0"/&gt;
 *                   &lt;element name="dateOfBirthInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_13380S" minOccurs="0"/&gt;
 *                   &lt;element name="passengerFeatures" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="insureeRemark" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType" minOccurs="0"/&gt;
 *                   &lt;element name="travelerDocInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PassengerDocumentDetailsType" minOccurs="0"/&gt;
 *                   &lt;element name="policyDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsurancePolicyType" minOccurs="0"/&gt;
 *                   &lt;element name="travelerValueDetails" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="travelCost" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceCoverageType"/&gt;
 *                             &lt;element name="travelAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="premiumPerTariffPerPax" maxOccurs="4" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="tariffCodeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceProductDetailsType_20775S"/&gt;
 *                             &lt;element name="tariffCodePerPaxAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="premiumPerpaxInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_22057S" minOccurs="0"/&gt;
 *                   &lt;element name="voucherNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeU_31804S" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="printInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DocumentInformationDetailsTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceBusinessDataType", propOrder = {
    "providerProductDetails",
    "substiteName",
    "extraPremium",
    "productSection",
    "planCostInfo",
    "planTypeDetails",
    "contactDetails",
    "subscriberAddressSection",
    "coverageDetails",
    "comissionAmount",
    "insuranceFopSection",
    "confirmationNumber",
    "productKnowledge",
    "passengerDetails",
    "printInformation"
})
public class InsuranceBusinessDataType {

    @XmlElement(required = true)
    protected InsuranceProductDetailsType providerProductDetails;
    protected List<TravellerInformationTypeI> substiteName;
    protected MonetaryInformationTypeI extraPremium;
    protected List<InsuranceBusinessDataType.ProductSection> productSection;
    protected TariffInformationTypeI22057S planCostInfo;
    protected InsuranceBusinessDataType.PlanTypeDetails planTypeDetails;
    protected InsuranceBusinessDataType.ContactDetails contactDetails;
    protected InsuranceBusinessDataType.SubscriberAddressSection subscriberAddressSection;
    protected InsuranceBusinessDataType.CoverageDetails coverageDetails;
    protected CommissionInformationType comissionAmount;
    protected InsuranceBusinessDataType.InsuranceFopSection insuranceFopSection;
    protected ReservationControlInformationTypeI confirmationNumber;
    protected List<ActionDetailsTypeI> productKnowledge;
    protected List<InsuranceBusinessDataType.PassengerDetails> passengerDetails;
    protected DocumentInformationDetailsTypeI printInformation;

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

    /**
     * Gets the value of the substiteName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substiteName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstiteName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerInformationTypeI }
     * 
     * 
     */
    public List<TravellerInformationTypeI> getSubstiteName() {
        if (substiteName == null) {
            substiteName = new ArrayList<TravellerInformationTypeI>();
        }
        return this.substiteName;
    }

    /**
     * Gets the value of the extraPremium property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationTypeI }
     *     
     */
    public MonetaryInformationTypeI getExtraPremium() {
        return extraPremium;
    }

    /**
     * Sets the value of the extraPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationTypeI }
     *     
     */
    public void setExtraPremium(MonetaryInformationTypeI value) {
        this.extraPremium = value;
    }

    /**
     * Gets the value of the productSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceBusinessDataType.ProductSection }
     * 
     * 
     */
    public List<InsuranceBusinessDataType.ProductSection> getProductSection() {
        if (productSection == null) {
            productSection = new ArrayList<InsuranceBusinessDataType.ProductSection>();
        }
        return this.productSection;
    }

    /**
     * Gets the value of the planCostInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationTypeI22057S }
     *     
     */
    public TariffInformationTypeI22057S getPlanCostInfo() {
        return planCostInfo;
    }

    /**
     * Sets the value of the planCostInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationTypeI22057S }
     *     
     */
    public void setPlanCostInfo(TariffInformationTypeI22057S value) {
        this.planCostInfo = value;
    }

    /**
     * Gets the value of the planTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.PlanTypeDetails }
     *     
     */
    public InsuranceBusinessDataType.PlanTypeDetails getPlanTypeDetails() {
        return planTypeDetails;
    }

    /**
     * Sets the value of the planTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.PlanTypeDetails }
     *     
     */
    public void setPlanTypeDetails(InsuranceBusinessDataType.PlanTypeDetails value) {
        this.planTypeDetails = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.ContactDetails }
     *     
     */
    public InsuranceBusinessDataType.ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.ContactDetails }
     *     
     */
    public void setContactDetails(InsuranceBusinessDataType.ContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the subscriberAddressSection property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.SubscriberAddressSection }
     *     
     */
    public InsuranceBusinessDataType.SubscriberAddressSection getSubscriberAddressSection() {
        return subscriberAddressSection;
    }

    /**
     * Sets the value of the subscriberAddressSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.SubscriberAddressSection }
     *     
     */
    public void setSubscriberAddressSection(InsuranceBusinessDataType.SubscriberAddressSection value) {
        this.subscriberAddressSection = value;
    }

    /**
     * Gets the value of the coverageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.CoverageDetails }
     *     
     */
    public InsuranceBusinessDataType.CoverageDetails getCoverageDetails() {
        return coverageDetails;
    }

    /**
     * Sets the value of the coverageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.CoverageDetails }
     *     
     */
    public void setCoverageDetails(InsuranceBusinessDataType.CoverageDetails value) {
        this.coverageDetails = value;
    }

    /**
     * Gets the value of the comissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionInformationType }
     *     
     */
    public CommissionInformationType getComissionAmount() {
        return comissionAmount;
    }

    /**
     * Sets the value of the comissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionInformationType }
     *     
     */
    public void setComissionAmount(CommissionInformationType value) {
        this.comissionAmount = value;
    }

    /**
     * Gets the value of the insuranceFopSection property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.InsuranceFopSection }
     *     
     */
    public InsuranceBusinessDataType.InsuranceFopSection getInsuranceFopSection() {
        return insuranceFopSection;
    }

    /**
     * Sets the value of the insuranceFopSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.InsuranceFopSection }
     *     
     */
    public void setInsuranceFopSection(InsuranceBusinessDataType.InsuranceFopSection value) {
        this.insuranceFopSection = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setConfirmationNumber(ReservationControlInformationTypeI value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the productKnowledge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productKnowledge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductKnowledge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionDetailsTypeI }
     * 
     * 
     */
    public List<ActionDetailsTypeI> getProductKnowledge() {
        if (productKnowledge == null) {
            productKnowledge = new ArrayList<ActionDetailsTypeI>();
        }
        return this.productKnowledge;
    }

    /**
     * Gets the value of the passengerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceBusinessDataType.PassengerDetails }
     * 
     * 
     */
    public List<InsuranceBusinessDataType.PassengerDetails> getPassengerDetails() {
        if (passengerDetails == null) {
            passengerDetails = new ArrayList<InsuranceBusinessDataType.PassengerDetails>();
        }
        return this.passengerDetails;
    }

    /**
     * Gets the value of the printInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInformationDetailsTypeI }
     *     
     */
    public DocumentInformationDetailsTypeI getPrintInformation() {
        return printInformation;
    }

    /**
     * Sets the value of the printInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInformationDetailsTypeI }
     *     
     */
    public void setPrintInformation(DocumentInformationDetailsTypeI value) {
        this.printInformation = value;
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
     *         &lt;element name="miscelaneous" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_12240S"/&gt;
     *         &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_32298S" minOccurs="0"/&gt;
     *         &lt;element name="contactName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationTypeI" minOccurs="0"/&gt;
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
        "miscelaneous",
        "phoneNumber",
        "contactName"
    })
    public static class ContactDetails {

        @XmlElement(required = true)
        protected MiscellaneousRemarksType12240S miscelaneous;
        protected PhoneAndEmailAddressType32298S phoneNumber;
        protected TravellerInformationTypeI contactName;

        /**
         * Gets the value of the miscelaneous property.
         * 
         * @return
         *     possible object is
         *     {@link MiscellaneousRemarksType12240S }
         *     
         */
        public MiscellaneousRemarksType12240S getMiscelaneous() {
            return miscelaneous;
        }

        /**
         * Sets the value of the miscelaneous property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscellaneousRemarksType12240S }
         *     
         */
        public void setMiscelaneous(MiscellaneousRemarksType12240S value) {
            this.miscelaneous = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneAndEmailAddressType32298S }
         *     
         */
        public PhoneAndEmailAddressType32298S getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneAndEmailAddressType32298S }
         *     
         */
        public void setPhoneNumber(PhoneAndEmailAddressType32298S value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the contactName property.
         * 
         * @return
         *     possible object is
         *     {@link TravellerInformationTypeI }
         *     
         */
        public TravellerInformationTypeI getContactName() {
            return contactName;
        }

        /**
         * Sets the value of the contactName property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravellerInformationTypeI }
         *     
         */
        public void setContactName(TravellerInformationTypeI value) {
            this.contactName = value;
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
     *         &lt;element name="policyDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsurancePolicyType"/&gt;
     *         &lt;element name="coverageInfo" maxOccurs="3" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="coverage" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceCoverageType"/&gt;
     *                   &lt;element name="coverageValues" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="coveredPassenger" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationTypeI_15923S" maxOccurs="3" minOccurs="0"/&gt;
     *         &lt;element name="coverageDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType" minOccurs="0"/&gt;
     *         &lt;element name="subscriptionDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_20644S" minOccurs="0"/&gt;
     *         &lt;element name="agentReferenceDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_9456S" minOccurs="0"/&gt;
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
        "policyDetails",
        "coverageInfo",
        "coveredPassenger",
        "coverageDates",
        "subscriptionDetails",
        "agentReferenceDetails"
    })
    public static class CoverageDetails {

        @XmlElement(required = true)
        protected InsurancePolicyType policyDetails;
        protected List<InsuranceBusinessDataType.CoverageDetails.CoverageInfo> coverageInfo;
        protected List<TravellerInformationTypeI15923S> coveredPassenger;
        protected StructuredPeriodInformationType coverageDates;
        protected StructuredDateTimeInformationType20644S subscriptionDetails;
        protected UserIdentificationType9456S agentReferenceDetails;

        /**
         * Gets the value of the policyDetails property.
         * 
         * @return
         *     possible object is
         *     {@link InsurancePolicyType }
         *     
         */
        public InsurancePolicyType getPolicyDetails() {
            return policyDetails;
        }

        /**
         * Sets the value of the policyDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsurancePolicyType }
         *     
         */
        public void setPolicyDetails(InsurancePolicyType value) {
            this.policyDetails = value;
        }

        /**
         * Gets the value of the coverageInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coverageInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoverageInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InsuranceBusinessDataType.CoverageDetails.CoverageInfo }
         * 
         * 
         */
        public List<InsuranceBusinessDataType.CoverageDetails.CoverageInfo> getCoverageInfo() {
            if (coverageInfo == null) {
                coverageInfo = new ArrayList<InsuranceBusinessDataType.CoverageDetails.CoverageInfo>();
            }
            return this.coverageInfo;
        }

        /**
         * Gets the value of the coveredPassenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coveredPassenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoveredPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravellerInformationTypeI15923S }
         * 
         * 
         */
        public List<TravellerInformationTypeI15923S> getCoveredPassenger() {
            if (coveredPassenger == null) {
                coveredPassenger = new ArrayList<TravellerInformationTypeI15923S>();
            }
            return this.coveredPassenger;
        }

        /**
         * Gets the value of the coverageDates property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredPeriodInformationType }
         *     
         */
        public StructuredPeriodInformationType getCoverageDates() {
            return coverageDates;
        }

        /**
         * Sets the value of the coverageDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredPeriodInformationType }
         *     
         */
        public void setCoverageDates(StructuredPeriodInformationType value) {
            this.coverageDates = value;
        }

        /**
         * Gets the value of the subscriptionDetails property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType20644S }
         *     
         */
        public StructuredDateTimeInformationType20644S getSubscriptionDetails() {
            return subscriptionDetails;
        }

        /**
         * Sets the value of the subscriptionDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType20644S }
         *     
         */
        public void setSubscriptionDetails(StructuredDateTimeInformationType20644S value) {
            this.subscriptionDetails = value;
        }

        /**
         * Gets the value of the agentReferenceDetails property.
         * 
         * @return
         *     possible object is
         *     {@link UserIdentificationType9456S }
         *     
         */
        public UserIdentificationType9456S getAgentReferenceDetails() {
            return agentReferenceDetails;
        }

        /**
         * Sets the value of the agentReferenceDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIdentificationType9456S }
         *     
         */
        public void setAgentReferenceDetails(UserIdentificationType9456S value) {
            this.agentReferenceDetails = value;
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
         *         &lt;element name="coverage" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceCoverageType"/&gt;
         *         &lt;element name="coverageValues" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
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
            "coverage",
            "coverageValues"
        })
        public static class CoverageInfo {

            @XmlElement(required = true)
            protected InsuranceCoverageType coverage;
            protected MonetaryInformationTypeI coverageValues;

            /**
             * Gets the value of the coverage property.
             * 
             * @return
             *     possible object is
             *     {@link InsuranceCoverageType }
             *     
             */
            public InsuranceCoverageType getCoverage() {
                return coverage;
            }

            /**
             * Sets the value of the coverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link InsuranceCoverageType }
             *     
             */
            public void setCoverage(InsuranceCoverageType value) {
                this.coverage = value;
            }

            /**
             * Gets the value of the coverageValues property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getCoverageValues() {
                return coverageValues;
            }

            /**
             * Sets the value of the coverageValues property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setCoverageValues(MonetaryInformationTypeI value) {
                this.coverageValues = value;
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
     *         &lt;element name="formOfPaymentSection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI_16862S"/&gt;
     *         &lt;element name="fopExtendedData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_13270S" maxOccurs="3" minOccurs="0"/&gt;
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
        "formOfPaymentSection",
        "fopExtendedData"
    })
    public static class InsuranceFopSection {

        @XmlElement(required = true)
        protected FormOfPaymentTypeI16862S formOfPaymentSection;
        protected List<StatusTypeI13270S> fopExtendedData;

        /**
         * Gets the value of the formOfPaymentSection property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPaymentTypeI16862S }
         *     
         */
        public FormOfPaymentTypeI16862S getFormOfPaymentSection() {
            return formOfPaymentSection;
        }

        /**
         * Sets the value of the formOfPaymentSection property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPaymentTypeI16862S }
         *     
         */
        public void setFormOfPaymentSection(FormOfPaymentTypeI16862S value) {
            this.formOfPaymentSection = value;
        }

        /**
         * Gets the value of the fopExtendedData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fopExtendedData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFopExtendedData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatusTypeI13270S }
         * 
         * 
         */
        public List<StatusTypeI13270S> getFopExtendedData() {
            if (fopExtendedData == null) {
                fopExtendedData = new ArrayList<StatusTypeI13270S>();
            }
            return this.fopExtendedData;
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
     *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationType"/&gt;
     *         &lt;element name="perPaxProdKnowledge" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ActionDetailsTypeI" maxOccurs="9" minOccurs="0"/&gt;
     *         &lt;element name="dateOfBirthInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_13380S" minOccurs="0"/&gt;
     *         &lt;element name="passengerFeatures" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="insureeRemark" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType" minOccurs="0"/&gt;
     *         &lt;element name="travelerDocInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PassengerDocumentDetailsType" minOccurs="0"/&gt;
     *         &lt;element name="policyDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsurancePolicyType" minOccurs="0"/&gt;
     *         &lt;element name="travelerValueDetails" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="travelCost" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceCoverageType"/&gt;
     *                   &lt;element name="travelAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="premiumPerTariffPerPax" maxOccurs="4" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="tariffCodeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceProductDetailsType_20775S"/&gt;
     *                   &lt;element name="tariffCodePerPaxAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="premiumPerpaxInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_22057S" minOccurs="0"/&gt;
     *         &lt;element name="voucherNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeU_31804S" minOccurs="0"/&gt;
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
        "passengerAssociation",
        "perPaxProdKnowledge",
        "dateOfBirthInfo",
        "passengerFeatures",
        "insureeRemark",
        "travelerDocInfo",
        "policyDetails",
        "travelerValueDetails",
        "premiumPerTariffPerPax",
        "premiumPerpaxInfo",
        "voucherNumber"
    })
    public static class PassengerDetails {

        @XmlElement(required = true)
        protected ReferenceInformationType passengerAssociation;
        protected List<ActionDetailsTypeI> perPaxProdKnowledge;
        protected StructuredDateTimeInformationType13380S dateOfBirthInfo;
        protected List<TravellerInformationType> passengerFeatures;
        protected MiscellaneousRemarksType insureeRemark;
        protected PassengerDocumentDetailsType travelerDocInfo;
        protected InsurancePolicyType policyDetails;
        protected InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails travelerValueDetails;
        protected List<InsuranceBusinessDataType.PassengerDetails.PremiumPerTariffPerPax> premiumPerTariffPerPax;
        protected TariffInformationTypeI22057S premiumPerpaxInfo;
        protected ReservationControlInformationTypeU31804S voucherNumber;

        /**
         * Gets the value of the passengerAssociation property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationType }
         *     
         */
        public ReferenceInformationType getPassengerAssociation() {
            return passengerAssociation;
        }

        /**
         * Sets the value of the passengerAssociation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationType }
         *     
         */
        public void setPassengerAssociation(ReferenceInformationType value) {
            this.passengerAssociation = value;
        }

        /**
         * Gets the value of the perPaxProdKnowledge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the perPaxProdKnowledge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPerPaxProdKnowledge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionDetailsTypeI }
         * 
         * 
         */
        public List<ActionDetailsTypeI> getPerPaxProdKnowledge() {
            if (perPaxProdKnowledge == null) {
                perPaxProdKnowledge = new ArrayList<ActionDetailsTypeI>();
            }
            return this.perPaxProdKnowledge;
        }

        /**
         * Gets the value of the dateOfBirthInfo property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType13380S }
         *     
         */
        public StructuredDateTimeInformationType13380S getDateOfBirthInfo() {
            return dateOfBirthInfo;
        }

        /**
         * Sets the value of the dateOfBirthInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType13380S }
         *     
         */
        public void setDateOfBirthInfo(StructuredDateTimeInformationType13380S value) {
            this.dateOfBirthInfo = value;
        }

        /**
         * Gets the value of the passengerFeatures property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerFeatures property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerFeatures().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravellerInformationType }
         * 
         * 
         */
        public List<TravellerInformationType> getPassengerFeatures() {
            if (passengerFeatures == null) {
                passengerFeatures = new ArrayList<TravellerInformationType>();
            }
            return this.passengerFeatures;
        }

        /**
         * Gets the value of the insureeRemark property.
         * 
         * @return
         *     possible object is
         *     {@link MiscellaneousRemarksType }
         *     
         */
        public MiscellaneousRemarksType getInsureeRemark() {
            return insureeRemark;
        }

        /**
         * Sets the value of the insureeRemark property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscellaneousRemarksType }
         *     
         */
        public void setInsureeRemark(MiscellaneousRemarksType value) {
            this.insureeRemark = value;
        }

        /**
         * Gets the value of the travelerDocInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerDocumentDetailsType }
         *     
         */
        public PassengerDocumentDetailsType getTravelerDocInfo() {
            return travelerDocInfo;
        }

        /**
         * Sets the value of the travelerDocInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerDocumentDetailsType }
         *     
         */
        public void setTravelerDocInfo(PassengerDocumentDetailsType value) {
            this.travelerDocInfo = value;
        }

        /**
         * Gets the value of the policyDetails property.
         * 
         * @return
         *     possible object is
         *     {@link InsurancePolicyType }
         *     
         */
        public InsurancePolicyType getPolicyDetails() {
            return policyDetails;
        }

        /**
         * Sets the value of the policyDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsurancePolicyType }
         *     
         */
        public void setPolicyDetails(InsurancePolicyType value) {
            this.policyDetails = value;
        }

        /**
         * Gets the value of the travelerValueDetails property.
         * 
         * @return
         *     possible object is
         *     {@link InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails }
         *     
         */
        public InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails getTravelerValueDetails() {
            return travelerValueDetails;
        }

        /**
         * Sets the value of the travelerValueDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails }
         *     
         */
        public void setTravelerValueDetails(InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails value) {
            this.travelerValueDetails = value;
        }

        /**
         * Gets the value of the premiumPerTariffPerPax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the premiumPerTariffPerPax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPremiumPerTariffPerPax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InsuranceBusinessDataType.PassengerDetails.PremiumPerTariffPerPax }
         * 
         * 
         */
        public List<InsuranceBusinessDataType.PassengerDetails.PremiumPerTariffPerPax> getPremiumPerTariffPerPax() {
            if (premiumPerTariffPerPax == null) {
                premiumPerTariffPerPax = new ArrayList<InsuranceBusinessDataType.PassengerDetails.PremiumPerTariffPerPax>();
            }
            return this.premiumPerTariffPerPax;
        }

        /**
         * Gets the value of the premiumPerpaxInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeI22057S }
         *     
         */
        public TariffInformationTypeI22057S getPremiumPerpaxInfo() {
            return premiumPerpaxInfo;
        }

        /**
         * Sets the value of the premiumPerpaxInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeI22057S }
         *     
         */
        public void setPremiumPerpaxInfo(TariffInformationTypeI22057S value) {
            this.premiumPerpaxInfo = value;
        }

        /**
         * Gets the value of the voucherNumber property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformationTypeU31804S }
         *     
         */
        public ReservationControlInformationTypeU31804S getVoucherNumber() {
            return voucherNumber;
        }

        /**
         * Sets the value of the voucherNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformationTypeU31804S }
         *     
         */
        public void setVoucherNumber(ReservationControlInformationTypeU31804S value) {
            this.voucherNumber = value;
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
         *         &lt;element name="tariffCodeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceProductDetailsType_20775S"/&gt;
         *         &lt;element name="tariffCodePerPaxAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
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
            "tariffCodeInfo",
            "tariffCodePerPaxAmount"
        })
        public static class PremiumPerTariffPerPax {

            @XmlElement(required = true)
            protected InsuranceProductDetailsType20775S tariffCodeInfo;
            protected MonetaryInformationTypeI tariffCodePerPaxAmount;

            /**
             * Gets the value of the tariffCodeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link InsuranceProductDetailsType20775S }
             *     
             */
            public InsuranceProductDetailsType20775S getTariffCodeInfo() {
                return tariffCodeInfo;
            }

            /**
             * Sets the value of the tariffCodeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link InsuranceProductDetailsType20775S }
             *     
             */
            public void setTariffCodeInfo(InsuranceProductDetailsType20775S value) {
                this.tariffCodeInfo = value;
            }

            /**
             * Gets the value of the tariffCodePerPaxAmount property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getTariffCodePerPaxAmount() {
                return tariffCodePerPaxAmount;
            }

            /**
             * Sets the value of the tariffCodePerPaxAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setTariffCodePerPaxAmount(MonetaryInformationTypeI value) {
                this.tariffCodePerPaxAmount = value;
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
         *         &lt;element name="travelCost" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceCoverageType"/&gt;
         *         &lt;element name="travelAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
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
            "travelCost",
            "travelAmount"
        })
        public static class TravelerValueDetails {

            @XmlElement(required = true)
            protected InsuranceCoverageType travelCost;
            protected MonetaryInformationTypeI travelAmount;

            /**
             * Gets the value of the travelCost property.
             * 
             * @return
             *     possible object is
             *     {@link InsuranceCoverageType }
             *     
             */
            public InsuranceCoverageType getTravelCost() {
                return travelCost;
            }

            /**
             * Sets the value of the travelCost property.
             * 
             * @param value
             *     allowed object is
             *     {@link InsuranceCoverageType }
             *     
             */
            public void setTravelCost(InsuranceCoverageType value) {
                this.travelCost = value;
            }

            /**
             * Gets the value of the travelAmount property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getTravelAmount() {
                return travelAmount;
            }

            /**
             * Sets the value of the travelAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setTravelAmount(MonetaryInformationTypeI value) {
                this.travelAmount = value;
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
     *         &lt;element name="planType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceProviderAndProductsType"/&gt;
     *         &lt;element name="travelValue" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI" minOccurs="0"/&gt;
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
        "planType",
        "travelValue"
    })
    public static class PlanTypeDetails {

        @XmlElement(required = true)
        protected InsuranceProviderAndProductsType planType;
        protected MonetaryInformationTypeI travelValue;

        /**
         * Gets the value of the planType property.
         * 
         * @return
         *     possible object is
         *     {@link InsuranceProviderAndProductsType }
         *     
         */
        public InsuranceProviderAndProductsType getPlanType() {
            return planType;
        }

        /**
         * Sets the value of the planType property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsuranceProviderAndProductsType }
         *     
         */
        public void setPlanType(InsuranceProviderAndProductsType value) {
            this.planType = value;
        }

        /**
         * Gets the value of the travelValue property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public MonetaryInformationTypeI getTravelValue() {
            return travelValue;
        }

        /**
         * Sets the value of the travelValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationTypeI }
         *     
         */
        public void setTravelValue(MonetaryInformationTypeI value) {
            this.travelValue = value;
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
     *         &lt;element name="productCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceProductDetailsType_20774S"/&gt;
     *         &lt;element name="informationLines" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_6235S" minOccurs="0"/&gt;
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
        "productCode",
        "informationLines"
    })
    public static class ProductSection {

        @XmlElement(required = true)
        protected InsuranceProductDetailsType20774S productCode;
        protected FreeTextInformationType6235S informationLines;

        /**
         * Gets the value of the productCode property.
         * 
         * @return
         *     possible object is
         *     {@link InsuranceProductDetailsType20774S }
         *     
         */
        public InsuranceProductDetailsType20774S getProductCode() {
            return productCode;
        }

        /**
         * Sets the value of the productCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsuranceProductDetailsType20774S }
         *     
         */
        public void setProductCode(InsuranceProductDetailsType20774S value) {
            this.productCode = value;
        }

        /**
         * Gets the value of the informationLines property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextInformationType6235S }
         *     
         */
        public FreeTextInformationType6235S getInformationLines() {
            return informationLines;
        }

        /**
         * Sets the value of the informationLines property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextInformationType6235S }
         *     
         */
        public void setInformationLines(FreeTextInformationType6235S value) {
            this.informationLines = value;
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
     *         &lt;element name="nameDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameTypeU"/&gt;
     *         &lt;element name="addressInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU" minOccurs="0"/&gt;
     *         &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_32298S" minOccurs="0"/&gt;
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
        "nameDetails",
        "addressInfo",
        "phoneNumber"
    })
    public static class SubscriberAddressSection {

        @XmlElement(required = true)
        protected NameTypeU nameDetails;
        protected AddressTypeU addressInfo;
        protected PhoneAndEmailAddressType32298S phoneNumber;

        /**
         * Gets the value of the nameDetails property.
         * 
         * @return
         *     possible object is
         *     {@link NameTypeU }
         *     
         */
        public NameTypeU getNameDetails() {
            return nameDetails;
        }

        /**
         * Sets the value of the nameDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link NameTypeU }
         *     
         */
        public void setNameDetails(NameTypeU value) {
            this.nameDetails = value;
        }

        /**
         * Gets the value of the addressInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AddressTypeU }
         *     
         */
        public AddressTypeU getAddressInfo() {
            return addressInfo;
        }

        /**
         * Sets the value of the addressInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressTypeU }
         *     
         */
        public void setAddressInfo(AddressTypeU value) {
            this.addressInfo = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneAndEmailAddressType32298S }
         *     
         */
        public PhoneAndEmailAddressType32298S getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneAndEmailAddressType32298S }
         *     
         */
        public void setPhoneNumber(PhoneAndEmailAddressType32298S value) {
            this.phoneNumber = value;
        }

    }

}
