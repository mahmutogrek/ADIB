
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTransListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardTransListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="snapIns" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransListType", propOrder = {
    "postingDate",
    "postingTime",
    "postingAmount",
    "postingCurrency",
    "transDate",
    "transTime",
    "transAmount",
    "transCurrency",
    "description",
    "snapIns"
})
public class CardTransListType {

    protected String postingDate;
    protected String postingTime;
    protected String postingAmount;
    protected String postingCurrency;
    protected String transDate;
    protected String transTime;
    protected String transAmount;
    protected String transCurrency;
    protected String description;
    protected SnapIns snapIns;

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingDate(String value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the postingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingTime() {
        return postingTime;
    }

    /**
     * Sets the value of the postingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingTime(String value) {
        this.postingTime = value;
    }

    /**
     * Gets the value of the postingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingAmount() {
        return postingAmount;
    }

    /**
     * Sets the value of the postingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingAmount(String value) {
        this.postingAmount = value;
    }

    /**
     * Gets the value of the postingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingCurrency() {
        return postingCurrency;
    }

    /**
     * Sets the value of the postingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingCurrency(String value) {
        this.postingCurrency = value;
    }

    /**
     * Gets the value of the transDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * Sets the value of the transDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDate(String value) {
        this.transDate = value;
    }

    /**
     * Gets the value of the transTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTime() {
        return transTime;
    }

    /**
     * Sets the value of the transTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTime(String value) {
        this.transTime = value;
    }

    /**
     * Gets the value of the transAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransAmount() {
        return transAmount;
    }

    /**
     * Sets the value of the transAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransAmount(String value) {
        this.transAmount = value;
    }

    /**
     * Gets the value of the transCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransCurrency() {
        return transCurrency;
    }

    /**
     * Sets the value of the transCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransCurrency(String value) {
        this.transCurrency = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the snapIns property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getSnapIns() {
        return snapIns;
    }

    /**
     * Sets the value of the snapIns property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setSnapIns(SnapIns value) {
        this.snapIns = value;
    }

}
