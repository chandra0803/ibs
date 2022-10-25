
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the Hotel Property information
 * 
 * <p>Java class for HotelPropertyType_26378S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPropertyType_26378S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotelReference" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelUniqueIdType_47769C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPropertyType_26378S", propOrder = {
    "hotelReference"
})
public class HotelPropertyType26378S {

    @XmlElement(required = true)
    protected HotelUniqueIdType47769C hotelReference;

    /**
     * Gets the value of the hotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUniqueIdType47769C }
     *     
     */
    public HotelUniqueIdType47769C getHotelReference() {
        return hotelReference;
    }

    /**
     * Sets the value of the hotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUniqueIdType47769C }
     *     
     */
    public void setHotelReference(HotelUniqueIdType47769C value) {
        this.hotelReference = value;
    }

}
