
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning a document.
 * 
 * <p>Java class for DocumentInformationDetailsTypeI_207581S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInformationDetailsTypeI_207581S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DocumentDetailsTypeI_19732C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInformationDetailsTypeI_207581S", propOrder = {
    "documentDetails"
})
public class DocumentInformationDetailsTypeI207581S {

    @XmlElement(required = true)
    protected DocumentDetailsTypeI19732C documentDetails;

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetailsTypeI19732C }
     *     
     */
    public DocumentDetailsTypeI19732C getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetailsTypeI19732C }
     *     
     */
    public void setDocumentDetails(DocumentDetailsTypeI19732C value) {
        this.documentDetails = value;
    }

}
