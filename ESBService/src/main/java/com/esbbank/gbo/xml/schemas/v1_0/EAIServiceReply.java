
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EAIServiceReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EAIServiceReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceNum" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNum"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="returnStatus" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReturnStatus"/&gt;
 *         &lt;element name="returnStatusProvider" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReturnStatusProvider" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EAIServiceReply", propOrder = {
    "referenceNum",
    "data",
    "returnStatus",
    "returnStatusProvider"
})
public class EAIServiceReply {

    @XmlElement(required = true)
    protected String referenceNum;
    @XmlElement(required = true)
    protected Object data;
    @XmlElement(required = true)
    protected ReturnStatus returnStatus;
    protected ReturnStatusProvider returnStatusProvider;

    /**
     * Gets the value of the referenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNum() {
        return referenceNum;
    }

    /**
     * Sets the value of the referenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNum(String value) {
        this.referenceNum = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setData(Object value) {
        this.data = value;
    }

    /**
     * Gets the value of the returnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatus }
     *     
     */
    public ReturnStatus getReturnStatus() {
        return returnStatus;
    }

    /**
     * Sets the value of the returnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatus }
     *     
     */
    public void setReturnStatus(ReturnStatus value) {
        this.returnStatus = value;
    }

    /**
     * Gets the value of the returnStatusProvider property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatusProvider }
     *     
     */
    public ReturnStatusProvider getReturnStatusProvider() {
        return returnStatusProvider;
    }

    /**
     * Sets the value of the returnStatusProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatusProvider }
     *     
     */
    public void setReturnStatusProvider(ReturnStatusProvider value) {
        this.returnStatusProvider = value;
    }

}
