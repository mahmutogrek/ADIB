
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountCatagoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountCatagoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="LDR"/&gt;
 *     &lt;enumeration value="LCR"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountCatagoryType")
@XmlEnum
public enum AccountCatagoryType {

    D,
    L,
    C,
    S,
    F,
    E,
    G,
    LDR,
    LCR,
    LS,
    AM,
    O;

    public String value() {
        return name();
    }

    public static AccountCatagoryType fromValue(String v) {
        return valueOf(v);
    }

}
