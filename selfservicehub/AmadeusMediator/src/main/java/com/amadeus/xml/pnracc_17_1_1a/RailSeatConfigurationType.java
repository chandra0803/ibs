
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RailSeatConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailSeatConfigurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="seatSpace" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/&gt;
 *         &lt;element name="coachType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/&gt;
 *         &lt;element name="seatEquipment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/&gt;
 *         &lt;element name="seatPosition" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="seatDirection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="seatDeck" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="specialPassengerType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailSeatConfigurationType", propOrder = {
    "seatSpace",
    "coachType",
    "seatEquipment",
    "seatPosition",
    "seatDirection",
    "seatDeck",
    "specialPassengerType"
})
public class RailSeatConfigurationType {

    protected String seatSpace;
    protected String coachType;
    protected String seatEquipment;
    protected String seatPosition;
    protected String seatDirection;
    protected String seatDeck;
    protected List<String> specialPassengerType;

    /**
     * Gets the value of the seatSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatSpace() {
        return seatSpace;
    }

    /**
     * Sets the value of the seatSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatSpace(String value) {
        this.seatSpace = value;
    }

    /**
     * Gets the value of the coachType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoachType() {
        return coachType;
    }

    /**
     * Sets the value of the coachType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoachType(String value) {
        this.coachType = value;
    }

    /**
     * Gets the value of the seatEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatEquipment() {
        return seatEquipment;
    }

    /**
     * Sets the value of the seatEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatEquipment(String value) {
        this.seatEquipment = value;
    }

    /**
     * Gets the value of the seatPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPosition() {
        return seatPosition;
    }

    /**
     * Sets the value of the seatPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPosition(String value) {
        this.seatPosition = value;
    }

    /**
     * Gets the value of the seatDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatDirection() {
        return seatDirection;
    }

    /**
     * Sets the value of the seatDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatDirection(String value) {
        this.seatDirection = value;
    }

    /**
     * Gets the value of the seatDeck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatDeck() {
        return seatDeck;
    }

    /**
     * Sets the value of the seatDeck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatDeck(String value) {
        this.seatDeck = value;
    }

    /**
     * Gets the value of the specialPassengerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialPassengerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialPassengerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialPassengerType() {
        if (specialPassengerType == null) {
            specialPassengerType = new ArrayList<String>();
        }
        return this.specialPassengerType;
    }

}
