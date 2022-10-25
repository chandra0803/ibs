
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structured address information
 * 
 * <p>Java class for StructuredAddressInformationType_5063C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredAddressInformationType_5063C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="option" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To2"/&gt;
 *         &lt;element name="optionText" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To50"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredAddressInformationType_5063C", propOrder = {
    "option",
    "optionText"
})
public class StructuredAddressInformationType5063C {

    @XmlElement(required = true)
    protected String option;
    @XmlElement(required = true)
    protected String optionText;

    /**
     * Gets the value of the option property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOption(String value) {
        this.option = value;
    }

    /**
     * Gets the value of the optionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionText() {
        return optionText;
    }

    /**
     * Sets the value of the optionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionText(String value) {
        this.optionText = value;
    }

}
