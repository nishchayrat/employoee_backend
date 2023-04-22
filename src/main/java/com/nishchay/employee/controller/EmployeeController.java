package com.nishchay.employee.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.nishchay.employee.model.EmployeeRequest;
import com.nishchay.employee.model.EmployeeResponse;
import com.nishchay.employee.service.EmployeeServiceImpl;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;

	private Logger logger = (Logger) LoggerFactory.getLogger(EmployeeController.class);
	
	/**
	 * Return the list of all Employee
	 * @return List<Employee>
	 */
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	@ResponseBody
	public List<EmployeeResponse> getEmployee() {
		logger.debug("Calling the Employee Service");
		return employeeService.get();
	}

	// Path variable name should be same as name mentioned in value
	/**
	 * @param employeeId : employee ID to search
	 * @return
	 */
	@RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public EmployeeResponse getEmployeeById(@PathVariable String employeeId) {

		return employeeService.getEmployeeById(employeeId);
	}

	@PostMapping(value = "/save")
	public void addEmployees(@RequestBody EmployeeRequest employeeRequest) {
		if (true) {
			System.out.println("Hello");
		}
	}

	@RequestMapping(value = "/add/employee", method = RequestMethod.POST)
	public void addEmployee(@RequestBody EmployeeRequest employeeRequest) {
		if (true) {

		}
	}

	@RequestMapping(value="/remove/employee/{employeeId}" , method = RequestMethod.DELETE)
	public void removeEmployee(@PathVariable String employeeId) {
		employeeService.delete(employeeId);
	}
	
//	@ExceptionHandler(EmployeeNotFoundException.class)
//	  public ResponseEntity<String> handleNoSuchElementFoundException(
//			  EmployeeNotFoundException exception
//	  ) {
//	    return ResponseEntity
//	        .status(HttpStatus.NOT_FOUND)
//	        .body(exception.getMessage());
//	  }
	
}
