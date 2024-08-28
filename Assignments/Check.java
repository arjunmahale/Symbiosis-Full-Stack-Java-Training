package Java;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		char alpha;
		System.out.println("enter the character : ");
		Scanner sc=new Scanner(System.in);
		alpha=sc.nextLine().charAt(0);
		if(alpha >= 'a' && alpha >='z' || alpha >= 'A' && alpha >='Z' )
		{
			System.out.println("given input is character");
		}
		else if(alpha >='0'  && alpha <='9')
		{
			System.out.println("given input is digit");
		}
		else
		{
			System.out.println("given input is special symbol");
		}
	}

}
