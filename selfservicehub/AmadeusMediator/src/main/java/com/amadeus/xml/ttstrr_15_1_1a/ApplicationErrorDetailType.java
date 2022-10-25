
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationErrorDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationErrorCode" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To5"/&gt;
 *         &lt;element name="codeListQualifier" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="codeListResponsibleAgency" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorDetailType", propOrder = {
    "applicationErrorCode",
    "codeListQualifier",
    "codeListResponsibleAgency"
})
public class ApplicationErrorDetailType {

    @XmlElement(required = true)
    protected String applicationErrorCode;
    protected String codeListQualifier;
    protected String codeListResponsibleAgency;

    /**
     * Gets the value of the applicationErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationErrorCode() {
        return applicationErrorCode;
    }

    /**
     * Sets the value of the applicationErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationErrorCode(String value) {
        this.applicationErrorCode = value;
    }

    /**
     * Gets the value of the codeListQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListQualifier() {
        return codeListQualifier;
    }

    /**
     * Sets the value of the codeListQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListQualifier(String value) {
        this.codeListQualifier = value;
    }

    /**
     * Gets the value of the codeListResponsibleAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListResponsibleAgency() {
        return codeListResponsibleAgency;
    }

    /**
     * Sets the value of the codeListResponsibleAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListResponsibleAgency(String value) {
        this.codeListResponsibleAgency = value;
    }

}
