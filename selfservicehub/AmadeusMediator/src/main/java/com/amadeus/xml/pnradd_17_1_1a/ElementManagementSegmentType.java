
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the PNR segments/elements references and action to apply.
 * 
 * <p>Java class for ElementManagementSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementManagementSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReferencingDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="segmentName" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementManagementSegmentType", propOrder = {
    "reference",
    "segmentName"
})
public class ElementManagementSegmentType {

    protected ReferencingDetailsType reference;
    @XmlElement(required = true)
    protected String segmentName;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsType }
     *     
     */
    public ReferencingDetailsType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsType }
     *     
     */
    public void setReference(ReferencingDetailsType value) {
        this.reference = value;
    }

    /**
     * Gets the value of the segmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * Sets the value of the segmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentName(String value) {
        this.segmentName = value;
    }

}
