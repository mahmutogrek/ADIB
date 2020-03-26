
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherPaymentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherPaymentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="voucherQuantity" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="utilityPrepaidVoucherType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityPrepaidVoucherType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherPaymentRequest", propOrder = {
    "voucherQuantity",
    "utilityPrepaidVoucherType"
})
public class VoucherPaymentRequest {

    protected short voucherQuantity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UtilityPrepaidVoucherType utilityPrepaidVoucherType;

    /**
     * Gets the value of the voucherQuantity property.
     * 
     */
    public short getVoucherQuantity() {
        return voucherQuantity;
    }

    /**
     * Sets the value of the voucherQuantity property.
     * 
     */
    public void setVoucherQuantity(short value) {
        this.voucherQuantity = value;
    }

    /**
     * Gets the value of the utilityPrepaidVoucherType property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityPrepaidVoucherType }
     *     
     */
    public UtilityPrepaidVoucherType getUtilityPrepaidVoucherType() {
        return utilityPrepaidVoucherType;
    }

    /**
     * Sets the value of the utilityPrepaidVoucherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityPrepaidVoucherType }
     *     
     */
    public void setUtilityPrepaidVoucherType(UtilityPrepaidVoucherType value) {
        this.utilityPrepaidVoucherType = value;
    }

}
