package resource;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbResource {
private static Connection con;
public static Connection getDbConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");		//1st step 
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");//establish the connection
	} catch (Exception e) {
		// TODO: handle exception
	}
	return con;
}

public static void closeResource() {
	try {
		con.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
