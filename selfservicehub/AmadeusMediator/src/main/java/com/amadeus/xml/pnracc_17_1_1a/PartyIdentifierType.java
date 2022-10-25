
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a party identification. To specify a party identification. To specify a party identification. To specify a party identification
 * 
 * <p>Java class for PartyIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyCodeQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AMA_EDICodesetType_Length1to3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentifierType", propOrder = {
    "partyCodeQualifier"
})
public class PartyIdentifierType {

    @XmlElement(required = true)
    protected String partyCodeQualifier;

    /**
     * Gets the value of the partyCodeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyCodeQualifier() {
        return partyCodeQualifier;
    }

    /**
     * Sets the value of the partyCodeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyCodeQualifier(String value) {
        this.partyCodeQualifier = value;
    }

}
