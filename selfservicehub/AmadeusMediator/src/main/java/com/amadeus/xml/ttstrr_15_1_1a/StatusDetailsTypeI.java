
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a status, the action to be taken, and an additional qualification of the status.
 * 
 * <p>Java class for StatusDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tstFlag" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDetailsTypeI", propOrder = {
    "tstFlag"
})
public class StatusDetailsTypeI {

    @XmlElement(required = true)
    protected String tstFlag;

    /**
     * Gets the value of the tstFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTstFlag() {
        return tstFlag;
    }

    /**
     * Sets the value of the tstFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTstFlag(String value) {
        this.tstFlag = value;
    }

}
