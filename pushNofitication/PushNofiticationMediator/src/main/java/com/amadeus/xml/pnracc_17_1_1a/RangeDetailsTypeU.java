
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a range.
 * 
 * <p>Java class for RangeDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rangeQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="rangeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeDetailsTypeU", propOrder = {
    "rangeQualifier",
    "rangeDetails"
})
public class RangeDetailsTypeU {

    @XmlElement(required = true)
    protected String rangeQualifier;
    @XmlElement(required = true)
    protected RangeTypeU rangeDetails;

    /**
     * Gets the value of the rangeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeQualifier() {
        return rangeQualifier;
    }

    /**
     * Sets the value of the rangeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeQualifier(String value) {
        this.rangeQualifier = value;
    }

    /**
     * Gets the value of the rangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RangeTypeU }
     *     
     */
    public RangeTypeU getRangeDetails() {
        return rangeDetails;
    }

    /**
     * Sets the value of the rangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeTypeU }
     *     
     */
    public void setRangeDetails(RangeTypeU value) {
        this.rangeDetails = value;
    }

}
