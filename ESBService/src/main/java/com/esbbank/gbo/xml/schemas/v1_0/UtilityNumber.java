
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilityNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="utilityServiceNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityServiceNumber"/&gt;
 *         &lt;element name="utilityAccountNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityAccountNumber"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityNumber", propOrder = {
    "utilityServiceNumber",
    "utilityAccountNumber"
})
public class UtilityNumber {

    protected String utilityServiceNumber;
    protected String utilityAccountNumber;

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

    /**
     * Gets the value of the utilityAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtilityAccountNumber() {
        return utilityAccountNumber;
    }

    /**
     * Sets the value of the utilityAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtilityAccountNumber(String value) {
        this.utilityAccountNumber = value;
    }

}
