
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBenCodeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeBenCodeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="receiptChargeAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount"/&gt;
 *         &lt;element name="chargeGlAccount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeBenCodeDetail", propOrder = {
    "receiptChargeAmount",
    "chargeGlAccount",
    "rate",
    "desc"
})
public class ChargeBenCodeDetail {

    @XmlElement(required = true)
    protected BigDecimal receiptChargeAmount;
    @XmlElement(required = true)
    protected String chargeGlAccount;
    @XmlElement(name = "Rate")
    protected float rate;
    protected String desc;

    /**
     * Gets the value of the receiptChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceiptChargeAmount() {
        return receiptChargeAmount;
    }

    /**
     * Sets the value of the receiptChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceiptChargeAmount(BigDecimal value) {
        this.receiptChargeAmount = value;
    }

    /**
     * Gets the value of the chargeGlAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeGlAccount() {
        return chargeGlAccount;
    }

    /**
     * Sets the value of the chargeGlAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeGlAccount(String value) {
        this.chargeGlAccount = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     */
    public float getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     */
    public void setRate(float value) {
        this.rate = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
