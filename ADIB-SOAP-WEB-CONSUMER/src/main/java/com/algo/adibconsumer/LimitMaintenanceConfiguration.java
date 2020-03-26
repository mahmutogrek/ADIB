package com.algo.adibconsumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class LimitMaintenanceConfiguration {


		@Bean
		public Jaxb2Marshaller marshaller() {
			
			Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
			// this package must match the package in the <generatePackage> specified in
			// pom.xml
			marshaller.setContextPath("com.esbbank.gbo.xml.schemas.v1_0");
			return marshaller;
		}

		@Bean
		public LimitMaintenanceClient countryClient(Jaxb2Marshaller marshaller) {
			LimitMaintenanceClient client = new LimitMaintenanceClient();
			client.setDefaultUri("http://localhost:8080/limitMaintenance");
			client.setMarshaller(marshaller);
			client.setUnmarshaller(marshaller);
			return client;
		}

}
