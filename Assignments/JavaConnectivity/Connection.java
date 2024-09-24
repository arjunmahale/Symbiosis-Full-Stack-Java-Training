package javaconnectuvity;
import java.sql.*;
public class TestConnection {
	static Connection con;
	static String mysqlurl="jdbc:mysql://localhost:3306/EmployeeDB?autoReconnect=true&useSSL=false";
	
	public static void selectdata() {
		
	}
	public static void testConnection() {
		
		
		try {
			
			con=DriverManager.getConnection(mysqlurl, "root", "12345");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println("---------------------------------------------------------------------------");
				System.out.println(rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getString(3)+"\t|\t"+rs.getString(4)+"\t|\t"+rs.getInt(5));
				//System.out.println("----------------------------------");
			}
			System.out.println("-----------------------------------------------------------------------------\nquery executed successfully");
			System.out.println("connection established......");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


public static  void infoData() {}
		public static void main(String[] args) {
	
			testConnection();
		
	}
}

