package com.employeemanagementsystem.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.employeemanagementsystem.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	

}
