
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the rail advanced seat request
 * 
 * <p>Java class for RailSeatPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailSeatPreferencesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="seatRequestFunction" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="smokingIndicator" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="classDetails" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ClassDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="seatConfiguration" type="{http://xml.amadeus.com/PNRADD_17_1_1A}RailSeatConfigurationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailSeatPreferencesType", propOrder = {
    "seatRequestFunction",
    "smokingIndicator",
    "classDetails",
    "seatConfiguration"
})
public class RailSeatPreferencesType {

    protected String seatRequestFunction;
    protected String smokingIndicator;
    protected ClassDetailsType classDetails;
    protected RailSeatConfigurationType seatConfiguration;

    /**
     * Gets the value of the seatRequestFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatRequestFunction() {
        return seatRequestFunction;
    }

    /**
     * Sets the value of the seatRequestFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatRequestFunction(String value) {
        this.seatRequestFunction = value;
    }

    /**
     * Gets the value of the smokingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmokingIndicator() {
        return smokingIndicator;
    }

    /**
     * Sets the value of the smokingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmokingIndicator(String value) {
        this.smokingIndicator = value;
    }

    /**
     * Gets the value of the classDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ClassDetailsType }
     *     
     */
    public ClassDetailsType getClassDetails() {
        return classDetails;
    }

    /**
     * Sets the value of the classDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDetailsType }
     *     
     */
    public void setClassDetails(ClassDetailsType value) {
        this.classDetails = value;
    }

    /**
     * Gets the value of the seatConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link RailSeatConfigurationType }
     *     
     */
    public RailSeatConfigurationType getSeatConfiguration() {
        return seatConfiguration;
    }

    /**
     * Sets the value of the seatConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSeatConfigurationType }
     *     
     */
    public void setSeatConfiguration(RailSeatConfigurationType value) {
        this.seatConfiguration = value;
    }

}
