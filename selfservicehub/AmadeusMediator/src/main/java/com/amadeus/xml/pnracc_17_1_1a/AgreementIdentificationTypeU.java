
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the agreement details.
 * 
 * <p>Java class for AgreementIdentificationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementIdentificationTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreementDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AgreementTypeIdentificationTypeU" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementIdentificationTypeU", propOrder = {
    "agreementDetails"
})
public class AgreementIdentificationTypeU {

    protected AgreementTypeIdentificationTypeU agreementDetails;

    /**
     * Gets the value of the agreementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementTypeIdentificationTypeU }
     *     
     */
    public AgreementTypeIdentificationTypeU getAgreementDetails() {
        return agreementDetails;
    }

    /**
     * Sets the value of the agreementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementTypeIdentificationTypeU }
     *     
     */
    public void setAgreementDetails(AgreementTypeIdentificationTypeU value) {
        this.agreementDetails = value;
    }

}
