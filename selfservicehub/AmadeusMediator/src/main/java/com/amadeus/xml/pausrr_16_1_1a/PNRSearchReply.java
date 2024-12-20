
package com.amadeus.xml.pausrr_16_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="errorHandler" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ErrorGroupType" minOccurs="0"/&gt;
 *         &lt;element name="scrollingDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ActionDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOffices" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}NumberOfUnitsType" minOccurs="0"/&gt;
 *         &lt;element name="pnrViews" maxOccurs="300" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pnrNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ItemNumberTypeI"/&gt;
 *                   &lt;element name="pnrView" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StructuredBookingRecordImageType"/&gt;
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
@XmlType(name = "", propOrder = {
    "errorHandler",
    "scrollingDetails",
    "numberOfOffices",
    "pnrViews"
})
@XmlRootElement(name = "PNR_SearchReply")
public class PNRSearchReply {

    protected ErrorGroupType errorHandler;
    protected ActionDetailsTypeI scrollingDetails;
    protected NumberOfUnitsType numberOfOffices;
    protected List<PNRSearchReply.PnrViews> pnrViews;

    /**
     * Gets the value of the errorHandler property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorGroupType }
     *     
     */
    public ErrorGroupType getErrorHandler() {
        return errorHandler;
    }

    /**
     * Sets the value of the errorHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorGroupType }
     *     
     */
    public void setErrorHandler(ErrorGroupType value) {
        this.errorHandler = value;
    }

    /**
     * Gets the value of the scrollingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public ActionDetailsTypeI getScrollingDetails() {
        return scrollingDetails;
    }

    /**
     * Sets the value of the scrollingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public void setScrollingDetails(ActionDetailsTypeI value) {
        this.scrollingDetails = value;
    }

    /**
     * Gets the value of the numberOfOffices property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public NumberOfUnitsType getNumberOfOffices() {
        return numberOfOffices;
    }

    /**
     * Sets the value of the numberOfOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public void setNumberOfOffices(NumberOfUnitsType value) {
        this.numberOfOffices = value;
    }

    /**
     * Gets the value of the pnrViews property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrViews property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrViews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRSearchReply.PnrViews }
     * 
     * 
     */
    public List<PNRSearchReply.PnrViews> getPnrViews() {
        if (pnrViews == null) {
            pnrViews = new ArrayList<PNRSearchReply.PnrViews>();
        }
        return this.pnrViews;
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
     *         &lt;element name="pnrNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ItemNumberTypeI"/&gt;
     *         &lt;element name="pnrView" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StructuredBookingRecordImageType"/&gt;
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
        "pnrNumber",
        "pnrView"
    })
    public static class PnrViews {

        @XmlElement(required = true)
        protected ItemNumberTypeI pnrNumber;
        @XmlElement(required = true)
        protected StructuredBookingRecordImageType pnrView;

        /**
         * Gets the value of the pnrNumber property.
         * 
         * @return
         *     possible object is
         *     {@link ItemNumberTypeI }
         *     
         */
        public ItemNumberTypeI getPnrNumber() {
            return pnrNumber;
        }

        /**
         * Sets the value of the pnrNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemNumberTypeI }
         *     
         */
        public void setPnrNumber(ItemNumberTypeI value) {
            this.pnrNumber = value;
        }

        /**
         * Gets the value of the pnrView property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredBookingRecordImageType }
         *     
         */
        public StructuredBookingRecordImageType getPnrView() {
            return pnrView;
        }

        /**
         * Sets the value of the pnrView property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredBookingRecordImageType }
         *     
         */
        public void setPnrView(StructuredBookingRecordImageType value) {
            this.pnrView = value;
        }

    }

}
