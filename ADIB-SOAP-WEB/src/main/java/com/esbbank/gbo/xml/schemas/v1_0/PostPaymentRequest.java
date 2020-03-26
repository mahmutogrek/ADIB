
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostPaymentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostPaymentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="utilityNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityNumber"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostPaymentRequest", propOrder = {
    "utilityNumber"
})
public class PostPaymentRequest {

    @XmlElement(required = true)
    protected UtilityNumber utilityNumber;

    /**
     * Gets the value of the utilityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityNumber }
     *     
     */
    public UtilityNumber getUtilityNumber() {
        return utilityNumber;
    }

    /**
     * Sets the value of the utilityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityNumber }
     *     
     */
    public void setUtilityNumber(UtilityNumber value) {
        this.utilityNumber = value;
    }

}
