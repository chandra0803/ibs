
package org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes multimedia item(s).
 * 
 * <p>Java class for MultimediaDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="VideoItems" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}VideoItemsType" minOccurs="0"/&gt;
 *         &lt;element name="ImageItems" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ImageItemsType" minOccurs="0"/&gt;
 *         &lt;element name="TextItems" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}TextItemsType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ID_OptionalGroup"/&gt;
 *       &lt;attribute name="InfoCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
 *       &lt;attribute name="AdditionalDetailCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" /&gt;
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaDescriptionType", propOrder = {
    "videoItems",
    "imageItems",
    "textItems"
})
public class MultimediaDescriptionType {

    @XmlElement(name = "VideoItems")
    protected VideoItemsType videoItems;
    @XmlElement(name = "ImageItems")
    protected ImageItemsType imageItems;
    @XmlElement(name = "TextItems")
    protected TextItemsType textItems;
    @XmlAttribute(name = "InfoCode")
    protected String infoCode;
    @XmlAttribute(name = "AdditionalDetailCode")
    protected String additionalDetailCode;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the videoItems property.
     * 
     * @return
     *     possible object is
     *     {@link VideoItemsType }
     *     
     */
    public VideoItemsType getVideoItems() {
        return videoItems;
    }

    /**
     * Sets the value of the videoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoItemsType }
     *     
     */
    public void setVideoItems(VideoItemsType value) {
        this.videoItems = value;
    }

    /**
     * Gets the value of the imageItems property.
     * 
     * @return
     *     possible object is
     *     {@link ImageItemsType }
     *     
     */
    public ImageItemsType getImageItems() {
        return imageItems;
    }

    /**
     * Sets the value of the imageItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageItemsType }
     *     
     */
    public void setImageItems(ImageItemsType value) {
        this.imageItems = value;
    }

    /**
     * Gets the value of the textItems property.
     * 
     * @return
     *     possible object is
     *     {@link TextItemsType }
     *     
     */
    public TextItemsType getTextItems() {
        return textItems;
    }

    /**
     * Sets the value of the textItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextItemsType }
     *     
     */
    public void setTextItems(TextItemsType value) {
        this.textItems = value;
    }

    /**
     * Gets the value of the infoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoCode() {
        return infoCode;
    }

    /**
     * Sets the value of the infoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoCode(String value) {
        this.infoCode = value;
    }

    /**
     * Gets the value of the additionalDetailCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDetailCode() {
        return additionalDetailCode;
    }

    /**
     * Sets the value of the additionalDetailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDetailCode(String value) {
        this.additionalDetailCode = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
