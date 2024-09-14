package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentArray implements Comparable<StudentArray>{//for only one comaprison comparable, for many use comparator

	String name;
	int age,id;
	
	public StudentArray(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public int compareTo(StudentArray a) {
		if(age==a.age)
			return 0;
		else if(age>a.age)
			return 1;
		else
			return -1;
	}

	
	@Override
	public String toString() {
		return "StudentArray [name=" + name + ", age=" + age + ", id=" + id + "]\n";
	}

	public static void main(String[] args) {
		
				
				ArrayList<StudentArray> st=new ArrayList<StudentArray>();
				Scanner sc=new Scanner(System.in);
					System.out.println("enter name :");
					String name=sc.next();
					System.out.println("enter id :");
					int  id=sc.nextInt();
					System.out.println("enter age :");
					int  age=sc.nextInt();
				StudentArray s2=new StudentArray(name,id,age);
				st.add(s2);
					System.out.println("enter name :");
					name=sc.next();
					System.out.println("enter id :");
					id=sc.nextInt();
					System.out.println("enter age :");
					age=sc.nextInt();
				StudentArray s3=new StudentArray(name,id,age);
				st.add(s3);
					System.out.println("enter name :");
					name=sc.next();
					System.out.println("enter id :");
					id=sc.nextInt();
					System.out.println("enter age :");
					age=sc.nextInt();
					StudentArray s4=new StudentArray(name,id,age);
					st.add(s4);
				System.out.println("------------\nbefore sorting :");
				System.out.println(st);
				Collections.sort(st);
				System.out.println("-------------\nafter sorting :");
				System.out.println(st);
	}

	
	

}
