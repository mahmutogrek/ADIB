
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementDetailType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Detail"/&gt;
 *     &lt;enumeration value="Summary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementDetailType")
@XmlEnum
public enum StatementDetailType {

    @XmlEnumValue("Detail")
    DETAIL("Detail"),
    @XmlEnumValue("Summary")
    SUMMARY("Summary");
    private final String value;

    StatementDetailType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatementDetailType fromValue(String v) {
        for (StatementDetailType c: StatementDetailType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
