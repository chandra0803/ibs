
package com.amadeus.xml.pausrr_16_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the PNR segments/elements references and action to apply
 * 
 * <p>Java class for ElementManagementSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementManagementSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="elementReference" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ReferencingDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="segmentName" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="lineNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}NumericInteger_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementManagementSegmentType", propOrder = {
    "status",
    "elementReference",
    "segmentName",
    "lineNumber"
})
public class ElementManagementSegmentType {

    protected String status;
    protected ReferencingDetailsType elementReference;
    protected String segmentName;
    protected BigInteger lineNumber;

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
     * Gets the value of the elementReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsType }
     *     
     */
    public ReferencingDetailsType getElementReference() {
        return elementReference;
    }

    /**
     * Sets the value of the elementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsType }
     *     
     */
    public void setElementReference(ReferencingDetailsType value) {
        this.elementReference = value;
    }

    /**
     * Gets the value of the segmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * Sets the value of the segmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentName(String value) {
        this.segmentName = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

}
