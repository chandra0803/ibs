
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Store date and time in a structured way
 * 
 * <p>Java class for StructuredDateTimeType_287345C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeType_287345C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="year" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Year_YYYY" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="day" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="hour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="minutes" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeType_287345C", propOrder = {
    "year",
    "month",
    "day",
    "hour",
    "minutes"
})
public class StructuredDateTimeType287345C {

    protected String year;
    protected BigInteger month;
    protected BigInteger day;
    protected BigInteger hour;
    protected BigInteger minutes;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonth(BigInteger value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDay(BigInteger value) {
        this.day = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHour(BigInteger value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinutes(BigInteger value) {
        this.minutes = value;
    }

}
