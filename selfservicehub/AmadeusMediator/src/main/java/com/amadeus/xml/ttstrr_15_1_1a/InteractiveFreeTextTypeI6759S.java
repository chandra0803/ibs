
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide error free text information.
 * 
 * <p>Java class for InteractiveFreeTextTypeI_6759S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractiveFreeTextTypeI_6759S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorFreeText" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractiveFreeTextTypeI_6759S", propOrder = {
    "errorFreeText"
})
public class InteractiveFreeTextTypeI6759S {

    protected String errorFreeText;

    /**
     * Gets the value of the errorFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorFreeText() {
        return errorFreeText;
    }

    /**
     * Sets the value of the errorFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorFreeText(String value) {
        this.errorFreeText = value;
    }

}
