package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Employee;
import resource.DbResource;

public class EmployeeDao {

	
	public String storeEmployeeDetails(Employee emp) {
		
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt  = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setFloat(3, emp.getSalary());
			int res = pstmt.executeUpdate();
			if(res>0) {
				return "Record stored";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "Record didn't store";
	}
}
