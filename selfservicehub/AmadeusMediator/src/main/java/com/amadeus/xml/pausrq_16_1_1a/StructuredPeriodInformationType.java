
package com.amadeus.xml.pausrq_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey period in a structured way.
 * 
 * <p>Java class for StructuredPeriodInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPeriodInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beginDateTime" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}StructuredDateTimeType"/&gt;
 *         &lt;element name="endDateTime" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}StructuredDateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPeriodInformationType", propOrder = {
    "beginDateTime",
    "endDateTime"
})
public class StructuredPeriodInformationType {

    @XmlElement(required = true)
    protected StructuredDateTimeType beginDateTime;
    protected StructuredDateTimeType endDateTime;

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public StructuredDateTimeType getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public void setBeginDateTime(StructuredDateTimeType value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public StructuredDateTimeType getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public void setEndDateTime(StructuredDateTimeType value) {
        this.endDateTime = value;
    }

}
