
package com.amadeus.xml._2010._06.appmdw_commontypes_v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FTP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Filename" use="required" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}String_Length1To199" />
 *       &lt;attribute name="Path" use="required" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}String_Length1To199" />
 *       &lt;attribute name="FileHash" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}String_Length1To100" />
 *       &lt;attribute name="FTPID" type="{http://xml.amadeus.com/2010/06/AppMdw_CommonTypes_v3}String_Length1To25" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTP_Type")
@XmlSeeAlso({
    FTPTypeWithLayoutType.class
})
public class FTPType {

    @XmlAttribute(name = "Filename", required = true)
    protected String filename;
    @XmlAttribute(name = "Path", required = true)
    protected String path;
    @XmlAttribute(name = "FileHash")
    protected String fileHash;
    @XmlAttribute(name = "FTPID")
    protected String ftpid;

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the fileHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHash() {
        return fileHash;
    }

    /**
     * Sets the value of the fileHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHash(String value) {
        this.fileHash = value;
    }

    /**
     * Gets the value of the ftpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTPID() {
        return ftpid;
    }

    /**
     * Sets the value of the ftpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTPID(String value) {
        this.ftpid = value;
    }

}
