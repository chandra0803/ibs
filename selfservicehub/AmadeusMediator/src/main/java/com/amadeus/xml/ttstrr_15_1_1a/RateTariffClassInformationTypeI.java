
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the current and/or original fare basis code.
 * 
 * <p>Java class for RateTariffClassInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateTariffClassInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tstIndicator" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTariffClassInformationTypeI", propOrder = {
    "tstIndicator"
})
public class RateTariffClassInformationTypeI {

    @XmlElement(required = true)
    protected String tstIndicator;

    /**
     * Gets the value of the tstIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTstIndicator() {
        return tstIndicator;
    }

    /**
     * Sets the value of the tstIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTstIndicator(String value) {
        this.tstIndicator = value;
    }

}
