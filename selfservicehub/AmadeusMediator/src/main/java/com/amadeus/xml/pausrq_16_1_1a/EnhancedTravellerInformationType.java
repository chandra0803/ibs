
package com.amadeus.xml.pausrq_16_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify traveler and personal details relating to one traveler having rich name and/or multiple names
 * 
 * <p>Java class for EnhancedTravellerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnhancedTravellerInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="otherPaxNamesDetails" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}TravellerNameDetailsType" maxOccurs="5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhancedTravellerInformationType", propOrder = {
    "otherPaxNamesDetails"
})
public class EnhancedTravellerInformationType {

    @XmlElement(required = true)
    protected List<TravellerNameDetailsType> otherPaxNamesDetails;

    /**
     * Gets the value of the otherPaxNamesDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPaxNamesDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPaxNamesDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerNameDetailsType }
     * 
     * 
     */
    public List<TravellerNameDetailsType> getOtherPaxNamesDetails() {
        if (otherPaxNamesDetails == null) {
            otherPaxNamesDetails = new ArrayList<TravellerNameDetailsType>();
        }
        return this.otherPaxNamesDetails;
    }

}
