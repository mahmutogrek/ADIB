
package com.esbbank.gbo.xml.schemas.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DpToDpTransType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DpToDpTransType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransBuyRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="TransSellRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="debit" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DebitRequestType"/&gt;
 *         &lt;element name="credit" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CreditRequestType" maxOccurs="30"/&gt;
 *         &lt;element name="deviceInfo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_80" minOccurs="0"/&gt;
 *         &lt;element name="online" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Flag" minOccurs="0"/&gt;
 *         &lt;element name="force" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Flag" minOccurs="0"/&gt;
 *         &lt;element name="dateEffective" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DpToDpTransType", propOrder = {
    "transBuyRate",
    "transSellRate",
    "debit",
    "credit",
    "deviceInfo",
    "online",
    "force",
    "dateEffective"
})
public class DpToDpTransType {

    @XmlElement(name = "TransBuyRate")
    protected float transBuyRate;
    @XmlElement(name = "TransSellRate")
    protected float transSellRate;
    @XmlElement(required = true)
    protected DebitRequestType debit;
    @XmlElement(required = true)
    protected List<CreditRequestType> credit;
    protected String deviceInfo;
    @XmlSchemaType(name = "string")
    protected Flag online;
    @XmlSchemaType(name = "string")
    protected Flag force;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEffective;

    /**
     * Gets the value of the transBuyRate property.
     * 
     */
    public float getTransBuyRate() {
        return transBuyRate;
    }

    /**
     * Sets the value of the transBuyRate property.
     * 
     */
    public void setTransBuyRate(float value) {
        this.transBuyRate = value;
    }

    /**
     * Gets the value of the transSellRate property.
     * 
     */
    public float getTransSellRate() {
        return transSellRate;
    }

    /**
     * Sets the value of the transSellRate property.
     * 
     */
    public void setTransSellRate(float value) {
        this.transSellRate = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link DebitRequestType }
     *     
     */
    public DebitRequestType getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitRequestType }
     *     
     */
    public void setDebit(DebitRequestType value) {
        this.debit = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditRequestType }
     * 
     * 
     */
    public List<CreditRequestType> getCredit() {
        if (credit == null) {
            credit = new ArrayList<CreditRequestType>();
        }
        return this.credit;
    }

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceInfo(String value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the online property.
     * 
     * @return
     *     possible object is
     *     {@link Flag }
     *     
     */
    public Flag getOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flag }
     *     
     */
    public void setOnline(Flag value) {
        this.online = value;
    }

    /**
     * Gets the value of the force property.
     * 
     * @return
     *     possible object is
     *     {@link Flag }
     *     
     */
    public Flag getForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flag }
     *     
     */
    public void setForce(Flag value) {
        this.force = value;
    }

    /**
     * Gets the value of the dateEffective property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEffective() {
        return dateEffective;
    }

    /**
     * Sets the value of the dateEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEffective(XMLGregorianCalendar value) {
        this.dateEffective = value;
    }

}
