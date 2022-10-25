
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information regarding estimated or actual dates and times of operational events
 * 
 * <p>Java class for DateAndTimeInformationType_32722S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationType_32722S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateAndTimeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeDetailsTypeI_56946C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationType_32722S", propOrder = {
    "dateAndTimeDetails"
})
public class DateAndTimeInformationType32722S {

    protected DateAndTimeDetailsTypeI56946C dateAndTimeDetails;

    /**
     * Gets the value of the dateAndTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsTypeI56946C }
     *     
     */
    public DateAndTimeDetailsTypeI56946C getDateAndTimeDetails() {
        return dateAndTimeDetails;
    }

    /**
     * Sets the value of the dateAndTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsTypeI56946C }
     *     
     */
    public void setDateAndTimeDetails(DateAndTimeDetailsTypeI56946C value) {
        this.dateAndTimeDetails = value;
    }

}
