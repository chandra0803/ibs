
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information related to a specific ticket.
 * 
 * <p>Java class for TicketNumberTypeI_79026S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketNumberTypeI_79026S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketNumberDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketNumberTypeI_79026S", propOrder = {
    "documentDetails"
})
public class TicketNumberTypeI79026S {

    @XmlElement(required = true)
    protected TicketNumberDetailsTypeI documentDetails;

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumberDetailsTypeI }
     *     
     */
    public TicketNumberDetailsTypeI getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumberDetailsTypeI }
     *     
     */
    public void setDocumentDetails(TicketNumberDetailsTypeI value) {
        this.documentDetails = value;
    }

}
