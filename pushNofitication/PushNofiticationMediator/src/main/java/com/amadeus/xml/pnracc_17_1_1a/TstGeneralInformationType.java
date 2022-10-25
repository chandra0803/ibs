
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describe general information concerning TST
 * 
 * <p>Java class for TstGeneralInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TstGeneralInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TstGeneralInformationDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TstGeneralInformationType", propOrder = {
    "generalInformation"
})
public class TstGeneralInformationType {

    @XmlElement(required = true)
    protected TstGeneralInformationDetailsType generalInformation;

    /**
     * Gets the value of the generalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TstGeneralInformationDetailsType }
     *     
     */
    public TstGeneralInformationDetailsType getGeneralInformation() {
        return generalInformation;
    }

    /**
     * Sets the value of the generalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TstGeneralInformationDetailsType }
     *     
     */
    public void setGeneralInformation(TstGeneralInformationDetailsType value) {
        this.generalInformation = value;
    }

}
