
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *         &lt;element name="acctType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="applType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Status" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerNumber" minOccurs="0"/&gt;
 *         &lt;element name="IBAN" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}IBANNum" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="decimalDegits" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_2" minOccurs="0"/&gt;
 *         &lt;element name="catagory" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_20" minOccurs="0"/&gt;
 *         &lt;element name="acctCatagory" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_20" minOccurs="0"/&gt;
 *         &lt;element name="isoCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CurrencyCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateAccountType", propOrder = {
    "acctNumber",
    "acctType",
    "applType",
    "status",
    "customerId",
    "iban",
    "currencyCode",
    "decimalDegits",
    "catagory",
    "acctCatagory",
    "isoCode"
})
public class ValidateAccountType {

    protected String acctNumber;
    protected String acctType;
    protected String applType;
    protected String status;
    protected String customerId;
    @XmlElement(name = "IBAN")
    protected String iban;
    protected String currencyCode;
    protected String decimalDegits;
    protected String catagory;
    protected String acctCatagory;
    protected String isoCode;

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
     * Gets the value of the applType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplType() {
        return applType;
    }

    /**
     * Sets the value of the applType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplType(String value) {
        this.applType = value;
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
     * Gets the value of the decimalDegits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalDegits() {
        return decimalDegits;
    }

    /**
     * Sets the value of the decimalDegits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalDegits(String value) {
        this.decimalDegits = value;
    }

    /**
     * Gets the value of the catagory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatagory() {
        return catagory;
    }

    /**
     * Sets the value of the catagory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatagory(String value) {
        this.catagory = value;
    }

    /**
     * Gets the value of the acctCatagory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCatagory() {
        return acctCatagory;
    }

    /**
     * Sets the value of the acctCatagory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCatagory(String value) {
        this.acctCatagory = value;
    }

    /**
     * Gets the value of the isoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * Sets the value of the isoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCode(String value) {
        this.isoCode = value;
    }

}
