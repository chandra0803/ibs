
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniqueIdDescriptionType_141680C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniqueIdDescriptionType_141680C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="versionNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="referenceQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="primeId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="secondaryId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="creationYear" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Year_YYYY" minOccurs="0"/&gt;
 *         &lt;element name="creationMonth" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Month_MM" minOccurs="0"/&gt;
 *         &lt;element name="creationDay" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Day_NN" minOccurs="0"/&gt;
 *         &lt;element name="creationHour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Hour_HH" minOccurs="0"/&gt;
 *         &lt;element name="creationMinutes" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Minute_MM" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueIdDescriptionType_141680C", propOrder = {
    "systemQualifier",
    "versionNumber",
    "referenceQualifier",
    "primeId",
    "secondaryId",
    "status",
    "creationYear",
    "creationMonth",
    "creationDay",
    "creationHour",
    "creationMinutes",
    "description"
})
public class UniqueIdDescriptionType141680C {

    protected String systemQualifier;
    protected String versionNumber;
    protected String referenceQualifier;
    protected String primeId;
    protected String secondaryId;
    protected String status;
    protected String creationYear;
    protected String creationMonth;
    protected String creationDay;
    protected String creationHour;
    protected String creationMinutes;
    protected String description;

    /**
     * Gets the value of the systemQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemQualifier() {
        return systemQualifier;
    }

    /**
     * Sets the value of the systemQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemQualifier(String value) {
        this.systemQualifier = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the referenceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /**
     * Sets the value of the referenceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceQualifier(String value) {
        this.referenceQualifier = value;
    }

    /**
     * Gets the value of the primeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeId() {
        return primeId;
    }

    /**
     * Sets the value of the primeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeId(String value) {
        this.primeId = value;
    }

    /**
     * Gets the value of the secondaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryId() {
        return secondaryId;
    }

    /**
     * Sets the value of the secondaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryId(String value) {
        this.secondaryId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the creationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationYear() {
        return creationYear;
    }

    /**
     * Sets the value of the creationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationYear(String value) {
        this.creationYear = value;
    }

    /**
     * Gets the value of the creationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationMonth() {
        return creationMonth;
    }

    /**
     * Sets the value of the creationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationMonth(String value) {
        this.creationMonth = value;
    }

    /**
     * Gets the value of the creationDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDay() {
        return creationDay;
    }

    /**
     * Sets the value of the creationDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDay(String value) {
        this.creationDay = value;
    }

    /**
     * Gets the value of the creationHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationHour() {
        return creationHour;
    }

    /**
     * Sets the value of the creationHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationHour(String value) {
        this.creationHour = value;
    }

    /**
     * Gets the value of the creationMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationMinutes() {
        return creationMinutes;
    }

    /**
     * Sets the value of the creationMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationMinutes(String value) {
        this.creationMinutes = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
