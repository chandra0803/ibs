
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsType_206425S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType_206425S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementsInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsTypeDetailsType_285904C"/>
 *         &lt;element name="quotaInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuotaRelatedInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType_206425S", propOrder = {
    "specialRequirementsInfo",
    "quotaInfo"
})
public class SpecialRequirementsDetailsType206425S {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsType285904C specialRequirementsInfo;
    protected QuotaRelatedInformationType quotaInfo;

    /**
     * Gets the value of the specialRequirementsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsType285904C }
     *     
     */
    public SpecialRequirementsTypeDetailsType285904C getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /**
     * Sets the value of the specialRequirementsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsType285904C }
     *     
     */
    public void setSpecialRequirementsInfo(SpecialRequirementsTypeDetailsType285904C value) {
        this.specialRequirementsInfo = value;
    }

    /**
     * Gets the value of the quotaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaRelatedInformationType }
     *     
     */
    public QuotaRelatedInformationType getQuotaInfo() {
        return quotaInfo;
    }

    /**
     * Sets the value of the quotaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaRelatedInformationType }
     *     
     */
    public void setQuotaInfo(QuotaRelatedInformationType value) {
        this.quotaInfo = value;
    }

}
