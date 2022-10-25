
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify control details for a device.
 * 
 * <p>Java class for DeviceControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceControlDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}IdentificationNumberTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceControlDetailsType", propOrder = {
    "deviceIdentification"
})
public class DeviceControlDetailsType {

    protected IdentificationNumberTypeI deviceIdentification;

    /**
     * Gets the value of the deviceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationNumberTypeI }
     *     
     */
    public IdentificationNumberTypeI getDeviceIdentification() {
        return deviceIdentification;
    }

    /**
     * Sets the value of the deviceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumberTypeI }
     *     
     */
    public void setDeviceIdentification(IdentificationNumberTypeI value) {
        this.deviceIdentification = value;
    }

}
