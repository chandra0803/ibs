
package com.amadeus.xml.apalrq_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayPassengerListRequest_andFiltersQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayPassengerListRequest_andFiltersQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerListFilterName" type="{http://xml.amadeus.com/APALRQ_17_1_1A}CodedAttributeType"/>
 *         &lt;element name="filterIndicator" type="{http://xml.amadeus.com/APALRQ_17_1_1A}StatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayPassengerListRequest_andFiltersQuery", propOrder = {
    "passengerListFilterName",
    "filterIndicator"
})
public class DisplayPassengerListRequestAndFiltersQuery {

    @XmlElement(required = true)
    protected CodedAttributeType passengerListFilterName;
    protected StatusType filterIndicator;

    /**
     * Gets the value of the passengerListFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getPassengerListFilterName() {
        return passengerListFilterName;
    }

    /**
     * Sets the value of the passengerListFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setPassengerListFilterName(CodedAttributeType value) {
        this.passengerListFilterName = value;
    }

    /**
     * Gets the value of the filterIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getFilterIndicator() {
        return filterIndicator;
    }

    /**
     * Sets the value of the filterIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setFilterIndicator(StatusType value) {
        this.filterIndicator = value;
    }

}
