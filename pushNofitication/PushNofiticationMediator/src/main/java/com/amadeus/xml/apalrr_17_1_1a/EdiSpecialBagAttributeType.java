
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a bag attribute
 * 
 * <p>Java class for EdiSpecialBagAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EdiSpecialBagAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialBagAttribute" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_206425S"/>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType" minOccurs="0"/>
 *         &lt;element name="freeSpecialBag" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_136944S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdiSpecialBagAttributeType", propOrder = {
    "specialBagAttribute",
    "attributeDetails",
    "freeSpecialBag"
})
public class EdiSpecialBagAttributeType {

    @XmlElement(required = true)
    protected SpecialRequirementsDetailsType206425S specialBagAttribute;
    protected FreeTextInformationType attributeDetails;
    protected StatusType136944S freeSpecialBag;

    /**
     * Gets the value of the specialBagAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDetailsType206425S }
     *     
     */
    public SpecialRequirementsDetailsType206425S getSpecialBagAttribute() {
        return specialBagAttribute;
    }

    /**
     * Sets the value of the specialBagAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDetailsType206425S }
     *     
     */
    public void setSpecialBagAttribute(SpecialRequirementsDetailsType206425S value) {
        this.specialBagAttribute = value;
    }

    /**
     * Gets the value of the attributeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType }
     *     
     */
    public FreeTextInformationType getAttributeDetails() {
        return attributeDetails;
    }

    /**
     * Sets the value of the attributeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType }
     *     
     */
    public void setAttributeDetails(FreeTextInformationType value) {
        this.attributeDetails = value;
    }

    /**
     * Gets the value of the freeSpecialBag property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType136944S }
     *     
     */
    public StatusType136944S getFreeSpecialBag() {
        return freeSpecialBag;
    }

    /**
     * Sets the value of the freeSpecialBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType136944S }
     *     
     */
    public void setFreeSpecialBag(StatusType136944S value) {
        this.freeSpecialBag = value;
    }

}
