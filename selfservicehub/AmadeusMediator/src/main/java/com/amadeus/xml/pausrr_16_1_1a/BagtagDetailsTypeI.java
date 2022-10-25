
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify baggage by company identification, serial numbers, and destination.
 * 
 * <p>Java class for BagtagDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagtagDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To35"/&gt;
 *         &lt;element name="unitQualifier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagtagDetailsTypeI", propOrder = {
    "identifier",
    "unitQualifier"
})
public class BagtagDetailsTypeI {

    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected String unitQualifier;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the unitQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /**
     * Sets the value of the unitQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitQualifier(String value) {
        this.unitQualifier = value;
    }

}
