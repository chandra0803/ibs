
package com.amadeus.xml._2010._06.types_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.iata.iata._2007._00.iata2010.TimeType;
import org.iata.iata._2007._00.iata2010.UniqueIDType;
import org.opentravel.ota._2003._05.ota2010b.CompanyNameType;


/**
 * Contains all data of a Point of Sale.
 * 
 * <p>Java class for PointOfSaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfSaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestorID" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="BookingChannel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CompanyNameType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to128" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="POS_Type" use="required" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
 *       &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" />
 *       &lt;attribute name="AgentSign" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength0to128" />
 *       &lt;attribute name="AgentDutyCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength0to8" />
 *       &lt;attribute name="ERSP_UserID" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" />
 *       &lt;attribute name="FirstDepartPoint" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength3" />
 *       &lt;attribute name="TrueCityCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength3" />
 *       &lt;attribute name="ISO_Country" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ISO3166" />
 *       &lt;attribute name="ISO_Currency" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}AlphaLength3" />
 *       &lt;attribute name="Language" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength0to128" />
 *       &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}DateOrDateTimeType" />
 *       &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}DateOrDateTimeType" />
 *       &lt;attribute name="TimeZone" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}TimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfSaleType", propOrder = {
    "requestorID",
    "bookingChannel"
})
@XmlSeeAlso({
    com.amadeus.xml._2010._06.security_v1.AMASecurityHostedUser.UserID.class
})
public class PointOfSaleType {

    @XmlElement(name = "RequestorID")
    protected UniqueIDType requestorID;
    @XmlElement(name = "BookingChannel")
    protected PointOfSaleType.BookingChannel bookingChannel;
    @XmlAttribute(name = "POS_Type", required = true)
    protected String posType;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "AgentSign")
    protected String agentSign;
    @XmlAttribute(name = "AgentDutyCode")
    protected String agentDutyCode;
    @XmlAttribute(name = "ERSP_UserID")
    protected String erspUserID;
    @XmlAttribute(name = "FirstDepartPoint")
    protected String firstDepartPoint;
    @XmlAttribute(name = "TrueCityCode")
    protected String trueCityCode;
    @XmlAttribute(name = "ISO_Country")
    protected String isoCountry;
    @XmlAttribute(name = "ISO_Currency")
    protected String isoCurrency;
    @XmlAttribute(name = "Language")
    protected String language;
    @XmlAttribute(name = "Date")
    protected String date;
    @XmlAttribute(name = "Time")
    protected String time;
    @XmlAttribute(name = "TimeZone")
    protected TimeType timeZone;

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setRequestorID(UniqueIDType value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleType.BookingChannel }
     *     
     */
    public PointOfSaleType.BookingChannel getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleType.BookingChannel }
     *     
     */
    public void setBookingChannel(PointOfSaleType.BookingChannel value) {
        this.bookingChannel = value;
    }

    /**
     * Gets the value of the posType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSType() {
        return posType;
    }

    /**
     * Sets the value of the posType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSType(String value) {
        this.posType = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the agentSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSign() {
        return agentSign;
    }

    /**
     * Sets the value of the agentSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSign(String value) {
        this.agentSign = value;
    }

    /**
     * Gets the value of the agentDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    /**
     * Sets the value of the agentDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDutyCode(String value) {
        this.agentDutyCode = value;
    }

    /**
     * Gets the value of the erspUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERSPUserID() {
        return erspUserID;
    }

    /**
     * Sets the value of the erspUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERSPUserID(String value) {
        this.erspUserID = value;
    }

    /**
     * Gets the value of the firstDepartPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDepartPoint() {
        return firstDepartPoint;
    }

    /**
     * Sets the value of the firstDepartPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDepartPoint(String value) {
        this.firstDepartPoint = value;
    }

    /**
     * Gets the value of the trueCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueCityCode() {
        return trueCityCode;
    }

    /**
     * Sets the value of the trueCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueCityCode(String value) {
        this.trueCityCode = value;
    }

    /**
     * Gets the value of the isoCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountry() {
        return isoCountry;
    }

    /**
     * Sets the value of the isoCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountry(String value) {
        this.isoCountry = value;
    }

    /**
     * Gets the value of the isoCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCurrency() {
        return isoCurrency;
    }

    /**
     * Sets the value of the isoCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCurrency(String value) {
        this.isoCurrency = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setTimeZone(TimeType value) {
        this.timeZone = value;
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
     *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CompanyNameType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to128" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "companyName"
    })
    public static class BookingChannel {

        @XmlElement(name = "CompanyName")
        protected CompanyNameType companyName;
        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * Gets the value of the companyName property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyNameType }
         *     
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /**
         * Sets the value of the companyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyNameType }
         *     
         */
        public void setCompanyName(CompanyNameType value) {
            this.companyName = value;
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

    }

}
