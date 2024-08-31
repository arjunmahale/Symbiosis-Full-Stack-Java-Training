package Java;

import java.util.Scanner;

public class StudentsPro {
	  String uname,password,wantsornot;
	  static int id=1;
	public  void Newstud() {
	
	
	boolean again=true;
	System.out.println("welcome to system ");
	do {
	System.out.println("-------------------\n Do you want to store more students:  ");
	Scanner sc=new Scanner(System.in);
	wantsornot=sc.nextLine();
	if(wantsornot.equals("yes"))
	{
		System.out.println("enter your username: ");
		uname=sc.next();
		System.out.println("enter your password: ");
		password=sc.next();
		if(uname.equals(password))
		{
			System.out.println("welcome to System : your id is : "+id);
			id++;
		}
		else
		{
			System.out.println("uname and password not matched");
		}
		
	}
	else
	{
		System.out.println("closed");
	}
	if(wantsornot.equals("no"))
	{
		again=false;
	}
	}while(again);
	}

	public static void main(String[] args) {
		StudentsPro s1=new StudentsPro();
		s1.Newstud();

		
	}

}
