
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number of units requires
 * 
 * <p>Java class for NumberOfUnitsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberDetail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitDetailsTypeI_2755C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitsTypeI", propOrder = {
    "numberDetail"
})
public class NumberOfUnitsTypeI {

    @XmlElement(required = true)
    protected NumberOfUnitDetailsTypeI2755C numberDetail;

    /**
     * Gets the value of the numberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitDetailsTypeI2755C }
     *     
     */
    public NumberOfUnitDetailsTypeI2755C getNumberDetail() {
        return numberDetail;
    }

    /**
     * Sets the value of the numberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitDetailsTypeI2755C }
     *     
     */
    public void setNumberDetail(NumberOfUnitDetailsTypeI2755C value) {
        this.numberDetail = value;
    }

}
