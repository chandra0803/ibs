
package com.amadeus.xml.ttstrq_15_1_1a;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayMode" type="{http://xml.amadeus.com/TTSTRQ_15_1_1A}CodedAttributeType"/&gt;
 *         &lt;element name="pnrLocatorData" type="{http://xml.amadeus.com/TTSTRQ_15_1_1A}ReservationControlInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="scrollingInformation" type="{http://xml.amadeus.com/TTSTRQ_15_1_1A}ActionDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="tstReference" type="{http://xml.amadeus.com/TTSTRQ_15_1_1A}ItemReferencesAndVersionsType" maxOccurs="1980" minOccurs="0"/&gt;
 *         &lt;element name="psaInformation" type="{http://xml.amadeus.com/TTSTRQ_15_1_1A}ReferenceInformationTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "displayMode",
    "pnrLocatorData",
    "scrollingInformation",
    "tstReference",
    "psaInformation"
})
@XmlRootElement(name = "Ticket_DisplayTST")
public class TicketDisplayTST {

    @XmlElement(required = true)
    protected CodedAttributeType displayMode;
    protected ReservationControlInformationTypeI pnrLocatorData;
    protected ActionDetailsTypeI scrollingInformation;
    protected List<ItemReferencesAndVersionsType> tstReference;
    protected ReferenceInformationTypeI psaInformation;

    /**
     * Gets the value of the displayMode property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getDisplayMode() {
        return displayMode;
    }

    /**
     * Sets the value of the displayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setDisplayMode(CodedAttributeType value) {
        this.displayMode = value;
    }

    /**
     * Gets the value of the pnrLocatorData property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getPnrLocatorData() {
        return pnrLocatorData;
    }

    /**
     * Sets the value of the pnrLocatorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setPnrLocatorData(ReservationControlInformationTypeI value) {
        this.pnrLocatorData = value;
    }

    /**
     * Gets the value of the scrollingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public ActionDetailsTypeI getScrollingInformation() {
        return scrollingInformation;
    }

    /**
     * Sets the value of the scrollingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public void setScrollingInformation(ActionDetailsTypeI value) {
        this.scrollingInformation = value;
    }

    /**
     * Gets the value of the tstReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tstReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTstReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemReferencesAndVersionsType }
     * 
     * 
     */
    public List<ItemReferencesAndVersionsType> getTstReference() {
        if (tstReference == null) {
            tstReference = new ArrayList<ItemReferencesAndVersionsType>();
        }
        return this.tstReference;
    }

    /**
     * Gets the value of the psaInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationTypeI }
     *     
     */
    public ReferenceInformationTypeI getPsaInformation() {
        return psaInformation;
    }

    /**
     * Sets the value of the psaInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationTypeI }
     *     
     */
    public void setPsaInformation(ReferenceInformationTypeI value) {
        this.psaInformation = value;
    }

}
