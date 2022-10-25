
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information related to a ticket.
 * 
 * <p>Java class for PricingTicketingSubsequentTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingSubsequentTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mdNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingSubsequentTypeI", propOrder = {
    "mdNumber"
})
public class PricingTicketingSubsequentTypeI {

    @XmlElement(required = true)
    protected String mdNumber;

    /**
     * Gets the value of the mdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdNumber() {
        return mdNumber;
    }

    /**
     * Sets the value of the mdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdNumber(String value) {
        this.mdNumber = value;
    }

}
