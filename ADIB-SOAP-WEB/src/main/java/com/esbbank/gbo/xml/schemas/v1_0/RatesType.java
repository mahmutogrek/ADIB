
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BuyRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="SellRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MidRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatesType", propOrder = {
    "rate",
    "buyRate",
    "sellRate",
    "midRate"
})
public class RatesType {

    @XmlElement(name = "Rate")
    protected Float rate;
    @XmlElement(name = "BuyRate")
    protected float buyRate;
    @XmlElement(name = "SellRate")
    protected float sellRate;
    @XmlElement(name = "MidRate")
    protected float midRate;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRate(Float value) {
        this.rate = value;
    }

    /**
     * Gets the value of the buyRate property.
     * 
     */
    public float getBuyRate() {
        return buyRate;
    }

    /**
     * Sets the value of the buyRate property.
     * 
     */
    public void setBuyRate(float value) {
        this.buyRate = value;
    }

    /**
     * Gets the value of the sellRate property.
     * 
     */
    public float getSellRate() {
        return sellRate;
    }

    /**
     * Sets the value of the sellRate property.
     * 
     */
    public void setSellRate(float value) {
        this.sellRate = value;
    }

    /**
     * Gets the value of the midRate property.
     * 
     */
    public float getMidRate() {
        return midRate;
    }

    /**
     * Sets the value of the midRate property.
     * 
     */
    public void setMidRate(float value) {
        this.midRate = value;
    }

}
