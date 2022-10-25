
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey OND informations
 * 
 * <p>Java class for ONDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yieldInformations" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationType_76537S"/&gt;
 *         &lt;element name="classCombinaison" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductInformationTypeI_76271S" minOccurs="0"/&gt;
 *         &lt;element name="ondyield" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI_76268S"/&gt;
 *         &lt;element name="tripOnD" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI_76268S" minOccurs="0"/&gt;
 *         &lt;element name="pointOfCommencement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PointOfCommencementTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONDType", propOrder = {
    "yieldInformations",
    "classCombinaison",
    "ondyield",
    "tripOnD",
    "pointOfCommencement"
})
public class ONDType {

    @XmlElement(required = true)
    protected MonetaryInformationType76537S yieldInformations;
    protected ProductInformationTypeI76271S classCombinaison;
    @XmlElement(required = true)
    protected OriginAndDestinationDetailsTypeI76268S ondyield;
    protected OriginAndDestinationDetailsTypeI76268S tripOnD;
    protected PointOfCommencementTypeI pointOfCommencement;

    /**
     * Gets the value of the yieldInformations property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType76537S }
     *     
     */
    public MonetaryInformationType76537S getYieldInformations() {
        return yieldInformations;
    }

    /**
     * Sets the value of the yieldInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType76537S }
     *     
     */
    public void setYieldInformations(MonetaryInformationType76537S value) {
        this.yieldInformations = value;
    }

    /**
     * Gets the value of the classCombinaison property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationTypeI76271S }
     *     
     */
    public ProductInformationTypeI76271S getClassCombinaison() {
        return classCombinaison;
    }

    /**
     * Sets the value of the classCombinaison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationTypeI76271S }
     *     
     */
    public void setClassCombinaison(ProductInformationTypeI76271S value) {
        this.classCombinaison = value;
    }

    /**
     * Gets the value of the ondyield property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetailsTypeI76268S }
     *     
     */
    public OriginAndDestinationDetailsTypeI76268S getOndyield() {
        return ondyield;
    }

    /**
     * Sets the value of the ondyield property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetailsTypeI76268S }
     *     
     */
    public void setOndyield(OriginAndDestinationDetailsTypeI76268S value) {
        this.ondyield = value;
    }

    /**
     * Gets the value of the tripOnD property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetailsTypeI76268S }
     *     
     */
    public OriginAndDestinationDetailsTypeI76268S getTripOnD() {
        return tripOnD;
    }

    /**
     * Sets the value of the tripOnD property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetailsTypeI76268S }
     *     
     */
    public void setTripOnD(OriginAndDestinationDetailsTypeI76268S value) {
        this.tripOnD = value;
    }

    /**
     * Gets the value of the pointOfCommencement property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfCommencementTypeI }
     *     
     */
    public PointOfCommencementTypeI getPointOfCommencement() {
        return pointOfCommencement;
    }

    /**
     * Sets the value of the pointOfCommencement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfCommencementTypeI }
     *     
     */
    public void setPointOfCommencement(PointOfCommencementTypeI value) {
        this.pointOfCommencement = value;
    }

}
