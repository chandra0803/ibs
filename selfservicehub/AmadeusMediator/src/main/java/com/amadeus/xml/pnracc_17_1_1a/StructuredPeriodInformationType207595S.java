
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey period in a structured way.
 * 
 * <p>Java class for StructuredPeriodInformationType_207595S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPeriodInformationType_207595S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessSemantic" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="timeMode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="beginDateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeType_287345C"/&gt;
 *         &lt;element name="endDateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeType_287345C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPeriodInformationType_207595S", propOrder = {
    "businessSemantic",
    "timeMode",
    "beginDateTime",
    "endDateTime"
})
public class StructuredPeriodInformationType207595S {

    protected String businessSemantic;
    protected String timeMode;
    @XmlElement(required = true)
    protected StructuredDateTimeType287345C beginDateTime;
    @XmlElement(required = true)
    protected StructuredDateTimeType287345C endDateTime;

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
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType287345C }
     *     
     */
    public StructuredDateTimeType287345C getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType287345C }
     *     
     */
    public void setBeginDateTime(StructuredDateTimeType287345C value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType287345C }
     *     
     */
    public StructuredDateTimeType287345C getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType287345C }
     *     
     */
    public void setEndDateTime(StructuredDateTimeType287345C value) {
        this.endDateTime = value;
    }

}
