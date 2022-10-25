
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide free form or coded long text information.
 * 
 * <p>Java class for LongFreeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LongFreeTextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freetextDetail" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FreeTextQualificationType" minOccurs="0"/&gt;
 *         &lt;element name="longFreetext" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To199" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongFreeTextType", propOrder = {
    "freetextDetail",
    "longFreetext"
})
public class LongFreeTextType {

    protected FreeTextQualificationType freetextDetail;
    protected String longFreetext;

    /**
     * Gets the value of the freetextDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationType }
     *     
     */
    public FreeTextQualificationType getFreetextDetail() {
        return freetextDetail;
    }

    /**
     * Sets the value of the freetextDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationType }
     *     
     */
    public void setFreetextDetail(FreeTextQualificationType value) {
        this.freetextDetail = value;
    }

    /**
     * Gets the value of the longFreetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongFreetext() {
        return longFreetext;
    }

    /**
     * Sets the value of the longFreetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongFreetext(String value) {
        this.longFreetext = value;
    }

}
