package com.nagarro.crud.service;

import java.util.List;

import com.nagarro.crud.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmpoyees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
