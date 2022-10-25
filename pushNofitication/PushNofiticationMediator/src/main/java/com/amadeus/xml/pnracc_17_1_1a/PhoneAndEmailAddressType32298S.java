
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a phone or email address
 * 
 * <p>Java class for PhoneAndEmailAddressType_32298S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneAndEmailAddressType_32298S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneOrEmailType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="telephoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredTelephoneNumberType_48448C" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To90" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneAndEmailAddressType_32298S", propOrder = {
    "phoneOrEmailType",
    "telephoneNumber",
    "emailAddress"
})
public class PhoneAndEmailAddressType32298S {

    @XmlElement(required = true)
    protected String phoneOrEmailType;
    protected StructuredTelephoneNumberType48448C telephoneNumber;
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
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTelephoneNumberType48448C }
     *     
     */
    public StructuredTelephoneNumberType48448C getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTelephoneNumberType48448C }
     *     
     */
    public void setTelephoneNumber(StructuredTelephoneNumberType48448C value) {
        this.telephoneNumber = value;
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
