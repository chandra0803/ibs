
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about a commission.
 * 
 * <p>Java class for CommissionInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CommissionDetailsTypeI"/>
 *         &lt;element name="otherComDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CommissionDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionInformationTypeI", propOrder = {
    "commissionDetails",
    "otherComDetails"
})
public class CommissionInformationTypeI {

    @XmlElement(required = true)
    protected CommissionDetailsTypeI commissionDetails;
    protected CommissionDetailsTypeI otherComDetails;

    /**
     * Gets the value of the commissionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionDetailsTypeI }
     *     
     */
    public CommissionDetailsTypeI getCommissionDetails() {
        return commissionDetails;
    }

    /**
     * Sets the value of the commissionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDetailsTypeI }
     *     
     */
    public void setCommissionDetails(CommissionDetailsTypeI value) {
        this.commissionDetails = value;
    }

    /**
     * Gets the value of the otherComDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionDetailsTypeI }
     *     
     */
    public CommissionDetailsTypeI getOtherComDetails() {
        return otherComDetails;
    }

    /**
     * Sets the value of the otherComDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDetailsTypeI }
     *     
     */
    public void setOtherComDetails(CommissionDetailsTypeI value) {
        this.otherComDetails = value;
    }

}
