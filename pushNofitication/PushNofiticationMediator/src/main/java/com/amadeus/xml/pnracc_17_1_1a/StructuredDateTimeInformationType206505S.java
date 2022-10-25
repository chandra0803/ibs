
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey date/time in a structured way.
 * 
 * <p>Java class for StructuredDateTimeInformationType_206505S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeInformationType_206505S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessSemantic" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="timeMode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeType_285976C"/>
 *         &lt;element name="timeZoneInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TimeZoneIinformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeInformationType_206505S", propOrder = {
    "businessSemantic",
    "timeMode",
    "dateTime",
    "timeZoneInfo"
})
public class StructuredDateTimeInformationType206505S {

    protected String businessSemantic;
    protected String timeMode;
    @XmlElement(required = true)
    protected StructuredDateTimeType285976C dateTime;
    protected TimeZoneIinformationType timeZoneInfo;

    /**
     * Gets the value of the businessSemantic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /**
     * Sets the value of the businessSemantic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSemantic(String value) {
        this.businessSemantic = value;
    }

    /**
     * Gets the value of the timeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeMode() {
        return timeMode;
    }

    /**
     * Sets the value of the timeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeMode(String value) {
        this.timeMode = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType285976C }
     *     
     */
    public StructuredDateTimeType285976C getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType285976C }
     *     
     */
    public void setDateTime(StructuredDateTimeType285976C value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the timeZoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneIinformationType }
     *     
     */
    public TimeZoneIinformationType getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /**
     * Sets the value of the timeZoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneIinformationType }
     *     
     */
    public void setTimeZoneInfo(TimeZoneIinformationType value) {
        this.timeZoneInfo = value;
    }

}
