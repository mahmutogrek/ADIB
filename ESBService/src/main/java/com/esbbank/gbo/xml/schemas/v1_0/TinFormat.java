
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TinFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TinFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="20"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TinFormat")
@XmlEnum
public enum TinFormat {

    S,
    T;

    public String value() {
        return name();
    }

    public static TinFormat fromValue(String v) {
        return valueOf(v);
    }

}
