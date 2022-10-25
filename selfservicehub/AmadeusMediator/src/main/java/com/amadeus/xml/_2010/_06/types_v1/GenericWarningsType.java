
package com.amadeus.xml._2010._06.types_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of errors that occurred during the processing of a message.
 * 
 * <p>Java class for GenericWarningsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericWarningsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warnings" type="{http://xml.amadeus.com/2010/06/Types_v1}WarningsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}Warnings" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2007/00/IATA2010.1}Warnings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericWarningsType", propOrder = {
    "content"
})
public class GenericWarningsType {

    @XmlElementRefs({
        @XmlElementRef(name = "Warnings", namespace = "http://www.iata.org/IATA/2007/00/IATA2010.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Warnings", namespace = "http://xml.amadeus.com/2010/06/Types_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Warnings", namespace = "http://www.opentravel.org/OTA/2003/05/OTA2010B", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Warnings" is used by two different parts of a schema. See: 
     * line 141 of file:/D:/Shyam/Airlink-Files/WP8/1ASIWRIA4Z_PDT_20180612_074108/AMA/2011Y/AMA_CommonTypes_Proxy.xsd
     * line 140 of file:/D:/Shyam/Airlink-Files/WP8/1ASIWRIA4Z_PDT_20180612_074108/AMA/2011Y/AMA_CommonTypes_Proxy.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.amadeus.xml._2010._06.types_v1.WarningsType }{@code >}
     * {@link JAXBElement }{@code <}{@link org.iata.iata._2007._00.iata2010.WarningsType }{@code >}
     * {@link JAXBElement }{@code <}{@link org.opentravel.ota._2003._05.ota2010b.WarningsType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
