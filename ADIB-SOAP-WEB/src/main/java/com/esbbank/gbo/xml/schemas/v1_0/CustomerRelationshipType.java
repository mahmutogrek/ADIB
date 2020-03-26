
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelationshipType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationDefn" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}RelationDefnType" minOccurs="0"/&gt;
 *         &lt;element name="parentCustomerNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ParentCustomerNumberType" minOccurs="0"/&gt;
 *         &lt;element name="RelationEffectiveDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="RelationExpiryDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="OwnershipPercentage" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Dec28"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelationshipType", propOrder = {
    "relationDefn",
    "parentCustomerNumber",
    "relationEffectiveDate",
    "relationExpiryDate",
    "ownershipPercentage"
})
public class CustomerRelationshipType {

    protected String relationDefn;
    protected String parentCustomerNumber;
    @XmlElement(name = "RelationEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar relationEffectiveDate;
    @XmlElement(name = "RelationExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar relationExpiryDate;
    @XmlElement(name = "OwnershipPercentage", required = true, nillable = true)
    protected BigDecimal ownershipPercentage;

    /**
     * Gets the value of the relationDefn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationDefn() {
        return relationDefn;
    }

    /**
     * Sets the value of the relationDefn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationDefn(String value) {
        this.relationDefn = value;
    }

    /**
     * Gets the value of the parentCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCustomerNumber() {
        return parentCustomerNumber;
    }

    /**
     * Sets the value of the parentCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCustomerNumber(String value) {
        this.parentCustomerNumber = value;
    }

    /**
     * Gets the value of the relationEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelationEffectiveDate() {
        return relationEffectiveDate;
    }

    /**
     * Sets the value of the relationEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRelationEffectiveDate(XMLGregorianCalendar value) {
        this.relationEffectiveDate = value;
    }

    /**
     * Gets the value of the relationExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelationExpiryDate() {
        return relationExpiryDate;
    }

    /**
     * Sets the value of the relationExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRelationExpiryDate(XMLGregorianCalendar value) {
        this.relationExpiryDate = value;
    }

    /**
     * Gets the value of the ownershipPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnershipPercentage() {
        return ownershipPercentage;
    }

    /**
     * Sets the value of the ownershipPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnershipPercentage(BigDecimal value) {
        this.ownershipPercentage = value;
    }

}
