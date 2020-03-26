
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaPaymentTransType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaPaymentTransType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceNum" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNum"/&gt;
 *         &lt;element name="serviceKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dpToDpTrans" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DpToDpTransType_New" minOccurs="0"/&gt;
 *         &lt;element name="glToDpTrans" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}GlToDpTransType" minOccurs="0"/&gt;
 *         &lt;element name="glToGlTrans" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}GlToGlTransType" minOccurs="0"/&gt;
 *         &lt;element name="commissionBreakup" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CommisionType"/&gt;
 *         &lt;element name="commissionIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depositInformation" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DepositInformationType" minOccurs="0"/&gt;
 *         &lt;element name="modeOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaPaymentTransType", propOrder = {
    "referenceNum",
    "serviceKey",
    "totalAmount",
    "createdBy",
    "dpToDpTrans",
    "glToDpTrans",
    "glToGlTrans",
    "commissionBreakup",
    "commissionIndex",
    "depositInformation",
    "modeOfPayment",
    "remarks"
})
public class VisaPaymentTransType {

    @XmlElement(required = true)
    protected String referenceNum;
    @XmlElement(required = true)
    protected String serviceKey;
    @XmlElement(required = true)
    protected String totalAmount;
    protected String createdBy;
    protected DpToDpTransTypeNew dpToDpTrans;
    protected GlToDpTransType glToDpTrans;
    protected GlToGlTransType glToGlTrans;
    @XmlElement(required = true)
    protected CommisionType commissionBreakup;
    protected String commissionIndex;
    protected DepositInformationType depositInformation;
    protected String modeOfPayment;
    protected String remarks;

    /**
     * Gets the value of the referenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNum() {
        return referenceNum;
    }

    /**
     * Sets the value of the referenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNum(String value) {
        this.referenceNum = value;
    }

    /**
     * Gets the value of the serviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceKey(String value) {
        this.serviceKey = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

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
     * Gets the value of the dpToDpTrans property.
     * 
     * @return
     *     possible object is
     *     {@link DpToDpTransTypeNew }
     *     
     */
    public DpToDpTransTypeNew getDpToDpTrans() {
        return dpToDpTrans;
    }

    /**
     * Sets the value of the dpToDpTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link DpToDpTransTypeNew }
     *     
     */
    public void setDpToDpTrans(DpToDpTransTypeNew value) {
        this.dpToDpTrans = value;
    }

    /**
     * Gets the value of the glToDpTrans property.
     * 
     * @return
     *     possible object is
     *     {@link GlToDpTransType }
     *     
     */
    public GlToDpTransType getGlToDpTrans() {
        return glToDpTrans;
    }

    /**
     * Sets the value of the glToDpTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlToDpTransType }
     *     
     */
    public void setGlToDpTrans(GlToDpTransType value) {
        this.glToDpTrans = value;
    }

    /**
     * Gets the value of the glToGlTrans property.
     * 
     * @return
     *     possible object is
     *     {@link GlToGlTransType }
     *     
     */
    public GlToGlTransType getGlToGlTrans() {
        return glToGlTrans;
    }

    /**
     * Sets the value of the glToGlTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlToGlTransType }
     *     
     */
    public void setGlToGlTrans(GlToGlTransType value) {
        this.glToGlTrans = value;
    }

    /**
     * Gets the value of the commissionBreakup property.
     * 
     * @return
     *     possible object is
     *     {@link CommisionType }
     *     
     */
    public CommisionType getCommissionBreakup() {
        return commissionBreakup;
    }

    /**
     * Sets the value of the commissionBreakup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommisionType }
     *     
     */
    public void setCommissionBreakup(CommisionType value) {
        this.commissionBreakup = value;
    }

    /**
     * Gets the value of the commissionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionIndex() {
        return commissionIndex;
    }

    /**
     * Sets the value of the commissionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionIndex(String value) {
        this.commissionIndex = value;
    }

    /**
     * Gets the value of the depositInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DepositInformationType }
     *     
     */
    public DepositInformationType getDepositInformation() {
        return depositInformation;
    }

    /**
     * Sets the value of the depositInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositInformationType }
     *     
     */
    public void setDepositInformation(DepositInformationType value) {
        this.depositInformation = value;
    }

    /**
     * Gets the value of the modeOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeOfPayment() {
        return modeOfPayment;
    }

    /**
     * Sets the value of the modeOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeOfPayment(String value) {
        this.modeOfPayment = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
