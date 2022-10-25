
package org.iata.iata._2007._00.iata2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Yes"/&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="Inherit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShareIndicator")
@XmlEnum
public enum ShareIndicator {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Inherit")
    INHERIT("Inherit");
    private final String value;

    ShareIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareIndicator fromValue(String v) {
        for (ShareIndicator c: ShareIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
