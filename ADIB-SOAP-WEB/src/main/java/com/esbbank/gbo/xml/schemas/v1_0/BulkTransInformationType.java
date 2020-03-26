
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulkTransInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkTransInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userID" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UserNameType" minOccurs="0"/&gt;
 *         &lt;element name="createdBY" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UserNameType" minOccurs="0"/&gt;
 *         &lt;element name="bulkTransactionID" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNum" minOccurs="0"/&gt;
 *         &lt;element name="bulkTransactionCount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="bulkTransactionAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ccOrderID" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNum" minOccurs="0"/&gt;
 *         &lt;element name="visaPaymentTransactionList" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}VisaPaymentTransListType" maxOccurs="10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkTransInformationType", propOrder = {
    "userID",
    "createdBY",
    "bulkTransactionID",
    "bulkTransactionCount",
    "bulkTransactionAmount",
    "ccOrderID",
    "visaPaymentTransactionList"
})
public class BulkTransInformationType {

    protected String userID;
    protected String createdBY;
    protected String bulkTransactionID;
    protected BigInteger bulkTransactionCount;
    protected BigDecimal bulkTransactionAmount;
    protected String ccOrderID;
    protected List<VisaPaymentTransListType> visaPaymentTransactionList;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the createdBY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBY() {
        return createdBY;
    }

    /**
     * Sets the value of the createdBY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBY(String value) {
        this.createdBY = value;
    }

    /**
     * Gets the value of the bulkTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkTransactionID() {
        return bulkTransactionID;
    }

    /**
     * Sets the value of the bulkTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkTransactionID(String value) {
        this.bulkTransactionID = value;
    }

    /**
     * Gets the value of the bulkTransactionCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBulkTransactionCount() {
        return bulkTransactionCount;
    }

    /**
     * Sets the value of the bulkTransactionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBulkTransactionCount(BigInteger value) {
        this.bulkTransactionCount = value;
    }

    /**
     * Gets the value of the bulkTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBulkTransactionAmount() {
        return bulkTransactionAmount;
    }

    /**
     * Sets the value of the bulkTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBulkTransactionAmount(BigDecimal value) {
        this.bulkTransactionAmount = value;
    }

    /**
     * Gets the value of the ccOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcOrderID() {
        return ccOrderID;
    }

    /**
     * Sets the value of the ccOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcOrderID(String value) {
        this.ccOrderID = value;
    }

    /**
     * Gets the value of the visaPaymentTransactionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaPaymentTransactionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaPaymentTransactionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisaPaymentTransListType }
     * 
     * 
     */
    public List<VisaPaymentTransListType> getVisaPaymentTransactionList() {
        if (visaPaymentTransactionList == null) {
            visaPaymentTransactionList = new ArrayList<VisaPaymentTransListType>();
        }
        return this.visaPaymentTransactionList;
    }

}
