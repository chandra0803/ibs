
package com.amadeus.xml.pnracc_17_1_1a;

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
 * &lt;complexType name="ExtendedRemarkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="structuredRemark" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarkType_210666C" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedRemarkType", propOrder = {
    "structuredRemark"
})
public class ExtendedRemarkType {

    protected MiscellaneousRemarkType210666C structuredRemark;

    /**
     * Gets the value of the structuredRemark property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarkType210666C }
     *     
     */
    public MiscellaneousRemarkType210666C getStructuredRemark() {
        return structuredRemark;
    }

    /**
     * Sets the value of the structuredRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarkType210666C }
     *     
     */
    public void setStructuredRemark(MiscellaneousRemarkType210666C value) {
        this.structuredRemark = value;
    }

}
