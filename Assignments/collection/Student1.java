package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

 class Student11 {//for only one comaprison comparable, for many use comparator

	String name;
	int age,id;
	
	public Student11(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student11 [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
}
	//@Override
class ageComparator implements Comparator<Student11>{
	public int compare(Student11 s1,Student11 s2) {
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
	
}
class nameComparator implements Comparator<Student11>{
	public int compare(Student11 s1,Student11 s2) {
		return s1.name.compareTo(s2.name);
	}
	
}
	
public class Student1{
	public static void main(String[] args) {
		
				
				ArrayList<Student11> st1=new ArrayList<Student11>();
				
				
					
				Student11 s3=new Student11("vaibhav",32,12334);
				st1.add(s3);
				Student11 s2=new Student11("arjun",22,1234);
				st1.add(s2);
					
				System.out.println("------------\nbefore sorting :");
				for(Student11 a1: st1)
				{
					System.out.println(" " +a1);
				}
				System.out.println("------------\nby age sorting :");
				Collections.sort(st1,new ageComparator());
				
				for(Student11 a1: st1)
				{
					System.out.println(" " +a1);
				}
				System.out.println("-------------\nby name sorting :");
				Collections.sort(st1,new nameComparator());
				for(Student11 a1: st1)
				{
					System.out.println(" " +a1);
				}
				
	}

	
	

}
