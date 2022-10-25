
package com.amadeus.xml.acsfrr_16_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of number of units and its purpose.
 * 
 * <p>Java class for NumberOfUnitDetailsType_179174C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitDetailsType_179174C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfUnit" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumericInteger_Length1To15"/>
 *         &lt;element name="unitQualifier" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitDetailsType_179174C", propOrder = {
    "numberOfUnit",
    "unitQualifier"
})
public class NumberOfUnitDetailsType179174C {

    @XmlElement(required = true)
    protected BigInteger numberOfUnit;
    @XmlElement(required = true)
    protected String unitQualifier;

    /**
     * Gets the value of the numberOfUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnit() {
        return numberOfUnit;
    }

    /**
     * Sets the value of the numberOfUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnit(BigInteger value) {
        this.numberOfUnit = value;
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
