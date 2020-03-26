package com.mahmut.consumingwebservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestConsumerApplication {

	private static final Logger log = LoggerFactory.getLogger(RestConsumerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RestConsumerApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.basicAuthentication("acmadmin", "acmadmin").build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			log.info("test");
			String uri = "http://10.66.15.113:54106/api/resource/ChangeRequest;PPCD=100002";
			String quote =restTemplate.getForObject(uri, String.class);
			log.info(quote);
		};
	}

}
