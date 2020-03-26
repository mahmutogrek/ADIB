
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyRateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Current"/&gt;
 *     &lt;enumeration value="Original"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PenaltyRateType")
@XmlEnum
public enum PenaltyRateType {

    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Original")
    ORIGINAL("Original");
    private final String value;

    PenaltyRateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyRateType fromValue(String v) {
        for (PenaltyRateType c: PenaltyRateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
