
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message.
 * 
 * <p>Java class for ApplicationErrorInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}ApplicationErrorDetailTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationTypeI", propOrder = {
    "errorDetails"
})
public class ApplicationErrorInformationTypeI {

    @XmlElement(required = true)
    protected ApplicationErrorDetailTypeI errorDetails;

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailTypeI }
     *     
     */
    public ApplicationErrorDetailTypeI getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailTypeI }
     *     
     */
    public void setErrorDetails(ApplicationErrorDetailTypeI value) {
        this.errorDetails = value;
    }

}
