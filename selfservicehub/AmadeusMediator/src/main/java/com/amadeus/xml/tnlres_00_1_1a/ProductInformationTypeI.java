
package com.amadeus.xml.tnlres_00_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to availability status or cabin configuration for a product
 * 
 * <p>Java class for ProductInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="product" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ProductDetailsTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationTypeI", propOrder = {
    "product"
})
public class ProductInformationTypeI {

    protected ProductDetailsTypeI product;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsTypeI }
     *     
     */
    public ProductDetailsTypeI getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsTypeI }
     *     
     */
    public void setProduct(ProductDetailsTypeI value) {
        this.product = value;
    }

}
