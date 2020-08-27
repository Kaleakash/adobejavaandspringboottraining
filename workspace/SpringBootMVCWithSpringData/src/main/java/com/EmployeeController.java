package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value="getEmpDb",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeInfo() {
	return employeeService.getEmployeeDetails();	
	}
}
