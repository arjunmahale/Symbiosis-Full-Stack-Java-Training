package javaconnectuvity;
import java.sql.*;
import java.util.Scanner;
public class TestConnection {
	static Connection con;
	static String mysqlurl="jdbc:mysql://localhost:3306/EmployeeDB?autoReconnect=true&useSSL=false";
	
	public static void insertData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee code :");
		int empcode=sc.nextInt();
		System.out.println("enter employee name :");
		String empname=sc.next();
		System.out.println("enter employee gender :");
		String gender=sc.next();
		System.out.println("enter employee grade");
		String grade=sc.next();
		System.out.println("enter gross");
		int gross=sc.nextInt();
		int n=0;
		try {
			
			con=DriverManager.getConnection(mysqlurl, "root", "mysql8");
			System.out.println("connection established......");
			Statement stmt=con.createStatement();
			String query="insert into employee(empcode,empname,gender,grade,gross)values("+empcode+",'"+empname+"','"+gender+"','"+grade+"',"+gross+")";
			n=stmt.executeUpdate(query);
			
			if(n>0) {
				System.out.println("data inserted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
	}
	public static void deletedata() {

		int n=0;
		try {
			Scanner sc=new Scanner(System.in);
			con=DriverManager.getConnection(mysqlurl, "root", "mysql8");
			System.out.println("connection established......");
			Statement stmt=con.createStatement();
			System.out.println("enter empcode");
			String empcode=sc.next();
			n=stmt.executeUpdate("delete from employee where empcode="+empcode);
			
			if(n>0) {
				System.out.println("data deleted successfully.");
			}
			else if(n==0) {
				System.out.println("data is not present");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	public static void printtable() {
		
		
		try {
			
			con=DriverManager.getConnection(mysqlurl, "root", "mysql8");
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from employee");
			while (rs.next()) {
				//System.out.println("---------------------------------------------------------------------------");
				System.out.println(rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getString(3)+"\t|\t"+rs.getString(4)+"\t|\t"+rs.getInt(5));
				//System.out.println("----------------------------------");
			}
			System.out.println("------------------------------------------\nquery executed successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


public static  void infoData() {}
		public static void main(String[] args) {
			//insertData();
			Scanner sc=new Scanner(System.in);
			do{
			System.out.println("---------------------------------------\nwhat operation do you want to perform ? \n1.insert data\n2.delete data\n3.display data\n4.exit");
			int choice=sc.nextInt();
			switch (choice) {
				case 1:
						insertData();
						break;
				case 2:
						deletedata();
						break;
				case 3:
						printtable();
						break;
				case 4:
						System.exit(0);
				}
			
			}while(true);
		
	}
}

