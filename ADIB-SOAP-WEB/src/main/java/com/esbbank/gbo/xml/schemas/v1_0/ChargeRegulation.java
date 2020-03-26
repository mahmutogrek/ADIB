
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeRegulation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeRegulation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEN"/&gt;
 *     &lt;enumeration value="OUR"/&gt;
 *     &lt;enumeration value="SHA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeRegulation")
@XmlEnum
public enum ChargeRegulation {

    BEN,
    OUR,
    SHA;

    public String value() {
        return name();
    }

    public static ChargeRegulation fromValue(String v) {
        return valueOf(v);
    }

}
