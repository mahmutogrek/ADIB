
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Balance"/&gt;
 *     &lt;enumeration value="Withdraw"/&gt;
 *     &lt;enumeration value="Interest"/&gt;
 *     &lt;enumeration value="Reaccrual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PenaltyMethodType")
@XmlEnum
public enum PenaltyMethodType {

    @XmlEnumValue("Balance")
    BALANCE("Balance"),
    @XmlEnumValue("Withdraw")
    WITHDRAW("Withdraw"),
    @XmlEnumValue("Interest")
    INTEREST("Interest"),
    @XmlEnumValue("Reaccrual")
    REACCRUAL("Reaccrual");
    private final String value;

    PenaltyMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyMethodType fromValue(String v) {
        for (PenaltyMethodType c: PenaltyMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
