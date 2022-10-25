
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify date, and/or time, or period.
 * 
 * <p>Java class for DateTimePeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimePeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTimeDescription" type="{http://xml.amadeus.com/APALRR_17_1_1A}DateTimePeriodDetailsBatchTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimePeriodType", propOrder = {
    "dateTimeDescription"
})
public class DateTimePeriodType {

    @XmlElement(required = true)
    protected DateTimePeriodDetailsBatchTypeU dateTimeDescription;

    /**
     * Gets the value of the dateTimeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetailsBatchTypeU }
     *     
     */
    public DateTimePeriodDetailsBatchTypeU getDateTimeDescription() {
        return dateTimeDescription;
    }

    /**
     * Sets the value of the dateTimeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetailsBatchTypeU }
     *     
     */
    public void setDateTimeDescription(DateTimePeriodDetailsBatchTypeU value) {
        this.dateTimeDescription = value;
    }

}
