package com.esbservice;

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

	@Bean(name = "ESBService_1")
	public DefaultWsdl11Definition defaultWsdl11Definition() throws Exception {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("DispatcherESBServices");
		wsdl11Definition.setLocationUri("/ESBServices");
		wsdl11Definition.setTargetNamespace("urn:esbbank.com/gbo/xml/schemas/v1_0/");
		// wsdl11Definition.setSchema(limitMaintenanceSchema);
		wsdl11Definition.setSchemaCollection(updateContactXsd());

		return wsdl11Definition;
	}

	@Bean
	public XsdSchemaCollection updateContactXsd() throws Exception {
		CommonsXsdSchemaCollection xsds = new CommonsXsdSchemaCollection(new ClassPathResource("ESBServices_1_2_3.xsd"));
		xsds.setInline(true);
		return xsds;
	}
	
	@Bean(name ="esbServiceRequest")
	public DefaultWsdl11Definition defaultWsdl11Definition1() throws Exception {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("DispatcherESBService");
		wsdl11Definition.setLocationUri("/ESBServices");
		wsdl11Definition.setSchemaCollection(updateContactXsd());
		return wsdl11Definition;
	}

}
