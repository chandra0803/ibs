
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the product data in coded or text form,              the number available, and the charge for usage
 * 
 * <p>Java class for ProductDataInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDataInformationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productCategory" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="productCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To14" minOccurs="0"/>
 *         &lt;element name="addOnIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="productDescription" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To188" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDataInformationTypeU", propOrder = {
    "productCategory",
    "productCode",
    "addOnIndicator",
    "productDescription"
})
public class ProductDataInformationTypeU {

    @XmlElement(required = true)
    protected String productCategory;
    protected String productCode;
    protected BigInteger addOnIndicator;
    protected String productDescription;

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the addOnIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddOnIndicator() {
        return addOnIndicator;
    }

    /**
     * Sets the value of the addOnIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddOnIndicator(BigInteger value) {
        this.addOnIndicator = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

}
