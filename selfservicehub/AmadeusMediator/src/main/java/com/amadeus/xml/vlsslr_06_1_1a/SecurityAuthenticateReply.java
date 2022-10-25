
package com.amadeus.xml.vlsslr_06_1_1a;

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
 *         &lt;element name="errorSection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="applicationError" type="{http://xml.amadeus.com/VLSSLR_06_1_1A}ApplicationErrorInformationType"/&gt;
 *                   &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/VLSSLR_06_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="processStatus" type="{http://xml.amadeus.com/VLSSLR_06_1_1A}ResponseAnalysisDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="organizationInfo" type="{http://xml.amadeus.com/VLSSLR_06_1_1A}OrganizationType" minOccurs="0"/&gt;
 *         &lt;element name="conversationGrp" type="{http://xml.amadeus.com/VLSSLR_06_1_1A}BusinessProcessIdType" minOccurs="0"/&gt;
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
    "errorSection",
    "processStatus",
    "organizationInfo",
    "conversationGrp"
})
@XmlRootElement(name = "Security_AuthenticateReply")
public class SecurityAuthenticateReply {

    protected SecurityAuthenticateReply.ErrorSection errorSection;
    protected ResponseAnalysisDetailsType processStatus;
    protected OrganizationType organizationInfo;
    protected BusinessProcessIdType conversationGrp;

    /**
     * Gets the value of the errorSection property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAuthenticateReply.ErrorSection }
     *     
     */
    public SecurityAuthenticateReply.ErrorSection getErrorSection() {
        return errorSection;
    }

    /**
     * Sets the value of the errorSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAuthenticateReply.ErrorSection }
     *     
     */
    public void setErrorSection(SecurityAuthenticateReply.ErrorSection value) {
        this.errorSection = value;
    }

    /**
     * Gets the value of the processStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAnalysisDetailsType }
     *     
     */
    public ResponseAnalysisDetailsType getProcessStatus() {
        return processStatus;
    }

    /**
     * Sets the value of the processStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAnalysisDetailsType }
     *     
     */
    public void setProcessStatus(ResponseAnalysisDetailsType value) {
        this.processStatus = value;
    }

    /**
     * Gets the value of the organizationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getOrganizationInfo() {
        return organizationInfo;
    }

    /**
     * Sets the value of the organizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setOrganizationInfo(OrganizationType value) {
        this.organizationInfo = value;
    }

    /**
     * Gets the value of the conversationGrp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessIdType }
     *     
     */
    public BusinessProcessIdType getConversationGrp() {
        return conversationGrp;
    }

    /**
     * Sets the value of the conversationGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessIdType }
     *     
     */
    public void setConversationGrp(BusinessProcessIdType value) {
        this.conversationGrp = value;
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
     *         &lt;element name="applicationError" type="{http://xml.amadeus.com/VLSSLR_06_1_1A}ApplicationErrorInformationType"/&gt;
     *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/VLSSLR_06_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/&gt;
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
        "applicationError",
        "interactiveFreeText"
    })
    public static class ErrorSection {

        @XmlElement(required = true)
        protected ApplicationErrorInformationType applicationError;
        protected InteractiveFreeTextTypeI interactiveFreeText;

        /**
         * Gets the value of the applicationError property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationType }
         *     
         */
        public ApplicationErrorInformationType getApplicationError() {
            return applicationError;
        }

        /**
         * Sets the value of the applicationError property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationType }
         *     
         */
        public void setApplicationError(ApplicationErrorInformationType value) {
            this.applicationError = value;
        }

        /**
         * Gets the value of the interactiveFreeText property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public InteractiveFreeTextTypeI getInteractiveFreeText() {
            return interactiveFreeText;
        }

        /**
         * Sets the value of the interactiveFreeText property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public void setInteractiveFreeText(InteractiveFreeTextTypeI value) {
            this.interactiveFreeText = value;
        }

    }

}
