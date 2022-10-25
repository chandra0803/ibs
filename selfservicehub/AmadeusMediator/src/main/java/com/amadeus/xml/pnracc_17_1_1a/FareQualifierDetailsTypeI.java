
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details which qualify a fare
 * 
 * <p>Java class for FareQualifierDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareCategories" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareCategoryCodesTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsTypeI", propOrder = {
    "fareCategories"
})
public class FareQualifierDetailsTypeI {

    @XmlElement(required = true)
    protected FareCategoryCodesTypeI fareCategories;

    /**
     * Gets the value of the fareCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FareCategoryCodesTypeI }
     *     
     */
    public FareCategoryCodesTypeI getFareCategories() {
        return fareCategories;
    }

    /**
     * Sets the value of the fareCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCategoryCodesTypeI }
     *     
     */
    public void setFareCategories(FareCategoryCodesTypeI value) {
        this.fareCategories = value;
    }

}
