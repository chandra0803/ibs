
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details of conversion rates.
 * 
 * <p>Java class for ConversionRateTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstRateDetail" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ConversionRateDetailsTypeI"/&gt;
 *         &lt;element name="secondRateDetail" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ConversionRateDetailsTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateTypeI", propOrder = {
    "firstRateDetail",
    "secondRateDetail"
})
public class ConversionRateTypeI {

    @XmlElement(required = true)
    protected ConversionRateDetailsTypeI firstRateDetail;
    protected ConversionRateDetailsTypeI secondRateDetail;

    /**
     * Gets the value of the firstRateDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public ConversionRateDetailsTypeI getFirstRateDetail() {
        return firstRateDetail;
    }

    /**
     * Sets the value of the firstRateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public void setFirstRateDetail(ConversionRateDetailsTypeI value) {
        this.firstRateDetail = value;
    }

    /**
     * Gets the value of the secondRateDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public ConversionRateDetailsTypeI getSecondRateDetail() {
        return secondRateDetail;
    }

    /**
     * Sets the value of the secondRateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public void setSecondRateDetail(ConversionRateDetailsTypeI value) {
        this.secondRateDetail = value;
    }

}
