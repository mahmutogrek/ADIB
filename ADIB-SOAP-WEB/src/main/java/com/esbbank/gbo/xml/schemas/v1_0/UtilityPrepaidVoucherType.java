
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilityPrepaidVoucherType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UtilityPrepaidVoucherType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QTEL_HALA"/&gt;
 *     &lt;enumeration value="QTEL_EBHAR"/&gt;
 *     &lt;enumeration value="QTEL_DAWLI"/&gt;
 *     &lt;enumeration value="QTEL_QCARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UtilityPrepaidVoucherType")
@XmlEnum
public enum UtilityPrepaidVoucherType {

    QTEL_HALA,
    QTEL_EBHAR,
    QTEL_DAWLI,
    QTEL_QCARD;

    public String value() {
        return name();
    }

    public static UtilityPrepaidVoucherType fromValue(String v) {
        return valueOf(v);
    }

}
