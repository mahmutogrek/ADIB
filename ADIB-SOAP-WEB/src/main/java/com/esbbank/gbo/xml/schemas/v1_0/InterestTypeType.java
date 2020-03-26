
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Simple"/&gt;
 *     &lt;enumeration value="Compounded"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterestType_Type")
@XmlEnum
public enum InterestTypeType {

    @XmlEnumValue("Simple")
    SIMPLE("Simple"),
    @XmlEnumValue("Compounded")
    COMPOUNDED("Compounded");
    private final String value;

    InterestTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestTypeType fromValue(String v) {
        for (InterestTypeType c: InterestTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
