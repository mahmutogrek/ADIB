
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *     &lt;enumeration value="FOUND"/&gt;
 *     &lt;enumeration value="INPROCESS"/&gt;
 *     &lt;enumeration value="NON_RESIDENT"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdStatusType")
@XmlEnum
public enum IdStatusType {

    NOT_FOUND,
    FOUND,
    INPROCESS,
    NON_RESIDENT,
    ERROR;

    public String value() {
        return name();
    }

    public static IdStatusType fromValue(String v) {
        return valueOf(v);
    }

}
