
package com.amadeus.xml.tatres_15_2_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the conversion rate and the monetary amount.
 * 
 * <p>Java class for ConversionRateDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pricingAmount" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumericDecimal_Length1To18" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateDetailsTypeI", propOrder = {
    "pricingAmount"
})
public class ConversionRateDetailsTypeI {

    protected BigDecimal pricingAmount;

    /**
     * Gets the value of the pricingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricingAmount() {
        return pricingAmount;
    }

    /**
     * Sets the value of the pricingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricingAmount(BigDecimal value) {
        this.pricingAmount = value;
    }

}
