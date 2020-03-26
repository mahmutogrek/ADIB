
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPaymentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="utilityBeneficiaryPayment" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityBeneficiaryPayment"/&gt;
 *         &lt;element name="utilityAdhocPayment" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityAdhocPayment"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPaymentRequestType", propOrder = {
    "utilityBeneficiaryPayment",
    "utilityAdhocPayment"
})
public class BillPaymentRequestType {

    protected UtilityBeneficiaryPayment utilityBeneficiaryPayment;
    protected UtilityAdhocPayment utilityAdhocPayment;

    /**
     * Gets the value of the utilityBeneficiaryPayment property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityBeneficiaryPayment }
     *     
     */
    public UtilityBeneficiaryPayment getUtilityBeneficiaryPayment() {
        return utilityBeneficiaryPayment;
    }

    /**
     * Sets the value of the utilityBeneficiaryPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityBeneficiaryPayment }
     *     
     */
    public void setUtilityBeneficiaryPayment(UtilityBeneficiaryPayment value) {
        this.utilityBeneficiaryPayment = value;
    }

    /**
     * Gets the value of the utilityAdhocPayment property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityAdhocPayment }
     *     
     */
    public UtilityAdhocPayment getUtilityAdhocPayment() {
        return utilityAdhocPayment;
    }

    /**
     * Sets the value of the utilityAdhocPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityAdhocPayment }
     *     
     */
    public void setUtilityAdhocPayment(UtilityAdhocPayment value) {
        this.utilityAdhocPayment = value;
    }

}
