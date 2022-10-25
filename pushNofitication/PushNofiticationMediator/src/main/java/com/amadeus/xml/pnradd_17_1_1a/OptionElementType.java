
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an Amadeus PNR Option element
 * 
 * <p>Java class for OptionElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="optionDetail" type="{http://xml.amadeus.com/PNRADD_17_1_1A}OptionElementInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionElementType", propOrder = {
    "optionDetail"
})
public class OptionElementType {

    protected OptionElementInformationType optionDetail;

    /**
     * Gets the value of the optionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OptionElementInformationType }
     *     
     */
    public OptionElementInformationType getOptionDetail() {
        return optionDetail;
    }

    /**
     * Sets the value of the optionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionElementInformationType }
     *     
     */
    public void setOptionDetail(OptionElementInformationType value) {
        this.optionDetail = value;
    }

}
