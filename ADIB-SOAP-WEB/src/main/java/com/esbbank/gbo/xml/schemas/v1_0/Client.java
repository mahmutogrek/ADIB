
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Client.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Client"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BARW"/&gt;
 *     &lt;enumeration value="ADIB"/&gt;
 *     &lt;enumeration value="BKR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Client")
@XmlEnum
public enum Client {

    BARW,
    ADIB,
    BKR;

    public String value() {
        return name();
    }

    public static Client fromValue(String v) {
        return valueOf(v);
    }

}
