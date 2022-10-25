
package com.amadeus.xml.cfldrr_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey informations about functional and physical locations in a terminal
 * 
 * <p>Java class for TerminalLocationType_156410S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalLocationType_156410S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zoneDetails" type="{http://xml.amadeus.com/CFLDRR_15_1_1A}TerminalZoneInformationType" minOccurs="0"/>
 *         &lt;element name="facilityDetails" type="{http://xml.amadeus.com/CFLDRR_15_1_1A}FacilityInformationType_222926C" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalLocationType_156410S", propOrder = {
    "zoneDetails",
    "facilityDetails"
})
public class TerminalLocationType156410S {

    protected TerminalZoneInformationType zoneDetails;
    protected List<FacilityInformationType222926C> facilityDetails;

    /**
     * Gets the value of the zoneDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalZoneInformationType }
     *     
     */
    public TerminalZoneInformationType getZoneDetails() {
        return zoneDetails;
    }

    /**
     * Sets the value of the zoneDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalZoneInformationType }
     *     
     */
    public void setZoneDetails(TerminalZoneInformationType value) {
        this.zoneDetails = value;
    }

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
     * {@link FacilityInformationType222926C }
     * 
     * 
     */
    public List<FacilityInformationType222926C> getFacilityDetails() {
        if (facilityDetails == null) {
            facilityDetails = new ArrayList<FacilityInformationType222926C>();
        }
        return this.facilityDetails;
    }

}
