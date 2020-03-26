
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Calculated_Balance_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Calculated_Balance_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Current"/&gt;
 *     &lt;enumeration value="Collected"/&gt;
 *     &lt;enumeration value="Avg Current"/&gt;
 *     &lt;enumeration value="Avg Collected"/&gt;
 *     &lt;enumeration value="Min Current"/&gt;
 *     &lt;enumeration value="Min Collected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Calculated_Balance_Type")
@XmlEnum
public enum CalculatedBalanceType {

    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Collected")
    COLLECTED("Collected"),
    @XmlEnumValue("Avg Current")
    AVG_CURRENT("Avg Current"),
    @XmlEnumValue("Avg Collected")
    AVG_COLLECTED("Avg Collected"),
    @XmlEnumValue("Min Current")
    MIN_CURRENT("Min Current"),
    @XmlEnumValue("Min Collected")
    MIN_COLLECTED("Min Collected");
    private final String value;

    CalculatedBalanceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculatedBalanceType fromValue(String v) {
        for (CalculatedBalanceType c: CalculatedBalanceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
