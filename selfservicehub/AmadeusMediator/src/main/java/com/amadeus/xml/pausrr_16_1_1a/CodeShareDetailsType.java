
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeShareDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeShareDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeShareAgreement" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length3To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeShareDetailsType", propOrder = {
    "codeShareAgreement"
})
public class CodeShareDetailsType {

    @XmlElement(required = true)
    protected String codeShareAgreement;

    /**
     * Gets the value of the codeShareAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeShareAgreement() {
        return codeShareAgreement;
    }

    /**
     * Sets the value of the codeShareAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeShareAgreement(String value) {
        this.codeShareAgreement = value;
    }

}
