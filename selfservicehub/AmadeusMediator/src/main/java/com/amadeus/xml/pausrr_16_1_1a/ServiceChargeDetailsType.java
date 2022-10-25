
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details related to the service charge
 * 
 * <p>Java class for ServiceChargeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceChargeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mdType" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceChargeDetailsType", propOrder = {
    "mdType"
})
public class ServiceChargeDetailsType {

    protected String mdType;

    /**
     * Gets the value of the mdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdType() {
        return mdType;
    }

    /**
     * Sets the value of the mdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdType(String value) {
        this.mdType = value;
    }

}
