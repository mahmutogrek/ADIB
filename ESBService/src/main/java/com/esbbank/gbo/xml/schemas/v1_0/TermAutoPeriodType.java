
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermAutoPeriodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TermAutoPeriodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Day(s)"/&gt;
 *     &lt;enumeration value="DAYS_30"/&gt;
 *     &lt;enumeration value="DAYS_29"/&gt;
 *     &lt;enumeration value="Week(s)"/&gt;
 *     &lt;enumeration value="Month(s)"/&gt;
 *     &lt;enumeration value="END_MONTHS"/&gt;
 *     &lt;enumeration value="END_QUARTER"/&gt;
 *     &lt;enumeration value="Year(s)"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TermAutoPeriodType")
@XmlEnum
public enum TermAutoPeriodType {

    @XmlEnumValue("Day(s)")
    DAY_S("Day(s)"),
    DAYS_30("DAYS_30"),
    DAYS_29("DAYS_29"),
    @XmlEnumValue("Week(s)")
    WEEK_S("Week(s)"),
    @XmlEnumValue("Month(s)")
    MONTH_S("Month(s)"),
    END_MONTHS("END_MONTHS"),
    END_QUARTER("END_QUARTER"),
    @XmlEnumValue("Year(s)")
    YEAR_S("Year(s)");
    private final String value;

    TermAutoPeriodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TermAutoPeriodType fromValue(String v) {
        for (TermAutoPeriodType c: TermAutoPeriodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
