
package com.amadeus.xml.tnlres_00_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product
 * 
 * <p>Java class for TravelProductInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="product" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ProductDateTimeTypeI" minOccurs="0"/&gt;
 *         &lt;element name="boardpointDetail" type="{http://xml.amadeus.com/TNLRES_00_1_1A}LocationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="offpointDetail" type="{http://xml.amadeus.com/TNLRES_00_1_1A}LocationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="companyDetail" type="{http://xml.amadeus.com/TNLRES_00_1_1A}CompanyIdentificationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ProductIdentificationDetailsTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI", propOrder = {
    "product",
    "boardpointDetail",
    "offpointDetail",
    "companyDetail",
    "productDetails"
})
public class TravelProductInformationTypeI {

    protected ProductDateTimeTypeI product;
    protected LocationTypeI boardpointDetail;
    protected LocationTypeI offpointDetail;
    protected CompanyIdentificationTypeI companyDetail;
    protected ProductIdentificationDetailsTypeI productDetails;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public ProductDateTimeTypeI getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public void setProduct(ProductDateTimeTypeI value) {
        this.product = value;
    }

    /**
     * Gets the value of the boardpointDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getBoardpointDetail() {
        return boardpointDetail;
    }

    /**
     * Sets the value of the boardpointDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setBoardpointDetail(LocationTypeI value) {
        this.boardpointDetail = value;
    }

    /**
     * Gets the value of the offpointDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getOffpointDetail() {
        return offpointDetail;
    }

    /**
     * Sets the value of the offpointDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setOffpointDetail(LocationTypeI value) {
        this.offpointDetail = value;
    }

    /**
     * Gets the value of the companyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public CompanyIdentificationTypeI getCompanyDetail() {
        return companyDetail;
    }

    /**
     * Sets the value of the companyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public void setCompanyDetail(CompanyIdentificationTypeI value) {
        this.companyDetail = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public ProductIdentificationDetailsTypeI getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public void setProductDetails(ProductIdentificationDetailsTypeI value) {
        this.productDetails = value;
    }

}
