
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsType_195223S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType_195223S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementsInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsTypeDetailsType" minOccurs="0"/>
 *         &lt;element name="seatDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDataDetailsType_272905C" minOccurs="0"/>
 *         &lt;element name="quotaInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuotaRelatedInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType_195223S", propOrder = {
    "specialRequirementsInfo",
    "seatDetails",
    "quotaInfo"
})
public class SpecialRequirementsDetailsType195223S {

    protected SpecialRequirementsTypeDetailsType specialRequirementsInfo;
    protected SpecialRequirementsDataDetailsType272905C seatDetails;
    protected QuotaRelatedInformationType quotaInfo;

    /**
     * Gets the value of the specialRequirementsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsType }
     *     
     */
    public SpecialRequirementsTypeDetailsType getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /**
     * Sets the value of the specialRequirementsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsType }
     *     
     */
    public void setSpecialRequirementsInfo(SpecialRequirementsTypeDetailsType value) {
        this.specialRequirementsInfo = value;
    }

    /**
     * Gets the value of the seatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDataDetailsType272905C }
     *     
     */
    public SpecialRequirementsDataDetailsType272905C getSeatDetails() {
        return seatDetails;
    }

    /**
     * Sets the value of the seatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDataDetailsType272905C }
     *     
     */
    public void setSeatDetails(SpecialRequirementsDataDetailsType272905C value) {
        this.seatDetails = value;
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
