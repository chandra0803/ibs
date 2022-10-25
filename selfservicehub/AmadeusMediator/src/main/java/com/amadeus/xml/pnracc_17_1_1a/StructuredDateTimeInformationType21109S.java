
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey date/time in a structured way.
 * 
 * <p>Java class for StructuredDateTimeInformationType_21109S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeInformationType_21109S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeType_35730C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeInformationType_21109S", propOrder = {
    "dateTime"
})
public class StructuredDateTimeInformationType21109S {

    @XmlElement(required = true)
    protected StructuredDateTimeType35730C dateTime;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType35730C }
     *     
     */
    public StructuredDateTimeType35730C getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType35730C }
     *     
     */
    public void setDateTime(StructuredDateTimeType35730C value) {
        this.dateTime = value;
    }

}
