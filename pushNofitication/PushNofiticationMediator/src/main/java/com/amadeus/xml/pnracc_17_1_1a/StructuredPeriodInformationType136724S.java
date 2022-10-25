
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey period in a structured way.
 * 
 * <p>Java class for StructuredPeriodInformationType_136724S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPeriodInformationType_136724S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessSemantic" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="timeMode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="beginDateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeType_198234C"/>
 *         &lt;element name="endDateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeType_198234C"/>
 *         &lt;element name="frequency" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequencyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPeriodInformationType_136724S", propOrder = {
    "businessSemantic",
    "timeMode",
    "beginDateTime",
    "endDateTime",
    "frequency"
})
public class StructuredPeriodInformationType136724S {

    protected String businessSemantic;
    protected String timeMode;
    @XmlElement(required = true)
    protected StructuredDateTimeType198234C beginDateTime;
    @XmlElement(required = true)
    protected StructuredDateTimeType198234C endDateTime;
    @XmlElement(required = true)
    protected FrequencyType frequency;

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
     *     {@link StructuredDateTimeType198234C }
     *     
     */
    public StructuredDateTimeType198234C getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType198234C }
     *     
     */
    public void setBeginDateTime(StructuredDateTimeType198234C value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType198234C }
     *     
     */
    public StructuredDateTimeType198234C getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType198234C }
     *     
     */
    public void setEndDateTime(StructuredDateTimeType198234C value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setFrequency(FrequencyType value) {
        this.frequency = value;
    }

}
