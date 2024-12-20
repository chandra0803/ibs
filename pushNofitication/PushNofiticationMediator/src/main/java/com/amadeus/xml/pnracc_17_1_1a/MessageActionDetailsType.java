
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the message type and business function.
 * 
 * <p>Java class for MessageActionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageActionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="business" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MessageFunctionBusinessDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageActionDetailsType", propOrder = {
    "business"
})
public class MessageActionDetailsType {

    @XmlElement(required = true)
    protected MessageFunctionBusinessDetailsType business;

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunctionBusinessDetailsType }
     *     
     */
    public MessageFunctionBusinessDetailsType getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunctionBusinessDetailsType }
     *     
     */
    public void setBusiness(MessageFunctionBusinessDetailsType value) {
        this.business = value;
    }

}
