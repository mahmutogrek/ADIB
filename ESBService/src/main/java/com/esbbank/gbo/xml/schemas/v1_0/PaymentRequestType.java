
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="voucherPaymentRequest" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}VoucherPaymentRequest"/&gt;
 *         &lt;element name="topUpPaymentRequest" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}TopUpPaymentRequest"/&gt;
 *         &lt;element name="postPaymentRequest" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PostPaymentRequest"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRequestType", propOrder = {
    "voucherPaymentRequest",
    "topUpPaymentRequest",
    "postPaymentRequest"
})
public class PaymentRequestType {

    protected VoucherPaymentRequest voucherPaymentRequest;
    protected TopUpPaymentRequest topUpPaymentRequest;
    protected PostPaymentRequest postPaymentRequest;

    /**
     * Gets the value of the voucherPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherPaymentRequest }
     *     
     */
    public VoucherPaymentRequest getVoucherPaymentRequest() {
        return voucherPaymentRequest;
    }

    /**
     * Sets the value of the voucherPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherPaymentRequest }
     *     
     */
    public void setVoucherPaymentRequest(VoucherPaymentRequest value) {
        this.voucherPaymentRequest = value;
    }

    /**
     * Gets the value of the topUpPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TopUpPaymentRequest }
     *     
     */
    public TopUpPaymentRequest getTopUpPaymentRequest() {
        return topUpPaymentRequest;
    }

    /**
     * Sets the value of the topUpPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopUpPaymentRequest }
     *     
     */
    public void setTopUpPaymentRequest(TopUpPaymentRequest value) {
        this.topUpPaymentRequest = value;
    }

    /**
     * Gets the value of the postPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PostPaymentRequest }
     *     
     */
    public PostPaymentRequest getPostPaymentRequest() {
        return postPaymentRequest;
    }

    /**
     * Sets the value of the postPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostPaymentRequest }
     *     
     */
    public void setPostPaymentRequest(PostPaymentRequest value) {
        this.postPaymentRequest = value;
    }

}
