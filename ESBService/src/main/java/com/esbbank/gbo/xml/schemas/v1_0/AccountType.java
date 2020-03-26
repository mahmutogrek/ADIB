
package com.esbbank.gbo.xml.schemas.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber"/&gt;
 *         &lt;element name="accountType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="accountSubType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctSubType" minOccurs="0"/&gt;
 *         &lt;element name="accountCatagory" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AccountCatagoryType" minOccurs="0"/&gt;
 *         &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branchCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}BranchCode" minOccurs="0"/&gt;
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerNumber" minOccurs="0"/&gt;
 *         &lt;element name="relationShipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationShipId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ibanNum" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}IbanNum" minOccurs="0"/&gt;
 *         &lt;element name="balanceCurrent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceAvailableLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceAvailableBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountLastDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountLastWithdrawl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountLien" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountPledged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateLastDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateLastWithdrawl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateMaturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountNumberPledge" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *         &lt;element name="accountTypePledge" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="balanceClosing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idFinStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CheckNumType" minOccurs="0"/&gt;
 *         &lt;element name="snapIn" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountType", propOrder = {
    "accountNumber",
    "accountType",
    "accountSubType",
    "accountCatagory",
    "classCode",
    "classDesc",
    "branchCode",
    "branchName",
    "currencyCode",
    "status",
    "customerNumber",
    "relationShipName",
    "relationShipId",
    "ibanNum",
    "balanceCurrent",
    "balanceAvailable",
    "balanceAvailableLoc",
    "balanceAvailableBegin",
    "amountLastDeposit",
    "amountLastWithdrawl",
    "amountOriginal",
    "amountLien",
    "amountPledged",
    "dateLastDeposit",
    "dateLastWithdrawl",
    "dateIssue",
    "dateMaturity",
    "accountNumberPledge",
    "accountTypePledge",
    "balanceClosing",
    "balanceOpen",
    "idFinStatement",
    "checkNo",
    "snapIn"
})
public class AccountType {

    @XmlElement(required = true)
    protected String accountNumber;
    protected String accountType;
    protected String accountSubType;
    @XmlSchemaType(name = "string")
    protected AccountCatagoryType accountCatagory;
    protected String classCode;
    protected String classDesc;
    protected String branchCode;
    protected String branchName;
    protected String currencyCode;
    protected String status;
    protected String customerNumber;
    protected String relationShipName;
    protected String relationShipId;
    protected String ibanNum;
    protected String balanceCurrent;
    protected String balanceAvailable;
    protected String balanceAvailableLoc;
    protected String balanceAvailableBegin;
    protected String amountLastDeposit;
    protected String amountLastWithdrawl;
    protected String amountOriginal;
    protected String amountLien;
    protected String amountPledged;
    protected String dateLastDeposit;
    protected String dateLastWithdrawl;
    protected String dateIssue;
    protected String dateMaturity;
    protected String accountNumberPledge;
    protected String accountTypePledge;
    protected String balanceClosing;
    protected String balanceOpen;
    protected String idFinStatement;
    protected String checkNo;
    protected List<SnapIns> snapIn;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSubType() {
        return accountSubType;
    }

    /**
     * Sets the value of the accountSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSubType(String value) {
        this.accountSubType = value;
    }

    /**
     * Gets the value of the accountCatagory property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCatagoryType }
     *     
     */
    public AccountCatagoryType getAccountCatagory() {
        return accountCatagory;
    }

