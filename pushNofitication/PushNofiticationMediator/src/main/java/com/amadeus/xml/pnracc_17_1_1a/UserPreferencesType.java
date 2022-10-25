
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to specify country, currency and language
 * 
 * <p>Java class for UserPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userPreferences" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginatorDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPreferencesType", propOrder = {
    "userPreferences"
})
public class UserPreferencesType {

    @XmlElement(required = true)
    protected OriginatorDetailsTypeI userPreferences;

    /**
     * Gets the value of the userPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorDetailsTypeI }
     *     
     */
    public OriginatorDetailsTypeI getUserPreferences() {
        return userPreferences;
    }

    /**
     * Sets the value of the userPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorDetailsTypeI }
     *     
     */
    public void setUserPreferences(OriginatorDetailsTypeI value) {
        this.userPreferences = value;
    }

}
