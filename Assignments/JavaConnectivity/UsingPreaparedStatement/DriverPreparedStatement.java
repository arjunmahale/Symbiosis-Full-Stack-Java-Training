package PreparedStatement;

import java.util.Scanner;

import mypackage.StatementInterfaceDemo;

public class DriverPreparedStatement {

	public static void main(String[] args) {
		
//		System.out.println("......Using Prepared Statement......");
//		StatementInterfaceDemo.showEmp();
//		System.out.println("--------------------------------------");
//		System.out.println(StatementInterfaceDemo.updateEmpName(101, "vaibhav"));
//		StatementInterfaceDemo.updateEmpsalary(101, 400000);
//		System.out.println("-----after updating name and salary----");
//		StatementInterfaceDemo.showEmp();
//		StatementInterfaceDemo.deleteEmployee(103);
//		System.out.println("--------after deleting-----");
//		StatementInterfaceDemo.showEmp();
//		
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("------------------\nenter your choice :\n1.add employee\n2.update employee name\n3.update employee salary \n4.delete employee\n5. display all employee\n6.exit");
		int key=sc.nextInt();
		switch (key) {
		case 1: 
			StatementInterfaceDemo.showEmp();
			break;
		case 2:
			System.out.println("enter employee id :");
			int empid=sc.nextInt();
			System.out.println("enter employee name :");
			String empname=sc.next();
			StatementInterfaceDemo.updateEmpName(empid,empname);
			System.out.println("employee name updated");
			break;
		case 3:
			System.out.println("enter employee id :");
			empid=sc.nextInt();
			System.out.println("enter employee salary :");
			int empsalary=sc.nextInt();
			StatementInterfaceDemo.updateEmpsalary(empid,empsalary);
			System.out.println("employee salary updated");
			break;
		case 4:
			System.out.println("enter employee id :");
			empid=sc.nextInt();
			StatementInterfaceDemo.deleteEmployee(103);
			System.out.println("employee name updated");
			break;
		case 5:
			System.out.println("enter employee id :");
			 empid=sc.nextInt();
			System.out.println("enter employee name :");
			 empname=sc.next();
			System.out.println("enter employee salary :");
			 empsalary=sc.nextInt();
			StatementInterfaceDemo.addEmployee(empid, empname, empsalary);
			System.out.println(" new employee Added..");
		case 6:
			System.exit(0);
		}
		
		}while(true);
	}

}
