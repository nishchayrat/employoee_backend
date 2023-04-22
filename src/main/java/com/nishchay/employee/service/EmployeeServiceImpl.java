package com.nishchay.employee.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishchay.employee.entity.Employee;
import com.nishchay.employee.exception.EmployeeNotFoundException;
import com.nishchay.employee.model.EmployeeRequest;
import com.nishchay.employee.model.EmployeeResponse;
import com.nishchay.employee.repository.EmployeeRepositoryImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepositoryImpl employeeRepository;

	@Override
	public List<EmployeeResponse> get() {
		Iterable<Employee> employees = employeeRepository.findAll();

		List<EmployeeResponse> employeeResponses = new LinkedList<>();

		for (Employee employee : employees) {
			EmployeeResponse employeeResponse = new EmployeeResponse();
			employeeResponse.setName(employee.getName());
			employeeResponse.setEmail(employee.getEmail());
			employeeResponse.setEmployeeId(employee.getEmployeeId());
			employeeResponses.add(employeeResponse);
		}
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeResponses;
	}

	@Override
	public EmployeeResponse getEmployeeById(String employeeId) {

		Employee employee = employeeRepository
				.findByEmployeeId(employeeId)
				.orElseThrow(()->new EmployeeNotFoundException("No employee with " + employeeId + "exists"));
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setName(employee.getName());
		employeeResponse.setEmail(employee.getEmail());
		employeeResponse.setEmployeeId(employee.getEmployeeId());
		return employeeResponse;
	}

	@Override
	public EmployeeResponse getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(EmployeeRequest employeeRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String employeeId) {
		
		employeeRepository.deleteEmployeeById(employeeId);
		
	}

}
