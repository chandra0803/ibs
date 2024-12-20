
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product
 * 
 * <p>Java class for TravelProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="product" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ProductDateTimeTypeI" minOccurs="0"/&gt;
 *         &lt;element name="boardpointDetail" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}LocationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="offpointDetail" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}LocationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="companyDetail" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CompanyIdentificationTypeI_2785C" minOccurs="0"/&gt;
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ProductIdentificationDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="typeDetail" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ProductTypeDetailsTypeI_48265C" minOccurs="0"/&gt;
 *         &lt;element name="processingIndicator" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType", propOrder = {
    "product",
    "boardpointDetail",
    "offpointDetail",
    "companyDetail",
    "productDetails",
    "typeDetail",
    "processingIndicator"
})
public class TravelProductInformationType {

    protected ProductDateTimeTypeI product;
    protected LocationTypeI boardpointDetail;
    protected LocationTypeI offpointDetail;
    protected CompanyIdentificationTypeI2785C companyDetail;
    protected ProductIdentificationDetailsTypeI productDetails;
    protected ProductTypeDetailsTypeI48265C typeDetail;
    protected String processingIndicator;

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
     *     {@link CompanyIdentificationTypeI2785C }
     *     
     */
    public CompanyIdentificationTypeI2785C getCompanyDetail() {
        return companyDetail;
    }

    /**
     * Sets the value of the companyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI2785C }
     *     
     */
    public void setCompanyDetail(CompanyIdentificationTypeI2785C value) {
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

    /**
     * Gets the value of the typeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI48265C }
     *     
     */
    public ProductTypeDetailsTypeI48265C getTypeDetail() {
        return typeDetail;
    }

    /**
     * Sets the value of the typeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI48265C }
     *     
     */
    public void setTypeDetail(ProductTypeDetailsTypeI48265C value) {
        this.typeDetail = value;
    }

    /**
     * Gets the value of the processingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingIndicator() {
        return processingIndicator;
    }

    /**
     * Sets the value of the processingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingIndicator(String value) {
        this.processingIndicator = value;
    }

}
