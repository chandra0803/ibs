
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional details including the types of product data, the actual data, the number available, and the charges for usage.
 * 
 * <p>Java class for AdditionalProductDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productArea" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductDataInformationTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsTypeU", propOrder = {
    "productArea",
    "productDetails"
})
public class AdditionalProductDetailsTypeU {

    @XmlElement(required = true)
    protected String productArea;
    @XmlElement(required = true)
    protected ProductDataInformationTypeU productDetails;

    /**
     * Gets the value of the productArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductArea() {
        return productArea;
    }

    /**
     * Sets the value of the productArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductArea(String value) {
        this.productArea = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDataInformationTypeU }
     *     
     */
    public ProductDataInformationTypeU getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDataInformationTypeU }
     *     
     */
    public void setProductDetails(ProductDataInformationTypeU value) {
        this.productDetails = value;
    }

}
