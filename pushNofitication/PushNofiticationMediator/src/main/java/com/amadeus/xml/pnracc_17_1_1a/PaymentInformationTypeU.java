
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning the payment.
 * 
 * <p>Java class for PaymentInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInformationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentDetailsTypeU"/>
 *         &lt;element name="creditCardInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CreditCardInformationTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformationTypeU", propOrder = {
    "paymentDetails",
    "creditCardInformation"
})
public class PaymentInformationTypeU {

    @XmlElement(required = true)
    protected PaymentDetailsTypeU paymentDetails;
    protected CreditCardInformationTypeU creditCardInformation;

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsTypeU }
     *     
     */
    public PaymentDetailsTypeU getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsTypeU }
     *     
     */
    public void setPaymentDetails(PaymentDetailsTypeU value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the creditCardInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInformationTypeU }
     *     
     */
    public CreditCardInformationTypeU getCreditCardInformation() {
        return creditCardInformation;
    }

    /**
     * Sets the value of the creditCardInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInformationTypeU }
     *     
     */
    public void setCreditCardInformation(CreditCardInformationTypeU value) {
        this.creditCardInformation = value;
    }

}
