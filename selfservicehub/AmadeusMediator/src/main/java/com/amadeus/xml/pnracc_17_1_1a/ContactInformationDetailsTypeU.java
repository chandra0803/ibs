
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify communication number, type of number, to whom the number belongs and a related reference number.
 * 
 * <p>Java class for ContactInformationDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInformationDetailsTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="comAddress" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To57"/&gt;
 *         &lt;element name="comChannelQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationDetailsTypeU", propOrder = {
    "partyQualifier",
    "comAddress",
    "comChannelQualifier"
})
public class ContactInformationDetailsTypeU {

    @XmlElement(required = true)
    protected String partyQualifier;
    @XmlElement(required = true)
    protected String comAddress;
    @XmlElement(required = true)
    protected String comChannelQualifier;

    /**
     * Gets the value of the partyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyQualifier() {
        return partyQualifier;
    }

    /**
     * Sets the value of the partyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyQualifier(String value) {
        this.partyQualifier = value;
    }

    /**
     * Gets the value of the comAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComAddress() {
        return comAddress;
    }

    /**
     * Sets the value of the comAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComAddress(String value) {
        this.comAddress = value;
    }

    /**
     * Gets the value of the comChannelQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComChannelQualifier() {
        return comChannelQualifier;
    }

    /**
     * Sets the value of the comChannelQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComChannelQualifier(String value) {
        this.comChannelQualifier = value;
    }

}
