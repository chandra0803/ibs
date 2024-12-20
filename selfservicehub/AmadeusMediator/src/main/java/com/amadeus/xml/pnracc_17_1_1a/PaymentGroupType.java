
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic group to convey payment related data
 * 
 * <p>Java class for PaymentGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupUsage" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127282S"/&gt;
 *         &lt;element name="paymentData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentDataGroupType" minOccurs="0"/&gt;
 *         &lt;element name="paymentSupplementaryData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_94497S" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="mopInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeanOfPaymentDataType" minOccurs="0"/&gt;
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/&gt;
 *         &lt;element name="mopDetailedData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DetailedPaymentDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentGroupType", propOrder = {
    "groupUsage",
    "paymentData",
    "paymentSupplementaryData",
    "mopInformation",
    "dummy",
    "mopDetailedData"
})
public class PaymentGroupType {

    @XmlElement(required = true)
    protected CodedAttributeType127282S groupUsage;
    protected PaymentDataGroupType paymentData;
    protected List<CodedAttributeType94497S> paymentSupplementaryData;
    protected MeanOfPaymentDataType mopInformation;
    @XmlElement(required = true)
    protected DummySegmentTypeI dummy;
    protected DetailedPaymentDataType mopDetailedData;

    /**
     * Gets the value of the groupUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType127282S }
     *     
     */
    public CodedAttributeType127282S getGroupUsage() {
        return groupUsage;
    }

    /**
     * Sets the value of the groupUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType127282S }
     *     
     */
    public void setGroupUsage(CodedAttributeType127282S value) {
        this.groupUsage = value;
    }

    /**
     * Gets the value of the paymentData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDataGroupType }
     *     
     */
    public PaymentDataGroupType getPaymentData() {
        return paymentData;
    }

    /**
     * Sets the value of the paymentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDataGroupType }
     *     
     */
    public void setPaymentData(PaymentDataGroupType value) {
        this.paymentData = value;
    }

    /**
     * Gets the value of the paymentSupplementaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentSupplementaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentSupplementaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeType94497S }
     * 
     * 
     */
    public List<CodedAttributeType94497S> getPaymentSupplementaryData() {
        if (paymentSupplementaryData == null) {
            paymentSupplementaryData = new ArrayList<CodedAttributeType94497S>();
        }
        return this.paymentSupplementaryData;
    }

    /**
     * Gets the value of the mopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MeanOfPaymentDataType }
     *     
     */
    public MeanOfPaymentDataType getMopInformation() {
        return mopInformation;
    }

    /**
     * Sets the value of the mopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeanOfPaymentDataType }
     *     
     */
    public void setMopInformation(MeanOfPaymentDataType value) {
        this.mopInformation = value;
    }

    /**
     * Gets the value of the dummy property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public DummySegmentTypeI getDummy() {
        return dummy;
    }

    /**
     * Sets the value of the dummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public void setDummy(DummySegmentTypeI value) {
        this.dummy = value;
    }

    /**
     * Gets the value of the mopDetailedData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPaymentDataType }
     *     
     */
    public DetailedPaymentDataType getMopDetailedData() {
        return mopDetailedData;
    }

    /**
     * Sets the value of the mopDetailedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPaymentDataType }
     *     
     */
    public void setMopDetailedData(DetailedPaymentDataType value) {
        this.mopDetailedData = value;
    }

}
