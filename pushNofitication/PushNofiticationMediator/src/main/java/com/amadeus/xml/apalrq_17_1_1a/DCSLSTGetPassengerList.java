
package com.amadeus.xml.apalrq_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="querryFollowUp" type="{http://xml.amadeus.com/APALRQ_17_1_1A}ActionDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="inflightServiceIndicator" type="{http://xml.amadeus.com/APALRQ_17_1_1A}StatusType" minOccurs="0"/>
 *         &lt;element name="flightInfo" type="{http://xml.amadeus.com/APALRQ_17_1_1A}FlightDetailsResponseType"/>
 *         &lt;element name="dataGroupIndicator" type="{http://xml.amadeus.com/APALRQ_17_1_1A}StatusType_156514S" minOccurs="0"/>
 *         &lt;element name="orFiltersQuery" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dummy" type="{http://xml.amadeus.com/APALRQ_17_1_1A}DummySegmentTypeI"/>
 *                   &lt;element name="andFiltersQuery" type="{http://xml.amadeus.com/APALRQ_17_1_1A}DisplayPassengerListRequest_andFiltersQuery" maxOccurs="7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "querryFollowUp",
    "inflightServiceIndicator",
    "flightInfo",
    "dataGroupIndicator",
    "orFiltersQuery"
})
@XmlRootElement(name = "DCSLST_GetPassengerList")
public class DCSLSTGetPassengerList {

    protected ActionDetailsTypeI querryFollowUp;
    protected StatusType inflightServiceIndicator;
    @XmlElement(required = true)
    protected FlightDetailsResponseType flightInfo;
    protected StatusType156514S dataGroupIndicator;
    protected List<DCSLSTGetPassengerList.OrFiltersQuery> orFiltersQuery;

    /**
     * Gets the value of the querryFollowUp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public ActionDetailsTypeI getQuerryFollowUp() {
        return querryFollowUp;
    }

    /**
     * Sets the value of the querryFollowUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public void setQuerryFollowUp(ActionDetailsTypeI value) {
        this.querryFollowUp = value;
    }

    /**
     * Gets the value of the inflightServiceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getInflightServiceIndicator() {
        return inflightServiceIndicator;
    }

    /**
     * Sets the value of the inflightServiceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setInflightServiceIndicator(StatusType value) {
        this.inflightServiceIndicator = value;
    }

    /**
     * Gets the value of the flightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsResponseType }
     *     
     */
    public FlightDetailsResponseType getFlightInfo() {
        return flightInfo;
    }

    /**
     * Sets the value of the flightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsResponseType }
     *     
     */
    public void setFlightInfo(FlightDetailsResponseType value) {
        this.flightInfo = value;
    }

    /**
     * Gets the value of the dataGroupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType156514S }
     *     
     */
    public StatusType156514S getDataGroupIndicator() {
        return dataGroupIndicator;
    }

    /**
     * Sets the value of the dataGroupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType156514S }
     *     
     */
    public void setDataGroupIndicator(StatusType156514S value) {
        this.dataGroupIndicator = value;
    }

    /**
     * Gets the value of the orFiltersQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orFiltersQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrFiltersQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DCSLSTGetPassengerList.OrFiltersQuery }
     * 
     * 
     */
    public List<DCSLSTGetPassengerList.OrFiltersQuery> getOrFiltersQuery() {
        if (orFiltersQuery == null) {
            orFiltersQuery = new ArrayList<DCSLSTGetPassengerList.OrFiltersQuery>();
        }
        return this.orFiltersQuery;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dummy" type="{http://xml.amadeus.com/APALRQ_17_1_1A}DummySegmentTypeI"/>
     *         &lt;element name="andFiltersQuery" type="{http://xml.amadeus.com/APALRQ_17_1_1A}DisplayPassengerListRequest_andFiltersQuery" maxOccurs="7"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dummy",
        "andFiltersQuery"
    })
    public static class OrFiltersQuery {

        @XmlElement(required = true)
        protected DummySegmentTypeI dummy;
        @XmlElement(required = true)
        protected List<DisplayPassengerListRequestAndFiltersQuery> andFiltersQuery;

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
         * Gets the value of the andFiltersQuery property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the andFiltersQuery property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAndFiltersQuery().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DisplayPassengerListRequestAndFiltersQuery }
         * 
         * 
         */
        public List<DisplayPassengerListRequestAndFiltersQuery> getAndFiltersQuery() {
            if (andFiltersQuery == null) {
                andFiltersQuery = new ArrayList<DisplayPassengerListRequestAndFiltersQuery>();
            }
            return this.andFiltersQuery;
        }

    }

}
