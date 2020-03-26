
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Day(s)"/&gt;
 *     &lt;enumeration value="Week(s)"/&gt;
 *     &lt;enumeration value="Month(s)"/&gt;
 *     &lt;enumeration value="Year(s)"/&gt;
 *     &lt;enumeration value="DOM 29"/&gt;
 *     &lt;enumeration value="DOM 30"/&gt;
 *     &lt;enumeration value="EOM(s)"/&gt;
 *     &lt;enumeration value="EOQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriodType")
@XmlEnum
public enum PeriodType {

    @XmlEnumValue("Day(s)")
    DAY_S("Day(s)"),
    @XmlEnumValue("Week(s)")
    WEEK_S("Week(s)"),
    @XmlEnumValue("Month(s)")
    MONTH_S("Month(s)"),
    @XmlEnumValue("Year(s)")
    YEAR_S("Year(s)"),
    @XmlEnumValue("DOM 29")
    DOM_29("DOM 29"),
    @XmlEnumValue("DOM 30")
    DOM_30("DOM 30"),
    @XmlEnumValue("EOM(s)")
    EOM_S("EOM(s)"),
    EOQ("EOQ");
    private final String value;

    PeriodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodType fromValue(String v) {
        for (PeriodType c: PeriodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
