package com.algo.adibconsumer;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.esbbank.gbo.xml.schemas.v1_0.LimitMaintenanceReply;

@SpringBootApplication
public class AdibSoapWeb1Application {

	public static void main(String[] args) {
		SpringApplication.run(AdibSoapWeb1Application.class, args);
	}

	@Bean
	CommandLineRunner lookup(LimitMaintenanceClient quoteClient) {
		return args -> {
			JAXBElement<LimitMaintenanceReply> response = quoteClient.limitMaintenance();
			System.err.println(response.getValue().getEAIHEADER().getReturnCode());
			System.err.println(response.getValue().getEAIBODY().getReferenceNum());
		};
	}
}
