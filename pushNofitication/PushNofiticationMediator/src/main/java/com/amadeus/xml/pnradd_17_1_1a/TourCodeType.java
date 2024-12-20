
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR Tour Code element
 * 
 * <p>Java class for TourCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="formatedTour" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FormatedTourCodeType" minOccurs="0"/>
 *         &lt;element name="netRemit" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NetRemitTourCodeType" minOccurs="0"/>
 *         &lt;element name="freeFormatTour" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FreeFormatTourCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourCodeType", propOrder = {
    "passengerType",
    "formatedTour",
    "netRemit",
    "freeFormatTour"
})
public class TourCodeType {

    protected String passengerType;
    protected FormatedTourCodeType formatedTour;
    protected NetRemitTourCodeType netRemit;
    protected FreeFormatTourCodeType freeFormatTour;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the formatedTour property.
     * 
     * @return
     *     possible object is
     *     {@link FormatedTourCodeType }
     *     
     */
    public FormatedTourCodeType getFormatedTour() {
        return formatedTour;
    }

    /**
     * Sets the value of the formatedTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatedTourCodeType }
     *     
     */
    public void setFormatedTour(FormatedTourCodeType value) {
        this.formatedTour = value;
    }

    /**
     * Gets the value of the netRemit property.
     * 
     * @return
     *     possible object is
     *     {@link NetRemitTourCodeType }
     *     
     */
    public NetRemitTourCodeType getNetRemit() {
        return netRemit;
    }

    /**
     * Sets the value of the netRemit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetRemitTourCodeType }
     *     
     */
    public void setNetRemit(NetRemitTourCodeType value) {
        this.netRemit = value;
    }

    /**
     * Gets the value of the freeFormatTour property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormatTourCodeType }
     *     
     */
    public FreeFormatTourCodeType getFreeFormatTour() {
        return freeFormatTour;
    }

    /**
     * Sets the value of the freeFormatTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormatTourCodeType }
     *     
     */
    public void setFreeFormatTour(FreeFormatTourCodeType value) {
        this.freeFormatTour = value;
    }

}
