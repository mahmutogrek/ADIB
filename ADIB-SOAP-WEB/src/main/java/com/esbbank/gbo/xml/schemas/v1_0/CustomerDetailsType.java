
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerId" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerNumber"/&gt;
 *         &lt;element name="CustomerType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerType1"/&gt;
 *         &lt;element name="title" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Title" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Name" minOccurs="0"/&gt;
 *         &lt;element name="instituteName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}InstituteName" minOccurs="0"/&gt;
 *         &lt;element name="instituteStartDate" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Date" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Gender" minOccurs="0"/&gt;
 *         &lt;element name="dateofBirth" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DateofBirth" minOccurs="0"/&gt;
 *         &lt;element name="industry" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Industry" minOccurs="0"/&gt;
 *         &lt;element name="tinFormat" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}TinFormat" minOccurs="0"/&gt;
 *         &lt;element name="tin" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Tin" minOccurs="0"/&gt;
 *         &lt;element name="occupation" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Occupation" minOccurs="0"/&gt;
 *         &lt;element name="CustomerCreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="residenceCountry" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ResidenceCountry" minOccurs="0"/&gt;
 *         &lt;element name="primaryCitznCountry" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PrimaryCitznCountry" minOccurs="0"/&gt;
 *         &lt;element name="secondaryCitznCountry" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SecondaryCitznCountry" minOccurs="0"/&gt;
 *         &lt;element name="documentsVerifiedFlag" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DocumentsVerifiedFlag"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDetailsType", propOrder = {
    "customerId",
    "customerType",
    "title",
    "firstName",
    "middleName",
    "lastName",
    "fullName",
    "instituteName",
    "instituteStartDate",
    "gender",
    "dateofBirth",
    "industry",
    "tinFormat",
    "tin",
    "occupation",
    "customerCreationDate",
    "residenceCountry",
    "primaryCitznCountry",
    "secondaryCitznCountry",
    "documentsVerifiedFlag"
})
public class CustomerDetailsType {

    @XmlElement(required = true)
    protected String customerId;
    @XmlElement(name = "CustomerType", required = true)
    protected String customerType;
    protected String title;
    protected String firstName;
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    protected String fullName;
    protected String instituteName;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar instituteStartDate;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    protected String dateofBirth;
    protected String industry;
    @XmlSchemaType(name = "string")
    protected TinFormat tinFormat;
    protected String tin;
    protected String occupation;
    @XmlElement(name = "CustomerCreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar customerCreationDate;
    protected String residenceCountry;
    protected String primaryCitznCountry;
    protected String secondaryCitznCountry;
    @XmlElement(required = true)
    protected String documentsVerifiedFlag;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the instituteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstituteName() {
        return instituteName;
    }

    /**
     * Sets the value of the instituteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstituteName(String value) {
        this.instituteName = value;
    }

    /**
     * Gets the value of the instituteStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstituteStartDate() {
        return instituteStartDate;
    }

    /**
     * Sets the value of the instituteStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstituteStartDate(XMLGregorianCalendar value) {
        this.instituteStartDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dateofBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateofBirth() {
        return dateofBirth;
    }

    /**
     * Sets the value of the dateofBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateofBirth(String value) {
        this.dateofBirth = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the tinFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TinFormat }
     *     
     */
    public TinFormat getTinFormat() {
        return tinFormat;
    }

    /**
     * Sets the value of the tinFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TinFormat }
     *     
     */
    public void setTinFormat(TinFormat value) {
        this.tinFormat = value;
    }

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTin(String value) {
        this.tin = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the customerCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerCreationDate() {
        return customerCreationDate;
    }

    /**
     * Sets the value of the customerCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerCreationDate(XMLGregorianCalendar value) {
        this.customerCreationDate = value;
    }

    /**
     * Gets the value of the residenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountry() {
        return residenceCountry;
    }

    /**
     * Sets the value of the residenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountry(String value) {
        this.residenceCountry = value;
    }

    /**
     * Gets the value of the primaryCitznCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCitznCountry() {
        return primaryCitznCountry;
    }

    /**
     * Sets the value of the primaryCitznCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCitznCountry(String value) {
        this.primaryCitznCountry = value;
    }

    /**
     * Gets the value of the secondaryCitznCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCitznCountry() {
        return secondaryCitznCountry;
    }

    /**
     * Sets the value of the secondaryCitznCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCitznCountry(String value) {
        this.secondaryCitznCountry = value;
    }

    /**
     * Gets the value of the documentsVerifiedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsVerifiedFlag() {
        return documentsVerifiedFlag;
    }

    /**
     * Sets the value of the documentsVerifiedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsVerifiedFlag(String value) {
        this.documentsVerifiedFlag = value;
    }

}
