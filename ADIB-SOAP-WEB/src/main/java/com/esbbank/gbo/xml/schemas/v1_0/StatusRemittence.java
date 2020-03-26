
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRemittence.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusRemittence"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="EXPIRED"/&gt;
 *     &lt;enumeration value="CANCEL"/&gt;
 *     &lt;enumeration value="DISPENSED"/&gt;
 *     &lt;enumeration value="TRY_EXCEEDED"/&gt;
 *     &lt;enumeration value="ERROR_WHILE_DISPNSING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusRemittence")
@XmlEnum
public enum StatusRemittence {

    ACTIVE,
    EXPIRED,
    CANCEL,
    DISPENSED,
    TRY_EXCEEDED,
    ERROR_WHILE_DISPNSING;

    public String value() {
        return name();
    }

    public static StatusRemittence fromValue(String v) {
        return valueOf(v);
    }

}
