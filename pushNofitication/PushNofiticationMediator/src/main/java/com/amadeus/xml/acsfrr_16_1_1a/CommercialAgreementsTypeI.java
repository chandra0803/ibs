
package com.amadeus.xml.acsfrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify commercial agreements between two  or more companies related to joint, shared, lease operations etc.
 * 
 * <p>Java class for CommercialAgreementsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialAgreementsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeshareDetails" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CompanyRoleIdentificationTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialAgreementsTypeI", propOrder = {
    "codeshareDetails"
})
public class CommercialAgreementsTypeI {

    @XmlElement(required = true)
    protected CompanyRoleIdentificationTypeI codeshareDetails;

    /**
     * Gets the value of the codeshareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyRoleIdentificationTypeI }
     *     
     */
    public CompanyRoleIdentificationTypeI getCodeshareDetails() {
        return codeshareDetails;
    }

    /**
     * Sets the value of the codeshareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyRoleIdentificationTypeI }
     *     
     */
    public void setCodeshareDetails(CompanyRoleIdentificationTypeI value) {
        this.codeshareDetails = value;
    }

}
