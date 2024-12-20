
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify point of sale information by party identification or location identification.
 * 
 * <p>Java class for PointOfSaleInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfSaleInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointOfSale" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PartyIdentifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfSaleInformationType", propOrder = {
    "pointOfSale"
})
public class PointOfSaleInformationType {

    @XmlElement(required = true)
    protected PartyIdentifierType pointOfSale;

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifierType }
     *     
     */
    public PartyIdentifierType getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifierType }
     *     
     */
    public void setPointOfSale(PartyIdentifierType value) {
        this.pointOfSale = value;
    }

}
