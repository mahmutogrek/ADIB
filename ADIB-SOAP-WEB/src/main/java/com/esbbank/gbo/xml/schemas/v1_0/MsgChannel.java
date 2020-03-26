
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgChannel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MsgChannel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MQ"/&gt;
 *     &lt;enumeration value="HTTP"/&gt;
 *     &lt;enumeration value="WS"/&gt;
 *     &lt;enumeration value="TCIP"/&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="BKR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MsgChannel")
@XmlEnum
public enum MsgChannel {

    MQ,
    HTTP,
    WS,
    TCIP,
    FILE,
    BKR;

    public String value() {
        return name();
    }

    public static MsgChannel fromValue(String v) {
        return valueOf(v);
    }

}
