
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify availability and additional services for a product class.
 * 
 * <p>Java class for ProductDetailsTypeI_36664C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetailsTypeI_36664C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailsTypeI_36664C", propOrder = {
    "designator"
})
public class ProductDetailsTypeI36664C {

    @XmlElement(required = true)
    protected String designator;

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignator(String value) {
        this.designator = value;
    }

}
