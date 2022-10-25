
package com.amadeus.xml.tatreq_15_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravellerNameInfoType_276832C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerNameInfoType_276832C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumericInteger_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/&gt;
 *         &lt;element name="otherType" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/&gt;
 *         &lt;element name="infantIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="travellerIdentificationCode" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To70" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumericInteger_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerNameInfoType_276832C", propOrder = {
    "qualifier",
    "quantity",
    "type",
    "otherType",
    "infantIndicator",
    "travellerIdentificationCode",
    "gender",
    "age"
})
public class TravellerNameInfoType276832C {

    protected String qualifier;
    protected BigInteger quantity;
    protected String type;
    protected String otherType;
    protected String infantIndicator;
    protected String travellerIdentificationCode;
    protected String gender;
    protected BigInteger age;

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the infantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /**
     * Sets the value of the infantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantIndicator(String value) {
        this.infantIndicator = value;
    }

    /**
     * Gets the value of the travellerIdentificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerIdentificationCode() {
        return travellerIdentificationCode;
    }

    /**
     * Sets the value of the travellerIdentificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerIdentificationCode(String value) {
        this.travellerIdentificationCode = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

}