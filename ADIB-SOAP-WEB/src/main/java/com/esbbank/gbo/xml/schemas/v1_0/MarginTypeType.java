
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarginType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Points"/&gt;
 *     &lt;enumeration value="Percent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarginType_Type")
@XmlEnum
public enum MarginTypeType {

    @XmlEnumValue("Points")
    POINTS("Points"),
    @XmlEnumValue("Percent")
    PERCENT("Percent");
    private final String value;

    MarginTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarginTypeType fromValue(String v) {
        for (MarginTypeType c: MarginTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
