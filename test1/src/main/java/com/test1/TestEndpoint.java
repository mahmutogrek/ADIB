package com.test1;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.esbbank.gbo.xml.schemas.v1_0.Authentication;
import com.esbbank.gbo.xml.schemas.v1_0.Client;
import com.esbbank.gbo.xml.schemas.v1_0.EAIHEADER;
import com.esbbank.gbo.xml.schemas.v1_0.LimitMaintenanceReply.EAIBODY;
import com.esbbank.gbo.xml.schemas.v1_0.LimitMaintenanceReply;
import com.esbbank.gbo.xml.schemas.v1_0.LimitMaintenanceRequest;
import com.esbbank.gbo.xml.schemas.v1_0.LocationInfo;
import com.esbbank.gbo.xml.schemas.v1_0.MsgChannel;
import com.esbbank.gbo.xml.schemas.v1_0.ObjectFactory;
import com.esbbank.gbo.xml.schemas.v1_0.RequestorLanguage;
import com.esbbank.gbo.xml.schemas.v1_0.ReturnStatus;
import com.esbbank.gbo.xml.schemas.v1_0.ReturnStatusProvider;
import com.esbbank.gbo.xml.schemas.v1_0.SecurityInfo;
import com.esbbank.gbo.xml.schemas.v1_0.ServiceType;


@Endpoint
public class TestEndpoint {
	private static final Logger log = LoggerFactory.getLogger(Test1Application.class);
	private static final String NAMESPACE_URI = "urn:esbbank.com/gbo/xml/schemas/v1_0/";


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "limitMaintenanceRequest")
	@ResponsePayload
	public JAXBElement<LimitMaintenanceReply> limitMaintenanceRequest(@RequestPayload JAXBElement<LimitMaintenanceRequest> request) {
		ObjectFactory obj = new ObjectFactory();
		LimitMaintenanceReply rsp = new LimitMaintenanceReply();
		
		EAIHEADER eaiheader = new EAIHEADER();
		eaiheader.setServiceName("LIMIT.MAINTENANCE");
		eaiheader.setServiceType(ServiceType.SYNC);
		eaiheader.setServiceVersion("1");
		eaiheader.setClientChannel("BKR");
		eaiheader.setMsgChannel(MsgChannel.MQ);
		eaiheader.setLocationInfo(new LocationInfo() {{
			setCountryCode(countryCode.AE);
			
		}});
		eaiheader.setRequestorLanguage(RequestorLanguage.E);
		eaiheader.setSecurityInfo(new SecurityInfo() {{setAuthentication(new Authentication() {{setUserId("BKR"); setPassword("XXXX");}});}});
		eaiheader.setReturnCode("0000");
		eaiheader.setClient(Client.ADIB);
		rsp.setEAIHEADER(eaiheader);
		EAIBODY eaibody = new EAIBODY();
		eaibody.setReferenceNum("5231602181160");
		eaibody.setAuthCode(new BigDecimal("29946592"));
		eaibody.setReturnStatus(new ReturnStatus() {{setReturnCode("0000"); setReturnCodeDesc("Success");}});
		eaibody.setReturnStatusProvider(new ReturnStatusProvider() {{setReturnCodeDescProvider("Success"); setReturnCodeProvider("0000");}});
		eaibody.setRequestTime("20170411162039532");
		rsp.setEAIHEADER(eaiheader);
		JAXBElement<LimitMaintenanceReply> response = obj.createLimitMaintenanceReply(rsp);
		
		log.info("TEST TEST TEST: " + eaiheader.toString() + eaibody.toString());
		return response;
	}
	
	
	
	
}
