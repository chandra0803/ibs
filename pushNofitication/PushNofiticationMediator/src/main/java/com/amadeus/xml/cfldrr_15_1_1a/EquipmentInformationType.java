
package com.amadeus.xml.cfldrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specify information relating to the Transport type.
 * 
 * <p>Java class for EquipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modeOfTransport" type="{http://xml.amadeus.com/CFLDRR_15_1_1A}ModeOfTransportTypeI"/>
 *         &lt;element name="equipment" type="{http://xml.amadeus.com/CFLDRR_15_1_1A}EquipmentIdentificationType"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/CFLDRR_15_1_1A}CompanyIdentificationTypeI_204285C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInformationType", propOrder = {
    "modeOfTransport",
    "equipment",
    "companyDetails"
})
public class EquipmentInformationType {

    @XmlElement(required = true)
    protected ModeOfTransportTypeI modeOfTransport;
    @XmlElement(required = true)
    protected EquipmentIdentificationType equipment;
    protected CompanyIdentificationTypeI204285C companyDetails;

    /**
     * Gets the value of the modeOfTransport property.
     * 
     * @return
     *     possible object is
     *     {@link ModeOfTransportTypeI }
     *     
     */
    public ModeOfTransportTypeI getModeOfTransport() {
        return modeOfTransport;
    }

    /**
     * Sets the value of the modeOfTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeOfTransportTypeI }
     *     
     */
    public void setModeOfTransport(ModeOfTransportTypeI value) {
        this.modeOfTransport = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentIdentificationType }
     *     
     */
    public EquipmentIdentificationType getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentIdentificationType }
     *     
     */
    public void setEquipment(EquipmentIdentificationType value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI204285C }
     *     
     */
    public CompanyIdentificationTypeI204285C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI204285C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI204285C value) {
        this.companyDetails = value;
    }

}
