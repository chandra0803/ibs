
package org.iata.iata._2007._00.iata2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * FlightSegmentType extends FlightSegmentBaseType to provide additional functionality.
 * 
 * <p>Java class for FlightSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/2007/00/IATA2010.1}FlightSegmentBaseType">
 *       &lt;sequence>
 *         &lt;element name="MarketingAirline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2007/00/IATA2010.1>CompanyNameType">
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2007/00/IATA2010.1}SingleVendorIndGroup"/>
 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}UpperCaseAlphaLength1to2" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="FlightNumber" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}FlightNumberType" />
 *       &lt;attribute name="TourOperatorFlightID" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}StringLength1to8" />
 *       &lt;attribute name="OperationalSuffix" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}OperationalSuffixType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentType", propOrder = {
    "marketingAirline"
})
public class FlightSegmentType
    extends FlightSegmentBaseType
{

    @XmlElement(name = "MarketingAirline")
    protected FlightSegmentType.MarketingAirline marketingAirline;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "TourOperatorFlightID")
    protected String tourOperatorFlightID;
    @XmlAttribute(name = "OperationalSuffix")
    protected String operationalSuffix;

    /**
     * Gets the value of the marketingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentType.MarketingAirline }
     *     
     */
    public FlightSegmentType.MarketingAirline getMarketingAirline() {
        return marketingAirline;
    }

    /**
     * Sets the value of the marketingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentType.MarketingAirline }
     *     
     */
    public void setMarketingAirline(FlightSegmentType.MarketingAirline value) {
        this.marketingAirline = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the tourOperatorFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /**
     * Sets the value of the tourOperatorFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorFlightID(String value) {
        this.tourOperatorFlightID = value;
    }

    /**
     * Gets the value of the operationalSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalSuffix() {
        return operationalSuffix;
    }

    /**
     * Sets the value of the operationalSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalSuffix(String value) {
        this.operationalSuffix = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2007/00/IATA2010.1>CompanyNameType">
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2007/00/IATA2010.1}SingleVendorIndGroup"/>
     *       &lt;attribute name="ResBookDesigCode" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}UpperCaseAlphaLength1to2" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MarketingAirline
        extends CompanyNameType
    {

        @XmlAttribute(name = "ResBookDesigCode")
        protected String resBookDesigCode;
        @XmlAttribute(name = "SingleVendorInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String singleVendorInd;

        /**
         * Gets the value of the resBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        /**
         * Sets the value of the resBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCode(String value) {
            this.resBookDesigCode = value;
        }

        /**
         * Gets the value of the singleVendorInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * Sets the value of the singleVendorInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
        }

    }

}
