
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To transmit tax data as it should appear in the tax boxes of the ticket.
 * 
 * <p>Java class for DutyTaxFeeDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyTaxFeeDetailsTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxQualifier" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To1"/&gt;
 *         &lt;element name="taxIdentification" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DutyTaxFeeTypeDetailsTypeU"/&gt;
 *         &lt;element name="taxType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DutyTaxFeeAccountDetailTypeU" minOccurs="0"/&gt;
 *         &lt;element name="taxNature" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="taxExempt" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyTaxFeeDetailsTypeU", propOrder = {
    "taxQualifier",
    "taxIdentification",
    "taxType",
    "taxNature",
    "taxExempt"
})
public class DutyTaxFeeDetailsTypeU {

    @XmlElement(required = true)
    protected String taxQualifier;
    @XmlElement(required = true)
    protected DutyTaxFeeTypeDetailsTypeU taxIdentification;
    protected DutyTaxFeeAccountDetailTypeU taxType;
    protected String taxNature;
    protected String taxExempt;

    /**
     * Gets the value of the taxQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxQualifier() {
        return taxQualifier;
    }

    /**
     * Sets the value of the taxQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxQualifier(String value) {
        this.taxQualifier = value;
    }

    /**
     * Gets the value of the taxIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DutyTaxFeeTypeDetailsTypeU }
     *     
     */
    public DutyTaxFeeTypeDetailsTypeU getTaxIdentification() {
        return taxIdentification;
    }

    /**
     * Sets the value of the taxIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTaxFeeTypeDetailsTypeU }
     *     
     */
    public void setTaxIdentification(DutyTaxFeeTypeDetailsTypeU value) {
        this.taxIdentification = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link DutyTaxFeeAccountDetailTypeU }
     *     
     */
    public DutyTaxFeeAccountDetailTypeU getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTaxFeeAccountDetailTypeU }
     *     
     */
    public void setTaxType(DutyTaxFeeAccountDetailTypeU value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the taxNature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNature() {
        return taxNature;
    }

    /**
     * Sets the value of the taxNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNature(String value) {
        this.taxNature = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExempt(String value) {
        this.taxExempt = value;
    }

}
