
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueueDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queueNum1" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="queueName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueDetailsType", propOrder = {
    "queueNum1",
    "queueName"
})
public class QueueDetailsType {

    protected BigInteger queueNum1;
    protected String queueName;

    /**
     * Gets the value of the queueNum1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueueNum1() {
        return queueNum1;
    }

    /**
     * Sets the value of the queueNum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueueNum1(BigInteger value) {
        this.queueNum1 = value;
    }

    /**
     * Gets the value of the queueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * Sets the value of the queueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueName(String value) {
        this.queueName = value;
    }

}
