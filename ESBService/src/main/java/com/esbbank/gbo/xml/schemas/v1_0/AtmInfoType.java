
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtmInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtmInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_21" minOccurs="0"/&gt;
 *         &lt;element name="deviceLocation" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_80" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_80" minOccurs="0"/&gt;
 *         &lt;element name="proprietaryATM" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}YorN" minOccurs="0"/&gt;
 *         &lt;element name="atmSwitchID" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_80"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtmInfoType", propOrder = {
    "cardNo",
    "deviceLocation",
    "description",
    "proprietaryATM",
    "atmSwitchID"
})
public class AtmInfoType {

    protected String cardNo;
    protected String deviceLocation;
    protected String description;
    @XmlSchemaType(name = "string")
    protected YorN proprietaryATM;
    @XmlElement(required = true)
    protected String atmSwitchID;

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the deviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceLocation() {
        return deviceLocation;
    }

    /**
     * Sets the value of the deviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceLocation(String value) {
        this.deviceLocation = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the proprietaryATM property.
     * 
     * @return
     *     possible object is
     *     {@link YorN }
     *     
     */
    public YorN getProprietaryATM() {
        return proprietaryATM;
    }

    /**
     * Sets the value of the proprietaryATM property.
     * 
     * @param value
     *     allowed object is
     *     {@link YorN }
     *     
     */
    public void setProprietaryATM(YorN value) {
        this.proprietaryATM = value;
    }

    /**
     * Gets the value of the atmSwitchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtmSwitchID() {
        return atmSwitchID;
    }

    /**
     * Sets the value of the atmSwitchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtmSwitchID(String value) {
        this.atmSwitchID = value;
    }

}
