
package com.amadeus.xml.pnracc_17_1_1a;

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
 * &lt;complexType name="SpecificDataInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataTypeInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DataTypeInformationTypeI"/&gt;
 *         &lt;element name="dataInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DataInformationTypeI_35753C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificDataInformationTypeI", propOrder = {
    "dataTypeInformation",
    "dataInformation"
})
public class SpecificDataInformationTypeI {

    @XmlElement(required = true)
    protected DataTypeInformationTypeI dataTypeInformation;
    @XmlElement(required = true)
    protected DataInformationTypeI35753C dataInformation;

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

    /**
     * Gets the value of the dataInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DataInformationTypeI35753C }
     *     
     */
    public DataInformationTypeI35753C getDataInformation() {
        return dataInformation;
    }

    /**
     * Sets the value of the dataInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataInformationTypeI35753C }
     *     
     */
    public void setDataInformation(DataInformationTypeI35753C value) {
        this.dataInformation = value;
    }

}
