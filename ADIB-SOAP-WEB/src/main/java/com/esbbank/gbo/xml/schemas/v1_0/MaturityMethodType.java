
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maturityMethod_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="maturityMethod_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Single"/&gt;
 *     &lt;enumeration value="Check"/&gt;
 *     &lt;enumeration value="Transfer"/&gt;
 *     &lt;enumeration value="AutoRenew"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "maturityMethod_Type")
@XmlEnum
public enum MaturityMethodType {

    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("AutoRenew")
    AUTO_RENEW("AutoRenew");
    private final String value;

    MaturityMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaturityMethodType fromValue(String v) {
        for (MaturityMethodType c: MaturityMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
