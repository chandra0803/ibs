
package com.amadeus.xml.cfldrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate a location and the type of location.
 * 
 * <p>Java class for ProductLocationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLocationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="station" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AlphaString_Length3To5" minOccurs="0"/>
 *         &lt;element name="otherStation" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AlphaString_Length3To5" minOccurs="0"/>
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductLocationDetailsTypeI", propOrder = {
    "station",
    "otherStation",
    "qualifier"
})
public class ProductLocationDetailsTypeI {

    protected String station;
    protected String otherStation;
    protected String qualifier;

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStation(String value) {
        this.station = value;
    }

    /**
     * Gets the value of the otherStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStation() {
        return otherStation;
    }

    /**
     * Sets the value of the otherStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStation(String value) {
        this.otherStation = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

}
