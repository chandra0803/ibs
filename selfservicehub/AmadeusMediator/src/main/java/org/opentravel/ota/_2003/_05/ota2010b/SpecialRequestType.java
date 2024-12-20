
package org.opentravel.ota._2003._05.ota2010b;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of SpecialRequest objects. The collection of all special requests associated with any part of the reservation (the reservation in its entirety, one or more guests, or one or more room stays). Which special requests belong to which part is determined by each object's SpecialRequestRPHs collection.
 * 
 * <p>Java class for SpecialRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialRequest" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ParagraphType"&gt;
 *                 &lt;attribute name="RequestCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
 *                 &lt;attribute name="CodeContext" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to32" /&gt;
 *                 &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "SpecialRequestType", propOrder = {
    "specialRequest"
})
public class SpecialRequestType {

    @XmlElement(name = "SpecialRequest", required = true)
    protected List<SpecialRequestType.SpecialRequest> specialRequest;

    /**
     * Gets the value of the specialRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRequestType.SpecialRequest }
     * 
     * 
     */
    public List<SpecialRequestType.SpecialRequest> getSpecialRequest() {
        if (specialRequest == null) {
            specialRequest = new ArrayList<SpecialRequestType.SpecialRequest>();
        }
        return this.specialRequest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ParagraphType"&gt;
     *       &lt;attribute name="RequestCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
     *       &lt;attribute name="CodeContext" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to32" /&gt;
     *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialRequest
        extends ParagraphType
    {

        @XmlAttribute(name = "RequestCode")
        protected String requestCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "NumberOfUnits")
        protected BigInteger numberOfUnits;

        /**
         * Gets the value of the requestCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestCode() {
            return requestCode;
        }

        /**
         * Sets the value of the requestCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestCode(String value) {
            this.requestCode = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * Gets the value of the numberOfUnits property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberOfUnits() {
            return numberOfUnits;
        }

        /**
         * Sets the value of the numberOfUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberOfUnits(BigInteger value) {
            this.numberOfUnits = value;
        }

    }

}
