
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a pertinent quantity.
 * 
 * <p>Java class for QuantityType_25433S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityType_25433S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityDetailsTypeI_46334C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType_25433S", propOrder = {
    "quantityDetails"
})
public class QuantityType25433S {

    @XmlElement(required = true)
    protected QuantityDetailsTypeI46334C quantityDetails;

    /**
     * Gets the value of the quantityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDetailsTypeI46334C }
     *     
     */
    public QuantityDetailsTypeI46334C getQuantityDetails() {
        return quantityDetails;
    }

    /**
     * Sets the value of the quantityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDetailsTypeI46334C }
     *     
     */
    public void setQuantityDetails(QuantityDetailsTypeI46334C value) {
        this.quantityDetails = value;
    }

}
