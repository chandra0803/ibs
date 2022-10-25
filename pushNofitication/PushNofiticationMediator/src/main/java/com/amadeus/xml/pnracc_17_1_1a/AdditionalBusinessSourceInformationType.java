
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify ownership and creator of a PNR
 * 
 * <p>Java class for AdditionalBusinessSourceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalBusinessSourceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originatorDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginatorIdentificationDetailsTypeI_198179C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBusinessSourceInformationType", propOrder = {
    "originatorDetails"
})
public class AdditionalBusinessSourceInformationType {

    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsTypeI198179C originatorDetails;

    /**
     * Gets the value of the originatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI198179C }
     *     
     */
    public OriginatorIdentificationDetailsTypeI198179C getOriginatorDetails() {
        return originatorDetails;
    }

    /**
     * Sets the value of the originatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI198179C }
     *     
     */
    public void setOriginatorDetails(OriginatorIdentificationDetailsTypeI198179C value) {
        this.originatorDetails = value;
    }

}
