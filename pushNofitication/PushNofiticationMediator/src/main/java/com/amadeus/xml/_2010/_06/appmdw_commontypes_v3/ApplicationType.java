
package com.amadeus.xml._2010._06.appmdw_commontypes_v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Application identification
 * 
 * <p>Java class for ApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ApplicationLabel" use="required" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" />
 *       &lt;attribute name="IndexNumber" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}NumericStringLength1to8" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationType")
public class ApplicationType {

    @XmlAttribute(name = "ApplicationLabel", required = true)
    protected String applicationLabel;
    @XmlAttribute(name = "IndexNumber")
    protected String indexNumber;

    /**
     * Gets the value of the applicationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationLabel() {
        return applicationLabel;
    }

    /**
     * Sets the value of the applicationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationLabel(String value) {
        this.applicationLabel = value;
    }

    /**
     * Gets the value of the indexNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexNumber() {
        return indexNumber;
    }

    /**
     * Sets the value of the indexNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexNumber(String value) {
        this.indexNumber = value;
    }

}
