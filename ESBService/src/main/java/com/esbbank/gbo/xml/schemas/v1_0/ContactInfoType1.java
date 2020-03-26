
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInfoType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactType1" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ContactType1"/&gt;
 *         &lt;element name="data1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="data2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="data3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType1", propOrder = {
    "contactType1",
    "data1",
    "data2",
    "data3"
})
public class ContactInfoType1 {

    @XmlElement(name = "ContactType1", required = true)
    protected String contactType1;
    @XmlElement(required = true)
    protected String data1;
    @XmlElement(required = true)
    protected String data2;
    protected String data3;

    /**
     * Gets the value of the contactType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType1() {
        return contactType1;
    }

    /**
     * Sets the value of the contactType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType1(String value) {
        this.contactType1 = value;
    }

    /**
     * Gets the value of the data1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData1() {
        return data1;
    }

    /**
     * Sets the value of the data1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData1(String value) {
        this.data1 = value;
    }

    /**
     * Gets the value of the data2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData2() {
        return data2;
    }

    /**
     * Sets the value of the data2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData2(String value) {
        this.data2 = value;
    }

    /**
     * Gets the value of the data3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData3() {
        return data3;
    }

    /**
     * Sets the value of the data3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData3(String value) {
        this.data3 = value;
    }

}
