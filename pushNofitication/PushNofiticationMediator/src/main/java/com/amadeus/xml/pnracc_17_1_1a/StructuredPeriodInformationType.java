
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey period in a structured way.
 * 
 * <p>Java class for StructuredPeriodInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPeriodInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeType_17997C" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeType_17997C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    protected StructuredDateTimeType17997C beginDateTime;
    protected StructuredDateTimeType17997C endDateTime;

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType17997C }
     *     
     */
    public StructuredDateTimeType17997C getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType17997C }
     *     
     */
    public void setBeginDateTime(StructuredDateTimeType17997C value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType17997C }
     *     
     */
    public StructuredDateTimeType17997C getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType17997C }
     *     
     */
    public void setEndDateTime(StructuredDateTimeType17997C value) {
        this.endDateTime = value;
    }

}
