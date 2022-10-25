
package com.amadeus.xml.vlsslq_06_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to specify details on an application
 * 
 * <p>Java class for ApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationDetails" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}ApplicationIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationType", propOrder = {
    "applicationDetails"
})
public class ApplicationType {

    @XmlElement(required = true)
    protected ApplicationIdentificationType applicationDetails;

    /**
     * Gets the value of the applicationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationIdentificationType }
     *     
     */
    public ApplicationIdentificationType getApplicationDetails() {
        return applicationDetails;
    }

    /**
     * Sets the value of the applicationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationIdentificationType }
     *     
     */
    public void setApplicationDetails(ApplicationIdentificationType value) {
        this.applicationDetails = value;
    }

}
