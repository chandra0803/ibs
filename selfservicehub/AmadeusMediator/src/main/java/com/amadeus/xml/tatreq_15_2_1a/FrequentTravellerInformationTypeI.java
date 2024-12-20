
package com.amadeus.xml.tatreq_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information.
 * 
 * <p>Java class for FrequentTravellerInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frequentTravellerDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FrequentTravellerIdentificationTypeI" maxOccurs="9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerInformationTypeI", propOrder = {
    "frequentTravellerDetails"
})
public class FrequentTravellerInformationTypeI {

    @XmlElement(required = true)
    protected List<FrequentTravellerIdentificationTypeI> frequentTravellerDetails;

    /**
     * Gets the value of the frequentTravellerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequentTravellerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequentTravellerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentTravellerIdentificationTypeI }
     * 
     * 
     */
    public List<FrequentTravellerIdentificationTypeI> getFrequentTravellerDetails() {
        if (frequentTravellerDetails == null) {
            frequentTravellerDetails = new ArrayList<FrequentTravellerIdentificationTypeI>();
        }
        return this.frequentTravellerDetails;
    }

}
