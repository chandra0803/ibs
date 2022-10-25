
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DOC INFO
 * 
 * <p>Java class for TravellerDocumentInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerDocumentInformationTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DocumentInformationTypeU"/&gt;
 *         &lt;element name="datesOfValidity" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ValidityDatesTypeU" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerDocumentInformationTypeU", propOrder = {
    "documentInformation",
    "datesOfValidity"
})
public class TravellerDocumentInformationTypeU {

    @XmlElement(required = true)
    protected DocumentInformationTypeU documentInformation;
    protected ValidityDatesTypeU datesOfValidity;

    /**
     * Gets the value of the documentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInformationTypeU }
     *     
     */
    public DocumentInformationTypeU getDocumentInformation() {
        return documentInformation;
    }

    /**
     * Sets the value of the documentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInformationTypeU }
     *     
     */
    public void setDocumentInformation(DocumentInformationTypeU value) {
        this.documentInformation = value;
    }

    /**
     * Gets the value of the datesOfValidity property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityDatesTypeU }
     *     
     */
    public ValidityDatesTypeU getDatesOfValidity() {
        return datesOfValidity;
    }

    /**
     * Sets the value of the datesOfValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityDatesTypeU }
     *     
     */
    public void setDatesOfValidity(ValidityDatesTypeU value) {
        this.datesOfValidity = value;
    }

}
