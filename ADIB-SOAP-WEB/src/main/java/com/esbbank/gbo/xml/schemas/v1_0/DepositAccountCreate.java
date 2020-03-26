
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DepositAccountCreate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositAccountCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerNumber"/&gt;
 *         &lt;element name="customerType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerType2"/&gt;
 *         &lt;element name="accountNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber2" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType"/&gt;
 *         &lt;element name="accountClassCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="accountTitle" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctTitle" maxOccurs="2"/&gt;
 *         &lt;element name="accountDescription" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctDesc" minOccurs="0"/&gt;
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="accountTerm" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}int1to9999_Type" minOccurs="0"/&gt;
 *         &lt;element name="accountPeriod" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}TermPeriodType" minOccurs="0"/&gt;
 *         &lt;element name="dateMaturity" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="maturityMethod" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}maturityMethod_Type" minOccurs="0"/&gt;
 *         &lt;element name="maturityRoutingNum" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_10" minOccurs="0"/&gt;
 *         &lt;element name="overdraftOption" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}OptionOverdraftType" minOccurs="0"/&gt;
 *         &lt;element name="overdraftLimit" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Decimal21_6Type" minOccurs="0"/&gt;
 *         &lt;element name="overdrafDateReview" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="overdrafInsfChargeOpt" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}InsufChargeOptType" minOccurs="0"/&gt;
 *         &lt;element name="overdrafNumDays" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}int1to999_Type" minOccurs="0"/&gt;
 *         &lt;element name="accountNumberMaturity" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *         &lt;element name="accountTypeIntMaturity" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="accountTypeExtMaturity" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="interestPaymentTerm" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}int1to9999_Type" minOccurs="0"/&gt;
 *         &lt;element name="interestPaymentPeriod" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PeriodType" minOccurs="0"/&gt;
 *         &lt;element name="interestPaymentMethod" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PaymentMethodType" minOccurs="0"/&gt;
 *         &lt;element name="interestPaymentDateFirst" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="interestRoutingNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_10" minOccurs="0"/&gt;
 *         &lt;element name="InterestInternalaccount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *         &lt;element name="InterestInternalaccountType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="InterestExternalaccountType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="chargeAlternateAccount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber2" minOccurs="0"/&gt;
 *         &lt;element name="chargeAlternateAccountType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="amountMinOpening" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Decimal21_6Type" minOccurs="0"/&gt;
 *         &lt;element name="amountMinDeposit" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Decimal21_6Type" minOccurs="0"/&gt;
 *         &lt;element name="amountMinWithdrawal" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Decimal21_6Type" minOccurs="0"/&gt;
 *         &lt;element name="maxNumOfChecks" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}int0to999_Type" minOccurs="0"/&gt;
 *         &lt;element name="maxNumOfDeposit" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}int0to999_Type" minOccurs="0"/&gt;
 *         &lt;element name="maxNumOfWithdrawal" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}int0to999_Type" minOccurs="0"/&gt;
 *         &lt;element name="accountNumberLoyolty" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber2" minOccurs="0"/&gt;
 *         &lt;element name="accountTypeLoyolty" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DepFieldsType" minOccurs="0"/&gt;
 *         &lt;element name="creditIntOpts" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CreditIntOptsType" minOccurs="0"/&gt;
 *         &lt;element name="debitIntOpts" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DebitIntOptsType" minOccurs="0"/&gt;
 *         &lt;element name="createStatement" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CreateStatementType"/&gt;
 *         &lt;element name="createAccountRelation" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CreateAcctRelation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accountUserDefineValues" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AccountUserDefineValueType1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositAccountCreate", propOrder = {
    "customerNumber",
    "customerType",
    "accountNumber",
    "accountType",
    "accountClassCode",
    "accountTitle",
    "accountDescription",
    "branchCode",
    "accountTerm",
    "accountPeriod",
    "dateMaturity",
    "maturityMethod",
    "maturityRoutingNum",
    "overdraftOption",
    "overdraftLimit",
    "overdrafDateReview",
    "overdrafInsfChargeOpt",
    "overdrafNumDays",
    "accountNumberMaturity",
    "accountTypeIntMaturity",
    "accountTypeExtMaturity",
    "interestPaymentTerm",
    "interestPaymentPeriod",
    "interestPaymentMethod",
    "interestPaymentDateFirst",
    "interestRoutingNumber",
    "interestInternalaccount",
    "interestInternalaccountType",
    "interestExternalaccountType",
    "chargeAlternateAccount",
    "chargeAlternateAccountType",
    "amountMinOpening",
    "amountMinDeposit",
    "amountMinWithdrawal",
    "maxNumOfChecks",
    "maxNumOfDeposit",
    "maxNumOfWithdrawal",
    "accountNumberLoyolty",
    "accountTypeLoyolty",
    "data",
    "creditIntOpts",
    "debitIntOpts",
    "createStatement",
    "createAccountRelation",
    "accountUserDefineValues"
})
public class DepositAccountCreate {

