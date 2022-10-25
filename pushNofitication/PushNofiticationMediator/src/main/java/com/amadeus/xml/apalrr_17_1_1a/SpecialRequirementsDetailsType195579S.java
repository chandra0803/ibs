
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsType_195579S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType_195579S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementsInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsTypeDetailsType_273327C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType_195579S", propOrder = {
    "specialRequirementsInfo"
})
public class SpecialRequirementsDetailsType195579S {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsType273327C specialRequirementsInfo;

    /**
     * Gets the value of the specialRequirementsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsType273327C }
     *     
     */
    public SpecialRequirementsTypeDetailsType273327C getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /**
     * Sets the value of the specialRequirementsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsType273327C }
     *     
     */
    public void setSpecialRequirementsInfo(SpecialRequirementsTypeDetailsType273327C value) {
        this.specialRequirementsInfo = value;
    }

}
