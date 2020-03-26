
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtmAcctInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtmAcctInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="atmAccountType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAccountPrimay" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN"/&gt;
 *         &lt;element name="isAccountUsedForPos" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN"/&gt;
 *         &lt;element name="isAccountUsedForFastCash" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN"/&gt;
 *         &lt;element name="isAccountUsedForCashWithdrawal" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN"/&gt;
 *         &lt;element name="isAccountUsedForCashDeposit" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN"/&gt;
 *         &lt;element name="isAccountUsedForDebitTransfer" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN"/&gt;
 *         &lt;element name="isAccountUsedForCreditTransfer" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN"/&gt;
 *         &lt;element name="isInquireAllowed" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN"/&gt;
 *         &lt;element name="isPaymentAllowed" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN"/&gt;
 *         &lt;element name="nickName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="isWaiveFee" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtmAcctInfo", propOrder = {
    "accountNumber",
    "atmAccountType",
    "accountStatus",
    "isAccountPrimay",
    "isAccountUsedForPos",
    "isAccountUsedForFastCash",
    "isAccountUsedForCashWithdrawal",
    "isAccountUsedForCashDeposit",
    "isAccountUsedForDebitTransfer",
    "isAccountUsedForCreditTransfer",
    "isInquireAllowed",
    "isPaymentAllowed",
    "nickName",
    "branchCode",
    "currencyCode",
    "isWaiveFee"
})
public class AtmAcctInfo {

    @XmlElement(required = true)
    protected BigInteger accountNumber;
    @XmlElement(required = true)
    protected BigInteger atmAccountType;
    protected String accountStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YorN isAccountPrimay;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YorN isAccountUsedForPos;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YorN isAccountUsedForFastCash;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YorN isAccountUsedForCashWithdrawal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YorN isAccountUsedForCashDeposit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YorN isAccountUsedForDebitTransfer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YorN isAccountUsedForCreditTransfer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YorN isInquireAllowed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YorN isPaymentAllowed;
    protected String nickName;
    protected Integer branchCode;
    protected String currencyCode;
    @XmlSchemaType(name = "string")
    protected YorN isWaiveFee;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountNumber(BigInteger value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the atmAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAtmAccountType() {
        return atmAccountType;
    }

    /**
     * Sets the value of the atmAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAtmAccountType(BigInteger value) {
        this.atmAccountType = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the isAccountPrimay property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsAccountPrimay() {
        return isAccountPrimay;
    }

    /**
     * Sets the value of the isAccountPrimay property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsAccountPrimay(YorN value) {
        this.isAccountPrimay = value;
    }

    /**
     * Gets the value of the isAccountUsedForPos property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsAccountUsedForPos() {
        return isAccountUsedForPos;
    }

    /**
     * Sets the value of the isAccountUsedForPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsAccountUsedForPos(YorN value) {
        this.isAccountUsedForPos = value;
    }

    /**
     * Gets the value of the isAccountUsedForFastCash property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsAccountUsedForFastCash() {
        return isAccountUsedForFastCash;
    }

    /**
     * Sets the value of the isAccountUsedForFastCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsAccountUsedForFastCash(YorN value) {
        this.isAccountUsedForFastCash = value;
    }

    /**
     * Gets the value of the isAccountUsedForCashWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsAccountUsedForCashWithdrawal() {
        return isAccountUsedForCashWithdrawal;
    }

    /**
     * Sets the value of the isAccountUsedForCashWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsAccountUsedForCashWithdrawal(YorN value) {
        this.isAccountUsedForCashWithdrawal = value;
    }

    /**
     * Gets the value of the isAccountUsedForCashDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsAccountUsedForCashDeposit() {
        return isAccountUsedForCashDeposit;
    }

    /**
     * Sets the value of the isAccountUsedForCashDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsAccountUsedForCashDeposit(YorN value) {
        this.isAccountUsedForCashDeposit = value;
    }

    /**
     * Gets the value of the isAccountUsedForDebitTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsAccountUsedForDebitTransfer() {
        return isAccountUsedForDebitTransfer;
    }

    /**
     * Sets the value of the isAccountUsedForDebitTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsAccountUsedForDebitTransfer(YorN value) {
        this.isAccountUsedForDebitTransfer = value;
    }

    /**
     * Gets the value of the isAccountUsedForCreditTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsAccountUsedForCreditTransfer() {
        return isAccountUsedForCreditTransfer;
    }

    /**
     * Sets the value of the isAccountUsedForCreditTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsAccountUsedForCreditTransfer(YorN value) {
        this.isAccountUsedForCreditTransfer = value;
    }

    /**
     * Gets the value of the isInquireAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsInquireAllowed() {
        return isInquireAllowed;
    }

    /**
     * Sets the value of the isInquireAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsInquireAllowed(YorN value) {
        this.isInquireAllowed = value;
    }

    /**
     * Gets the value of the isPaymentAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsPaymentAllowed() {
        return isPaymentAllowed;
    }

    /**
     * Sets the value of the isPaymentAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsPaymentAllowed(YorN value) {
        this.isPaymentAllowed = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBranchCode(Integer value) {
        this.branchCode = value;
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
     * Gets the value of the isWaiveFee property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getIsWaiveFee() {
        return isWaiveFee;
    }

    /**
     * Sets the value of the isWaiveFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setIsWaiveFee(YorN value) {
        this.isWaiveFee = value;
    }

}
