
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareCategory" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailsType", propOrder = {
    "fareCategory"
})
public class FareDetailsType {

    protected String fareCategory;

    /**
     * Gets the value of the fareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCategory() {
        return fareCategory;
    }

    /**
     * Sets the value of the fareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCategory(String value) {
        this.fareCategory = value;
    }

}
