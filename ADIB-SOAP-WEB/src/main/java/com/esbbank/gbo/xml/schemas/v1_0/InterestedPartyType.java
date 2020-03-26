
package com.esbbank.gbo.xml.schemas.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestedPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestedPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalParameters" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AdditionalParameters"/&gt;
 *         &lt;element name="CustomerDetails" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Address1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ContactInfoType1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sourceOfWealth" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SourceOfWealthType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="marketServed" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}MarketType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customerRole" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerRoleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerRelationship" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerRelationshipType" minOccurs="0"/&gt;
 *         &lt;element name="customerCountry" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CustomerCountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestedPartyType", propOrder = {
    "additionalParameters",
    "customerDetails",
    "address",
    "phone",
    "sourceOfWealth",
    "marketServed",
    "customerRole",
    "customerRelationship",
    "customerCountry"
})
public class InterestedPartyType {

    @XmlElement(name = "AdditionalParameters", required = true)
    protected AdditionalParameters additionalParameters;
    @XmlElement(name = "CustomerDetails")
    protected List<CustomerDetailsType> customerDetails;
    protected List<Address1> address;
    protected List<ContactInfoType1> phone;
    protected List<SourceOfWealthType> sourceOfWealth;
    protected List<MarketType> marketServed;
    protected List<CustomerRoleType> customerRole;
    @XmlElement(name = "CustomerRelationship")
    protected CustomerRelationshipType customerRelationship;
    protected List<CustomerCountryType> customerCountry;

    /**
     * Gets the value of the additionalParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalParameters }
     *     
     */
    public AdditionalParameters getAdditionalParameters() {
        return additionalParameters;
    }

    /**
     * Sets the value of the additionalParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParameters }
     *     
     */
    public void setAdditionalParameters(AdditionalParameters value) {
        this.additionalParameters = value;
    }

    /**
     * Gets the value of the customerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerDetailsType }
     * 
     * 
     */
    public List<CustomerDetailsType> getCustomerDetails() {
        if (customerDetails == null) {
            customerDetails = new ArrayList<CustomerDetailsType>();
        }
        return this.customerDetails;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address1 }
     * 
     * 
     */
    public List<Address1> getAddress() {
        if (address == null) {
            address = new ArrayList<Address1>();
        }
        return this.address;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoType1 }
     * 
     * 
     */
    public List<ContactInfoType1> getPhone() {
        if (phone == null) {
            phone = new ArrayList<ContactInfoType1>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the sourceOfWealth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceOfWealth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceOfWealth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceOfWealthType }
     * 
     * 
     */
    public List<SourceOfWealthType> getSourceOfWealth() {
        if (sourceOfWealth == null) {
            sourceOfWealth = new ArrayList<SourceOfWealthType>();
        }
        return this.sourceOfWealth;
    }

    /**
     * Gets the value of the marketServed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketServed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketServed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketType }
     * 
     * 
     */
    public List<MarketType> getMarketServed() {
        if (marketServed == null) {
            marketServed = new ArrayList<MarketType>();
        }
        return this.marketServed;
    }

    /**
     * Gets the value of the customerRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerRoleType }
     * 
     * 
     */
    public List<CustomerRoleType> getCustomerRole() {
        if (customerRole == null) {
            customerRole = new ArrayList<CustomerRoleType>();
        }
        return this.customerRole;
    }

    /**
     * Gets the value of the customerRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelationshipType }
     *     
     */
    public CustomerRelationshipType getCustomerRelationship() {
        return customerRelationship;
    }

    /**
     * Sets the value of the customerRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelationshipType }
     *     
     */
    public void setCustomerRelationship(CustomerRelationshipType value) {
        this.customerRelationship = value;
    }

    /**
     * Gets the value of the customerCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerCountryType }
     * 
     * 
     */
    public List<CustomerCountryType> getCustomerCountry() {
        if (customerCountry == null) {
            customerCountry = new ArrayList<CustomerCountryType>();
        }
        return this.customerCountry;
    }

}
