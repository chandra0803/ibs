
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * specify credit card data for credit card authorization - USED IN CCVRQT
 * 
 * <p>Java class for CreditCardDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CreditCardInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardDataType", propOrder = {
    "ccInfo"
})
public class CreditCardDataType {

    protected CreditCardInformationType ccInfo;

    /**
     * Gets the value of the ccInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInformationType }
     *     
     */
    public CreditCardInformationType getCcInfo() {
        return ccInfo;
    }

    /**
     * Sets the value of the ccInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInformationType }
     *     
     */
    public void setCcInfo(CreditCardInformationType value) {
        this.ccInfo = value;
    }

}
