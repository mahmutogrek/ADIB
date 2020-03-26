
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMSTextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="language" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Language1"/&gt;
 *         &lt;element name="messagetext" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSTextType", propOrder = {
    "language",
    "messagetext"
})
public class SMSTextType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Language1 language;
    @XmlElement(required = true)
    protected String messagetext;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language1 }
     *     
     */
    public Language1 getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language1 }
     *     
     */
    public void setLanguage(Language1 value) {
        this.language = value;
    }

    /**
     * Gets the value of the messagetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagetext() {
        return messagetext;
    }

    /**
     * Sets the value of the messagetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagetext(String value) {
        this.messagetext = value;
    }

}
