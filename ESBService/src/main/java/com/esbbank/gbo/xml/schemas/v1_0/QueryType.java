
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="50"/&gt;
 *     &lt;enumeration value="CHECK_ALLOWED"/&gt;
 *     &lt;enumeration value="ACCOUNT_FEATURE_BY_RIM"/&gt;
 *     &lt;enumeration value="ACCOUNT_INFO"/&gt;
 *     &lt;enumeration value="ACCOUNT_COUPONS"/&gt;
 *     &lt;enumeration value="BONUS_COUPONS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryType")
@XmlEnum
public enum QueryType {

    CHECK_ALLOWED,
    ACCOUNT_FEATURE_BY_RIM,
    ACCOUNT_INFO,
    ACCOUNT_COUPONS,
    BONUS_COUPONS;

    public String value() {
        return name();
    }

    public static QueryType fromValue(String v) {
        return valueOf(v);
    }

}
