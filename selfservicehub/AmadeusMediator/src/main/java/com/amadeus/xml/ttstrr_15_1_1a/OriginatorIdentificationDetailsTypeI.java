
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the originator of the travel request.
 * 
 * <p>Java class for OriginatorIdentificationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorIdentificationDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inHouseIdentification1" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="inHouseIdentification2" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorIdentificationDetailsTypeI", propOrder = {
    "inHouseIdentification1",
    "inHouseIdentification2"
})
public class OriginatorIdentificationDetailsTypeI {

    protected String inHouseIdentification1;
    protected String inHouseIdentification2;

    /**
     * Gets the value of the inHouseIdentification1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /**
     * Sets the value of the inHouseIdentification1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHouseIdentification1(String value) {
        this.inHouseIdentification1 = value;
    }

    /**
     * Gets the value of the inHouseIdentification2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHouseIdentification2() {
        return inHouseIdentification2;
    }

    /**
     * Sets the value of the inHouseIdentification2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHouseIdentification2(String value) {
        this.inHouseIdentification2 = value;
    }

}
