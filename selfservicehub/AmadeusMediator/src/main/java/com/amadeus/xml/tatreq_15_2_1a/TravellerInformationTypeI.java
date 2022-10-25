
package com.amadeus.xml.tatreq_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler(s) and personal details relating to the traveler(s).
 * 
 * <p>Java class for TravellerInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paxDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravellerSurnameInformationTypeI"/&gt;
 *         &lt;element name="otherPaxDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TravellerDetailsTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationTypeI", propOrder = {
    "paxDetails",
    "otherPaxDetails"
})
public class TravellerInformationTypeI {

    @XmlElement(required = true)
    protected TravellerSurnameInformationTypeI paxDetails;
    protected List<TravellerDetailsTypeI> otherPaxDetails;

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationTypeI }
     *     
     */
    public TravellerSurnameInformationTypeI getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationTypeI }
     *     
     */
    public void setPaxDetails(TravellerSurnameInformationTypeI value) {
        this.paxDetails = value;
    }

    /**
     * Gets the value of the otherPaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerDetailsTypeI }
     * 
     * 
     */
    public List<TravellerDetailsTypeI> getOtherPaxDetails() {
        if (otherPaxDetails == null) {
            otherPaxDetails = new ArrayList<TravellerDetailsTypeI>();
        }
        return this.otherPaxDetails;
    }

}
