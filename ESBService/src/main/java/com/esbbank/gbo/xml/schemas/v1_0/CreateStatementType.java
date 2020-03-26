
package com.esbbank.gbo.xml.schemas.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateStatementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idStatementCurrent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cycleCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_3" minOccurs="0"/&gt;
 *         &lt;element name="descCycleCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_20" minOccurs="0"/&gt;
 *         &lt;element name="descStatement" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_30" minOccurs="0"/&gt;
 *         &lt;element name="idStatementReport" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nametatement" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_40" minOccurs="0"/&gt;
 *         &lt;element name="haveCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="holdStatement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="addressBasis" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AddressBasisType" minOccurs="0"/&gt;
 *         &lt;element name="statementDetail" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}StatementDetailType" minOccurs="0"/&gt;
 *         &lt;element name="statementPrintType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}StatementPrintType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfImagePerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="printOption" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}PrintOption" minOccurs="0"/&gt;
 *         &lt;element name="addressId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="addressSeq" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="usageFlag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateStatementType", propOrder = {
    "idStatementCurrent",
    "cycleCode",
    "descCycleCode",
    "descStatement",
    "idStatementReport",
    "nametatement",
    "haveCheck",
    "includeImage",
    "holdStatement",
    "startDate",
    "endDate",
    "addressBasis",
    "statementDetail",
    "statementPrintType",
    "numberOfImagePerPage",
    "printOption",
    "addressId",
    "addressSeq",
    "usageFlag"
})
public class CreateStatementType {

    protected Integer idStatementCurrent;
    protected String cycleCode;
    protected String descCycleCode;
    protected String descStatement;
    protected int idStatementReport;
    protected String nametatement;
    protected Boolean haveCheck;
    protected Boolean includeImage;
    protected Boolean holdStatement;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "string")
    protected AddressBasisType addressBasis;
    @XmlSchemaType(name = "string")
    protected StatementDetailType statementDetail;
    @XmlSchemaType(name = "string")
    protected StatementPrintType statementPrintType;
    protected Integer numberOfImagePerPage;
    @XmlSchemaType(name = "string")
    protected PrintOption printOption;
    @XmlElement(type = Integer.class)
    protected List<Integer> addressId;
    @XmlElement(type = Integer.class)
    protected List<Integer> addressSeq;
    protected List<String> usageFlag;

    /**
     * Gets the value of the idStatementCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStatementCurrent() {
        return idStatementCurrent;
    }

    /**
     * Sets the value of the idStatementCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStatementCurrent(Integer value) {
        this.idStatementCurrent = value;
    }

    /**
     * Gets the value of the cycleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleCode() {
        return cycleCode;
    }

    /**
     * Sets the value of the cycleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleCode(String value) {
        this.cycleCode = value;
    }

    /**
     * Gets the value of the descCycleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCycleCode() {
        return descCycleCode;
    }

    /**
     * Sets the value of the descCycleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCycleCode(String value) {
        this.descCycleCode = value;
    }

    /**
     * Gets the value of the descStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescStatement() {
        return descStatement;
    }

    /**
     * Sets the value of the descStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescStatement(String value) {
        this.descStatement = value;
    }

    /**
     * Gets the value of the idStatementReport property.
     * 
     */
    public int getIdStatementReport() {
        return idStatementReport;
    }

    /**
     * Sets the value of the idStatementReport property.
     * 
     */
    public void setIdStatementReport(int value) {
        this.idStatementReport = value;
    }

    /**
     * Gets the value of the nametatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNametatement() {
        return nametatement;
    }

    /**
     * Sets the value of the nametatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNametatement(String value) {
        this.nametatement = value;
    }

    /**
     * Gets the value of the haveCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHaveCheck() {
        return haveCheck;
    }

    /**
     * Sets the value of the haveCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaveCheck(Boolean value) {
        this.haveCheck = value;
    }

    /**
     * Gets the value of the includeImage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeImage() {
        return includeImage;
    }

    /**
     * Sets the value of the includeImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeImage(Boolean value) {
        this.includeImage = value;
    }

    /**
     * Gets the value of the holdStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoldStatement() {
        return holdStatement;
    }

    /**
     * Sets the value of the holdStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoldStatement(Boolean value) {
        this.holdStatement = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the addressBasis property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBasisType }
     *     
     */
    public AddressBasisType getAddressBasis() {
        return addressBasis;
    }

    /**
     * Sets the value of the addressBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBasisType }
     *     
     */
    public void setAddressBasis(AddressBasisType value) {
        this.addressBasis = value;
    }

    /**
     * Gets the value of the statementDetail property.
     * 
     * @return
     *     possible object is
     *     {@link StatementDetailType }
     *     
     */
    public StatementDetailType getStatementDetail() {
        return statementDetail;
    }

    /**
     * Sets the value of the statementDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementDetailType }
     *     
     */
    public void setStatementDetail(StatementDetailType value) {
        this.statementDetail = value;
    }

    /**
     * Gets the value of the statementPrintType property.
     * 
     * @return
     *     possible object is
     *     {@link StatementPrintType }
     *     
     */
    public StatementPrintType getStatementPrintType() {
        return statementPrintType;
    }

    /**
     * Sets the value of the statementPrintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementPrintType }
     *     
     */
    public void setStatementPrintType(StatementPrintType value) {
        this.statementPrintType = value;
    }

    /**
     * Gets the value of the numberOfImagePerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfImagePerPage() {
        return numberOfImagePerPage;
    }

    /**
     * Sets the value of the numberOfImagePerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfImagePerPage(Integer value) {
        this.numberOfImagePerPage = value;
    }

    /**
     * Gets the value of the printOption property.
     * 
     * @return
     *     possible object is
     *     {@link PrintOption }
     *     
     */
    public PrintOption getPrintOption() {
        return printOption;
    }

    /**
     * Sets the value of the printOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintOption }
     *     
     */
    public void setPrintOption(PrintOption value) {
        this.printOption = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAddressId() {
        if (addressId == null) {
            addressId = new ArrayList<Integer>();
        }
        return this.addressId;
    }

    /**
     * Gets the value of the addressSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAddressSeq() {
        if (addressSeq == null) {
            addressSeq = new ArrayList<Integer>();
        }
        return this.addressSeq;
    }

    /**
     * Gets the value of the usageFlag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageFlag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageFlag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsageFlag() {
        if (usageFlag == null) {
            usageFlag = new ArrayList<String>();
        }
        return this.usageFlag;
    }

}
