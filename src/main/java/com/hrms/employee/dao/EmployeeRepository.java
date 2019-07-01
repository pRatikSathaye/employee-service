package com.hrms.employee.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hrms.employee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	@Override
	public List<Employee> findAll();

	public Employee findById(int id);

	public Employee findByFirstName(String firstName);

	public Employee findByLastName(String lastName);
}
