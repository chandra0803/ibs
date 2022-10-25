
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * it will conveys all payment data
 * 
 * <p>Java class for PaymentDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDataGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="merchantInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_94554S"/&gt;
 *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationType_94557S" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="paymentId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemReferencesAndVersionsType_94556S" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="extendedPaymentInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequencyTypeU" minOccurs="0"/&gt;
 *         &lt;element name="transactionDateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_206504S" minOccurs="0"/&gt;
 *         &lt;element name="expirationPeriod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityType_94558S" minOccurs="0"/&gt;
 *         &lt;element name="distributionChannelInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TerminalIdentificationDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="purchaseDescription" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_79018S" minOccurs="0"/&gt;
 *         &lt;element name="fraudScreeningData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FraudScreeningGroupType" minOccurs="0"/&gt;
 *         &lt;element name="paymentDataMap" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType_94553S" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDataGroupType", propOrder = {
    "merchantInformation",
    "monetaryInformation",
    "paymentId",
    "extendedPaymentInfo",
    "transactionDateTime",
    "expirationPeriod",
    "distributionChannelInformation",
    "purchaseDescription",
    "fraudScreeningData",
    "paymentDataMap"
})
public class PaymentDataGroupType {

    @XmlElement(required = true)
    protected CompanyInformationType94554S merchantInformation;
    protected List<MonetaryInformationType94557S> monetaryInformation;
    protected List<ItemReferencesAndVersionsType94556S> paymentId;
    protected FrequencyTypeU extendedPaymentInfo;
    protected StructuredDateTimeInformationType206504S transactionDateTime;
    protected QuantityType94558S expirationPeriod;
    protected TerminalIdentificationDescriptionType distributionChannelInformation;
    protected FreeTextInformationType79018S purchaseDescription;
    protected FraudScreeningGroupType fraudScreeningData;
    protected List<AttributeType94553S> paymentDataMap;

    /**
     * Gets the value of the merchantInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType94554S }
     *     
     */
    public CompanyInformationType94554S getMerchantInformation() {
        return merchantInformation;
    }

    /**
     * Sets the value of the merchantInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType94554S }
     *     
     */
    public void setMerchantInformation(CompanyInformationType94554S value) {
        this.merchantInformation = value;
    }

    /**
     * Gets the value of the monetaryInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationType94557S }
     * 
     * 
     */
    public List<MonetaryInformationType94557S> getMonetaryInformation() {
        if (monetaryInformation == null) {
            monetaryInformation = new ArrayList<MonetaryInformationType94557S>();
        }
        return this.monetaryInformation;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemReferencesAndVersionsType94556S }
     * 
     * 
     */
    public List<ItemReferencesAndVersionsType94556S> getPaymentId() {
        if (paymentId == null) {
            paymentId = new ArrayList<ItemReferencesAndVersionsType94556S>();
        }
        return this.paymentId;
    }

    /**
     * Gets the value of the extendedPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyTypeU }
     *     
     */
    public FrequencyTypeU getExtendedPaymentInfo() {
        return extendedPaymentInfo;
    }

    /**
     * Sets the value of the extendedPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyTypeU }
     *     
     */
    public void setExtendedPaymentInfo(FrequencyTypeU value) {
        this.extendedPaymentInfo = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType206504S }
     *     
     */
    public StructuredDateTimeInformationType206504S getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType206504S }
     *     
     */
    public void setTransactionDateTime(StructuredDateTimeInformationType206504S value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the expirationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType94558S }
     *     
     */
    public QuantityType94558S getExpirationPeriod() {
        return expirationPeriod;
    }

    /**
     * Sets the value of the expirationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType94558S }
     *     
     */
    public void setExpirationPeriod(QuantityType94558S value) {
        this.expirationPeriod = value;
    }

    /**
     * Gets the value of the distributionChannelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIdentificationDescriptionType }
     *     
     */
    public TerminalIdentificationDescriptionType getDistributionChannelInformation() {
        return distributionChannelInformation;
    }

    /**
     * Sets the value of the distributionChannelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIdentificationDescriptionType }
     *     
     */
    public void setDistributionChannelInformation(TerminalIdentificationDescriptionType value) {
        this.distributionChannelInformation = value;
    }

    /**
     * Gets the value of the purchaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType79018S }
     *     
     */
    public FreeTextInformationType79018S getPurchaseDescription() {
        return purchaseDescription;
    }

    /**
     * Sets the value of the purchaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType79018S }
     *     
     */
    public void setPurchaseDescription(FreeTextInformationType79018S value) {
        this.purchaseDescription = value;
    }

    /**
     * Gets the value of the fraudScreeningData property.
     * 
     * @return
     *     possible object is
     *     {@link FraudScreeningGroupType }
     *     
     */
    public FraudScreeningGroupType getFraudScreeningData() {
        return fraudScreeningData;
    }

    /**
     * Sets the value of the fraudScreeningData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudScreeningGroupType }
     *     
     */
    public void setFraudScreeningData(FraudScreeningGroupType value) {
        this.fraudScreeningData = value;
    }

    /**
     * Gets the value of the paymentDataMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDataMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDataMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType94553S }
     * 
     * 
     */
    public List<AttributeType94553S> getPaymentDataMap() {
        if (paymentDataMap == null) {
            paymentDataMap = new ArrayList<AttributeType94553S>();
        }
        return this.paymentDataMap;
    }

}
