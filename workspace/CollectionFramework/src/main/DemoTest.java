package main;

import bean.Employee;
import service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
		emp1.setSalary(12000);
		
		Employee emp2  = new Employee(101, "Ramesh", 14000);
		Employee emp3 = new Employee(102, "Rajesh", 8000);
		Employee emp4  = new Employee(103, "Ramu", 16000);
		EmployeeService es = new EmployeeService();
		es.addEmployeeDetails(emp1);
		es.addEmployeeDetails(emp2);
		es.addEmployeeDetails(emp3);
		es.addEmployeeDetails(emp4);
		
		es.displayEmployeeDetails();
	}

}
