
package com.amadeus.xml.tnlres_00_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the message type
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
 *         &lt;element name="errorDetail" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ApplicationErrorDetailTypeI"/&gt;
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
    "errorDetail"
})
public class ApplicationErrorInformationTypeI {

    @XmlElement(required = true)
    protected ApplicationErrorDetailTypeI errorDetail;

    /**
     * Gets the value of the errorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailTypeI }
     *     
     */
    public ApplicationErrorDetailTypeI getErrorDetail() {
        return errorDetail;
    }

    /**
     * Sets the value of the errorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailTypeI }
     *     
     */
    public void setErrorDetail(ApplicationErrorDetailTypeI value) {
        this.errorDetail = value;
    }

}
