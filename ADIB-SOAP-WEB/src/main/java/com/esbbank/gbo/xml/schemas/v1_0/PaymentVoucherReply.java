
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentVoucherReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentVoucherReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="voucherNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="voucherPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utilityPrepaidVoucherType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityPrepaidVoucherType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentVoucherReply", propOrder = {
    "voucherNumber",
    "serialNumber",
    "expiryDate",
    "voucherPassword",
    "utilityPrepaidVoucherType"
})
public class PaymentVoucherReply {

    protected String voucherNumber;
    protected String serialNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    protected String voucherPassword;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UtilityPrepaidVoucherType utilityPrepaidVoucherType;

    /**
     * Gets the value of the voucherNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * Sets the value of the voucherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherNumber(String value) {
        this.voucherNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the voucherPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherPassword() {
        return voucherPassword;
    }

    /**
     * Sets the value of the voucherPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherPassword(String value) {
        this.voucherPassword = value;
    }

    /**
     * Gets the value of the utilityPrepaidVoucherType property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityPrepaidVoucherType }
     *     
     */
    public UtilityPrepaidVoucherType getUtilityPrepaidVoucherType() {
        return utilityPrepaidVoucherType;
    }

    /**
     * Sets the value of the utilityPrepaidVoucherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityPrepaidVoucherType }
     *     
     */
    public void setUtilityPrepaidVoucherType(UtilityPrepaidVoucherType value) {
        this.utilityPrepaidVoucherType = value;
    }

}
