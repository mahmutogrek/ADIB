
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilityAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerName_En" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="customerName_Ar" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Id" minOccurs="0"/&gt;
 *         &lt;element name="utilityProvider" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityProvider" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utilityAccountNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityAccountNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityAccount", propOrder = {
    "customerNameEn",
    "customerNameAr",
    "id",
    "utilityProvider",
    "accountType",
    "accountPin",
    "utilityAccountNumber"
})
public class UtilityAccount {

    @XmlElement(name = "customerName_En")
    protected Object customerNameEn;
    @XmlElement(name = "customerName_Ar")
    protected Object customerNameAr;
    protected Id id;
    protected UtilityProvider utilityProvider;
    protected String accountType;
    protected String accountPin;
    protected String utilityAccountNumber;

    /**
     * Gets the value of the customerNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCustomerNameEn() {
        return customerNameEn;
    }

    /**
     * Sets the value of the customerNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCustomerNameEn(Object value) {
        this.customerNameEn = value;
    }

    /**
     * Gets the value of the customerNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCustomerNameAr() {
        return customerNameAr;
    }

    /**
     * Sets the value of the customerNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCustomerNameAr(Object value) {
        this.customerNameAr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the utilityProvider property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityProvider }
     *     
     */
    public UtilityProvider getUtilityProvider() {
        return utilityProvider;
    }

    /**
     * Sets the value of the utilityProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityProvider }
     *     
     */
    public void setUtilityProvider(UtilityProvider value) {
        this.utilityProvider = value;
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
     * Gets the value of the accountPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPin() {
        return accountPin;
    }

    /**
     * Sets the value of the accountPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPin(String value) {
        this.accountPin = value;
    }

    /**
     * Gets the value of the utilityAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtilityAccountNumber() {
        return utilityAccountNumber;
    }

    /**
     * Sets the value of the utilityAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtilityAccountNumber(String value) {
        this.utilityAccountNumber = value;
    }

}
