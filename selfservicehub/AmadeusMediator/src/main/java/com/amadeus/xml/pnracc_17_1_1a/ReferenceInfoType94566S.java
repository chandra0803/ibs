
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an association between references given to travellers, to products, to services
 * 
 * <p>Java class for ReferenceInfoType_94566S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInfoType_94566S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferencingDetailsType_142187C" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInfoType_94566S", propOrder = {
    "referenceDetails"
})
public class ReferenceInfoType94566S {

    protected ReferencingDetailsType142187C referenceDetails;

    /**
     * Gets the value of the referenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsType142187C }
     *     
     */
    public ReferencingDetailsType142187C getReferenceDetails() {
        return referenceDetails;
    }

    /**
     * Sets the value of the referenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsType142187C }
     *     
     */
    public void setReferenceDetails(ReferencingDetailsType142187C value) {
        this.referenceDetails = value;
    }

}
