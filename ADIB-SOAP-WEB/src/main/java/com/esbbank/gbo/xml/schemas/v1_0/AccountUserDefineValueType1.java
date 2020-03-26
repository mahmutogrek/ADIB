
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountUserDefineValueType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountUserDefineValueType1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUserDefined" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="labelUserDefine" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="dateValue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="stringValue" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="amountValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numberValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="percentValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="operation" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Operation_A_U"/&gt;
 *         &lt;element name="accountType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctType" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountUserDefineValueType1", propOrder = {
    "idUserDefined",
    "labelUserDefine",
    "dateValue",
    "stringValue",
    "amountValue",
    "numberValue",
    "percentValue",
    "operation",
    "accountType",
    "accountNumber"
})
public class AccountUserDefineValueType1 {

    protected Integer idUserDefined;
    protected String labelUserDefine;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateValue;
    protected String stringValue;
    protected BigDecimal amountValue;
    protected Integer numberValue;
    protected BigDecimal percentValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OperationAU operation;
    protected String accountType;
    protected String accountNumber;

    /**
     * Gets the value of the idUserDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUserDefined() {
        return idUserDefined;
    }

    /**
     * Sets the value of the idUserDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUserDefined(Integer value) {
        this.idUserDefined = value;
    }

    /**
     * Gets the value of the labelUserDefine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelUserDefine() {
        return labelUserDefine;
    }

    /**
     * Sets the value of the labelUserDefine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelUserDefine(String value) {
        this.labelUserDefine = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the amountValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountValue() {
        return amountValue;
    }

    /**
     * Sets the value of the amountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountValue(BigDecimal value) {
        this.amountValue = value;
    }

    /**
     * Gets the value of the numberValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberValue() {
        return numberValue;
    }

    /**
     * Sets the value of the numberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberValue(Integer value) {
        this.numberValue = value;
    }

    /**
     * Gets the value of the percentValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentValue() {
        return percentValue;
    }

    /**
     * Sets the value of the percentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentValue(BigDecimal value) {
        this.percentValue = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationAU }
     *     
     */
    public OperationAU getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationAU }
     *     
     */
    public void setOperation(OperationAU value) {
        this.operation = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

}
