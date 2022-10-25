
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey date/time in a structured way.
 * 
 * <p>Java class for StructuredDateTimeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessSemantic" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="dateTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeType_207916C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeInformationType", propOrder = {
    "businessSemantic",
    "dateTime"
})
public class StructuredDateTimeInformationType {

    @XmlElement(required = true)
    protected String businessSemantic;
    @XmlElement(required = true)
    protected StructuredDateTimeType207916C dateTime;

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
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType207916C }
     *     
     */
    public StructuredDateTimeType207916C getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType207916C }
     *     
     */
    public void setDateTime(StructuredDateTimeType207916C value) {
        this.dateTime = value;
    }

}
