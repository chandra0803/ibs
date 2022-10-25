
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message.
 * 
 * <p>Java class for ApplicationErrorInformationType_6594S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationType_6594S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationErrorDetail" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ApplicationErrorDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationType_6594S", propOrder = {
    "applicationErrorDetail"
})
public class ApplicationErrorInformationType6594S {

    @XmlElement(required = true)
    protected ApplicationErrorDetailType applicationErrorDetail;

    /**
     * Gets the value of the applicationErrorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailType }
     *     
     */
    public ApplicationErrorDetailType getApplicationErrorDetail() {
        return applicationErrorDetail;
    }

    /**
     * Sets the value of the applicationErrorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailType }
     *     
     */
    public void setApplicationErrorDetail(ApplicationErrorDetailType value) {
        this.applicationErrorDetail = value;
    }

}
