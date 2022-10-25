
package com.amadeus.xml._2010._06.security_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amadeus.xml._2010._06.appmdw_commontypes_v3.ApplicationType;
import com.amadeus.xml._2010._06.appmdw_commontypes_v3.LocationType;
import com.amadeus.xml._2010._06.types_v1.PointOfSaleType;


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
 *         &lt;element name="UserID">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://xml.amadeus.com/2010/06/Types_v1}PointOfSaleType">
 *                 &lt;attribute name="RequestorType" use="required" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}AlphaLength1" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FullLocation" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}LocationType" minOccurs="0"/>
 *         &lt;element name="WorkstationID" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" minOccurs="0"/>
 *         &lt;element name="Application" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}ApplicationType" minOccurs="0"/>
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
    "userID",
    "fullLocation",
    "workstationID",
    "application"
})
@XmlRootElement(name = "AMA_SecurityHostedUser")
public class AMASecurityHostedUser {

    @XmlElement(name = "UserID", required = true)
    protected AMASecurityHostedUser.UserID userID;
    @XmlElement(name = "FullLocation")
    protected LocationType fullLocation;
    @XmlElement(name = "WorkstationID")
    protected String workstationID;
    @XmlElement(name = "Application")
    protected ApplicationType application;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link AMASecurityHostedUser.UserID }
     *     
     */
    public AMASecurityHostedUser.UserID getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMASecurityHostedUser.UserID }
     *     
     */
    public void setUserID(AMASecurityHostedUser.UserID value) {
        this.userID = value;
    }

    /**
     * Gets the value of the fullLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getFullLocation() {
        return fullLocation;
    }

    /**
     * Sets the value of the fullLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setFullLocation(LocationType value) {
        this.fullLocation = value;
    }

    /**
     * Gets the value of the workstationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstationID() {
        return workstationID;
    }

    /**
     * Sets the value of the workstationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstationID(String value) {
        this.workstationID = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplication(ApplicationType value) {
        this.application = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://xml.amadeus.com/2010/06/Types_v1}PointOfSaleType">
     *       &lt;attribute name="RequestorType" use="required" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}AlphaLength1" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UserID
        extends PointOfSaleType
    {

        @XmlAttribute(name = "RequestorType", required = true)
        protected String requestorType;

        /**
         * Gets the value of the requestorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestorType() {
            return requestorType;
        }

        /**
         * Sets the value of the requestorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestorType(String value) {
            this.requestorType = value;
        }

    }

}
