
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="classCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STA"/&gt;
 *     &lt;enumeration value="CMP"/&gt;
 *     &lt;enumeration value="COR"/&gt;
 *     &lt;enumeration value="JNT"/&gt;
 *     &lt;enumeration value="IND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "classCodeType")
@XmlEnum
public enum ClassCodeType {

    STA,
    CMP,
    COR,
    JNT,
    IND;

    public String value() {
        return name();
    }

    public static ClassCodeType fromValue(String v) {
        return valueOf(v);
    }

}
