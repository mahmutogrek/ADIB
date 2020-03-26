package com.example.consumingrest;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

@ServletComponentScan
@Component 
public class AddResponseHeaderFilter {
	 public void doFilter(ServletRequest request, ServletResponse response, 
	      FilterChain chain) throws IOException, ServletException {
	        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
	        httpServletResponse.setHeader(
	          "Content-Type", "application/json");
	        chain.doFilter(request, response);
	    }
	 


}
