
package com.amadeus.wsdl._2010._06.ws.link_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A link to uniquely identify an end-user flow
 * 
 * <p>Java class for TransactionFlowLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionFlowLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consumer" type="{http://wsdl.amadeus.com/2010/06/ws/Link_v1}ConsumerType" minOccurs="0"/>
 *         &lt;element name="Receiver" type="{http://wsdl.amadeus.com/2010/06/ws/Link_v1}ReceiverType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionFlowLinkType", propOrder = {
    "consumer",
    "receiver"
})
public class TransactionFlowLinkType {

    @XmlElement(name = "Consumer")
    protected ConsumerType consumer;
    @XmlElement(name = "Receiver")
    protected ReceiverType receiver;

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerType }
     *     
     */
    public ConsumerType getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerType }
     *     
     */
    public void setConsumer(ConsumerType value) {
        this.consumer = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverType }
     *     
     */
    public ReceiverType getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverType }
     *     
     */
    public void setReceiver(ReceiverType value) {
        this.receiver = value;
    }

}
