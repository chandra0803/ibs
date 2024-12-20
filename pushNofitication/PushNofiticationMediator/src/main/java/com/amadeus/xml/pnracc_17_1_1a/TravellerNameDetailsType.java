
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify all the names in different alphabets associated to a same traveller
 * 
 * <p>Java class for TravellerNameDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerNameDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To5" minOccurs="0"/>
 *         &lt;element name="referenceName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="displayedName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="romanizationMethod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To57" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To56" minOccurs="0"/>
 *         &lt;element name="title" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerNameDetailsType", propOrder = {
    "nameType",
    "referenceName",
    "displayedName",
    "romanizationMethod",
    "surname",
    "givenName",
    "title"
})
public class TravellerNameDetailsType {

    protected String nameType;
    protected String referenceName;
    protected String displayedName;
    protected String romanizationMethod;
    protected String surname;
    protected String givenName;
    protected String title;

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the referenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceName() {
        return referenceName;
    }

    /**
     * Sets the value of the referenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceName(String value) {
        this.referenceName = value;
    }

    /**
     * Gets the value of the displayedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayedName() {
        return displayedName;
    }

    /**
     * Sets the value of the displayedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayedName(String value) {
        this.displayedName = value;
    }

    /**
     * Gets the value of the romanizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRomanizationMethod() {
        return romanizationMethod;
    }

    /**
     * Sets the value of the romanizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRomanizationMethod(String value) {
        this.romanizationMethod = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
