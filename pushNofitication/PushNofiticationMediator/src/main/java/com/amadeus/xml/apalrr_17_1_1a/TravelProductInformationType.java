
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyIdentificationTypeI_210109C"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/APALRR_17_1_1A}ProductIdentificationDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType", propOrder = {
    "companyDetails",
    "flightIdentification"
})
public class TravelProductInformationType {

    @XmlElement(required = true)
    protected CompanyIdentificationTypeI210109C companyDetails;
    @XmlElement(required = true)
    protected ProductIdentificationDetailsType flightIdentification;

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI210109C }
     *     
     */
    public CompanyIdentificationTypeI210109C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI210109C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI210109C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsType }
     *     
     */
    public ProductIdentificationDetailsType getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsType }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsType value) {
        this.flightIdentification = value;
    }

}
