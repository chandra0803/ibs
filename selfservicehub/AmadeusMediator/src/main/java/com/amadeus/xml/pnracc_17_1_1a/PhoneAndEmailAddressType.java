
package com.amadeus.xml.pnracc_17_1_1a;

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
 * &lt;complexType name="PhoneAndEmailAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phoneOrEmailType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="telephoneNumberDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredTelephoneNumberType_198214C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneAndEmailAddressType", propOrder = {
    "phoneOrEmailType",
    "telephoneNumberDetails"
})
public class PhoneAndEmailAddressType {

    @XmlElement(required = true)
    protected String phoneOrEmailType;
    @XmlElement(required = true)
    protected StructuredTelephoneNumberType198214C telephoneNumberDetails;

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
     *     {@link StructuredTelephoneNumberType198214C }
     *     
     */
    public StructuredTelephoneNumberType198214C getTelephoneNumberDetails() {
        return telephoneNumberDetails;
    }

    /**
     * Sets the value of the telephoneNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTelephoneNumberType198214C }
     *     
     */
    public void setTelephoneNumberDetails(StructuredTelephoneNumberType198214C value) {
        this.telephoneNumberDetails = value;
    }

}
