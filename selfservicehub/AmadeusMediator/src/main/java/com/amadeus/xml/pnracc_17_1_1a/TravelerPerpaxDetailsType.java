
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * used to identify if a mask is present and if dat is mandatory or not
 * 
 * <p>Java class for TravelerPerpaxDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerPerpaxDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="perpaxMask" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2"/&gt;
 *         &lt;element name="perpaxMaskIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerPerpaxDetailsType", propOrder = {
    "perpaxMask",
    "perpaxMaskIndicator"
})
public class TravelerPerpaxDetailsType {

    @XmlElement(required = true)
    protected String perpaxMask;
    @XmlElement(required = true)
    protected String perpaxMaskIndicator;

    /**
     * Gets the value of the perpaxMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerpaxMask() {
        return perpaxMask;
    }

    /**
     * Sets the value of the perpaxMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerpaxMask(String value) {
        this.perpaxMask = value;
    }

    /**
     * Gets the value of the perpaxMaskIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerpaxMaskIndicator() {
        return perpaxMaskIndicator;
    }

    /**
     * Sets the value of the perpaxMaskIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerpaxMaskIndicator(String value) {
        this.perpaxMaskIndicator = value;
    }

}
