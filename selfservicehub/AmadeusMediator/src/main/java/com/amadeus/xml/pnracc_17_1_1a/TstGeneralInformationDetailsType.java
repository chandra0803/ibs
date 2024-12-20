
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TstGeneralInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TstGeneralInformationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tstReferenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="tstCreationDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length6To6"/&gt;
 *         &lt;element name="salesIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TstGeneralInformationDetailsType", propOrder = {
    "tstReferenceNumber",
    "tstCreationDate",
    "salesIndicator"
})
public class TstGeneralInformationDetailsType {

    @XmlElement(required = true)
    protected String tstReferenceNumber;
    @XmlElement(required = true)
    protected String tstCreationDate;
    protected String salesIndicator;

    /**
     * Gets the value of the tstReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTstReferenceNumber() {
        return tstReferenceNumber;
    }

    /**
     * Sets the value of the tstReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTstReferenceNumber(String value) {
        this.tstReferenceNumber = value;
    }

    /**
     * Gets the value of the tstCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTstCreationDate() {
        return tstCreationDate;
    }

    /**
     * Sets the value of the tstCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTstCreationDate(String value) {
        this.tstCreationDate = value;
    }

    /**
     * Gets the value of the salesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesIndicator() {
        return salesIndicator;
    }

    /**
     * Sets the value of the salesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesIndicator(String value) {
        this.salesIndicator = value;
    }

}
