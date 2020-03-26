
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementPrintType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementPrintType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Long"/&gt;
 *     &lt;enumeration value="Short"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementPrintType")
@XmlEnum
public enum StatementPrintType {

    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Short")
    SHORT("Short");
    private final String value;

    StatementPrintType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatementPrintType fromValue(String v) {
        for (StatementPrintType c: StatementPrintType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
