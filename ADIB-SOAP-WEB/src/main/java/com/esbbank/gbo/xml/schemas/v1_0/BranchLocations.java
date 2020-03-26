
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchAreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchPINCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchLatitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchLongitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchTiming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchLocations", propOrder = {
    "branchCode",
    "branchDesc",
    "branchStreetName",
    "branchAreaName",
    "branchCityName",
    "branchPINCode",
    "branchPhone",
    "branchLatitude",
    "branchLongitude",
    "branchCountry",
    "branchTiming"
})
public class BranchLocations {

    @XmlElement(name = "BranchCode")
    protected String branchCode;
    @XmlElement(name = "BranchDesc")
    protected String branchDesc;
    @XmlElement(name = "BranchStreetName")
    protected String branchStreetName;
    @XmlElement(name = "BranchAreaName")
    protected String branchAreaName;
    @XmlElement(name = "BranchCityName")
    protected String branchCityName;
    @XmlElement(name = "BranchPINCode")
    protected String branchPINCode;
    @XmlElement(name = "BranchPhone")
    protected String branchPhone;
    @XmlElement(name = "BranchLatitude")
    protected String branchLatitude;
    @XmlElement(name = "BranchLongitude")
    protected String branchLongitude;
    @XmlElement(name = "BranchCountry")
    protected String branchCountry;
    @XmlElement(name = "BranchTiming")
    protected String branchTiming;

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the branchDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchDesc() {
        return branchDesc;
    }

    /**
     * Sets the value of the branchDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchDesc(String value) {
        this.branchDesc = value;
    }

    /**
     * Gets the value of the branchStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchStreetName() {
        return branchStreetName;
    }

    /**
     * Sets the value of the branchStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchStreetName(String value) {
        this.branchStreetName = value;
    }

    /**
     * Gets the value of the branchAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchAreaName() {
        return branchAreaName;
    }

    /**
     * Sets the value of the branchAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchAreaName(String value) {
        this.branchAreaName = value;
    }

    /**
     * Gets the value of the branchCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCityName() {
        return branchCityName;
    }

    /**
     * Sets the value of the branchCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCityName(String value) {
        this.branchCityName = value;
    }

    /**
     * Gets the value of the branchPINCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchPINCode() {
        return branchPINCode;
    }

    /**
     * Sets the value of the branchPINCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchPINCode(String value) {
        this.branchPINCode = value;
    }

    /**
     * Gets the value of the branchPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchPhone() {
        return branchPhone;
    }

    /**
     * Sets the value of the branchPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchPhone(String value) {
        this.branchPhone = value;
    }

    /**
     * Gets the value of the branchLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchLatitude() {
        return branchLatitude;
    }

    /**
     * Sets the value of the branchLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchLatitude(String value) {
        this.branchLatitude = value;
    }

    /**
     * Gets the value of the branchLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchLongitude() {
        return branchLongitude;
    }

    /**
     * Sets the value of the branchLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchLongitude(String value) {
        this.branchLongitude = value;
    }

    /**
     * Gets the value of the branchCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCountry() {
        return branchCountry;
    }

    /**
     * Sets the value of the branchCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCountry(String value) {
        this.branchCountry = value;
    }

    /**
     * Gets the value of the branchTiming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchTiming() {
        return branchTiming;
    }

    /**
     * Sets the value of the branchTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchTiming(String value) {
        this.branchTiming = value;
    }

}
