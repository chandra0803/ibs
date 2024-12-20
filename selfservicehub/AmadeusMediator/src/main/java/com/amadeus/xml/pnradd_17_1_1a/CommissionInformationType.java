
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Amadeus commission information
 * 
 * <p>Java class for CommissionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="percentage" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericDecimal_Length1To5" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericDecimal_Length1To10" minOccurs="0"/&gt;
 *         &lt;element name="vatIndicator" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="remitIndicator" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionInformationType", propOrder = {
    "percentage",
    "amount",
    "vatIndicator",
    "remitIndicator"
})
public class CommissionInformationType {

    protected BigDecimal percentage;
    protected BigDecimal amount;
    protected String vatIndicator;
    protected String remitIndicator;

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the vatIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatIndicator() {
        return vatIndicator;
    }

    /**
     * Sets the value of the vatIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatIndicator(String value) {
        this.vatIndicator = value;
    }

    /**
     * Gets the value of the remitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitIndicator() {
        return remitIndicator;
    }

    /**
     * Sets the value of the remitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitIndicator(String value) {
        this.remitIndicator = value;
    }

}
