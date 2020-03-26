
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateNewCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateNewCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdBy" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40"/&gt;
 *         &lt;element name="productName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40"/&gt;
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="debitCardType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DebitCardType1"/&gt;
 *         &lt;element name="accountCrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="custProductName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="acctProductName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="custTemplate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="acctTemplate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="cardTemplate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="atmCardInfo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AtmCardInfo" minOccurs="0"/&gt;
 *         &lt;element name="atmCustInfo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AtmCustInfo" minOccurs="0"/&gt;
 *         &lt;element name="atmAcctInfo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AtmAcctInfo" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="certificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="murabahaStDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateNewCard", propOrder = {
    "createdBy",
    "productName",
    "branchCode",
    "debitCardType",
    "accountCrLimit",
    "custProductName",
    "acctProductName",
    "custTemplate",
    "acctTemplate",
    "cardTemplate",
    "atmCardInfo",
    "atmCustInfo",
    "atmAcctInfo",
    "certificateNumber",
    "murabahaStDate"
})
public class CreateNewCard {

    @XmlElement(required = true)
    protected String createdBy;
    @XmlElement(required = true)
    protected String productName;
    protected int branchCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DebitCardType1 debitCardType;
    protected BigDecimal accountCrLimit;
    protected String custProductName;
    protected String acctProductName;
    protected String custTemplate;
    protected String acctTemplate;
    protected String cardTemplate;
    protected AtmCardInfo atmCardInfo;
    protected AtmCustInfo atmCustInfo;
    protected List<AtmAcctInfo> atmAcctInfo;
    protected String certificateNumber;
    protected String murabahaStDate;

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     */
    public int getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     */
    public void setBranchCode(int value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the debitCardType property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCardType1 }
     *     
     */
    public DebitCardType1 getDebitCardType() {
        return debitCardType;
    }

    /**
     * Sets the value of the debitCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCardType1 }
     *     
     */
    public void setDebitCardType(DebitCardType1 value) {
        this.debitCardType = value;
    }

    /**
     * Gets the value of the accountCrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountCrLimit() {
        return accountCrLimit;
    }

    /**
     * Sets the value of the accountCrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountCrLimit(BigDecimal value) {
        this.accountCrLimit = value;
    }

    /**
     * Gets the value of the custProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustProductName() {
        return custProductName;
    }

    /**
     * Sets the value of the custProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustProductName(String value) {
        this.custProductName = value;
    }

    /**
     * Gets the value of the acctProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctProductName() {
        return acctProductName;
    }

    /**
     * Sets the value of the acctProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctProductName(String value) {
        this.acctProductName = value;
    }

    /**
     * Gets the value of the custTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustTemplate() {
        return custTemplate;
    }

    /**
     * Sets the value of the custTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustTemplate(String value) {
        this.custTemplate = value;
    }

    /**
     * Gets the value of the acctTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTemplate() {
        return acctTemplate;
    }

    /**
     * Sets the value of the acctTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTemplate(String value) {
        this.acctTemplate = value;
    }

    /**
     * Gets the value of the cardTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTemplate() {
        return cardTemplate;
    }

    /**
     * Sets the value of the cardTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTemplate(String value) {
        this.cardTemplate = value;
    }

    /**
     * Gets the value of the atmCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AtmCardInfo }
     *     
     */
    public AtmCardInfo getAtmCardInfo() {
        return atmCardInfo;
    }

    /**
     * Sets the value of the atmCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtmCardInfo }
     *     
     */
    public void setAtmCardInfo(AtmCardInfo value) {
        this.atmCardInfo = value;
    }

    /**
     * Gets the value of the atmCustInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AtmCustInfo }
     *     
     */
    public AtmCustInfo getAtmCustInfo() {
        return atmCustInfo;
    }

    /**
     * Sets the value of the atmCustInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtmCustInfo }
     *     
     */
    public void setAtmCustInfo(AtmCustInfo value) {
        this.atmCustInfo = value;
    }

    /**
     * Gets the value of the atmAcctInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atmAcctInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtmAcctInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtmAcctInfo }
     * 
     * 
     */
    public List<AtmAcctInfo> getAtmAcctInfo() {
        if (atmAcctInfo == null) {
            atmAcctInfo = new ArrayList<AtmAcctInfo>();
        }
        return this.atmAcctInfo;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the murabahaStDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMurabahaStDate() {
        return murabahaStDate;
    }

    /**
     * Sets the value of the murabahaStDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMurabahaStDate(String value) {
        this.murabahaStDate = value;
    }

}
