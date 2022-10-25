
package com.amadeus.xml.acsfrq_16_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legInfo" type="{http://xml.amadeus.com/ACSFRQ_16_1_1A}FlightDetailsResponseType"/>
 *         &lt;element name="allianceSelection" type="{http://xml.amadeus.com/ACSFRQ_16_1_1A}SelectionDetailsType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="codeshareCarrier" type="{http://xml.amadeus.com/ACSFRQ_16_1_1A}TransportIdentifierType" minOccurs="0"/>
 *         &lt;element name="listIndicator" type="{http://xml.amadeus.com/ACSFRQ_16_1_1A}StatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "legInfo",
    "allianceSelection",
    "codeshareCarrier",
    "listIndicator"
})
@XmlRootElement(name = "DCSLST_GetCheckInSummaryFigures")
public class DCSLSTGetCheckInSummaryFigures {

    @XmlElement(required = true)
    protected FlightDetailsResponseType legInfo;
    protected List<SelectionDetailsType> allianceSelection;
    protected TransportIdentifierType codeshareCarrier;
    protected StatusType listIndicator;

    /**
     * Gets the value of the legInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsResponseType }
     *     
     */
    public FlightDetailsResponseType getLegInfo() {
        return legInfo;
    }

    /**
     * Sets the value of the legInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsResponseType }
     *     
     */
    public void setLegInfo(FlightDetailsResponseType value) {
        this.legInfo = value;
    }

    /**
     * Gets the value of the allianceSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allianceSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllianceSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionDetailsType }
     * 
     * 
     */
    public List<SelectionDetailsType> getAllianceSelection() {
        if (allianceSelection == null) {
            allianceSelection = new ArrayList<SelectionDetailsType>();
        }
        return this.allianceSelection;
    }

    /**
     * Gets the value of the codeshareCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link TransportIdentifierType }
     *     
     */
    public TransportIdentifierType getCodeshareCarrier() {
        return codeshareCarrier;
    }

    /**
     * Sets the value of the codeshareCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportIdentifierType }
     *     
     */
    public void setCodeshareCarrier(TransportIdentifierType value) {
        this.codeshareCarrier = value;
    }

    /**
     * Gets the value of the listIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getListIndicator() {
        return listIndicator;
    }

    /**
     * Sets the value of the listIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setListIndicator(StatusType value) {
        this.listIndicator = value;
    }

}
