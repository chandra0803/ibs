
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * provide oversale information
 * 
 * <p>Java class for OversaleDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OversaleDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oversaleNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericDecimal_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="oversaleIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OversaleDataType", propOrder = {
    "oversaleNumber",
    "oversaleIndicator"
})
public class OversaleDataType {

    protected BigDecimal oversaleNumber;
    protected List<String> oversaleIndicator;

    /**
     * Gets the value of the oversaleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOversaleNumber() {
        return oversaleNumber;
    }

    /**
     * Sets the value of the oversaleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOversaleNumber(BigDecimal value) {
        this.oversaleNumber = value;
    }

    /**
     * Gets the value of the oversaleIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oversaleIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOversaleIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOversaleIndicator() {
        if (oversaleIndicator == null) {
            oversaleIndicator = new ArrayList<String>();
        }
        return this.oversaleIndicator;
    }

}
