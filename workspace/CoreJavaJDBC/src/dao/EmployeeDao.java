package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Employee;
import resource.DbResource;

public class EmployeeDao {
	Connection con;
	public EmployeeDao() {
		// TODO Auto-generated constructor stub
		con = DbResource.getDbConnection();
	}
	public String storeEmployeeDetails(Employee emp) {
		
		try {
			//Loading  
			//Connecting 
			PreparedStatement pstmt  = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setFloat(3, emp.getSalary());
																			//converting object to string as query 
			int res = pstmt.executeUpdate();			//DML success > 0 failure =0, Insert, Delete and Update 
			if(res>0) {
				return "Record stored";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "Record didn't store";
	}
	//CRUD : Create, Read, Update and Delete Basic 
	public List<Employee> getEmployeeDetails() {
		List<Employee> listOfRec = new ArrayList<Employee>();
		try {
			PreparedStatement pstmt  = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();			//select clause 
			while(rs.next()) {
				Employee emp  = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				listOfRec.add(emp);							// converting query to java objects. 
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listOfRec;
	}
}
