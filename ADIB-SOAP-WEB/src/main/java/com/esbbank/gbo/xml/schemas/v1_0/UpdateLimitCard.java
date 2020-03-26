
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLimitCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLimitCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitAtmOff" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="limitPosOff" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="limitAtmOnline" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="limitPosOnline" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLimitCard", propOrder = {
    "limitAtmOff",
    "limitPosOff",
    "limitAtmOnline",
    "limitPosOnline"
})
public class UpdateLimitCard {

    protected BigInteger limitAtmOff;
    protected BigInteger limitPosOff;
    protected BigInteger limitAtmOnline;
    protected BigInteger limitPosOnline;

    /**
     * Gets the value of the limitAtmOff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitAtmOff() {
        return limitAtmOff;
    }

    /**
     * Sets the value of the limitAtmOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitAtmOff(BigInteger value) {
        this.limitAtmOff = value;
    }

    /**
     * Gets the value of the limitPosOff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitPosOff() {
        return limitPosOff;
    }

    /**
     * Sets the value of the limitPosOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitPosOff(BigInteger value) {
        this.limitPosOff = value;
    }

    /**
     * Gets the value of the limitAtmOnline property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitAtmOnline() {
        return limitAtmOnline;
    }

    /**
     * Sets the value of the limitAtmOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitAtmOnline(BigInteger value) {
        this.limitAtmOnline = value;
    }

    /**
     * Gets the value of the limitPosOnline property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitPosOnline() {
        return limitPosOnline;
    }

    /**
     * Sets the value of the limitPosOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitPosOnline(BigInteger value) {
        this.limitPosOnline = value;
    }

}
