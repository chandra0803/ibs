
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys a potential error.
 * 
 * <p>Java class for ErrorGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorOrWarningCodeDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ApplicationErrorInformationType"/&gt;
 *         &lt;element name="errorWarningDescription" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FreeTextInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorGroupType", propOrder = {
    "errorOrWarningCodeDetails",
    "errorWarningDescription"
})
public class ErrorGroupType {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType errorOrWarningCodeDetails;
    protected FreeTextInformationType errorWarningDescription;

    /**
     * Gets the value of the errorOrWarningCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public ApplicationErrorInformationType getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /**
     * Sets the value of the errorOrWarningCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public void setErrorOrWarningCodeDetails(ApplicationErrorInformationType value) {
        this.errorOrWarningCodeDetails = value;
    }

    /**
     * Gets the value of the errorWarningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType }
     *     
     */
    public FreeTextInformationType getErrorWarningDescription() {
        return errorWarningDescription;
    }

    /**
     * Sets the value of the errorWarningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType }
     *     
     */
    public void setErrorWarningDescription(FreeTextInformationType value) {
        this.errorWarningDescription = value;
    }

}
