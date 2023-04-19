package com.nishchay.employee.interceptor;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import ch.qos.logback.classic.Logger;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class EmployeeInterceptor implements HandlerInterceptor{
	
	Logger logger =  (Logger) LoggerFactory.getLogger(EmployeeInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("Client " + request.getRemoteHost()+ " is requesting "+ request.getMethod()+ " "+ request.getRequestURL() );
		return true;
	}
	
	
	
}
