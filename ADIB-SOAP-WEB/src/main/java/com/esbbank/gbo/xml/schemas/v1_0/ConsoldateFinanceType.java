
package com.esbbank.gbo.xml.schemas.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsoldateFinanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsoldateFinanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber"/&gt;
 *         &lt;element name="accountType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="accountSubType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctSubType" minOccurs="0"/&gt;
 *         &lt;element name="accountCatagory" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AccountCatagory" minOccurs="0"/&gt;
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branchCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}BranchCode" minOccurs="0"/&gt;
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerNumber" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerType" minOccurs="0"/&gt;
 *         &lt;element name="relationShipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationShipId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IBAN" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}IBANNum" minOccurs="0"/&gt;
 *         &lt;element name="balanceOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceClose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceCurrent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceAvailableLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceAvailableBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountSat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountUnSat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountDelinquent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountRemaining" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountRebate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountLastDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountLastWithdrawl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountNextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountLastPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountNextBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalRemainingBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalCurrentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalInstalmentValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalOverDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountPayOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountAccuredInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountUnAccuredInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestYearToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestPaidLastYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestCapatilize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateLastDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateLastWithdrawl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateMaturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFirstPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateLastPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateNextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateLastBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFirstBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateHoldEffective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateHoldExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfBills" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfBillsPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfRemaining" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfPayments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descriptionHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ConsoldateFinanceType", propOrder = {
    "accountNumber",
    "accountType",
    "accountSubType",
    "accountCatagory",
    "accountStatus",
    "accountDescription",
    "classCode",
    "classDesc",
    "branchCode",
    "branchName",
    "currencyCode",
    "status",
    "customerNumber",
    "customerType",
    "relationShipName",
    "relationShipId",
    "iban",
    "balanceOpen",
    "balanceClose",
    "balanceCurrent",
    "balanceAvailable",
    "balanceAvailableLoc",
    "balanceAvailableBegin",
    "amountContract",
    "amountHold",
    "amountPaid",
    "amountDue",
    "amountSat",
    "amountUnSat",
    "amountDelinquent",
    "amountRemaining",
    "amountRebate",
    "amount",
    "amountLastDeposit",
    "amountLastWithdrawl",
    "amountOriginal",
    "amountNextPayment",
    "amountLastPayment",
    "amountNextBill",
    "amountTotalRemainingBill",
    "amountTotalCurrentBalance",
    "amountTotalInstalmentValue",
    "amountTotalPaid",
    "amountTotalOverDue",
    "amountPayOff",
    "amountInterest",
    "amountAccuredInterest",
    "amountUnAccuredInterest",
    "availableCredit",
    "interestYearToDate",
    "interestPaidLastYear",
    "interestCapatilize",
    "dateLastDeposit",
    "dateLastWithdrawl",
    "dateIssue",
    "dateMaturity",
    "dateContract",
    "dateFirstPayment",
    "dateLastPayment",
    "dateNextPayment",
    "dateLastBill",
    "dateFirstBill",
    "dateHoldEffective",
    "dateHoldExpiry",
    "noOfBills",
    "noOfBillsPaid",
    "noOfRemaining",
    "noOfPayments",
    "limit",
    "idHold",
    "descriptionHold",
    "snapIn"
})
public class ConsoldateFinanceType {

    @XmlElement(required = true)
    protected String accountNumber;
    protected String accountType;
    protected String accountSubType;
    @XmlSchemaType(name = "string")
    protected AccountCatagory accountCatagory;
    protected String accountStatus;
    protected String accountDescription;
    protected String classCode;
    protected String classDesc;
    protected String branchCode;
    protected String branchName;
    protected String currencyCode;
    protected String status;
    protected String customerNumber;
    protected String customerType;
    protected String relationShipName;
    protected String relationShipId;
    @XmlElement(name = "IBAN")
    protected String iban;
    protected String balanceOpen;
    protected String balanceClose;
    protected String balanceCurrent;
    protected String balanceAvailable;
    protected String balanceAvailableLoc;
    protected String balanceAvailableBegin;
    protected String amountContract;
    protected String amountHold;
    protected String amountPaid;
    protected String amountDue;
    protected String amountSat;
    protected String amountUnSat;
    protected String amountDelinquent;
    protected String amountRemaining;
    protected String amountRebate;
    protected String amount;
    protected String amountLastDeposit;
    protected String amountLastWithdrawl;
    protected String amountOriginal;
    protected String amountNextPayment;
    protected String amountLastPayment;
    protected String amountNextBill;
    protected String amountTotalRemainingBill;
    protected String amountTotalCurrentBalance;
    protected String amountTotalInstalmentValue;
    protected String amountTotalPaid;
    protected String amountTotalOverDue;
    protected String amountPayOff;
    protected String amountInterest;
    protected String amountAccuredInterest;
    protected String amountUnAccuredInterest;
    protected String availableCredit;
    protected String interestYearToDate;
    protected String interestPaidLastYear;
    protected String interestCapatilize;
    protected String dateLastDeposit;
    protected String dateLastWithdrawl;
    protected String dateIssue;
    protected String dateMaturity;
    protected String dateContract;
    protected String dateFirstPayment;
    protected String dateLastPayment;
    protected String dateNextPayment;
    protected String dateLastBill;
    protected String dateFirstBill;
    protected String dateHoldEffective;
    protected String dateHoldExpiry;
    protected String noOfBills;
    protected String noOfBillsPaid;
    protected String noOfRemaining;
    protected String noOfPayments;
    protected String limit;
    protected String idHold;
    protected String descriptionHold;
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
     *     {@link AccountCatagory }
     *     
     */
    public AccountCatagory getAccountCatagory() {
        return accountCatagory;
    }

