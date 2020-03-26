
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PHONE_HOME"/&gt;
 *     &lt;enumeration value="PHONE_MOBILE"/&gt;
 *     &lt;enumeration value="PHONE_WORK"/&gt;
 *     &lt;enumeration value="FAX"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="EMAIL_HOME"/&gt;
 *     &lt;enumeration value="EMAIL_WORK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactType")
@XmlEnum
public enum ContactType {

    PHONE_HOME,
    PHONE_MOBILE,
    PHONE_WORK,
    FAX,
    EMAIL,
    EMAIL_HOME,
    EMAIL_WORK;

    public String value() {
        return name();
    }

    public static ContactType fromValue(String v) {
        return valueOf(v);
    }

}
