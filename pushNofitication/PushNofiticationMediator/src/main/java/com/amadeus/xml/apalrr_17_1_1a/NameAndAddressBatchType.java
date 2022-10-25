
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the name/address and their related function, either by C082 only and/or unstructured by C058 or structured by C080 thru 3207.
 * 
 * <p>Java class for NameAndAddressBatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameAndAddressBatchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="traveler" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="travelerAddress" type="{http://xml.amadeus.com/APALRR_17_1_1A}StreetType" minOccurs="0"/>
 *         &lt;element name="travelerCity" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="travelerCountry" type="{http://xml.amadeus.com/APALRR_17_1_1A}CountrySubEntityDetailsBatchType" minOccurs="0"/>
 *         &lt;element name="travelerPostcode" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="travelerCountryCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndAddressBatchType", propOrder = {
    "traveler",
    "travelerAddress",
    "travelerCity",
    "travelerCountry",
    "travelerPostcode",
    "travelerCountryCode"
})
public class NameAndAddressBatchType {

    @XmlElement(required = true)
    protected String traveler;
    protected StreetType travelerAddress;
    protected String travelerCity;
    protected CountrySubEntityDetailsBatchType travelerCountry;
    protected String travelerPostcode;
    protected String travelerCountryCode;

    /**
     * Gets the value of the traveler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraveler() {
        return traveler;
    }

    /**
     * Sets the value of the traveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraveler(String value) {
        this.traveler = value;
    }

    /**
     * Gets the value of the travelerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StreetType }
     *     
     */
    public StreetType getTravelerAddress() {
        return travelerAddress;
    }

    /**
     * Sets the value of the travelerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetType }
     *     
     */
    public void setTravelerAddress(StreetType value) {
        this.travelerAddress = value;
    }

    /**
     * Gets the value of the travelerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerCity() {
        return travelerCity;
    }

    /**
     * Sets the value of the travelerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerCity(String value) {
        this.travelerCity = value;
    }

    /**
     * Gets the value of the travelerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubEntityDetailsBatchType }
     *     
     */
    public CountrySubEntityDetailsBatchType getTravelerCountry() {
        return travelerCountry;
    }

    /**
     * Sets the value of the travelerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubEntityDetailsBatchType }
     *     
     */
    public void setTravelerCountry(CountrySubEntityDetailsBatchType value) {
        this.travelerCountry = value;
    }

    /**
     * Gets the value of the travelerPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerPostcode() {
        return travelerPostcode;
    }

    /**
     * Sets the value of the travelerPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerPostcode(String value) {
        this.travelerPostcode = value;
    }

    /**
     * Gets the value of the travelerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerCountryCode() {
        return travelerCountryCode;
    }

    /**
     * Sets the value of the travelerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerCountryCode(String value) {
        this.travelerCountryCode = value;
    }

}
