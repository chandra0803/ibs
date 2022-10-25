
package com.amadeus.xml.apalrr_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the Baggage Loading Data
 * 
 * <p>Java class for BaggageLoadDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageLoadDataGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
 *         &lt;element name="deviceLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}DeviceInformationTypeI" minOccurs="0"/>
 *         &lt;element name="baggageLoadingIndicators" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="lastSeenLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}IdentificationDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageLoadDataGroupType", propOrder = {
    "dummy",
    "deviceLocation",
    "baggageLoadingIndicators",
    "lastSeenLocation"
})
public class BaggageLoadDataGroupType {

    @XmlElement(required = true)
    protected DummySegmentTypeI dummy;
    protected DeviceInformationTypeI deviceLocation;
    protected List<StatusType129946S> baggageLoadingIndicators;
    protected IdentificationDetailsType lastSeenLocation;

    /**
     * Gets the value of the dummy property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public DummySegmentTypeI getDummy() {
        return dummy;
    }

    /**
     * Sets the value of the dummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public void setDummy(DummySegmentTypeI value) {
        this.dummy = value;
    }

    /**
     * Gets the value of the deviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationTypeI }
     *     
     */
    public DeviceInformationTypeI getDeviceLocation() {
        return deviceLocation;
    }

    /**
     * Sets the value of the deviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationTypeI }
     *     
     */
    public void setDeviceLocation(DeviceInformationTypeI value) {
        this.deviceLocation = value;
    }

    /**
     * Gets the value of the baggageLoadingIndicators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageLoadingIndicators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageLoadingIndicators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType129946S }
     * 
     * 
     */
    public List<StatusType129946S> getBaggageLoadingIndicators() {
        if (baggageLoadingIndicators == null) {
            baggageLoadingIndicators = new ArrayList<StatusType129946S>();
        }
        return this.baggageLoadingIndicators;
    }

    /**
     * Gets the value of the lastSeenLocation property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationDetailsType }
     *     
     */
    public IdentificationDetailsType getLastSeenLocation() {
        return lastSeenLocation;
    }

    /**
     * Sets the value of the lastSeenLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationDetailsType }
     *     
     */
    public void setLastSeenLocation(IdentificationDetailsType value) {
        this.lastSeenLocation = value;
    }

}