    /**
     * Sets the value of the accountCatagory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCatagory }
     *     
     */
    public void setAccountCatagory(AccountCatagory value) {
        this.accountCatagory = value;
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
     * Gets the value of the accountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDescription() {
        return accountDescription;
    }

    /**
     * Sets the value of the accountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDescription(String value) {
        this.accountDescription = value;
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
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
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
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
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
     * Gets the value of the balanceClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceClose() {
        return balanceClose;
    }

    /**
     * Sets the value of the balanceClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceClose(String value) {
        this.balanceClose = value;
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
     * Gets the value of the amountContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountContract() {
        return amountContract;
    }

    /**
     * Sets the value of the amountContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountContract(String value) {
        this.amountContract = value;
    }

    /**
     * Gets the value of the amountHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountHold() {
        return amountHold;
    }

    /**
     * Sets the value of the amountHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountHold(String value) {
        this.amountHold = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountPaid(String value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountDue(String value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the amountSat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountSat() {
        return amountSat;
    }

    /**
     * Sets the value of the amountSat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountSat(String value) {
        this.amountSat = value;
    }

    /**
     * Gets the value of the amountUnSat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountUnSat() {
        return amountUnSat;
    }

    /**
     * Sets the value of the amountUnSat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountUnSat(String value) {
        this.amountUnSat = value;
    }

    /**
     * Gets the value of the amountDelinquent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountDelinquent() {
        return amountDelinquent;
    }

    /**
     * Sets the value of the amountDelinquent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountDelinquent(String value) {
        this.amountDelinquent = value;
    }

    /**
     * Gets the value of the amountRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountRemaining() {
        return amountRemaining;
    }

    /**
     * Sets the value of the amountRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountRemaining(String value) {
        this.amountRemaining = value;
    }

    /**
     * Gets the value of the amountRebate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountRebate() {
        return amountRebate;
    }

    /**
     * Sets the value of the amountRebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountRebate(String value) {
        this.amountRebate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
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
     * Gets the value of the amountNextPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountNextPayment() {
        return amountNextPayment;
    }

    /**
     * Sets the value of the amountNextPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountNextPayment(String value) {
        this.amountNextPayment = value;
    }

    /**
     * Gets the value of the amountLastPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountLastPayment() {
        return amountLastPayment;
    }

    /**
     * Sets the value of the amountLastPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountLastPayment(String value) {
        this.amountLastPayment = value;
    }

    /**
     * Gets the value of the amountNextBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountNextBill() {
        return amountNextBill;
    }

    /**
     * Sets the value of the amountNextBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountNextBill(String value) {
        this.amountNextBill = value;
    }

    /**
     * Gets the value of the amountTotalRemainingBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountTotalRemainingBill() {
        return amountTotalRemainingBill;
    }

    /**
     * Sets the value of the amountTotalRemainingBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountTotalRemainingBill(String value) {
        this.amountTotalRemainingBill = value;
    }

    /**
     * Gets the value of the amountTotalCurrentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountTotalCurrentBalance() {
        return amountTotalCurrentBalance;
    }

    /**
     * Sets the value of the amountTotalCurrentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountTotalCurrentBalance(String value) {
        this.amountTotalCurrentBalance = value;
    }

    /**
     * Gets the value of the amountTotalInstalmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountTotalInstalmentValue() {
        return amountTotalInstalmentValue;
    }

    /**
     * Sets the value of the amountTotalInstalmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountTotalInstalmentValue(String value) {
        this.amountTotalInstalmentValue = value;
    }

    /**
     * Gets the value of the amountTotalPaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountTotalPaid() {
        return amountTotalPaid;
    }

    /**
     * Sets the value of the amountTotalPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountTotalPaid(String value) {
        this.amountTotalPaid = value;
    }

    /**
     * Gets the value of the amountTotalOverDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountTotalOverDue() {
        return amountTotalOverDue;
    }

    /**
     * Sets the value of the amountTotalOverDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountTotalOverDue(String value) {
        this.amountTotalOverDue = value;
    }

    /**
     * Gets the value of the amountPayOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountPayOff() {
        return amountPayOff;
    }

    /**
     * Sets the value of the amountPayOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountPayOff(String value) {
        this.amountPayOff = value;
    }

    /**
     * Gets the value of the amountInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountInterest() {
        return amountInterest;
    }

    /**
     * Sets the value of the amountInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountInterest(String value) {
        this.amountInterest = value;
    }

    /**
     * Gets the value of the amountAccuredInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountAccuredInterest() {
        return amountAccuredInterest;
    }

    /**
     * Sets the value of the amountAccuredInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountAccuredInterest(String value) {
        this.amountAccuredInterest = value;
    }

    /**
     * Gets the value of the amountUnAccuredInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountUnAccuredInterest() {
        return amountUnAccuredInterest;
    }

    /**
     * Sets the value of the amountUnAccuredInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountUnAccuredInterest(String value) {
        this.amountUnAccuredInterest = value;
    }

    /**
     * Gets the value of the availableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Sets the value of the availableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableCredit(String value) {
        this.availableCredit = value;
    }

    /**
     * Gets the value of the interestYearToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestYearToDate() {
        return interestYearToDate;
    }

    /**
     * Sets the value of the interestYearToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestYearToDate(String value) {
        this.interestYearToDate = value;
    }

    /**
     * Gets the value of the interestPaidLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestPaidLastYear() {
        return interestPaidLastYear;
    }

    /**
     * Sets the value of the interestPaidLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestPaidLastYear(String value) {
        this.interestPaidLastYear = value;
    }

    /**
     * Gets the value of the interestCapatilize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCapatilize() {
        return interestCapatilize;
    }

    /**
     * Sets the value of the interestCapatilize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCapatilize(String value) {
        this.interestCapatilize = value;
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
     * Gets the value of the dateContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateContract() {
        return dateContract;
    }

    /**
     * Sets the value of the dateContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateContract(String value) {
        this.dateContract = value;
    }

    /**
     * Gets the value of the dateFirstPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFirstPayment() {
        return dateFirstPayment;
    }

    /**
     * Sets the value of the dateFirstPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFirstPayment(String value) {
        this.dateFirstPayment = value;
    }

    /**
     * Gets the value of the dateLastPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastPayment() {
        return dateLastPayment;
    }

    /**
     * Sets the value of the dateLastPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastPayment(String value) {
        this.dateLastPayment = value;
    }

    /**
     * Gets the value of the dateNextPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateNextPayment() {
        return dateNextPayment;
    }

    /**
     * Sets the value of the dateNextPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateNextPayment(String value) {
        this.dateNextPayment = value;
    }

    /**
     * Gets the value of the dateLastBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastBill() {
        return dateLastBill;
    }

    /**
     * Sets the value of the dateLastBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastBill(String value) {
        this.dateLastBill = value;
    }

    /**
     * Gets the value of the dateFirstBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFirstBill() {
        return dateFirstBill;
    }

    /**
     * Sets the value of the dateFirstBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFirstBill(String value) {
        this.dateFirstBill = value;
    }

    /**
     * Gets the value of the dateHoldEffective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateHoldEffective() {
        return dateHoldEffective;
    }

    /**
     * Sets the value of the dateHoldEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateHoldEffective(String value) {
        this.dateHoldEffective = value;
    }

    /**
     * Gets the value of the dateHoldExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateHoldExpiry() {
        return dateHoldExpiry;
    }

    /**
     * Sets the value of the dateHoldExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateHoldExpiry(String value) {
        this.dateHoldExpiry = value;
    }

    /**
     * Gets the value of the noOfBills property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfBills() {
        return noOfBills;
    }

    /**
     * Sets the value of the noOfBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfBills(String value) {
        this.noOfBills = value;
    }

    /**
     * Gets the value of the noOfBillsPaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfBillsPaid() {
        return noOfBillsPaid;
    }

    /**
     * Sets the value of the noOfBillsPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfBillsPaid(String value) {
        this.noOfBillsPaid = value;
    }

    /**
     * Gets the value of the noOfRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfRemaining() {
        return noOfRemaining;
    }

    /**
     * Sets the value of the noOfRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfRemaining(String value) {
        this.noOfRemaining = value;
    }

    /**
     * Gets the value of the noOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfPayments() {
        return noOfPayments;
    }

    /**
     * Sets the value of the noOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfPayments(String value) {
        this.noOfPayments = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
        this.limit = value;
    }

    /**
     * Gets the value of the idHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdHold() {
        return idHold;
    }

    /**
     * Sets the value of the idHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdHold(String value) {
        this.idHold = value;
    }

    /**
     * Gets the value of the descriptionHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionHold() {
        return descriptionHold;
    }

    /**
     * Sets the value of the descriptionHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionHold(String value) {
        this.descriptionHold = value;
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
