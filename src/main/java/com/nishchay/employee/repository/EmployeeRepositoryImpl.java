package com.nishchay.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nishchay.employee.entity.Employee;

@Repository
public interface EmployeeRepositoryImpl extends CrudRepository<Employee,Long>   {
	
	@Query(value = "Select e from Employee e Where e.employeeId = :employee_id")
	Optional<Employee> findByEmployeeId(@Param("employee_id") String employeeId);
	
	@Modifying
	@Transactional
	@Query(value = "delete from Employee e where e.employeeId = :employee_id")
	public void deleteEmployeeById(@Param("employee_id") String employeeId);
	
}
