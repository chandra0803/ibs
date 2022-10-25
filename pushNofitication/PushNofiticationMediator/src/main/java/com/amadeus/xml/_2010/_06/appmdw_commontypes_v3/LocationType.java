
package com.amadeus.xml._2010._06.appmdw_commontypes_v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location of a device
 * 
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Airport">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}AirportLocationGroup"/>
 *                           &lt;attribute ref="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}BuildingCode"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="City">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}LocationGroup"/>
 *                           &lt;attribute ref="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}BuildingCode"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LocationCategory" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}CategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "location",
    "locationCategory"
})
public class LocationType {

    @XmlElement(name = "Location", required = true)
    protected LocationType.Location location;
    @XmlElement(name = "LocationCategory")
    protected CategoryType locationCategory;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType.Location }
     *     
     */
    public LocationType.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType.Location }
     *     
     */
    public void setLocation(LocationType.Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType getLocationCategory() {
        return locationCategory;
    }

    /**
     * Sets the value of the locationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public void setLocationCategory(CategoryType value) {
        this.locationCategory = value;
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
     *       &lt;choice>
     *         &lt;element name="Airport">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}AirportLocationGroup"/>
     *                 &lt;attribute ref="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}BuildingCode"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="City">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}LocationGroup"/>
     *                 &lt;attribute ref="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}BuildingCode"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airport",
        "city"
    })
    public static class Location {

        @XmlElement(name = "Airport")
        protected LocationType.Location.Airport airport;
        @XmlElement(name = "City")
        protected LocationType.Location.City city;

        /**
         * Gets the value of the airport property.
         * 
         * @return
         *     possible object is
         *     {@link LocationType.Location.Airport }
         *     
         */
        public LocationType.Location.Airport getAirport() {
            return airport;
        }

        /**
         * Sets the value of the airport property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType.Location.Airport }
         *     
         */
        public void setAirport(LocationType.Location.Airport value) {
            this.airport = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link LocationType.Location.City }
         *     
         */
        public LocationType.Location.City getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType.Location.City }
         *     
         */
        public void setCity(LocationType.Location.City value) {
            this.city = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}AirportLocationGroup"/>
         *       &lt;attribute ref="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}BuildingCode"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Airport {

            @XmlAttribute(name = "BuildingCode", namespace = "http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3")
            protected String buildingCode;
            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "Terminal")
            protected String terminal;
            @XmlAttribute(name = "Gate")
            protected String gate;

            /**
             * Code used to identify a building
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBuildingCode() {
                return buildingCode;
            }

            /**
             * Sets the value of the buildingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBuildingCode(String value) {
                this.buildingCode = value;
            }

            /**
             * Gets the value of the locationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * Sets the value of the locationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

            /**
             * Gets the value of the terminal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminal() {
                return terminal;
            }

            /**
             * Sets the value of the terminal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminal(String value) {
                this.terminal = value;
            }

            /**
             * Gets the value of the gate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGate() {
                return gate;
            }

            /**
             * Sets the value of the gate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGate(String value) {
                this.gate = value;
            }

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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}LocationGroup"/>
         *       &lt;attribute ref="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}BuildingCode"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class City {

            @XmlAttribute(name = "BuildingCode", namespace = "http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3")
            protected String buildingCode;
            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Code used to identify a building
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBuildingCode() {
                return buildingCode;
            }

            /**
             * Sets the value of the buildingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBuildingCode(String value) {
                this.buildingCode = value;
            }

            /**
             * Gets the value of the locationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * Sets the value of the locationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

        }

    }

}
