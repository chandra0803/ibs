
package com.amadeus.xml.tatreq_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide date and time details relative to flight movements.
 * 
 * <p>Java class for DateAndTimeInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateAndTimeDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}DateAndTimeDetailsTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationTypeI", propOrder = {
    "dateAndTimeDetails"
})
public class DateAndTimeInformationTypeI {

    protected List<DateAndTimeDetailsTypeI> dateAndTimeDetails;

    /**
     * Gets the value of the dateAndTimeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateAndTimeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateAndTimeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndTimeDetailsTypeI }
     * 
     * 
     */
    public List<DateAndTimeDetailsTypeI> getDateAndTimeDetails() {
        if (dateAndTimeDetails == null) {
            dateAndTimeDetails = new ArrayList<DateAndTimeDetailsTypeI>();
        }
        return this.dateAndTimeDetails;
    }

}
