
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommisionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommisionInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commissionAccNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber"/&gt;
 *         &lt;element name="commissionAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount"/&gt;
 *         &lt;element name="commissionAccName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctTitle"/&gt;
 *         &lt;element name="commissionAccType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommisionInfoType", propOrder = {
    "commissionAccNo",
    "commissionAmount",
    "commissionAccName",
    "commissionAccType"
})
public class CommisionInfoType {

    @XmlElement(required = true)
    protected String commissionAccNo;
    @XmlElement(required = true)
    protected BigDecimal commissionAmount;
    @XmlElement(required = true)
    protected String commissionAccName;
    protected String commissionAccType;

    /**
     * Gets the value of the commissionAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionAccNo() {
        return commissionAccNo;
    }

    /**
     * Sets the value of the commissionAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionAccNo(String value) {
        this.commissionAccNo = value;
    }

    /**
     * Gets the value of the commissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    /**
     * Sets the value of the commissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionAmount(BigDecimal value) {
        this.commissionAmount = value;
    }

    /**
     * Gets the value of the commissionAccName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionAccName() {
        return commissionAccName;
    }

    /**
     * Sets the value of the commissionAccName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionAccName(String value) {
        this.commissionAccName = value;
    }

    /**
     * Gets the value of the commissionAccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionAccType() {
        return commissionAccType;
    }

    /**
     * Sets the value of the commissionAccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionAccType(String value) {
        this.commissionAccType = value;
    }

}
