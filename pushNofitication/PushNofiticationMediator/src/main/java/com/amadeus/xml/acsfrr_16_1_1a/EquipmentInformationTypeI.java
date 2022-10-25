
package com.amadeus.xml.acsfrr_16_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify configuration details of an aircraft.
 * 
 * <p>Java class for EquipmentInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configurationDetails" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ConfigurationDetailsTypeI" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="cabinVersion" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="description" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInformationTypeI", propOrder = {
    "configurationDetails",
    "cabinVersion",
    "description"
})
public class EquipmentInformationTypeI {

    protected List<ConfigurationDetailsTypeI> configurationDetails;
    protected String cabinVersion;
    protected String description;

    /**
     * Gets the value of the configurationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationDetailsTypeI }
     * 
     * 
     */
    public List<ConfigurationDetailsTypeI> getConfigurationDetails() {
        if (configurationDetails == null) {
            configurationDetails = new ArrayList<ConfigurationDetailsTypeI>();
        }
        return this.configurationDetails;
    }

    /**
     * Gets the value of the cabinVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinVersion() {
        return cabinVersion;
    }

    /**
     * Sets the value of the cabinVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinVersion(String value) {
        this.cabinVersion = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
