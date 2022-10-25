
package com.amadeus.xml.tnlres_00_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify travelers and personal details relating to the travelers
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
 *         &lt;element name="traveller" type="{http://xml.amadeus.com/TNLRES_00_1_1A}TravellerSurnameInformationTypeI"/&gt;
 *         &lt;element name="passenger" type="{http://xml.amadeus.com/TNLRES_00_1_1A}TravellerDetailsTypeI" maxOccurs="9" minOccurs="0"/&gt;
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
    "traveller",
    "passenger"
})
public class TravellerInformationTypeI {

    @XmlElement(required = true)
    protected TravellerSurnameInformationTypeI traveller;
    protected List<TravellerDetailsTypeI> passenger;

    /**
     * Gets the value of the traveller property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationTypeI }
     *     
     */
    public TravellerSurnameInformationTypeI getTraveller() {
        return traveller;
    }

    /**
     * Sets the value of the traveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationTypeI }
     *     
     */
    public void setTraveller(TravellerSurnameInformationTypeI value) {
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
     * {@link TravellerDetailsTypeI }
     * 
     * 
     */
    public List<TravellerDetailsTypeI> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<TravellerDetailsTypeI>();
        }
        return this.passenger;
    }

}
