
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey Mean Of Payment specific data
 * 
 * <p>Java class for MeanOfPaymentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeanOfPaymentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentType"/>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
 *         &lt;element name="creditCardData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CreditCardDataGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeanOfPaymentDataType", propOrder = {
    "fopInformation",
    "dummy",
    "creditCardData"
})
public class MeanOfPaymentDataType {

    @XmlElement(required = true)
    protected FormOfPaymentType fopInformation;
    @XmlElement(required = true)
    protected DummySegmentTypeI dummy;
    protected CreditCardDataGroupType creditCardData;

    /**
     * Gets the value of the fopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentType }
     *     
     */
    public FormOfPaymentType getFopInformation() {
        return fopInformation;
    }

    /**
     * Sets the value of the fopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentType }
     *     
     */
    public void setFopInformation(FormOfPaymentType value) {
        this.fopInformation = value;
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
     * Gets the value of the creditCardData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataGroupType }
     *     
     */
    public CreditCardDataGroupType getCreditCardData() {
        return creditCardData;
    }

    /**
     * Sets the value of the creditCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataGroupType }
     *     
     */
    public void setCreditCardData(CreditCardDataGroupType value) {
        this.creditCardData = value;
    }

}
