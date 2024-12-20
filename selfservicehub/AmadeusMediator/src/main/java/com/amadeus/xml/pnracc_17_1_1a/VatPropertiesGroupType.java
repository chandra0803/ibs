
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * contains the VAT computing info
 * 
 * <p>Java class for VatPropertiesGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VatPropertiesGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vatRateAndAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_53012S"/&gt;
 *         &lt;element name="fareFiling" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VatPropertiesGroupType", propOrder = {
    "vatRateAndAmount",
    "fareFiling"
})
public class VatPropertiesGroupType {

    @XmlElement(required = true)
    protected MonetaryInformationTypeI53012S vatRateAndAmount;
    @XmlElement(required = true)
    protected SelectionDetailsTypeI fareFiling;

    /**
     * Gets the value of the vatRateAndAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationTypeI53012S }
     *     
     */
    public MonetaryInformationTypeI53012S getVatRateAndAmount() {
        return vatRateAndAmount;
    }

    /**
     * Sets the value of the vatRateAndAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationTypeI53012S }
     *     
     */
    public void setVatRateAndAmount(MonetaryInformationTypeI53012S value) {
        this.vatRateAndAmount = value;
    }

    /**
     * Gets the value of the fareFiling property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsTypeI }
     *     
     */
    public SelectionDetailsTypeI getFareFiling() {
        return fareFiling;
    }

    /**
     * Sets the value of the fareFiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsTypeI }
     *     
     */
    public void setFareFiling(SelectionDetailsTypeI value) {
        this.fareFiling = value;
    }

}
