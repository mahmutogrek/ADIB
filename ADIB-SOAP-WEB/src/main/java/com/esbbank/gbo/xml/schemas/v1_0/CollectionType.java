
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalEntries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionType", propOrder = {
    "currentPage",
    "perPage",
    "totalEntries",
    "totalPages"
})
public class CollectionType {

    protected String currentPage;
    protected String perPage;
    protected String totalEntries;
    protected String totalPages;

    /**
     * Gets the value of the currentPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPage(String value) {
        this.currentPage = value;
    }

    /**
     * Gets the value of the perPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerPage() {
        return perPage;
    }

    /**
     * Sets the value of the perPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerPage(String value) {
        this.perPage = value;
    }

    /**
     * Gets the value of the totalEntries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalEntries() {
        return totalEntries;
    }

    /**
     * Sets the value of the totalEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalEntries(String value) {
        this.totalEntries = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPages(String value) {
        this.totalPages = value;
    }

}
