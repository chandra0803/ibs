
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of facilities for a product or service by type or description.
 * 
 * <p>Java class for ProductFacilitiesTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFacilitiesTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entertainement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="entertainementDescription" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="productQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="productExtensionCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" maxOccurs="26" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFacilitiesTypeI", propOrder = {
    "entertainement",
    "entertainementDescription",
    "productQualifier",
    "productExtensionCode"
})
public class ProductFacilitiesTypeI {

    protected String entertainement;
    protected String entertainementDescription;
    protected String productQualifier;
    protected List<String> productExtensionCode;

    /**
     * Gets the value of the entertainement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntertainement() {
        return entertainement;
    }

    /**
     * Sets the value of the entertainement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntertainement(String value) {
        this.entertainement = value;
    }

    /**
     * Gets the value of the entertainementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntertainementDescription() {
        return entertainementDescription;
    }

    /**
     * Sets the value of the entertainementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntertainementDescription(String value) {
        this.entertainementDescription = value;
    }

    /**
     * Gets the value of the productQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductQualifier() {
        return productQualifier;
    }

    /**
     * Sets the value of the productQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductQualifier(String value) {
        this.productQualifier = value;
    }

    /**
     * Gets the value of the productExtensionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productExtensionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductExtensionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductExtensionCode() {
        if (productExtensionCode == null) {
            productExtensionCode = new ArrayList<String>();
        }
        return this.productExtensionCode;
    }

}