    /**
     * Sets the value of the accountCatagory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCatagoryType }
     *     
     */
    public void setAccountCatagory(AccountCatagoryType value) {
        this.accountCatagory = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the classDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDesc() {
        return classDesc;
    }

    /**
     * Sets the value of the classDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDesc(String value) {
        this.classDesc = value;
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
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the relationShipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationShipName() {
        return relationShipName;
    }

    /**
     * Sets the value of the relationShipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationShipName(String value) {
        this.relationShipName = value;
    }

    /**
     * Gets the value of the relationShipId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationShipId() {
        return relationShipId;
    }

    /**
     * Sets the value of the relationShipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationShipId(String value) {
        this.relationShipId = value;
    }

    /**
     * Gets the value of the ibanNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanNum() {
        return ibanNum;
    }

    /**
     * Sets the value of the ibanNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanNum(String value) {
        this.ibanNum = value;
    }

    /**
     * Gets the value of the balanceCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceCurrent() {
        return balanceCurrent;
    }

    /**
     * Sets the value of the balanceCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceCurrent(String value) {
        this.balanceCurrent = value;
    }

    /**
     * Gets the value of the balanceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceAvailable() {
        return balanceAvailable;
    }

    /**
     * Sets the value of the balanceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceAvailable(String value) {
        this.balanceAvailable = value;
    }

    /**
     * Gets the value of the balanceAvailableLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceAvailableLoc() {
        return balanceAvailableLoc;
    }

    /**
     * Sets the value of the balanceAvailableLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceAvailableLoc(String value) {
        this.balanceAvailableLoc = value;
    }

    /**
     * Gets the value of the balanceAvailableBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceAvailableBegin() {
        return balanceAvailableBegin;
    }

    /**
     * Sets the value of the balanceAvailableBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceAvailableBegin(String value) {
        this.balanceAvailableBegin = value;
    }

    /**
     * Gets the value of the amountLastDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountLastDeposit() {
        return amountLastDeposit;
    }

    /**
     * Sets the value of the amountLastDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountLastDeposit(String value) {
        this.amountLastDeposit = value;
    }

    /**
     * Gets the value of the amountLastWithdrawl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountLastWithdrawl() {
        return amountLastWithdrawl;
    }

    /**
     * Sets the value of the amountLastWithdrawl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountLastWithdrawl(String value) {
        this.amountLastWithdrawl = value;
    }

    /**
     * Gets the value of the amountOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountOriginal() {
        return amountOriginal;
    }

    /**
     * Sets the value of the amountOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountOriginal(String value) {
        this.amountOriginal = value;
    }

    /**
     * Gets the value of the amountLien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountLien() {
        return amountLien;
    }

    /**
     * Sets the value of the amountLien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountLien(String value) {
        this.amountLien = value;
    }

    /**
     * Gets the value of the amountPledged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountPledged() {
        return amountPledged;
    }

    /**
     * Sets the value of the amountPledged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountPledged(String value) {
        this.amountPledged = value;
    }

    /**
     * Gets the value of the dateLastDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastDeposit() {
        return dateLastDeposit;
    }

    /**
     * Sets the value of the dateLastDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastDeposit(String value) {
        this.dateLastDeposit = value;
    }

    /**
     * Gets the value of the dateLastWithdrawl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastWithdrawl() {
        return dateLastWithdrawl;
    }

    /**
     * Sets the value of the dateLastWithdrawl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastWithdrawl(String value) {
        this.dateLastWithdrawl = value;
    }

    /**
     * Gets the value of the dateIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateIssue() {
        return dateIssue;
    }

    /**
     * Sets the value of the dateIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateIssue(String value) {
        this.dateIssue = value;
    }

    /**
     * Gets the value of the dateMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateMaturity() {
        return dateMaturity;
    }

    /**
     * Sets the value of the dateMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateMaturity(String value) {
        this.dateMaturity = value;
    }

    /**
     * Gets the value of the accountNumberPledge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberPledge() {
        return accountNumberPledge;
    }

    /**
     * Sets the value of the accountNumberPledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberPledge(String value) {
        this.accountNumberPledge = value;
    }

    /**
     * Gets the value of the accountTypePledge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypePledge() {
        return accountTypePledge;
    }

    /**
     * Sets the value of the accountTypePledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypePledge(String value) {
        this.accountTypePledge = value;
    }

    /**
     * Gets the value of the balanceClosing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceClosing() {
        return balanceClosing;
    }

    /**
     * Sets the value of the balanceClosing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceClosing(String value) {
        this.balanceClosing = value;
    }

    /**
     * Gets the value of the balanceOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceOpen() {
        return balanceOpen;
    }

    /**
     * Sets the value of the balanceOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceOpen(String value) {
        this.balanceOpen = value;
    }

    /**
     * Gets the value of the idFinStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFinStatement() {
        return idFinStatement;
    }

    /**
     * Sets the value of the idFinStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFinStatement(String value) {
        this.idFinStatement = value;
    }

    /**
     * Gets the value of the checkNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNo() {
        return checkNo;
    }

    /**
     * Sets the value of the checkNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNo(String value) {
        this.checkNo = value;
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
