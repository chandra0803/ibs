
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the Hotel Property information
 * 
 * <p>Java class for HotelPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotelReference" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelUniqueIdType"/&gt;
 *         &lt;element name="hotelName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To40"/&gt;
 *         &lt;element name="fireSafetyIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPropertyType", propOrder = {
    "hotelReference",
    "hotelName",
    "fireSafetyIndicator"
})
public class HotelPropertyType {

    @XmlElement(required = true)
    protected HotelUniqueIdType hotelReference;
    @XmlElement(required = true)
    protected String hotelName;
    protected String fireSafetyIndicator;

    /**
     * Gets the value of the hotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUniqueIdType }
     *     
     */
    public HotelUniqueIdType getHotelReference() {
        return hotelReference;
    }

    /**
     * Sets the value of the hotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUniqueIdType }
     *     
     */
    public void setHotelReference(HotelUniqueIdType value) {
        this.hotelReference = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the fireSafetyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFireSafetyIndicator() {
        return fireSafetyIndicator;
    }

    /**
     * Sets the value of the fireSafetyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFireSafetyIndicator(String value) {
        this.fireSafetyIndicator = value;
    }

}
