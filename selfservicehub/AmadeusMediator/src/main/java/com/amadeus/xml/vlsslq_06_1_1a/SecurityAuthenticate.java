
package com.amadeus.xml.vlsslq_06_1_1a;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conversationClt" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}ConversationIDType" minOccurs="0"/&gt;
 *         &lt;element name="userIdentifier" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}UserIdentificationType" maxOccurs="2"/&gt;
 *         &lt;element name="dutyCode" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}ReferenceInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="systemDetails" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}SystemDetailsInfoType" minOccurs="0"/&gt;
 *         &lt;element name="passwordInfo" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}BinaryDataType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="fullLocation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="workstationPos" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}PlaceLocationIdentificationTypeU"/&gt;
 *                   &lt;element name="locationInfo" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}TerminalLocationType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="applicationId" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}ApplicationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conversationClt",
    "userIdentifier",
    "dutyCode",
    "systemDetails",
    "passwordInfo",
    "fullLocation",
    "applicationId"
})
@XmlRootElement(name = "Security_Authenticate")
public class SecurityAuthenticate {

    protected ConversationIDType conversationClt;
    @XmlElement(required = true)
    protected List<UserIdentificationType> userIdentifier;
    protected ReferenceInformationTypeI dutyCode;
    protected SystemDetailsInfoType systemDetails;
    protected List<BinaryDataType> passwordInfo;
    protected SecurityAuthenticate.FullLocation fullLocation;
    protected ApplicationType applicationId;

    /**
     * Gets the value of the conversationClt property.
     * 
     * @return
     *     possible object is
     *     {@link ConversationIDType }
     *     
     */
    public ConversationIDType getConversationClt() {
        return conversationClt;
    }

    /**
     * Sets the value of the conversationClt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationIDType }
     *     
     */
    public void setConversationClt(ConversationIDType value) {
        this.conversationClt = value;
    }

    /**
     * Gets the value of the userIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserIdentificationType }
     * 
     * 
     */
    public List<UserIdentificationType> getUserIdentifier() {
        if (userIdentifier == null) {
            userIdentifier = new ArrayList<UserIdentificationType>();
        }
        return this.userIdentifier;
    }

    /**
     * Gets the value of the dutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationTypeI }
     *     
     */
    public ReferenceInformationTypeI getDutyCode() {
        return dutyCode;
    }

    /**
     * Sets the value of the dutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationTypeI }
     *     
     */
    public void setDutyCode(ReferenceInformationTypeI value) {
        this.dutyCode = value;
    }

    /**
     * Gets the value of the systemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public SystemDetailsInfoType getSystemDetails() {
        return systemDetails;
    }

    /**
     * Sets the value of the systemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public void setSystemDetails(SystemDetailsInfoType value) {
        this.systemDetails = value;
    }

    /**
     * Gets the value of the passwordInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passwordInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasswordInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryDataType }
     * 
     * 
     */
    public List<BinaryDataType> getPasswordInfo() {
        if (passwordInfo == null) {
            passwordInfo = new ArrayList<BinaryDataType>();
        }
        return this.passwordInfo;
    }

    /**
     * Gets the value of the fullLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAuthenticate.FullLocation }
     *     
     */
    public SecurityAuthenticate.FullLocation getFullLocation() {
        return fullLocation;
    }

    /**
     * Sets the value of the fullLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAuthenticate.FullLocation }
     *     
     */
    public void setFullLocation(SecurityAuthenticate.FullLocation value) {
        this.fullLocation = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplicationId(ApplicationType value) {
        this.applicationId = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="workstationPos" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}PlaceLocationIdentificationTypeU"/&gt;
     *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}TerminalLocationType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "workstationPos",
        "locationInfo"
    })
    public static class FullLocation {

        @XmlElement(required = true)
        protected PlaceLocationIdentificationTypeU workstationPos;
        protected TerminalLocationType locationInfo;

        /**
         * Gets the value of the workstationPos property.
         * 
         * @return
         *     possible object is
         *     {@link PlaceLocationIdentificationTypeU }
         *     
         */
        public PlaceLocationIdentificationTypeU getWorkstationPos() {
            return workstationPos;
        }

        /**
         * Sets the value of the workstationPos property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlaceLocationIdentificationTypeU }
         *     
         */
        public void setWorkstationPos(PlaceLocationIdentificationTypeU value) {
            this.workstationPos = value;
        }

        /**
         * Gets the value of the locationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TerminalLocationType }
         *     
         */
        public TerminalLocationType getLocationInfo() {
            return locationInfo;
        }

        /**
         * Sets the value of the locationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TerminalLocationType }
         *     
         */
        public void setLocationInfo(TerminalLocationType value) {
            this.locationInfo = value;
        }

    }

}
