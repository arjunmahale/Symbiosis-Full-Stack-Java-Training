package Exceptionhandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

class userException extends Exception{
	public userException(String a) {
		super(a);
		//System.out.println("user exception ");
	}
}
class invalidcountryException extends Exception{
	public invalidcountryException(String a) {
		super(a);
	}
}
public class UserdefineException {
	String countryName;
	public void registerUser(String countryName) throws invalidcountryException{
		if(!countryName.equals("India"))
		{
			throw new invalidcountryException("NRI's not allowed ");
		}
	}
	public static void main(String[] args) {
		UserdefineException ud1=new UserdefineException();
		try {
			ud1.registerUser("Test");
			}
		catch(invalidcountryException e){
			System.out.println(e.getMessage());
		}
//		int age;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter age : ");
//		try {
//			age=sc.nextInt();
//			if(age<0) {
//				throw new userException("User Exception");
//			}
//			else
//			{
//				throw new InputMismatchException();
//			}
//		}
//		catch(InputMismatchException e) {System.out.println("wrong data entry");}
//		catch(userException e1) {
//			System.out.println(e1.getMessage());
//		}
//		catch(Exception e2) {
//			System.out.println(e2.getMessage());
//		}
		

	}

}
