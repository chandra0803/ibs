
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Store date and time in a structured way
 * 
 * <p>Java class for StructuredDateTimeType_198234C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeType_198234C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2"/&gt;
 *         &lt;element name="minutes" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeType_198234C", propOrder = {
    "hour",
    "minutes"
})
public class StructuredDateTimeType198234C {

    @XmlElement(required = true)
    protected BigInteger hour;
    @XmlElement(required = true)
    protected BigInteger minutes;

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHour(BigInteger value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinutes(BigInteger value) {
        this.minutes = value;
    }

}
