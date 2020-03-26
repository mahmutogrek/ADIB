
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AtmCardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtmCardInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardBin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="cardNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="branchCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}BranchCode" minOccurs="0"/&gt;
 *         &lt;element name="customerNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerNumber" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="EmbossingName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryEmbossingName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="address1" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="address2" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="address3" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="dateExpiry" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="isWaiveFee" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}classCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dailyMaxOnlineWithdrawalLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dailyMaxOnlinePosLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NumOfDayLimitCycle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="maxCardRetryInCycle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="maxPinRetryLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="availableOnlineWithdrawalAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="availableOfflineAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="availablePoswdlAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="availablePosOfflineAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dailyMaxOffLineWithdrawalLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dailyMaxOffLinePosLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="actualBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankAccName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statementAddress" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}StatementAddress" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="iDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtmCardInfo", propOrder = {
    "cardBin",
    "cardNum",
    "branchCode",
    "customerNumber",
    "firstName",
    "middleName",
    "lastName",
    "embossingName",
    "secondaryEmbossingName",
    "address1",
    "address2",
    "address3",
    "dateExpiry",
    "isWaiveFee",
    "clazz",
    "cardStatus",
    "dailyMaxOnlineWithdrawalLimit",
    "dailyMaxOnlinePosLimit",
    "numOfDayLimitCycle",
    "maxCardRetryInCycle",
    "maxPinRetryLimit",
    "availableOnlineWithdrawalAmount",
    "availableOfflineAmount",
    "availablePoswdlAmount",
    "availablePosOfflineAmount",
    "dailyMaxOffLineWithdrawalLimit",
    "dailyMaxOffLinePosLimit",
    "actualBankCode",
    "bankName",
    "bankBranch",
    "bankAccNumber",
    "bankAccName",
    "secAddress",
    "statementAddress",
    "idNumber"
})
public class AtmCardInfo {

