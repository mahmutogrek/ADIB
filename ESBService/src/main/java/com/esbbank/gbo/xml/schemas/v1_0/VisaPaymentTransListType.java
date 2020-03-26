
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaPaymentTransListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaPaymentTransListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="visaPaymentTransaction" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}VisaPaymentTransType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaPaymentTransListType", propOrder = {
    "visaPaymentTransaction"
})
public class VisaPaymentTransListType {

    @XmlElement(required = true)
    protected VisaPaymentTransType visaPaymentTransaction;

    /**
     * Gets the value of the visaPaymentTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link VisaPaymentTransType }
     *     
     */
    public VisaPaymentTransType getVisaPaymentTransaction() {
        return visaPaymentTransaction;
    }

    /**
     * Sets the value of the visaPaymentTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaPaymentTransType }
     *     
     */
    public void setVisaPaymentTransaction(VisaPaymentTransType value) {
        this.visaPaymentTransaction = value;
    }

}
