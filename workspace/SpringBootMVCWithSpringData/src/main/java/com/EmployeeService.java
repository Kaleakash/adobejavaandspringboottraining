package com;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getEmployeeDetails() {
	//	return employeeDao.findAll().stream().filter(emp->emp.getSalary()>15000).collect(Collectors.toList());
			return employeeDao.findAll();
	}
}
