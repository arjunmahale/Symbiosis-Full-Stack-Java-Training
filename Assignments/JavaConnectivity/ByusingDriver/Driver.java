package mypackage;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		StatementInterfaceDemo.showEmp();
		System.out.println("--------------------------------------");
		System.out.println(StatementInterfaceDemo.updateEmpName(101, "vaibhav"));
	StatementInterfaceDemo.updateEmpsalary(101, 400000);
	System.out.println("-----after updating name and salary----");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.deleteEmployee(103);
		System.out.println("--------after deleting-----");
		StatementInterfaceDemo.showEmp();
		
//		Scanner sc=new Scanner(System.in);
//		do {
//		System.out.println("enter your choice :");
//		int key=sc.nextInt();
//		switch (key) {
//		case 1: 
//	
//		}
//		
//		}while(true);
	}

}
