
package org.opentravel.ota._2003._05.ota2010b;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifies the criterion for a search.
 * 
 * <p>Java class for ItemSearchCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSearchCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}PositionGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}AddressType"&gt;
 *                 &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AddressSearchScope"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;enumeration value="Primary"/&gt;
 *                       &lt;enumeration value="Alternate"/&gt;
 *                       &lt;enumeration value="PrimaryAndAlternate"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telephone" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}TelephoneGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RefPoint" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B&gt;StringLength0to64"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeListGroup"/&gt;
 *                 &lt;attribute name="StateProv" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StateProvCodeType" /&gt;
 *                 &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ISO3166" /&gt;
 *                 &lt;attribute name="RefPointType" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
 *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to128" /&gt;
 *                 &lt;attribute name="CityName" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CodeRef" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B&gt;LocationType"&gt;
 *                 &lt;attribute name="VicinityCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HotelRef" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}HotelReferenceGroup"/&gt;
 *                 &lt;attribute name="SegmentCategoryCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
 *                 &lt;attribute name="PropertyClassCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
 *                 &lt;attribute name="ArchitecturalStyleCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
 *                 &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="LocationCategoryCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
 *                 &lt;attribute name="ExtendedCitySearchIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Radius" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}DistanceAttributesGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MapArea" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NorthLatitude" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
 *                 &lt;attribute name="SouthLatitude" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
 *                 &lt;attribute name="EastLongitude" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
 *                 &lt;attribute name="WestLongitude" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ExactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ImportanceType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16"&gt;
 *             &lt;enumeration value="Mandatory"/&gt;
 *             &lt;enumeration value="High"/&gt;
 *             &lt;enumeration value="Medium"/&gt;
 *             &lt;enumeration value="Low"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Ranking" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearchCriterionType", propOrder = {
    "position",
    "address",
    "telephone",
    "refPoint",
    "codeRef",
    "hotelRef",
    "radius",
    "mapArea"
})
public class ItemSearchCriterionType {

