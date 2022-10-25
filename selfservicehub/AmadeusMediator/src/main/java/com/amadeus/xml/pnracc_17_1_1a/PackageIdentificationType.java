
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packageDesc" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To40"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageIdentificationType", propOrder = {
    "packageDesc"
})
public class PackageIdentificationType {

    @XmlElement(required = true)
    protected String packageDesc;

    /**
     * Gets the value of the packageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDesc() {
        return packageDesc;
    }

    /**
     * Sets the value of the packageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDesc(String value) {
        this.packageDesc = value;
    }

}
