
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a part of a country (eg county or part of a city)
 * 
 * <p>Java class for CountrySubEntityDetailsBatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountrySubEntityDetailsBatchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countrySubEntity" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="countrySubEntityName" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountrySubEntityDetailsBatchType", propOrder = {
    "countrySubEntity",
    "countrySubEntityName"
})
public class CountrySubEntityDetailsBatchType {

    protected String countrySubEntity;
    protected String countrySubEntityName;

    /**
     * Gets the value of the countrySubEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubEntity() {
        return countrySubEntity;
    }

    /**
     * Sets the value of the countrySubEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubEntity(String value) {
        this.countrySubEntity = value;
    }

    /**
     * Gets the value of the countrySubEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubEntityName() {
        return countrySubEntityName;
    }

    /**
     * Sets the value of the countrySubEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubEntityName(String value) {
        this.countrySubEntityName = value;
    }

}
