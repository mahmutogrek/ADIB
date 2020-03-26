
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISOCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ISOCodeNum" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurDecPoint" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CashBuy" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CashSell" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TTBuy" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TTSell" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BuyRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SellRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MidRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="StaffRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="snapIn" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateRecord", propOrder = {
    "isoCode",
    "isoCodeNum",
    "curName",
    "curDecPoint",
    "cashBuy",
    "cashSell",
    "ttBuy",
    "ttSell",
    "buyRate",
    "sellRate",
    "midRate",
    "staffRate",
    "snapIn"
})
public class ExchangeRateRecord {

    @XmlElement(name = "ISOCode")
    protected String isoCode;
    @XmlElement(name = "ISOCodeNum")
    protected String isoCodeNum;
    @XmlElement(name = "CurName")
    protected String curName;
    @XmlElement(name = "CurDecPoint")
    protected String curDecPoint;
    @XmlElement(name = "CashBuy")
    protected Float cashBuy;
    @XmlElement(name = "CashSell")
    protected Float cashSell;
    @XmlElement(name = "TTBuy")
    protected Float ttBuy;
    @XmlElement(name = "TTSell")
    protected Float ttSell;
    @XmlElement(name = "BuyRate")
    protected Float buyRate;
    @XmlElement(name = "SellRate")
    protected Float sellRate;
    @XmlElement(name = "MidRate")
    protected Float midRate;
    @XmlElement(name = "StaffRate")
    protected Float staffRate;
    protected SnapIns snapIn;

    /**
     * Gets the value of the isoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCode() {
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
    public void setISOCode(String value) {
        this.isoCode = value;
    }

    /**
     * Gets the value of the isoCodeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCodeNum() {
        return isoCodeNum;
    }

    /**
     * Sets the value of the isoCodeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCodeNum(String value) {
        this.isoCodeNum = value;
    }

    /**
     * Gets the value of the curName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurName() {
        return curName;
    }

    /**
     * Sets the value of the curName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurName(String value) {
        this.curName = value;
    }

    /**
     * Gets the value of the curDecPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurDecPoint() {
        return curDecPoint;
    }

    /**
     * Sets the value of the curDecPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurDecPoint(String value) {
        this.curDecPoint = value;
    }

    /**
     * Gets the value of the cashBuy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashBuy() {
        return cashBuy;
    }

    /**
     * Sets the value of the cashBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashBuy(Float value) {
        this.cashBuy = value;
    }

    /**
     * Gets the value of the cashSell property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCashSell() {
        return cashSell;
    }

    /**
     * Sets the value of the cashSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCashSell(Float value) {
        this.cashSell = value;
    }

    /**
     * Gets the value of the ttBuy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTTBuy() {
        return ttBuy;
    }

    /**
     * Sets the value of the ttBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTTBuy(Float value) {
        this.ttBuy = value;
    }

    /**
     * Gets the value of the ttSell property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTTSell() {
        return ttSell;
    }

    /**
     * Sets the value of the ttSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTTSell(Float value) {
        this.ttSell = value;
    }

    /**
     * Gets the value of the buyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBuyRate() {
        return buyRate;
    }

    /**
     * Sets the value of the buyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBuyRate(Float value) {
        this.buyRate = value;
    }

    /**
     * Gets the value of the sellRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSellRate() {
        return sellRate;
    }

    /**
     * Sets the value of the sellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSellRate(Float value) {
        this.sellRate = value;
    }

    /**
     * Gets the value of the midRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMidRate() {
        return midRate;
    }

    /**
     * Sets the value of the midRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMidRate(Float value) {
        this.midRate = value;
    }

    /**
     * Gets the value of the staffRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStaffRate() {
        return staffRate;
    }

    /**
     * Sets the value of the staffRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStaffRate(Float value) {
        this.staffRate = value;
    }

    /**
     * Gets the value of the snapIn property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getSnapIn() {
        return snapIn;
    }

    /**
     * Sets the value of the snapIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setSnapIn(SnapIns value) {
        this.snapIn = value;
    }

}
