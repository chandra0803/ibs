
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey informations related to the form of payment specific to reporting
 * 
 * <p>Java class for FormOfPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopMapTable" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopBillingCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fopEdiCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopReportingCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopPrintedCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *         &lt;element name="fopElecTicketingCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentInformationType", propOrder = {
    "fopCode",
    "fopMapTable",
    "fopBillingCode",
    "fopStatus",
    "fopEdiCode",
    "fopReportingCode",
    "fopPrintedCode",
    "fopElecTicketingCode"
})
public class FormOfPaymentInformationType {

    protected String fopCode;
    protected String fopMapTable;
    protected String fopBillingCode;
    protected String fopStatus;
    protected String fopEdiCode;
    protected String fopReportingCode;
    protected String fopPrintedCode;
    protected String fopElecTicketingCode;

    /**
     * Gets the value of the fopCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopCode() {
        return fopCode;
    }

    /**
     * Sets the value of the fopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopCode(String value) {
        this.fopCode = value;
    }

    /**
     * Gets the value of the fopMapTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopMapTable() {
        return fopMapTable;
    }

    /**
     * Sets the value of the fopMapTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopMapTable(String value) {
        this.fopMapTable = value;
    }

    /**
     * Gets the value of the fopBillingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopBillingCode() {
        return fopBillingCode;
    }

    /**
     * Sets the value of the fopBillingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopBillingCode(String value) {
        this.fopBillingCode = value;
    }

    /**
     * Gets the value of the fopStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopStatus() {
        return fopStatus;
    }

    /**
     * Sets the value of the fopStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopStatus(String value) {
        this.fopStatus = value;
    }

    /**
     * Gets the value of the fopEdiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopEdiCode() {
        return fopEdiCode;
    }

    /**
     * Sets the value of the fopEdiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopEdiCode(String value) {
        this.fopEdiCode = value;
    }

    /**
     * Gets the value of the fopReportingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopReportingCode() {
        return fopReportingCode;
    }

    /**
     * Sets the value of the fopReportingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopReportingCode(String value) {
        this.fopReportingCode = value;
    }

    /**
     * Gets the value of the fopPrintedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopPrintedCode() {
        return fopPrintedCode;
    }

    /**
     * Sets the value of the fopPrintedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopPrintedCode(String value) {
        this.fopPrintedCode = value;
    }

    /**
     * Gets the value of the fopElecTicketingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopElecTicketingCode() {
        return fopElecTicketingCode;
    }

    /**
     * Sets the value of the fopElecTicketingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopElecTicketingCode(String value) {
        this.fopElecTicketingCode = value;
    }

}
