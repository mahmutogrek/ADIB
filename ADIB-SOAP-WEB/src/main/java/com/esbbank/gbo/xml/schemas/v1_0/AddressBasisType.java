
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressBasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressBasisType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Recurring"/&gt;
 *     &lt;enumeration value="NonRecurring"/&gt;
 *     &lt;enumeration value="Permanent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressBasisType")
@XmlEnum
public enum AddressBasisType {

    @XmlEnumValue("Recurring")
    RECURRING("Recurring"),
    @XmlEnumValue("NonRecurring")
    NON_RECURRING("NonRecurring"),
    @XmlEnumValue("Permanent")
    PERMANENT("Permanent");
    private final String value;

    AddressBasisType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressBasisType fromValue(String v) {
        for (AddressBasisType c: AddressBasisType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
