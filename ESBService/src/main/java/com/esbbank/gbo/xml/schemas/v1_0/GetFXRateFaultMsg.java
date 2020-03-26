
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-23T14:48:31.934+04:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "fault", targetNamespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/")
public class GetFXRateFaultMsg extends Exception {

    private com.esbbank.gbo.xml.schemas.v1_0.EAIFAULT fault;

    public GetFXRateFaultMsg() {
        super();
    }

    public GetFXRateFaultMsg(String message) {
        super(message);
    }

    public GetFXRateFaultMsg(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GetFXRateFaultMsg(String message, com.esbbank.gbo.xml.schemas.v1_0.EAIFAULT fault) {
        super(message);
        this.fault = fault;
    }

    public GetFXRateFaultMsg(String message, com.esbbank.gbo.xml.schemas.v1_0.EAIFAULT fault, java.lang.Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public com.esbbank.gbo.xml.schemas.v1_0.EAIFAULT getFaultInfo() {
        return this.fault;
    }
}
