
package org.opentravel.ota._2003._05.ota2010b;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of comments.
 * 
 * <p>Java class for CommentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ParagraphType"&gt;
 *                 &lt;attribute name="CommentOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
 *                 &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "CommentType", propOrder = {
    "comment"
})
public class CommentType {

    @XmlElement(name = "Comment", required = true)
    protected List<CommentType.Comment> comment;

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType.Comment }
     * 
     * 
     */
    public List<CommentType.Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType.Comment>();
        }
        return this.comment;
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
     *       &lt;attribute name="CommentOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to16" /&gt;
     *       &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Comment
        extends ParagraphType
    {

        @XmlAttribute(name = "CommentOriginatorCode")
        protected String commentOriginatorCode;
        @XmlAttribute(name = "GuestViewable")
        protected Boolean guestViewable;

        /**
         * Gets the value of the commentOriginatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommentOriginatorCode() {
            return commentOriginatorCode;
        }

        /**
         * Sets the value of the commentOriginatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommentOriginatorCode(String value) {
            this.commentOriginatorCode = value;
        }

        /**
         * Gets the value of the guestViewable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuestViewable() {
            return guestViewable;
        }

        /**
         * Sets the value of the guestViewable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuestViewable(Boolean value) {
            this.guestViewable = value;
        }

    }

}
