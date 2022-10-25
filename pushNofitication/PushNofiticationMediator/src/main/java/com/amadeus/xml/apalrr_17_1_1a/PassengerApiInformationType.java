
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify personal identification date for passengers under API facility
 * 
 * <p>Java class for PassengerApiInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerApiInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerContactDataTypeI" minOccurs="0"/>
 *         &lt;element name="documentIdentification" type="{http://xml.amadeus.com/APALRR_17_1_1A}DocumentIdTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerApiInformationType", propOrder = {
    "contactDetails",
    "documentIdentification"
})
public class PassengerApiInformationType {

    protected PassengerContactDataTypeI contactDetails;
    protected DocumentIdTypeI documentIdentification;

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerContactDataTypeI }
     *     
     */
    public PassengerContactDataTypeI getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerContactDataTypeI }
     *     
     */
    public void setContactDetails(PassengerContactDataTypeI value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the documentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdTypeI }
     *     
     */
    public DocumentIdTypeI getDocumentIdentification() {
        return documentIdentification;
    }

    /**
     * Sets the value of the documentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdTypeI }
     *     
     */
    public void setDocumentIdentification(DocumentIdTypeI value) {
        this.documentIdentification = value;
    }

}
