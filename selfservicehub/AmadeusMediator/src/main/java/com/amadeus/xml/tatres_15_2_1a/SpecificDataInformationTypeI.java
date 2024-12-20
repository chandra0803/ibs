
package com.amadeus.xml.tatres_15_2_1a;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="dataTypeInformation" type="{http://xml.amadeus.com/TATRES_15_2_1A}DataTypeInformationTypeI"/&gt;
 *         &lt;element name="dataInformation" type="{http://xml.amadeus.com/TATRES_15_2_1A}DataInformationTypeI" maxOccurs="99" minOccurs="0"/&gt;
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
    protected List<DataInformationTypeI> dataInformation;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataInformationTypeI }
     * 
     * 
     */
    public List<DataInformationTypeI> getDataInformation() {
        if (dataInformation == null) {
            dataInformation = new ArrayList<DataInformationTypeI>();
        }
        return this.dataInformation;
    }

}
