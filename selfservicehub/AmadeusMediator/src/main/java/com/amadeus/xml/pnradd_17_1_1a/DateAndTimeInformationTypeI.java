
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide date and time details relative to flight movements.
 * 
 * <p>Java class for DateAndTimeInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateAndTime" type="{http://xml.amadeus.com/PNRADD_17_1_1A}DateAndTimeDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationTypeI", propOrder = {
    "dateAndTime"
})
public class DateAndTimeInformationTypeI {

    @XmlElement(required = true)
    protected DateAndTimeDetailsTypeI dateAndTime;

    /**
     * Gets the value of the dateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsTypeI }
     *     
     */
    public DateAndTimeDetailsTypeI getDateAndTime() {
        return dateAndTime;
    }

    /**
     * Sets the value of the dateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsTypeI }
     *     
     */
    public void setDateAndTime(DateAndTimeDetailsTypeI value) {
        this.dateAndTime = value;
    }

}
