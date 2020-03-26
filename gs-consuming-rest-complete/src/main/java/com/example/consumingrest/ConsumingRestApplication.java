package com.example.consumingrest;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.json.JsonParser;


@ServletComponentScan
@SpringBootApplication

public class ConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.basicAuthentication("acmadmin", "acmadmin").build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			final String uri = "http://192.168.1.172:54106/api/resource/ChangeRequest;PPCD=1";
			final String response = restTemplate.getForObject(uri, String.class);
			log.info(response);
			
			ObjectMapper objectMapper = new ObjectMapper();
			JsonParser jsonParser;
			Map<String,Object> a = jsonParser.parseMap(response);
			log.info(jsonParser.parseList(response).getClass());
			//Quote quote = objectMapper.readValue(jsonParser.parseList(response), Quote.class);
			//log.info(quote.toString());

		};
	}
}
