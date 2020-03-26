
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nickName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Name" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="secondName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="thirdName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="fourthName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="maidenMotherName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="fatherName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="motherName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="sex" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SexType" minOccurs="0"/&gt;
 *         &lt;element name="initials" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_2" minOccurs="0"/&gt;
 *         &lt;element name="suffix" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Suffix" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameInfoType", propOrder = {
    "nickName",
    "fullName",
    "firstName",
    "lastName",
    "secondName",
    "thirdName",
    "fourthName",
    "maidenMotherName",
    "fatherName",
    "motherName",
    "sex",
    "initials",
    "suffix"
})
public class NameInfoType {

    protected String nickName;
    protected String fullName;
    protected String firstName;
    protected String lastName;
    protected String secondName;
    protected String thirdName;
    protected String fourthName;
    protected String maidenMotherName;
    protected String fatherName;
    protected String motherName;
    @XmlSchemaType(name = "string")
    protected SexType sex;
    protected String initials;
    @XmlSchemaType(name = "string")
    protected Suffix suffix;

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
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    /**
     * Gets the value of the motherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * Sets the value of the motherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherName(String value) {
        this.motherName = value;
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
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link Suffix }
     *     
     */
    public Suffix getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Suffix }
     *     
     */
    public void setSuffix(Suffix value) {
        this.suffix = value;
    }

}
