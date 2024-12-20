
package com.amadeus.xml.pnrret_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Printer identification
 * 
 * <p>Java class for PrinterIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrinterIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifierDetail" type="{http://xml.amadeus.com/PNRRET_17_1_1A}PrinterIdentificationDetailsType" minOccurs="0"/>
 *         &lt;element name="office" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaNumericString_Length9To9" minOccurs="0"/>
 *         &lt;element name="teletypeAddress" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaNumericString_Length7To7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrinterIdentificationType", propOrder = {
    "identifierDetail",
    "office",
    "teletypeAddress"
})
public class PrinterIdentificationType {

    protected PrinterIdentificationDetailsType identifierDetail;
    protected String office;
    protected String teletypeAddress;

    /**
     * Gets the value of the identifierDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrinterIdentificationDetailsType }
     *     
     */
    public PrinterIdentificationDetailsType getIdentifierDetail() {
        return identifierDetail;
    }

    /**
     * Sets the value of the identifierDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrinterIdentificationDetailsType }
     *     
     */
    public void setIdentifierDetail(PrinterIdentificationDetailsType value) {
        this.identifierDetail = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice(String value) {
        this.office = value;
    }

    /**
     * Gets the value of the teletypeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeletypeAddress() {
        return teletypeAddress;
    }

    /**
     * Sets the value of the teletypeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeletypeAddress(String value) {
        this.teletypeAddress = value;
    }

}
