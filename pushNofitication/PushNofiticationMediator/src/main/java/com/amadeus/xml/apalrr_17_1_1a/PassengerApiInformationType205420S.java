
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify personal identification date for passengers under API facility
 * 
 * <p>Java class for PassengerApiInformationType_205420S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerApiInformationType_205420S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentIdentification" type="{http://xml.amadeus.com/APALRR_17_1_1A}DocumentIdTypeI_284785C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerApiInformationType_205420S", propOrder = {
    "documentIdentification"
})
public class PassengerApiInformationType205420S {

    @XmlElement(required = true)
    protected DocumentIdTypeI284785C documentIdentification;

    /**
     * Gets the value of the documentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdTypeI284785C }
     *     
     */
    public DocumentIdTypeI284785C getDocumentIdentification() {
        return documentIdentification;
    }

    /**
     * Sets the value of the documentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdTypeI284785C }
     *     
     */
    public void setDocumentIdentification(DocumentIdTypeI284785C value) {
        this.documentIdentification = value;
    }

}
