
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of document/message by number, status, source and/or language.
 * 
 * <p>Java class for DocumentMessageDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentMessageDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="travelerDocumentId" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To35"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentMessageDetailsTypeU", propOrder = {
    "travelerDocumentId"
})
public class DocumentMessageDetailsTypeU {

    @XmlElement(required = true)
    protected String travelerDocumentId;

    /**
     * Gets the value of the travelerDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerDocumentId() {
        return travelerDocumentId;
    }

    /**
     * Sets the value of the travelerDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerDocumentId(String value) {
        this.travelerDocumentId = value;
    }

}
