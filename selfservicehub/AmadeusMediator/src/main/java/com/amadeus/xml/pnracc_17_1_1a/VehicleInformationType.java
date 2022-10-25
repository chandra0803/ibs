
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the vehicle information
 * 
 * <p>Java class for VehicleInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleCharacteristic" type="{http://xml.amadeus.com/PNRACC_17_1_1A}VehicleTypeOptionType"/&gt;
 *         &lt;element name="vehSpecialEquipment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityDetailsTypeI_198209C" maxOccurs="6" minOccurs="0"/&gt;
 *         &lt;element name="freeTextDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextDetailsType_198207C" minOccurs="0"/&gt;
 *         &lt;element name="carModel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To55" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleInformationType", propOrder = {
    "vehicleCharacteristic",
    "vehSpecialEquipment",
    "vehicleInfo",
    "freeTextDetails",
    "carModel"
})
public class VehicleInformationType {

    @XmlElement(required = true)
    protected VehicleTypeOptionType vehicleCharacteristic;
    protected List<String> vehSpecialEquipment;
    protected List<QuantityDetailsTypeI198209C> vehicleInfo;
    protected FreeTextDetailsType198207C freeTextDetails;
    protected String carModel;

    /**
     * Gets the value of the vehicleCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeOptionType }
     *     
     */
    public VehicleTypeOptionType getVehicleCharacteristic() {
        return vehicleCharacteristic;
    }

    /**
     * Sets the value of the vehicleCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeOptionType }
     *     
     */
    public void setVehicleCharacteristic(VehicleTypeOptionType value) {
        this.vehicleCharacteristic = value;
    }

    /**
     * Gets the value of the vehSpecialEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehSpecialEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehSpecialEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehSpecialEquipment() {
        if (vehSpecialEquipment == null) {
            vehSpecialEquipment = new ArrayList<String>();
        }
        return this.vehSpecialEquipment;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityDetailsTypeI198209C }
     * 
     * 
     */
    public List<QuantityDetailsTypeI198209C> getVehicleInfo() {
        if (vehicleInfo == null) {
            vehicleInfo = new ArrayList<QuantityDetailsTypeI198209C>();
        }
        return this.vehicleInfo;
    }

    /**
     * Gets the value of the freeTextDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextDetailsType198207C }
     *     
     */
    public FreeTextDetailsType198207C getFreeTextDetails() {
        return freeTextDetails;
    }

    /**
     * Sets the value of the freeTextDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextDetailsType198207C }
     *     
     */
    public void setFreeTextDetails(FreeTextDetailsType198207C value) {
        this.freeTextDetails = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

}
