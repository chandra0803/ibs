
package com.amadeus.xml.ttstrr_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amount information.
 * 
 * <p>Java class for MonetaryInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareDataMainInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationDetailsTypeI_260502C"/&gt;
 *         &lt;element name="fareDataSupInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}MonetaryInformationDetailsTypeI_260502C" maxOccurs="19" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationTypeI", propOrder = {
    "fareDataMainInformation",
    "fareDataSupInformation"
})
public class MonetaryInformationTypeI {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsTypeI260502C fareDataMainInformation;
    protected List<MonetaryInformationDetailsTypeI260502C> fareDataSupInformation;

    /**
     * Gets the value of the fareDataMainInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI260502C }
     *     
     */
    public MonetaryInformationDetailsTypeI260502C getFareDataMainInformation() {
        return fareDataMainInformation;
    }

    /**
     * Sets the value of the fareDataMainInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI260502C }
     *     
     */
    public void setFareDataMainInformation(MonetaryInformationDetailsTypeI260502C value) {
        this.fareDataMainInformation = value;
    }

    /**
     * Gets the value of the fareDataSupInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDataSupInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDataSupInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsTypeI260502C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsTypeI260502C> getFareDataSupInformation() {
        if (fareDataSupInformation == null) {
            fareDataSupInformation = new ArrayList<MonetaryInformationDetailsTypeI260502C>();
        }
        return this.fareDataSupInformation;
    }

}
