
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageTextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *           &lt;element name="textSMS" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SMSTextType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageTextType", propOrder = {
    "templateId",
    "textSMS"
})
public class MessageTextType {

    protected Integer templateId;
    protected SMSTextType textSMS;

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemplateId(Integer value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the textSMS property.
     * 
     * @return
     *     possible object is
     *     {@link SMSTextType }
     *     
     */
    public SMSTextType getTextSMS() {
        return textSMS;
    }

    /**
     * Sets the value of the textSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSTextType }
     *     
     */
    public void setTextSMS(SMSTextType value) {
        this.textSMS = value;
    }

}
