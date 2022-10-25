
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing a compensation given to a Customer
 * 
 * <p>Java class for CompensationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompensationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compensationDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CardValidityType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompensationType", propOrder = {
    "compensationDetails"
})
public class CompensationType {

    @XmlElement(required = true)
    protected CardValidityType compensationDetails;

    /**
     * Gets the value of the compensationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CardValidityType }
     *     
     */
    public CardValidityType getCompensationDetails() {
        return compensationDetails;
    }

    /**
     * Sets the value of the compensationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardValidityType }
     *     
     */
    public void setCompensationDetails(CardValidityType value) {
        this.compensationDetails = value;
    }

}
