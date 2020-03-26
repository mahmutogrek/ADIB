package com.acm.consumingwebservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class addNumbers extends WebServiceGatewaySupport{
	private static final Logger log = LoggerFactory.getLogger(CountryClient.class);

	  public addNumbers add(int a,int b) {

		  addNumbers request = new addNumbers();
		  request.add(1, 2);
	    

	    log.info("Requesting location for " + country);

	    addNumbers response = (addNumbers) getWebServiceTemplate()
	        .marshalSendAndReceive("http://localhost:8080/ws/countries", request,
	            new SoapActionCallback(
	                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));

	    return response;
}
