
package com.amadeus.xml.tatreq_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide routing information.
 * 
 * <p>Java class for RoutingInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routingDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ProductLocationDetailsTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="Dummy.NET" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingInformationTypeI", propOrder = {
    "routingDetails"
})
public class RoutingInformationTypeI {

    protected List<ProductLocationDetailsTypeI> routingDetails;

    /**
     * Gets the value of the routingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLocationDetailsTypeI }
     * 
     * 
     */
    public List<ProductLocationDetailsTypeI> getRoutingDetails() {
        if (routingDetails == null) {
            routingDetails = new ArrayList<ProductLocationDetailsTypeI>();
        }
        return this.routingDetails;
    }

}
