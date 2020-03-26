
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeStatusCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeStatusCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newCardStatus" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeStatusCard", propOrder = {
    "newCardStatus"
})
public class ChangeStatusCard {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CardStatusType newCardStatus;

    /**
     * Gets the value of the newCardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusType }
     *     
     */
    public CardStatusType getNewCardStatus() {
        return newCardStatus;
    }

    /**
     * Sets the value of the newCardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusType }
     *     
     */
    public void setNewCardStatus(CardStatusType value) {
        this.newCardStatus = value;
    }

}
