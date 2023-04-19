package com.nishchay.employee.model;


public class EmployeeRequest {

	private String employeeId;
	private String name;
	private String email;

	public EmployeeRequest() {

	}

	public EmployeeRequest(String employeeId, String name, String email) {
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
	}

	public String getEmplyoeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
