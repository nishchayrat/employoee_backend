package com.nishchay.employee.model;

public class EmployeeResponse {

	private String employeeId;
	private String name;
	private String email;

	public EmployeeResponse() {
	}

	public EmployeeResponse(String employeeId, String name, String email) {
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
	}

	public String getEmployeeId() {
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
