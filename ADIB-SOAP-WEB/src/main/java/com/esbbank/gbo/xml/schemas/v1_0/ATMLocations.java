
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATMLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ATMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMAreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMPINCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMLatitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMLongitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMLocations", propOrder = {
    "atmCode",
    "atmName",
    "atmStreetName",
    "atmAreaName",
    "atmCityName",
    "atmpinCode",
    "atmPhone",
    "atmLatitude",
    "atmLongitude",
    "atmCountry"
})
public class ATMLocations {

    @XmlElement(name = "ATMCode")
    protected String atmCode;
    @XmlElement(name = "ATMName")
    protected String atmName;
    @XmlElement(name = "ATMStreetName")
    protected String atmStreetName;
    @XmlElement(name = "ATMAreaName")
    protected String atmAreaName;
    @XmlElement(name = "ATMCityName")
    protected String atmCityName;
    @XmlElement(name = "ATMPINCode")
    protected String atmpinCode;
    @XmlElement(name = "ATMPhone")
    protected String atmPhone;
    @XmlElement(name = "ATMLatitude")
    protected String atmLatitude;
    @XmlElement(name = "ATMLongitude")
    protected String atmLongitude;
    @XmlElement(name = "ATMCountry")
    protected String atmCountry;

    /**
     * Gets the value of the atmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMCode() {
        return atmCode;
    }

    /**
     * Sets the value of the atmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMCode(String value) {
        this.atmCode = value;
    }

    /**
     * Gets the value of the atmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMName() {
        return atmName;
    }

    /**
     * Sets the value of the atmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMName(String value) {
        this.atmName = value;
    }

    /**
     * Gets the value of the atmStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMStreetName() {
        return atmStreetName;
    }

    /**
     * Sets the value of the atmStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMStreetName(String value) {
        this.atmStreetName = value;
    }

    /**
     * Gets the value of the atmAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMAreaName() {
        return atmAreaName;
    }

    /**
     * Sets the value of the atmAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMAreaName(String value) {
        this.atmAreaName = value;
    }

    /**
     * Gets the value of the atmCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMCityName() {
        return atmCityName;
    }

    /**
     * Sets the value of the atmCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMCityName(String value) {
        this.atmCityName = value;
    }

    /**
     * Gets the value of the atmpinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMPINCode() {
        return atmpinCode;
    }

    /**
     * Sets the value of the atmpinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMPINCode(String value) {
        this.atmpinCode = value;
    }

    /**
     * Gets the value of the atmPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMPhone() {
        return atmPhone;
    }

    /**
     * Sets the value of the atmPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMPhone(String value) {
        this.atmPhone = value;
    }

    /**
     * Gets the value of the atmLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMLatitude() {
        return atmLatitude;
    }

    /**
     * Sets the value of the atmLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMLatitude(String value) {
        this.atmLatitude = value;
    }

    /**
     * Gets the value of the atmLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMLongitude() {
        return atmLongitude;
    }

    /**
     * Sets the value of the atmLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMLongitude(String value) {
        this.atmLongitude = value;
    }

    /**
     * Gets the value of the atmCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMCountry() {
        return atmCountry;
    }

    /**
     * Sets the value of the atmCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMCountry(String value) {
        this.atmCountry = value;
    }

}