    protected BigInteger cardBin;
    protected BigInteger cardNum;
    protected String branchCode;
    protected String customerNumber;
    protected String firstName;
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "EmbossingName")
    protected String embossingName;
    @XmlElement(name = "SecondaryEmbossingName")
    protected String secondaryEmbossingName;
    protected String address1;
    protected String address2;
    protected String address3;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateExpiry;
    @XmlSchemaType(name = "string")
    protected YorN isWaiveFee;
    @XmlElement(name = "class")
    @XmlSchemaType(name = "string")
    protected ClassCodeType clazz;
    protected String cardStatus;
    protected BigInteger dailyMaxOnlineWithdrawalLimit;
    protected BigInteger dailyMaxOnlinePosLimit;
    @XmlElement(name = "NumOfDayLimitCycle")
    protected BigInteger numOfDayLimitCycle;
    protected BigInteger maxCardRetryInCycle;
    protected BigInteger maxPinRetryLimit;
    protected BigInteger availableOnlineWithdrawalAmount;
    protected BigInteger availableOfflineAmount;
    protected BigInteger availablePoswdlAmount;
    protected BigInteger availablePosOfflineAmount;
    protected BigInteger dailyMaxOffLineWithdrawalLimit;
    protected BigInteger dailyMaxOffLinePosLimit;
    protected String actualBankCode;
    protected String bankName;
    protected String bankBranch;
    protected String bankAccNumber;
    protected String bankAccName;
    protected String secAddress;
    protected List<StatementAddress> statementAddress;
    @XmlElement(name = "iDNumber")
    protected String idNumber;

    /**
     * Gets the value of the cardBin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardBin() {
        return cardBin;
    }

    /**
     * Sets the value of the cardBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardBin(BigInteger value) {
        this.cardBin = value;
    }

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardNum(BigInteger value) {
        this.cardNum = value;
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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the embossingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossingName() {
        return embossingName;
    }

    /**
     * Sets the value of the embossingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossingName(String value) {
        this.embossingName = value;
    }

    /**
     * Gets the value of the secondaryEmbossingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryEmbossingName() {
        return secondaryEmbossingName;
    }

    /**
     * Sets the value of the secondaryEmbossingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryEmbossingName(String value) {
        this.secondaryEmbossingName = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the dateExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateExpiry() {
        return dateExpiry;
    }

    /**
     * Sets the value of the dateExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateExpiry(XMLGregorianCalendar value) {
        this.dateExpiry = value;
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

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ClassCodeType }
     *     
     */
    public ClassCodeType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassCodeType }
     *     
     */
    public void setClazz(ClassCodeType value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatus(String value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the dailyMaxOnlineWithdrawalLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDailyMaxOnlineWithdrawalLimit() {
        return dailyMaxOnlineWithdrawalLimit;
    }

    /**
     * Sets the value of the dailyMaxOnlineWithdrawalLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDailyMaxOnlineWithdrawalLimit(BigInteger value) {
        this.dailyMaxOnlineWithdrawalLimit = value;
    }

    /**
     * Gets the value of the dailyMaxOnlinePosLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDailyMaxOnlinePosLimit() {
        return dailyMaxOnlinePosLimit;
    }

    /**
     * Sets the value of the dailyMaxOnlinePosLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDailyMaxOnlinePosLimit(BigInteger value) {
        this.dailyMaxOnlinePosLimit = value;
    }

    /**
     * Gets the value of the numOfDayLimitCycle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfDayLimitCycle() {
        return numOfDayLimitCycle;
    }

    /**
     * Sets the value of the numOfDayLimitCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfDayLimitCycle(BigInteger value) {
        this.numOfDayLimitCycle = value;
    }

    /**
     * Gets the value of the maxCardRetryInCycle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxCardRetryInCycle() {
        return maxCardRetryInCycle;
    }

    /**
     * Sets the value of the maxCardRetryInCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxCardRetryInCycle(BigInteger value) {
        this.maxCardRetryInCycle = value;
    }

    /**
     * Gets the value of the maxPinRetryLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPinRetryLimit() {
        return maxPinRetryLimit;
    }

    /**
     * Sets the value of the maxPinRetryLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPinRetryLimit(BigInteger value) {
        this.maxPinRetryLimit = value;
    }

    /**
     * Gets the value of the availableOnlineWithdrawalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableOnlineWithdrawalAmount() {
        return availableOnlineWithdrawalAmount;
    }

    /**
     * Sets the value of the availableOnlineWithdrawalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableOnlineWithdrawalAmount(BigInteger value) {
        this.availableOnlineWithdrawalAmount = value;
    }

    /**
     * Gets the value of the availableOfflineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableOfflineAmount() {
        return availableOfflineAmount;
    }

    /**
     * Sets the value of the availableOfflineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableOfflineAmount(BigInteger value) {
        this.availableOfflineAmount = value;
    }

    /**
     * Gets the value of the availablePoswdlAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailablePoswdlAmount() {
        return availablePoswdlAmount;
    }

    /**
     * Sets the value of the availablePoswdlAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailablePoswdlAmount(BigInteger value) {
        this.availablePoswdlAmount = value;
    }

    /**
     * Gets the value of the availablePosOfflineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailablePosOfflineAmount() {
        return availablePosOfflineAmount;
    }

    /**
     * Sets the value of the availablePosOfflineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailablePosOfflineAmount(BigInteger value) {
        this.availablePosOfflineAmount = value;
    }

    /**
     * Gets the value of the dailyMaxOffLineWithdrawalLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDailyMaxOffLineWithdrawalLimit() {
        return dailyMaxOffLineWithdrawalLimit;
    }

    /**
     * Sets the value of the dailyMaxOffLineWithdrawalLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDailyMaxOffLineWithdrawalLimit(BigInteger value) {
        this.dailyMaxOffLineWithdrawalLimit = value;
    }

    /**
     * Gets the value of the dailyMaxOffLinePosLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDailyMaxOffLinePosLimit() {
        return dailyMaxOffLinePosLimit;
    }

    /**
     * Sets the value of the dailyMaxOffLinePosLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDailyMaxOffLinePosLimit(BigInteger value) {
        this.dailyMaxOffLinePosLimit = value;
    }

    /**
     * Gets the value of the actualBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualBankCode() {
        return actualBankCode;
    }

    /**
     * Sets the value of the actualBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualBankCode(String value) {
        this.actualBankCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranch(String value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the bankAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccNumber() {
        return bankAccNumber;
    }

    /**
     * Sets the value of the bankAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccNumber(String value) {
        this.bankAccNumber = value;
    }

    /**
     * Gets the value of the bankAccName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccName() {
        return bankAccName;
    }

    /**
     * Sets the value of the bankAccName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccName(String value) {
        this.bankAccName = value;
    }

    /**
     * Gets the value of the secAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecAddress() {
        return secAddress;
    }

    /**
     * Sets the value of the secAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecAddress(String value) {
        this.secAddress = value;
    }

    /**
     * Gets the value of the statementAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementAddress }
     * 
     * 
     */
    public List<StatementAddress> getStatementAddress() {
        if (statementAddress == null) {
            statementAddress = new ArrayList<StatementAddress>();
        }
        return this.statementAddress;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

}
