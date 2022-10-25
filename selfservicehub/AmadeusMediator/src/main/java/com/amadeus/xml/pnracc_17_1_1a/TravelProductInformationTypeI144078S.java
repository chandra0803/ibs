
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationTypeI_144078S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI_144078S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LocationTypeI_208252C" minOccurs="0"/&gt;
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LocationTypeI_208252C" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI_144078S", propOrder = {
    "boardPointDetails",
    "offpointDetails"
})
public class TravelProductInformationTypeI144078S {

    protected LocationTypeI208252C boardPointDetails;
    protected LocationTypeI208252C offpointDetails;

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI208252C }
     *     
     */
    public LocationTypeI208252C getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI208252C }
     *     
     */
    public void setBoardPointDetails(LocationTypeI208252C value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI208252C }
     *     
     */
    public LocationTypeI208252C getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI208252C }
     *     
     */
    public void setOffpointDetails(LocationTypeI208252C value) {
        this.offpointDetails = value;
    }

}
