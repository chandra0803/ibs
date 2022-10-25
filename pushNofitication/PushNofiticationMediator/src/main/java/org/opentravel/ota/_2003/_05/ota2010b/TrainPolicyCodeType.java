
package org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrainPolicyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrainPolicyCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Minimum"/>
 *     &lt;enumeration value="Maximum"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrainPolicyCodeType")
@XmlEnum
public enum TrainPolicyCodeType {

    @XmlEnumValue("Minimum")
    MINIMUM("Minimum"),
    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum");
    private final String value;

    TrainPolicyCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrainPolicyCodeType fromValue(String v) {
        for (TrainPolicyCodeType c: TrainPolicyCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
