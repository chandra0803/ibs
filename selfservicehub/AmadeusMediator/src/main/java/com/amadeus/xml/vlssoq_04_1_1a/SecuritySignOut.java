
package com.amadeus.xml.vlssoq_04_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conversationClt" type="{http://xml.amadeus.com/VLSSOQ_04_1_1A}ConversationIDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conversationClt"
})
@XmlRootElement(name = "Security_SignOut")
public class SecuritySignOut {

    protected ConversationIDType conversationClt;

    /**
     * Gets the value of the conversationClt property.
     * 
     * @return
     *     possible object is
     *     {@link ConversationIDType }
     *     
     */
    public ConversationIDType getConversationClt() {
        return conversationClt;
    }

    /**
     * Sets the value of the conversationClt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationIDType }
     *     
     */
    public void setConversationClt(ConversationIDType value) {
        this.conversationClt = value;
    }

}
