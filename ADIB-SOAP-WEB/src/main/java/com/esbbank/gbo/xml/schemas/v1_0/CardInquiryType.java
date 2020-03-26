
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardInquiryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardInquiryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GETBAlANCE"/&gt;
 *     &lt;enumeration value="GETCARDSUMARRYBYCUSTOMERID"/&gt;
 *     &lt;enumeration value="GETCARDSUMARRYBYCARD"/&gt;
 *     &lt;enumeration value="GETCARDSUMARRYBYACCOUNT"/&gt;
 *     &lt;enumeration value="GETCARDDETAIL"/&gt;
 *     &lt;enumeration value="GETCARDINFO"/&gt;
 *     &lt;enumeration value="GETSTATEMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardInquiryType")
@XmlEnum
public enum CardInquiryType {

    @XmlEnumValue("GETBAlANCE")
    GETB_AL_ANCE("GETBAlANCE"),
    GETCARDSUMARRYBYCUSTOMERID("GETCARDSUMARRYBYCUSTOMERID"),
    GETCARDSUMARRYBYCARD("GETCARDSUMARRYBYCARD"),
    GETCARDSUMARRYBYACCOUNT("GETCARDSUMARRYBYACCOUNT"),
    GETCARDDETAIL("GETCARDDETAIL"),
    GETCARDINFO("GETCARDINFO"),
    GETSTATEMENT("GETSTATEMENT");
    private final String value;

    CardInquiryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardInquiryType fromValue(String v) {
        for (CardInquiryType c: CardInquiryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
