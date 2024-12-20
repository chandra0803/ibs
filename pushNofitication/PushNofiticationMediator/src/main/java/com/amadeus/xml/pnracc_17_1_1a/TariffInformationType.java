
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify tariff details relating to a service or product.
 * 
 * <p>Java class for TariffInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationType", propOrder = {
    "priceDetails"
})
public class TariffInformationType {

    @XmlElement(required = true)
    protected TariffInformationDetailsTypeU priceDetails;

    /**
     * Gets the value of the priceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationDetailsTypeU }
     *     
     */
    public TariffInformationDetailsTypeU getPriceDetails() {
        return priceDetails;
    }

    /**
     * Sets the value of the priceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationDetailsTypeU }
     *     
     */
    public void setPriceDetails(TariffInformationDetailsTypeU value) {
        this.priceDetails = value;
    }

}
