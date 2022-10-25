
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Range minimum and maximum limits.
 * 
 * <p>Java class for RangeTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="minOccupancy" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="maxOccupancy" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeTypeU", propOrder = {
    "dataType",
    "minOccupancy",
    "maxOccupancy"
})
public class RangeTypeU {

    @XmlElement(required = true)
    protected String dataType;
    protected BigInteger minOccupancy;
    @XmlElement(required = true)
    protected BigInteger maxOccupancy;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the minOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinOccupancy() {
        return minOccupancy;
    }

    /**
     * Sets the value of the minOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinOccupancy(BigInteger value) {
        this.minOccupancy = value;
    }

    /**
     * Gets the value of the maxOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Sets the value of the maxOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOccupancy(BigInteger value) {
        this.maxOccupancy = value;
    }

}
