
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilityService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="utilityaccount" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityAccount" minOccurs="0"/&gt;
 *         &lt;element name="utilityServiceType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityServiceType" minOccurs="0"/&gt;
 *         &lt;element name="utilityServiceNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityServiceNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityService", propOrder = {
    "utilityaccount",
    "utilityServiceType",
    "utilityServiceNumber"
})
public class UtilityService {

    protected UtilityAccount utilityaccount;
    protected UtilityServiceType utilityServiceType;
    protected String utilityServiceNumber;

    /**
     * Gets the value of the utilityaccount property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityAccount }
     *     
     */
    public UtilityAccount getUtilityaccount() {
        return utilityaccount;
    }

    /**
     * Sets the value of the utilityaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityAccount }
     *     
     */
    public void setUtilityaccount(UtilityAccount value) {
        this.utilityaccount = value;
    }

    /**
     * Gets the value of the utilityServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityServiceType }
     *     
     */
    public UtilityServiceType getUtilityServiceType() {
        return utilityServiceType;
    }

    /**
     * Sets the value of the utilityServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityServiceType }
     *     
     */
    public void setUtilityServiceType(UtilityServiceType value) {
        this.utilityServiceType = value;
    }

    /**
     * Gets the value of the utilityServiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtilityServiceNumber() {
        return utilityServiceNumber;
    }

    /**
     * Sets the value of the utilityServiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtilityServiceNumber(String value) {
        this.utilityServiceNumber = value;
    }

}
