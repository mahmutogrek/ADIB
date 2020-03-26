
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAKEITHOT"/&gt;
 *     &lt;enumeration value="MAKEACTIVECARDWARM"/&gt;
 *     &lt;enumeration value="MAKEAWARMCARDACTIVE"/&gt;
 *     &lt;enumeration value="MAKEINACTIVECARDNEW"/&gt;
 *     &lt;enumeration value="MAKEACTIVECARDCLOSE"/&gt;
 *     &lt;enumeration value="MAKEACTIVE"/&gt;
 *     &lt;enumeration value="MAKENORM"/&gt;
 *     &lt;enumeration value="MAKEDEACTIVE"/&gt;
 *     &lt;enumeration value="UPDATESTATUS"/&gt;
 *     &lt;enumeration value="MAKEITHOTBASEDONACCOUNT"/&gt;
 *     &lt;enumeration value="MAKECARDREPLACE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardActionType")
@XmlEnum
public enum CardActionType {

    MAKEITHOT,
    MAKEACTIVECARDWARM,
    MAKEAWARMCARDACTIVE,
    MAKEINACTIVECARDNEW,
    MAKEACTIVECARDCLOSE,
    MAKEACTIVE,
    MAKENORM,
    MAKEDEACTIVE,
    UPDATESTATUS,
    MAKEITHOTBASEDONACCOUNT,
    MAKECARDREPLACE;

    public String value() {
        return name();
    }

    public static CardActionType fromValue(String v) {
        return valueOf(v);
    }

}
