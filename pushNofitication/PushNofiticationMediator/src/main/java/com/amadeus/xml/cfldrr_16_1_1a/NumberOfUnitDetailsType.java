
package com.amadeus.xml.cfldrr_16_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of number of units and its purpose.
 * 
 * <p>Java class for NumberOfUnitDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfUnit" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}NumericInteger_Length1To4"/>
 *         &lt;element name="unitQualifier" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AMA_EDICodesetType_Length1to3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitDetailsType", propOrder = {
    "numberOfUnit",
    "unitQualifier"
})
public class NumberOfUnitDetailsType {

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
