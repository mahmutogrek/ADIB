
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-23T14:48:31.926+04:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "fault", targetNamespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/")
public class UnsubscribeSMSCustomerFaultMsg extends Exception {

    private com.esbbank.gbo.xml.schemas.v1_0.EAIFAULT fault;

    public UnsubscribeSMSCustomerFaultMsg() {
        super();
    }

    public UnsubscribeSMSCustomerFaultMsg(String message) {
        super(message);
    }

    public UnsubscribeSMSCustomerFaultMsg(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public UnsubscribeSMSCustomerFaultMsg(String message, com.esbbank.gbo.xml.schemas.v1_0.EAIFAULT fault) {
        super(message);
        this.fault = fault;
    }

    public UnsubscribeSMSCustomerFaultMsg(String message, com.esbbank.gbo.xml.schemas.v1_0.EAIFAULT fault, java.lang.Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public com.esbbank.gbo.xml.schemas.v1_0.EAIFAULT getFaultInfo() {
        return this.fault;
    }
}
