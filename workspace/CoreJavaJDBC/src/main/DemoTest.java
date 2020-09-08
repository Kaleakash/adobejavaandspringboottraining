package main;

import java.util.List;
import java.util.Scanner;

import bean.Employee;
import dao.EmployeeDao;
import resource.DbResource;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
Employee emp1 = new Employee();
System.out.println("Enter the id");
emp1.setId(sc.nextInt());
System.out.println("Enter the name");
emp1.setName(sc.next());
System.out.println("Enter the salary");
emp1.setSalary(sc.nextFloat());
*/


EmployeeDao ed = new EmployeeDao(); //Data Access Object 

//String result = ed.storeEmployeeDetails(emp1);
//System.out.println(result);

System.out.println("Record are");
List<Employee> listOfRec = ed.getEmployeeDetails();
listOfRec.stream().forEach(emp->System.out.println(emp));		//packageName.className@code

DbResource.closeResource();
	}
	
}


