
package com.esbbank.gbo.xml.schemas.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentReplyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReplyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="prepaidVoucher" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PaymentVoucherReply" maxOccurs="unbounded"/&gt;
 *         &lt;element name="topUpPaymentReply" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}TopUpPaymentReply"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReplyType", propOrder = {
    "prepaidVoucher",
    "topUpPaymentReply"
})
public class PaymentReplyType {

    protected List<PaymentVoucherReply> prepaidVoucher;
    protected TopUpPaymentReply topUpPaymentReply;

    /**
     * Gets the value of the prepaidVoucher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prepaidVoucher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrepaidVoucher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentVoucherReply }
     * 
     * 
     */
    public List<PaymentVoucherReply> getPrepaidVoucher() {
        if (prepaidVoucher == null) {
            prepaidVoucher = new ArrayList<PaymentVoucherReply>();
        }
        return this.prepaidVoucher;
    }

    /**
     * Gets the value of the topUpPaymentReply property.
     * 
     * @return
     *     possible object is
     *     {@link TopUpPaymentReply }
     *     
     */
    public TopUpPaymentReply getTopUpPaymentReply() {
        return topUpPaymentReply;
    }

    /**
     * Sets the value of the topUpPaymentReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopUpPaymentReply }
     *     
     */
    public void setTopUpPaymentReply(TopUpPaymentReply value) {
        this.topUpPaymentReply = value;
    }

}
