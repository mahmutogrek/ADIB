
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeOursCodeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeOursCodeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chargeDebitAcct" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *         &lt;element name="chargeCurrencyCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="chargeGLAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount"/&gt;
 *         &lt;element name="chargeGlAccount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber"/&gt;
 *         &lt;element name="chargeGlAccountPostStatus" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN" minOccurs="0"/&gt;
 *         &lt;element name="chargeCorespondenceGLAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="chargeCorespondenceGlAccount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "ChargeOursCodeDetail", propOrder = {
    "chargeDebitAcct",
    "chargeCurrencyCode",
    "chargeGLAmount",
    "chargeGlAccount",
    "chargeGlAccountPostStatus",
    "chargeCorespondenceGLAmount",
    "chargeCorespondenceGlAccount",
    "rate",
    "desc"
})
public class ChargeOursCodeDetail {

    protected String chargeDebitAcct;
    protected String chargeCurrencyCode;
    @XmlElement(required = true)
    protected BigDecimal chargeGLAmount;
    @XmlElement(required = true)
    protected String chargeGlAccount;
    @XmlSchemaType(name = "string")
    protected YorN chargeGlAccountPostStatus;
    protected BigDecimal chargeCorespondenceGLAmount;
    protected String chargeCorespondenceGlAccount;
    @XmlElement(name = "Rate")
    protected Float rate;
    protected String desc;

    /**
     * Gets the value of the chargeDebitAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeDebitAcct() {
        return chargeDebitAcct;
    }

    /**
     * Sets the value of the chargeDebitAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeDebitAcct(String value) {
        this.chargeDebitAcct = value;
    }

    /**
     * Gets the value of the chargeCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCurrencyCode() {
        return chargeCurrencyCode;
    }

    /**
     * Sets the value of the chargeCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCurrencyCode(String value) {
        this.chargeCurrencyCode = value;
    }

    /**
     * Gets the value of the chargeGLAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeGLAmount() {
        return chargeGLAmount;
    }

    /**
     * Sets the value of the chargeGLAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeGLAmount(BigDecimal value) {
        this.chargeGLAmount = value;
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
     * Gets the value of the chargeGlAccountPostStatus property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getChargeGlAccountPostStatus() {
        return chargeGlAccountPostStatus;
    }

    /**
     * Sets the value of the chargeGlAccountPostStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setChargeGlAccountPostStatus(YorN value) {
        this.chargeGlAccountPostStatus = value;
    }

    /**
     * Gets the value of the chargeCorespondenceGLAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeCorespondenceGLAmount() {
        return chargeCorespondenceGLAmount;
    }

    /**
     * Sets the value of the chargeCorespondenceGLAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeCorespondenceGLAmount(BigDecimal value) {
        this.chargeCorespondenceGLAmount = value;
    }

    /**
     * Gets the value of the chargeCorespondenceGlAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCorespondenceGlAccount() {
        return chargeCorespondenceGlAccount;
    }

    /**
     * Sets the value of the chargeCorespondenceGlAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCorespondenceGlAccount(String value) {
        this.chargeCorespondenceGlAccount = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRate(Float value) {
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
