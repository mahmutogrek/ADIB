
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UtilityServiceBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityServiceBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="utilityservice" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityService" minOccurs="0"/&gt;
 *         &lt;element name="billNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billperiod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarksEn" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Remarks" minOccurs="0"/&gt;
 *         &lt;element name="remarksAr" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Remarks" minOccurs="0"/&gt;
 *         &lt;element name="outstandingAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="unbilledAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="grandAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="billAmount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="amountToPay" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Amount" minOccurs="0"/&gt;
 *         &lt;element name="billDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="billPeriodStart" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="billPeriodEnd" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="lastPaidDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Status" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityServiceBill", propOrder = {
    "utilityservice",
    "billNumber",
    "billperiod",
    "remarksEn",
    "remarksAr",
    "outstandingAmount",
    "unbilledAmount",
    "grandAmount",
    "billAmount",
    "amountToPay",
    "billDate",
    "billPeriodStart",
    "billPeriodEnd",
    "lastPaidDate",
    "status",
    "dueDate"
})
public class UtilityServiceBill {

    protected UtilityService utilityservice;
    protected String billNumber;
    protected String billperiod;
    protected String remarksEn;
    protected String remarksAr;
    protected BigDecimal outstandingAmount;
    protected BigDecimal unbilledAmount;
    protected BigDecimal grandAmount;
    protected BigDecimal billAmount;
    protected BigDecimal amountToPay;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billPeriodStart;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billPeriodEnd;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPaidDate;
    protected String status;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;

    /**
     * Gets the value of the utilityservice property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityService }
     *     
     */
    public UtilityService getUtilityservice() {
        return utilityservice;
    }

    /**
     * Sets the value of the utilityservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityService }
     *     
     */
    public void setUtilityservice(UtilityService value) {
        this.utilityservice = value;
    }

    /**
     * Gets the value of the billNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNumber() {
        return billNumber;
    }

    /**
     * Sets the value of the billNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNumber(String value) {
        this.billNumber = value;
    }

    /**
     * Gets the value of the billperiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillperiod() {
        return billperiod;
    }

    /**
     * Sets the value of the billperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillperiod(String value) {
        this.billperiod = value;
    }

    /**
     * Gets the value of the remarksEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksEn() {
        return remarksEn;
    }

    /**
     * Sets the value of the remarksEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksEn(String value) {
        this.remarksEn = value;
    }

    /**
     * Gets the value of the remarksAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksAr() {
        return remarksAr;
    }

    /**
     * Sets the value of the remarksAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksAr(String value) {
        this.remarksAr = value;
    }

    /**
     * Gets the value of the outstandingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingAmount() {
        return outstandingAmount;
    }

    /**
     * Sets the value of the outstandingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingAmount(BigDecimal value) {
        this.outstandingAmount = value;
    }

    /**
     * Gets the value of the unbilledAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnbilledAmount() {
        return unbilledAmount;
    }

    /**
     * Sets the value of the unbilledAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnbilledAmount(BigDecimal value) {
        this.unbilledAmount = value;
    }

    /**
     * Gets the value of the grandAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrandAmount() {
        return grandAmount;
    }

    /**
     * Sets the value of the grandAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrandAmount(BigDecimal value) {
        this.grandAmount = value;
    }

    /**
     * Gets the value of the billAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillAmount() {
        return billAmount;
    }

    /**
     * Sets the value of the billAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillAmount(BigDecimal value) {
        this.billAmount = value;
    }

    /**
     * Gets the value of the amountToPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountToPay() {
        return amountToPay;
    }

    /**
     * Sets the value of the amountToPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountToPay(BigDecimal value) {
        this.amountToPay = value;
    }

    /**
     * Gets the value of the billDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDate() {
        return billDate;
    }

    /**
     * Sets the value of the billDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDate(XMLGregorianCalendar value) {
        this.billDate = value;
    }

    /**
     * Gets the value of the billPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillPeriodStart() {
        return billPeriodStart;
    }

    /**
     * Sets the value of the billPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillPeriodStart(XMLGregorianCalendar value) {
        this.billPeriodStart = value;
    }

    /**
     * Gets the value of the billPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillPeriodEnd() {
        return billPeriodEnd;
    }

    /**
     * Sets the value of the billPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillPeriodEnd(XMLGregorianCalendar value) {
        this.billPeriodEnd = value;
    }

    /**
     * Gets the value of the lastPaidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaidDate() {
        return lastPaidDate;
    }

    /**
     * Sets the value of the lastPaidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaidDate(XMLGregorianCalendar value) {
        this.lastPaidDate = value;
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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

}
