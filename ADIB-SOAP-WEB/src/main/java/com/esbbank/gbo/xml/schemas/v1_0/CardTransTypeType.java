
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTransTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardTransTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEBIT_ADJUSTMENT"/&gt;
 *     &lt;enumeration value="CREDIT_ADJUSTMENT"/&gt;
 *     &lt;enumeration value="REDEMPSION"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="PAYMENT"/&gt;
 *     &lt;enumeration value="PAYMENT_REVERSE"/&gt;
 *     &lt;enumeration value="FEE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardTransTypeType")
@XmlEnum
public enum CardTransTypeType {

    DEBIT_ADJUSTMENT,
    CREDIT_ADJUSTMENT,
    REDEMPSION,
    TEXT,
    PAYMENT,
    PAYMENT_REVERSE,
    FEE;

    public String value() {
        return name();
    }

    public static CardTransTypeType fromValue(String v) {
        return valueOf(v);
    }

}
