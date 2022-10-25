
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * contains information about the total price plan
 * 
 * <p>Java class for InsuranceProviderAndProductsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceProviderAndProductsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tripType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="tourOperator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="countryInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CountrydescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceProviderAndProductsType", propOrder = {
    "tripType",
    "tourOperator",
    "countryInfo"
})
public class InsuranceProviderAndProductsType {

    protected String tripType;
    protected String tourOperator;
    protected CountrydescriptionType countryInfo;

    /**
     * Gets the value of the tripType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripType(String value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the tourOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperator() {
        return tourOperator;
    }

    /**
     * Sets the value of the tourOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperator(String value) {
        this.tourOperator = value;
    }

    /**
     * Gets the value of the countryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CountrydescriptionType }
     *     
     */
    public CountrydescriptionType getCountryInfo() {
        return countryInfo;
    }

    /**
     * Sets the value of the countryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrydescriptionType }
     *     
     */
    public void setCountryInfo(CountrydescriptionType value) {
        this.countryInfo = value;
    }

}
