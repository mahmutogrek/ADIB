package com.algo.adibconsumer;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.esbbank.gbo.xml.schemas.v1_0.LimitMaintenanceReply;
import com.esbbank.gbo.xml.schemas.v1_0.LimitMaintenanceRequest;
import com.esbbank.gbo.xml.schemas.v1_0.LocationInfo;
import com.esbbank.gbo.xml.schemas.v1_0.MsgChannel;
import com.esbbank.gbo.xml.schemas.v1_0.ObjectFactory;
import com.esbbank.gbo.xml.schemas.v1_0.RequestorLanguage;
import com.esbbank.gbo.xml.schemas.v1_0.SecurityInfo;
import com.esbbank.gbo.xml.schemas.v1_0.ServiceType;
import com.esbbank.gbo.xml.schemas.v1_0.Authentication;
import com.esbbank.gbo.xml.schemas.v1_0.Client;
import com.esbbank.gbo.xml.schemas.v1_0.CountryCodeType;
import com.esbbank.gbo.xml.schemas.v1_0.EAIHEADER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class LimitMaintenanceClient extends WebServiceGatewaySupport {
	private static final Logger log = LoggerFactory.getLogger(LimitMaintenanceClient.class);
	protected LimitMaintenanceRequest request;

	
	public JAXBElement<LimitMaintenanceReply> limitMaintenance() {
		
		ObjectFactory obj = new ObjectFactory();
		
		LimitMaintenanceRequest request =obj.createLimitMaintenanceRequest();
		request.setEAIHEADER(new EAIHEADER() {{
			serviceName="LIMIT.MAINTENANCE";
			setServiceType(ServiceType.SYNC);
			setServiceVersion("1");
			setClient(Client.ADIB);
			setClientChannel("BKR");
			setMsgChannel(MsgChannel.MQ);
			setLocationInfo(new LocationInfo() {{
				 setCountryCode(CountryCodeType.AE);
			}});
			setRequestorLanguage(RequestorLanguage.E);
			setSecurityInfo(new SecurityInfo() {{
				setAuthentication(new Authentication(){{
					setUserId("BKR");
					setPassword("XXXX");
				}});
			}});
			setReturnCode("0000");
		}});
		JAXBElement<LimitMaintenanceRequest> jaxbobj = obj.createLimitMaintenanceRequest(request);
		
		
		log.info("TEST TEST TEST: " + request.toString());
		JAXBElement<LimitMaintenanceReply> response = (JAXBElement<LimitMaintenanceReply>) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/limitMaintenance/LimitMaintenance", jaxbobj,
				new SoapActionCallback("urn:esbbank.com/gbo/xml/schemas/v1_0/LimitMaintenanceRequest"));
		log.info("RESPONSE: " + response.getValue().getEAIBODY().getReferenceNum());
		return response;
		
	}
}
