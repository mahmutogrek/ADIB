
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber"/&gt;
 *         &lt;element name="acctType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="acctSubType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctSubType" minOccurs="0"/&gt;
 *         &lt;element name="acctCatagory" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AccountCatagory" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="acctStatus" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctStatus" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount"/&gt;
 *         &lt;element name="localCurrencyAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="acctKey" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="availableBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="currentBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="reserveBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="bankCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}BankCode" minOccurs="0"/&gt;
 *         &lt;element name="branchCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}BranchCode" minOccurs="0"/&gt;
 *         &lt;element name="valueDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Description" minOccurs="0"/&gt;
 *         &lt;element name="force" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Flag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetail", propOrder = {
    "acctNumber",
    "acctType",
    "acctSubType",
    "acctCatagory",
    "currencyCode",
    "acctStatus",
    "amount",
    "localCurrencyAmount",
    "acctKey",
    "availableBalance",
    "currentBalance",
    "reserveBalance",
    "bankCode",
    "branchCode",
    "valueDate",
    "desc",
    "force"
})
public class AccountDetail {

    @XmlElement(required = true)
    protected String acctNumber;
    protected String acctType;
    protected String acctSubType;
    @XmlSchemaType(name = "string")
    protected AccountCatagory acctCatagory;
    protected String currencyCode;
    protected String acctStatus;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected BigDecimal localCurrencyAmount;
    protected BigInteger acctKey;
    protected BigDecimal availableBalance;
    protected BigDecimal currentBalance;
    protected BigDecimal reserveBalance;
    protected String bankCode;
    protected String branchCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;
    protected String desc;
    @XmlSchemaType(name = "string")
    protected Flag force;

    /**
     * Gets the value of the acctNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNumber() {
        return acctNumber;
    }

    /**
     * Sets the value of the acctNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNumber(String value) {
        this.acctNumber = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the acctSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSubType() {
        return acctSubType;
    }

    /**
     * Sets the value of the acctSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSubType(String value) {
        this.acctSubType = value;
    }

    /**
     * Gets the value of the acctCatagory property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCatagory }
     *     
     */
    public AccountCatagory getAcctCatagory() {
        return acctCatagory;
    }

    /**
     * Sets the value of the acctCatagory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCatagory }
     *     
     */
    public void setAcctCatagory(AccountCatagory value) {
        this.acctCatagory = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the acctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStatus() {
        return acctStatus;
    }

    /**
     * Sets the value of the acctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStatus(String value) {
        this.acctStatus = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the localCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocalCurrencyAmount() {
        return localCurrencyAmount;
    }

    /**
     * Sets the value of the localCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocalCurrencyAmount(BigDecimal value) {
        this.localCurrencyAmount = value;
    }

    /**
     * Gets the value of the acctKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctKey() {
        return acctKey;
    }

    /**
     * Sets the value of the acctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctKey(BigInteger value) {
        this.acctKey = value;
    }

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableBalance(BigDecimal value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentBalance(BigDecimal value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the reserveBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReserveBalance() {
        return reserveBalance;
    }

    /**
     * Sets the value of the reserveBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReserveBalance(BigDecimal value) {
        this.reserveBalance = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
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

    /**
     * Gets the value of the force property.
     * 
     * @return
     *     possible object is
     *     {@link Flag }
     *     
     */
    public Flag getForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flag }
     *     
     */
    public void setForce(Flag value) {
        this.force = value;
    }

}
