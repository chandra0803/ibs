
package org.iata.iata._2007._00.iata2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareAmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareAmountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="NOADC"/>
 *     &lt;enumeration value="Bulk"/>
 *     &lt;enumeration value="IT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareAmountType")
@XmlEnum
public enum FareAmountType {

    NOADC("NOADC"),
    @XmlEnumValue("Bulk")
    BULK("Bulk"),
    IT("IT");
    private final String value;

    FareAmountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareAmountType fromValue(String v) {
        for (FareAmountType c: FareAmountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
