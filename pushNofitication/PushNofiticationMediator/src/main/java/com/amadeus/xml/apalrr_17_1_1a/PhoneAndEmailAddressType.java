
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a phone or email address
 * 
 * <p>Java class for PhoneAndEmailAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneAndEmailAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneOrEmailType" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="telephoneNumberDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredTelephoneNumberType" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To250" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneAndEmailAddressType", propOrder = {
    "phoneOrEmailType",
    "telephoneNumberDetails",
    "emailAddress"
})
public class PhoneAndEmailAddressType {

    @XmlElement(required = true)
    protected String phoneOrEmailType;
    protected StructuredTelephoneNumberType telephoneNumberDetails;
    protected String emailAddress;

    /**
     * Gets the value of the phoneOrEmailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneOrEmailType() {
        return phoneOrEmailType;
    }

    /**
     * Sets the value of the phoneOrEmailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneOrEmailType(String value) {
        this.phoneOrEmailType = value;
    }

    /**
     * Gets the value of the telephoneNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTelephoneNumberType }
     *     
     */
    public StructuredTelephoneNumberType getTelephoneNumberDetails() {
        return telephoneNumberDetails;
    }

    /**
     * Sets the value of the telephoneNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTelephoneNumberType }
     *     
     */
    public void setTelephoneNumberDetails(StructuredTelephoneNumberType value) {
        this.telephoneNumberDetails = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}
