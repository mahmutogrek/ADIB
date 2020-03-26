
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAYMENT_FROM_CARD_TO_ACCOUNT"/&gt;
 *     &lt;enumeration value="PAYMENT_FROM_ACCOUNT_TO_CARD"/&gt;
 *     &lt;enumeration value="PAYMENT_FROM_ACCOUNT_TO_PREPAID_CARD"/&gt;
 *     &lt;enumeration value="PAYMENT_FROM_CASH_TO_CARD"/&gt;
 *     &lt;enumeration value="PAYMENT_FROM_CHECK_TO_CARD"/&gt;
 *     &lt;enumeration value="PAYMENT_FROM_CARD_TO_UTILITY"/&gt;
 *     &lt;enumeration value="PAYMENT_FROM_ACCOUNT_TO_CARDACCOUNT"/&gt;
 *     &lt;enumeration value="DEBIT_CREDIT_ACCOUNT_ADJUSTMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentType")
@XmlEnum
public enum CardPaymentType {

    PAYMENT_FROM_CARD_TO_ACCOUNT,
    PAYMENT_FROM_ACCOUNT_TO_CARD,
    PAYMENT_FROM_ACCOUNT_TO_PREPAID_CARD,
    PAYMENT_FROM_CASH_TO_CARD,
    PAYMENT_FROM_CHECK_TO_CARD,
    PAYMENT_FROM_CARD_TO_UTILITY,
    PAYMENT_FROM_ACCOUNT_TO_CARDACCOUNT,
    DEBIT_CREDIT_ACCOUNT_ADJUSTMENT;

    public String value() {
        return name();
    }

    public static CardPaymentType fromValue(String v) {
        return valueOf(v);
    }

}
