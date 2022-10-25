
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous, confidential, quality control and invoice remarks.
 * 
 * <p>Java class for MiscellaneousRemarksType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousRemarksType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remarks" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MiscellaneousRemarkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousRemarksType", propOrder = {
    "remarks"
})
public class MiscellaneousRemarksType {

    protected MiscellaneousRemarkType remarks;

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarkType }
     *     
     */
    public MiscellaneousRemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarkType }
     *     
     */
    public void setRemarks(MiscellaneousRemarkType value) {
        this.remarks = value;
    }

}
