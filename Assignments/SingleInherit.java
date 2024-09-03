package Java;

import java.util.Scanner;

class Person1{
	String name,add;
	int age;
	Person1(int age,String name,String add)
	{
		this.age=age;
		this.name=name;
		this.add=add;
	}
}
class Student1 extends Person1
{
	int mark1,mark2,mark3,mark4,mark5;
	double percentage,addition;
	String grade;

	Student1(int age,String name,String add)
	{
		super(age,name,add);
		
	}
	void marks() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 1st sub marks /100:");
		mark1=sc.nextInt();
		System.out.println("enter 2nd sub marks /100:");
		mark2=sc.nextInt();
		System.out.println("enter 3rd sub marks /100 :");
		mark3=sc.nextInt();
		System.out.println("enter 4th sub marks /100 :");
		mark4=sc.nextInt();
		System.out.println("enter 5th sub marks  /100:");
		mark5=sc.nextInt();
		addition=mark1+mark2+mark3+mark4+mark5;
		percentage=(addition/500*100);
		if(percentage<=49 && percentage >=35)
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
		
	}
	void show()
	{
		System.out.println("age : "+age);
		System.out.println("name : "+name);
		System.out.println("address  : "+add);
		System.out.println("percentage is  : "+percentage+"%");
		System.out.println("grade is   : "+grade);
	}
}
public class SingleInherit {

	public static void main(String[] args) {
	String name,add;
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name :");
	name=sc.next();
	System.out.println("enter add :");
	add=sc.next();
	System.out.println("enter age :");
	age=sc.nextInt();
	
	Student1 s1=new Student1(age,name,add);
	s1.marks();
	s1.show();

	}

}
