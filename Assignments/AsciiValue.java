package Java;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		char ch;
		System.out.println("enter the character : ");
		ch=s.next().charAt(0);
		System.out.println("ascii value of "+ch+" is :"+((int)ch));
	}

}
