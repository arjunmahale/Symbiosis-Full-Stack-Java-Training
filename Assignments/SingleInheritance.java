package Java;

class Employee1{
	int empid;
	String empname,empdepart;
	Employee1()
	{
		System.out.println("In employee default constructor");
	}
	Employee1(int empid,String empname,String empdepart)
	{
		this.empid=empid;
		this.empname=empname;
		this.empdepart=empdepart;
	}
	void show()
	{
		System.out.println("------------\nIn show method  ");
		System.out.println("employee id is : "+empid);
		System.out.println("employee name is : "+empname);
		System.out.println("employee department is : "+empdepart);
	}	
}
class Manager extends Employee1{
	Manager()
	{
		System.out.println("default contructor : Manager");
	}
	Manager(int empid,String empname,String empdepart)
	{
		super(empid,empname,empdepart);
			
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) 
	{
		Manager m1=new Manager(13,"Arjun","CS");
		m1.show();
		Manager m2=new Manager(12,"Vaibhav","CS");
		m2.show();

	}

}
