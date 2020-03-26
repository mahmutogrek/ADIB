package com.esbservice;

import javax.xml.bind.JAXBElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.esbbank.gbo.xml.schemas.v1_0.ESBServiceReply;
import com.esbbank.gbo.xml.schemas.v1_0.ESBServiceRequest;
import com.esbbank.gbo.xml.schemas.v1_0.ObjectFactory;


@Endpoint
public class EsbService {
	private static final Logger log = LoggerFactory.getLogger(EsbService.class);
	private static final String NAMESPACE_URI = "urn:esbbank.com/gbo/xml/schemas/v1_0/";
	private ESBServiceResponse resp;
	
	@Autowired
	public EsbService(ESBServiceResponse resp) {
		this.resp=resp;
	}
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "esbServiceRequest")
	@ResponsePayload
	public JAXBElement<ESBServiceReply> esbServiceRequest(@RequestPayload JAXBElement<ESBServiceRequest> request) {
		
		ObjectFactory obj = new ObjectFactory();
		log.debug("TEST TEST TEST");
		ESBServiceReply rply = resp.getResponse();
		//response.setData("SUCCESS")
		rply.setData("SUCCESS");
		JAXBElement<ESBServiceReply> resp1 = obj.createEsbServiceReply(rply);
		return resp1;
	}
	
	
}
