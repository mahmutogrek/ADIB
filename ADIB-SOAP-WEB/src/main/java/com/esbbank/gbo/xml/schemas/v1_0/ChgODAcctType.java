
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chg_OD_Acct_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Chg_OD_Acct_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Charge"/&gt;
 *     &lt;enumeration value="Overdraw"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Chg_OD_Acct_Type")
@XmlEnum
public enum ChgODAcctType {

    @XmlEnumValue("Charge")
    CHARGE("Charge"),
    @XmlEnumValue("Overdraw")
    OVERDRAW("Overdraw");
    private final String value;

    ChgODAcctType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChgODAcctType fromValue(String v) {
        for (ChgODAcctType c: ChgODAcctType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
