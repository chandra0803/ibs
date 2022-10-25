
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Date and/or time, or period relevant to the specified date/time/period type.
 * 
 * <p>Java class for DateTimePeriodDetailsBatchTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimePeriodDetailsBatchTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTimeQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To35"/>
 *         &lt;element name="format" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimePeriodDetailsBatchTypeU", propOrder = {
    "dateTimeQualifier",
    "dateTimeDetails",
    "format"
})
public class DateTimePeriodDetailsBatchTypeU {

    @XmlElement(required = true)
    protected String dateTimeQualifier;
    @XmlElement(required = true)
    protected String dateTimeDetails;
    @XmlElement(required = true)
    protected String format;

    /**
     * Gets the value of the dateTimeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeQualifier() {
        return dateTimeQualifier;
    }

    /**
     * Sets the value of the dateTimeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeQualifier(String value) {
        this.dateTimeQualifier = value;
    }

    /**
     * Gets the value of the dateTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeDetails() {
        return dateTimeDetails;
    }

    /**
     * Sets the value of the dateTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeDetails(String value) {
        this.dateTimeDetails = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
