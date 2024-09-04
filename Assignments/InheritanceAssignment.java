package Java;

import java.util.Scanner;

class Person1{
	String name,add;
	int age;
	long mobile;
	Person1(int age,String name,String add,long mobile)
	{
		this.age=age;
		this.name=name;
		this.add=add;
		this.mobile=mobile;
	}
}
class Student1 extends Person1
{
	int mark[]=new int[5];
	double percentage,addition=0;
	String grade;
	String tochange;

	Student1(int age,String name,String add,long mobile)
	{
		super(age,name,add,mobile);
		
	}
	
	void show()
	{
Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<mark.length;i++)
		{
		System.out.println("enter marks of/100 for subject:"+(i+1)+" :");
		mark[i]=sc.nextInt();
		addition+=mark[i];
		}
		
		percentage=(addition/500*100);
		if(percentage>100)
		{
			grade="you entered wrong input";
		}
		else if(percentage<=49 && percentage >=35)
		{
			grade="D";
		}
		else if(percentage<=59 && percentage >=50)
		{
			grade="C";
		}
		else if(percentage<=80 && percentage >=60)
		{
			grade="B";
		}
		else if(percentage>=80)
		{
			grade="A";
		}
		else
		{
			grade="fail";
		}
		System.out.println("age : "+age);
		System.out.println("name : "+name);
		System.out.println("address  : "+add);
		System.out.println("mobile  : "+mobile);
		System.out.println("percentage is  : "+percentage+"%");
		System.out.println("grade is   : "+grade);
		
		System.out.println("do you want to update mobile no?");
		tochange=sc.next();
		if(tochange.equals("yes"))
		{
			System.out.println("enter new mobile number :");
			mobile=sc.nextLong();
			System.out.println("your new mobile number has updated as : "+mobile);
		}
		else {
			System.out.println("closed");
		}
		
	}
}
public class InheritanceAssignment{

	public static void main(String[] args) {
	String name,add;
	int age;
	long mobile;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name :");
	name=sc.next();
	System.out.println("enter add :");
	add=sc.next();
	System.out.println("enter age :");
	age=sc.nextInt();
	System.out.println("enter mobile number :");
	mobile=sc.nextLong();
	
	Student1 s1=new Student1(age,name,add,mobile);
	
	s1.show();
	

	}

}