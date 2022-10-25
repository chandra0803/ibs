
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific Hotel reference identification.
 * 
 * <p>Java class for ReferenceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}ReferencingDetailsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInfoType", propOrder = {
    "referenceDetails"
})
public class ReferenceInfoType {

    @XmlElement(required = true)
    protected ReferencingDetailsType referenceDetails;

    /**
     * Gets the value of the referenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsType }
     *     
     */
    public ReferencingDetailsType getReferenceDetails() {
        return referenceDetails;
    }

    /**
     * Sets the value of the referenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsType }
     *     
     */
    public void setReferenceDetails(ReferencingDetailsType value) {
        this.referenceDetails = value;
    }

}
