
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR Original Issue/Issue in Exchange For element
 * 
 * <p>Java class for OriginalIssueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalIssueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="voucherIndicator" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="issue" type="{http://xml.amadeus.com/PNRADD_17_1_1A}IssueInformationType" maxOccurs="3"/>
 *         &lt;element name="baseFare" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericDecimal_Length1To10" minOccurs="0"/>
 *         &lt;element name="totalTax" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericDecimal_Length1To10" minOccurs="0"/>
 *         &lt;element name="penalty" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericDecimal_Length1To10" minOccurs="0"/>
 *         &lt;element name="freeflow" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To126" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalIssueType", propOrder = {
    "passengerType",
    "voucherIndicator",
    "issue",
    "baseFare",
    "totalTax",
    "penalty",
    "freeflow"
})
public class OriginalIssueType {

    protected String passengerType;
    protected String voucherIndicator;
    @XmlElement(required = true)
    protected List<IssueInformationType> issue;
    protected BigDecimal baseFare;
    protected BigDecimal totalTax;
    protected BigDecimal penalty;
    protected String freeflow;

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
     * Gets the value of the voucherIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherIndicator() {
        return voucherIndicator;
    }

    /**
     * Sets the value of the voucherIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherIndicator(String value) {
        this.voucherIndicator = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueInformationType }
     * 
     * 
     */
    public List<IssueInformationType> getIssue() {
        if (issue == null) {
            issue = new ArrayList<IssueInformationType>();
        }
        return this.issue;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseFare(BigDecimal value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalty(BigDecimal value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the freeflow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeflow() {
        return freeflow;
    }

    /**
     * Sets the value of the freeflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeflow(String value) {
        this.freeflow = value;
    }

}
