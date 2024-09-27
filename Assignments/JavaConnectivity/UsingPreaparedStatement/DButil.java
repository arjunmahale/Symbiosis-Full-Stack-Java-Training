package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static Connection cn;
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";  
	private static final String  DB_USERNAME="root";
	private static final String DB_PASSWORD="mysql8";  
	private static final String  DB_URL="jdbc:mysql://localhost:3306/EmployeeDB?autoReconnect=true&useSSL=false";
	
	public static Connection getConnection() {
		try {
			Class.forName(DB_DRIVER_CLASS);
			System.out.println("driver loaded successfully..");
			cn=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("connection established successfully");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("error...."+e.getMessage());		
			}
		catch(SQLException a) {
		System.out.println("error...."+a.getMessage());
		}
		return cn;
	}  
	
	

}
