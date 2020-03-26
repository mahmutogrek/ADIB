
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateAcctRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAcctRelation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationShipCustNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}NameInfoType" minOccurs="0"/&gt;
 *         &lt;element name="idTax" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_15" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerType2" minOccurs="0"/&gt;
 *         &lt;element name="relationShipId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="relationShipDesc" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}STRING_20" minOccurs="0"/&gt;
 *         &lt;element name="signorFlag" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Y_N_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="profolioFlag" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Y_N_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="reportToCreditBureauFlag" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Y_N_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="amountCoSignerLiability" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="printNoticeFlag" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Operation_A_N_S" minOccurs="0"/&gt;
 *         &lt;element name="addressId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="addressType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AddressType2" minOccurs="0"/&gt;
 *         &lt;element name="operation" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Operation_C_U"/&gt;
 *         &lt;element name="relationShipStatus" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}RelationShipStatusType" minOccurs="0"/&gt;
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
@XmlType(name = "CreateAcctRelation", propOrder = {
    "relationShipCustNumber",
    "name",
    "idTax",
    "customerType",
    "relationShipId",
    "relationShipDesc",
    "signorFlag",
    "profolioFlag",
    "reportToCreditBureauFlag",
    "amountCoSignerLiability",
    "printNoticeFlag",
    "addressId",
    "addressType",
    "operation",
    "relationShipStatus",
    "accountNumber"
})
public class CreateAcctRelation {

    protected int relationShipCustNumber;
    protected NameInfoType name;
    protected String idTax;
    @XmlSchemaType(name = "string")
    protected CustomerType2 customerType;
    protected int relationShipId;
    protected String relationShipDesc;
    @XmlSchemaType(name = "string")
    protected YNTYPE signorFlag;
    @XmlSchemaType(name = "string")
    protected YNTYPE profolioFlag;
    @XmlSchemaType(name = "string")
    protected YNTYPE reportToCreditBureauFlag;
    protected BigDecimal amountCoSignerLiability;
    @XmlSchemaType(name = "string")
    protected OperationANS printNoticeFlag;
    protected Integer addressId;
    protected String addressType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OperationCU operation;
    @XmlSchemaType(name = "string")
    protected RelationShipStatusType relationShipStatus;
    protected String accountNumber;

    /**
     * Gets the value of the relationShipCustNumber property.
     * 
     */
    public int getRelationShipCustNumber() {
        return relationShipCustNumber;
    }

    /**
     * Sets the value of the relationShipCustNumber property.
     * 
     */
    public void setRelationShipCustNumber(int value) {
        this.relationShipCustNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameInfoType }
     *     
     */
    public NameInfoType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInfoType }
     *     
     */
    public void setName(NameInfoType value) {
        this.name = value;
    }

    /**
     * Gets the value of the idTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTax() {
        return idTax;
    }

    /**
     * Sets the value of the idTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTax(String value) {
        this.idTax = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType2 }
     *     
     */
    public CustomerType2 getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType2 }
     *     
     */
    public void setCustomerType(CustomerType2 value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the relationShipId property.
     * 
     */
    public int getRelationShipId() {
        return relationShipId;
    }

    /**
     * Sets the value of the relationShipId property.
     * 
     */
    public void setRelationShipId(int value) {
        this.relationShipId = value;
    }

    /**
     * Gets the value of the relationShipDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationShipDesc() {
        return relationShipDesc;
    }

    /**
     * Sets the value of the relationShipDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationShipDesc(String value) {
        this.relationShipDesc = value;
    }

    /**
     * Gets the value of the signorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getSignorFlag() {
        return signorFlag;
    }

    /**
     * Sets the value of the signorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setSignorFlag(YNTYPE value) {
        this.signorFlag = value;
    }

    /**
     * Gets the value of the profolioFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getProfolioFlag() {
        return profolioFlag;
    }

    /**
     * Sets the value of the profolioFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setProfolioFlag(YNTYPE value) {
        this.profolioFlag = value;
    }

    /**
     * Gets the value of the reportToCreditBureauFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getReportToCreditBureauFlag() {
        return reportToCreditBureauFlag;
    }

    /**
     * Sets the value of the reportToCreditBureauFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setReportToCreditBureauFlag(YNTYPE value) {
        this.reportToCreditBureauFlag = value;
    }

    /**
     * Gets the value of the amountCoSignerLiability property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountCoSignerLiability() {
        return amountCoSignerLiability;
    }

    /**
     * Sets the value of the amountCoSignerLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountCoSignerLiability(BigDecimal value) {
        this.amountCoSignerLiability = value;
    }

    /**
     * Gets the value of the printNoticeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link OperationANS }
     *     
     */
    public OperationANS getPrintNoticeFlag() {
        return printNoticeFlag;
    }

    /**
     * Sets the value of the printNoticeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationANS }
     *     
     */
    public void setPrintNoticeFlag(OperationANS value) {
        this.printNoticeFlag = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddressId(Integer value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationCU }
     *     
     */
    public OperationCU getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationCU }
     *     
     */
    public void setOperation(OperationCU value) {
        this.operation = value;
    }

    /**
     * Gets the value of the relationShipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RelationShipStatusType }
     *     
     */
    public RelationShipStatusType getRelationShipStatus() {
        return relationShipStatus;
    }

    /**
     * Sets the value of the relationShipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationShipStatusType }
     *     
     */
    public void setRelationShipStatus(RelationShipStatusType value) {
        this.relationShipStatus = value;
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
