
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsufChargeOptType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsufChargeOptType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OD"/&gt;
 *     &lt;enumeration value="NSF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InsufChargeOptType")
@XmlEnum
public enum InsufChargeOptType {

    OD,
    NSF;

    public String value() {
        return name();
    }

    public static InsufChargeOptType fromValue(String v) {
        return valueOf(v);
    }

}
