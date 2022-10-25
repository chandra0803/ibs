
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous data by first identifying the type of data to be sent and then the actual data.
 * 
 * <p>Java class for SpecificDataInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificDataInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataTypeInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}DataTypeInformationTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificDataInformationTypeI", propOrder = {
    "dataTypeInformation"
})
public class SpecificDataInformationTypeI {

    @XmlElement(required = true)
    protected DataTypeInformationTypeI dataTypeInformation;

    /**
     * Gets the value of the dataTypeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeInformationTypeI }
     *     
     */
    public DataTypeInformationTypeI getDataTypeInformation() {
        return dataTypeInformation;
    }

    /**
     * Sets the value of the dataTypeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeInformationTypeI }
     *     
     */
    public void setDataTypeInformation(DataTypeInformationTypeI value) {
        this.dataTypeInformation = value;
    }

}
