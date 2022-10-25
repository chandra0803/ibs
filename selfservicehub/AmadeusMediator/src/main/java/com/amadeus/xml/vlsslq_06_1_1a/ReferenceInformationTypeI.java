
package com.amadeus.xml.vlsslq_06_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific reference identification for a traveller.
 * 
 * <p>Java class for ReferenceInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dutyCodeDetails" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}ReferencingDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformationTypeI", propOrder = {
    "dutyCodeDetails"
})
public class ReferenceInformationTypeI {

    @XmlElement(required = true)
    protected ReferencingDetailsTypeI dutyCodeDetails;

    /**
     * Gets the value of the dutyCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsTypeI }
     *     
     */
    public ReferencingDetailsTypeI getDutyCodeDetails() {
        return dutyCodeDetails;
    }

    /**
     * Sets the value of the dutyCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsTypeI }
     *     
     */
    public void setDutyCodeDetails(ReferencingDetailsTypeI value) {
        this.dutyCodeDetails = value;
    }

}
