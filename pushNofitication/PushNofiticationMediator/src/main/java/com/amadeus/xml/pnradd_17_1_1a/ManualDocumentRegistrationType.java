
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR Manual Document Registration element
 * 
 * <p>Java class for ManualDocumentRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualDocumentRegistrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="document" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ManualDocumentType" minOccurs="0"/>
 *         &lt;element name="freeflow" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To49" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualDocumentRegistrationType", propOrder = {
    "passengerType",
    "document",
    "freeflow"
})
public class ManualDocumentRegistrationType {

    protected String passengerType;
    protected ManualDocumentType document;
    protected String freeflow;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link ManualDocumentType }
     *     
     */
    public ManualDocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualDocumentType }
     *     
     */
    public void setDocument(ManualDocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the freeflow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeflow() {
        return freeflow;
    }

    /**
     * Sets the value of the freeflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeflow(String value) {
        this.freeflow = value;
    }

}
