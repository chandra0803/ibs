
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the name of a person or entity.
 * 
 * <p>Java class for NameTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameInformationTypeU_9747C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameTypeU", propOrder = {
    "nameInformation"
})
public class NameTypeU {

    @XmlElement(required = true)
    protected NameInformationTypeU9747C nameInformation;

    /**
     * Gets the value of the nameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NameInformationTypeU9747C }
     *     
     */
    public NameInformationTypeU9747C getNameInformation() {
        return nameInformation;
    }

    /**
     * Sets the value of the nameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInformationTypeU9747C }
     *     
     */
    public void setNameInformation(NameInformationTypeU9747C value) {
        this.nameInformation = value;
    }

}
