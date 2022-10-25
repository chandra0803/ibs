
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number of units required
 * 
 * <p>Java class for NumberOfUnitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quantityDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitDetailsTypeI_35712C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitsType", propOrder = {
    "quantityDetails"
})
public class NumberOfUnitsType {

    @XmlElement(required = true)
    protected NumberOfUnitDetailsTypeI35712C quantityDetails;

    /**
     * Gets the value of the quantityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitDetailsTypeI35712C }
     *     
     */
    public NumberOfUnitDetailsTypeI35712C getQuantityDetails() {
        return quantityDetails;
    }

    /**
     * Sets the value of the quantityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitDetailsTypeI35712C }
     *     
     */
    public void setQuantityDetails(NumberOfUnitDetailsTypeI35712C value) {
        this.quantityDetails = value;
    }

}
