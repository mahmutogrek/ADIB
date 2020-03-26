
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerType2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="NonPersonal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerType2")
@XmlEnum
public enum CustomerType2 {

    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("NonPersonal")
    NON_PERSONAL("NonPersonal");
    private final String value;

    CustomerType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerType2 fromValue(String v) {
        for (CustomerType2 c: CustomerType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
