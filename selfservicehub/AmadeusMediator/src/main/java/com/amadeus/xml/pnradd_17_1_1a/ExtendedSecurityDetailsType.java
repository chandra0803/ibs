
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This composite contains details on agreement and access mode between two entities
 * 
 * <p>Java class for ExtendedSecurityDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedSecurityDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfEntity" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="accessMode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="inhouseIdentification" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedSecurityDetailsType", propOrder = {
    "typeOfEntity",
    "accessMode",
    "inhouseIdentification"
})
public class ExtendedSecurityDetailsType {

    protected String typeOfEntity;
    protected String accessMode;
    protected String inhouseIdentification;

    /**
     * Gets the value of the typeOfEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfEntity() {
        return typeOfEntity;
    }

    /**
     * Sets the value of the typeOfEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfEntity(String value) {
        this.typeOfEntity = value;
    }

    /**
     * Gets the value of the accessMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessMode() {
        return accessMode;
    }

    /**
     * Sets the value of the accessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessMode(String value) {
        this.accessMode = value;
    }

    /**
     * Gets the value of the inhouseIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhouseIdentification() {
        return inhouseIdentification;
    }

    /**
     * Sets the value of the inhouseIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhouseIdentification(String value) {
        this.inhouseIdentification = value;
    }

}
