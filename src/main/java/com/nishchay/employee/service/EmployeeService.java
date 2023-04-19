package com.nishchay.employee.service;

import java.util.List;

import com.nishchay.employee.model.EmployeeRequest;
import com.nishchay.employee.model.EmployeeResponse;

public interface EmployeeService {
	public List<EmployeeResponse> get();
	public EmployeeResponse getEmployeeById(String employeeId);
	public EmployeeResponse getByEmail(String email);
	
	public void update(EmployeeRequest employeeRequest);
	
	public void delete(String employeeId);
	
}
