
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxPeriod_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxPeriod_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Interest Payment"/&gt;
 *     &lt;enumeration value="Renewal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxPeriod_Type")
@XmlEnum
public enum TaxPeriodType {

    @XmlEnumValue("Interest Payment")
    INTEREST_PAYMENT("Interest Payment"),
    @XmlEnumValue("Renewal")
    RENEWAL("Renewal");
    private final String value;

    TaxPeriodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxPeriodType fromValue(String v) {
        for (TaxPeriodType c: TaxPeriodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
