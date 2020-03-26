package com.test1;

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

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public ServletRegistrationBean<Servlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/limitMaintenance/*");
	}

	@Bean(name = "LimitMaintenanceRequest")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema limitMaintenanceSchema) throws Exception {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("LimitMaintenancePort");
		wsdl11Definition.setLocationUri("/LimitMaintenanceRequest");
		wsdl11Definition.setTargetNamespace("urn:esbbank.com/gbo/xml/schemas/v1_0/");
		wsdl11Definition.setSchema(limitMaintenanceSchema);
		

		return wsdl11Definition;
	}

	/*
	 * @Bean public XsdSchemaCollection updateContactXsd() throws Exception {
	 * CommonsXsdSchemaCollection cxs = new CommonsXsdSchemaCollection(new
	 * ClassPathResource("ESBService_1.wsdl"), new
	 * ClassPathResource("ESBServices_1_2_3.xsd")); cxs.setInline(true); return cxs;
	 * };
	 */
/*
	@Bean(name = "ESBServices_1")
	public XsdSchema ESBServices_1Xsd() {
		return new SimpleXsdSchema(new ClassPathResource("ESBServices_1.xsd"));
	}

	@Bean(name = "ESBServices_1_2")
	public XsdSchema ESBServices_1_2Xsd() {
		return new SimpleXsdSchema(new ClassPathResource("ESBServices_1_2.xsd"));
	}

	@Bean(name = "ESBServices_1_2_3")
	public XsdSchema ESBServices_1_2_3Xsd() {
		return new SimpleXsdSchema(new ClassPathResource("ESBServices_1_2_3.xsd"));
	}

	@Bean(name = "ESBServices")
	public XsdSchema ESBServicesXsd() {
		return new SimpleXsdSchema(new ClassPathResource("ESBServices.xsd"));
	}
*/
	@Bean
	public XsdSchema limitMaintenanceSchema() {
		return new SimpleXsdSchema(new ClassPathResource("LimitMaintenance.xsd"));
	}
	
	
	@Bean(name="EsbCommon")
	public XsdSchema EsbCommonSchema() {
		return new SimpleXsdSchema(new ClassPathResource("EsbCommon.xsd"));
	}

}
