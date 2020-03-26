
package com.esbbank.gbo.xml.schemas.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identification" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerNumber" minOccurs="0"/&gt;
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nickName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Name" minOccurs="0"/&gt;
 *         &lt;element name="emboseName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Name"/&gt;
 *         &lt;element name="firstName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="SecondName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="ThirdName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="FourthName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="dob" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DateofBirth" minOccurs="0"/&gt;
 *         &lt;element name="MaidenMotherName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="sex" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SexType" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatus" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}MaritalStatusType" minOccurs="0"/&gt;
 *         &lt;element name="initials" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_21" minOccurs="0"/&gt;
 *         &lt;element name="contactInfo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ContactInfoType" maxOccurs="9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonName", propOrder = {
    "identification",
    "tin",
    "nickName",
    "fullName",
    "emboseName",
    "firstName",
    "middleName",
    "lastName",
    "secondName",
    "thirdName",
    "fourthName",
    "dob",
    "maidenMotherName",
    "sex",
    "maritalStatus",
    "initials",
    "contactInfo"
})
public class PersonName {

    protected String identification;
    protected String tin;
    protected String nickName;
    protected String fullName;
    @XmlElement(required = true)
    protected String emboseName;
    protected String firstName;
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "SecondName")
    protected String secondName;
    @XmlElement(name = "ThirdName")
    protected String thirdName;
    @XmlElement(name = "FourthName")
    protected String fourthName;
    protected String dob;
    @XmlElement(name = "MaidenMotherName")
    protected String maidenMotherName;
    @XmlSchemaType(name = "string")
    protected SexType sex;
    @XmlSchemaType(name = "string")
    protected MaritalStatusType maritalStatus;
    protected String initials;
    protected List<ContactInfoType> contactInfo;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentification(String value) {
        this.identification = value;
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
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
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
     * Gets the value of the emboseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmboseName() {
        return emboseName;
    }

    /**
     * Sets the value of the emboseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmboseName(String value) {
        this.emboseName = value;
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
     * Gets the value of the secondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets the value of the secondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Gets the value of the thirdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdName() {
        return thirdName;
    }

    /**
     * Sets the value of the thirdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdName(String value) {
        this.thirdName = value;
    }

    /**
     * Gets the value of the fourthName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthName() {
        return fourthName;
    }

    /**
     * Sets the value of the fourthName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthName(String value) {
        this.fourthName = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the maidenMotherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaidenMotherName() {
        return maidenMotherName;
    }

    /**
     * Sets the value of the maidenMotherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaidenMotherName(String value) {
        this.maidenMotherName = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setSex(SexType value) {
        this.sex = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusType }
     *     
     */
    public MaritalStatusType getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusType }
     *     
     */
    public void setMaritalStatus(MaritalStatusType value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoType }
     * 
     * 
     */
    public List<ContactInfoType> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfoType>();
        }
        return this.contactInfo;
    }

}
