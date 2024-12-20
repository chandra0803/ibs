
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify tax details.
 * 
 * <p>Java class for TaxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionnalCharge" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxesType", propOrder = {
    "additionnalCharge"
})
public class TaxesType {

    @XmlElement(required = true)
    protected TaxDetailsTypeU additionnalCharge;

    /**
     * Gets the value of the additionnalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsTypeU }
     *     
     */
    public TaxDetailsTypeU getAdditionnalCharge() {
        return additionnalCharge;
    }

    /**
     * Sets the value of the additionnalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsTypeU }
     *     
     */
    public void setAdditionnalCharge(TaxDetailsTypeU value) {
        this.additionnalCharge = value;
    }

}
