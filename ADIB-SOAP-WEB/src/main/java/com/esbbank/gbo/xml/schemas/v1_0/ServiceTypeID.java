
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceTypeID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceTypeID"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILL_INQUIRY"/&gt;
 *     &lt;enumeration value="POST_PAID_PAYMENT"/&gt;
 *     &lt;enumeration value="GET_VOUCHER"/&gt;
 *     &lt;enumeration value="TOP_UP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceTypeID")
@XmlEnum
public enum ServiceTypeID {

    BILL_INQUIRY,
    POST_PAID_PAYMENT,
    GET_VOUCHER,
    TOP_UP;

    public String value() {
        return name();
    }

    public static ServiceTypeID fromValue(String v) {
        return valueOf(v);
    }

}
