
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sponsorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sponsorPassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sponsorFileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sponsorEmiratesID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitorPassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitorCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recieptNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visaNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositInformationType", propOrder = {
    "sponsorName",
    "sponsorPassportNo",
    "sponsorFileNo",
    "sponsorEmiratesID",
    "visitorName",
    "visitorPassportNo",
    "visitorCountryCode",
    "recieptNo",
    "applicationNo",
    "visaNo"
})
public class DepositInformationType {

    protected String sponsorName;
    protected String sponsorPassportNo;
    protected String sponsorFileNo;
    protected String sponsorEmiratesID;
    protected String visitorName;
    protected String visitorPassportNo;
    protected String visitorCountryCode;
    protected String recieptNo;
    protected String applicationNo;
    protected String visaNo;

    /**
     * Gets the value of the sponsorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorName() {
        return sponsorName;
    }

    /**
     * Sets the value of the sponsorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorName(String value) {
        this.sponsorName = value;
    }

    /**
     * Gets the value of the sponsorPassportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorPassportNo() {
        return sponsorPassportNo;
    }

    /**
     * Sets the value of the sponsorPassportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorPassportNo(String value) {
        this.sponsorPassportNo = value;
    }

    /**
     * Gets the value of the sponsorFileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorFileNo() {
        return sponsorFileNo;
    }

    /**
     * Sets the value of the sponsorFileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorFileNo(String value) {
        this.sponsorFileNo = value;
    }

    /**
     * Gets the value of the sponsorEmiratesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorEmiratesID() {
        return sponsorEmiratesID;
    }

    /**
     * Sets the value of the sponsorEmiratesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorEmiratesID(String value) {
        this.sponsorEmiratesID = value;
    }

    /**
     * Gets the value of the visitorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitorName() {
        return visitorName;
    }

    /**
     * Sets the value of the visitorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitorName(String value) {
        this.visitorName = value;
    }

    /**
     * Gets the value of the visitorPassportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitorPassportNo() {
        return visitorPassportNo;
    }

    /**
     * Sets the value of the visitorPassportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitorPassportNo(String value) {
        this.visitorPassportNo = value;
    }

    /**
     * Gets the value of the visitorCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitorCountryCode() {
        return visitorCountryCode;
    }

    /**
     * Sets the value of the visitorCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitorCountryCode(String value) {
        this.visitorCountryCode = value;
    }

    /**
     * Gets the value of the recieptNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieptNo() {
        return recieptNo;
    }

    /**
     * Sets the value of the recieptNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieptNo(String value) {
        this.recieptNo = value;
    }

    /**
     * Gets the value of the applicationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNo() {
        return applicationNo;
    }

    /**
     * Sets the value of the applicationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNo(String value) {
        this.applicationNo = value;
    }

    /**
     * Gets the value of the visaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNo() {
        return visaNo;
    }

    /**
     * Sets the value of the visaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNo(String value) {
        this.visaNo = value;
    }

}
