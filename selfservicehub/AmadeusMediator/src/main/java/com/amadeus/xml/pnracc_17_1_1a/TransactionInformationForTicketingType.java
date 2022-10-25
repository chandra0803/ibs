
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * to specify details relating to the transaction
 * 
 * <p>Java class for TransactionInformationForTicketingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInformationForTicketingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TransactionInformationsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInformationForTicketingType", propOrder = {
    "transactionDetails"
})
public class TransactionInformationForTicketingType {

    @XmlElement(required = true)
    protected TransactionInformationsType transactionDetails;

    /**
     * Gets the value of the transactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationsType }
     *     
     */
    public TransactionInformationsType getTransactionDetails() {
        return transactionDetails;
    }

    /**
     * Sets the value of the transactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationsType }
     *     
     */
    public void setTransactionDetails(TransactionInformationsType value) {
        this.transactionDetails = value;
    }

}
