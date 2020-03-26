
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilityPayee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityPayee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="utilityNumber" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}UtilityNumber" minOccurs="0"/&gt;
 *         &lt;element name="nickName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="snapIns" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityPayee", propOrder = {
    "utilityNumber",
    "nickName",
    "snapIns"
})
public class UtilityPayee {

    protected UtilityNumber utilityNumber;
    protected String nickName;
    protected SnapIns snapIns;

    /**
     * Gets the value of the utilityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityNumber }
     *     
     */
    public UtilityNumber getUtilityNumber() {
        return utilityNumber;
    }

    /**
     * Sets the value of the utilityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityNumber }
     *     
     */
    public void setUtilityNumber(UtilityNumber value) {
        this.utilityNumber = value;
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
     * Gets the value of the snapIns property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getSnapIns() {
        return snapIns;
    }

    /**
     * Sets the value of the snapIns property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setSnapIns(SnapIns value) {
        this.snapIns = value;
    }

}
