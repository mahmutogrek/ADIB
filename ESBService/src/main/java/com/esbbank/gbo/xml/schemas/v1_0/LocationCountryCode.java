
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCountryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationCountryCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="QA"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="GB"/&gt;
 *     &lt;enumeration value="IQ"/&gt;
 *     &lt;enumeration value="EG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationCountryCode")
@XmlEnum
public enum LocationCountryCode {

    AE,
    QA,
    SD,
    GB,
    IQ,
    EG;

    public String value() {
        return name();
    }

    public static LocationCountryCode fromValue(String v) {
        return valueOf(v);
    }

}
