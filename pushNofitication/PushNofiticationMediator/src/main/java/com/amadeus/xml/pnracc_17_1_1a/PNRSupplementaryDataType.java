
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the FOP table data
 * 
 * <p>Java class for PNRSupplementaryDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRSupplementaryDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataAndSwitchMap" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType_94576S"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRSupplementaryDataType", propOrder = {
    "dataAndSwitchMap"
})
public class PNRSupplementaryDataType {

    @XmlElement(required = true)
    protected AttributeType94576S dataAndSwitchMap;

    /**
     * Gets the value of the dataAndSwitchMap property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType94576S }
     *     
     */
    public AttributeType94576S getDataAndSwitchMap() {
        return dataAndSwitchMap;
    }

    /**
     * Sets the value of the dataAndSwitchMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType94576S }
     *     
     */
    public void setDataAndSwitchMap(AttributeType94576S value) {
        this.dataAndSwitchMap = value;
    }

}
