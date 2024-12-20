
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * provide additional flight information
 * 
 * <p>Java class for OtherSegmentDataTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherSegmentDataTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2"/>
 *         &lt;element name="subclass" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="flightType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="overbooking" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length2To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherSegmentDataTypeI", propOrder = {
    "cabin",
    "subclass",
    "flightType",
    "overbooking"
})
public class OtherSegmentDataTypeI {

    @XmlElement(required = true)
    protected String cabin;
    protected BigInteger subclass;
    protected String flightType;
    protected String overbooking;

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the subclass property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubclass() {
        return subclass;
    }

    /**
     * Sets the value of the subclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubclass(BigInteger value) {
        this.subclass = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the overbooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverbooking() {
        return overbooking;
    }

    /**
     * Sets the value of the overbooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverbooking(String value) {
        this.overbooking = value;
    }

}
