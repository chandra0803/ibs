
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationType_147123S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType_147123S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}LocationTypeI" minOccurs="0"/>
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}LocationTypeI" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyIdentificationTypeI_212019C"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/APALRR_17_1_1A}ProductIdentificationDetailsType_212020C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType_147123S", propOrder = {
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification"
})
public class TravelProductInformationType147123S {

    protected LocationTypeI boardPointDetails;
    protected LocationTypeI offpointDetails;
    @XmlElement(required = true)
    protected CompanyIdentificationTypeI212019C companyDetails;
    @XmlElement(required = true)
    protected ProductIdentificationDetailsType212020C flightIdentification;

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setBoardPointDetails(LocationTypeI value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setOffpointDetails(LocationTypeI value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI212019C }
     *     
     */
    public CompanyIdentificationTypeI212019C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI212019C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI212019C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsType212020C }
     *     
     */
    public ProductIdentificationDetailsType212020C getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsType212020C }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsType212020C value) {
        this.flightIdentification = value;
    }

}
