
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing a compensation given to a Customer
 * 
 * <p>Java class for CompensationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompensationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compensationDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompensationDetailsType"/>
 *         &lt;element name="compensationAttributes" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeInformationType_250892C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompensationType", propOrder = {
    "compensationDetails",
    "compensationAttributes"
})
public class CompensationType {

    @XmlElement(required = true)
    protected CompensationDetailsType compensationDetails;
    protected CodedAttributeInformationType250892C compensationAttributes;

    /**
     * Gets the value of the compensationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationDetailsType }
     *     
     */
    public CompensationDetailsType getCompensationDetails() {
        return compensationDetails;
    }

    /**
     * Sets the value of the compensationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationDetailsType }
     *     
     */
    public void setCompensationDetails(CompensationDetailsType value) {
        this.compensationDetails = value;
    }

    /**
     * Gets the value of the compensationAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeInformationType250892C }
     *     
     */
    public CodedAttributeInformationType250892C getCompensationAttributes() {
        return compensationAttributes;
    }

    /**
     * Sets the value of the compensationAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeInformationType250892C }
     *     
     */
    public void setCompensationAttributes(CodedAttributeInformationType250892C value) {
        this.compensationAttributes = value;
    }

}
