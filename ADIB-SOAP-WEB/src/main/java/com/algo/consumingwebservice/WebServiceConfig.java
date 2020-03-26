package com.algo.consumingwebservice;

import javax.servlet.Servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean<Servlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ESBServices/*");
	}

	@Bean(name = "ESBServices")
	public DefaultWsdl11Definition defaultWsdl11Definition() throws Exception {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("DispatcherESBServices");
		wsdl11Definition.setLocationUri("/ESBServices");
		wsdl11Definition.setTargetNamespace("urn:esbbank.com/gbo/xml/schemas/v1_0/");
		// wsdl11Definition.setSchema(limitMaintenanceSchema);
		wsdl11Definition.setSchemaCollection(updateContactXsd());

		return wsdl11Definition;
	}

	// @Bean
	// public XsdSchema limitMaintenanceSchema() {
	// return new SimpleXsdSchema(new ClassPathResource("LimitMaintenance.xsd"));
	// }

	@Bean
	public XsdSchemaCollection updateContactXsd() throws Exception {
		CommonsXsdSchemaCollection xsds = new CommonsXsdSchemaCollection(new ClassPathResource("ESBService_1_2_3.xsd"));
		xsds.setInline(true);
		return xsds;
	}

}
