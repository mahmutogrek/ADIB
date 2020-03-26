
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Regulation_DD_Code_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Regulation_DD_Code_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="NonPersonal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Regulation_DD_Code_Type")
@XmlEnum
public enum RegulationDDCodeType {

    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("NonPersonal")
    NON_PERSONAL("NonPersonal");
    private final String value;

    RegulationDDCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegulationDDCodeType fromValue(String v) {
        for (RegulationDDCodeType c: RegulationDDCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
