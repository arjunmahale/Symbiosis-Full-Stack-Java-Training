package polymorphism;

import java.util.Scanner;

public class Employee {

	String name ;
	int salary;
	int ch;
	public void payment()
	{
		System.out.println("enter your choice : \n1.without args \n2.with name \n3.with name and salary \n4.with salary and name ");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:cal();break;
		case 2:
			System.out.println("enter name");
			name=sc.next();
			cal(name);break;
		case 3:
			System.out.println("enter name ");
			name=sc.next();
			System.out.println("enter salary ");
			salary=sc.nextInt();
			
			cal(name,salary);break;
			
		case 4:
			
		System.out.println("enter salary ");
		salary=sc.nextInt();
		System.out.println("enter name ");
		name=sc.next();
		
		cal(salary,name);
		break;
		}
	}
	public void cal() {
		System.out.println("with no args");
	}
	public void cal(String name)
	{
		
		this.name=name;
		System.out.println("employee name : "+name);
	}
	public void cal(int salary,String name)
	{
		this.salary=salary;
		this.name=name;
		System.out.println( "salary is : "+salary+"name is :"+name);
	}
	public void cal(String name,int salary)
	{
		this.salary=salary;
		this.name=name;
		System.out.println("employee name : "+name+", salary is : "+salary);
	} 
public static void main(String[] args) {
		Employee e2=new Employee();
		e2.payment();

		
		
		
		
		
		

	}
}
