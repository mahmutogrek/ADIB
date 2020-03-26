
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="embossingName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Name" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardExpiryDateType" minOccurs="0"/&gt;
 *         &lt;element name="cardStatus" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CardStatusType" minOccurs="0"/&gt;
 *         &lt;element name="cardStatusGeneral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryCardFlag" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PrimarySuppCardFlagType" minOccurs="0"/&gt;
 *         &lt;element name="productDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isVIP" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}IsVIP" minOccurs="0"/&gt;
 *         &lt;element name="nameLatin" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="Authorization" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *         &lt;element name="Online" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *         &lt;element name="snapIns" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardData", propOrder = {
    "cardNo",
    "embossingName",
    "expiryDate",
    "cardStatus",
    "cardStatusGeneral",
    "primaryCardFlag",
    "productDesc",
    "isVIP",
    "nameLatin",
    "authorization",
    "online",
    "snapIns"
})
public class CardData {

    protected String cardNo;
    protected String embossingName;
    protected String expiryDate;
    @XmlSchemaType(name = "string")
    protected CardStatusType cardStatus;
    protected String cardStatusGeneral;
    @XmlSchemaType(name = "string")
    protected PrimarySuppCardFlagType primaryCardFlag;
    protected String productDesc;
    protected String isVIP;
    protected PersonName nameLatin;
    @XmlElement(name = "Authorization")
    protected SnapIns authorization;
    @XmlElement(name = "Online")
    protected SnapIns online;
    protected SnapIns snapIns;

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
     * Gets the value of the embossingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossingName() {
        return embossingName;
    }

    /**
     * Sets the value of the embossingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossingName(String value) {
        this.embossingName = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusType }
     *     
     */
    public CardStatusType getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusType }
     *     
     */
    public void setCardStatus(CardStatusType value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the cardStatusGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatusGeneral() {
        return cardStatusGeneral;
    }

    /**
     * Sets the value of the cardStatusGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatusGeneral(String value) {
        this.cardStatusGeneral = value;
    }

    /**
     * Gets the value of the primaryCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link PrimarySuppCardFlagType }
     *     
     */
    public PrimarySuppCardFlagType getPrimaryCardFlag() {
        return primaryCardFlag;
    }

    /**
     * Sets the value of the primaryCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimarySuppCardFlagType }
     *     
     */
    public void setPrimaryCardFlag(PrimarySuppCardFlagType value) {
        this.primaryCardFlag = value;
    }

    /**
     * Gets the value of the productDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * Sets the value of the productDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDesc(String value) {
        this.productDesc = value;
    }

    /**
     * Gets the value of the isVIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVIP() {
        return isVIP;
    }

    /**
     * Sets the value of the isVIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVIP(String value) {
        this.isVIP = value;
    }

    /**
     * Gets the value of the nameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getNameLatin() {
        return nameLatin;
    }

    /**
     * Sets the value of the nameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setNameLatin(PersonName value) {
        this.nameLatin = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setAuthorization(SnapIns value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the online property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setOnline(SnapIns value) {
        this.online = value;
    }

    /**
     * Gets the value of the snapIns property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getSnapIns() {
        return snapIns;
    }

    /**
     * Sets the value of the snapIns property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setSnapIns(SnapIns value) {
        this.snapIns = value;
    }

}
