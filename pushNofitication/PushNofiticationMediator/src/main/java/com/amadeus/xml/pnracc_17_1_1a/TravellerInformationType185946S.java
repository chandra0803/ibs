
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler and personal details relating to the traveler
 * 
 * <p>Java class for TravellerInformationType_185946S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationType_185946S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="traveller" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerSurnameInformationType_260693C" minOccurs="0"/>
 *         &lt;element name="passenger" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerDetailsType_260694C" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationType_185946S", propOrder = {
    "traveller",
    "passenger"
})
public class TravellerInformationType185946S {

    protected TravellerSurnameInformationType260693C traveller;
    protected List<TravellerDetailsType260694C> passenger;

    /**
     * Gets the value of the traveller property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationType260693C }
     *     
     */
    public TravellerSurnameInformationType260693C getTraveller() {
        return traveller;
    }

    /**
     * Sets the value of the traveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationType260693C }
     *     
     */
    public void setTraveller(TravellerSurnameInformationType260693C value) {
        this.traveller = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerDetailsType260694C }
     * 
     * 
     */
    public List<TravellerDetailsType260694C> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<TravellerDetailsType260694C>();
        }
        return this.passenger;
    }

}
