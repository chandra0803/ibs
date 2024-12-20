
package com.amadeus.xml.pausrr_16_1_1a;

import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType name="TravellerNameDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameType" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To5" minOccurs="0"/&gt;
 *         &lt;element name="referenceName" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="displayedName" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="romanizationMethod" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To70" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    protected List<String> title;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTitle() {
        if (title == null) {
            title = new ArrayList<String>();
        }
        return this.title;
    }

}
