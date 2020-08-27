package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.data.EmployeeData;

@Service
public class EmployeeService {

	@Autowired
	EmployeeData employeeData;
	public int storeEmployee(Employee emp) {
		Employee e= (Employee)employeeData.save(emp);
		return e.getId();
	}
	
	public List<Employee> listOfRec() {
		return employeeData.findAll();
	}
}
