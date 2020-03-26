
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilityAdhocPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityAdhocPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentRequestType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PaymentRequestType"/&gt;
 *         &lt;element name="payment" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Payment" minOccurs="0"/&gt;
 *         &lt;element name="serviceTypeID" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ServiceTypeID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityAdhocPayment", propOrder = {
    "paymentRequestType",
    "payment",
    "serviceTypeID"
})
public class UtilityAdhocPayment {

    @XmlElement(required = true)
    protected PaymentRequestType paymentRequestType;
    protected Payment payment;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceTypeID serviceTypeID;

    /**
     * Gets the value of the paymentRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequestType }
     *     
     */
    public PaymentRequestType getPaymentRequestType() {
        return paymentRequestType;
    }

    /**
     * Sets the value of the paymentRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequestType }
     *     
     */
    public void setPaymentRequestType(PaymentRequestType value) {
        this.paymentRequestType = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the serviceTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTypeID }
     *     
     */
    public ServiceTypeID getServiceTypeID() {
        return serviceTypeID;
    }

    /**
     * Sets the value of the serviceTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTypeID }
     *     
     */
    public void setServiceTypeID(ServiceTypeID value) {
        this.serviceTypeID = value;
    }

}
