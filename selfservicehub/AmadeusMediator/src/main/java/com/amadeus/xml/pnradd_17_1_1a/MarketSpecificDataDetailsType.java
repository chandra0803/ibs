
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Form of payment details
 * 
 * <p>Java class for MarketSpecificDataDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketSpecificDataDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cvData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/&gt;
 *         &lt;element name="printedFreeflow" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/&gt;
 *         &lt;element name="reportedFreeflow" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/&gt;
 *         &lt;element name="onoData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To15" minOccurs="0"/&gt;
 *         &lt;element name="gwtData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To15" minOccurs="0"/&gt;
 *         &lt;element name="chdData" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To40" minOccurs="0"/&gt;
 *         &lt;element name="delegationCode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="mcoDocNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To13" minOccurs="0"/&gt;
 *         &lt;element name="mcoCouponNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="mcoIataNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To9" minOccurs="0"/&gt;
 *         &lt;element name="mcoPlaceOfIssue" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="mcoDateOfIssue" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length7To7" minOccurs="0"/&gt;
 *         &lt;element name="iataNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketSpecificDataDetailsType", propOrder = {
    "cvData",
    "printedFreeflow",
    "reportedFreeflow",
    "onoData",
    "gwtData",
    "chdData",
    "delegationCode",
    "mcoDocNumber",
    "mcoCouponNumber",
    "mcoIataNumber",
    "mcoPlaceOfIssue",
    "mcoDateOfIssue",
    "iataNumber"
})
public class MarketSpecificDataDetailsType {

    protected String cvData;
    protected String printedFreeflow;
    protected String reportedFreeflow;
    protected String onoData;
    protected String gwtData;
    protected String chdData;
    protected String delegationCode;
    protected String mcoDocNumber;
    protected String mcoCouponNumber;
    protected BigInteger mcoIataNumber;
    protected String mcoPlaceOfIssue;
    protected String mcoDateOfIssue;
    protected BigInteger iataNumber;

    /**
     * Gets the value of the cvData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvData() {
        return cvData;
    }

    /**
     * Sets the value of the cvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvData(String value) {
        this.cvData = value;
    }

    /**
     * Gets the value of the printedFreeflow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintedFreeflow() {
        return printedFreeflow;
    }

    /**
     * Sets the value of the printedFreeflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintedFreeflow(String value) {
        this.printedFreeflow = value;
    }

    /**
     * Gets the value of the reportedFreeflow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportedFreeflow() {
        return reportedFreeflow;
    }

    /**
     * Sets the value of the reportedFreeflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportedFreeflow(String value) {
        this.reportedFreeflow = value;
    }

    /**
     * Gets the value of the onoData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnoData() {
        return onoData;
    }

    /**
     * Sets the value of the onoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnoData(String value) {
        this.onoData = value;
    }

    /**
     * Gets the value of the gwtData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGwtData() {
        return gwtData;
    }

    /**
     * Sets the value of the gwtData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGwtData(String value) {
        this.gwtData = value;
    }

    /**
     * Gets the value of the chdData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChdData() {
        return chdData;
    }

    /**
     * Sets the value of the chdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChdData(String value) {
        this.chdData = value;
    }

    /**
     * Gets the value of the delegationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationCode() {
        return delegationCode;
    }

    /**
     * Sets the value of the delegationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationCode(String value) {
        this.delegationCode = value;
    }

    /**
     * Gets the value of the mcoDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcoDocNumber() {
        return mcoDocNumber;
    }

    /**
     * Sets the value of the mcoDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcoDocNumber(String value) {
        this.mcoDocNumber = value;
    }

    /**
     * Gets the value of the mcoCouponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcoCouponNumber() {
        return mcoCouponNumber;
    }

    /**
     * Sets the value of the mcoCouponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcoCouponNumber(String value) {
        this.mcoCouponNumber = value;
    }

    /**
     * Gets the value of the mcoIataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMcoIataNumber() {
        return mcoIataNumber;
    }

    /**
     * Sets the value of the mcoIataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMcoIataNumber(BigInteger value) {
        this.mcoIataNumber = value;
    }

    /**
     * Gets the value of the mcoPlaceOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcoPlaceOfIssue() {
        return mcoPlaceOfIssue;
    }

    /**
     * Sets the value of the mcoPlaceOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcoPlaceOfIssue(String value) {
        this.mcoPlaceOfIssue = value;
    }

    /**
     * Gets the value of the mcoDateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcoDateOfIssue() {
        return mcoDateOfIssue;
    }

    /**
     * Sets the value of the mcoDateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcoDateOfIssue(String value) {
        this.mcoDateOfIssue = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIataNumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIataNumber(BigInteger value) {
        this.iataNumber = value;
    }

}
