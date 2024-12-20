
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * contains vehicle information
 * 
 * <p>Java class for VehicleTypeOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleTypeOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleTypeOwner" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="vehicleRentalPrefType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleTypeOptionType", propOrder = {
    "vehicleTypeOwner",
    "vehicleRentalPrefType"
})
public class VehicleTypeOptionType {

    @XmlElement(required = true)
    protected String vehicleTypeOwner;
    @XmlElement(required = true)
    protected List<String> vehicleRentalPrefType;

    /**
     * Gets the value of the vehicleTypeOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeOwner() {
        return vehicleTypeOwner;
    }

    /**
     * Sets the value of the vehicleTypeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeOwner(String value) {
        this.vehicleTypeOwner = value;
    }

    /**
     * Gets the value of the vehicleRentalPrefType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRentalPrefType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRentalPrefType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehicleRentalPrefType() {
        if (vehicleRentalPrefType == null) {
            vehicleRentalPrefType = new ArrayList<String>();
        }
        return this.vehicleRentalPrefType;
    }

}
