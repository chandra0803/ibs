
package com.amadeus.xml._2010._06.appmdw_commontypes_v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FTP_TypeWithLayoutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTP_TypeWithLayoutType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}FTP_Type">
 *       &lt;attribute name="LayoutType" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}String_Length1To5" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTP_TypeWithLayoutType")
public class FTPTypeWithLayoutType
    extends FTPType
{

    @XmlAttribute(name = "LayoutType")
    protected String layoutType;

    /**
     * Gets the value of the layoutType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutType() {
        return layoutType;
    }

    /**
     * Sets the value of the layoutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutType(String value) {
        this.layoutType = value;
    }

}
