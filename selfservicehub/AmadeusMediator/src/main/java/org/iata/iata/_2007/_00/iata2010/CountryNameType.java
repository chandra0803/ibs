
package org.iata.iata._2007._00.iata2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The name or code of a country (e.g. as used in an address or to specify citizenship of a traveller).
 * 
 * <p>Java class for CountryNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryNameType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iata.org/IATA/2007/00/IATA2010.1&gt;StringLength0to64"&gt;
 *       &lt;attribute name="Code" type="{http://www.iata.org/IATA/2007/00/IATA2010.1}ISO3166" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryNameType", propOrder = {
    "value"
})
public class CountryNameType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Code")
    protected String code;

    /**
     * Used for Character Strings, length 0 to 64
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
