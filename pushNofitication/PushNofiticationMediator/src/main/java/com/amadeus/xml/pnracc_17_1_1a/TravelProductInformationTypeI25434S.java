
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationTypeI_25434S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI_25434S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductDateTimeTypeI_46338C"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyIdentificationTypeI_46335C"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductIdentificationDetailsTypeI_46336C"/>
 *         &lt;element name="flightTypeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductTypeDetailsTypeI_46337C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI_25434S", propOrder = {
    "flightDate",
    "companyDetails",
    "flightIdentification",
    "flightTypeDetails"
})
public class TravelProductInformationTypeI25434S {

    @XmlElement(required = true)
    protected ProductDateTimeTypeI46338C flightDate;
    @XmlElement(required = true)
    protected CompanyIdentificationTypeI46335C companyDetails;
    @XmlElement(required = true)
    protected ProductIdentificationDetailsTypeI46336C flightIdentification;
    protected ProductTypeDetailsTypeI46337C flightTypeDetails;

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI46338C }
     *     
     */
    public ProductDateTimeTypeI46338C getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI46338C }
     *     
     */
    public void setFlightDate(ProductDateTimeTypeI46338C value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI46335C }
     *     
     */
    public CompanyIdentificationTypeI46335C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI46335C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI46335C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI46336C }
     *     
     */
    public ProductIdentificationDetailsTypeI46336C getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI46336C }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsTypeI46336C value) {
        this.flightIdentification = value;
    }

    /**
     * Gets the value of the flightTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI46337C }
     *     
     */
    public ProductTypeDetailsTypeI46337C getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /**
     * Sets the value of the flightTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI46337C }
     *     
     */
    public void setFlightTypeDetails(ProductTypeDetailsTypeI46337C value) {
        this.flightTypeDetails = value;
    }

}
