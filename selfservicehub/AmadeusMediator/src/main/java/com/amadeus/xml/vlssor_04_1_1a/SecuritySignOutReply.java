
package com.amadeus.xml.vlssor_04_1_1a;

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
 *                   &lt;element name="applicationError" type="{http://xml.amadeus.com/VLSSOR_04_1_1A}ApplicationErrorInformationType"/&gt;
 *                   &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/VLSSOR_04_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="processStatus" type="{http://xml.amadeus.com/VLSSOR_04_1_1A}ResponseAnalysisDetailsType" minOccurs="0"/&gt;
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
    "processStatus"
})
@XmlRootElement(name = "Security_SignOutReply")
public class SecuritySignOutReply {

    protected SecuritySignOutReply.ErrorSection errorSection;
    protected ResponseAnalysisDetailsType processStatus;

    /**
     * Gets the value of the errorSection property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritySignOutReply.ErrorSection }
     *     
     */
    public SecuritySignOutReply.ErrorSection getErrorSection() {
        return errorSection;
    }

    /**
     * Sets the value of the errorSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritySignOutReply.ErrorSection }
     *     
     */
    public void setErrorSection(SecuritySignOutReply.ErrorSection value) {
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="applicationError" type="{http://xml.amadeus.com/VLSSOR_04_1_1A}ApplicationErrorInformationType"/&gt;
     *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/VLSSOR_04_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/&gt;
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
