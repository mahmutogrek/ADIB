package com.example.demo.com.example;


import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.*;


@SuppressWarnings("deprecation")
@SpringBootApplication
public class DemoApplication {
	
	public static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		

	}

}

@RestController
@RequestMapping(value="/")
class TestACM{
	@SuppressWarnings("deprecation")
	@RequestMapping(value="TEST/{PRCD}",method=RequestMethod.GET)
	public String execute(@PathVariable(value="PRCD") String PRCD) {
		DemoApplication.log.info(PRCD);
		RestTemplate vRestTemplate = new RestTemplate();
		String uri = "http://aelnxacm.hursley.ibm.com:20006/apiquery/execution/GetFacilityChildren?_parts=&PRCD="+PRCD.replace(" ","%20")+"&_useDefaults=false";
		URL url = new URL(uri);
//		Quote vQuote = vRestTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		vRestTemplate.getInterceptors().add(new BasicAuthorizationInterceptor("acmadmin", "acmadmin"));
		ResponseEntity response = vRestTemplate.postForEntity(url, availabilityRequest,
				String.class);
		//Quote vQuote = vRestTemplate.getForObject("http://aelnxacm.hursley.ibm.com:20006/apiquery/execution/GetFacilityChildren?_parts=&PRCD="+PRCD.replace(" ","%20")+"&_useDefaults=false", Quote.class);
		String test = vRestTemplate.getForObject(url, Quote.class).toString();
		DemoApplication.log.info(test);
		return test;
	}
}


