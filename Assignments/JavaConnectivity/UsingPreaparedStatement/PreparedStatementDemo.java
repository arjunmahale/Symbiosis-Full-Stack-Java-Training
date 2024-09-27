package PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mypackage.DButil;

public class PreparedStatementDemo {
	static Connection cn;
	static PreparedStatement pst;
		static {
				cn=DButil.getConnection();
				if(cn!= null) {
					System.out.println("jdbc connetion is taken ...");
				}
			   }
		public static int addEmployee(int empid,String empname,double empsalary) {
			int n=0;
			try {
				
				pst=cn.prepareStatement("insert into emp values(?,?,?)");
				pst.setInt(1, empid);
				pst.setString(2, empname);
				pst.setDouble(3, empsalary);
				n=pst.executeUpdate();
				System.out.println("employee added successfully");
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
				String query="select count(*) from emp where empid=?";
				pst.setInt(1, empid);
				ResultSet rs=pst.executeQuery(query);
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
					pst=cn.prepareStatement("delete from emp where empid=?");
					pst.setInt(1, empid);
					pst.executeUpdate();
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
					String query="update emp set empname=? where empid=?";
					pst.setString(1, empname);
					pst.setInt(2, empid);
					pst.executeUpdate(query);
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
					String query="update emp set empsalary=? where empid=?";
					pst.setDouble(1, empsalary);
					pst.setInt(2, empid);
					pst.executeUpdate(query);
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
				String query="select * from emp";
				ResultSet rs=pst.executeQuery(query);
				while (rs.next()) {
				
					System.out.println(rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getDouble(3));
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void closeConnection() {
			try {
				pst.close();
				cn.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
