
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="INTERNAL_CHECK"/&gt;
 *     &lt;enumeration value="ACCOUNT_TRANSFER"/&gt;
 *     &lt;enumeration value="EXTERNAL_CHECK"/&gt;
 *     &lt;enumeration value="CREDIT_CARD"/&gt;
 *     &lt;enumeration value="ATM"/&gt;
 *     &lt;enumeration value="E_PAYMENT"/&gt;
 *     &lt;enumeration value="MOBILE_BANKING"/&gt;
 *     &lt;enumeration value="INTERNET_BANKING"/&gt;
 *     &lt;enumeration value="HOME_BANKING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMode")
@XmlEnum
public enum PaymentMode {

    CASH,
    INTERNAL_CHECK,
    ACCOUNT_TRANSFER,
    EXTERNAL_CHECK,
    CREDIT_CARD,
    ATM,
    E_PAYMENT,
    MOBILE_BANKING,
    INTERNET_BANKING,
    HOME_BANKING;

    public String value() {
        return name();
    }

    public static PaymentMode fromValue(String v) {
        return valueOf(v);
    }

}
