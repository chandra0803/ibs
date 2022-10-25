
package com.amadeus.xml.vlsslr_06_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey a process ID
 * 
 * <p>Java class for BusinessProcessIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessProcessIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processIdentifier" type="{http://xml.amadeus.com/VLSSLR_06_1_1A}AlphaNumericString_Length1To10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessProcessIdType", propOrder = {
    "processIdentifier"
})
public class BusinessProcessIdType {

    @XmlElement(required = true)
    protected String processIdentifier;

    /**
     * Gets the value of the processIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIdentifier() {
        return processIdentifier;
    }

    /**
     * Sets the value of the processIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIdentifier(String value) {
        this.processIdentifier = value;
    }

}
