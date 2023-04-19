package com.nishchay.employee.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.nishchay.employee.interceptor.EmployeeInterceptor;

@Configuration
public class EmployeeConfiguration implements WebMvcConfigurer{

	@Autowired
	private EmployeeInterceptor employeeInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(employeeInterceptor);
	}
	
}
