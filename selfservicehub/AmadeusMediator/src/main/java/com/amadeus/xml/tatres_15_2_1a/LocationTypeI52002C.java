
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a location by code or name.
 * 
 * <p>Java class for LocationTypeI_52002C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationTypeI_52002C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trueLocationId" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/&gt;
 *         &lt;element name="trueLocation" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To17" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationTypeI_52002C", propOrder = {
    "trueLocationId",
    "trueLocation"
})
public class LocationTypeI52002C {

    protected String trueLocationId;
    protected String trueLocation;

    /**
     * Gets the value of the trueLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueLocationId() {
        return trueLocationId;
    }

    /**
     * Sets the value of the trueLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueLocationId(String value) {
        this.trueLocationId = value;
    }

    /**
     * Gets the value of the trueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueLocation() {
        return trueLocation;
    }

    /**
     * Sets the value of the trueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueLocation(String value) {
        this.trueLocation = value;
    }

}
