
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermPeriodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TermPeriodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Day(s)"/&gt;
 *     &lt;enumeration value="Week(s)"/&gt;
 *     &lt;enumeration value="Month(s)"/&gt;
 *     &lt;enumeration value="Year(s)"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TermPeriodType")
@XmlEnum
public enum TermPeriodType {

    @XmlEnumValue("Day(s)")
    DAY_S("Day(s)"),
    @XmlEnumValue("Week(s)")
    WEEK_S("Week(s)"),
    @XmlEnumValue("Month(s)")
    MONTH_S("Month(s)"),
    @XmlEnumValue("Year(s)")
    YEAR_S("Year(s)");
    private final String value;

    TermPeriodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TermPeriodType fromValue(String v) {
        for (TermPeriodType c: TermPeriodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
