
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about a device.
 * 
 * <p>Java class for DeviceInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="cabinClass" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="firstLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To5" minOccurs="0"/>
 *         &lt;element name="secondLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInformationTypeI", propOrder = {
    "deviceNumber",
    "cabinClass",
    "firstLocation",
    "secondLocation"
})
public class DeviceInformationTypeI {

    protected String deviceNumber;
    protected String cabinClass;
    protected String firstLocation;
    protected String secondLocation;

    /**
     * Gets the value of the deviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceNumber() {
        return deviceNumber;
    }

    /**
     * Sets the value of the deviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceNumber(String value) {
        this.deviceNumber = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the firstLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLocation() {
        return firstLocation;
    }

    /**
     * Sets the value of the firstLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLocation(String value) {
        this.firstLocation = value;
    }

    /**
     * Gets the value of the secondLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLocation() {
        return secondLocation;
    }

    /**
     * Sets the value of the secondLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLocation(String value) {
        this.secondLocation = value;
    }

}
