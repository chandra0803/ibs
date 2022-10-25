
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Date and time details
 * 
 * <p>Java class for DateAndTimeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstDate" type="{http://xml.amadeus.com/PNRADD_17_1_1A}Date_DDMMYY"/&gt;
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="locationIdentification" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeDetailsTypeI", propOrder = {
    "firstDate",
    "movementType",
    "locationIdentification"
})
public class DateAndTimeDetailsTypeI {

    @XmlElement(required = true)
    protected String firstDate;
    @XmlElement(required = true)
    protected String movementType;
    @XmlElement(required = true)
    protected String locationIdentification;

    /**
     * Gets the value of the firstDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDate() {
        return firstDate;
    }

    /**
     * Sets the value of the firstDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDate(String value) {
        this.firstDate = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the locationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIdentification() {
        return locationIdentification;
    }

    /**
     * Sets the value of the locationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIdentification(String value) {
        this.locationIdentification = value;
    }

}
