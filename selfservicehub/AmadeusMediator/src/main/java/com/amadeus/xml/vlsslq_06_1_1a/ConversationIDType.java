
package com.amadeus.xml.vlsslq_06_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment stores all conversation porperties in the core of the message
 * 
 * <p>Java class for ConversationIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversationIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="senderIdentification" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To35"/&gt;
 *         &lt;element name="recipientIdentification" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To35"/&gt;
 *         &lt;element name="senderInterchangeControlReference" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To14"/&gt;
 *         &lt;element name="recipientInterchangeControlReference" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To14"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversationIDType", propOrder = {
    "senderIdentification",
    "recipientIdentification",
    "senderInterchangeControlReference",
    "recipientInterchangeControlReference"
})
public class ConversationIDType {

    @XmlElement(required = true)
    protected String senderIdentification;
    @XmlElement(required = true)
    protected String recipientIdentification;
    @XmlElement(required = true)
    protected String senderInterchangeControlReference;
    @XmlElement(required = true)
    protected String recipientInterchangeControlReference;

    /**
     * Gets the value of the senderIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderIdentification() {
        return senderIdentification;
    }

    /**
     * Sets the value of the senderIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderIdentification(String value) {
        this.senderIdentification = value;
    }

    /**
     * Gets the value of the recipientIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientIdentification() {
        return recipientIdentification;
    }

    /**
     * Sets the value of the recipientIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientIdentification(String value) {
        this.recipientIdentification = value;
    }

    /**
     * Gets the value of the senderInterchangeControlReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderInterchangeControlReference() {
        return senderInterchangeControlReference;
    }

    /**
     * Sets the value of the senderInterchangeControlReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderInterchangeControlReference(String value) {
        this.senderInterchangeControlReference = value;
    }

    /**
     * Gets the value of the recipientInterchangeControlReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientInterchangeControlReference() {
        return recipientInterchangeControlReference;
    }

    /**
     * Sets the value of the recipientInterchangeControlReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientInterchangeControlReference(String value) {
        this.recipientInterchangeControlReference = value;
    }

}
