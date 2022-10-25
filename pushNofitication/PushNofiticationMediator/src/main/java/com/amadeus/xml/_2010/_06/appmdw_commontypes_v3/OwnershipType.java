
package com.amadeus.xml._2010._06.appmdw_commontypes_v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Owner of the Query, containing: organization
 * 				(mandatory), application (mandatory)
 * 			
 * 
 * <p>Java class for OwnershipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnershipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="OrganizationCode" use="required" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}String_Length1To10" />
 *       &lt;attribute name="ApplicationLabel" use="required" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}String_Length1To10" />
 *       &lt;attribute name="CompanyCode" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}String_Length1To10" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnershipType")
public class OwnershipType {

    @XmlAttribute(name = "OrganizationCode", required = true)
    protected String organizationCode;
    @XmlAttribute(name = "ApplicationLabel", required = true)
    protected String applicationLabel;
    @XmlAttribute(name = "CompanyCode")
    protected String companyCode;

    /**
     * Gets the value of the organizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Sets the value of the organizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

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
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

}
