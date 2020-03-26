
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statementLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtTelePhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtTelePhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtMobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementAddress", propOrder = {
    "statementLocation",
    "stmtAddress1",
    "stmtAddress2",
    "stmtAddress3",
    "stmtAddress4",
    "stmtAddress5",
    "stmtCity",
    "stmtPostalCode",
    "stmtState",
    "stmtCounty",
    "stmtCountry",
    "stmtTelePhone1",
    "stmtTelePhone2",
    "stmtMobileNo",
    "stmtFaxNo",
    "stmtEmail"
})
public class StatementAddress {

    protected String statementLocation;
    protected String stmtAddress1;
    protected String stmtAddress2;
    protected String stmtAddress3;
    protected String stmtAddress4;
    protected String stmtAddress5;
    protected String stmtCity;
    protected String stmtPostalCode;
    protected String stmtState;
    protected String stmtCounty;
    protected String stmtCountry;
    protected String stmtTelePhone1;
    protected String stmtTelePhone2;
    protected String stmtMobileNo;
    protected String stmtFaxNo;
    protected String stmtEmail;

    /**
     * Gets the value of the statementLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementLocation() {
        return statementLocation;
    }

    /**
     * Sets the value of the statementLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementLocation(String value) {
        this.statementLocation = value;
    }

    /**
     * Gets the value of the stmtAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtAddress1() {
        return stmtAddress1;
    }

    /**
     * Sets the value of the stmtAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtAddress1(String value) {
        this.stmtAddress1 = value;
    }

    /**
     * Gets the value of the stmtAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtAddress2() {
        return stmtAddress2;
    }

    /**
     * Sets the value of the stmtAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtAddress2(String value) {
        this.stmtAddress2 = value;
    }

    /**
     * Gets the value of the stmtAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtAddress3() {
        return stmtAddress3;
    }

    /**
     * Sets the value of the stmtAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtAddress3(String value) {
        this.stmtAddress3 = value;
    }

    /**
     * Gets the value of the stmtAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtAddress4() {
        return stmtAddress4;
    }

    /**
     * Sets the value of the stmtAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtAddress4(String value) {
        this.stmtAddress4 = value;
    }

    /**
     * Gets the value of the stmtAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtAddress5() {
        return stmtAddress5;
    }

    /**
     * Sets the value of the stmtAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtAddress5(String value) {
        this.stmtAddress5 = value;
    }

    /**
     * Gets the value of the stmtCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtCity() {
        return stmtCity;
    }

    /**
     * Sets the value of the stmtCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtCity(String value) {
        this.stmtCity = value;
    }

    /**
     * Gets the value of the stmtPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtPostalCode() {
        return stmtPostalCode;
    }

    /**
     * Sets the value of the stmtPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtPostalCode(String value) {
        this.stmtPostalCode = value;
    }

    /**
     * Gets the value of the stmtState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtState() {
        return stmtState;
    }

    /**
     * Sets the value of the stmtState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtState(String value) {
        this.stmtState = value;
    }

    /**
     * Gets the value of the stmtCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtCounty() {
        return stmtCounty;
    }

    /**
     * Sets the value of the stmtCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtCounty(String value) {
        this.stmtCounty = value;
    }

    /**
     * Gets the value of the stmtCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtCountry() {
        return stmtCountry;
    }

    /**
     * Sets the value of the stmtCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtCountry(String value) {
        this.stmtCountry = value;
    }

    /**
     * Gets the value of the stmtTelePhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtTelePhone1() {
        return stmtTelePhone1;
    }

    /**
     * Sets the value of the stmtTelePhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtTelePhone1(String value) {
        this.stmtTelePhone1 = value;
    }

    /**
     * Gets the value of the stmtTelePhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtTelePhone2() {
        return stmtTelePhone2;
    }

    /**
     * Sets the value of the stmtTelePhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtTelePhone2(String value) {
        this.stmtTelePhone2 = value;
    }

    /**
     * Gets the value of the stmtMobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtMobileNo() {
        return stmtMobileNo;
    }

    /**
     * Sets the value of the stmtMobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtMobileNo(String value) {
        this.stmtMobileNo = value;
    }

    /**
     * Gets the value of the stmtFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtFaxNo() {
        return stmtFaxNo;
    }

    /**
     * Sets the value of the stmtFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtFaxNo(String value) {
        this.stmtFaxNo = value;
    }

    /**
     * Gets the value of the stmtEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtEmail() {
        return stmtEmail;
    }

    /**
     * Sets the value of the stmtEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtEmail(String value) {
        this.stmtEmail = value;
    }

}
