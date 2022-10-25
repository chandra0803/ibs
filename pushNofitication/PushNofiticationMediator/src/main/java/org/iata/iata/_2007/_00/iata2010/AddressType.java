
package org.iata.iata._2007._00.iata2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides address information
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetNmbr" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="POBox" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to16" />
 *                 &lt;attribute name="StreetNmbrSuffix" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to8" />
 *                 &lt;attribute name="StreetDirection" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to8" />
 *                 &lt;attribute name="RuralRouteNmbr" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}NumericStringLength1to5" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BldgRoom" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength0to64" minOccurs="0"/>
 *         &lt;element name="AddressLine" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to255" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to64" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to16" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to32" minOccurs="0"/>
 *         &lt;element name="StateProv" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StateProvType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}CountryNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2007/00/IATA2010.1}DefaultIndGroup"/>
 *       &lt;attribute name="FormattedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="UseType" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}IATA_CodeType" />
 *       &lt;attribute name="RPH" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}RPH_Type" />
 *       &lt;attribute name="Type" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}IATA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "streetNmbr",
    "bldgRoom",
    "addressLine",
    "cityName",
    "postalCode",
    "county",
    "stateProv",
    "countryName"
})
@XmlSeeAlso({
    org.iata.iata._2007._00.iata2010.PaymentCardType.Address.class
})
public class AddressType {

    @XmlElement(name = "StreetNmbr")
    protected AddressType.StreetNmbr streetNmbr;
    @XmlElement(name = "BldgRoom")
    protected String bldgRoom;
    @XmlElement(name = "AddressLine")
    protected List<String> addressLine;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "StateProv")
    protected StateProvType stateProv;
    @XmlElement(name = "CountryName")
    protected CountryNameType countryName;
    @XmlAttribute(name = "FormattedInd")
    protected Boolean formattedInd;
    @XmlAttribute(name = "UseType")
    protected String useType;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;

    /**
     * Gets the value of the streetNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType.StreetNmbr }
     *     
     */
    public AddressType.StreetNmbr getStreetNmbr() {
        return streetNmbr;
    }

    /**
     * Sets the value of the streetNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType.StreetNmbr }
     *     
     */
    public void setStreetNmbr(AddressType.StreetNmbr value) {
        this.streetNmbr = value;
    }

    /**
     * Gets the value of the bldgRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgRoom() {
        return bldgRoom;
    }

    /**
     * Sets the value of the bldgRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgRoom(String value) {
        this.bldgRoom = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<String>();
        }
        return this.addressLine;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvType }
     *     
     */
    public StateProvType getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvType }
     *     
     */
    public void setStateProv(StateProvType value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link CountryNameType }
     *     
     */
    public CountryNameType getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryNameType }
     *     
     */
    public void setCountryName(CountryNameType value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the formattedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFormattedInd() {
        if (formattedInd == null) {
            return false;
        } else {
            return formattedInd;
        }
    }

    /**
     * Sets the value of the formattedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormattedInd(Boolean value) {
        this.formattedInd = value;
    }

    /**
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseType(String value) {
        this.useType = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDefaultInd() {
        if (defaultInd == null) {
            return false;
        } else {
            return defaultInd;
        }
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
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
     *       &lt;attribute name="POBox" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to16" />
     *       &lt;attribute name="StreetNmbrSuffix" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to8" />
     *       &lt;attribute name="StreetDirection" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to8" />
     *       &lt;attribute name="RuralRouteNmbr" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}NumericStringLength1to5" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StreetNmbr {

        @XmlAttribute(name = "POBox")
        protected String poBox;
        @XmlAttribute(name = "StreetNmbrSuffix")
        protected String streetNmbrSuffix;
        @XmlAttribute(name = "StreetDirection")
        protected String streetDirection;
        @XmlAttribute(name = "RuralRouteNmbr")
        protected String ruralRouteNmbr;

        /**
         * Gets the value of the poBox property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOBox() {
            return poBox;
        }

        /**
         * Sets the value of the poBox property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOBox(String value) {
            this.poBox = value;
        }

        /**
         * Gets the value of the streetNmbrSuffix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetNmbrSuffix() {
            return streetNmbrSuffix;
        }

        /**
         * Sets the value of the streetNmbrSuffix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetNmbrSuffix(String value) {
            this.streetNmbrSuffix = value;
        }

        /**
         * Gets the value of the streetDirection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetDirection() {
            return streetDirection;
        }

        /**
         * Sets the value of the streetDirection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetDirection(String value) {
            this.streetDirection = value;
        }

        /**
         * Gets the value of the ruralRouteNmbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuralRouteNmbr() {
            return ruralRouteNmbr;
        }

        /**
         * Sets the value of the ruralRouteNmbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuralRouteNmbr(String value) {
            this.ruralRouteNmbr = value;
        }

    }

}
