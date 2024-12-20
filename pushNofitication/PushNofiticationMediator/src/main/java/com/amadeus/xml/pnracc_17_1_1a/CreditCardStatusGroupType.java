
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all the detailed payment status related to credit Card
 * 
 * <p>Java class for CreditCardStatusGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardStatusGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorisationSupplementaryData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecificVisaLinkCreditCardInformationType"/>
 *         &lt;element name="approvalDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}GenericAuthorisationResultType" minOccurs="0"/>
 *         &lt;element name="localDateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_206505S" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="authorisationInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TransactionInformationForTicketingType" minOccurs="0"/>
 *         &lt;element name="browserData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="browserProperties" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BrowserInformationType"/>
 *                   &lt;element name="freeFlowBrowserData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_94526S" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tdsInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ThreeDomainSecureGroupType" minOccurs="0"/>
 *         &lt;element name="cardSupplementaryData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType_94514S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="transactionStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardStatusGroupType", propOrder = {
    "authorisationSupplementaryData",
    "approvalDetails",
    "localDateTime",
    "authorisationInformation",
    "browserData",
    "tdsInformation",
    "cardSupplementaryData",
    "transactionStatus"
})
public class CreditCardStatusGroupType {

    @XmlElement(required = true)
    protected SpecificVisaLinkCreditCardInformationType authorisationSupplementaryData;
    protected GenericAuthorisationResultType approvalDetails;
    protected List<StructuredDateTimeInformationType206505S> localDateTime;
    protected TransactionInformationForTicketingType authorisationInformation;
    protected CreditCardStatusGroupType.BrowserData browserData;
    protected ThreeDomainSecureGroupType tdsInformation;
    protected List<AttributeType94514S> cardSupplementaryData;
    protected List<ErrorGroupType> transactionStatus;

    /**
     * Gets the value of the authorisationSupplementaryData property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificVisaLinkCreditCardInformationType }
     *     
     */
    public SpecificVisaLinkCreditCardInformationType getAuthorisationSupplementaryData() {
        return authorisationSupplementaryData;
    }

    /**
     * Sets the value of the authorisationSupplementaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificVisaLinkCreditCardInformationType }
     *     
     */
    public void setAuthorisationSupplementaryData(SpecificVisaLinkCreditCardInformationType value) {
        this.authorisationSupplementaryData = value;
    }

    /**
     * Gets the value of the approvalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAuthorisationResultType }
     *     
     */
    public GenericAuthorisationResultType getApprovalDetails() {
        return approvalDetails;
    }

    /**
     * Sets the value of the approvalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAuthorisationResultType }
     *     
     */
    public void setApprovalDetails(GenericAuthorisationResultType value) {
        this.approvalDetails = value;
    }

    /**
     * Gets the value of the localDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredDateTimeInformationType206505S }
     * 
     * 
     */
    public List<StructuredDateTimeInformationType206505S> getLocalDateTime() {
        if (localDateTime == null) {
            localDateTime = new ArrayList<StructuredDateTimeInformationType206505S>();
        }
        return this.localDateTime;
    }

    /**
     * Gets the value of the authorisationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationForTicketingType }
     *     
     */
    public TransactionInformationForTicketingType getAuthorisationInformation() {
        return authorisationInformation;
    }

    /**
     * Sets the value of the authorisationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationForTicketingType }
     *     
     */
    public void setAuthorisationInformation(TransactionInformationForTicketingType value) {
        this.authorisationInformation = value;
    }

    /**
     * Gets the value of the browserData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardStatusGroupType.BrowserData }
     *     
     */
    public CreditCardStatusGroupType.BrowserData getBrowserData() {
        return browserData;
    }

    /**
     * Sets the value of the browserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardStatusGroupType.BrowserData }
     *     
     */
    public void setBrowserData(CreditCardStatusGroupType.BrowserData value) {
        this.browserData = value;
    }

    /**
     * Gets the value of the tdsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDomainSecureGroupType }
     *     
     */
    public ThreeDomainSecureGroupType getTdsInformation() {
        return tdsInformation;
    }

    /**
     * Sets the value of the tdsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDomainSecureGroupType }
     *     
     */
    public void setTdsInformation(ThreeDomainSecureGroupType value) {
        this.tdsInformation = value;
    }

    /**
     * Gets the value of the cardSupplementaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardSupplementaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardSupplementaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType94514S }
     * 
     * 
     */
    public List<AttributeType94514S> getCardSupplementaryData() {
        if (cardSupplementaryData == null) {
            cardSupplementaryData = new ArrayList<AttributeType94514S>();
        }
        return this.cardSupplementaryData;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorGroupType }
     * 
     * 
     */
    public List<ErrorGroupType> getTransactionStatus() {
        if (transactionStatus == null) {
            transactionStatus = new ArrayList<ErrorGroupType>();
        }
        return this.transactionStatus;
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
     *         &lt;element name="browserProperties" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BrowserInformationType"/>
     *         &lt;element name="freeFlowBrowserData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_94526S" maxOccurs="2" minOccurs="0"/>
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
        "browserProperties",
        "freeFlowBrowserData"
    })
    public static class BrowserData {

        @XmlElement(required = true)
        protected BrowserInformationType browserProperties;
        protected List<FreeTextInformationType94526S> freeFlowBrowserData;

        /**
         * Gets the value of the browserProperties property.
         * 
         * @return
         *     possible object is
         *     {@link BrowserInformationType }
         *     
         */
        public BrowserInformationType getBrowserProperties() {
            return browserProperties;
        }

        /**
         * Sets the value of the browserProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link BrowserInformationType }
         *     
         */
        public void setBrowserProperties(BrowserInformationType value) {
            this.browserProperties = value;
        }

        /**
         * Gets the value of the freeFlowBrowserData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeFlowBrowserData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeFlowBrowserData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeTextInformationType94526S }
         * 
         * 
         */
        public List<FreeTextInformationType94526S> getFreeFlowBrowserData() {
            if (freeFlowBrowserData == null) {
                freeFlowBrowserData = new ArrayList<FreeTextInformationType94526S>();
            }
            return this.freeFlowBrowserData;
        }

    }

}
