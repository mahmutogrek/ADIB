
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitCardType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DebitCardType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Ethihad"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DebitCardType1")
@XmlEnum
public enum DebitCardType1 {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Ethihad")
    ETHIHAD("Ethihad");
    private final String value;

    DebitCardType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DebitCardType1 fromValue(String v) {
        for (DebitCardType1 c: DebitCardType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