    @XmlElement(name = "Position")
    protected ItemSearchCriterionType.Position position;
    @XmlElement(name = "Address")
    protected ItemSearchCriterionType.Address address;
    @XmlElement(name = "Telephone")
    protected ItemSearchCriterionType.Telephone telephone;
    @XmlElement(name = "RefPoint")
    protected List<ItemSearchCriterionType.RefPoint> refPoint;
    @XmlElement(name = "CodeRef")
    protected ItemSearchCriterionType.CodeRef codeRef;
    @XmlElement(name = "HotelRef")
    protected List<ItemSearchCriterionType.HotelRef> hotelRef;
    @XmlElement(name = "Radius")
    protected ItemSearchCriterionType.Radius radius;
    @XmlElement(name = "MapArea")
    protected ItemSearchCriterionType.MapArea mapArea;
    @XmlAttribute(name = "ExactMatch")
    protected Boolean exactMatch;
    @XmlAttribute(name = "ImportanceType")
    protected String importanceType;
    @XmlAttribute(name = "Ranking")
    protected BigInteger ranking;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Position }
     *     
     */
    public ItemSearchCriterionType.Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Position }
     *     
     */
    public void setPosition(ItemSearchCriterionType.Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Address }
     *     
     */
    public ItemSearchCriterionType.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Address }
     *     
     */
    public void setAddress(ItemSearchCriterionType.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Telephone }
     *     
     */
    public ItemSearchCriterionType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Telephone }
     *     
     */
    public void setTelephone(ItemSearchCriterionType.Telephone value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the refPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType.RefPoint }
     * 
     * 
     */
    public List<ItemSearchCriterionType.RefPoint> getRefPoint() {
        if (refPoint == null) {
            refPoint = new ArrayList<ItemSearchCriterionType.RefPoint>();
        }
        return this.refPoint;
    }

    /**
     * Gets the value of the codeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.CodeRef }
     *     
     */
    public ItemSearchCriterionType.CodeRef getCodeRef() {
        return codeRef;
    }

    /**
     * Sets the value of the codeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.CodeRef }
     *     
     */
    public void setCodeRef(ItemSearchCriterionType.CodeRef value) {
        this.codeRef = value;
    }

    /**
     * Gets the value of the hotelRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType.HotelRef }
     * 
     * 
     */
    public List<ItemSearchCriterionType.HotelRef> getHotelRef() {
        if (hotelRef == null) {
            hotelRef = new ArrayList<ItemSearchCriterionType.HotelRef>();
        }
        return this.hotelRef;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Radius }
     *     
     */
    public ItemSearchCriterionType.Radius getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Radius }
     *     
     */
    public void setRadius(ItemSearchCriterionType.Radius value) {
        this.radius = value;
    }

    /**
     * Gets the value of the mapArea property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.MapArea }
     *     
     */
    public ItemSearchCriterionType.MapArea getMapArea() {
        return mapArea;
    }

    /**
     * Sets the value of the mapArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.MapArea }
     *     
     */
    public void setMapArea(ItemSearchCriterionType.MapArea value) {
        this.mapArea = value;
    }

    /**
     * Gets the value of the exactMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * Sets the value of the exactMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExactMatch(Boolean value) {
        this.exactMatch = value;
    }

    /**
     * Gets the value of the importanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportanceType() {
        return importanceType;
    }

    /**
     * Sets the value of the importanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportanceType(String value) {
        this.importanceType = value;
    }

    /**
     * Gets the value of the ranking property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRanking() {
        return ranking;
    }

    /**
     * Sets the value of the ranking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRanking(BigInteger value) {
        this.ranking = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}AddressType"&gt;
     *       &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AddressSearchScope"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *             &lt;enumeration value="Primary"/&gt;
     *             &lt;enumeration value="Alternate"/&gt;
     *             &lt;enumeration value="PrimaryAndAlternate"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends AddressType
    {

        @XmlAttribute(name = "SameCountryInd")
        protected Boolean sameCountryInd;
        @XmlAttribute(name = "AddressSearchScope")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String addressSearchScope;

        /**
         * Gets the value of the sameCountryInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSameCountryInd() {
            return sameCountryInd;
        }

        /**
         * Sets the value of the sameCountryInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSameCountryInd(Boolean value) {
            this.sameCountryInd = value;
        }

        /**
         * Gets the value of the addressSearchScope property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressSearchScope() {
            return addressSearchScope;
        }

        /**
         * Sets the value of the addressSearchScope property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressSearchScope(String value) {
            this.addressSearchScope = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B&gt;LocationType"&gt;
     *       &lt;attribute name="VicinityCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CodeRef
        extends LocationType
    {

        @XmlAttribute(name = "VicinityCode")
        protected String vicinityCode;

        /**
         * Gets the value of the vicinityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVicinityCode() {
            return vicinityCode;
        }

        /**
         * Sets the value of the vicinityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVicinityCode(String value) {
            this.vicinityCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}HotelReferenceGroup"/&gt;
     *       &lt;attribute name="SegmentCategoryCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
     *       &lt;attribute name="PropertyClassCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
     *       &lt;attribute name="ArchitecturalStyleCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
     *       &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="LocationCategoryCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
     *       &lt;attribute name="ExtendedCitySearchIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelRef {

        @XmlAttribute(name = "SegmentCategoryCode")
        protected String segmentCategoryCode;
        @XmlAttribute(name = "PropertyClassCode")
        protected String propertyClassCode;
        @XmlAttribute(name = "ArchitecturalStyleCode")
        protected String architecturalStyleCode;
        @XmlAttribute(name = "SupplierIntegrationLevel")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger supplierIntegrationLevel;
        @XmlAttribute(name = "LocationCategoryCode")
        protected String locationCategoryCode;
        @XmlAttribute(name = "ExtendedCitySearchIndicator")
        protected Boolean extendedCitySearchIndicator;
        @XmlAttribute(name = "ChainCode")
        protected String chainCode;
        @XmlAttribute(name = "BrandCode")
        protected String brandCode;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelCityCode")
        protected String hotelCityCode;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;
        @XmlAttribute(name = "HotelCodeContext")
        protected String hotelCodeContext;
        @XmlAttribute(name = "ChainName")
        protected String chainName;
        @XmlAttribute(name = "BrandName")
        protected String brandName;
        @XmlAttribute(name = "AreaID")
        protected String areaID;

        /**
         * Gets the value of the segmentCategoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegmentCategoryCode() {
            return segmentCategoryCode;
        }

        /**
         * Sets the value of the segmentCategoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegmentCategoryCode(String value) {
            this.segmentCategoryCode = value;
        }

        /**
         * Gets the value of the propertyClassCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyClassCode() {
            return propertyClassCode;
        }

        /**
         * Sets the value of the propertyClassCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyClassCode(String value) {
            this.propertyClassCode = value;
        }

        /**
         * Gets the value of the architecturalStyleCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArchitecturalStyleCode() {
            return architecturalStyleCode;
        }

        /**
         * Sets the value of the architecturalStyleCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArchitecturalStyleCode(String value) {
            this.architecturalStyleCode = value;
        }

        /**
         * Gets the value of the supplierIntegrationLevel property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSupplierIntegrationLevel() {
            return supplierIntegrationLevel;
        }

        /**
         * Sets the value of the supplierIntegrationLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSupplierIntegrationLevel(BigInteger value) {
            this.supplierIntegrationLevel = value;
        }

        /**
         * Gets the value of the locationCategoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCategoryCode() {
            return locationCategoryCode;
        }

        /**
         * Sets the value of the locationCategoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCategoryCode(String value) {
            this.locationCategoryCode = value;
        }

        /**
         * Gets the value of the extendedCitySearchIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExtendedCitySearchIndicator() {
            return extendedCitySearchIndicator;
        }

        /**
         * Sets the value of the extendedCitySearchIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExtendedCitySearchIndicator(Boolean value) {
            this.extendedCitySearchIndicator = value;
        }

        /**
         * Gets the value of the chainCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * Sets the value of the chainCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * Gets the value of the brandCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandCode() {
            return brandCode;
        }

        /**
         * Sets the value of the brandCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandCode(String value) {
            this.brandCode = value;
        }

        /**
         * Gets the value of the hotelCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * Sets the value of the hotelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * Gets the value of the hotelCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * Sets the value of the hotelCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * Gets the value of the hotelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * Sets the value of the hotelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * Gets the value of the hotelCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCodeContext() {
            return hotelCodeContext;
        }

        /**
         * Sets the value of the hotelCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCodeContext(String value) {
            this.hotelCodeContext = value;
        }

        /**
         * Gets the value of the chainName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainName() {
            return chainName;
        }

        /**
         * Sets the value of the chainName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainName(String value) {
            this.chainName = value;
        }

        /**
         * Gets the value of the brandName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * Sets the value of the brandName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandName(String value) {
            this.brandName = value;
        }

        /**
         * Gets the value of the areaID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaID() {
            return areaID;
        }

        /**
         * Sets the value of the areaID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaID(String value) {
            this.areaID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="NorthLatitude" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
     *       &lt;attribute name="SouthLatitude" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
     *       &lt;attribute name="EastLongitude" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
     *       &lt;attribute name="WestLongitude" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MapArea {

        @XmlAttribute(name = "NorthLatitude")
        protected String northLatitude;
        @XmlAttribute(name = "SouthLatitude")
        protected String southLatitude;
        @XmlAttribute(name = "EastLongitude")
        protected String eastLongitude;
        @XmlAttribute(name = "WestLongitude")
        protected String westLongitude;

        /**
         * Gets the value of the northLatitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNorthLatitude() {
            return northLatitude;
        }

        /**
         * Sets the value of the northLatitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNorthLatitude(String value) {
            this.northLatitude = value;
        }

        /**
         * Gets the value of the southLatitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSouthLatitude() {
            return southLatitude;
        }

        /**
         * Sets the value of the southLatitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSouthLatitude(String value) {
            this.southLatitude = value;
        }

        /**
         * Gets the value of the eastLongitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEastLongitude() {
            return eastLongitude;
        }

        /**
         * Sets the value of the eastLongitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEastLongitude(String value) {
            this.eastLongitude = value;
        }

        /**
         * Gets the value of the westLongitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWestLongitude() {
            return westLongitude;
        }

        /**
         * Sets the value of the westLongitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWestLongitude(String value) {
            this.westLongitude = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}PositionGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;
        @XmlAttribute(name = "PositionAccuracy")
        protected String positionAccuracy;

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the altitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * Sets the value of the altitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * Gets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * Sets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

        /**
         * Gets the value of the positionAccuracy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionAccuracy() {
            return positionAccuracy;
        }

        /**
         * Sets the value of the positionAccuracy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionAccuracy(String value) {
            this.positionAccuracy = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}DistanceAttributesGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Radius {

        @XmlAttribute(name = "Distance")
        protected String distance;
        @XmlAttribute(name = "DistanceMeasure")
        protected String distanceMeasure;
        @XmlAttribute(name = "Direction")
        protected String direction;
        @XmlAttribute(name = "DistanceMax")
        protected String distanceMax;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * Gets the value of the distance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistance() {
            return distance;
        }

        /**
         * Sets the value of the distance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistance(String value) {
            this.distance = value;
        }

        /**
         * Gets the value of the distanceMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMeasure() {
            return distanceMeasure;
        }

        /**
         * Sets the value of the distanceMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMeasure(String value) {
            this.distanceMeasure = value;
        }

        /**
         * Gets the value of the direction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirection() {
            return direction;
        }

        /**
         * Sets the value of the direction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirection(String value) {
            this.direction = value;
        }

        /**
         * Gets the value of the distanceMax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMax() {
            return distanceMax;
        }

        /**
         * Sets the value of the distanceMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMax(String value) {
            this.distanceMax = value;
        }

        /**
         * Gets the value of the unitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Sets the value of the unitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B&gt;StringLength0to64"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeListGroup"/&gt;
     *       &lt;attribute name="StateProv" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StateProvCodeType" /&gt;
     *       &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ISO3166" /&gt;
     *       &lt;attribute name="RefPointType" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
     *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to128" /&gt;
     *       &lt;attribute name="CityName" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RefPoint {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "StateProv")
        protected String stateProv;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "RefPointType")
        protected String refPointType;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "CityName")
        protected String cityName;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

        /**
         * Used for Character Strings, length 0 to 64.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the stateProv property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateProv() {
            return stateProv;
        }

        /**
         * Sets the value of the stateProv property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateProv(String value) {
            this.stateProv = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the refPointType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefPointType() {
            return refPointType;
        }

        /**
         * Sets the value of the refPointType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefPointType(String value) {
            this.refPointType = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}TelephoneGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
        @XmlAttribute(name = "PhoneLocationType")
        protected String phoneLocationType;
        @XmlAttribute(name = "PhoneTechType")
        protected String phoneTechType;
        @XmlAttribute(name = "PhoneUseType")
        protected String phoneUseType;
        @XmlAttribute(name = "CountryAccessCode")
        protected String countryAccessCode;
        @XmlAttribute(name = "AreaCityCode")
        protected String areaCityCode;
        @XmlAttribute(name = "PhoneNumber", required = true)
        protected String phoneNumber;
        @XmlAttribute(name = "Extension")
        protected String extension;
        @XmlAttribute(name = "PIN")
        protected String pin;
        @XmlAttribute(name = "Remark")
        protected String remark;
        @XmlAttribute(name = "FormattedInd")
        protected Boolean formattedInd;

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the phoneLocationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneLocationType() {
            return phoneLocationType;
        }

        /**
         * Sets the value of the phoneLocationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneLocationType(String value) {
            this.phoneLocationType = value;
        }

        /**
         * Gets the value of the phoneTechType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneTechType() {
            return phoneTechType;
        }

        /**
         * Sets the value of the phoneTechType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneTechType(String value) {
            this.phoneTechType = value;
        }

        /**
         * Gets the value of the phoneUseType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneUseType() {
            return phoneUseType;
        }

        /**
         * Sets the value of the phoneUseType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneUseType(String value) {
            this.phoneUseType = value;
        }

        /**
         * Gets the value of the countryAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryAccessCode() {
            return countryAccessCode;
        }

        /**
         * Sets the value of the countryAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryAccessCode(String value) {
            this.countryAccessCode = value;
        }

        /**
         * Gets the value of the areaCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCityCode() {
            return areaCityCode;
        }

        /**
         * Sets the value of the areaCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCityCode(String value) {
            this.areaCityCode = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

        /**
         * Gets the value of the pin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIN() {
            return pin;
        }

        /**
         * Sets the value of the pin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIN(String value) {
            this.pin = value;
        }

        /**
         * Gets the value of the remark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemark() {
            return remark;
        }

        /**
         * Sets the value of the remark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemark(String value) {
            this.remark = value;
        }

        /**
         * Gets the value of the formattedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFormattedInd() {
            return formattedInd;
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

    }

}
