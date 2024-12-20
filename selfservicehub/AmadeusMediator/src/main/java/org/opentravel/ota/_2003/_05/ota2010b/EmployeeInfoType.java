
package org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Employment identification; using an employee ID number, title, level within the company, and an indication of their status (e.g., active, retired, on leave, or terminated from employment).  Additional information about an employee can be entered into the element, including the name of the employee, if it differs from the person name identified as a customer or contact.
 * 
 * <p>Java class for EmployeeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeInfoType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B&gt;StringLength0to64"&gt;
 *       &lt;attribute name="EmployeeId" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
 *       &lt;attribute name="EmployeeLevel" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
 *       &lt;attribute name="EmployeeTitle" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" /&gt;
 *       &lt;attribute name="EmployeeStatus" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeInfoType", propOrder = {
    "value"
})
public class EmployeeInfoType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "EmployeeId")
    protected String employeeId;
    @XmlAttribute(name = "EmployeeLevel")
    protected String employeeLevel;
    @XmlAttribute(name = "EmployeeTitle")
    protected String employeeTitle;
    @XmlAttribute(name = "EmployeeStatus")
    protected String employeeStatus;

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
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the employeeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeLevel() {
        return employeeLevel;
    }

    /**
     * Sets the value of the employeeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeLevel(String value) {
        this.employeeLevel = value;
    }

    /**
     * Gets the value of the employeeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeTitle() {
        return employeeTitle;
    }

    /**
     * Sets the value of the employeeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeTitle(String value) {
        this.employeeTitle = value;
    }

    /**
     * Gets the value of the employeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * Sets the value of the employeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeStatus(String value) {
        this.employeeStatus = value;
    }

}
