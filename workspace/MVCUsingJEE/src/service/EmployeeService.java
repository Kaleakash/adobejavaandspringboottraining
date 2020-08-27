package service;

import bean.Employee;
import dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao employeeDao;
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		employeeDao = new EmployeeDao();
	}
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<12000) {
			return "Salary must be > 12000";
		}else {
			return employeeDao.storeEmployeeDetails(emp);
		}
	}
}
