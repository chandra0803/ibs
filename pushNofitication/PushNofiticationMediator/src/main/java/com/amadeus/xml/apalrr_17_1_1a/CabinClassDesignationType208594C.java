
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * CABIN CLASS DESIGNATION
 * 
 * <p>Java class for CabinClassDesignationType_208594C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassDesignationType_208594C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classDesignator" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="bookingClass" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassDesignationType_208594C", propOrder = {
    "classDesignator",
    "bookingClass"
})
public class CabinClassDesignationType208594C {

    protected String classDesignator;
    protected String bookingClass;

    /**
     * Gets the value of the classDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDesignator() {
        return classDesignator;
    }

    /**
     * Sets the value of the classDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDesignator(String value) {
        this.classDesignator = value;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingClass(String value) {
        this.bookingClass = value;
    }

}
