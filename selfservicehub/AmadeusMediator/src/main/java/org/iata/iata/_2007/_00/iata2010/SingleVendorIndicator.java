
package org.iata.iata._2007._00.iata2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleVendorIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SingleVendorIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="SingleVndr"/&gt;
 *     &lt;enumeration value="Alliance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SingleVendorIndicator")
@XmlEnum
public enum SingleVendorIndicator {

    @XmlEnumValue("SingleVndr")
    SINGLE_VNDR("SingleVndr"),
    @XmlEnumValue("Alliance")
    ALLIANCE("Alliance");
    private final String value;

    SingleVendorIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SingleVendorIndicator fromValue(String v) {
        for (SingleVendorIndicator c: SingleVendorIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
