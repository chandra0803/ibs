
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning an airline flight.
 * 
 * <p>Java class for AdditionalProductDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mileageTimeDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MileageTimeDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsTypeI", propOrder = {
    "mileageTimeDetails"
})
public class AdditionalProductDetailsTypeI {

    @XmlElement(required = true)
    protected MileageTimeDetailsTypeI mileageTimeDetails;

    /**
     * Gets the value of the mileageTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public MileageTimeDetailsTypeI getMileageTimeDetails() {
        return mileageTimeDetails;
    }

    /**
     * Sets the value of the mileageTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public void setMileageTimeDetails(MileageTimeDetailsTypeI value) {
        this.mileageTimeDetails = value;
    }

}
