package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Employee;

public class EmployeeService {
	List<Employee> listOfEmp = new ArrayList<>();
	
	public void addEmployeeDetails(Employee emp) {
		
		listOfEmp.add(emp);
		System.out.println("Record added...");
	}
	
	public void displayEmployeeDetails() {
		Iterator<Employee> ii = listOfEmp.iterator();
		while(ii.hasNext()) {
				Employee emp = ii.next();
				if(emp.getSalary()>10000) {
						System.out.println("Name is "+emp.getName());
				}
		}
	}
}
