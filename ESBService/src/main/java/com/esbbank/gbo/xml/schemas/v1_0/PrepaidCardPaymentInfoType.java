
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidCardPaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidCardPaymentInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="avalibaleBalance" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="totalAmountLoaded" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="netAmountLoaded" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidCardPaymentInfoType", propOrder = {
    "postBalance",
    "avalibaleBalance",
    "totalAmountLoaded",
    "netAmountLoaded"
})
public class PrepaidCardPaymentInfoType {

    protected BigDecimal postBalance;
    protected BigDecimal avalibaleBalance;
    protected BigDecimal totalAmountLoaded;
    protected BigDecimal netAmountLoaded;

    /**
     * Gets the value of the postBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostBalance() {
        return postBalance;
    }

    /**
     * Sets the value of the postBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostBalance(BigDecimal value) {
        this.postBalance = value;
    }

    /**
     * Gets the value of the avalibaleBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvalibaleBalance() {
        return avalibaleBalance;
    }

    /**
     * Sets the value of the avalibaleBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvalibaleBalance(BigDecimal value) {
        this.avalibaleBalance = value;
    }

    /**
     * Gets the value of the totalAmountLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountLoaded() {
        return totalAmountLoaded;
    }

    /**
     * Sets the value of the totalAmountLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountLoaded(BigDecimal value) {
        this.totalAmountLoaded = value;
    }

    /**
     * Gets the value of the netAmountLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmountLoaded() {
        return netAmountLoaded;
    }

    /**
     * Sets the value of the netAmountLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmountLoaded(BigDecimal value) {
        this.netAmountLoaded = value;
    }

}
