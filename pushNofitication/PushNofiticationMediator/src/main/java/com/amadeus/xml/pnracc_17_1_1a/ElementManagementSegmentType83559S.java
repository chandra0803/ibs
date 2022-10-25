
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the PNR segments/elements references and action to apply
 * 
 * <p>Java class for ElementManagementSegmentType_83559S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementManagementSegmentType_83559S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferencingDetailsType_127526C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementManagementSegmentType_83559S", propOrder = {
    "reference"
})
public class ElementManagementSegmentType83559S {

    @XmlElement(required = true)
    protected ReferencingDetailsType127526C reference;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsType127526C }
     *     
     */
    public ReferencingDetailsType127526C getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsType127526C }
     *     
     */
    public void setReference(ReferencingDetailsType127526C value) {
        this.reference = value;
    }

}
