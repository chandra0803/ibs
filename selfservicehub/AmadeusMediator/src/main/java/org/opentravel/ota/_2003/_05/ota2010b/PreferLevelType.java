
package org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Only"/&gt;
 *     &lt;enumeration value="Unacceptable"/&gt;
 *     &lt;enumeration value="Preferred"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="NoPreference"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PreferLevelType")
@XmlEnum
public enum PreferLevelType {


    /**
     * Preference level that indicates request is only for a specific criterion.
     * 
     */
    @XmlEnumValue("Only")
    ONLY("Only"),

    /**
     * Preference level that indicates request is unnacceptable for a specific criterion.
     * 
     */
    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable"),

    /**
     * Preference level that indicates request is preferred for a specific criterion.
     * 
     */
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),

    /**
     * Preference level that indicates request is required for a specific criterion.
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * Preference level that indicates there is no preference.
     * 
     */
    @XmlEnumValue("NoPreference")
    NO_PREFERENCE("NoPreference");
    private final String value;

    PreferLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreferLevelType fromValue(String v) {
        for (PreferLevelType c: PreferLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