    @XmlElement(required = true)
    protected String customerNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CustomerType2 customerType;
    protected String accountNumber;
    @XmlElement(required = true)
    protected String accountType;
    protected int accountClassCode;
    @XmlElement(required = true)
    protected List<String> accountTitle;
    protected String accountDescription;
    protected Integer branchCode;
    protected Integer accountTerm;
    @XmlSchemaType(name = "string")
    protected TermPeriodType accountPeriod;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateMaturity;
    @XmlSchemaType(name = "string")
    protected MaturityMethodType maturityMethod;
    protected String maturityRoutingNum;
    @XmlSchemaType(name = "string")
    protected OptionOverdraftType overdraftOption;
    protected BigDecimal overdraftLimit;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar overdrafDateReview;
    @XmlSchemaType(name = "string")
    protected InsufChargeOptType overdrafInsfChargeOpt;
    protected Integer overdrafNumDays;
    protected String accountNumberMaturity;
    protected String accountTypeIntMaturity;
    protected String accountTypeExtMaturity;
    protected Integer interestPaymentTerm;
    @XmlSchemaType(name = "string")
    protected PeriodType interestPaymentPeriod;
    @XmlSchemaType(name = "string")
    protected PaymentMethodType interestPaymentMethod;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar interestPaymentDateFirst;
    protected String interestRoutingNumber;
    @XmlElement(name = "InterestInternalaccount")
    protected String interestInternalaccount;
    @XmlElement(name = "InterestInternalaccountType")
    protected String interestInternalaccountType;
    @XmlElement(name = "InterestExternalaccountType")
    protected String interestExternalaccountType;
    protected String chargeAlternateAccount;
    protected String chargeAlternateAccountType;
    protected BigDecimal amountMinOpening;
    protected BigDecimal amountMinDeposit;
    protected BigDecimal amountMinWithdrawal;
    protected Integer maxNumOfChecks;
    protected Integer maxNumOfDeposit;
    protected Integer maxNumOfWithdrawal;
    protected String accountNumberLoyolty;
    protected String accountTypeLoyolty;
    protected DepFieldsType data;
    protected CreditIntOptsType creditIntOpts;
    protected DebitIntOptsType debitIntOpts;
    @XmlElement(required = true)
    protected CreateStatementType createStatement;
    protected List<CreateAcctRelation> createAccountRelation;
    protected List<AccountUserDefineValueType1> accountUserDefineValues;

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
     *     {@link CustomerType2 }
     *     
     */
    public CustomerType2 getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType2 }
     *     
     */
    public void setCustomerType(CustomerType2 value) {
        this.customerType = value;
    }

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
     * Gets the value of the accountClassCode property.
     * 
     */
    public int getAccountClassCode() {
        return accountClassCode;
    }

    /**
     * Sets the value of the accountClassCode property.
     * 
     */
    public void setAccountClassCode(int value) {
        this.accountClassCode = value;
    }

    /**
     * Gets the value of the accountTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccountTitle() {
        if (accountTitle == null) {
            accountTitle = new ArrayList<String>();
        }
        return this.accountTitle;
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
     * Gets the value of the accountTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountTerm() {
        return accountTerm;
    }

    /**
     * Sets the value of the accountTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountTerm(Integer value) {
        this.accountTerm = value;
    }

    /**
     * Gets the value of the accountPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TermPeriodType }
     *     
     */
    public TermPeriodType getAccountPeriod() {
        return accountPeriod;
    }

    /**
     * Sets the value of the accountPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermPeriodType }
     *     
     */
    public void setAccountPeriod(TermPeriodType value) {
        this.accountPeriod = value;
    }

    /**
     * Gets the value of the dateMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateMaturity() {
        return dateMaturity;
    }

    /**
     * Sets the value of the dateMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateMaturity(XMLGregorianCalendar value) {
        this.dateMaturity = value;
    }

    /**
     * Gets the value of the maturityMethod property.
     * 
     * @return
     *     possible object is
     *     {@link MaturityMethodType }
     *     
     */
    public MaturityMethodType getMaturityMethod() {
        return maturityMethod;
    }

    /**
     * Sets the value of the maturityMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaturityMethodType }
     *     
     */
    public void setMaturityMethod(MaturityMethodType value) {
        this.maturityMethod = value;
    }

    /**
     * Gets the value of the maturityRoutingNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaturityRoutingNum() {
        return maturityRoutingNum;
    }

    /**
     * Sets the value of the maturityRoutingNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturityRoutingNum(String value) {
        this.maturityRoutingNum = value;
    }

    /**
     * Gets the value of the overdraftOption property.
     * 
     * @return
     *     possible object is
     *     {@link OptionOverdraftType }
     *     
     */
    public OptionOverdraftType getOverdraftOption() {
        return overdraftOption;
    }

    /**
     * Sets the value of the overdraftOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionOverdraftType }
     *     
     */
    public void setOverdraftOption(OptionOverdraftType value) {
        this.overdraftOption = value;
    }

    /**
     * Gets the value of the overdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * Sets the value of the overdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdraftLimit(BigDecimal value) {
        this.overdraftLimit = value;
    }

    /**
     * Gets the value of the overdrafDateReview property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverdrafDateReview() {
        return overdrafDateReview;
    }

    /**
     * Sets the value of the overdrafDateReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverdrafDateReview(XMLGregorianCalendar value) {
        this.overdrafDateReview = value;
    }

    /**
     * Gets the value of the overdrafInsfChargeOpt property.
     * 
     * @return
     *     possible object is
     *     {@link InsufChargeOptType }
     *     
     */
    public InsufChargeOptType getOverdrafInsfChargeOpt() {
        return overdrafInsfChargeOpt;
    }

    /**
     * Sets the value of the overdrafInsfChargeOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsufChargeOptType }
     *     
     */
    public void setOverdrafInsfChargeOpt(InsufChargeOptType value) {
        this.overdrafInsfChargeOpt = value;
    }

    /**
     * Gets the value of the overdrafNumDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdrafNumDays() {
        return overdrafNumDays;
    }

    /**
     * Sets the value of the overdrafNumDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdrafNumDays(Integer value) {
        this.overdrafNumDays = value;
    }

    /**
     * Gets the value of the accountNumberMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberMaturity() {
        return accountNumberMaturity;
    }

    /**
     * Sets the value of the accountNumberMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberMaturity(String value) {
        this.accountNumberMaturity = value;
    }

    /**
     * Gets the value of the accountTypeIntMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeIntMaturity() {
        return accountTypeIntMaturity;
    }

    /**
     * Sets the value of the accountTypeIntMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeIntMaturity(String value) {
        this.accountTypeIntMaturity = value;
    }

    /**
     * Gets the value of the accountTypeExtMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeExtMaturity() {
        return accountTypeExtMaturity;
    }

    /**
     * Sets the value of the accountTypeExtMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeExtMaturity(String value) {
        this.accountTypeExtMaturity = value;
    }

    /**
     * Gets the value of the interestPaymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterestPaymentTerm() {
        return interestPaymentTerm;
    }

    /**
     * Sets the value of the interestPaymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterestPaymentTerm(Integer value) {
        this.interestPaymentTerm = value;
    }

    /**
     * Gets the value of the interestPaymentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getInterestPaymentPeriod() {
        return interestPaymentPeriod;
    }

    /**
     * Sets the value of the interestPaymentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setInterestPaymentPeriod(PeriodType value) {
        this.interestPaymentPeriod = value;
    }

    /**
     * Gets the value of the interestPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getInterestPaymentMethod() {
        return interestPaymentMethod;
    }

    /**
     * Sets the value of the interestPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setInterestPaymentMethod(PaymentMethodType value) {
        this.interestPaymentMethod = value;
    }

    /**
     * Gets the value of the interestPaymentDateFirst property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInterestPaymentDateFirst() {
        return interestPaymentDateFirst;
    }

    /**
     * Sets the value of the interestPaymentDateFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInterestPaymentDateFirst(XMLGregorianCalendar value) {
        this.interestPaymentDateFirst = value;
    }

    /**
     * Gets the value of the interestRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRoutingNumber() {
        return interestRoutingNumber;
    }

    /**
     * Sets the value of the interestRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRoutingNumber(String value) {
        this.interestRoutingNumber = value;
    }

    /**
     * Gets the value of the interestInternalaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestInternalaccount() {
        return interestInternalaccount;
    }

    /**
     * Sets the value of the interestInternalaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestInternalaccount(String value) {
        this.interestInternalaccount = value;
    }

    /**
     * Gets the value of the interestInternalaccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestInternalaccountType() {
        return interestInternalaccountType;
    }

    /**
     * Sets the value of the interestInternalaccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestInternalaccountType(String value) {
        this.interestInternalaccountType = value;
    }

    /**
     * Gets the value of the interestExternalaccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestExternalaccountType() {
        return interestExternalaccountType;
    }

    /**
     * Sets the value of the interestExternalaccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestExternalaccountType(String value) {
        this.interestExternalaccountType = value;
    }

    /**
     * Gets the value of the chargeAlternateAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAlternateAccount() {
        return chargeAlternateAccount;
    }

    /**
     * Sets the value of the chargeAlternateAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAlternateAccount(String value) {
        this.chargeAlternateAccount = value;
    }

    /**
     * Gets the value of the chargeAlternateAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAlternateAccountType() {
        return chargeAlternateAccountType;
    }

    /**
     * Sets the value of the chargeAlternateAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAlternateAccountType(String value) {
        this.chargeAlternateAccountType = value;
    }

    /**
     * Gets the value of the amountMinOpening property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountMinOpening() {
        return amountMinOpening;
    }

    /**
     * Sets the value of the amountMinOpening property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountMinOpening(BigDecimal value) {
        this.amountMinOpening = value;
    }

    /**
     * Gets the value of the amountMinDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountMinDeposit() {
        return amountMinDeposit;
    }

    /**
     * Sets the value of the amountMinDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountMinDeposit(BigDecimal value) {
        this.amountMinDeposit = value;
    }

    /**
     * Gets the value of the amountMinWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountMinWithdrawal() {
        return amountMinWithdrawal;
    }

    /**
     * Sets the value of the amountMinWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountMinWithdrawal(BigDecimal value) {
        this.amountMinWithdrawal = value;
    }

    /**
     * Gets the value of the maxNumOfChecks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumOfChecks() {
        return maxNumOfChecks;
    }

    /**
     * Sets the value of the maxNumOfChecks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumOfChecks(Integer value) {
        this.maxNumOfChecks = value;
    }

    /**
     * Gets the value of the maxNumOfDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumOfDeposit() {
        return maxNumOfDeposit;
    }

    /**
     * Sets the value of the maxNumOfDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumOfDeposit(Integer value) {
        this.maxNumOfDeposit = value;
    }

    /**
     * Gets the value of the maxNumOfWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumOfWithdrawal() {
        return maxNumOfWithdrawal;
    }

    /**
     * Sets the value of the maxNumOfWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumOfWithdrawal(Integer value) {
        this.maxNumOfWithdrawal = value;
    }

    /**
     * Gets the value of the accountNumberLoyolty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberLoyolty() {
        return accountNumberLoyolty;
    }

    /**
     * Sets the value of the accountNumberLoyolty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberLoyolty(String value) {
        this.accountNumberLoyolty = value;
    }

    /**
     * Gets the value of the accountTypeLoyolty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeLoyolty() {
        return accountTypeLoyolty;
    }

    /**
     * Sets the value of the accountTypeLoyolty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeLoyolty(String value) {
        this.accountTypeLoyolty = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link DepFieldsType }
     *     
     */
    public DepFieldsType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepFieldsType }
     *     
     */
    public void setData(DepFieldsType value) {
        this.data = value;
    }

    /**
     * Gets the value of the creditIntOpts property.
     * 
     * @return
     *     possible object is
     *     {@link CreditIntOptsType }
     *     
     */
    public CreditIntOptsType getCreditIntOpts() {
        return creditIntOpts;
    }

    /**
     * Sets the value of the creditIntOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditIntOptsType }
     *     
     */
    public void setCreditIntOpts(CreditIntOptsType value) {
        this.creditIntOpts = value;
    }

    /**
     * Gets the value of the debitIntOpts property.
     * 
     * @return
     *     possible object is
     *     {@link DebitIntOptsType }
     *     
     */
    public DebitIntOptsType getDebitIntOpts() {
        return debitIntOpts;
    }

    /**
     * Sets the value of the debitIntOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitIntOptsType }
     *     
     */
    public void setDebitIntOpts(DebitIntOptsType value) {
        this.debitIntOpts = value;
    }

    /**
     * Gets the value of the createStatement property.
     * 
     * @return
     *     possible object is
     *     {@link CreateStatementType }
     *     
     */
    public CreateStatementType getCreateStatement() {
        return createStatement;
    }

    /**
     * Sets the value of the createStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateStatementType }
     *     
     */
    public void setCreateStatement(CreateStatementType value) {
        this.createStatement = value;
    }

    /**
     * Gets the value of the createAccountRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createAccountRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateAccountRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateAcctRelation }
     * 
     * 
     */
    public List<CreateAcctRelation> getCreateAccountRelation() {
        if (createAccountRelation == null) {
            createAccountRelation = new ArrayList<CreateAcctRelation>();
        }
        return this.createAccountRelation;
    }

    /**
     * Gets the value of the accountUserDefineValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountUserDefineValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountUserDefineValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountUserDefineValueType1 }
     * 
     * 
     */
    public List<AccountUserDefineValueType1> getAccountUserDefineValues() {
        if (accountUserDefineValues == null) {
            accountUserDefineValues = new ArrayList<AccountUserDefineValueType1>();
        }
        return this.accountUserDefineValues;
    }

}
