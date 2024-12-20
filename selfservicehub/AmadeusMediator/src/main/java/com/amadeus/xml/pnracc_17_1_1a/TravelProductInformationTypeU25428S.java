
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a travel product.
 * 
 * <p>Java class for TravelProductInformationTypeU_25428S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeU_25428S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTimeInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductDateAndTimeTypeU_46325C" minOccurs="0"/&gt;
 *         &lt;element name="locationInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LocationTypeU_46324C" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="companyInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyIdentificationTypeU" minOccurs="0"/&gt;
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductIdentificationDetailsTypeU_46327C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeU_25428S", propOrder = {
    "dateTimeInformation",
    "locationInformation",
    "companyInformation",
    "productDetails"
})
public class TravelProductInformationTypeU25428S {

    protected ProductDateAndTimeTypeU46325C dateTimeInformation;
    protected List<LocationTypeU46324C> locationInformation;
    protected CompanyIdentificationTypeU companyInformation;
    @XmlElement(required = true)
    protected ProductIdentificationDetailsTypeU46327C productDetails;

    /**
     * Gets the value of the dateTimeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateAndTimeTypeU46325C }
     *     
     */
    public ProductDateAndTimeTypeU46325C getDateTimeInformation() {
        return dateTimeInformation;
    }

    /**
     * Sets the value of the dateTimeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateAndTimeTypeU46325C }
     *     
     */
    public void setDateTimeInformation(ProductDateAndTimeTypeU46325C value) {
        this.dateTimeInformation = value;
    }

    /**
     * Gets the value of the locationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationTypeU46324C }
     * 
     * 
     */
    public List<LocationTypeU46324C> getLocationInformation() {
        if (locationInformation == null) {
            locationInformation = new ArrayList<LocationTypeU46324C>();
        }
        return this.locationInformation;
    }

    /**
     * Gets the value of the companyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeU }
     *     
     */
    public CompanyIdentificationTypeU getCompanyInformation() {
        return companyInformation;
    }

    /**
     * Sets the value of the companyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeU }
     *     
     */
    public void setCompanyInformation(CompanyIdentificationTypeU value) {
        this.companyInformation = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeU46327C }
     *     
     */
    public ProductIdentificationDetailsTypeU46327C getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeU46327C }
     *     
     */
    public void setProductDetails(ProductIdentificationDetailsTypeU46327C value) {
        this.productDetails = value;
    }

}
