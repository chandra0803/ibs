
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the transport service(s) which is /are to be updated or cancelled
 * 
 * <p>Java class for TransportIdentifierType_25440S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportIdentifierType_25440S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyIdentificationTypeI_46351C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportIdentifierType_25440S", propOrder = {
    "companyIdentification"
})
public class TransportIdentifierType25440S {

    @XmlElement(required = true)
    protected CompanyIdentificationTypeI46351C companyIdentification;

    /**
     * Gets the value of the companyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI46351C }
     *     
     */
    public CompanyIdentificationTypeI46351C getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI46351C }
     *     
     */
    public void setCompanyIdentification(CompanyIdentificationTypeI46351C value) {
        this.companyIdentification = value;
    }

}
