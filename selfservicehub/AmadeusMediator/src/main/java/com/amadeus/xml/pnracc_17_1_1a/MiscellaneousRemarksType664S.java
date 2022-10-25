
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous, confidential, quality control and invoice remarks, as well as departure comments, applicable to Acceptance, Boarding, Baggage....
 * 
 * <p>Java class for MiscellaneousRemarksType_664S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousRemarksType_664S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remarkDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousRemarksType_664S", propOrder = {
    "remarkDetails"
})
public class MiscellaneousRemarksType664S {

    protected MiscellaneousRemarkType remarkDetails;

    /**
     * Gets the value of the remarkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarkType }
     *     
     */
    public MiscellaneousRemarkType getRemarkDetails() {
        return remarkDetails;
    }

    /**
     * Sets the value of the remarkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarkType }
     *     
     */
    public void setRemarkDetails(MiscellaneousRemarkType value) {
        this.remarkDetails = value;
    }

}
