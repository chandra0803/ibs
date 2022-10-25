
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structured address information
 * 
 * <p>Java class for StructuredAddressInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredAddressInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="optionA1" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To2"/&gt;
 *         &lt;element name="optionTextA1" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To50"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredAddressInformationType", propOrder = {
    "optionA1",
    "optionTextA1"
})
public class StructuredAddressInformationType {

    @XmlElement(required = true)
    protected String optionA1;
    @XmlElement(required = true)
    protected String optionTextA1;

    /**
     * Gets the value of the optionA1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionA1() {
        return optionA1;
    }

    /**
     * Sets the value of the optionA1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionA1(String value) {
        this.optionA1 = value;
    }

    /**
     * Gets the value of the optionTextA1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionTextA1() {
        return optionTextA1;
    }

    /**
     * Sets the value of the optionTextA1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionTextA1(String value) {
        this.optionTextA1 = value;
    }

}
