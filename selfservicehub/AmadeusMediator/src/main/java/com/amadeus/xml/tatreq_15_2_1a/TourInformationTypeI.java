
package com.amadeus.xml.tatreq_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information concerning a tour.
 * 
 * <p>Java class for TourInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tourInformationDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}TourDetailsTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourInformationTypeI", propOrder = {
    "tourInformationDetails"
})
public class TourInformationTypeI {

    protected TourDetailsTypeI tourInformationDetails;

    /**
     * Gets the value of the tourInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TourDetailsTypeI }
     *     
     */
    public TourDetailsTypeI getTourInformationDetails() {
        return tourInformationDetails;
    }

    /**
     * Sets the value of the tourInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourDetailsTypeI }
     *     
     */
    public void setTourInformationDetails(TourDetailsTypeI value) {
        this.tourInformationDetails = value;
    }

}
