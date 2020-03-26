
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivateCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivateCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newCard" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardType"/&gt;
 *         &lt;element name="oldCard" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivateCardType", propOrder = {
    "newCard",
    "oldCard"
})
public class ActivateCardType {

    @XmlElement(required = true)
    protected CardType newCard;
    protected CardType oldCard;

    /**
     * Gets the value of the newCard property.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getNewCard() {
        return newCard;
    }

    /**
     * Sets the value of the newCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setNewCard(CardType value) {
        this.newCard = value;
    }

    /**
     * Gets the value of the oldCard property.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getOldCard() {
        return oldCard;
    }

    /**
     * Sets the value of the oldCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setOldCard(CardType value) {
        this.oldCard = value;
    }

}
