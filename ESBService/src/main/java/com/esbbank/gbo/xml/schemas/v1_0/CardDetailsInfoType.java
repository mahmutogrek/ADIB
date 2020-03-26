
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDetailsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardDetailsInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardTypeType" minOccurs="0"/&gt;
 *         &lt;element name="cardNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditAvl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashAvl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outStandingAuthorizaionbalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDSAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="dueBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="minimumDueBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Statement" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}StatementDataType" minOccurs="0"/&gt;
 *         &lt;element name="cardData" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardDataType" minOccurs="0"/&gt;
 *         &lt;element name="snapIn" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" maxOccurs="50" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardDetailsInfoType", propOrder = {
    "cardType",
    "cardNo",
    "balance",
    "creditLimit",
    "creditAvl",
    "cashLimit",
    "cashAvl",
    "outStandingAuthorizaionbalance",
    "ddsAmount",
    "customerId",
    "accountNo",
    "dueBalance",
    "minimumDueBalance",
    "statement",
    "cardData",
    "snapIn"
})
public class CardDetailsInfoType {

    protected String cardType;
    protected String cardNo;
    protected String balance;
    protected String creditLimit;
    protected String creditAvl;
    protected String cashLimit;
    protected String cashAvl;
    protected String outStandingAuthorizaionbalance;
    @XmlElement(name = "DDSAmount")
    protected String ddsAmount;
    protected String customerId;
    protected String accountNo;
    protected BigDecimal dueBalance;
    protected BigDecimal minimumDueBalance;
    @XmlElement(name = "Statement")
    protected StatementDataType statement;
    protected CardDataType cardData;
    protected List<SnapIns> snapIn;

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the creditAvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAvl() {
        return creditAvl;
    }

    /**
     * Sets the value of the creditAvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAvl(String value) {
        this.creditAvl = value;
    }

    /**
     * Gets the value of the cashLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashLimit() {
        return cashLimit;
    }

    /**
     * Sets the value of the cashLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashLimit(String value) {
        this.cashLimit = value;
    }

    /**
     * Gets the value of the cashAvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashAvl() {
        return cashAvl;
    }

    /**
     * Sets the value of the cashAvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashAvl(String value) {
        this.cashAvl = value;
    }

    /**
     * Gets the value of the outStandingAuthorizaionbalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStandingAuthorizaionbalance() {
        return outStandingAuthorizaionbalance;
    }

    /**
     * Sets the value of the outStandingAuthorizaionbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStandingAuthorizaionbalance(String value) {
        this.outStandingAuthorizaionbalance = value;
    }

    /**
     * Gets the value of the ddsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDSAmount() {
        return ddsAmount;
    }

    /**
     * Sets the value of the ddsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDSAmount(String value) {
        this.ddsAmount = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the dueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDueBalance() {
        return dueBalance;
    }

    /**
     * Sets the value of the dueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDueBalance(BigDecimal value) {
        this.dueBalance = value;
    }

    /**
     * Gets the value of the minimumDueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumDueBalance() {
        return minimumDueBalance;
    }

    /**
     * Sets the value of the minimumDueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumDueBalance(BigDecimal value) {
        this.minimumDueBalance = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link StatementDataType }
     *     
     */
    public StatementDataType getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementDataType }
     *     
     */
    public void setStatement(StatementDataType value) {
        this.statement = value;
    }

    /**
     * Gets the value of the cardData property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataType }
     *     
     */
    public CardDataType getCardData() {
        return cardData;
    }

    /**
     * Sets the value of the cardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataType }
     *     
     */
    public void setCardData(CardDataType value) {
        this.cardData = value;
    }

    /**
     * Gets the value of the snapIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snapIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnapIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SnapIns }
     * 
     * 
     */
    public List<SnapIns> getSnapIn() {
        if (snapIn == null) {
            snapIn = new ArrayList<SnapIns>();
        }
        return this.snapIn;
    }

}
