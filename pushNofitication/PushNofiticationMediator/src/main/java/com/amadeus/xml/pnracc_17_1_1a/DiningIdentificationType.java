
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey the dining features
 * 
 * <p>Java class for DiningIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiningIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diningDescription" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To16"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiningIdentificationType", propOrder = {
    "diningDescription"
})
public class DiningIdentificationType {

    @XmlElement(required = true)
    protected String diningDescription;

    /**
     * Gets the value of the diningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiningDescription() {
        return diningDescription;
    }

    /**
     * Sets the value of the diningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiningDescription(String value) {
        this.diningDescription = value;
    }

}
