
package com.amadeus.xml.cfldrq_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey informations about functional and physical locations in a terminal
 * 
 * <p>Java class for TerminalLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facilityDetails" type="{http://xml.amadeus.com/CFLDRQ_15_1_1A}FacilityInformationType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalLocationType", propOrder = {
    "facilityDetails"
})
public class TerminalLocationType {

    protected List<FacilityInformationType> facilityDetails;

    /**
     * Gets the value of the facilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityInformationType }
     * 
     * 
     */
    public List<FacilityInformationType> getFacilityDetails() {
        if (facilityDetails == null) {
            facilityDetails = new ArrayList<FacilityInformationType>();
        }
        return this.facilityDetails;
    }

}
