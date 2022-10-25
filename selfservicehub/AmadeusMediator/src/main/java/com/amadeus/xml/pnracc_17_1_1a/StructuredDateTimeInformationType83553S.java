
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey date/time in a structured way.
 * 
 * <p>Java class for StructuredDateTimeInformationType_83553S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeInformationType_83553S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessSemantic" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="dateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeType_127515C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeInformationType_83553S", propOrder = {
    "businessSemantic",
    "dateTime"
})
public class StructuredDateTimeInformationType83553S {

    @XmlElement(required = true)
    protected String businessSemantic;
    @XmlElement(required = true)
    protected StructuredDateTimeType127515C dateTime;

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
     *     {@link StructuredDateTimeType127515C }
     *     
     */
    public StructuredDateTimeType127515C getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType127515C }
     *     
     */
    public void setDateTime(StructuredDateTimeType127515C value) {
        this.dateTime = value;
    }

}
