
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To reference a segment cabin
 * 
 * <p>Java class for SegmentCabinIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentCabinIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cabinCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentCabinIdentificationType", propOrder = {
    "cabinCode"
})
public class SegmentCabinIdentificationType {

    @XmlElement(required = true)
    protected String cabinCode;

    /**
     * Gets the value of the cabinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCode() {
        return cabinCode;
    }

    /**
     * Sets the value of the cabinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCode(String value) {
        this.cabinCode = value;
    }

}
