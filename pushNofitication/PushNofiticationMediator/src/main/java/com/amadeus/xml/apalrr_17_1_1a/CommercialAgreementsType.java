
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify commercial agreements between two  or more companies related to joint, shared, lease operations etc.
 * 
 * <p>Java class for CommercialAgreementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialAgreementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeshareDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyRoleIdentificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialAgreementsType", propOrder = {
    "codeshareDetails"
})
public class CommercialAgreementsType {

    @XmlElement(required = true)
    protected CompanyRoleIdentificationType codeshareDetails;

    /**
     * Gets the value of the codeshareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyRoleIdentificationType }
     *     
     */
    public CompanyRoleIdentificationType getCodeshareDetails() {
        return codeshareDetails;
    }

    /**
     * Sets the value of the codeshareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyRoleIdentificationType }
     *     
     */
    public void setCodeshareDetails(CompanyRoleIdentificationType value) {
        this.codeshareDetails = value;
    }

}
