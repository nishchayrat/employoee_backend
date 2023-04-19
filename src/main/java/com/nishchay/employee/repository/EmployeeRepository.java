package com.nishchay.employee.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nishchay.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{
	
	@Query(value = "Select e from Employee e Where e.employeeId = :employee_id")
	Employee findByEmployeeId(@Param("employee_id") String employeeId); 
}
