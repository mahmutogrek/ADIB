
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeRateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRANSFER_RATE"/&gt;
 *     &lt;enumeration value="CASH_RATE"/&gt;
 *     &lt;enumeration value="MID_RATE"/&gt;
 *     &lt;enumeration value="TRANSFER_MID_RATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeRateType")
@XmlEnum
public enum ExchangeRateType {

    TRANSFER_RATE,
    CASH_RATE,
    MID_RATE,
    TRANSFER_MID_RATE;

    public String value() {
        return name();
    }

    public static ExchangeRateType fromValue(String v) {
        return valueOf(v);
    }

}
