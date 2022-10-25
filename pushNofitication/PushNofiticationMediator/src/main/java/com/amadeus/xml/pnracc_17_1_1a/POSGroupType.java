
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * POS data
 * 
 * <p>Java class for POSGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sbrUserIdentificationOwn" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType"/>
 *         &lt;element name="sbrSystemDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SystemDetailsInfoType_33158S" minOccurs="0"/>
 *         &lt;element name="sbrPreferences" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserPreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSGroupType", propOrder = {
    "sbrUserIdentificationOwn",
    "sbrSystemDetails",
    "sbrPreferences"
})
public class POSGroupType {

    @XmlElement(required = true)
    protected UserIdentificationType sbrUserIdentificationOwn;
    protected SystemDetailsInfoType33158S sbrSystemDetails;
    protected UserPreferencesType sbrPreferences;

    /**
     * Gets the value of the sbrUserIdentificationOwn property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificationType }
     *     
     */
    public UserIdentificationType getSbrUserIdentificationOwn() {
        return sbrUserIdentificationOwn;
    }

    /**
     * Sets the value of the sbrUserIdentificationOwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificationType }
     *     
     */
    public void setSbrUserIdentificationOwn(UserIdentificationType value) {
        this.sbrUserIdentificationOwn = value;
    }

    /**
     * Gets the value of the sbrSystemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfoType33158S }
     *     
     */
    public SystemDetailsInfoType33158S getSbrSystemDetails() {
        return sbrSystemDetails;
    }

    /**
     * Sets the value of the sbrSystemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfoType33158S }
     *     
     */
    public void setSbrSystemDetails(SystemDetailsInfoType33158S value) {
        this.sbrSystemDetails = value;
    }

    /**
     * Gets the value of the sbrPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link UserPreferencesType }
     *     
     */
    public UserPreferencesType getSbrPreferences() {
        return sbrPreferences;
    }

    /**
     * Sets the value of the sbrPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPreferencesType }
     *     
     */
    public void setSbrPreferences(UserPreferencesType value) {
        this.sbrPreferences = value;
    }

}
