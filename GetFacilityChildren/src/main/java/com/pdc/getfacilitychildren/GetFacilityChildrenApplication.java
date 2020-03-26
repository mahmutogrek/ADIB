package com.pdc.getfacilitychildren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class GetFacilityChildrenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetFacilityChildrenApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(callREST.class);
		callREST vABC = context.getBean("execute",callREST.class);
		System.out.println(vABC.execute());
	}

}
