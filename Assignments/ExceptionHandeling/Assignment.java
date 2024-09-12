package Exceptionhandeling;

import java.util.InputMismatchException;
import java.util.Scanner;
class userException extends Exception{
	public userException(String a) {
		super(a);
		
	}
}
class InvalidLocationException extends Exception{
	public InvalidLocationException(String a) {
		super(a);
		
	}
}
public class Assignment {

	public static void main(String[] args) {
		int age;
		String name,addr,location;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Employee Details : ");
		
		try {
			System.out.println("enter name : ");
			name=sc.next();
			System.out.println("enter age : ");
			age=sc.nextInt();
			
			
				if(age<18 || age>68) 
				{
					throw new userException("Invalid age Exception");
				}
				else {
					try {
						System.out.println("enter addresss : ");
						addr=sc.next();
						System.out.println("enter location : ");
						location=sc.next();
						if(location.equals("pune")||location.equals("mumbai")||location.equals("banglore"))
						{
							
						}
						else {
							throw new InvalidLocationException("Invalid location Exception");
						}
					}
					catch(Exception e) {
						System.out.println(e.getMessage());			
						
					}
				}
				
			}
			
		catch(InputMismatchException e2) 
			{
				System.out.println(e2.getMessage()+"Input Mismatch Exception");
			}
		catch(Exception e2) 
		{
			System.out.println(e2.getMessage());
		}
		
		
	}
}
