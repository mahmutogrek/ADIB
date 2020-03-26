
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EAI_HEADER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EAI_HEADER"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceName" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ServiceName"/&gt;
 *         &lt;element name="serviceType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ServiceType"/&gt;
 *         &lt;element name="serviceVersion" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ServiceVersion"/&gt;
 *         &lt;element name="client" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}Client"/&gt;
 *         &lt;element name="clientChannel" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ClientChannel"/&gt;
 *         &lt;element name="msgChannel" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}MsgChannel"/&gt;
 *         &lt;element name="locationInfo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}LocationInfo" minOccurs="0"/&gt;
 *         &lt;element name="requestorLanguage" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}RequestorLanguage"/&gt;
 *         &lt;element name="securityInfo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SecurityInfo"/&gt;
 *         &lt;element name="eaiReference" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *         &lt;element name="returnCode" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReturnCode"/&gt;
 *         &lt;element name="snapIn" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}SnapIns" minOccurs="0"/&gt;
 *         &lt;element name="retryMsg" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}RetryMsg" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EAI_HEADER", propOrder = {
    "serviceName",
    "serviceType",
    "serviceVersion",
    "client",
    "clientChannel",
    "msgChannel",
    "locationInfo",
    "requestorLanguage",
    "securityInfo",
    "eaiReference",
    "returnCode",
    "snapIn",
    "retryMsg"
})
public class EAIHEADER {

    @XmlElement(required = true)
    protected String serviceName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceType serviceType;
    @XmlElement(required = true)
    protected String serviceVersion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Client client;
    @XmlElement(required = true)
    protected String clientChannel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MsgChannel msgChannel;
    protected LocationInfo locationInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RequestorLanguage requestorLanguage;
    @XmlElement(required = true)
    protected SecurityInfo securityInfo;
    protected SnapIns eaiReference;
    @XmlElement(required = true)
    protected String returnCode;
    protected SnapIns snapIn;
    protected String retryMsg;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Sets the value of the serviceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceVersion(String value) {
        this.serviceVersion = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Gets the value of the clientChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientChannel() {
        return clientChannel;
    }

    /**
     * Sets the value of the clientChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientChannel(String value) {
        this.clientChannel = value;
    }

    /**
     * Gets the value of the msgChannel property.
     * 
     * @return
     *     possible object is
     *     {@link MsgChannel }
     *     
     */
    public MsgChannel getMsgChannel() {
        return msgChannel;
    }

    /**
     * Sets the value of the msgChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgChannel }
     *     
     */
    public void setMsgChannel(MsgChannel value) {
        this.msgChannel = value;
    }

    /**
     * Gets the value of the locationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfo }
     *     
     */
    public LocationInfo getLocationInfo() {
        return locationInfo;
    }

    /**
     * Sets the value of the locationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfo }
     *     
     */
    public void setLocationInfo(LocationInfo value) {
        this.locationInfo = value;
    }

    /**
     * Gets the value of the requestorLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorLanguage }
     *     
     */
    public RequestorLanguage getRequestorLanguage() {
        return requestorLanguage;
    }

    /**
     * Sets the value of the requestorLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorLanguage }
     *     
     */
    public void setRequestorLanguage(RequestorLanguage value) {
        this.requestorLanguage = value;
    }

    /**
     * Gets the value of the securityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInfo }
     *     
     */
    public SecurityInfo getSecurityInfo() {
        return securityInfo;
    }

    /**
     * Sets the value of the securityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInfo }
     *     
     */
    public void setSecurityInfo(SecurityInfo value) {
        this.securityInfo = value;
    }

    /**
     * Gets the value of the eaiReference property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getEaiReference() {
        return eaiReference;
    }

    /**
     * Sets the value of the eaiReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setEaiReference(SnapIns value) {
        this.eaiReference = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the snapIn property.
     * 
     * @return
     *     possible object is
     *     {@link SnapIns }
     *     
     */
    public SnapIns getSnapIn() {
        return snapIn;
    }

    /**
     * Sets the value of the snapIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapIns }
     *     
     */
    public void setSnapIn(SnapIns value) {
        this.snapIn = value;
    }

    /**
     * Gets the value of the retryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryMsg() {
        return retryMsg;
    }

    /**
     * Sets the value of the retryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryMsg(String value) {
        this.retryMsg = value;
    }

}
