
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Discount information
 * 
 * <p>Java class for DiscountInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentReason" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To6" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length2To2" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="staffNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To7" minOccurs="0"/&gt;
 *         &lt;element name="staffName" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaString_Length1To30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountInformationType", propOrder = {
    "adjustmentReason",
    "percentage",
    "status",
    "staffNumber",
    "staffName"
})
public class DiscountInformationType {

    protected String adjustmentReason;
    protected BigInteger percentage;
    protected String status;
    protected String staffNumber;
    protected String staffName;

    /**
     * Gets the value of the adjustmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentReason() {
        return adjustmentReason;
    }

    /**
     * Sets the value of the adjustmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentReason(String value) {
        this.adjustmentReason = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentage(BigInteger value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the staffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffNumber() {
        return staffNumber;
    }

    /**
     * Sets the value of the staffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffNumber(String value) {
        this.staffNumber = value;
    }

    /**
     * Gets the value of the staffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * Sets the value of the staffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffName(String value) {
        this.staffName = value;
    }

}
