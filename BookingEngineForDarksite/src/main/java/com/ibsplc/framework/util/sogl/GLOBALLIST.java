package com.ibsplc.framework.util.sogl;
//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2014.05.12 at 12:38:47 PM IST 
//

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
* <p>Java class for anonymous complex type.
* 
* <p>The following schema fragment specifies the expected content contained within this class.
* 
* <pre>
* &lt;complexType>
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;sequence>
*         &lt;element ref="{}NAME"/>
*         &lt;element ref="{}LIST_ELEMENT" maxOccurs="unbounded"/>
*       &lt;/sequence>
*       &lt;attribute name="mode" use="required">
*         &lt;simpleType>
*           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
*             &lt;enumeration value="complete"/>
*             &lt;enumeration value="partial"/>
*           &lt;/restriction>
*         &lt;/simpleType>
*       &lt;/attribute>
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
* 
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
 "name",
 "listelement"
})
@XmlRootElement(name = "GLOBAL_LIST")
public class GLOBALLIST {

 @XmlElement(name = "NAME", required = true)
 protected String name;
 @XmlElement(name = "LIST_ELEMENT", required = true)
 protected List<LISTELEMENT> listelement;
 @XmlAttribute(required = true)
 protected String mode;

 /**
  * Gets the value of the name property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getNAME() {
     return name;
 }

 /**
  * Sets the value of the name property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setNAME(String value) {
     this.name = value;
 }

 /**
  * Gets the value of the listelement property.
  * 
  * <p>
  * This accessor method returns a reference to the live list,
  * not a snapshot. Therefore any modification you make to the
  * returned list will be present inside the JAXB object.
  * This is why there is not a <CODE>set</CODE> method for the listelement property.
  * 
  * <p>
  * For example, to add a new item, do as follows:
  * <pre>
  *    getLISTELEMENT().add(newItem);
  * </pre>
  * 
  * 
  * <p>
  * Objects of the following type(s) are allowed in the list
  * {@link LISTELEMENT }
  * 
  * 
  */
 public List<LISTELEMENT> getLISTELEMENT() {
     if (listelement == null) {
         listelement = new ArrayList<LISTELEMENT>();
     }
     return this.listelement;
 }

 /**
  * Gets the value of the mode property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getMode() {
     return mode;
 }

 /**
  * Sets the value of the mode property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setMode(String value) {
     this.mode = value;
 }

}
