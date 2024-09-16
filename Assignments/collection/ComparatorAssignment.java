package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

 class Employee {//for only one comaprison comparable, for many use comparator

	String name,location;
	int salary,id;
	
	public Employee(String name, int salary, int id,String location) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.location=location;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", salary=" + salary + ", id=" + id + "]";
	}
	
}
	//@Override
class idComparator implements Comparator<Employee>{
	public int compare(Employee s1,Employee s2) {
		if(s1.id==s2.id)
			return 0;
		else if(s1.id>s2.id)
			return 1;
		else
			return -1;
	}
	
}
class salaryComparator implements Comparator<Employee>{
	public int compare(Employee s1,Employee s2) {
		if(s1.salary==s2.salary)
			return 0;
		else if(s1.salary>s2.salary)
			return 1;
		else
			return -1;
	}
	
}
class EnameComparator implements Comparator<Employee>{
	public int compare(Employee s1,Employee s2) {
		return s1.name.compareTo(s2.name);
	}
	
}
class locationComparator implements Comparator<Employee>{
	public int compare(Employee s1,Employee s2) {
		return s1.location.compareTo(s2.location);
	}
	
}
	
public class ComparatorAssignment{
	public static void main(String[] args) {
		
				
				ArrayList<Employee> st1=new ArrayList<Employee>();
				Scanner sc=new Scanner(System.in);
				Employee s2=new Employee("arjun", 200000, 4,"nashik");
				st1.add(s2);
					
				Employee s3=new Employee("vaibhav", 100000, 3, "pune");
				st1.add(s3);
				Employee s4=new Employee("ajay", 400000, 2, "mumbai");
				st1.add(s4);
				Employee s5=new Employee("om", 500000, 1, "nsk");
				st1.add(s5);
				System.out.println("------------\nbefore sorting :");
				for(Employee a1: st1)
				{
					System.out.println(" " +a1);
				}
				do {
				System.out.println("-----------------\nhow do you want to sort ? :\n1.by id\n2.by name \n3.by salary \n4.by location \n5.exit ");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("------------\nby id sorting :");
					Collections.sort(st1,new idComparator());
					
					for(Employee a1: st1)
					{
						System.out.println(" " +a1);
					}
					break;
				case 2 :
					System.out.println("-------------\nby name sorting :");
					Collections.sort(st1,new EnameComparator());
					for(Employee a1: st1)
						{
							System.out.println(" " +a1);
						}
					break;
				case 3:
					System.out.println("------------\nby salary  sorting :");
					Collections.sort(st1,new salaryComparator());
					
					for(Employee a1: st1)
					{
						System.out.println(" " +a1);
					}
					break;
				case 4 :
					System.out.println("-------------\nby location sorting :");
					Collections.sort(st1,new locationComparator());
					for(Employee a1: st1)
						{
							System.out.println(" " +a1);
						}
					break;
				case 5 :
					System.out.println("stopped!!");
					System.exit(0);
					break;
				}
					
				}while(true);
				
				
	}

	
	

}
