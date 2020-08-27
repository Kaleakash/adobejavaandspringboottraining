package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Employee> getEmployeeDetails() {
		List<Employee> listOfRec = new ArrayList<Employee>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt  = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp  = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				listOfRec.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listOfRec;
	}
}
