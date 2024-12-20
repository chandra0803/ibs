
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning excess baggage charges and the associated baggage details.
 * 
 * <p>Java class for ExcessBaggageTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bagTagDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}BagtagDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageTypeI", propOrder = {
    "bagTagDetails"
})
public class ExcessBaggageTypeI {

    @XmlElement(required = true)
    protected BagtagDetailsTypeI bagTagDetails;

    /**
     * Gets the value of the bagTagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BagtagDetailsTypeI }
     *     
     */
    public BagtagDetailsTypeI getBagTagDetails() {
        return bagTagDetails;
    }

    /**
     * Sets the value of the bagTagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagtagDetailsTypeI }
     *     
     */
    public void setBagTagDetails(BagtagDetailsTypeI value) {
        this.bagTagDetails = value;
    }

}
