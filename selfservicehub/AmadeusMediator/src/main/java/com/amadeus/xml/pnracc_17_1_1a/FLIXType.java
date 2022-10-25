
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey the FLIX information within the message
 * 
 * <p>Java class for FLIXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLIXType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flixAndSourceTypes" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemDescriptionType"/&gt;
 *         &lt;element name="flixComment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_128813S" minOccurs="0"/&gt;
 *         &lt;element name="airportGroup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="impactedAirport" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TerminalTimeInformationTypeS"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FLIXType", propOrder = {
    "flixAndSourceTypes",
    "flixComment",
    "airportGroup"
})
public class FLIXType {

    @XmlElement(required = true)
    protected ItemDescriptionType flixAndSourceTypes;
    protected FreeTextInformationType128813S flixComment;
    protected FLIXType.AirportGroup airportGroup;

    /**
     * Gets the value of the flixAndSourceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDescriptionType }
     *     
     */
    public ItemDescriptionType getFlixAndSourceTypes() {
        return flixAndSourceTypes;
    }

    /**
     * Sets the value of the flixAndSourceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDescriptionType }
     *     
     */
    public void setFlixAndSourceTypes(ItemDescriptionType value) {
        this.flixAndSourceTypes = value;
    }

    /**
     * Gets the value of the flixComment property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType128813S }
     *     
     */
    public FreeTextInformationType128813S getFlixComment() {
        return flixComment;
    }

    /**
     * Sets the value of the flixComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType128813S }
     *     
     */
    public void setFlixComment(FreeTextInformationType128813S value) {
        this.flixComment = value;
    }

    /**
     * Gets the value of the airportGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FLIXType.AirportGroup }
     *     
     */
    public FLIXType.AirportGroup getAirportGroup() {
        return airportGroup;
    }

    /**
     * Sets the value of the airportGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLIXType.AirportGroup }
     *     
     */
    public void setAirportGroup(FLIXType.AirportGroup value) {
        this.airportGroup = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="impactedAirport" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TerminalTimeInformationTypeS"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "impactedAirport"
    })
    public static class AirportGroup {

        @XmlElement(required = true)
        protected TerminalTimeInformationTypeS impactedAirport;

        /**
         * Gets the value of the impactedAirport property.
         * 
         * @return
         *     possible object is
         *     {@link TerminalTimeInformationTypeS }
         *     
         */
        public TerminalTimeInformationTypeS getImpactedAirport() {
            return impactedAirport;
        }

        /**
         * Sets the value of the impactedAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link TerminalTimeInformationTypeS }
         *     
         */
        public void setImpactedAirport(TerminalTimeInformationTypeS value) {
            this.impactedAirport = value;
        }

    }

}
