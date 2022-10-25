
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning a document.
 * 
 * <p>Java class for DocumentInformationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInformationDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}DocumentDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInformationDetailsTypeI", propOrder = {
    "documentDetails"
})
public class DocumentInformationDetailsTypeI {

    @XmlElement(required = true)
    protected DocumentDetailsTypeI documentDetails;

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetailsTypeI }
     *     
     */
    public DocumentDetailsTypeI getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetailsTypeI }
     *     
     */
    public void setDocumentDetails(DocumentDetailsTypeI value) {
        this.documentDetails = value;
    }

}
