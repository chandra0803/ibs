
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify tariff details relating to a service or product.
 * 
 * <p>Java class for TariffInformationTypeI_28460S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationTypeI_28460S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationDetailsTypeI_50731C" minOccurs="0"/&gt;
 *         &lt;element name="rateInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RateInformationTypeI_50732C" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationTypeI_28460S", propOrder = {
    "tariffInfo",
    "rateInformation"
})
public class TariffInformationTypeI28460S {

    protected TariffInformationDetailsTypeI50731C tariffInfo;
    protected RateInformationTypeI50732C rateInformation;

    /**
     * Gets the value of the tariffInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationDetailsTypeI50731C }
     *     
     */
    public TariffInformationDetailsTypeI50731C getTariffInfo() {
        return tariffInfo;
    }

    /**
     * Sets the value of the tariffInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationDetailsTypeI50731C }
     *     
     */
    public void setTariffInfo(TariffInformationDetailsTypeI50731C value) {
        this.tariffInfo = value;
    }

    /**
     * Gets the value of the rateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RateInformationTypeI50732C }
     *     
     */
    public RateInformationTypeI50732C getRateInformation() {
        return rateInformation;
    }

    /**
     * Sets the value of the rateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInformationTypeI50732C }
     *     
     */
    public void setRateInformation(RateInformationTypeI50732C value) {
        this.rateInformation = value;
    }

}
