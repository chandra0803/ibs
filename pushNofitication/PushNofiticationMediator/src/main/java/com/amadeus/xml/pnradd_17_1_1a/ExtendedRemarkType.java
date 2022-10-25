
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey a structured remark
 * 
 * <p>Java class for ExtendedRemarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedRemarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="structuredRemark" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MiscellaneousRemarkType_210664C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedRemarkType", propOrder = {
    "structuredRemark"
})
public class ExtendedRemarkType {

    protected MiscellaneousRemarkType210664C structuredRemark;

    /**
     * Gets the value of the structuredRemark property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarkType210664C }
     *     
     */
    public MiscellaneousRemarkType210664C getStructuredRemark() {
        return structuredRemark;
    }

    /**
     * Sets the value of the structuredRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarkType210664C }
     *     
     */
    public void setStructuredRemark(MiscellaneousRemarkType210664C value) {
        this.structuredRemark = value;
    }

}
