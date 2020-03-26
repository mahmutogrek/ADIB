
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EAI_FAULT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EAI_FAULT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eAI_HEADER" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}EAI_HEADER"/&gt;
 *         &lt;element name="eAI_BODY"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="referenceNum" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNum" minOccurs="0"/&gt;
 *                   &lt;element name="referenceNumConsumer" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNumConsumer" minOccurs="0"/&gt;
 *                   &lt;element name="referenceNumProvider" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNumProvider" minOccurs="0"/&gt;
 *                   &lt;element name="requestTime" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}TimeStampStr" minOccurs="0"/&gt;
 *                   &lt;element name="returnStatus" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReturnStatus"/&gt;
 *                   &lt;element name="exceptionList" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="esbErrorTrace" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EAI_FAULT", propOrder = {
    "eaiheader",
    "eaibody"
})
public class EAIFAULT {

    @XmlElement(name = "eAI_HEADER", required = true)
    protected EAIHEADER eaiheader;
    @XmlElement(name = "eAI_BODY", required = true)
    protected EAIFAULT.EAIBODY eaibody;

    /**
     * Gets the value of the eaiheader property.
     * 
     * @return
     *     possible object is
     *     {@link EAIHEADER }
     *     
     */
    public EAIHEADER getEAIHEADER() {
        return eaiheader;
    }

    /**
     * Sets the value of the eaiheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAIHEADER }
     *     
     */
    public void setEAIHEADER(EAIHEADER value) {
        this.eaiheader = value;
    }

    /**
     * Gets the value of the eaibody property.
     * 
     * @return
     *     possible object is
     *     {@link EAIFAULT.EAIBODY }
     *     
     */
    public EAIFAULT.EAIBODY getEAIBODY() {
        return eaibody;
    }

    /**
     * Sets the value of the eaibody property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAIFAULT.EAIBODY }
     *     
     */
    public void setEAIBODY(EAIFAULT.EAIBODY value) {
        this.eaibody = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="referenceNum" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNum" minOccurs="0"/&gt;
     *         &lt;element name="referenceNumConsumer" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNumConsumer" minOccurs="0"/&gt;
     *         &lt;element name="referenceNumProvider" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReferenceNumProvider" minOccurs="0"/&gt;
     *         &lt;element name="requestTime" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}TimeStampStr" minOccurs="0"/&gt;
     *         &lt;element name="returnStatus" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}ReturnStatus"/&gt;
     *         &lt;element name="exceptionList" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="esbErrorTrace" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "referenceNum",
        "referenceNumConsumer",
        "referenceNumProvider",
        "requestTime",
        "returnStatus",
        "exceptionList",
        "esbErrorTrace"
    })
    public static class EAIBODY {

        protected String referenceNum;
        protected String referenceNumConsumer;
        protected String referenceNumProvider;
        protected String requestTime;
        @XmlElement(required = true)
        protected ReturnStatus returnStatus;
        protected Object exceptionList;
        protected Object esbErrorTrace;

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
         * Gets the value of the referenceNumConsumer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceNumConsumer() {
            return referenceNumConsumer;
        }

        /**
         * Sets the value of the referenceNumConsumer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceNumConsumer(String value) {
            this.referenceNumConsumer = value;
        }

        /**
         * Gets the value of the referenceNumProvider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceNumProvider() {
            return referenceNumProvider;
        }

        /**
         * Sets the value of the referenceNumProvider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceNumProvider(String value) {
            this.referenceNumProvider = value;
        }

        /**
         * Gets the value of the requestTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestTime() {
            return requestTime;
        }

        /**
         * Sets the value of the requestTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestTime(String value) {
            this.requestTime = value;
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
         * Gets the value of the exceptionList property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getExceptionList() {
            return exceptionList;
        }

        /**
         * Sets the value of the exceptionList property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setExceptionList(Object value) {
            this.exceptionList = value;
        }

        /**
         * Gets the value of the esbErrorTrace property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEsbErrorTrace() {
            return esbErrorTrace;
        }

        /**
         * Sets the value of the esbErrorTrace property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEsbErrorTrace(Object value) {
            this.esbErrorTrace = value;
        }

    }

}
