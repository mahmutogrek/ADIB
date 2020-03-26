
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="CLOSED"/&gt;
 *     &lt;enumeration value="CONVERTED"/&gt;
 *     &lt;enumeration value="HOT"/&gt;
 *     &lt;enumeration value="INACTIVE"/&gt;
 *     &lt;enumeration value="LOST"/&gt;
 *     &lt;enumeration value="MAILER"/&gt;
 *     &lt;enumeration value="NEW"/&gt;
 *     &lt;enumeration value="STOLEN"/&gt;
 *     &lt;enumeration value="WARM"/&gt;
 *     &lt;enumeration value="EXPIRED"/&gt;
 *     &lt;enumeration value="REVOKED"/&gt;
 *     &lt;enumeration value="REISSUED"/&gt;
 *     &lt;enumeration value="EMBOSSER"/&gt;
 *     &lt;enumeration value="CHECKBRA"/&gt;
 *     &lt;enumeration value="FORCEPIN"/&gt;
 *     &lt;enumeration value="FREZ"/&gt;
 *     &lt;enumeration value="LOST-REPLACE"/&gt;
 *     &lt;enumeration value="REPLACE"/&gt;
 *     &lt;enumeration value="CONVERTEDCARD"/&gt;
 *     &lt;enumeration value="CONFIRMEDFRAUD"/&gt;
 *     &lt;enumeration value="SUSPECTEDFRAUD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardStatusType")
@XmlEnum
public enum CardStatusType {

    ACTIVE("ACTIVE"),
    CLOSED("CLOSED"),
    CONVERTED("CONVERTED"),
    HOT("HOT"),
    INACTIVE("INACTIVE"),
    LOST("LOST"),
    MAILER("MAILER"),
    NEW("NEW"),
    STOLEN("STOLEN"),
    WARM("WARM"),
    EXPIRED("EXPIRED"),
    REVOKED("REVOKED"),
    REISSUED("REISSUED"),
    EMBOSSER("EMBOSSER"),
    CHECKBRA("CHECKBRA"),
    FORCEPIN("FORCEPIN"),
    FREZ("FREZ"),
    @XmlEnumValue("LOST-REPLACE")
    LOST_REPLACE("LOST-REPLACE"),
    REPLACE("REPLACE"),
    CONVERTEDCARD("CONVERTEDCARD"),
    CONFIRMEDFRAUD("CONFIRMEDFRAUD"),
    SUSPECTEDFRAUD("SUSPECTEDFRAUD");
    private final String value;

    CardStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardStatusType fromValue(String v) {
        for (CardStatusType c: CardStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
