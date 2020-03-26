
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GenerateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpeningBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClosingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrintDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementDataType", propOrder = {
    "generateDate",
    "openingBalance",
    "closingBalance",
    "minDue",
    "dueDate",
    "printDueDate"
})
public class StatementDataType {

    @XmlElement(name = "GenerateDate")
    protected String generateDate;
    @XmlElement(name = "OpeningBalance")
    protected String openingBalance;
    @XmlElement(name = "ClosingBalance")
    protected String closingBalance;
    @XmlElement(name = "MinDue")
    protected String minDue;
    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "PrintDueDate")
    protected String printDueDate;

    /**
     * Gets the value of the generateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerateDate() {
        return generateDate;
    }

    /**
     * Sets the value of the generateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerateDate(String value) {
        this.generateDate = value;
    }

    /**
     * Gets the value of the openingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningBalance() {
        return openingBalance;
    }

    /**
     * Sets the value of the openingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningBalance(String value) {
        this.openingBalance = value;
    }

    /**
     * Gets the value of the closingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingBalance() {
        return closingBalance;
    }

    /**
     * Sets the value of the closingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingBalance(String value) {
        this.closingBalance = value;
    }

    /**
     * Gets the value of the minDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinDue() {
        return minDue;
    }

    /**
     * Sets the value of the minDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDue(String value) {
        this.minDue = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the printDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintDueDate() {
        return printDueDate;
    }

    /**
     * Sets the value of the printDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintDueDate(String value) {
        this.printDueDate = value;
    }

}
