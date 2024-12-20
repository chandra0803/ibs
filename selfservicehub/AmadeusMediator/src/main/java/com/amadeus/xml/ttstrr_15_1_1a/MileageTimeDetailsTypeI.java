
package com.amadeus.xml.ttstrr_15_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="totalMileage" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}NumericInteger_Length1To8"/&gt;
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
    "totalMileage"
})
public class MileageTimeDetailsTypeI {

    @XmlElement(required = true)
    protected BigInteger totalMileage;

    /**
     * Gets the value of the totalMileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMileage() {
        return totalMileage;
    }

    /**
     * Sets the value of the totalMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMileage(BigInteger value) {
        this.totalMileage = value;
    }

}
