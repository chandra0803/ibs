
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the distance/duration of a trip.
 * 
 * <p>Java class for MileageTimeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MileageTimeDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightLegMileage" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To18" minOccurs="0"/&gt;
 *         &lt;element name="unitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MileageTimeDetailsTypeI", propOrder = {
    "flightLegMileage",
    "unitQualifier"
})
public class MileageTimeDetailsTypeI {

    protected BigInteger flightLegMileage;
    protected String unitQualifier;

    /**
     * Gets the value of the flightLegMileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightLegMileage() {
        return flightLegMileage;
    }

    /**
     * Sets the value of the flightLegMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlightLegMileage(BigInteger value) {
        this.flightLegMileage = value;
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
