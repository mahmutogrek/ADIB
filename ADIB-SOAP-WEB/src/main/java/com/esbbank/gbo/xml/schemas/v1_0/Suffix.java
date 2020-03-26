
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Suffix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Suffix"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Jr"/&gt;
 *     &lt;enumeration value="Sr"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="II"/&gt;
 *     &lt;enumeration value="IV"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Suffix")
@XmlEnum
public enum Suffix {

    @XmlEnumValue("Jr")
    JR("Jr"),
    @XmlEnumValue("Sr")
    SR("Sr"),
    I("I"),
    II("II"),
    IV("IV"),
    V("V");
    private final String value;

    Suffix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Suffix fromValue(String v) {
        for (Suffix c: Suffix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
