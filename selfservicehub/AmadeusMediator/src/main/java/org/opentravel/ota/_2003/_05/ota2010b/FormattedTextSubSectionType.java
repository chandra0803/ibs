
package org.opentravel.ota._2003._05.ota2010b;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to provide subsection formatted text information.
 * 
 * <p>Java class for FormattedTextSubSectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormattedTextSubSectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Paragraph" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ParagraphType" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SubTitle" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" /&gt;
 *       &lt;attribute name="SubCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to8" /&gt;
 *       &lt;attribute name="SubSectionNumber" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}Numeric1to999" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedTextSubSectionType", propOrder = {
    "paragraph"
})
public class FormattedTextSubSectionType {

    @XmlElement(name = "Paragraph", required = true)
    protected List<ParagraphType> paragraph;
    @XmlAttribute(name = "SubTitle")
    protected String subTitle;
    @XmlAttribute(name = "SubCode")
    protected String subCode;
    @XmlAttribute(name = "SubSectionNumber")
    protected Integer subSectionNumber;

    /**
     * Gets the value of the paragraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<ParagraphType>();
        }
        return this.paragraph;
    }

    /**
     * Gets the value of the subTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the value of the subTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * Gets the value of the subSectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubSectionNumber() {
        return subSectionNumber;
    }

    /**
     * Sets the value of the subSectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubSectionNumber(Integer value) {
        this.subSectionNumber = value;
    }

}
