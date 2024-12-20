
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Communication number of a department or employee in a specified channel.
 * 
 * <p>Java class for CommunicationContactDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContactDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70"/>
 *         &lt;element name="contactQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContactDetailsTypeU", propOrder = {
    "email",
    "contactQualifier"
})
public class CommunicationContactDetailsTypeU {

    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String contactQualifier;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the contactQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactQualifier() {
        return contactQualifier;
    }

    /**
     * Sets the value of the contactQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactQualifier(String value) {
        this.contactQualifier = value;
    }

}
