
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardInfoOffLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfoOffLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="cardNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="isVIP" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}IsVIP" minOccurs="0"/&gt;
 *         &lt;element name="productDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="dueBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="avlBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="minimumDueBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardData" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardData" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="nameLatin" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="Statement" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *         &lt;element name="Authorization" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *         &lt;element name="Online" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *         &lt;element name="Overdue" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *         &lt;element name="Rewards" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfoOffLineType", propOrder = {
    "accountNo",
    "cardNo",
    "isVIP",
    "productDesc",
    "currencyCode",
    "dueBalance",
    "avlBalance",
    "minimumDueBalance",
    "creditLimit",
    "cardData",
    "nameLatin",
    "statement",
    "authorization",
    "online",
    "overdue",
    "payment",
    "rewards"
})
public class CardInfoOffLineType {

    protected String accountNo;
    protected String cardNo;
    protected String isVIP;
    protected String productDesc;
    protected String currencyCode;
    protected BigDecimal dueBalance;
    protected BigDecimal avlBalance;
    protected BigDecimal minimumDueBalance;
    protected String creditLimit;
    protected List<CardData> cardData;
    protected PersonName nameLatin;
    @XmlElement(name = "Statement")
    protected SnapIns statement;
    @XmlElement(name = "Authorization")
    protected SnapIns authorization;
    @XmlElement(name = "Online")
    protected SnapIns online;
    @XmlElement(name = "Overdue")
    protected SnapIns overdue;
    @XmlElement(name = "Payment")
    protected SnapIns payment;
    @XmlElement(name = "Rewards")
    protected SnapIns rewards;

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
     * Gets the value of the isVIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVIP() {
        return isVIP;
    }

    /**
     * Sets the value of the isVIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVIP(String value) {
        this.isVIP = value;
    }

    /**
     * Gets the value of the productDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * Sets the value of the productDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDesc(String value) {
        this.productDesc = value;
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
     * Gets the value of the avlBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvlBalance() {
        return avlBalance;
    }

    /**
     * Sets the value of the avlBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvlBalance(BigDecimal value) {
        this.avlBalance = value;
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
     * Gets the value of the cardData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardData }
     * 
     * 
     */
    public List<CardData> getCardData() {
        if (cardData == null) {
            cardData = new ArrayList<CardData>();
        }
        return this.cardData;
    }

    /**
     * Gets the value of the nameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getNameLatin() {
        return nameLatin;
    }

    /**
     * Sets the value of the nameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setNameLatin(PersonName value) {
        this.nameLatin = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setStatement(SnapIns value) {
        this.statement = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setAuthorization(SnapIns value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the online property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setOnline(SnapIns value) {
        this.online = value;
    }

    /**
     * Gets the value of the overdue property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getOverdue() {
        return overdue;
    }

    /**
     * Sets the value of the overdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setOverdue(SnapIns value) {
        this.overdue = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setPayment(SnapIns value) {
        this.payment = value;
    }

    /**
     * Gets the value of the rewards property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getRewards() {
        return rewards;
    }

    /**
     * Sets the value of the rewards property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setRewards(SnapIns value) {
        this.rewards = value;
    }

}
