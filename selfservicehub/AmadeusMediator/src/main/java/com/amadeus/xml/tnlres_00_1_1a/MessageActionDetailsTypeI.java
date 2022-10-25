
package com.amadeus.xml.tnlres_00_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the message type and business function
 * 
 * <p>Java class for MessageActionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageActionDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="business" type="{http://xml.amadeus.com/TNLRES_00_1_1A}MessageFunctionBusinessDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageActionDetailsTypeI", propOrder = {
    "business"
})
public class MessageActionDetailsTypeI {

    @XmlElement(required = true)
    protected MessageFunctionBusinessDetailsTypeI business;

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunctionBusinessDetailsTypeI }
     *     
     */
    public MessageFunctionBusinessDetailsTypeI getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunctionBusinessDetailsTypeI }
     *     
     */
    public void setBusiness(MessageFunctionBusinessDetailsTypeI value) {
        this.business = value;
    }

}
