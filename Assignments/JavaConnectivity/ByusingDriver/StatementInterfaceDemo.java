package mypackage;
import java.sql.*;
import java.util.Scanner;
public class StatementInterfaceDemo {
	static Connection cn;
	static Statement st;
	static {
		cn=DButil.getConnection();
		try {
			st=cn.createStatement();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static int addEmployee(int empid,String empname,double empsalary) {
		int n=0;
		try {
			
			String query="insert into emp(empid,empname,salary)values("+empid+",'"+empname+"',"+empsalary+")";
			n=st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO: handle exception
		System.out.println("error.."+e.getMessage());
		n=0;
		}
		return n;
	}
	public static int validateEmp(int empid) {
		int n=0;
		try {
			String query="select count(*) from emp where empid="+empid;
			ResultSet rs=st.executeQuery(query);
			if(rs.next()) {
				if(rs.getInt(1)!=0)
				{
					n=1;
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("error.."+e.getMessage());
		}
		return n;
	}
	public static Boolean deleteEmployee(int empid) {
		Boolean status=false;
		
		try {
			int n=validateEmp(empid);
			if(n==1) {
				String query="delete from emp where empid="+empid;
				st.executeUpdate(query);
				status=true;
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		System.out.println("error.."+e.getMessage());
		
		}
		return status;
	}
	public static Boolean updateEmpName(int empid,String empname) {
		Boolean status=false;
		
		try {
	
			if(validateEmp(empid)==1) {
				String query="update emp set empname='"+empname+"'where empid="+empid;
				st.executeUpdate(query);
				status=true;
			}
			else {
				System.out.println("no  such employee record");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		System.out.println("error.."+e.getMessage());
		
		}
		return status;
	}
	public static Boolean updateEmpsalary(int empid,double empsalary) {
Boolean status=false;
		
		try {
	
			if(validateEmp(empid)==1) {
				String query="update emp set empsalary='"+empsalary+"'where empid="+empid;
				st.executeUpdate(query);
				status=true;
			}
			else {
				System.out.println("no  such employee record");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		System.out.println("error.."+e.getMessage());
		
		}
		return status;
	}
	public static void showEmp() {

		try {
			
		
			
			ResultSet rs=st.executeQuery("select * from emp;");
			while (rs.next()) {
			
				System.out.println(rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getDouble(3));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConnection() {
		try {
			st.close();
			cn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
