
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeatureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FROM_ACCOUNTS"/&gt;
 *     &lt;enumeration value="TO_ACCOUNTS"/&gt;
 *     &lt;enumeration value="LOAN_ACCOUNTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeatureType")
@XmlEnum
public enum FeatureType {

    FROM_ACCOUNTS,
    TO_ACCOUNTS,
    LOAN_ACCOUNTS;

    public String value() {
        return name();
    }

    public static FeatureType fromValue(String v) {
        return valueOf(v);
    }

}
