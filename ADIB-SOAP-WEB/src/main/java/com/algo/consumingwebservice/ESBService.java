package com.algo.consumingwebservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.esbbank.gbo.xml.schemas.v1_0.ESBServiceReply;
import com.esbbank.gbo.xml.schemas.v1_0.ESBServiceRequest;





@Endpoint
public class ESBService {
	private static final String NAMESPACE_URI = "urn:esbbank.com/gbo/xml/schemas/v1_0/";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "EsbResponse")
	@ResponsePayload
	public ESBServiceReply getReply(@RequestPayload ESBServiceRequest request) {
		ESBServiceReply response = new ESBServiceReply();
		return response;
	}
}
