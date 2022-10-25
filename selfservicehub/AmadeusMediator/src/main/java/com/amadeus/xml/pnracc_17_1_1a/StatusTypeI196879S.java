
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a status and related information.
 * 
 * <p>Java class for StatusTypeI_196879S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTypeI_196879S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusDetailsTypeI_148341C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTypeI_196879S", propOrder = {
    "statusDetails"
})
public class StatusTypeI196879S {

    @XmlElement(required = true)
    protected StatusDetailsTypeI148341C statusDetails;

    /**
     * Gets the value of the statusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsTypeI148341C }
     *     
     */
    public StatusDetailsTypeI148341C getStatusDetails() {
        return statusDetails;
    }

    /**
     * Sets the value of the statusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsTypeI148341C }
     *     
     */
    public void setStatusDetails(StatusDetailsTypeI148341C value) {
        this.statusDetails = value;
    }

}
