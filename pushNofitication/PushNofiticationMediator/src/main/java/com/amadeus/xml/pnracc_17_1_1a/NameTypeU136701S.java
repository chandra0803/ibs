
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the name of a person or entity.
 * 
 * <p>Java class for NameTypeU_136701S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameTypeU_136701S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameInformationTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameTypeU_136701S", propOrder = {
    "nameInformation"
})
public class NameTypeU136701S {

    @XmlElement(required = true)
    protected NameInformationTypeU nameInformation;

    /**
     * Gets the value of the nameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NameInformationTypeU }
     *     
     */
    public NameInformationTypeU getNameInformation() {
        return nameInformation;
    }

    /**
     * Sets the value of the nameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInformationTypeU }
     *     
     */
    public void setNameInformation(NameInformationTypeU value) {
        this.nameInformation = value;
    }

}
