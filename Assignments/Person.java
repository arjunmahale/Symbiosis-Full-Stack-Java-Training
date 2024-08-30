package Java;

import java.util.Scanner;

public class Person {
	int personid,personage;String personname;
	public Person(int personid,String personname,int personage)
	{
		this.personid=personid;
		this.personname=personname;
		this.personage=personage;
	}
	public void show()
	{
		
		System.out.println("Person id ="+personid);
		System.out.println("Person name  ="+personname);
		System.out.println("Person age ="+personage);
	}
public String toString() {
	return personname;
		
}

	public static void main(String[] args) {
		int personid,personage;String personname;
		Person[] team=new Person[5];
		for(int i=0;i<team.length;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("----------\nenter "+(i+1)+" person id : "); 
			personid=sc.nextInt();
			System.out.println("enter person name : "); 
			personname=sc.next();
			System.out.println("enter person age : "); 
			personage=sc.nextInt();
			
			team[i]=new Person(personid,personname,personage);
			
		}
		for(int i=0;i<team.length;i++) {
			System.out.println("------------\n"+(i+1)+" person details are : ");
			team[i].show();
		}
		for(Person p:team)
		{
			System.out.println(p);
		}
		
	}

}
