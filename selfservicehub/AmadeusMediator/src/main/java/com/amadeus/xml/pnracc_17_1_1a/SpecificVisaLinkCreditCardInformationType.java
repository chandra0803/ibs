
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify specific credit card information returned by VISA link only
 * 
 * <p>Java class for SpecificVisaLinkCreditCardInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificVisaLinkCreditCardInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msgRef" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MessageReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="respIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ResponseIdentificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificVisaLinkCreditCardInformationType", propOrder = {
    "msgRef",
    "respIdentification"
})
public class SpecificVisaLinkCreditCardInformationType {

    protected MessageReferenceType msgRef;
    protected ResponseIdentificationType respIdentification;

    /**
     * Gets the value of the msgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReferenceType }
     *     
     */
    public MessageReferenceType getMsgRef() {
        return msgRef;
    }

    /**
     * Sets the value of the msgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReferenceType }
     *     
     */
    public void setMsgRef(MessageReferenceType value) {
        this.msgRef = value;
    }

    /**
     * Gets the value of the respIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseIdentificationType }
     *     
     */
    public ResponseIdentificationType getRespIdentification() {
        return respIdentification;
    }

    /**
     * Sets the value of the respIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseIdentificationType }
     *     
     */
    public void setRespIdentification(ResponseIdentificationType value) {
        this.respIdentification = value;
    }

}
