
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR commission element
 * 
 * <p>Java class for CommissionElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="commissionInfo" type="{http://xml.amadeus.com/PNRADD_17_1_1A}CommissionInformationType"/>
 *         &lt;element name="oldCommission" type="{http://xml.amadeus.com/PNRADD_17_1_1A}CommissionInformationType_6428C" minOccurs="0"/>
 *         &lt;element name="manualCapping" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericDecimal_Length1To10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionElementType", propOrder = {
    "passengerType",
    "indicator",
    "commissionInfo",
    "oldCommission",
    "manualCapping"
})
public class CommissionElementType {

    protected String passengerType;
    protected String indicator;
    @XmlElement(required = true)
    protected CommissionInformationType commissionInfo;
    protected CommissionInformationType6428C oldCommission;
    protected BigDecimal manualCapping;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the commissionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionInformationType }
     *     
     */
    public CommissionInformationType getCommissionInfo() {
        return commissionInfo;
    }

    /**
     * Sets the value of the commissionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionInformationType }
     *     
     */
    public void setCommissionInfo(CommissionInformationType value) {
        this.commissionInfo = value;
    }

    /**
     * Gets the value of the oldCommission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionInformationType6428C }
     *     
     */
    public CommissionInformationType6428C getOldCommission() {
        return oldCommission;
    }

    /**
     * Sets the value of the oldCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionInformationType6428C }
     *     
     */
    public void setOldCommission(CommissionInformationType6428C value) {
        this.oldCommission = value;
    }

    /**
     * Gets the value of the manualCapping property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getManualCapping() {
        return manualCapping;
    }

    /**
     * Sets the value of the manualCapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setManualCapping(BigDecimal value) {
        this.manualCapping = value;
    }

}
