
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify identification details.
 * 
 * <p>Java class for IdentificationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificationDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}MultipleIdentificationNumbersType" minOccurs="0"/>
 *         &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}DateAndTimeDetailsType" minOccurs="0"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *         &lt;element name="otherLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationDetailsType", propOrder = {
    "identificationDetails",
    "dateTimeDetails",
    "location",
    "otherLocation"
})
public class IdentificationDetailsType {

    protected MultipleIdentificationNumbersType identificationDetails;
    protected DateAndTimeDetailsType dateTimeDetails;
    protected String location;
    protected String otherLocation;

    /**
     * Gets the value of the identificationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleIdentificationNumbersType }
     *     
     */
    public MultipleIdentificationNumbersType getIdentificationDetails() {
        return identificationDetails;
    }

    /**
     * Sets the value of the identificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleIdentificationNumbersType }
     *     
     */
    public void setIdentificationDetails(MultipleIdentificationNumbersType value) {
        this.identificationDetails = value;
    }

    /**
     * Gets the value of the dateTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsType }
     *     
     */
    public DateAndTimeDetailsType getDateTimeDetails() {
        return dateTimeDetails;
    }

    /**
     * Sets the value of the dateTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsType }
     *     
     */
    public void setDateTimeDetails(DateAndTimeDetailsType value) {
        this.dateTimeDetails = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the otherLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLocation() {
        return otherLocation;
    }

    /**
     * Sets the value of the otherLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLocation(String value) {
        this.otherLocation = value;
    }

}
