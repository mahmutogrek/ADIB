package com.esbservice;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.esbbank.gbo.xml.schemas.v1_0.Authentication;
import com.esbbank.gbo.xml.schemas.v1_0.Client;
import com.esbbank.gbo.xml.schemas.v1_0.CountryCodeType;
import com.esbbank.gbo.xml.schemas.v1_0.EAIHEADER;
import com.esbbank.gbo.xml.schemas.v1_0.ESBServiceReply;
import com.esbbank.gbo.xml.schemas.v1_0.LocationInfo;
import com.esbbank.gbo.xml.schemas.v1_0.MsgChannel;
import com.esbbank.gbo.xml.schemas.v1_0.RequestorLanguage;
import com.esbbank.gbo.xml.schemas.v1_0.SecurityInfo;
import com.esbbank.gbo.xml.schemas.v1_0.ServiceType;

@Component
public class ESBServiceResponse {
	protected ESBServiceReply tmp1 = new ESBServiceReply();
	private static final Logger log = LoggerFactory.getLogger(ESBServiceResponse.class);
	
	@PostConstruct
	public void initData() {
		ESBServiceReply tmp = new ESBServiceReply();
		EAIHEADER eaiheader = new EAIHEADER();
		eaiheader.setServiceName("LIMIT.MAINTENANCE");
		eaiheader.setServiceType(ServiceType.SYNC);
		eaiheader.setServiceVersion("1");
		eaiheader.setMsgChannel(MsgChannel.MQ);
		LocationInfo locationInfo = new LocationInfo();
		locationInfo.setCountryCode(CountryCodeType.AE);
		eaiheader.setLocationInfo(locationInfo);
		eaiheader.setRequestorLanguage(RequestorLanguage.E);
		SecurityInfo securityInfo = new SecurityInfo();
		Authentication auth = new Authentication();
		auth.setUserId("BKK");
		auth.setPassword("XXXX");
		securityInfo.setAuthentication(auth);
		eaiheader.setSecurityInfo(securityInfo);
		eaiheader.setReturnCode("0000");
		eaiheader.setClientChannel("BKR");
		eaiheader.setClient(Client.ADIB);		
		tmp.setData(eaiheader.toString());
		log.debug("EAIHEADER : " + eaiheader.getReturnCode());
		tmp1 = tmp;
	}
	
	public ESBServiceReply getResponse() {
		return tmp1;
	}
}

