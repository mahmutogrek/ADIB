
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChargeCodeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeCodeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chargeDebitAcct" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *         &lt;element name="chargeAcct" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber"/&gt;
 *         &lt;element name="chargeAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="chargeCurrencyCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="chargeValueDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="chargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCodeDetail", propOrder = {
    "chargeDebitAcct",
    "chargeAcct",
    "chargeAmount",
    "chargeCurrencyCode",
    "chargeValueDate",
    "chargeCode",
    "desc"
})
public class ChargeCodeDetail {

    protected String chargeDebitAcct;
    @XmlElement(required = true)
    protected String chargeAcct;
    protected BigDecimal chargeAmount;
    protected String chargeCurrencyCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chargeValueDate;
    protected String chargeCode;
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
     * Gets the value of the chargeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAcct() {
        return chargeAcct;
    }

    /**
     * Sets the value of the chargeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAcct(String value) {
        this.chargeAcct = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeAmount(BigDecimal value) {
        this.chargeAmount = value;
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
     * Gets the value of the chargeValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargeValueDate() {
        return chargeValueDate;
    }

    /**
     * Sets the value of the chargeValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargeValueDate(XMLGregorianCalendar value) {
        this.chargeValueDate = value;
    }

    /**
     * Gets the value of the chargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Sets the value of the chargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCode(String value) {
        this.chargeCode = value;
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
