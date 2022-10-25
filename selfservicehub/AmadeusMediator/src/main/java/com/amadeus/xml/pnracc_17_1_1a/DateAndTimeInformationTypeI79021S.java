
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide date and time details relative to flight movements.
 * 
 * <p>Java class for DateAndTimeInformationTypeI_79021S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationTypeI_79021S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateAndTimeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationTypeI_79021S", propOrder = {
    "dateAndTimeDetails"
})
public class DateAndTimeInformationTypeI79021S {

    @XmlElement(required = true)
    protected DateAndTimeDetailsTypeI dateAndTimeDetails;

    /**
     * Gets the value of the dateAndTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsTypeI }
     *     
     */
    public DateAndTimeDetailsTypeI getDateAndTimeDetails() {
        return dateAndTimeDetails;
    }

    /**
     * Sets the value of the dateAndTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsTypeI }
     *     
     */
    public void setDateAndTimeDetails(DateAndTimeDetailsTypeI value) {
        this.dateAndTimeDetails = value;
    }

}
