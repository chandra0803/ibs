
package com.amadeus.xml.pnradd_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To make Seat requests on flights within the PNR.
 * 
 * <p>Java class for SeatRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seat" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SeatRequierementsType" minOccurs="0"/>
 *         &lt;element name="special" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SeatRequierementsDataType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequestType", propOrder = {
    "seat",
    "special"
})
public class SeatRequestType {

    protected SeatRequierementsType seat;
    protected List<SeatRequierementsDataType> special;

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRequierementsType }
     *     
     */
    public SeatRequierementsType getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRequierementsType }
     *     
     */
    public void setSeat(SeatRequierementsType value) {
        this.seat = value;
    }

    /**
     * Gets the value of the special property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the special property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatRequierementsDataType }
     * 
     * 
     */
    public List<SeatRequierementsDataType> getSpecial() {
        if (special == null) {
            special = new ArrayList<SeatRequierementsDataType>();
        }
        return this.special;
    }

}
