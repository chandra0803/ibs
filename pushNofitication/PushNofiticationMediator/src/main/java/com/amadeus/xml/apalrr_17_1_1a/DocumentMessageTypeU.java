
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify documents and details directly related to it.
 * 
 * <p>Java class for DocumentMessageTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentMessageTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issueDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}DocumentMessageNameTypeU"/>
 *         &lt;element name="travelerDocumentDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}DocumentMessageDetailsTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentMessageTypeU", propOrder = {
    "issueDetails",
    "travelerDocumentDetails"
})
public class DocumentMessageTypeU {

    @XmlElement(required = true)
    protected DocumentMessageNameTypeU issueDetails;
    protected DocumentMessageDetailsTypeU travelerDocumentDetails;

    /**
     * Gets the value of the issueDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentMessageNameTypeU }
     *     
     */
    public DocumentMessageNameTypeU getIssueDetails() {
        return issueDetails;
    }

    /**
     * Sets the value of the issueDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMessageNameTypeU }
     *     
     */
    public void setIssueDetails(DocumentMessageNameTypeU value) {
        this.issueDetails = value;
    }

    /**
     * Gets the value of the travelerDocumentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentMessageDetailsTypeU }
     *     
     */
    public DocumentMessageDetailsTypeU getTravelerDocumentDetails() {
        return travelerDocumentDetails;
    }

    /**
     * Sets the value of the travelerDocumentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMessageDetailsTypeU }
     *     
     */
    public void setTravelerDocumentDetails(DocumentMessageDetailsTypeU value) {
        this.travelerDocumentDetails = value;
    }

}
