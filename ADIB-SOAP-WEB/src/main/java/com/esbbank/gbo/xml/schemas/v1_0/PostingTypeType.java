
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostingTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEBIT"/&gt;
 *     &lt;enumeration value="CREDIT"/&gt;
 *     &lt;enumeration value="DEBITCREDIT"/&gt;
 *     &lt;enumeration value="CREDITDEBIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PostingTypeType")
@XmlEnum
public enum PostingTypeType {

    DEBIT,
    CREDIT,
    DEBITCREDIT,
    CREDITDEBIT;

    public String value() {
        return name();
    }

    public static PostingTypeType fromValue(String v) {
        return valueOf(v);
    }

}
