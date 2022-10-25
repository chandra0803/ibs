
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to convey quota information.
 * 
 * <p>Java class for QuotaRelatedInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaRelatedInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quotaReachedReplyStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaRelatedInformationType", propOrder = {
    "quotaReachedReplyStatus"
})
public class QuotaRelatedInformationType {

    protected String quotaReachedReplyStatus;

    /**
     * Gets the value of the quotaReachedReplyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaReachedReplyStatus() {
        return quotaReachedReplyStatus;
    }

    /**
     * Sets the value of the quotaReachedReplyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaReachedReplyStatus(String value) {
        this.quotaReachedReplyStatus = value;
    }

}
