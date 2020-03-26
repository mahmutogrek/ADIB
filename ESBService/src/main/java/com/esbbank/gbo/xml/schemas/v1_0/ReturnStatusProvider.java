
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnStatusProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnStatusProvider"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="returnCodeProvider" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReturnCodeProvider"/&gt;
 *         &lt;element name="returnCodeDescProvider" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReturnCodeDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnStatusProvider", propOrder = {
    "returnCodeProvider",
    "returnCodeDescProvider"
})
public class ReturnStatusProvider {

    @XmlElement(required = true)
    protected String returnCodeProvider;
    protected String returnCodeDescProvider;

    /**
     * Gets the value of the returnCodeProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCodeProvider() {
        return returnCodeProvider;
    }

    /**
     * Sets the value of the returnCodeProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCodeProvider(String value) {
        this.returnCodeProvider = value;
    }

    /**
     * Gets the value of the returnCodeDescProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCodeDescProvider() {
        return returnCodeDescProvider;
    }

    /**
     * Sets the value of the returnCodeDescProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCodeDescProvider(String value) {
        this.returnCodeDescProvider = value;
    }

}
