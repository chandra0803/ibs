
package com.amadeus.xml.tatres_15_2_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationTypeI_29340S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI_29340S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightDate" type="{http://xml.amadeus.com/TATRES_15_2_1A}ProductDateTimeTypeI" minOccurs="0"/&gt;
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}LocationTypeI_52002C" minOccurs="0"/&gt;
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}LocationTypeI_52002C" minOccurs="0"/&gt;
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}CompanyIdentificationTypeI_51997C" minOccurs="0"/&gt;
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/TATRES_15_2_1A}ProductIdentificationDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="flightTypeDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}ProductTypeDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumericInteger_Length1To6" minOccurs="0"/&gt;
 *         &lt;element name="specialSegment" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="marriageDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}MarriageControlDetailsTypeI" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI_29340S", propOrder = {
    "flightDate",
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification",
    "flightTypeDetails",
    "itemNumber",
    "specialSegment",
    "marriageDetails"
})
public class TravelProductInformationTypeI29340S {

    protected ProductDateTimeTypeI flightDate;
    protected LocationTypeI52002C boardPointDetails;
    protected LocationTypeI52002C offpointDetails;
    protected CompanyIdentificationTypeI51997C companyDetails;
    protected ProductIdentificationDetailsTypeI flightIdentification;
    protected ProductTypeDetailsTypeI flightTypeDetails;
    protected BigInteger itemNumber;
    protected String specialSegment;
    protected List<MarriageControlDetailsTypeI> marriageDetails;

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public ProductDateTimeTypeI getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public void setFlightDate(ProductDateTimeTypeI value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI52002C }
     *     
     */
    public LocationTypeI52002C getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI52002C }
     *     
     */
    public void setBoardPointDetails(LocationTypeI52002C value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI52002C }
     *     
     */
    public LocationTypeI52002C getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI52002C }
     *     
     */
    public void setOffpointDetails(LocationTypeI52002C value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI51997C }
     *     
     */
    public CompanyIdentificationTypeI51997C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI51997C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI51997C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public ProductIdentificationDetailsTypeI getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsTypeI value) {
        this.flightIdentification = value;
    }

    /**
     * Gets the value of the flightTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public ProductTypeDetailsTypeI getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /**
     * Sets the value of the flightTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public void setFlightTypeDetails(ProductTypeDetailsTypeI value) {
        this.flightTypeDetails = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemNumber(BigInteger value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the specialSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialSegment() {
        return specialSegment;
    }

    /**
     * Sets the value of the specialSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialSegment(String value) {
        this.specialSegment = value;
    }

    /**
     * Gets the value of the marriageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marriageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarriageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarriageControlDetailsTypeI }
     * 
     * 
     */
    public List<MarriageControlDetailsTypeI> getMarriageDetails() {
        if (marriageDetails == null) {
            marriageDetails = new ArrayList<MarriageControlDetailsTypeI>();
        }
        return this.marriageDetails;
    }

}
