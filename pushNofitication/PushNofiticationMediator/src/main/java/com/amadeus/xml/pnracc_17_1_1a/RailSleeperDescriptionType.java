
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RailSleeperDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailSleeperDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="berthDeck" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/>
 *         &lt;element name="cabinPosition" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/>
 *         &lt;element name="cabinShareType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/>
 *         &lt;element name="cabinOccupancy" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailSleeperDescriptionType", propOrder = {
    "berthDeck",
    "cabinPosition",
    "cabinShareType",
    "cabinOccupancy"
})
public class RailSleeperDescriptionType {

    protected String berthDeck;
    protected String cabinPosition;
    protected String cabinShareType;
    protected String cabinOccupancy;

    /**
     * Gets the value of the berthDeck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerthDeck() {
        return berthDeck;
    }

    /**
     * Sets the value of the berthDeck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerthDeck(String value) {
        this.berthDeck = value;
    }

    /**
     * Gets the value of the cabinPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinPosition() {
        return cabinPosition;
    }

    /**
     * Sets the value of the cabinPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinPosition(String value) {
        this.cabinPosition = value;
    }

    /**
     * Gets the value of the cabinShareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinShareType() {
        return cabinShareType;
    }

    /**
     * Sets the value of the cabinShareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinShareType(String value) {
        this.cabinShareType = value;
    }

    /**
     * Gets the value of the cabinOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinOccupancy() {
        return cabinOccupancy;
    }

    /**
     * Sets the value of the cabinOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinOccupancy(String value) {
        this.cabinOccupancy = value;
    }

}
